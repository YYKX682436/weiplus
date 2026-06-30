package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa;

/* renamed from: com.tencent.mm.plugin.sns.data.SnsCmdList */
/* loaded from: classes4.dex */
public class C17865x2b459880 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880> f38036x681a0c0c = new ca4.p0();

    /* renamed from: d, reason: collision with root package name */
    public int f245552d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f245553e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f245554f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f245555g = new java.util.LinkedList();

    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addRemoveItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        ((java.util.LinkedList) this.f245554f).add(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addRemoveItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
    }

    public java.util.List b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChanges", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        java.util.List list = this.f245555g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChanges", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        return list;
    }

    public java.util.List c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRemoves", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        java.util.List list = this.f245554f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRemoves", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        return list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("describeContents", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("describeContents", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsCmdList");
        java.util.List list = this.f245554f;
        int size = ((java.util.LinkedList) list).size();
        this.f245552d = size;
        parcel.writeInt(size);
        for (int i18 = 0; i18 < this.f245552d; i18++) {
            parcel.writeInt(((java.lang.Integer) ((java.util.LinkedList) list).get(i18)).intValue());
        }
        java.util.List list2 = this.f245555g;
        int size2 = ((java.util.LinkedList) list2).size();
        this.f245553e = size2;
        parcel.writeInt(size2);
        for (int i19 = 0; i19 < this.f245553e; i19++) {
            parcel.writeInt(((java.lang.Integer) ((java.util.LinkedList) list2).get(i19)).intValue());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsCmdList");
    }
}
