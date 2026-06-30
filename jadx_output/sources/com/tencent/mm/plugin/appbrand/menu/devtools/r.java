package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f85920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.content.Context context, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        super(0);
        this.f85919d = context;
        this.f85920e = n7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dp.a.makeText(this.f85919d, "Frame Capture switch success", 0).show();
        this.f85920e.getRuntime().l0();
        return jz5.f0.f302826a;
    }
}
