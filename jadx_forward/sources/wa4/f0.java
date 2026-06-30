package wa4;

/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final wa4.d0 f525758a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f525759b;

    /* renamed from: c, reason: collision with root package name */
    public final wa4.e0 f525760c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.ed4 f525761d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f525762e;

    public f0(wa4.d0 d0Var, java.util.List list, wa4.e0 e0Var, r45.ed4 ed4Var, boolean z17) {
        this.f525758a = d0Var;
        this.f525759b = list;
        this.f525760c = e0Var;
        this.f525761d = ed4Var;
        this.f525762e = z17;
    }

    public final r45.ed4 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0.f34398x24728b, "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0.f34398x24728b, "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        return this.f525761d;
    }

    public final java.util.List b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhotos", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotos", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        return this.f525759b;
    }

    /* renamed from: equals */
    public boolean m173415xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            return true;
        }
        if (!(obj instanceof wa4.f0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            return false;
        }
        wa4.f0 f0Var = (wa4.f0) obj;
        if (this.f525758a != f0Var.f525758a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525759b, f0Var.f525759b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525760c, f0Var.f525760c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525761d, f0Var.f525761d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            return false;
        }
        boolean z17 = this.f525762e;
        boolean z18 = f0Var.f525762e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        return z17 == z18;
    }

    /* renamed from: hashCode */
    public int m173416x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        wa4.d0 d0Var = this.f525758a;
        int hashCode = (d0Var == null ? 0 : d0Var.hashCode()) * 31;
        java.util.List list = this.f525759b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        wa4.e0 e0Var = this.f525760c;
        int m173413x8cdac1b = (hashCode2 + (e0Var == null ? 0 : e0Var.m173413x8cdac1b())) * 31;
        r45.ed4 ed4Var = this.f525761d;
        int hashCode3 = ((m173413x8cdac1b + (ed4Var != null ? ed4Var.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f525762e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        return hashCode3;
    }

    /* renamed from: toString */
    public java.lang.String m173417x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        java.lang.String str = "TimelineSessionPostInfo(infoType=" + this.f525758a + ", photos=" + this.f525759b + ", video=" + this.f525760c + ", location=" + this.f525761d + ", shouldShowShare=" + this.f525762e + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
        return str;
    }

    public /* synthetic */ f0(wa4.d0 d0Var, java.util.List list, wa4.e0 e0Var, r45.ed4 ed4Var, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : d0Var, (i17 & 2) != 0 ? null : list, (i17 & 4) != 0 ? null : e0Var, (i17 & 8) == 0 ? ed4Var : null, (i17 & 16) != 0 ? true : z17);
    }
}
