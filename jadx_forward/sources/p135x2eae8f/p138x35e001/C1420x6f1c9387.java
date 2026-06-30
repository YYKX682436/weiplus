package p135x2eae8f.p138x35e001;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/PixelSize;", "Lcoil/size/Size;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: coil.size.PixelSize */
/* loaded from: classes10.dex */
public final /* data */ class C1420x6f1c9387 extends p135x2eae8f.p138x35e001.AbstractC1421x275421 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p135x2eae8f.p138x35e001.C1420x6f1c9387> f4391x681a0c0c = new d6.c();

    /* renamed from: d, reason: collision with root package name */
    public final int f125445d;

    /* renamed from: e, reason: collision with root package name */
    public final int f125446e;

    public C1420x6f1c9387(int i17, int i18) {
        super(null);
        this.f125445d = i17;
        this.f125446e = i18;
        if (!(i17 > 0 && i18 > 0)) {
            throw new java.lang.IllegalArgumentException("width and height must be > 0.".toString());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m15441xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p135x2eae8f.p138x35e001.C1420x6f1c9387)) {
            return false;
        }
        p135x2eae8f.p138x35e001.C1420x6f1c9387 c1420x6f1c9387 = (p135x2eae8f.p138x35e001.C1420x6f1c9387) obj;
        return this.f125445d == c1420x6f1c9387.f125445d && this.f125446e == c1420x6f1c9387.f125446e;
    }

    /* renamed from: hashCode */
    public int m15442x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f125445d) * 31) + java.lang.Integer.hashCode(this.f125446e);
    }

    /* renamed from: toString */
    public java.lang.String m15443x9616526c() {
        return "PixelSize(width=" + this.f125445d + ", height=" + this.f125446e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f125445d);
        out.writeInt(this.f125446e);
    }
}
