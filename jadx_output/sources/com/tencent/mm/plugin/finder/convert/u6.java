package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class u6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.v6 f104680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.v6 v6Var) {
        super(1);
        this.f104679d = s0Var;
        this.f104680e = v6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_COMMENT_HINT_SHOW_TIME_INT_SYNC, -1);
        android.content.Intent intent = new android.content.Intent();
        in5.s0 s0Var = this.f104679d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        m92.b j37 = g92.a.j3(g92.b.f269769e, e17, false, 2, null);
        intent.putExtra("key_input_interact", j37 != null ? java.lang.Integer.valueOf(j37.u0().getInteger(48)) : null);
        android.content.Context context2 = s0Var.f293121e;
        intent.setClass(context2, com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI29.class);
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        j45.l.w((com.tencent.mm.ui.MMActivity) context2, com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI29.class.getName(), intent, 11, new com.tencent.mm.plugin.finder.convert.t6(e17, this.f104680e, s0Var));
        return jz5.f0.f302826a;
    }
}
