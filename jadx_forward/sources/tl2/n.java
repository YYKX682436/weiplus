package tl2;

/* loaded from: classes8.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 f501793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl2.u f501794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f501795f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 n1Var, tl2.u uVar, java.lang.String str) {
        super(0);
        this.f501793d = n1Var;
        this.f501794e = uVar;
        this.f501795f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f501795f;
        tl2.u uVar = this.f501794e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 n1Var = this.f501793d;
        tl2.m mVar = new tl2.m(uVar, n1Var, str);
        if (n1Var.f268967q && uVar.n()) {
            android.app.Activity activity = uVar.f501807d;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.m78488x9f743232(new tl2.k(uVar, mVar));
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity : null;
            if (abstractActivityC21394xb3d2c0cf2 != null) {
                abstractActivityC21394xb3d2c0cf2.setRequestedOrientation(1);
            }
        } else {
            mVar.run();
        }
        return jz5.f0.f384359a;
    }
}
