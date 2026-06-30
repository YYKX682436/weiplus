package com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCInteger */
/* loaded from: classes.dex */
public class C10754x630c9a2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2> f29260x681a0c0c = new tk0.e();

    /* renamed from: d, reason: collision with root package name */
    public int f149937d;

    public C10754x630c9a2(int i17) {
        this.f149937d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46215xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) {
            return this.f149937d == ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) obj).f149937d;
        }
        if (obj instanceof java.lang.Integer) {
            return obj.equals(java.lang.Integer.valueOf(this.f149937d));
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m46216x9616526c() {
        return java.lang.Integer.toString(this.f149937d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f149937d);
    }
}
