package c9;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f121248a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f121249b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f121250c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f121251d;

    /* renamed from: e, reason: collision with root package name */
    public final long f121252e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f121253f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f121254g;

    /* renamed from: h, reason: collision with root package name */
    public final long f121255h;

    /* renamed from: i, reason: collision with root package name */
    public final int f121256i;

    /* renamed from: j, reason: collision with root package name */
    public final int f121257j;

    /* renamed from: k, reason: collision with root package name */
    public final int f121258k;

    public h(long j17, boolean z17, boolean z18, boolean z19, java.util.List list, long j18, boolean z27, long j19, int i17, int i18, int i19) {
        this.f121248a = j17;
        this.f121249b = z17;
        this.f121250c = z18;
        this.f121251d = z19;
        this.f121253f = java.util.Collections.unmodifiableList(list);
        this.f121252e = j18;
        this.f121254g = z27;
        this.f121255h = j19;
        this.f121256i = i17;
        this.f121257j = i18;
        this.f121258k = i19;
    }

    public h(android.os.Parcel parcel) {
        this.f121248a = parcel.readLong();
        this.f121249b = parcel.readByte() == 1;
        this.f121250c = parcel.readByte() == 1;
        this.f121251d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            arrayList.add(new c9.g(parcel.readInt(), parcel.readLong()));
        }
        this.f121253f = java.util.Collections.unmodifiableList(arrayList);
        this.f121252e = parcel.readLong();
        this.f121254g = parcel.readByte() == 1;
        this.f121255h = parcel.readLong();
        this.f121256i = parcel.readInt();
        this.f121257j = parcel.readInt();
        this.f121258k = parcel.readInt();
    }
}
