package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f78756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f78757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f78758f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, l81.b1 b1Var, yz5.q qVar) {
        super(1);
        this.f78756d = context;
        this.f78757e = b1Var;
        this.f78758f = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f78756d, this.f78757e);
        this.f78758f.invoke(java.lang.Boolean.TRUE, "", java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
