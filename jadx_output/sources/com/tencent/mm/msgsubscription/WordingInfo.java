package com.tencent.mm.msgsubscription;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/WordingInfo;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class WordingInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.msgsubscription.WordingInfo> CREATOR = new d31.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f71821d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f71822e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f71823f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f71824g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f71825h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f71826i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f71827m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f71828n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f71829o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f71830p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f71831q;

    public WordingInfo(java.lang.String PopupTitle, java.lang.String PopupAllow, java.lang.String PopupCancel, java.lang.String PopupBottom, java.lang.String ExampleTitle, java.lang.String AlwaysReject, java.lang.String PopupDesc, java.lang.String SendWording, java.lang.String MultiRemind, java.lang.String WxaMultiRemind, java.lang.String SendBelowMsg) {
        kotlin.jvm.internal.o.g(PopupTitle, "PopupTitle");
        kotlin.jvm.internal.o.g(PopupAllow, "PopupAllow");
        kotlin.jvm.internal.o.g(PopupCancel, "PopupCancel");
        kotlin.jvm.internal.o.g(PopupBottom, "PopupBottom");
        kotlin.jvm.internal.o.g(ExampleTitle, "ExampleTitle");
        kotlin.jvm.internal.o.g(AlwaysReject, "AlwaysReject");
        kotlin.jvm.internal.o.g(PopupDesc, "PopupDesc");
        kotlin.jvm.internal.o.g(SendWording, "SendWording");
        kotlin.jvm.internal.o.g(MultiRemind, "MultiRemind");
        kotlin.jvm.internal.o.g(WxaMultiRemind, "WxaMultiRemind");
        kotlin.jvm.internal.o.g(SendBelowMsg, "SendBelowMsg");
        this.f71821d = PopupTitle;
        this.f71822e = PopupAllow;
        this.f71823f = PopupCancel;
        this.f71824g = PopupBottom;
        this.f71825h = ExampleTitle;
        this.f71826i = AlwaysReject;
        this.f71827m = PopupDesc;
        this.f71828n = SendWording;
        this.f71829o = MultiRemind;
        this.f71830p = WxaMultiRemind;
        this.f71831q = SendBelowMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "WordingInfo(PopupTitle='" + this.f71821d + "', PopupAllow='" + this.f71822e + "', PopupCancel='" + this.f71823f + "', PopupBottom='" + this.f71824g + "', ExampleTitle='" + this.f71825h + "', AlwaysReject='" + this.f71826i + "', PopupDesc='" + this.f71827m + "', SendWording='" + this.f71828n + "', MultiRemind='" + this.f71829o + "', WxaMultiRemind='" + this.f71830p + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f71821d);
        parcel.writeString(this.f71822e);
        parcel.writeString(this.f71823f);
        parcel.writeString(this.f71824g);
        parcel.writeString(this.f71825h);
        parcel.writeString(this.f71826i);
        parcel.writeString(this.f71827m);
        parcel.writeString(this.f71828n);
        parcel.writeString(this.f71829o);
        parcel.writeString(this.f71830p);
        parcel.writeString(this.f71831q);
    }

    public WordingInfo(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        this.f71821d = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f71822e = readString2 == null ? "" : readString2;
        java.lang.String readString3 = parcel.readString();
        this.f71823f = readString3 == null ? "" : readString3;
        java.lang.String readString4 = parcel.readString();
        this.f71824g = readString4 == null ? "" : readString4;
        java.lang.String readString5 = parcel.readString();
        this.f71825h = readString5 == null ? "" : readString5;
        java.lang.String readString6 = parcel.readString();
        this.f71826i = readString6 == null ? "" : readString6;
        java.lang.String readString7 = parcel.readString();
        this.f71827m = readString7 == null ? "" : readString7;
        java.lang.String readString8 = parcel.readString();
        this.f71828n = readString8 == null ? "" : readString8;
        java.lang.String readString9 = parcel.readString();
        this.f71829o = readString9 == null ? "" : readString9;
        java.lang.String readString10 = parcel.readString();
        this.f71830p = readString10 == null ? "" : readString10;
        java.lang.String readString11 = parcel.readString();
        this.f71831q = readString11 != null ? readString11 : "";
    }
}
