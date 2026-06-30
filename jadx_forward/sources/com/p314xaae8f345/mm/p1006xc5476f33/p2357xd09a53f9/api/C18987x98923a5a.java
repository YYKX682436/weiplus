package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet/api/LuckyMoneyNewYearStateInfo;", "Landroid/os/Parcelable;", "CREATOR", "pr4/d", "wallet-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.wallet.api.LuckyMoneyNewYearStateInfo */
/* loaded from: classes9.dex */
public final class C18987x98923a5a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final pr4.d f38651x681a0c0c = new pr4.d(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f259088d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f259089e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f259090f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f259091g;

    /* renamed from: h, reason: collision with root package name */
    public long f259092h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f259093i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f259094m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f259095n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f259096o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f259097p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f259098q;

    /* renamed from: r, reason: collision with root package name */
    public final int f259099r;

    /* renamed from: s, reason: collision with root package name */
    public final int f259100s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f259101t;

    public C18987x98923a5a() {
        this.f259088d = "";
        this.f259089e = "";
        this.f259093i = "";
        this.f259094m = "";
        this.f259096o = "";
        this.f259097p = "";
        this.f259098q = "";
        this.f259101t = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f259088d);
        parcel.writeString(this.f259089e);
        parcel.writeByte(this.f259090f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f259091g ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f259092h);
        parcel.writeString(this.f259093i);
        parcel.writeString(this.f259094m);
        parcel.writeByte(this.f259095n ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f259096o);
        parcel.writeString(this.f259097p);
        parcel.writeString(this.f259098q);
        parcel.writeInt(this.f259099r);
        parcel.writeInt(this.f259100s);
        parcel.writeString(this.f259101t);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18987x98923a5a(android.os.Parcel parcel) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        this.f259088d = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f259089e = readString2 == null ? "" : readString2;
        this.f259090f = parcel.readByte() != 0;
        this.f259091g = parcel.readByte() != 0;
        this.f259092h = parcel.readLong();
        java.lang.String readString3 = parcel.readString();
        this.f259093i = readString3 == null ? "" : readString3;
        java.lang.String readString4 = parcel.readString();
        this.f259094m = readString4 == null ? "" : readString4;
        this.f259095n = parcel.readByte() != 0;
        java.lang.String readString5 = parcel.readString();
        this.f259096o = readString5 == null ? "" : readString5;
        java.lang.String readString6 = parcel.readString();
        this.f259097p = readString6 == null ? "" : readString6;
        java.lang.String readString7 = parcel.readString();
        this.f259098q = readString7 == null ? "" : readString7;
        this.f259099r = parcel.readInt();
        this.f259100s = parcel.readInt();
        java.lang.String readString8 = parcel.readString();
        this.f259101t = readString8 != null ? readString8 : "";
    }
}
