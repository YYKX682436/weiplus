package com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.p2322xaf3f8342;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/config/BaseDownloadConfig;", "Landroid/os/Parcelable;", "CREATOR", "yn4/a", "plugin-updater_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.updater.xlabupdater.config.BaseDownloadConfig */
/* loaded from: classes15.dex */
public class C18783xd5307f3b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final yn4.a f38572x681a0c0c = new yn4.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f257052d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f257053e;

    public C18783xd5307f3b(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f257052d = "";
        this.f257053e = "";
        java.lang.String readString = parcel.readString();
        this.f257052d = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f257053e = readString2 != null ? readString2 : "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f257052d);
        parcel.writeString(this.f257053e);
    }
}
