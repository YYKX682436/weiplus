package com.p314xaae8f345.mm.p965xc41bc71e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/ShowInfo;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.msgsubscription.ShowInfo */
/* loaded from: classes9.dex */
public final class C11156xefa3516b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p965xc41bc71e.C11156xefa3516b> f32576x681a0c0c = new d31.b();

    /* renamed from: d, reason: collision with root package name */
    public final int f153303d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f153304e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f153305f;

    public C11156xefa3516b(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f153303d = parcel.readInt();
        java.lang.String readString = parcel.readString();
        this.f153304e = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f153305f = readString2 != null ? readString2 : "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f153303d);
        parcel.writeString(this.f153304e);
        parcel.writeString(this.f153305f);
    }

    public C11156xefa3516b(int i17, java.lang.String title, java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f153303d = i17;
        this.f153304e = title;
        this.f153305f = content;
    }
}
