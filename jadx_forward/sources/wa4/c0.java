package wa4;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f525740a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f525741b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f525742c;

    public c0(java.lang.String photoPath, java.lang.String str, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(photoPath, "photoPath");
        this.f525740a = photoPath;
        this.f525741b = str;
        this.f525742c = z17;
    }

    /* renamed from: equals */
    public boolean m173406xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
            return true;
        }
        if (!(obj instanceof wa4.c0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
            return false;
        }
        wa4.c0 c0Var = (wa4.c0) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525740a, c0Var.f525740a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525741b, c0Var.f525741b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
            return false;
        }
        boolean z17 = this.f525742c;
        boolean z18 = c0Var.f525742c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
        return z17 == z18;
    }

    /* renamed from: hashCode */
    public int m173407x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
        int hashCode = this.f525740a.hashCode() * 31;
        java.lang.String str = this.f525741b;
        int hashCode2 = ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f525742c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m173408x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
        java.lang.String str = "Photo(photoPath=" + this.f525740a + ", videoPath=" + this.f525741b + ", isLivePhoto=" + this.f525742c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
        return str;
    }
}
