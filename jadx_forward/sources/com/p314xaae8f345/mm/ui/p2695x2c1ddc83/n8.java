package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes8.dex */
public final class n8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f289435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f289436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e8 f289437f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(r45.br2 br2Var, yb5.d dVar, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e8 e8Var) {
        super(1);
        this.f289435d = br2Var;
        this.f289436e = dVar;
        this.f289437f = e8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        r45.ce0 ce0Var;
        r45.ce0 ce0Var2;
        r45.ea1 ea1Var = (r45.ea1) obj;
        java.lang.String str2 = null;
        if ((ea1Var != null ? (r45.y23) ea1Var.m75936x14adae67(1) : null) != null) {
            r45.y23 y23Var = (r45.y23) ea1Var.m75936x14adae67(1);
            if (y23Var != null && (ce0Var2 = (r45.ce0) y23Var.m75936x14adae67(9)) != null) {
                str2 = ce0Var2.m75945x2fec8307(2);
            }
            r45.br2 br2Var = this.f289435d;
            br2Var.set(12, str2);
            r45.y23 y23Var2 = (r45.y23) ea1Var.m75936x14adae67(1);
            if (y23Var2 == null || (ce0Var = (r45.ce0) y23Var2.m75936x14adae67(9)) == null || (str = ce0Var.m75945x2fec8307(3)) == null) {
                str = "";
            }
            br2Var.set(13, str);
            ot0.q qVar = new ot0.q();
            qVar.f430199i = 82;
            zy2.l lVar = new zy2.l();
            lVar.f558982b = br2Var;
            qVar.f(lVar);
            qVar.f430199i = 82;
            qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
            qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
            ((ez.w0) ot0.j1.a()).wi(qVar, "", "", this.f289436e.x(), "", null, false);
        } else {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e8 e8Var = this.f289437f;
            db5.t7.g(e8Var.f289183a.g(), e8Var.f289183a.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574941k22));
        }
        return jz5.f0.f384359a;
    }
}
