package td4;

/* loaded from: classes4.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f499188a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.jj4 f499189b;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 info, r45.jj4 mediaObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObj, "mediaObj");
        this.f499188a = info;
        this.f499189b = mediaObj;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return this.f499188a;
    }

    public final r45.jj4 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaObj", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObj", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return this.f499189b;
    }

    /* renamed from: equals */
    public boolean m166285xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
            return true;
        }
        if (!(obj instanceof td4.f2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
            return false;
        }
        td4.f2 f2Var = (td4.f2) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f499188a, f2Var.f499188a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f499189b, f2Var.f499189b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return b17;
    }

    /* renamed from: hashCode */
    public int m166286x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        int hashCode = (this.f499188a.hashCode() * 31) + this.f499189b.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m166287x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        java.lang.String str = "SnsPickerMediaInfo(info=" + this.f499188a + ", mediaObj=" + this.f499189b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.picker.SnsPickerMediaInfo");
        return str;
    }
}
