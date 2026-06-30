package p012xc85e97e9.p087x9da2e250.app;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.FragmentState */
/* loaded from: classes14.dex */
public final class C1107xfbc51401 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p087x9da2e250.app.C1107xfbc51401> f3520x681a0c0c = new p012xc85e97e9.p087x9da2e250.app.a2();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f92756d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f92757e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f92758f;

    /* renamed from: g, reason: collision with root package name */
    public final int f92759g;

    /* renamed from: h, reason: collision with root package name */
    public final int f92760h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f92761i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f92762m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f92763n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f92764o;

    /* renamed from: p, reason: collision with root package name */
    public final android.os.Bundle f92765p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f92766q;

    /* renamed from: r, reason: collision with root package name */
    public final int f92767r;

    /* renamed from: s, reason: collision with root package name */
    public android.os.Bundle f92768s;

    public C1107xfbc51401(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        this.f92756d = componentCallbacksC1101xa17d4670.getClass().getName();
        this.f92757e = componentCallbacksC1101xa17d4670.f3465x32e011;
        this.f92758f = componentCallbacksC1101xa17d4670.f3428x4fd80fc1;
        this.f92759g = componentCallbacksC1101xa17d4670.f3426x9ca58fd8;
        this.f92760h = componentCallbacksC1101xa17d4670.f3421xb66d4acf;
        this.f92761i = componentCallbacksC1101xa17d4670.f3457x32d3ed;
        this.f92762m = componentCallbacksC1101xa17d4670.f3449xa8c71e87;
        this.f92763n = componentCallbacksC1101xa17d4670.f3447x66cabce;
        this.f92764o = componentCallbacksC1101xa17d4670.f3425x634032ff;
        this.f92765p = componentCallbacksC1101xa17d4670.f3416x163c369;
        this.f92766q = componentCallbacksC1101xa17d4670.f3430x6dac477;
        this.f92767r = componentCallbacksC1101xa17d4670.f3439x3ca7951a.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m7735x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append("FragmentState{");
        sb6.append(this.f92756d);
        sb6.append(" (");
        sb6.append(this.f92757e);
        sb6.append(")}:");
        if (this.f92758f) {
            sb6.append(" fromLayout");
        }
        int i17 = this.f92760h;
        if (i17 != 0) {
            sb6.append(" id=0x");
            sb6.append(java.lang.Integer.toHexString(i17));
        }
        java.lang.String str = this.f92761i;
        if (str != null && !str.isEmpty()) {
            sb6.append(" tag=");
            sb6.append(str);
        }
        if (this.f92762m) {
            sb6.append(" retainInstance");
        }
        if (this.f92763n) {
            sb6.append(" removing");
        }
        if (this.f92764o) {
            sb6.append(" detached");
        }
        if (this.f92766q) {
            sb6.append(" hidden");
        }
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f92756d);
        parcel.writeString(this.f92757e);
        parcel.writeInt(this.f92758f ? 1 : 0);
        parcel.writeInt(this.f92759g);
        parcel.writeInt(this.f92760h);
        parcel.writeString(this.f92761i);
        parcel.writeInt(this.f92762m ? 1 : 0);
        parcel.writeInt(this.f92763n ? 1 : 0);
        parcel.writeInt(this.f92764o ? 1 : 0);
        parcel.writeBundle(this.f92765p);
        parcel.writeInt(this.f92766q ? 1 : 0);
        parcel.writeBundle(this.f92768s);
        parcel.writeInt(this.f92767r);
    }

    public C1107xfbc51401(android.os.Parcel parcel) {
        this.f92756d = parcel.readString();
        this.f92757e = parcel.readString();
        this.f92758f = parcel.readInt() != 0;
        this.f92759g = parcel.readInt();
        this.f92760h = parcel.readInt();
        this.f92761i = parcel.readString();
        this.f92762m = parcel.readInt() != 0;
        this.f92763n = parcel.readInt() != 0;
        this.f92764o = parcel.readInt() != 0;
        this.f92765p = parcel.readBundle();
        this.f92766q = parcel.readInt() != 0;
        this.f92768s = parcel.readBundle();
        this.f92767r = parcel.readInt();
    }
}
