package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2095x1c644e5f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/helper/halfscreen/MediaObjectList;", "Landroid/os/Parcelable;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList */
/* loaded from: classes4.dex */
public final class C17714x97978761 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2095x1c644e5f.C17714x97978761> f38006x681a0c0c = new n44.g1();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f244224d;

    public C17714x97978761(java.util.ArrayList dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f244224d = dataList;
    }

    public final java.util.ArrayList a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDataList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDataList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList");
        return this.f244224d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("describeContents", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("describeContents", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList");
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeToParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.ArrayList arrayList = this.f244224d;
        out.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeByteArray((byte[]) it.next());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeToParcel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList");
    }
}
