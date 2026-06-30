package com.tencent.mm.plugin.aa.model.cgi;

/* loaded from: classes9.dex */
public class NetSceneNewAAQueryPFInfo$PfInfoParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel> CREATOR = new i61.n();

    /* renamed from: d, reason: collision with root package name */
    public long f72415d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f72416e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f72417f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f72418g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f72419h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel f72420i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f72421m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AAOperationInfoParcel f72422n;

    /* renamed from: o, reason: collision with root package name */
    public r45.tw4 f72423o;

    public NetSceneNewAAQueryPFInfo$PfInfoParcel() {
        this.f72417f = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "PfInfoParcel{amount=" + this.f72415d + ", receiver_username='" + this.f72416e + "', payer_list=" + this.f72417f + ", pic_url='" + this.f72418g + "', remark='" + this.f72419h + "', sessionid_list=" + this.f72420i + ", pic_sign='" + this.f72421m + "', operation_info=" + this.f72422n + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f72415d);
        parcel.writeString(this.f72416e);
        parcel.writeTypedList(this.f72417f);
        parcel.writeString(this.f72418g);
        parcel.writeString(this.f72419h);
        parcel.writeParcelable(this.f72420i, i17);
        parcel.writeString(this.f72421m);
        parcel.writeParcelable(this.f72422n, i17);
        r45.tw4 tw4Var = this.f72423o;
        if (tw4Var == null) {
            parcel.writeInt(0);
            return;
        }
        try {
            byte[] byteArray = tw4Var.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray, 0, byteArray.length);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", e17, "", new java.lang.Object[0]);
        }
    }

    public NetSceneNewAAQueryPFInfo$PfInfoParcel(android.os.Parcel parcel) {
        this.f72417f = new java.util.ArrayList();
        this.f72415d = parcel.readLong();
        this.f72416e = parcel.readString();
        this.f72417f = parcel.createTypedArrayList(com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AALaunchItemParcel.CREATOR);
        this.f72418g = parcel.readString();
        this.f72419h = parcel.readString();
        this.f72420i = (com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel) parcel.readParcelable(com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel.class.getClassLoader());
        this.f72421m = parcel.readString();
        this.f72422n = (com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AAOperationInfoParcel) parcel.readParcelable(com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AAOperationInfoParcel.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            r45.tw4 tw4Var = new r45.tw4();
            try {
                tw4Var.parseFrom(bArr);
                this.f72423o = tw4Var;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
