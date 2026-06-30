package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class l5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f183886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f183889g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f183890h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(qd2.g1 g1Var, java.lang.String str, java.lang.String str2, android.app.Activity activity, int i17) {
        super(0);
        this.f183886d = g1Var;
        this.f183887e = str;
        this.f183888f = str2;
        this.f183889g = activity;
        this.f183890h = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context;
        r45.xn2 xn2Var;
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5.f183936b;
        qd2.g1 g1Var = this.f183886d;
        if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
            context = g1Var.f443280a;
        }
        android.content.Context context2 = context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5 n5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5.f183935a;
        java.lang.String exportId = this.f183887e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(exportId, "$exportId");
        java.lang.String nonceId = this.f183888f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nonceId, "$nonceId");
        r45.ao2 ao2Var = g1Var.f443296q;
        if (ao2Var != null) {
            r45.xn2 xn2Var2 = new r45.xn2();
            xn2Var2.m75941xfb821914(0).add(java.lang.Integer.valueOf(ao2Var.m75939xb282bd08(0)));
            xn2Var = xn2Var2;
        } else {
            xn2Var = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5.c(n5Var, context2, 0L, exportId, nonceId, xn2Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k5(this.f183889g, exportId, this.f183890h), 2, null);
        return jz5.f0.f384359a;
    }
}
