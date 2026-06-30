package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public final class j0 implements ui1.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f85593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.l0 f85594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85595c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85596d;

    public j0(yz5.a aVar, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.l0 l0Var, java.lang.String str, java.lang.String str2) {
        this.f85593a = aVar;
        this.f85594b = l0Var;
        this.f85595c = str;
        this.f85596d = str2;
    }

    @Override // ui1.r
    public void a() {
        this.f85593a.invoke();
    }

    @Override // ui1.r
    public void c(int i17, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f85594b.d(this.f85595c, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.e.a("fail ".concat(str), this.f85596d));
    }

    @Override // ui1.r
    public void onCancel() {
        this.f85594b.d(this.f85595c, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.e.a("fail:auth canceled", this.f85596d));
    }
}
