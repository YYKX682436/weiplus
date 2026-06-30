package com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCString */
/* loaded from: classes.dex */
public class C10756x2a5d7b2d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d> f29262x681a0c0c = new tk0.g();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f149939d;

    public C10756x2a5d7b2d(java.lang.String str) {
        this.f149939d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46221xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d)) {
            if (obj instanceof java.lang.String) {
                return obj.equals(this.f149939d);
            }
            return false;
        }
        java.lang.String str = this.f149939d;
        java.lang.String str2 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj).f149939d;
        if (str != str2) {
            return str != null && str.equals(str2);
        }
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m46222x9616526c() {
        return this.f149939d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f149939d);
    }
}
