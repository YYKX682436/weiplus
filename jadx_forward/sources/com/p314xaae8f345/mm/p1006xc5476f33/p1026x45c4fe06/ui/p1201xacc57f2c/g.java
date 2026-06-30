package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c;

/* loaded from: classes15.dex */
public class g implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb abstractC11896x2d96b4fb = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb() { // from class: com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$Watcher

            /* renamed from: f, reason: collision with root package name */
            public java.lang.String f171120f;

            /* renamed from: g, reason: collision with root package name */
            public java.lang.String f171121g;

            /* renamed from: h, reason: collision with root package name */
            public int f171122h;

            /* renamed from: i, reason: collision with root package name */
            public static final transient java.util.Map f171119i = new java.util.HashMap();

            /* renamed from: CREATOR */
            public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.C12705x10535e7b> f35301x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.g();

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
            public void v(android.os.Parcel parcel2) {
                this.f171120f = parcel2.readString();
                this.f171121g = parcel2.readString();
                this.f171122h = parcel2.readInt();
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                parcel2.writeString(this.f171120f);
                parcel2.writeString(this.f171121g);
                parcel2.writeInt(this.f171122h);
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
            public void y() {
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
            public void z() {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f171120f)) {
                    return;
                }
                java.util.Map map = f171119i;
                synchronized (map) {
                    if (((java.util.HashMap) map).containsKey(this.f171120f)) {
                    }
                    java.util.HashMap hashMap = (java.util.HashMap) map;
                    hashMap.put(this.f171120f, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.f(this));
                }
            }
        };
        abstractC11896x2d96b4fb.v(parcel);
        return abstractC11896x2d96b4fb;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.C12705x10535e7b[i17];
    }
}
