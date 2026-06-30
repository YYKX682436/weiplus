package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/component/unread/SnsUnreadSaveItem;", "Landroid/os/Parcelable;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem */
/* loaded from: classes4.dex */
public final /* data */ class C18252x1a733a77 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18252x1a733a77> f38398x681a0c0c = new oc4.t();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f250557d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f250558e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f250559f;

    public C18252x1a733a77(java.lang.String feedId, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        this.f250557d = feedId;
        this.f250558e = z17;
        this.f250559f = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("describeContents", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("describeContents", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        return 0;
    }

    /* renamed from: equals */
    public boolean m70955xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18252x1a733a77)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18252x1a733a77 c18252x1a733a77 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18252x1a733a77) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f250557d, c18252x1a733a77.f250557d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
            return false;
        }
        if (this.f250558e != c18252x1a733a77.f250558e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
            return false;
        }
        boolean z17 = this.f250559f;
        boolean z18 = c18252x1a733a77.f250559f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        return z17 == z18;
    }

    /* renamed from: hashCode */
    public int m70956x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        int hashCode = (((this.f250557d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f250558e)) * 31) + java.lang.Boolean.hashCode(this.f250559f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m70957x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        java.lang.String str = "SnsUnreadSaveItem(feedId=" + this.f250557d + ", expose=" + this.f250558e + ", indicator=" + this.f250559f + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeToParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f250557d);
        out.writeInt(this.f250558e ? 1 : 0);
        out.writeInt(this.f250559f ? 1 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeToParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
    }
}
