package com.p314xaae8f345.mm.p965xc41bc71e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/SubscribeMsgRequestResult;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgRequestResult */
/* loaded from: classes9.dex */
public final class C11158xe7d16ed5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5> f32579x681a0c0c = new d31.d();
    public final boolean A;
    public final java.util.List B;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f153314d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f153315e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f153316f;

    /* renamed from: g, reason: collision with root package name */
    public final int f153317g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f153318h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f153319i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f153320m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p965xc41bc71e.C11160x93f17146 f153321n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f153322o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f153323p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f153324q;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f153325r;

    /* renamed from: s, reason: collision with root package name */
    public final int f153326s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p965xc41bc71e.C11156xefa3516b f153327t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f153328u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f153329v;

    /* renamed from: w, reason: collision with root package name */
    public final int f153330w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f153331x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f153332y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f153333z;

    public C11158xe7d16ed5(boolean z17, java.lang.String appIconUrl, java.lang.String appName, int i17, java.util.ArrayList subscribeMsgItems, boolean z18, boolean z19, com.p314xaae8f345.mm.p965xc41bc71e.C11160x93f17146 c11160x93f17146, boolean z27, boolean z28, boolean z29, byte[] buffer, int i18, com.p314xaae8f345.mm.p965xc41bc71e.C11156xefa3516b c11156xefa3516b, java.lang.String str, java.lang.String str2, int i19, java.lang.String wxaErrorMessage, boolean z37, java.lang.String extData, boolean z38, java.util.List notifySwitchList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appIconUrl, "appIconUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appName, "appName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subscribeMsgItems, "subscribeMsgItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaErrorMessage, "wxaErrorMessage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extData, "extData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifySwitchList, "notifySwitchList");
        this.f153314d = z17;
        this.f153315e = appIconUrl;
        this.f153316f = appName;
        this.f153317g = i17;
        this.f153318h = subscribeMsgItems;
        this.f153319i = z18;
        this.f153320m = z19;
        this.f153321n = c11160x93f17146;
        this.f153322o = z27;
        this.f153323p = z28;
        this.f153324q = z29;
        this.f153325r = buffer;
        this.f153326s = i18;
        this.f153327t = c11156xefa3516b;
        this.f153328u = str;
        this.f153329v = str2;
        this.f153330w = i19;
        this.f153331x = wxaErrorMessage;
        this.f153332y = z37;
        this.f153333z = extData;
        this.A = z38;
        this.B = notifySwitchList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48315x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SubscribeMsgRequestResult(alwaysChosenStatus=");
        sb6.append(this.f153314d);
        sb6.append(", appIconUrl='");
        sb6.append(this.f153315e);
        sb6.append("', appName='");
        sb6.append(this.f153316f);
        sb6.append("', cacheMaxSize=");
        sb6.append(this.f153317g);
        sb6.append(", subscribeMsgItems=");
        sb6.append(this.f153318h);
        sb6.append(", notShowAlways=");
        sb6.append(this.f153319i);
        sb6.append(", notShowReject=");
        sb6.append(this.f153320m);
        sb6.append(", wordingInfo=");
        sb6.append(this.f153321n);
        sb6.append(", isOpened=");
        sb6.append(this.f153322o);
        sb6.append(", showEntry=");
        sb6.append(this.f153323p);
        sb6.append(", buffer=");
        java.lang.String arrays = java.util.Arrays.toString(this.f153325r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", showStyle=");
        sb6.append(this.f153326s);
        sb6.append(", showInfo=");
        sb6.append(this.f153327t);
        sb6.append(", mainDescription=");
        sb6.append(this.f153328u);
        sb6.append(", subDescription=");
        sb6.append(this.f153329v);
        sb6.append(", wxaErrorCode=");
        sb6.append(this.f153330w);
        sb6.append(", wxaErrorMessage='");
        sb6.append(this.f153331x);
        sb6.append("', wxaUserCancel=");
        sb6.append(this.f153332y);
        sb6.append(", extData='");
        sb6.append(this.f153333z);
        sb6.append("')");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeByte(this.f153314d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f153315e);
        parcel.writeString(this.f153316f);
        parcel.writeInt(this.f153317g);
        parcel.writeParcelable(this.f153321n, i17);
        parcel.writeList(this.f153318h);
        parcel.writeByte(this.f153319i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f153322o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f153323p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f153324q ? (byte) 1 : (byte) 0);
        byte[] bArr = this.f153325r;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeInt(this.f153326s);
        parcel.writeParcelable(this.f153327t, i17);
        java.lang.String str = this.f153328u;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f153329v;
        parcel.writeString(str2 != null ? str2 : "");
        parcel.writeInt(this.f153330w);
        parcel.writeString(this.f153331x);
        parcel.writeByte(this.f153332y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f153320m ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f153333z);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeList(this.B);
    }

    public C11158xe7d16ed5(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f153314d = parcel.readByte() != 0;
        java.lang.String readString = parcel.readString();
        this.f153315e = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f153316f = readString2 == null ? "" : readString2;
        this.f153317g = parcel.readInt();
        this.f153321n = (com.p314xaae8f345.mm.p965xc41bc71e.C11160x93f17146) parcel.readParcelable(com.p314xaae8f345.mm.p965xc41bc71e.C11160x93f17146.class.getClassLoader());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readList(arrayList, com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3.class.getClassLoader());
        this.f153318h = arrayList;
        this.f153319i = parcel.readByte() != 0;
        this.f153322o = parcel.readByte() != 0;
        this.f153323p = parcel.readByte() != 0;
        this.f153324q = parcel.readByte() != 0;
        byte[] bArr = new byte[parcel.readInt()];
        this.f153325r = bArr;
        parcel.readByteArray(bArr);
        this.f153326s = parcel.readInt();
        this.f153327t = (com.p314xaae8f345.mm.p965xc41bc71e.C11156xefa3516b) parcel.readParcelable(com.p314xaae8f345.mm.p965xc41bc71e.C11156xefa3516b.class.getClassLoader());
        java.lang.String readString3 = parcel.readString();
        this.f153328u = readString3 == null ? "" : readString3;
        java.lang.String readString4 = parcel.readString();
        this.f153329v = readString4 == null ? "" : readString4;
        this.f153330w = parcel.readInt();
        java.lang.String readString5 = parcel.readString();
        this.f153331x = readString5 == null ? "" : readString5;
        this.f153332y = parcel.readByte() != 0;
        this.f153320m = parcel.readByte() != 0;
        java.lang.String readString6 = parcel.readString();
        this.f153333z = readString6 != null ? readString6 : "";
        if (parcel.dataAvail() > 0) {
            this.A = parcel.readByte() != 0;
        } else {
            this.A = false;
        }
        if (parcel.dataAvail() > 0) {
            java.util.List arrayList2 = new java.util.ArrayList();
            parcel.readList(arrayList2, com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0.class.getClassLoader());
            this.B = arrayList2;
            return;
        }
        this.B = kz5.p0.f395529d;
    }
}
