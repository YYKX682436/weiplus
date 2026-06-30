package com.tencent.mm.msgsubscription;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/SubscribeMsgRequestResult;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SubscribeMsgRequestResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.msgsubscription.SubscribeMsgRequestResult> CREATOR = new d31.d();
    public final boolean A;
    public final java.util.List B;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f71781d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f71782e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f71783f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71784g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f71785h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f71786i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f71787m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.msgsubscription.WordingInfo f71788n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f71789o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f71790p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f71791q;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f71792r;

    /* renamed from: s, reason: collision with root package name */
    public final int f71793s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.msgsubscription.ShowInfo f71794t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f71795u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f71796v;

    /* renamed from: w, reason: collision with root package name */
    public final int f71797w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f71798x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f71799y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f71800z;

    public SubscribeMsgRequestResult(boolean z17, java.lang.String appIconUrl, java.lang.String appName, int i17, java.util.ArrayList subscribeMsgItems, boolean z18, boolean z19, com.tencent.mm.msgsubscription.WordingInfo wordingInfo, boolean z27, boolean z28, boolean z29, byte[] buffer, int i18, com.tencent.mm.msgsubscription.ShowInfo showInfo, java.lang.String str, java.lang.String str2, int i19, java.lang.String wxaErrorMessage, boolean z37, java.lang.String extData, boolean z38, java.util.List notifySwitchList) {
        kotlin.jvm.internal.o.g(appIconUrl, "appIconUrl");
        kotlin.jvm.internal.o.g(appName, "appName");
        kotlin.jvm.internal.o.g(subscribeMsgItems, "subscribeMsgItems");
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(wxaErrorMessage, "wxaErrorMessage");
        kotlin.jvm.internal.o.g(extData, "extData");
        kotlin.jvm.internal.o.g(notifySwitchList, "notifySwitchList");
        this.f71781d = z17;
        this.f71782e = appIconUrl;
        this.f71783f = appName;
        this.f71784g = i17;
        this.f71785h = subscribeMsgItems;
        this.f71786i = z18;
        this.f71787m = z19;
        this.f71788n = wordingInfo;
        this.f71789o = z27;
        this.f71790p = z28;
        this.f71791q = z29;
        this.f71792r = buffer;
        this.f71793s = i18;
        this.f71794t = showInfo;
        this.f71795u = str;
        this.f71796v = str2;
        this.f71797w = i19;
        this.f71798x = wxaErrorMessage;
        this.f71799y = z37;
        this.f71800z = extData;
        this.A = z38;
        this.B = notifySwitchList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SubscribeMsgRequestResult(alwaysChosenStatus=");
        sb6.append(this.f71781d);
        sb6.append(", appIconUrl='");
        sb6.append(this.f71782e);
        sb6.append("', appName='");
        sb6.append(this.f71783f);
        sb6.append("', cacheMaxSize=");
        sb6.append(this.f71784g);
        sb6.append(", subscribeMsgItems=");
        sb6.append(this.f71785h);
        sb6.append(", notShowAlways=");
        sb6.append(this.f71786i);
        sb6.append(", notShowReject=");
        sb6.append(this.f71787m);
        sb6.append(", wordingInfo=");
        sb6.append(this.f71788n);
        sb6.append(", isOpened=");
        sb6.append(this.f71789o);
        sb6.append(", showEntry=");
        sb6.append(this.f71790p);
        sb6.append(", buffer=");
        java.lang.String arrays = java.util.Arrays.toString(this.f71792r);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", showStyle=");
        sb6.append(this.f71793s);
        sb6.append(", showInfo=");
        sb6.append(this.f71794t);
        sb6.append(", mainDescription=");
        sb6.append(this.f71795u);
        sb6.append(", subDescription=");
        sb6.append(this.f71796v);
        sb6.append(", wxaErrorCode=");
        sb6.append(this.f71797w);
        sb6.append(", wxaErrorMessage='");
        sb6.append(this.f71798x);
        sb6.append("', wxaUserCancel=");
        sb6.append(this.f71799y);
        sb6.append(", extData='");
        sb6.append(this.f71800z);
        sb6.append("')");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeByte(this.f71781d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f71782e);
        parcel.writeString(this.f71783f);
        parcel.writeInt(this.f71784g);
        parcel.writeParcelable(this.f71788n, i17);
        parcel.writeList(this.f71785h);
        parcel.writeByte(this.f71786i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71789o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71790p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71791q ? (byte) 1 : (byte) 0);
        byte[] bArr = this.f71792r;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeInt(this.f71793s);
        parcel.writeParcelable(this.f71794t, i17);
        java.lang.String str = this.f71795u;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f71796v;
        parcel.writeString(str2 != null ? str2 : "");
        parcel.writeInt(this.f71797w);
        parcel.writeString(this.f71798x);
        parcel.writeByte(this.f71799y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71787m ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f71800z);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeList(this.B);
    }

    public SubscribeMsgRequestResult(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f71781d = parcel.readByte() != 0;
        java.lang.String readString = parcel.readString();
        this.f71782e = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f71783f = readString2 == null ? "" : readString2;
        this.f71784g = parcel.readInt();
        this.f71788n = (com.tencent.mm.msgsubscription.WordingInfo) parcel.readParcelable(com.tencent.mm.msgsubscription.WordingInfo.class.getClassLoader());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readList(arrayList, com.tencent.mm.msgsubscription.SubscribeMsgTmpItem.class.getClassLoader());
        this.f71785h = arrayList;
        this.f71786i = parcel.readByte() != 0;
        this.f71789o = parcel.readByte() != 0;
        this.f71790p = parcel.readByte() != 0;
        this.f71791q = parcel.readByte() != 0;
        byte[] bArr = new byte[parcel.readInt()];
        this.f71792r = bArr;
        parcel.readByteArray(bArr);
        this.f71793s = parcel.readInt();
        this.f71794t = (com.tencent.mm.msgsubscription.ShowInfo) parcel.readParcelable(com.tencent.mm.msgsubscription.ShowInfo.class.getClassLoader());
        java.lang.String readString3 = parcel.readString();
        this.f71795u = readString3 == null ? "" : readString3;
        java.lang.String readString4 = parcel.readString();
        this.f71796v = readString4 == null ? "" : readString4;
        this.f71797w = parcel.readInt();
        java.lang.String readString5 = parcel.readString();
        this.f71798x = readString5 == null ? "" : readString5;
        this.f71799y = parcel.readByte() != 0;
        this.f71787m = parcel.readByte() != 0;
        java.lang.String readString6 = parcel.readString();
        this.f71800z = readString6 != null ? readString6 : "";
        if (parcel.dataAvail() > 0) {
            this.A = parcel.readByte() != 0;
        } else {
            this.A = false;
        }
        if (parcel.dataAvail() > 0) {
            java.util.List arrayList2 = new java.util.ArrayList();
            parcel.readList(arrayList2, com.tencent.mm.msgsubscription.NotifySwitchItem.class.getClassLoader());
            this.B = arrayList2;
            return;
        }
        this.B = kz5.p0.f313996d;
    }
}
