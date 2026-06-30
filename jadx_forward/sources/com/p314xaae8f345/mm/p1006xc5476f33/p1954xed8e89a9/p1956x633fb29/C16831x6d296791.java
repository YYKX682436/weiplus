package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p1956x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/model/WxaRegisterInfo;", "Landroid/os/Parcelable;", "CREATOR", "dr3/a", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.model.WxaRegisterInfo */
/* loaded from: classes7.dex */
public final class C16831x6d296791 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final dr3.a f37747x681a0c0c = new dr3.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f235065d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f235066e;

    public C16831x6d296791(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        readString = readString == null ? "" : readString;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readTypedList(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d.f33603x681a0c0c);
        this.f235065d = readString;
        this.f235066e = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f235065d);
        parcel.writeTypedList(this.f235066e);
    }
}
