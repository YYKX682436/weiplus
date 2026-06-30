package fe4;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f343101a;

    /* renamed from: b, reason: collision with root package name */
    public final int f343102b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f343103c;

    public d(java.lang.String mediaKey, int i17, java.lang.String errorMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaKey, "mediaKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        this.f343101a = mediaKey;
        this.f343102b = i17;
        this.f343103c = errorMsg;
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCode", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCode", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        return this.f343102b;
    }

    /* renamed from: equals */
    public boolean m129457xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
            return true;
        }
        if (!(obj instanceof fe4.d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
            return false;
        }
        fe4.d dVar = (fe4.d) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f343101a, dVar.f343101a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
            return false;
        }
        if (this.f343102b != dVar.f343102b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f343103c, dVar.f343103c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        return b17;
    }

    /* renamed from: hashCode */
    public int m129458x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        int hashCode = (((this.f343101a.hashCode() * 31) + java.lang.Integer.hashCode(this.f343102b)) * 31) + this.f343103c.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m129459x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        java.lang.String str = "SnsPublishLivePhotoDealResult(mediaKey=" + this.f343101a + ", code=" + this.f343102b + ", errorMsg=" + this.f343103c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        return str;
    }
}
