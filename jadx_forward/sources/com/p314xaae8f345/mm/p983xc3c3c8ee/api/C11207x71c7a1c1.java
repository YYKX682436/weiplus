package com.p314xaae8f345.mm.p983xc3c3c8ee.api;

/* renamed from: com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest */
/* loaded from: classes8.dex */
public class C11207x71c7a1c1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1> f32695x681a0c0c = new j41.k0();

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f153805d;

    /* renamed from: e, reason: collision with root package name */
    public long f153806e;

    /* renamed from: f, reason: collision with root package name */
    public int f153807f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f153808g;

    /* renamed from: h, reason: collision with root package name */
    public int f153809h;

    /* renamed from: i, reason: collision with root package name */
    public r45.s4 f153810i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f153811m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.ResultReceiver f153812n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.ResultReceiver f153813o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f153814p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f153815q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f153816r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f153817s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f153818t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f153819u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f153820v;

    /* renamed from: w, reason: collision with root package name */
    public android.content.Intent f153821w;

    /* renamed from: x, reason: collision with root package name */
    public final android.content.Intent f153822x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f153823y;

    public C11207x71c7a1c1() {
        this.f153805d = null;
        this.f153806e = 0L;
        this.f153808g = false;
        this.f153811m = false;
        this.f153814p = false;
        this.f153815q = "";
        this.f153820v = true;
        this.f153822x = new android.content.Intent();
        this.f153823y = "";
        this.f153809h = 2;
        this.f153816r = false;
        this.f153817s = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48380x9616526c() {
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = java.lang.Integer.valueOf(this.f153807f);
        objArr[1] = java.lang.Boolean.valueOf(this.f153808g);
        r45.s4 s4Var = this.f153810i;
        objArr[2] = s4Var != null ? s4Var.f467019d : "null";
        objArr[3] = java.lang.Integer.valueOf(this.f153809h);
        objArr[4] = java.lang.Boolean.valueOf(this.f153816r);
        objArr[5] = java.lang.Boolean.valueOf(this.f153817s);
        r45.s4 s4Var2 = this.f153810i;
        objArr[6] = s4Var2 != null ? s4Var2.f467023h : "null";
        objArr[7] = java.lang.Boolean.valueOf(this.f153820v);
        objArr[8] = java.lang.Boolean.valueOf(this.f153811m);
        objArr[9] = java.lang.Boolean.valueOf(this.f153812n != null);
        objArr[10] = java.lang.Boolean.valueOf(this.f153813o != null);
        return java.lang.String.format("OpenIMKefuStartConversationRequest {getContactScene: %s, skipAppBrandBindStateCheck: %b, url: %s, uiMode: %s, needConversationList: %s, needChattingAnim: %s, username: %s, needUpdateTicket: %s, isStartingHalfActivity: %s receiver:%s halfScreenActionObserver:%s}", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f153806e);
        parcel.writeInt(this.f153807f);
        parcel.writeByte(this.f153808g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f153809h);
        parcel.writeByte(this.f153814p ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f153815q);
        parcel.writeByte(this.f153816r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f153817s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f153820v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f153818t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f153819u ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f153822x, i17);
        parcel.writeString(this.f153823y);
        try {
            r45.s4 s4Var = this.f153810i;
            if (s4Var != null) {
                byte[] mo14344x5f01b1f6 = s4Var.mo14344x5f01b1f6();
                if (mo14344x5f01b1f6 != null) {
                    parcel.writeInt(mo14344x5f01b1f6.length);
                    parcel.writeByteArray(mo14344x5f01b1f6);
                } else {
                    parcel.writeInt(0);
                    parcel.writeByteArray(new byte[0]);
                }
            } else {
                parcel.writeInt(0);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("", e17, "OpenIMKefuStartConversationRequest writeToParcel exception", new java.lang.Object[0]);
        }
        parcel.writeByte(this.f153811m ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f153812n, i17);
        parcel.writeParcelable(this.f153813o, i17);
    }

    public C11207x71c7a1c1(android.os.Parcel parcel, j41.k0 k0Var) {
        this.f153805d = null;
        this.f153806e = 0L;
        this.f153808g = false;
        this.f153811m = false;
        this.f153814p = false;
        this.f153815q = "";
        this.f153820v = true;
        this.f153822x = new android.content.Intent();
        this.f153823y = "";
        this.f153806e = parcel.readLong();
        this.f153807f = parcel.readInt();
        this.f153808g = parcel.readByte() != 0;
        this.f153809h = parcel.readInt();
        this.f153814p = parcel.readByte() != 0;
        this.f153815q = parcel.readString();
        this.f153816r = parcel.readByte() != 0;
        this.f153817s = parcel.readByte() != 0;
        this.f153820v = parcel.readByte() != 0;
        this.f153818t = parcel.readByte() != 0;
        this.f153819u = parcel.readByte() != 0;
        this.f153822x = (android.content.Intent) parcel.readParcelable(com.p314xaae8f345.mm.p983xc3c3c8ee.p984x633fb29.AbstractResultReceiverC11208x45ee14c4.class.getClassLoader());
        this.f153823y = parcel.readString();
        try {
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                r45.s4 s4Var = new r45.s4();
                this.f153810i = s4Var;
                s4Var.mo11468x92b714fd(bArr);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("", e17, "OpenIMKefuStartConversationRequest parse exception", new java.lang.Object[0]);
        }
        this.f153811m = parcel.readByte() != 0;
        this.f153812n = (android.os.ResultReceiver) parcel.readParcelable(getClass().getClassLoader());
        this.f153813o = (android.os.ResultReceiver) parcel.readParcelable(getClass().getClassLoader());
    }
}
