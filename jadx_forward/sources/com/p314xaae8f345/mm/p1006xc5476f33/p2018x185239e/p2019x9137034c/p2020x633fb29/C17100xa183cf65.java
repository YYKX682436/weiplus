package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel */
/* loaded from: classes9.dex */
public class C17100xa183cf65 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65> f37799x681a0c0c = new pw3.i();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f238003d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f238004e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f238005f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f238006g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f238007h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f238008i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f238009m;

    public C17100xa183cf65(r45.up6 up6Var) {
        this.f238003d = up6Var.f469086d;
        this.f238004e = up6Var.f469087e;
        this.f238005f = up6Var.f469088f;
        this.f238006g = up6Var.f469089g;
        this.f238007h = up6Var.f469090h;
        this.f238008i = up6Var.f469091i;
        this.f238009m = up6Var.f469092m;
    }

    public static java.util.ArrayList a(java.util.List list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65((r45.up6) it.next()));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f238003d);
        parcel.writeString(this.f238004e);
        parcel.writeString(this.f238005f);
        parcel.writeString(this.f238006g);
        parcel.writeString(this.f238007h);
        parcel.writeString(this.f238008i);
        parcel.writeString(this.f238009m);
    }

    public C17100xa183cf65(android.os.Parcel parcel) {
        this.f238003d = parcel.readString();
        this.f238004e = parcel.readString();
        this.f238005f = parcel.readString();
        this.f238006g = parcel.readString();
        this.f238007h = parcel.readString();
        this.f238008i = parcel.readString();
        this.f238009m = parcel.readString();
    }
}
