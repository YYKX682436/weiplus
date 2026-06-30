package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class g implements com.tencent.mm.plugin.appbrand.utils.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.n f86625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f86626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f86627c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.a f86628d;

    public g(com.tencent.mm.plugin.appbrand.page.a aVar, com.tencent.luggage.sdk.jsapi.component.n nVar, long j17, int i17) {
        this.f86628d = aVar;
        this.f86625a = nVar;
        this.f86626b = j17;
        this.f86627c = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        this.f86628d.X(this.f86625a, false, this.f86626b, java.lang.System.currentTimeMillis(), null);
        sj1.l.h(this.f86628d.H(), this.f86627c);
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        this.f86628d.X(this.f86625a, true, this.f86626b, java.lang.System.currentTimeMillis(), null);
        sj1.l.h(this.f86628d.H(), this.f86627c);
    }
}
