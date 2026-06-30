package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HeightInfo;", "Landroid/os/Parcelable;", "CREATOR", "k91/z2", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.config.HeightInfo */
/* loaded from: classes3.dex */
public class C11817xcfa25a95 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final k91.z2 f33597x681a0c0c = new k91.z2(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f158925d;

    /* renamed from: e, reason: collision with root package name */
    public final int f158926e;

    public C11817xcfa25a95(int i17, int i18) {
        this.f158925d = i17;
        this.f158926e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m50127x9616526c() {
        return "HeightInfo(currentHeight=" + this.f158925d + ", initialHeight=" + this.f158926e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f158925d);
        parcel.writeInt(this.f158926e);
    }
}
