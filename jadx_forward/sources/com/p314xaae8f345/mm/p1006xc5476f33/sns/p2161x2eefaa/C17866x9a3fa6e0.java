package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa;

/* renamed from: com.tencent.mm.plugin.sns.data.SnsTagList */
/* loaded from: classes.dex */
public class C17866x9a3fa6e0 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17866x9a3fa6e0> f38037x681a0c0c = new ca4.v0();

    /* renamed from: d, reason: collision with root package name */
    public int f245556d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f245557e = new java.util.LinkedList();

    @Override // android.os.Parcelable
    public int describeContents() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("describeContents", "com.tencent.mm.plugin.sns.data.SnsTagList");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("describeContents", "com.tencent.mm.plugin.sns.data.SnsTagList");
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsTagList");
        java.util.List list = this.f245557e;
        int size = ((java.util.LinkedList) list).size();
        this.f245556d = size;
        parcel.writeInt(size);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(((java.lang.Long) it.next()).longValue());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeToParcel", "com.tencent.mm.plugin.sns.data.SnsTagList");
    }
}
