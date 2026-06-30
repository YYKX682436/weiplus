package com.tencent.matrix.resource.watcher;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.resource.watcher.i f52992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f52993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.resource.watcher.j f52994f;

    public g(com.tencent.matrix.resource.watcher.j jVar, com.tencent.matrix.resource.watcher.i iVar, int i17) {
        this.f52994f = jVar;
        this.f52992d = iVar;
        this.f52993e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.matrix.resource.watcher.h hVar;
        com.tencent.matrix.resource.watcher.e eVar = (com.tencent.matrix.resource.watcher.e) this.f52992d;
        if (eVar.f52977a.f52986k.isEmpty()) {
            oj.j.c("Matrix.ActivityRefWatcher", "DestroyedActivityInfo is empty! wait...", new java.lang.Object[0]);
            synchronized (eVar.f52977a.f52986k) {
                while (eVar.f52977a.f52986k.isEmpty()) {
                    try {
                        eVar.f52977a.f52986k.wait();
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
            oj.j.c("Matrix.ActivityRefWatcher", "DestroyedActivityInfo is NOT empty! resume check", new java.lang.Object[0]);
            hVar = com.tencent.matrix.resource.watcher.h.RETRY;
        } else if (android.os.Debug.isDebuggerConnected()) {
            eVar.f52977a.f52980e.f53000h.getClass();
            oj.j.f("Matrix.ActivityRefWatcher", "debugger is connected, to avoid fake result, detection was delayed.", new java.lang.Object[0]);
            hVar = com.tencent.matrix.resource.watcher.h.RETRY;
        } else {
            eVar.f52977a.d();
            java.util.Iterator it = eVar.f52977a.f52986k.iterator();
            while (it.hasNext()) {
                com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo destroyedActivityInfo = (com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo) it.next();
                com.tencent.matrix.resource.watcher.f fVar = eVar.f52977a;
                wi.b bVar = fVar.f52988m;
                if (bVar == wi.b.NO_DUMP || bVar == wi.b.AUTO_DUMP) {
                    fVar.f52980e.f53000h.getClass();
                    if (eVar.f52977a.a(destroyedActivityInfo.mActivityName)) {
                        oj.j.e("Matrix.ActivityRefWatcher", "activity with key [%s] was already published.", destroyedActivityInfo.mActivityName);
                        it.remove();
                    }
                }
                eVar.f52977a.d();
                if (destroyedActivityInfo.mActivityRef.get() == null) {
                    oj.j.e("Matrix.ActivityRefWatcher", "activity with key [%s] was already recycled.", destroyedActivityInfo.mKey);
                    it.remove();
                } else {
                    int i17 = destroyedActivityInfo.mDetectedCount + 1;
                    destroyedActivityInfo.mDetectedCount = i17;
                    if (i17 < (destroyedActivityInfo.isNotActivity ? eVar.f52977a.f52982g / 2 : eVar.f52977a.f52982g)) {
                        eVar.f52977a.f52980e.f53000h.getClass();
                        oj.j.c("Matrix.ActivityRefWatcher", "activity with key [%s] should be recycled but actually still exists in %s times, wait for next detection to confirm.", destroyedActivityInfo.mKey, java.lang.Integer.valueOf(destroyedActivityInfo.mDetectedCount));
                        eVar.f52977a.d();
                    } else {
                        oj.j.c("Matrix.ActivityRefWatcher", "activity with key [%s] was suspected to be a leaked instance. mode[%s]", destroyedActivityInfo.mKey, eVar.f52977a.f52988m);
                        cj.c cVar = eVar.f52977a.f52987l;
                        if (cVar == null) {
                            throw new java.lang.NullPointerException("LeakProcessor not found!!!");
                        }
                        if (cVar.b(destroyedActivityInfo)) {
                            oj.j.c("Matrix.ActivityRefWatcher", "the leaked activity [%s] with key [%s] has been processed. stop polling", destroyedActivityInfo.mActivityName, destroyedActivityInfo.mKey);
                            it.remove();
                        }
                    }
                }
            }
            hVar = com.tencent.matrix.resource.watcher.h.RETRY;
        }
        if (hVar == com.tencent.matrix.resource.watcher.h.RETRY) {
            this.f52994f.a(this.f52992d, this.f52993e + 1);
        }
    }
}
