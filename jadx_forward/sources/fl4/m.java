package fl4;

/* loaded from: classes11.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 f345473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f345475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.jq0 f345476g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f345477h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f345478i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f345479m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 serviceC18717xf3b2cd83, java.lang.String str, android.graphics.Bitmap bitmap, bw5.jq0 jq0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        super(0);
        this.f345473d = serviceC18717xf3b2cd83;
        this.f345474e = str;
        this.f345475f = bitmap;
        this.f345476g = jq0Var;
        this.f345477h = i17;
        this.f345478i = h0Var;
        this.f345479m = h0Var2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String coverUrl = this.f345474e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(coverUrl, "$coverUrl");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 serviceC18717xf3b2cd83 = this.f345473d;
        serviceC18717xf3b2cd83.f256229s = coverUrl;
        android.graphics.Bitmap bitmap = this.f345475f;
        serviceC18717xf3b2cd83.f256230t = bitmap;
        tl4.a aVar = serviceC18717xf3b2cd83.f256228r;
        if (aVar != null) {
            bw5.jq0 jq0Var = this.f345476g;
            int i17 = this.f345477h;
            java.lang.String str = (java.lang.String) this.f345478i.f391656d;
            java.lang.String str2 = (java.lang.String) this.f345479m.f391656d;
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = serviceC18717xf3b2cd83.f256225o;
            if (f0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSession");
                throw null;
            }
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 b17 = f0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getSessionToken(...)");
            ((tl4.h) aVar).c(jq0Var, i17, str, str2, bitmap, b17);
        }
        return jz5.f0.f384359a;
    }
}
