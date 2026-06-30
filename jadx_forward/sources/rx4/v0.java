package rx4;

/* loaded from: classes8.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f482833a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482834b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f482835c;

    /* renamed from: d, reason: collision with root package name */
    public final int f482836d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f482837e;

    /* renamed from: f, reason: collision with root package name */
    public final int f482838f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f482839g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f482840h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f482841i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f482842j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f482843k;

    public v0(int i17, java.lang.String iconUrl, java.lang.String subTitle, int i18, java.lang.String mixerCommonContext, int i19, java.lang.String appId, java.lang.String weappUrl, java.lang.String userName, java.lang.String ecsAction, java.lang.String ecsJumpInfoBase64) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrl, "iconUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subTitle, "subTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixerCommonContext, "mixerCommonContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weappUrl, "weappUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ecsAction, "ecsAction");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ecsJumpInfoBase64, "ecsJumpInfoBase64");
        this.f482833a = i17;
        this.f482834b = iconUrl;
        this.f482835c = subTitle;
        this.f482836d = i18;
        this.f482837e = mixerCommonContext;
        this.f482838f = i19;
        this.f482839g = appId;
        this.f482840h = weappUrl;
        this.f482841i = userName;
        this.f482842j = ecsAction;
        this.f482843k = ecsJumpInfoBase64;
    }

    /* renamed from: equals */
    public boolean m163427xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.v0)) {
            return false;
        }
        rx4.v0 v0Var = (rx4.v0) obj;
        return this.f482833a == v0Var.f482833a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482834b, v0Var.f482834b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482835c, v0Var.f482835c) && this.f482836d == v0Var.f482836d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482837e, v0Var.f482837e) && this.f482838f == v0Var.f482838f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482839g, v0Var.f482839g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482840h, v0Var.f482840h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482841i, v0Var.f482841i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482842j, v0Var.f482842j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482843k, v0Var.f482843k);
    }

    /* renamed from: hashCode */
    public int m163428x8cdac1b() {
        return (((((((((((((((((((java.lang.Integer.hashCode(this.f482833a) * 31) + this.f482834b.hashCode()) * 31) + this.f482835c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f482836d)) * 31) + this.f482837e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f482838f)) * 31) + this.f482839g.hashCode()) * 31) + this.f482840h.hashCode()) * 31) + this.f482841i.hashCode()) * 31) + this.f482842j.hashCode()) * 31) + this.f482843k.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163429x9616526c() {
        return "FTSRecommendBannerInfo(type=" + this.f482833a + ", iconUrl=" + this.f482834b + ", subTitle=" + this.f482835c + ", parentType=" + this.f482836d + ", mixerCommonContext=" + this.f482837e + ", jumpType=" + this.f482838f + ", appId=" + this.f482839g + ", weappUrl=" + this.f482840h + ", userName=" + this.f482841i + ", ecsAction=" + this.f482842j + ", ecsJumpInfoBase64=" + this.f482843k + ')';
    }
}
