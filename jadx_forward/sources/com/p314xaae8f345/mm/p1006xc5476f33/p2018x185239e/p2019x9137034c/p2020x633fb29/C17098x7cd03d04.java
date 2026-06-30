package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel */
/* loaded from: classes9.dex */
public class C17098x7cd03d04 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17098x7cd03d04> f37797x681a0c0c = new pw3.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f237987d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f237988e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f237989f;

    /* renamed from: g, reason: collision with root package name */
    public final int f237990g;

    /* renamed from: h, reason: collision with root package name */
    public final int f237991h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f237992i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f237993m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f237994n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f237995o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f237996p;

    /* renamed from: q, reason: collision with root package name */
    public final long f237997q;

    public C17098x7cd03d04(r45.qd qdVar) {
        this.f237987d = qdVar.f465371d;
        this.f237988e = qdVar.f465372e;
        this.f237989f = qdVar.f465373f;
        this.f237990g = qdVar.f465374g;
        this.f237991h = qdVar.f465375h;
        this.f237992i = qdVar.f465377m;
        this.f237993m = qdVar.f465378n;
        this.f237994n = qdVar.f465379o;
        this.f237995o = new java.util.ArrayList();
        java.util.Iterator it = qdVar.f465376i.iterator();
        while (it.hasNext()) {
            this.f237995o.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17099x4fad1e0e((r45.dl0) it.next()));
        }
        this.f237996p = qdVar.f465381q;
        this.f237997q = qdVar.f465382r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f237987d);
        parcel.writeString(this.f237988e);
        parcel.writeString(this.f237989f);
        parcel.writeInt(this.f237990g);
        parcel.writeInt(this.f237991h);
        parcel.writeTypedList(this.f237995o);
        parcel.writeString(this.f237992i);
        parcel.writeString(this.f237993m);
        parcel.writeString(this.f237994n);
        parcel.writeString(this.f237996p);
        parcel.writeLong(this.f237997q);
    }

    public C17098x7cd03d04(android.os.Parcel parcel) {
        this.f237987d = parcel.readString();
        this.f237988e = parcel.readString();
        this.f237989f = parcel.readString();
        this.f237990g = parcel.readInt();
        this.f237991h = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f237995o = arrayList;
        parcel.readTypedList(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17099x4fad1e0e.f37798x681a0c0c);
        this.f237992i = parcel.readString();
        this.f237993m = parcel.readString();
        this.f237994n = parcel.readString();
        this.f237996p = parcel.readString();
        this.f237997q = parcel.readLong();
    }
}
