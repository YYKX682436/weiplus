package p012xc85e97e9.p087x9da2e250.app;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.FragmentManagerState */
/* loaded from: classes14.dex */
public final class C1106xcd68fb74 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p087x9da2e250.app.C1106xcd68fb74> f3519x681a0c0c = new p012xc85e97e9.p087x9da2e250.app.u1();

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f92748d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f92749e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.C1099xbfa85f50[] f92750f;

    /* renamed from: g, reason: collision with root package name */
    public int f92751g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f92752h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f92753i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f92754m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f92755n;

    public C1106xcd68fb74() {
        this.f92752h = null;
        this.f92753i = new java.util.ArrayList();
        this.f92754m = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedList(this.f92748d);
        parcel.writeStringList(this.f92749e);
        parcel.writeTypedArray(this.f92750f, i17);
        parcel.writeInt(this.f92751g);
        parcel.writeString(this.f92752h);
        parcel.writeStringList(this.f92753i);
        parcel.writeTypedList(this.f92754m);
        parcel.writeTypedList(this.f92755n);
    }

    public C1106xcd68fb74(android.os.Parcel parcel) {
        this.f92752h = null;
        this.f92753i = new java.util.ArrayList();
        this.f92754m = new java.util.ArrayList();
        this.f92748d = parcel.createTypedArrayList(p012xc85e97e9.p087x9da2e250.app.C1107xfbc51401.f3520x681a0c0c);
        this.f92749e = parcel.createStringArrayList();
        this.f92750f = (p012xc85e97e9.p087x9da2e250.app.C1099xbfa85f50[]) parcel.createTypedArray(p012xc85e97e9.p087x9da2e250.app.C1099xbfa85f50.f3375x681a0c0c);
        this.f92751g = parcel.readInt();
        this.f92752h = parcel.readString();
        this.f92753i = parcel.createStringArrayList();
        this.f92754m = parcel.createTypedArrayList(android.os.Bundle.CREATOR);
        this.f92755n = parcel.createTypedArrayList(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.LaunchedFragmentInfo.f3518x681a0c0c);
    }
}
