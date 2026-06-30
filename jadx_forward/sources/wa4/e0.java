package wa4;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f525753a;

    /* renamed from: b, reason: collision with root package name */
    public final int f525754b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f525755c;

    public e0(java.lang.String str, int i17, byte[] bArr, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i18 & 1) != 0 ? null : str;
        i17 = (i18 & 2) != 0 ? -1 : i17;
        bArr = (i18 & 4) != 0 ? null : bArr;
        this.f525753a = str;
        this.f525754b = i17;
        this.f525755c = bArr;
    }

    /* renamed from: equals */
    public boolean m173412xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
            return true;
        }
        if (!(obj instanceof wa4.e0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
            return false;
        }
        wa4.e0 e0Var = (wa4.e0) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525753a, e0Var.f525753a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
            return false;
        }
        if (this.f525754b != e0Var.f525754b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525755c, e0Var.f525755c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        return b17;
    }

    /* renamed from: hashCode */
    public int m173413x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        java.lang.String str = this.f525753a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f525754b)) * 31;
        byte[] bArr = this.f525755c;
        int hashCode2 = hashCode + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m173414x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        java.lang.String str = "Video(videoPath=" + this.f525753a + ", videoSourceScene=" + this.f525754b + ", compositionInfo=" + java.util.Arrays.toString(this.f525755c) + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        return str;
    }
}
