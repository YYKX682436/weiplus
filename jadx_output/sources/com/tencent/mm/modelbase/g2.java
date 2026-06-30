package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f70635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f70636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f70637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f70638g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.r1 f70639h;

    public g2(com.tencent.mm.modelbase.r1 r1Var, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18, int i19) {
        this.f70639h = r1Var;
        this.f70635d = m1Var;
        this.f70636e = i17;
        this.f70637f = i18;
        this.f70638g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        q01.l lVar;
        this.f70635d.trackState().g(220);
        q01.q qVar = q01.q.f359322a;
        com.tencent.mm.modelbase.m1 scene = this.f70635d;
        kotlin.jvm.internal.o.g(scene, "scene");
        int hashCode = scene.hashCode();
        java.lang.Long l17 = (java.lang.Long) q01.q.f359324c.remove(java.lang.Integer.valueOf(hashCode));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = q01.q.f359323b;
        q01.l lVar2 = (q01.l) concurrentHashMap.get(java.lang.Integer.valueOf(hashCode));
        if (lVar2 != null && l17 != null) {
            lVar2.f359305h = android.os.SystemClock.elapsedRealtime();
            long j17 = 0;
            if (lVar2.f359305h > 0 && lVar2.f359304g > 0) {
                j17 = lVar2.f359305h - lVar2.f359304g;
            }
            qVar.b(scene);
            if (j17 > 1000) {
                qVar.e(lVar2, j17, false);
            }
        }
        com.tencent.mm.modelbase.m1 scene2 = this.f70635d;
        int i17 = this.f70636e;
        int i18 = this.f70637f;
        int i19 = this.f70638g;
        kotlin.jvm.internal.o.g(scene2, "scene");
        int hashCode2 = scene2.hashCode();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            this.f70639h.j(scene2, i17, i18, i19);
        } finally {
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 > 3000 && (lVar = (q01.l) concurrentHashMap.get(java.lang.Integer.valueOf(hashCode2))) != null) {
                qVar.e(lVar, elapsedRealtime2, true);
            }
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|doSceneImp_" + this.f70635d + "_type=" + this.f70636e;
    }
}
