package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes8.dex */
public final class u6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.v6 f186213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.v6 v6Var) {
        super(1);
        this.f186212d = s0Var;
        this.f186213e = v6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_COMMENT_HINT_SHOW_TIME_INT_SYNC, -1);
        android.content.Intent intent = new android.content.Intent();
        in5.s0 s0Var = this.f186212d;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        m92.b j37 = g92.a.j3(g92.b.f351302e, e17, false, 2, null);
        intent.putExtra("key_input_interact", j37 != null ? java.lang.Integer.valueOf(j37.u0().m75939xb282bd08(48)) : null);
        android.content.Context context2 = s0Var.f374654e;
        intent.setClass(context2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14118xff3e450.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14118xff3e450.class.getName(), intent, 11, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.t6(e17, this.f186213e, s0Var));
        return jz5.f0.f384359a;
    }
}
