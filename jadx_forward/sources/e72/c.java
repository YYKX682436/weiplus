package e72;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f331421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e72.e f331422e;

    public c(e72.e eVar, java.lang.Runnable runnable, e72.a aVar) {
        this.f331422e = eVar;
        this.f331421d = null;
        this.f331421d = runnable;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceVoiceRecordLogic", "hy: initDeviceInLock");
        java.lang.String str = e72.e.f331423j + android.os.SystemClock.elapsedRealtime() + ".spx";
        e72.e eVar = this.f331422e;
        eVar.f331426c = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceVoiceRecordLogic", "generateVoiceFilePath: %s", str);
        try {
            com.p314xaae8f345.mm.vfs.w6.h(eVar.f331426c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceVoiceRecordLogic", e17, "hy: delete file failed", new java.lang.Object[0]);
        }
        eVar.f331427d = new tl.w(16000, 1, 3);
        tl.w wVar = eVar.f331427d;
        wVar.f501693m = -19;
        wVar.i(false);
        eVar.f331428e = new yl.h();
        if (!eVar.f331428e.b(eVar.f331426c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceVoiceRecordLogic", "hy: init speex writer failed");
            eVar.f331428e.d();
            eVar.f331428e = null;
            e72.d dVar = eVar.f331424a;
            if (dVar != null) {
                ((e72.u) dVar).a(5);
                return;
            }
            return;
        }
        int i17 = wo.v1.f529366m.f529284i;
        if (i17 > 0) {
            eVar.f331427d.h(i17, true);
        } else {
            eVar.f331427d.h(5, false);
        }
        eVar.f331427d.g(50);
        eVar.f331427d.j(false);
        eVar.f331427d.f501705y = eVar.f331431h;
        eVar.a(eVar.f331432i);
        if (eVar.f331427d.k()) {
            java.lang.Runnable runnable = this.f331421d;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceVoiceRecordLogic", "hy: start record failed");
        e72.d dVar2 = eVar.f331424a;
        if (dVar2 != null) {
            ((e72.u) dVar2).a(7);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f331422e) {
            if (this.f331422e.f331425b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceVoiceRecordLogic", "hy: already called stop. should not start record");
            } else {
                a();
            }
        }
    }
}
