package com.tencent.mm.plugin.appbrand.complaint;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f77180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77181e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.appbrand.page.n7 n7Var, java.lang.String str) {
        super(0);
        this.f77180d = n7Var;
        this.f77181e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap R1 = this.f77180d.R1();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.complaint.a(R1, this.f77181e));
        return jz5.f0.f302826a;
    }
}
