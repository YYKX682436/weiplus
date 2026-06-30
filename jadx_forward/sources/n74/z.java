package n74;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f416984a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f416985b;

    /* renamed from: c, reason: collision with root package name */
    public final n74.y f416986c;

    public z(java.lang.String mediaId, java.lang.ref.WeakReference weakReference, n74.y state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f416984a = mediaId;
        this.f416985b = weakReference;
        this.f416986c = state;
    }

    /* renamed from: equals */
    public boolean m149194xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            return true;
        }
        if (!(obj instanceof n74.z)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            return false;
        }
        n74.z zVar = (n74.z) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f416984a, zVar.f416984a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f416985b, zVar.f416985b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            return false;
        }
        n74.y yVar = this.f416986c;
        n74.y yVar2 = zVar.f416986c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
        return yVar == yVar2;
    }

    /* renamed from: hashCode */
    public int m149195x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
        int hashCode = this.f416984a.hashCode() * 31;
        java.lang.ref.WeakReference weakReference = this.f416985b;
        int hashCode2 = ((hashCode + (weakReference == null ? 0 : weakReference.hashCode())) * 31) + this.f416986c.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m149196x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
        java.lang.String str = "ThumbResult(mediaId=" + this.f416984a + ", bitmap=" + this.f416985b + ", state=" + this.f416986c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
        return str;
    }
}
