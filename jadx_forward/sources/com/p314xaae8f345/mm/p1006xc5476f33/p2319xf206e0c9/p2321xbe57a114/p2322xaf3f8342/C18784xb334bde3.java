package com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.p2322xaf3f8342;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/config/XUpdateConfig;", "Lcom/tencent/mm/plugin/updater/xlabupdater/config/BaseDownloadConfig;", "CREATOR", "yn4/b", "plugin-updater_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.updater.xlabupdater.config.XUpdateConfig */
/* loaded from: classes15.dex */
public class C18784xb334bde3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.p2322xaf3f8342.C18783xd5307f3b {

    /* renamed from: CREATOR */
    public static final yn4.b f38573x681a0c0c = new yn4.b(null);

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f257054f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f257055g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18784xb334bde3(android.os.Parcel parcel) {
        super(parcel);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f257054f = "";
        this.f257055g = "";
        java.lang.String readString = parcel.readString();
        this.f257054f = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f257055g = readString2 != null ? readString2 : "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.p2322xaf3f8342.C18783xd5307f3b, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f257054f);
        parcel.writeString(this.f257055g);
    }
}
