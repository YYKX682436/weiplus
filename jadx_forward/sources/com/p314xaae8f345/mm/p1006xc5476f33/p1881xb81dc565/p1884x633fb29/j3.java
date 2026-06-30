package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class j3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0 f231554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0 f231555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231556f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f231557g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f231558h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0 b0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0 a0Var, java.lang.String str, android.graphics.Bitmap bitmap, int i17) {
        super(0);
        this.f231554d = b0Var;
        this.f231555e = a0Var;
        this.f231556f = str;
        this.f231557g = bitmap;
        this.f231558h = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f231554d.c();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f231555e.a(this.f231556f, this.f231557g, 90, this.f231558h);
        zj3.i.f554861a.a(4, android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        return jz5.f0.f384359a;
    }
}
