package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.WxaMenuHelper$GetCopyPathMenuExpireTimeTask */
/* loaded from: classes4.dex */
class C12421xf7ebdf49 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.C12421xf7ebdf49> f35104x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.j1();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f167395f;

    /* renamed from: g, reason: collision with root package name */
    public long f167396g = 0;

    public C12421xf7ebdf49(java.lang.String str) {
        this.f167395f = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f167396g = parcel.readLong();
        this.f167395f = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f167396g);
        parcel.writeString(this.f167395f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        java.lang.Long f17 = oh1.r2.INSTANCE.f(this.f167395f, "copypath");
        if (f17 == null) {
            this.f167396g = 0L;
        } else {
            this.f167396g = f17.longValue();
        }
    }

    public C12421xf7ebdf49(android.os.Parcel parcel) {
        v(parcel);
    }
}
