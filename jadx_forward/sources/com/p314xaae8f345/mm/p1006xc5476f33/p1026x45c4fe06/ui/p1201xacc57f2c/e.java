package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c;

/* loaded from: classes.dex */
public class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb abstractC11896x2d96b4fb = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb() { // from class: com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$OperateTask

            /* renamed from: CREATOR */
            public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.C12704x984e5e68> f35300x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.e();

            /* renamed from: f, reason: collision with root package name */
            public int f171114f = 0;

            /* renamed from: g, reason: collision with root package name */
            public boolean f171115g;

            /* renamed from: h, reason: collision with root package name */
            public java.lang.String f171116h;

            /* renamed from: i, reason: collision with root package name */
            public int f171117i;

            /* renamed from: m, reason: collision with root package name */
            public java.lang.String f171118m;

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
            public void v(android.os.Parcel parcel2) {
                this.f171114f = parcel2.readInt();
                this.f171115g = parcel2.readByte() != 0;
                this.f171116h = parcel2.readString();
                this.f171117i = parcel2.readInt();
                this.f171118m = parcel2.readString();
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                super.writeToParcel(parcel2, i17);
                parcel2.writeInt(this.f171114f);
                parcel2.writeByte(this.f171115g ? (byte) 1 : (byte) 0);
                parcel2.writeString(this.f171116h);
                parcel2.writeInt(this.f171117i);
                parcel2.writeString(this.f171118m);
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
            public void z() {
                if (this.f171114f != 1) {
                    return;
                }
                this.f171115g = false;
                c();
            }
        };
        abstractC11896x2d96b4fb.v(parcel);
        return abstractC11896x2d96b4fb;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.C12704x984e5e68[i17];
    }
}
