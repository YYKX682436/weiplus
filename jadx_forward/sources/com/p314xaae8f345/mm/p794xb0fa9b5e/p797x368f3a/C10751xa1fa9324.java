package com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCByte */
/* loaded from: classes7.dex */
public class C10751xa1fa9324 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10751xa1fa9324> f29257x681a0c0c = new tk0.b();

    /* renamed from: d, reason: collision with root package name */
    public byte f149934d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46206xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10751xa1fa9324) {
            return this.f149934d == ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10751xa1fa9324) obj).f149934d;
        }
        if (obj instanceof java.lang.Byte) {
            return obj.equals(java.lang.Byte.valueOf(this.f149934d));
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m46207x9616526c() {
        return java.lang.Integer.toString(this.f149934d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f149934d);
    }
}
