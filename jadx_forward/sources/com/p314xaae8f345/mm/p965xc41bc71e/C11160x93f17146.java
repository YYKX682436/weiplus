package com.p314xaae8f345.mm.p965xc41bc71e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/WordingInfo;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.msgsubscription.WordingInfo */
/* loaded from: classes9.dex */
public final class C11160x93f17146 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p965xc41bc71e.C11160x93f17146> f32581x681a0c0c = new d31.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f153354d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f153355e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f153356f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f153357g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f153358h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f153359i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f153360m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f153361n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f153362o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f153363p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f153364q;

    public C11160x93f17146(java.lang.String PopupTitle, java.lang.String PopupAllow, java.lang.String PopupCancel, java.lang.String PopupBottom, java.lang.String ExampleTitle, java.lang.String AlwaysReject, java.lang.String PopupDesc, java.lang.String SendWording, java.lang.String MultiRemind, java.lang.String WxaMultiRemind, java.lang.String SendBelowMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(PopupTitle, "PopupTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(PopupAllow, "PopupAllow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(PopupCancel, "PopupCancel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(PopupBottom, "PopupBottom");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ExampleTitle, "ExampleTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(AlwaysReject, "AlwaysReject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(PopupDesc, "PopupDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(SendWording, "SendWording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(MultiRemind, "MultiRemind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(WxaMultiRemind, "WxaMultiRemind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(SendBelowMsg, "SendBelowMsg");
        this.f153354d = PopupTitle;
        this.f153355e = PopupAllow;
        this.f153356f = PopupCancel;
        this.f153357g = PopupBottom;
        this.f153358h = ExampleTitle;
        this.f153359i = AlwaysReject;
        this.f153360m = PopupDesc;
        this.f153361n = SendWording;
        this.f153362o = MultiRemind;
        this.f153363p = WxaMultiRemind;
        this.f153364q = SendBelowMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48319x9616526c() {
        return "WordingInfo(PopupTitle='" + this.f153354d + "', PopupAllow='" + this.f153355e + "', PopupCancel='" + this.f153356f + "', PopupBottom='" + this.f153357g + "', ExampleTitle='" + this.f153358h + "', AlwaysReject='" + this.f153359i + "', PopupDesc='" + this.f153360m + "', SendWording='" + this.f153361n + "', MultiRemind='" + this.f153362o + "', WxaMultiRemind='" + this.f153363p + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f153354d);
        parcel.writeString(this.f153355e);
        parcel.writeString(this.f153356f);
        parcel.writeString(this.f153357g);
        parcel.writeString(this.f153358h);
        parcel.writeString(this.f153359i);
        parcel.writeString(this.f153360m);
        parcel.writeString(this.f153361n);
        parcel.writeString(this.f153362o);
        parcel.writeString(this.f153363p);
        parcel.writeString(this.f153364q);
    }

    public C11160x93f17146(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        this.f153354d = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f153355e = readString2 == null ? "" : readString2;
        java.lang.String readString3 = parcel.readString();
        this.f153356f = readString3 == null ? "" : readString3;
        java.lang.String readString4 = parcel.readString();
        this.f153357g = readString4 == null ? "" : readString4;
        java.lang.String readString5 = parcel.readString();
        this.f153358h = readString5 == null ? "" : readString5;
        java.lang.String readString6 = parcel.readString();
        this.f153359i = readString6 == null ? "" : readString6;
        java.lang.String readString7 = parcel.readString();
        this.f153360m = readString7 == null ? "" : readString7;
        java.lang.String readString8 = parcel.readString();
        this.f153361n = readString8 == null ? "" : readString8;
        java.lang.String readString9 = parcel.readString();
        this.f153362o = readString9 == null ? "" : readString9;
        java.lang.String readString10 = parcel.readString();
        this.f153363p = readString10 == null ? "" : readString10;
        java.lang.String readString11 = parcel.readString();
        this.f153364q = readString11 != null ? readString11 : "";
    }
}
