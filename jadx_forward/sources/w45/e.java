package w45;

/* loaded from: classes11.dex */
public final class e implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f524436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w45.p f524437e;

    public e(de0.i iVar, w45.p pVar) {
        this.f524436d = iVar;
        this.f524437e = pVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        java.lang.Object obj = this.f524436d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
        d17.d((com.p314xaae8f345.mm.p944x882e457a.m1) obj);
        com.p314xaae8f345.mm.p944x882e457a.r1 d18 = gm0.j1.d();
        w45.p pVar = this.f524437e;
        d18.q(281, pVar.f524454a);
        gm0.j1.d().q(282, pVar.f524455b);
        pVar.f524454a = null;
        pVar.f524455b = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = pVar.f524457d;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            pVar.f524457d = null;
        }
        android.app.ProgressDialog progressDialog = pVar.f524459f;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.cancel();
        }
        pVar.c();
        return false;
    }
}
