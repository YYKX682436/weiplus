package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf;

/* renamed from: com.tencent.mm.plugin.performance.elf.ElfCheckRequest */
/* loaded from: classes5.dex */
public class C16792xd1660a86 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16792xd1660a86> f37718x681a0c0c = new xp3.d();

    /* renamed from: d, reason: collision with root package name */
    public long f234500d;

    public C16792xd1660a86() {
        this.f234500d = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f234500d);
    }

    public C16792xd1660a86(android.os.Parcel parcel) {
        this.f234500d = 0L;
        this.f234500d = parcel.readLong();
    }
}
