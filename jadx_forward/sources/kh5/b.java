package kh5;

/* loaded from: classes7.dex */
public final /* synthetic */ class b extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public b(java.lang.Object obj) {
        super(0, obj, kh5.h.class, "onBoundingBoxClick", "onBoundingBoxClick()V", 0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        kh5.h hVar = (kh5.h) this.f72685xcfcbe9ef;
        jh5.b bVar = hVar.f389610q;
        java.lang.String a17 = new zp0.c(bVar.f381400a, bVar.f381401b, bVar.f381402c).a();
        jc3.j0 j0Var = hVar.f529908f;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (j0Var != null) {
            ((rc3.w0) j0Var).k("OnClientEvent", a17);
            hVar.g1();
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MEChattingMgr", "onBoundingBoxClick without biz");
        }
        return f0Var2;
    }
}
