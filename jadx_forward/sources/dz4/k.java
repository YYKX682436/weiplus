package dz4;

/* loaded from: classes12.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.l f326849d;

    public k(dz4.l lVar) {
        this.f326849d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dz4.j jVar;
        dz4.j jVar2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        dz4.l lVar = this.f326849d;
        long j17 = lVar.f326869g + (currentTimeMillis - lVar.f326868f);
        lVar.f326871i = j17;
        long j18 = lVar.f326870h;
        double d17 = j18 > 0 ? e06.p.d(j17 / j18, 0.0d, 1.0d) : 0.0d;
        if (lVar.f326865c) {
            if (d17 >= 1.0d) {
                java.lang.String str = lVar.f326867e;
                if (str != null && (jVar2 = lVar.f326866d) != null) {
                    ((dz4.d0) jVar2).a(1.0d, str);
                }
                lVar.b();
                return;
            }
            java.lang.String str2 = lVar.f326867e;
            if (str2 != null && (jVar = lVar.f326866d) != null) {
                long j19 = lVar.f326871i;
                dz4.d0 d0Var = (dz4.d0) jVar;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.p pVar = d0Var.f326725a;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, pVar.b())) {
                    dz4.j0.a(d0Var.f326726b, d0Var.f326727c, str2, (float) d17, (float) j19);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterWeNoteNativeHelperImpl", "onProgressUpdate: skip, " + str2 + ", " + pVar.b());
                }
            }
            if (lVar.f326865c) {
                lVar.f326863a.postDelayed(this, lVar.f326864b);
            }
        }
    }
}
