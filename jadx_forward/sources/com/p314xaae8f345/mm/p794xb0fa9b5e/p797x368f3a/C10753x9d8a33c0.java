package com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCFloat */
/* loaded from: classes8.dex */
public class C10753x9d8a33c0 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10753x9d8a33c0> f29259x681a0c0c = new tk0.d();

    /* renamed from: d, reason: collision with root package name */
    public float f149936d;

    public C10753x9d8a33c0(float f17) {
        this.f149936d = f17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46212xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10753x9d8a33c0) {
            return this.f149936d == ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10753x9d8a33c0) obj).f149936d;
        }
        if (obj instanceof java.lang.Float) {
            return obj.equals(java.lang.Float.valueOf(this.f149936d));
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m46213x9616526c() {
        return java.lang.Float.toString(this.f149936d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f149936d);
    }
}
