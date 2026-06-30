package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes5.dex */
public final class s5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f217392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 f217394f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647) {
        super(0);
        this.f217392d = c22621x7603e017;
        this.f217393e = s0Var;
        this.f217394f = c15442xfd56d647;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f217392d;
        java.lang.String obj = c22621x7603e017.getText().toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u4 u4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.A;
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u4.a(u4Var) * 2, obj) / 2;
        in5.s0 s0Var = this.f217393e;
        if (b17 < 0) {
            android.content.Context context = s0Var.f374654e;
            db5.t7.m123883x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574058gu5, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u4.a(u4Var))), 0).show();
        } else {
            java.lang.String obj2 = r26.n0.u0(obj).toString();
            if (obj2.length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647 = this.f217394f;
                java.lang.Object obj3 = s0Var.f374658i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "getAssociatedObject(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj3;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d6472 = this.f217394f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.S6(c15442xfd56d647, obj2, s0Var, abstractC14490x69736cb5, 0, c15442xfd56d6472.f215042v, 8, null);
                c22621x7603e017.setText((java.lang.CharSequence) null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.X6(c15442xfd56d6472, s0Var, false, 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
