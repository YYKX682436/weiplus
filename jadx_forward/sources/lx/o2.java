package lx;

/* loaded from: classes11.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr1.a f403427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx.v2 f403428e;

    public o2(hr1.a aVar, lx.v2 v2Var) {
        this.f403427d = aVar;
        this.f403428e = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f403427d.f66213x996f7ca;
        lx.v2 v2Var = this.f403428e;
        nr1.f d17 = v2Var.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        hr1.e z07 = d17.z0(str);
        if (z07.t0()) {
            lx.v2.a(v2Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "[onContactStorageChange] contact refreshed, sessionId=".concat(str));
            lx.v2.b(v2Var, z07);
        }
    }
}
