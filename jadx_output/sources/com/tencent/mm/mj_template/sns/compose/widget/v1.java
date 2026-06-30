package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.t2 f70272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f70273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f70274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var, androidx.paging.compose.e eVar, float f17) {
        super(2);
        this.f70272d = t2Var;
        this.f70273e = eVar;
        this.f70274f = f17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var = this.f70272d;
        n0.e5 e5Var = t2Var.f70241n;
        e0.f1 lazyListState = e0.h1.a(0, 0, oVar, 0, 3);
        int i17 = z0.d.f468903a;
        z0.b bVar = z0.a.f468901m;
        d0.e g17 = d0.p.f225183a.g(i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479567j)));
        d0.d2 b17 = d0.a2.b(0.0f, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479924j3)), 1, null);
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        float c17 = i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479866hf));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e1.y yVar = new e1.y(rz0.a.b(com.tencent.mm.R.color.f478513v, context));
        kotlin.jvm.internal.o.g(lazyListState, "lazyListState");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        e0.f.a(z0.m.a(pVar, androidx.compose.ui.platform.e3.f10553d, new com.tencent.mm.mj_template.sns.compose.widget.s0(yVar, c17, lazyListState)), lazyListState, b17, false, g17, bVar, null, false, new com.tencent.mm.mj_template.sns.compose.widget.u1(this.f70273e, this.f70274f, t2Var, e5Var), oVar, 196608, 200);
        return jz5.f0.f302826a;
    }
}
