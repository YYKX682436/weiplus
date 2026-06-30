package androidx.fragment.app;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class FragmentState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentState> CREATOR = new androidx.fragment.app.a2();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f11223d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f11224e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11225f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11226g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11227h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f11228i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11229m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f11230n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f11231o;

    /* renamed from: p, reason: collision with root package name */
    public final android.os.Bundle f11232p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f11233q;

    /* renamed from: r, reason: collision with root package name */
    public final int f11234r;

    /* renamed from: s, reason: collision with root package name */
    public android.os.Bundle f11235s;

    public FragmentState(androidx.fragment.app.Fragment fragment) {
        this.f11223d = fragment.getClass().getName();
        this.f11224e = fragment.mWho;
        this.f11225f = fragment.mFromLayout;
        this.f11226g = fragment.mFragmentId;
        this.f11227h = fragment.mContainerId;
        this.f11228i = fragment.mTag;
        this.f11229m = fragment.mRetainInstance;
        this.f11230n = fragment.mRemoving;
        this.f11231o = fragment.mDetached;
        this.f11232p = fragment.mArguments;
        this.f11233q = fragment.mHidden;
        this.f11234r = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append("FragmentState{");
        sb6.append(this.f11223d);
        sb6.append(" (");
        sb6.append(this.f11224e);
        sb6.append(")}:");
        if (this.f11225f) {
            sb6.append(" fromLayout");
        }
        int i17 = this.f11227h;
        if (i17 != 0) {
            sb6.append(" id=0x");
            sb6.append(java.lang.Integer.toHexString(i17));
        }
        java.lang.String str = this.f11228i;
        if (str != null && !str.isEmpty()) {
            sb6.append(" tag=");
            sb6.append(str);
        }
        if (this.f11229m) {
            sb6.append(" retainInstance");
        }
        if (this.f11230n) {
            sb6.append(" removing");
        }
        if (this.f11231o) {
            sb6.append(" detached");
        }
        if (this.f11233q) {
            sb6.append(" hidden");
        }
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f11223d);
        parcel.writeString(this.f11224e);
        parcel.writeInt(this.f11225f ? 1 : 0);
        parcel.writeInt(this.f11226g);
        parcel.writeInt(this.f11227h);
        parcel.writeString(this.f11228i);
        parcel.writeInt(this.f11229m ? 1 : 0);
        parcel.writeInt(this.f11230n ? 1 : 0);
        parcel.writeInt(this.f11231o ? 1 : 0);
        parcel.writeBundle(this.f11232p);
        parcel.writeInt(this.f11233q ? 1 : 0);
        parcel.writeBundle(this.f11235s);
        parcel.writeInt(this.f11234r);
    }

    public FragmentState(android.os.Parcel parcel) {
        this.f11223d = parcel.readString();
        this.f11224e = parcel.readString();
        this.f11225f = parcel.readInt() != 0;
        this.f11226g = parcel.readInt();
        this.f11227h = parcel.readInt();
        this.f11228i = parcel.readString();
        this.f11229m = parcel.readInt() != 0;
        this.f11230n = parcel.readInt() != 0;
        this.f11231o = parcel.readInt() != 0;
        this.f11232p = parcel.readBundle();
        this.f11233q = parcel.readInt() != 0;
        this.f11235s = parcel.readBundle();
        this.f11234r = parcel.readInt();
    }
}
