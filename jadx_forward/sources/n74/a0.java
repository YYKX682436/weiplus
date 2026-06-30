package n74;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f416829a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f416830b;

    /* renamed from: c, reason: collision with root package name */
    public final n74.y f416831c;

    public a0(java.lang.String mediaId, java.lang.String str, n74.y state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f416829a = mediaId;
        this.f416830b = str;
        this.f416831c = state;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFilePath", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFilePath", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        return this.f416830b;
    }

    public final n74.y b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getState", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getState", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        return this.f416831c;
    }

    /* renamed from: equals */
    public boolean m149173xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            return true;
        }
        if (!(obj instanceof n74.a0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            return false;
        }
        n74.a0 a0Var = (n74.a0) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f416829a, a0Var.f416829a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f416830b, a0Var.f416830b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            return false;
        }
        n74.y yVar = this.f416831c;
        n74.y yVar2 = a0Var.f416831c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        return yVar == yVar2;
    }

    /* renamed from: hashCode */
    public int m149174x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        int hashCode = this.f416829a.hashCode() * 31;
        java.lang.String str = this.f416830b;
        int hashCode2 = ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f416831c.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m149175x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        java.lang.String str = "VideoResult(mediaId=" + this.f416829a + ", filePath=" + this.f416830b + ", state=" + this.f416831c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
        return str;
    }
}
