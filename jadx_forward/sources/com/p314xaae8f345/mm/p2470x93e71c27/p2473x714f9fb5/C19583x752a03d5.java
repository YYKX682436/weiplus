package com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5;

/* renamed from: com.tencent.mm.pluginsdk.location.Location */
/* loaded from: classes5.dex */
public class C19583x752a03d5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19583x752a03d5> f38825x681a0c0c = new w25.j();

    /* renamed from: d, reason: collision with root package name */
    public final float f270268d;

    /* renamed from: e, reason: collision with root package name */
    public final float f270269e;

    public C19583x752a03d5(float f17, float f18) {
        this.f270268d = f17;
        this.f270269e = f18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f270268d);
        parcel.writeFloat(this.f270269e);
    }

    public C19583x752a03d5(android.os.Parcel parcel) {
        this.f270268d = parcel.readFloat();
        this.f270269e = parcel.readFloat();
    }
}
