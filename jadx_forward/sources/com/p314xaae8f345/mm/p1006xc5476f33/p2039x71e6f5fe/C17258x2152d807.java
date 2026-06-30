package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* renamed from: com.tencent.mm.plugin.scanner.CodePointRect */
/* loaded from: classes13.dex */
public class C17258x2152d807 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807> f37910x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.b();

    /* renamed from: d, reason: collision with root package name */
    public final float f240144d;

    /* renamed from: e, reason: collision with root package name */
    public final float f240145e;

    /* renamed from: f, reason: collision with root package name */
    public final float f240146f;

    /* renamed from: g, reason: collision with root package name */
    public final float f240147g;

    public C17258x2152d807(float f17, float f18, float f19, float f27) {
        this.f240144d = f17;
        this.f240145e = f18;
        this.f240146f = f19;
        this.f240147g = f27;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f240144d);
        parcel.writeFloat(this.f240145e);
        parcel.writeFloat(this.f240146f);
        parcel.writeFloat(this.f240147g);
    }

    public C17258x2152d807(android.os.Parcel parcel) {
        this.f240144d = parcel.readFloat();
        this.f240145e = parcel.readFloat();
        this.f240146f = parcel.readFloat();
        this.f240147g = parcel.readFloat();
    }
}
