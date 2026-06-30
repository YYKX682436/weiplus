package com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi;

/* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel */
/* loaded from: classes9.dex */
public class C11336x34865b36 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11336x34865b36> f33355x681a0c0c = new i61.n();

    /* renamed from: d, reason: collision with root package name */
    public long f153948d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f153949e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f153950f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f153951g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f153952h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11337xe5190d0f f153953i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f153954m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11335xbe84dad5 f153955n;

    /* renamed from: o, reason: collision with root package name */
    public r45.tw4 f153956o;

    public C11336x34865b36() {
        this.f153950f = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48623x9616526c() {
        return "PfInfoParcel{amount=" + this.f153948d + ", receiver_username='" + this.f153949e + "', payer_list=" + this.f153950f + ", pic_url='" + this.f153951g + "', remark='" + this.f153952h + "', sessionid_list=" + this.f153953i + ", pic_sign='" + this.f153954m + "', operation_info=" + this.f153955n + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f153948d);
        parcel.writeString(this.f153949e);
        parcel.writeTypedList(this.f153950f);
        parcel.writeString(this.f153951g);
        parcel.writeString(this.f153952h);
        parcel.writeParcelable(this.f153953i, i17);
        parcel.writeString(this.f153954m);
        parcel.writeParcelable(this.f153955n, i17);
        r45.tw4 tw4Var = this.f153956o;
        if (tw4Var == null) {
            parcel.writeInt(0);
            return;
        }
        try {
            byte[] mo14344x5f01b1f6 = tw4Var.mo14344x5f01b1f6();
            parcel.writeInt(mo14344x5f01b1f6.length);
            parcel.writeByteArray(mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", e17, "", new java.lang.Object[0]);
        }
    }

    public C11336x34865b36(android.os.Parcel parcel) {
        this.f153950f = new java.util.ArrayList();
        this.f153948d = parcel.readLong();
        this.f153949e = parcel.readString();
        this.f153950f = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11334x8cc8d4b8.f33353x681a0c0c);
        this.f153951g = parcel.readString();
        this.f153952h = parcel.readString();
        this.f153953i = (com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11337xe5190d0f) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11337xe5190d0f.class.getClassLoader());
        this.f153954m = parcel.readString();
        this.f153955n = (com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11335xbe84dad5) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11335xbe84dad5.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            r45.tw4 tw4Var = new r45.tw4();
            try {
                tw4Var.mo11468x92b714fd(bArr);
                this.f153956o = tw4Var;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
