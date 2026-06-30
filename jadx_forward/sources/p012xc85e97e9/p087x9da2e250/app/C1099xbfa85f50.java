package p012xc85e97e9.p087x9da2e250.app;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.BackStackState */
/* loaded from: classes14.dex */
public final class C1099xbfa85f50 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p087x9da2e250.app.C1099xbfa85f50> f3375x681a0c0c = new p012xc85e97e9.p087x9da2e250.app.b();

    /* renamed from: d, reason: collision with root package name */
    public final int[] f92723d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f92724e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f92725f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f92726g;

    /* renamed from: h, reason: collision with root package name */
    public final int f92727h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f92728i;

    /* renamed from: m, reason: collision with root package name */
    public final int f92729m;

    /* renamed from: n, reason: collision with root package name */
    public final int f92730n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.CharSequence f92731o;

    /* renamed from: p, reason: collision with root package name */
    public final int f92732p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.CharSequence f92733q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f92734r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f92735s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f92736t;

    public C1099xbfa85f50(p012xc85e97e9.p087x9da2e250.app.a aVar) {
        int size = aVar.f92877a.size();
        this.f92723d = new int[size * 5];
        if (aVar.f92883g) {
            this.f92724e = new java.util.ArrayList(size);
            this.f92725f = new int[size];
            this.f92726g = new int[size];
            int i17 = 0;
            int i18 = 0;
            while (i17 < size) {
                p012xc85e97e9.p087x9da2e250.app.h2 h2Var = (p012xc85e97e9.p087x9da2e250.app.h2) aVar.f92877a.get(i17);
                int i19 = i18 + 1;
                this.f92723d[i18] = h2Var.f92861a;
                java.util.ArrayList arrayList = this.f92724e;
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = h2Var.f92862b;
                arrayList.add(componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.f3465x32e011 : null);
                int[] iArr = this.f92723d;
                int i27 = i19 + 1;
                iArr[i19] = h2Var.f92863c;
                int i28 = i27 + 1;
                iArr[i27] = h2Var.f92864d;
                int i29 = i28 + 1;
                iArr[i28] = h2Var.f92865e;
                iArr[i29] = h2Var.f92866f;
                this.f92725f[i17] = h2Var.f92867g.ordinal();
                this.f92726g[i17] = h2Var.f92868h.ordinal();
                i17++;
                i18 = i29 + 1;
            }
            this.f92727h = aVar.f92882f;
            this.f92728i = aVar.f92885i;
            this.f92729m = aVar.f92784t;
            this.f92730n = aVar.f92886j;
            this.f92731o = aVar.f92887k;
            this.f92732p = aVar.f92888l;
            this.f92733q = aVar.f92889m;
            this.f92734r = aVar.f92890n;
            this.f92735s = aVar.f92891o;
            this.f92736t = aVar.f92892p;
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
        parcel.writeIntArray(this.f92723d);
        parcel.writeStringList(this.f92724e);
        parcel.writeIntArray(this.f92725f);
        parcel.writeIntArray(this.f92726g);
        parcel.writeInt(this.f92727h);
        parcel.writeString(this.f92728i);
        parcel.writeInt(this.f92729m);
        parcel.writeInt(this.f92730n);
        android.text.TextUtils.writeToParcel(this.f92731o, parcel, 0);
        parcel.writeInt(this.f92732p);
        android.text.TextUtils.writeToParcel(this.f92733q, parcel, 0);
        parcel.writeStringList(this.f92734r);
        parcel.writeStringList(this.f92735s);
        parcel.writeInt(this.f92736t ? 1 : 0);
    }

    public C1099xbfa85f50(android.os.Parcel parcel) {
        this.f92723d = parcel.createIntArray();
        this.f92724e = parcel.createStringArrayList();
        this.f92725f = parcel.createIntArray();
        this.f92726g = parcel.createIntArray();
        this.f92727h = parcel.readInt();
        this.f92728i = parcel.readString();
        this.f92729m = parcel.readInt();
        this.f92730n = parcel.readInt();
        this.f92731o = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f92732p = parcel.readInt();
        this.f92733q = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f92734r = parcel.createStringArrayList();
        this.f92735s = parcel.createStringArrayList();
        this.f92736t = parcel.readInt() != 0;
    }
}
