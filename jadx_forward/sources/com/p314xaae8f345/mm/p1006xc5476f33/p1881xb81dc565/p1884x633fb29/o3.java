package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class o3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f231592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f231594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f231595g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f231596h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(java.util.ArrayList arrayList, java.lang.String str, android.graphics.Bitmap bitmap, int i17, int i18) {
        super(0);
        this.f231592d = arrayList;
        this.f231593e = str;
        this.f231594f = bitmap;
        this.f231595g = i17;
        this.f231596h = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0 a0Var : this.f231592d) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            a0Var.a(this.f231593e, this.f231594f, this.f231595g, this.f231596h);
            zj3.i.f554861a.a(3, android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        return jz5.f0.f384359a;
    }
}
