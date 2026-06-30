package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/av_device_usage/ParcelableAVDeviceUsageScene;", "", "Landroid/os/Parcelable;", "com/tencent/mm/plugin/appbrand/av_device_usage/j0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene */
/* loaded from: classes7.dex */
public final class EnumC11723x613ffaf9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9> f33510x681a0c0c;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.j0 f158215e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9[] f158216f;

    /* renamed from: d, reason: collision with root package name */
    public final fb1.d f158217d;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9[] enumC11723x613ffaf9Arr = {new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9("Phone", 0, fb1.d.f342362d), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9("VOIP", 1, fb1.d.f342363e), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9("LivePusher", 2, fb1.d.f342364f), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9("AppBrandVOIP", 3, fb1.d.f342365g), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9("AppBrandLivePusher", 4, fb1.d.f342366h), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9("AppBrandLivePlayer", 5, fb1.d.f342367i)};
        f158216f = enumC11723x613ffaf9Arr;
        rz5.b.a(enumC11723x613ffaf9Arr);
        f158215e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.j0(null);
        f33510x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.k0();
    }

    public EnumC11723x613ffaf9(java.lang.String str, int i17, fb1.d dVar) {
        this.f158217d = dVar;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9 m49890xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9) java.lang.Enum.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9[] m49891xcee59d22() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9[]) f158216f.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(name());
    }
}
