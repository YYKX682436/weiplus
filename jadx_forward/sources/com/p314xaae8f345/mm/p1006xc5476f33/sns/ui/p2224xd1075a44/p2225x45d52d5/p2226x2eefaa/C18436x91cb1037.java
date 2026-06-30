package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/multi_image/data/SnsPublishImageItem;", "Lcom/tencent/mm/plugin/sns/ui/widget/multi_image/data/SnsPublishBaseMultiPicItem;", "CREATOR", "fe4/c", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem */
/* loaded from: classes4.dex */
public final class C18436x91cb1037 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c {

    /* renamed from: CREATOR */
    public static final fe4.c f38466x681a0c0c = new fe4.c(null);

    /* renamed from: h, reason: collision with root package name */
    public final int f252743h;

    public /* synthetic */ C18436x91cb1037(java.lang.String str, int i17, int i18, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071 c17030x7c2c6071, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, (i27 & 4) != 0 ? 0 : i18, (i27 & 8) != 0 ? 0 : i19, (i27 & 16) != 0 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071.f237399u) : c17030x7c2c6071);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c
    public int d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPicType", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicType", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem");
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("describeContents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("describeContents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem");
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeToParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(b());
        parcel.writeInt(c());
        parcel.writeInt(a());
        parcel.writeInt(this.f252743h);
        parcel.writeParcelable(this.f252742g, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeToParcel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18436x91cb1037(java.lang.String str, int i17, int i18, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071 reporter) {
        super(str, i17, i18, reporter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reporter, "reporter");
        this.f252743h = i19;
    }

    public C18436x91cb1037(java.lang.String str, int i17, int i18, int i19) {
        this(str, i17, i18, i19, new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071.f237399u));
    }
}
