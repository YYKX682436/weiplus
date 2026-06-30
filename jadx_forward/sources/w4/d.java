package w4;

/* loaded from: classes13.dex */
public class d extends w4.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseIntArray f524367d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Parcel f524368e;

    /* renamed from: f, reason: collision with root package name */
    public final int f524369f;

    /* renamed from: g, reason: collision with root package name */
    public final int f524370g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f524371h;

    /* renamed from: i, reason: collision with root package name */
    public int f524372i;

    /* renamed from: j, reason: collision with root package name */
    public int f524373j;

    /* renamed from: k, reason: collision with root package name */
    public int f524374k;

    public d(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new x.b(), new x.b(), new x.b());
    }

    @Override // w4.c
    public w4.c a() {
        android.os.Parcel parcel = this.f524368e;
        int dataPosition = parcel.dataPosition();
        int i17 = this.f524373j;
        if (i17 == this.f524369f) {
            i17 = this.f524370g;
        }
        return new w4.d(parcel, dataPosition, i17, this.f524371h + "  ", this.f524364a, this.f524365b, this.f524366c);
    }

    @Override // w4.c
    public boolean e(int i17) {
        while (this.f524373j < this.f524370g) {
            int i18 = this.f524374k;
            if (i18 == i17) {
                return true;
            }
            if (java.lang.String.valueOf(i18).compareTo(java.lang.String.valueOf(i17)) > 0) {
                return false;
            }
            int i19 = this.f524373j;
            android.os.Parcel parcel = this.f524368e;
            parcel.setDataPosition(i19);
            int readInt = parcel.readInt();
            this.f524374k = parcel.readInt();
            this.f524373j += readInt;
        }
        return this.f524374k == i17;
    }

    @Override // w4.c
    public void i(int i17) {
        int i18 = this.f524372i;
        android.util.SparseIntArray sparseIntArray = this.f524367d;
        android.os.Parcel parcel = this.f524368e;
        if (i18 >= 0) {
            int i19 = sparseIntArray.get(i18);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i19);
            parcel.writeInt(dataPosition - i19);
            parcel.setDataPosition(dataPosition);
        }
        this.f524372i = i17;
        sparseIntArray.put(i17, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i17);
    }

    public d(android.os.Parcel parcel, int i17, int i18, java.lang.String str, x.b bVar, x.b bVar2, x.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f524367d = new android.util.SparseIntArray();
        this.f524372i = -1;
        this.f524374k = -1;
        this.f524368e = parcel;
        this.f524369f = i17;
        this.f524370g = i18;
        this.f524373j = i17;
        this.f524371h = str;
    }
}
