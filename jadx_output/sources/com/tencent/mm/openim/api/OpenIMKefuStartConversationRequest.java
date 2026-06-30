package com.tencent.mm.openim.api;

/* loaded from: classes8.dex */
public class OpenIMKefuStartConversationRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest> CREATOR = new j41.k0();

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f72272d;

    /* renamed from: e, reason: collision with root package name */
    public long f72273e;

    /* renamed from: f, reason: collision with root package name */
    public int f72274f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f72275g;

    /* renamed from: h, reason: collision with root package name */
    public int f72276h;

    /* renamed from: i, reason: collision with root package name */
    public r45.s4 f72277i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f72278m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.ResultReceiver f72279n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.ResultReceiver f72280o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f72281p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f72282q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f72283r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f72284s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f72285t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f72286u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f72287v;

    /* renamed from: w, reason: collision with root package name */
    public android.content.Intent f72288w;

    /* renamed from: x, reason: collision with root package name */
    public final android.content.Intent f72289x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f72290y;

    public OpenIMKefuStartConversationRequest() {
        this.f72272d = null;
        this.f72273e = 0L;
        this.f72275g = false;
        this.f72278m = false;
        this.f72281p = false;
        this.f72282q = "";
        this.f72287v = true;
        this.f72289x = new android.content.Intent();
        this.f72290y = "";
        this.f72276h = 2;
        this.f72283r = false;
        this.f72284s = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = java.lang.Integer.valueOf(this.f72274f);
        objArr[1] = java.lang.Boolean.valueOf(this.f72275g);
        r45.s4 s4Var = this.f72277i;
        objArr[2] = s4Var != null ? s4Var.f385486d : "null";
        objArr[3] = java.lang.Integer.valueOf(this.f72276h);
        objArr[4] = java.lang.Boolean.valueOf(this.f72283r);
        objArr[5] = java.lang.Boolean.valueOf(this.f72284s);
        r45.s4 s4Var2 = this.f72277i;
        objArr[6] = s4Var2 != null ? s4Var2.f385490h : "null";
        objArr[7] = java.lang.Boolean.valueOf(this.f72287v);
        objArr[8] = java.lang.Boolean.valueOf(this.f72278m);
        objArr[9] = java.lang.Boolean.valueOf(this.f72279n != null);
        objArr[10] = java.lang.Boolean.valueOf(this.f72280o != null);
        return java.lang.String.format("OpenIMKefuStartConversationRequest {getContactScene: %s, skipAppBrandBindStateCheck: %b, url: %s, uiMode: %s, needConversationList: %s, needChattingAnim: %s, username: %s, needUpdateTicket: %s, isStartingHalfActivity: %s receiver:%s halfScreenActionObserver:%s}", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f72273e);
        parcel.writeInt(this.f72274f);
        parcel.writeByte(this.f72275g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f72276h);
        parcel.writeByte(this.f72281p ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f72282q);
        parcel.writeByte(this.f72283r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f72284s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f72287v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f72285t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f72286u ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f72289x, i17);
        parcel.writeString(this.f72290y);
        try {
            r45.s4 s4Var = this.f72277i;
            if (s4Var != null) {
                byte[] byteArray = s4Var.toByteArray();
                if (byteArray != null) {
                    parcel.writeInt(byteArray.length);
                    parcel.writeByteArray(byteArray);
                } else {
                    parcel.writeInt(0);
                    parcel.writeByteArray(new byte[0]);
                }
            } else {
                parcel.writeInt(0);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("", e17, "OpenIMKefuStartConversationRequest writeToParcel exception", new java.lang.Object[0]);
        }
        parcel.writeByte(this.f72278m ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f72279n, i17);
        parcel.writeParcelable(this.f72280o, i17);
    }

    public OpenIMKefuStartConversationRequest(android.os.Parcel parcel, j41.k0 k0Var) {
        this.f72272d = null;
        this.f72273e = 0L;
        this.f72275g = false;
        this.f72278m = false;
        this.f72281p = false;
        this.f72282q = "";
        this.f72287v = true;
        this.f72289x = new android.content.Intent();
        this.f72290y = "";
        this.f72273e = parcel.readLong();
        this.f72274f = parcel.readInt();
        this.f72275g = parcel.readByte() != 0;
        this.f72276h = parcel.readInt();
        this.f72281p = parcel.readByte() != 0;
        this.f72282q = parcel.readString();
        this.f72283r = parcel.readByte() != 0;
        this.f72284s = parcel.readByte() != 0;
        this.f72287v = parcel.readByte() != 0;
        this.f72285t = parcel.readByte() != 0;
        this.f72286u = parcel.readByte() != 0;
        this.f72289x = (android.content.Intent) parcel.readParcelable(com.tencent.mm.openim.model.IOpenIMKefuConfirmController$ConfirmResultReceiver.class.getClassLoader());
        this.f72290y = parcel.readString();
        try {
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                r45.s4 s4Var = new r45.s4();
                this.f72277i = s4Var;
                s4Var.parseFrom(bArr);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("", e17, "OpenIMKefuStartConversationRequest parse exception", new java.lang.Object[0]);
        }
        this.f72278m = parcel.readByte() != 0;
        this.f72279n = (android.os.ResultReceiver) parcel.readParcelable(getClass().getClassLoader());
        this.f72280o = (android.os.ResultReceiver) parcel.readParcelable(getClass().getClassLoader());
    }
}
