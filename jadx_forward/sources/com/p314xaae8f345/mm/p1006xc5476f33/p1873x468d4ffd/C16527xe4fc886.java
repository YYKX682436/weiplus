package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd;

/* renamed from: com.tencent.mm.plugin.mmsight.SightCaptureResult */
/* loaded from: classes10.dex */
public class C16527xe4fc886 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886> f37632x681a0c0c = new ai3.e();

    /* renamed from: d, reason: collision with root package name */
    public boolean f230339d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f230340e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f230341f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f230342g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f230343h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f230344i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230345m;

    /* renamed from: n, reason: collision with root package name */
    public final int f230346n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.vh4 f230347o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f230348p;

    /* renamed from: q, reason: collision with root package name */
    public r15.b f230349q;

    public C16527xe4fc886(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, r45.vh4 vh4Var) {
        this.f230339d = false;
        this.f230340e = false;
        this.f230341f = true;
        this.f230342g = "";
        this.f230343h = "";
        this.f230344i = "";
        this.f230345m = "";
        this.f230346n = 0;
        this.f230347o = new r45.vh4();
        this.f230348p = "";
        this.f230349q = null;
        this.f230341f = z17;
        this.f230342g = str;
        this.f230343h = str2;
        this.f230344i = str3;
        this.f230346n = i17;
        this.f230347o = vh4Var;
        this.f230345m = str4;
        this.f230339d = true;
        this.f230340e = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f230339d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f230340e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f230341f ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f230342g);
        parcel.writeString(this.f230343h);
        parcel.writeString(this.f230344i);
        parcel.writeString(this.f230345m);
        parcel.writeInt(this.f230346n);
        parcel.writeString(this.f230348p);
        try {
            byte[] mo14344x5f01b1f6 = this.f230347o.mo14344x5f01b1f6();
            parcel.writeInt(mo14344x5f01b1f6.length);
            parcel.writeByteArray(mo14344x5f01b1f6);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCaptureResult", "write ext info error");
        }
    }

    public C16527xe4fc886(boolean z17, java.lang.String str) {
        this.f230339d = false;
        this.f230340e = false;
        this.f230341f = true;
        this.f230342g = "";
        this.f230343h = "";
        this.f230344i = "";
        this.f230345m = "";
        this.f230346n = 0;
        this.f230347o = new r45.vh4();
        this.f230349q = null;
        this.f230341f = z17;
        this.f230348p = str;
        this.f230339d = false;
        this.f230340e = true;
    }

    public C16527xe4fc886(android.os.Parcel parcel) {
        this.f230339d = false;
        this.f230340e = false;
        this.f230341f = true;
        this.f230342g = "";
        this.f230343h = "";
        this.f230344i = "";
        this.f230345m = "";
        this.f230346n = 0;
        this.f230347o = new r45.vh4();
        this.f230348p = "";
        this.f230349q = null;
        this.f230339d = parcel.readByte() != 0;
        this.f230340e = parcel.readByte() != 0;
        this.f230341f = parcel.readByte() != 0;
        this.f230342g = parcel.readString();
        this.f230343h = parcel.readString();
        this.f230344i = parcel.readString();
        this.f230345m = parcel.readString();
        this.f230346n = parcel.readInt();
        this.f230348p = parcel.readString();
        try {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            r45.vh4 vh4Var = new r45.vh4();
            this.f230347o = vh4Var;
            vh4Var.mo11468x92b714fd(bArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCaptureResult", "read ext info error: %s", e17.getMessage());
        }
    }
}
