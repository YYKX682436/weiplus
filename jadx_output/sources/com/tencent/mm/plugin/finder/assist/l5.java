package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class l5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f102353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f102356g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f102357h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(qd2.g1 g1Var, java.lang.String str, java.lang.String str2, android.app.Activity activity, int i17) {
        super(0);
        this.f102353d = g1Var;
        this.f102354e = str;
        this.f102355f = str2;
        this.f102356g = activity;
        this.f102357h = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context;
        r45.xn2 xn2Var;
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.finder.assist.n5.f102403b;
        qd2.g1 g1Var = this.f102353d;
        if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
            context = g1Var.f361747a;
        }
        android.content.Context context2 = context;
        kotlin.jvm.internal.o.d(context2);
        com.tencent.mm.plugin.finder.assist.n5 n5Var = com.tencent.mm.plugin.finder.assist.n5.f102402a;
        java.lang.String exportId = this.f102354e;
        kotlin.jvm.internal.o.f(exportId, "$exportId");
        java.lang.String nonceId = this.f102355f;
        kotlin.jvm.internal.o.f(nonceId, "$nonceId");
        r45.ao2 ao2Var = g1Var.f361763q;
        if (ao2Var != null) {
            r45.xn2 xn2Var2 = new r45.xn2();
            xn2Var2.getList(0).add(java.lang.Integer.valueOf(ao2Var.getInteger(0)));
            xn2Var = xn2Var2;
        } else {
            xn2Var = null;
        }
        com.tencent.mm.plugin.finder.assist.n5.c(n5Var, context2, 0L, exportId, nonceId, xn2Var, new com.tencent.mm.plugin.finder.assist.k5(this.f102356g, exportId, this.f102357h), 2, null);
        return jz5.f0.f302826a;
    }
}
