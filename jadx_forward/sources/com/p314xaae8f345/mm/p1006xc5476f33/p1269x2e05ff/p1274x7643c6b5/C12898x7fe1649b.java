package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.ball.service.PageFloatBallHelper$ExitPageAnimationInfo */
/* loaded from: classes14.dex */
public class C12898x7fe1649b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12898x7fe1649b> f35367x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.c5();

    /* renamed from: d, reason: collision with root package name */
    public int f174650d;

    /* renamed from: e, reason: collision with root package name */
    public int f174651e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f174652f;

    public C12898x7fe1649b(android.os.Parcel parcel) {
        this.f174650d = parcel.readInt();
        this.f174651e = parcel.readInt();
        this.f174652f = (android.graphics.Bitmap) parcel.readParcelable(android.graphics.Bitmap.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f174650d);
        parcel.writeInt(this.f174651e);
        parcel.writeParcelable(this.f174652f, i17);
    }
}
