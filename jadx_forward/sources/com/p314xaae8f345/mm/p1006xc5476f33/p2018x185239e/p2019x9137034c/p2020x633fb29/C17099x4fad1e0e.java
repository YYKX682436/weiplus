package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel */
/* loaded from: classes9.dex */
public class C17099x4fad1e0e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17099x4fad1e0e> f37798x681a0c0c = new pw3.d();

    /* renamed from: d, reason: collision with root package name */
    public final int f237998d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f237999e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f238000f;

    /* renamed from: g, reason: collision with root package name */
    public final int f238001g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f238002h;

    public C17099x4fad1e0e(r45.dl0 dl0Var) {
        this.f237998d = dl0Var.f454079d;
        this.f237999e = dl0Var.f454080e;
        this.f238000f = dl0Var.f454081f;
        this.f238001g = dl0Var.f454082g;
        this.f238002h = dl0Var.f454083h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f237998d);
        parcel.writeString(this.f237999e);
        parcel.writeString(this.f238000f);
        parcel.writeInt(this.f238001g);
        parcel.writeString(this.f238002h);
    }

    public C17099x4fad1e0e(android.os.Parcel parcel) {
        this.f237998d = parcel.readInt();
        this.f237999e = parcel.readString();
        this.f238000f = parcel.readString();
        this.f238001g = parcel.readInt();
        this.f238002h = parcel.readString();
    }
}
