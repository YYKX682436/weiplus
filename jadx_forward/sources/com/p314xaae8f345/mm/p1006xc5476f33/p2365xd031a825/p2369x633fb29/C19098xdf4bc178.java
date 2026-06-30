package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.FavorPayInfo */
/* loaded from: classes9.dex */
public class C19098xdf4bc178 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178> f38678x681a0c0c = new at4.e0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f261200d;

    /* renamed from: e, reason: collision with root package name */
    public int f261201e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f261202f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f261203g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261204h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f261205i;

    public C19098xdf4bc178() {
        this.f261205i = new java.util.LinkedList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m73877x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(java.lang.String.format("FavorPayInfo %s isNeedBankPay %s needBankType %s defaultFavorCompId %s changeBankcardTips %s", this.f261200d, java.lang.Integer.valueOf(this.f261201e), this.f261202f, this.f261203g, this.f261204h));
        if (this.f261205i != null) {
            stringBuffer.append("bind_serial_list :");
            java.util.Iterator it = this.f261205i.iterator();
            while (it.hasNext()) {
                stringBuffer.append(((java.lang.String) it.next()) + ",");
            }
        }
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f261200d);
        parcel.writeInt(this.f261201e);
        parcel.writeString(this.f261202f);
        parcel.writeString(this.f261203g);
        parcel.writeString(this.f261204h);
        parcel.writeStringList(this.f261205i);
    }

    public C19098xdf4bc178(android.os.Parcel parcel) {
        this.f261205i = new java.util.LinkedList();
        this.f261200d = parcel.readString();
        this.f261201e = parcel.readInt();
        this.f261202f = parcel.readString();
        this.f261203g = parcel.readString();
        this.f261204h = parcel.readString();
        this.f261205i = parcel.createStringArrayList();
    }
}
