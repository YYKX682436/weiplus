package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class z6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f105086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.s7 f105087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105088f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(so2.y0 y0Var, com.tencent.mm.plugin.finder.convert.s7 s7Var, in5.s0 s0Var) {
        super(1);
        this.f105086d = y0Var;
        this.f105087e = s7Var;
        this.f105088f = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        so2.y0 y0Var = this.f105086d;
        com.tencent.mm.protocal.protobuf.FinderContact reply_contact = y0Var.f410703d.u0().getReply_contact();
        jz5.f0 f0Var = null;
        r45.xk b17 = reply_contact != null ? ya2.d.b(ya2.d.h(reply_contact, null, false, 3, null), false) : null;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        in5.s0 s0Var = this.f105088f;
        if (b17 != null) {
            so2.y0 y0Var2 = this.f105086d;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String string = b17.getString(0);
            java.lang.String str = string == null ? "" : string;
            com.tencent.mm.plugin.finder.convert.s7 s7Var = this.f105087e;
            so2.g0.b(y0Var2, context, str, s7Var.f104528e.getCommentScene(), s7Var.f104528e.z0(), "");
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            so2.g0.d(y0Var, username, context2, "");
        }
        return f0Var2;
    }
}
