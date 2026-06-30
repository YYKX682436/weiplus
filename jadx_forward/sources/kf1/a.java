package kf1;

/* loaded from: classes15.dex */
public abstract class a implements kf1.h {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f388699d = new java.util.concurrent.ConcurrentHashMap();

    public void a() {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f388699d).values().iterator();
        while (it.hasNext()) {
            ((gf0.g) ((kf1.f) it.next())).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioRecorder", "onRecorderStateChange onPause");
        }
    }

    public void b() {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f388699d).values().iterator();
        while (it.hasNext()) {
            gf0.g gVar = (gf0.g) ((kf1.f) it.next());
            gVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioRecorder", "onRecorderStateChange onStart");
            gf0.e eVar = gVar.f352735a.f352741e;
            if (eVar != null) {
                gf0.r rVar = ((gf0.l) eVar).f352754a;
                gf0.u uVar = rVar.f352765e;
                gf0.u uVar2 = gf0.u.f352778e;
                if (uVar != uVar2) {
                    rVar.f352765e = uVar2;
                }
            }
        }
    }

    public void c(java.lang.String tempFilePath, int i17, int i18) {
        int i19;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f388699d).values().iterator();
        while (it.hasNext()) {
            gf0.g gVar = (gf0.g) ((kf1.f) it.next());
            gVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempFilePath, "tempFilePath");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioRecorder", "onRecorderStateChange onStop, tempFilePath: " + tempFilePath + ",duration: " + i17 + ",fileSize: " + i18);
            gf0.i iVar = gVar.f352735a;
            double b17 = iVar.b();
            double d17 = iVar.f352737a;
            if (b17 < d17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingAudioRecorder", "onRecorderStateChange record too short! audioTimeInSecond: " + iVar.b() + ", recordMinTimeInSecond: " + d17 + ',');
                i19 = 99993;
            } else {
                i19 = 0;
            }
            double b18 = iVar.b();
            double d18 = iVar.f352738b;
            if (b18 > d18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingAudioRecorder", "onRecorderStateChange record too long! audioTimeInSecond: " + iVar.b() + ", recordMaxTimeInSecond: " + d18 + ',');
                i19 = 99994;
            }
            gf0.e eVar = iVar.f352741e;
            if (eVar != null) {
                ((gf0.l) eVar).a(i19, tempFilePath);
            }
        }
    }
}
