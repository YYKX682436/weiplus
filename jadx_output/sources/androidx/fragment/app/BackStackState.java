package androidx.fragment.app;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class BackStackState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackState> CREATOR = new androidx.fragment.app.b();

    /* renamed from: d, reason: collision with root package name */
    public final int[] f11190d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f11191e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f11192f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f11193g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11194h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f11195i;

    /* renamed from: m, reason: collision with root package name */
    public final int f11196m;

    /* renamed from: n, reason: collision with root package name */
    public final int f11197n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.CharSequence f11198o;

    /* renamed from: p, reason: collision with root package name */
    public final int f11199p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.CharSequence f11200q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f11201r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f11202s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f11203t;

    public BackStackState(androidx.fragment.app.a aVar) {
        int size = aVar.f11344a.size();
        this.f11190d = new int[size * 5];
        if (aVar.f11350g) {
            this.f11191e = new java.util.ArrayList(size);
            this.f11192f = new int[size];
            this.f11193g = new int[size];
            int i17 = 0;
            int i18 = 0;
            while (i17 < size) {
                androidx.fragment.app.h2 h2Var = (androidx.fragment.app.h2) aVar.f11344a.get(i17);
                int i19 = i18 + 1;
                this.f11190d[i18] = h2Var.f11328a;
                java.util.ArrayList arrayList = this.f11191e;
                androidx.fragment.app.Fragment fragment = h2Var.f11329b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f11190d;
                int i27 = i19 + 1;
                iArr[i19] = h2Var.f11330c;
                int i28 = i27 + 1;
                iArr[i27] = h2Var.f11331d;
                int i29 = i28 + 1;
                iArr[i28] = h2Var.f11332e;
                iArr[i29] = h2Var.f11333f;
                this.f11192f[i17] = h2Var.f11334g.ordinal();
                this.f11193g[i17] = h2Var.f11335h.ordinal();
                i17++;
                i18 = i29 + 1;
            }
            this.f11194h = aVar.f11349f;
            this.f11195i = aVar.f11352i;
            this.f11196m = aVar.f11251t;
            this.f11197n = aVar.f11353j;
            this.f11198o = aVar.f11354k;
            this.f11199p = aVar.f11355l;
            this.f11200q = aVar.f11356m;
            this.f11201r = aVar.f11357n;
            this.f11202s = aVar.f11358o;
            this.f11203t = aVar.f11359p;
            return;
        }
        throw new java.lang.IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeIntArray(this.f11190d);
        parcel.writeStringList(this.f11191e);
        parcel.writeIntArray(this.f11192f);
        parcel.writeIntArray(this.f11193g);
        parcel.writeInt(this.f11194h);
        parcel.writeString(this.f11195i);
        parcel.writeInt(this.f11196m);
        parcel.writeInt(this.f11197n);
        android.text.TextUtils.writeToParcel(this.f11198o, parcel, 0);
        parcel.writeInt(this.f11199p);
        android.text.TextUtils.writeToParcel(this.f11200q, parcel, 0);
        parcel.writeStringList(this.f11201r);
        parcel.writeStringList(this.f11202s);
        parcel.writeInt(this.f11203t ? 1 : 0);
    }

    public BackStackState(android.os.Parcel parcel) {
        this.f11190d = parcel.createIntArray();
        this.f11191e = parcel.createStringArrayList();
        this.f11192f = parcel.createIntArray();
        this.f11193g = parcel.createIntArray();
        this.f11194h = parcel.readInt();
        this.f11195i = parcel.readString();
        this.f11196m = parcel.readInt();
        this.f11197n = parcel.readInt();
        this.f11198o = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f11199p = parcel.readInt();
        this.f11200q = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f11201r = parcel.createStringArrayList();
        this.f11202s = parcel.createStringArrayList();
        this.f11203t = parcel.readInt() != 0;
    }
}
