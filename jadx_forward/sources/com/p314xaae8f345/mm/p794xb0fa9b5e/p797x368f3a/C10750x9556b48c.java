package com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCBoolean */
/* loaded from: classes.dex */
public class C10750x9556b48c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c> f29256x681a0c0c = new tk0.a();

    /* renamed from: d, reason: collision with root package name */
    public boolean f149933d;

    public C10750x9556b48c(boolean z17) {
        this.f149933d = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46203xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) {
            return this.f149933d == ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj).f149933d;
        }
        if (obj instanceof java.lang.Boolean) {
            return obj.equals(java.lang.Boolean.valueOf(this.f149933d));
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m46204x9616526c() {
        return java.lang.Boolean.toString(this.f149933d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f149933d ? 1 : 0);
    }
}
