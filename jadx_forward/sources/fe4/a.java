package fe4;

/* loaded from: classes.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18434x2aa61c06.class.getClassLoader()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18434x2aa61c06 c18434x2aa61c06 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18434x2aa61c06(arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFromParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        return c18434x2aa61c06;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18434x2aa61c06[] c18434x2aa61c06Arr = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18434x2aa61c06[i17];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newArray", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsDraftMultiPicItems$Creator");
        return c18434x2aa61c06Arr;
    }
}
