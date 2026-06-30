package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$NavigateBackH5Task */
/* loaded from: classes.dex */
public final class C12097x8bcc78fd extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12097x8bcc78fd> f34160x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.g0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f162431f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f162432g;

    /* renamed from: h, reason: collision with root package name */
    public int f162433h;

    public C12097x8bcc78fd() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f162431f = parcel.readString();
        this.f162432g = parcel.readString();
        this.f162433h = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f162431f);
        parcel.writeString(this.f162432g);
        parcel.writeInt(this.f162433h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        java.lang.String str = this.f162432g;
        int i17 = this.f162433h;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5726xa4aac895 c5726xa4aac895 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5726xa4aac895();
        am.mk mkVar = c5726xa4aac895.f136048g;
        mkVar.getClass();
        mkVar.f88885a = i17;
        mkVar.f88886b = str;
        c5726xa4aac895.e();
    }

    public C12097x8bcc78fd(java.lang.String str, java.lang.String str2, int i17) {
        this.f162431f = str;
        this.f162432g = str2;
        this.f162433h = i17;
    }
}
