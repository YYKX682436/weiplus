package com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a;

/* renamed from: com.tencent.mm.ipcinvoker.type.IPCLong */
/* loaded from: classes.dex */
public class C10755xa1fef898 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898> f29261x681a0c0c = new tk0.f();

    /* renamed from: d, reason: collision with root package name */
    public long f149938d;

    public C10755xa1fef898(long j17) {
        this.f149938d = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46218xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898) {
            return this.f149938d == ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898) obj).f149938d;
        }
        if (obj instanceof java.lang.Long) {
            return obj.equals(java.lang.Long.valueOf(this.f149938d));
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m46219x9616526c() {
        return java.lang.Long.toString(this.f149938d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f149938d);
    }
}
