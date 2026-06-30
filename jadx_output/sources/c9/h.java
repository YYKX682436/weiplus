package c9;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f39715a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f39716b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f39717c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f39718d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39719e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f39720f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f39721g;

    /* renamed from: h, reason: collision with root package name */
    public final long f39722h;

    /* renamed from: i, reason: collision with root package name */
    public final int f39723i;

    /* renamed from: j, reason: collision with root package name */
    public final int f39724j;

    /* renamed from: k, reason: collision with root package name */
    public final int f39725k;

    public h(long j17, boolean z17, boolean z18, boolean z19, java.util.List list, long j18, boolean z27, long j19, int i17, int i18, int i19) {
        this.f39715a = j17;
        this.f39716b = z17;
        this.f39717c = z18;
        this.f39718d = z19;
        this.f39720f = java.util.Collections.unmodifiableList(list);
        this.f39719e = j18;
        this.f39721g = z27;
        this.f39722h = j19;
        this.f39723i = i17;
        this.f39724j = i18;
        this.f39725k = i19;
    }

    public h(android.os.Parcel parcel) {
        this.f39715a = parcel.readLong();
        this.f39716b = parcel.readByte() == 1;
        this.f39717c = parcel.readByte() == 1;
        this.f39718d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            arrayList.add(new c9.g(parcel.readInt(), parcel.readLong()));
        }
        this.f39720f = java.util.Collections.unmodifiableList(arrayList);
        this.f39719e = parcel.readLong();
        this.f39721g = parcel.readByte() == 1;
        this.f39722h = parcel.readLong();
        this.f39723i = parcel.readInt();
        this.f39724j = parcel.readInt();
        this.f39725k = parcel.readInt();
    }
}
