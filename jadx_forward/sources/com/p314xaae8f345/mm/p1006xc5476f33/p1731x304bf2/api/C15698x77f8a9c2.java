package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api;

/* renamed from: com.tencent.mm.plugin.game.api.GameShareOption */
/* loaded from: classes8.dex */
public class C15698x77f8a9c2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15698x77f8a9c2> f36438x681a0c0c = new m33.z0();

    /* renamed from: d, reason: collision with root package name */
    public final int f220227d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f220228e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f220229f;

    public C15698x77f8a9c2(int i17, java.lang.String str, boolean z17) {
        this.f220229f = false;
        this.f220227d = i17;
        this.f220228e = str;
        this.f220229f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f220227d);
        parcel.writeString(this.f220228e);
        parcel.writeInt(this.f220229f ? 1 : 0);
    }

    public C15698x77f8a9c2(android.os.Parcel parcel) {
        this.f220229f = false;
        this.f220227d = parcel.readInt();
        this.f220228e = parcel.readString();
        this.f220229f = parcel.readInt() == 1;
    }
}
