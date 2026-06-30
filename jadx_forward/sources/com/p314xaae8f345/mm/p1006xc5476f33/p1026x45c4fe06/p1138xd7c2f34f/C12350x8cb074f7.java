package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs", "Lcom/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverContract$SharedIPCCallArgs;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs */
/* loaded from: classes7.dex */
final class C12350x8cb074f7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12349x5d9cbdf1 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12350x8cb074f7> f35063x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.na();

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f165998s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h f165999t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12350x8cb074f7(android.os.Parcel source) {
        super(source);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.lang.String readString = source.readString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readString);
        this.f165998s = readString;
        this.f165999t = com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.k.a(source);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12349x5d9cbdf1, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        dest.writeString(this.f165998s);
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.k.d(this.f165999t, dest, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12350x8cb074f7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6, java.lang.String moduleName) {
        super(rt6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        this.f165998s = moduleName;
    }
}
