package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class e implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nf.j f82595b;

    public e(int i17, nf.j jVar) {
        this.f82594a = i17;
        this.f82595b = jVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        if (this.f82594a != i17) {
            return false;
        }
        this.f82595b.onResult(i18, intent);
        return true;
    }
}
