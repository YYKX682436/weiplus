package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle */
/* loaded from: classes7.dex */
public class C12340xb447464a implements android.os.Parcelable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12340xb447464a> f35055x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j3();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f165939d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f165940e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f165941f;

    /* renamed from: g, reason: collision with root package name */
    public long f165942g;

    /* renamed from: h, reason: collision with root package name */
    public long f165943h;

    /* renamed from: i, reason: collision with root package name */
    public long f165944i;

    /* renamed from: m, reason: collision with root package name */
    public long f165945m;

    /* renamed from: n, reason: collision with root package name */
    public long f165946n;

    /* renamed from: o, reason: collision with root package name */
    public long f165947o;

    /* renamed from: p, reason: collision with root package name */
    public long f165948p;

    /* renamed from: q, reason: collision with root package name */
    public long f165949q;

    /* renamed from: r, reason: collision with root package name */
    public long f165950r;

    /* renamed from: s, reason: collision with root package name */
    public long f165951s;

    /* renamed from: t, reason: collision with root package name */
    public int f165952t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f165953u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f165954v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f165955w;

    public C12340xb447464a(java.lang.String str) {
        this.f165939d = str;
        this.f165940e = new java.util.LinkedList();
        this.f165941f = new java.util.LinkedList();
    }

    public boolean a() {
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8> list = this.f165941f;
        if (list == null) {
            return false;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8 c12565x722467e8 : list) {
            if (c12565x722467e8 != null) {
                if (c12565x722467e8.f169572t > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f165939d);
        java.util.List list = this.f165940e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7109x6e55a777) it.next()).m());
            }
        }
        parcel.writeTypedList(this.f165941f);
        parcel.writeByte(this.f165953u ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f165942g);
        parcel.writeLong(this.f165943h);
        parcel.writeLong(this.f165944i);
        parcel.writeLong(this.f165945m);
        parcel.writeLong(this.f165946n);
        parcel.writeLong(this.f165947o);
        parcel.writeByte(this.f165954v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f165955w ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f165948p);
        parcel.writeLong(this.f165949q);
        parcel.writeInt(this.f165952t);
    }

    public C12340xb447464a(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j3 j3Var) {
        this.f165939d = parcel.readString();
        this.f165940e = new java.util.LinkedList();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            for (int i17 = 0; i17 < readInt; i17++) {
                ((java.util.LinkedList) this.f165940e).add(new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7109x6e55a777(parcel.readString()));
            }
        }
        this.f165941f = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12565x722467e8.f35156x681a0c0c);
        this.f165953u = parcel.readByte() > 0;
        this.f165942g = parcel.readLong();
        this.f165943h = parcel.readLong();
        this.f165944i = parcel.readLong();
        this.f165945m = parcel.readLong();
        this.f165946n = parcel.readLong();
        this.f165947o = parcel.readLong();
        this.f165954v = parcel.readByte() > 0;
        this.f165955w = parcel.readByte() > 0;
        this.f165948p = parcel.readLong();
        this.f165949q = parcel.readLong();
        this.f165952t = parcel.readInt();
    }
}
