package com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCDouble */
/* loaded from: classes8.dex */
public class C10752x107f96ed implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10752x107f96ed> f29258x681a0c0c = new tk0.c();

    /* renamed from: d, reason: collision with root package name */
    public double f149935d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46209xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10752x107f96ed) {
            return this.f149935d == ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10752x107f96ed) obj).f149935d;
        }
        if (obj instanceof java.lang.Double) {
            return obj.equals(java.lang.Double.valueOf(this.f149935d));
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m46210x9616526c() {
        return java.lang.Double.toString(this.f149935d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f149935d);
    }
}
