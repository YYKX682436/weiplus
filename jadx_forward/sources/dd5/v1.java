package dd5;

/* loaded from: classes9.dex */
public final class v1 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310843a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f310844b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310845c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f310846d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f310847e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310848f;

    public v1(java.lang.CharSequence title, java.lang.CharSequence source, java.lang.String imgPath, java.lang.String appId, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310843a = title;
        this.f310844b = source;
        this.f310845c = imgPath;
        this.f310846d = appId;
        this.f310847e = z17;
        this.f310848f = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310843a, this.f310844b);
    }

    /* renamed from: equals */
    public boolean m124087xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.v1)) {
            return false;
        }
        dd5.v1 v1Var = (dd5.v1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310843a, v1Var.f310843a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310844b, v1Var.f310844b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310845c, v1Var.f310845c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310846d, v1Var.f310846d) && this.f310847e == v1Var.f310847e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310848f, v1Var.f310848f);
    }

    /* renamed from: hashCode */
    public int m124088x8cdac1b() {
        return (((((((((this.f310843a.hashCode() * 31) + this.f310844b.hashCode()) * 31) + this.f310845c.hashCode()) * 31) + this.f310846d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f310847e)) * 31) + this.f310848f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124089x9616526c() {
        return "MsgHistoryGalleryTypeLinkViewModel(title=" + ((java.lang.Object) this.f310843a) + ", source=" + ((java.lang.Object) this.f310844b) + ", imgPath=" + this.f310845c + ", appId=" + this.f310846d + ", isBizNativeVideo=" + this.f310847e + ", msgInfo=" + this.f310848f + ')';
    }
}
