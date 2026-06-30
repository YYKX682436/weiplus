package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/data/SnsBgmInfo;", "Landroid/os/Parcelable;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.data.SnsBgmInfo */
/* loaded from: classes.dex */
public final /* data */ class C17864xec9fd11e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17864xec9fd11e> f38035x681a0c0c = new ca4.o0();

    /* renamed from: d, reason: collision with root package name */
    public final int f245549d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f245550e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f245551f;

    public C17864xec9fd11e(int i17, java.lang.String listenId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        this.f245549d = i17;
        this.f245550e = listenId;
        this.f245551f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("describeContents", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("describeContents", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        return 0;
    }

    /* renamed from: equals */
    public boolean m69772xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17864xec9fd11e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17864xec9fd11e c17864xec9fd11e = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17864xec9fd11e) obj;
        if (this.f245549d != c17864xec9fd11e.f245549d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f245550e, c17864xec9fd11e.f245550e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
            return false;
        }
        boolean z17 = this.f245551f;
        boolean z18 = c17864xec9fd11e.f245551f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        return z17 == z18;
    }

    /* renamed from: hashCode */
    public int m69773x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        int hashCode = (((java.lang.Integer.hashCode(this.f245549d) * 31) + this.f245550e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f245551f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m69774x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        java.lang.String str = "SnsBgmInfo(bgmType=" + this.f245549d + ", listenId=" + this.f245550e + ", isMajorOwned=" + this.f245551f + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f245549d);
        out.writeString(this.f245550e);
        out.writeInt(this.f245551f ? 1 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsBgmInfo");
    }
}
