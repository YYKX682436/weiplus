package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/ModularizingPkgBatchLoadTransaction$IPCCallArgs", "Lcom/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverContract$SharedIPCCallArgs;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs */
/* loaded from: classes7.dex */
final class C12346x9c8f3056 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12349x5d9cbdf1 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12346x9c8f3056> f35060x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v9();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f165976s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f165977t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12346x9c8f3056(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6, java.util.List moduleItems) {
        super(rt6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleItems, "moduleItems");
        this.f165976s = moduleItems;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = rt6.u0();
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = u07 instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 ? (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) u07 : null;
        this.f165977t = c3897xbc286aa1 != null ? c3897xbc286aa1.f128810w : null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12349x5d9cbdf1, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        java.util.Collection collection = this.f165976s;
        if (collection == null) {
            collection = kz5.p0.f395529d;
        }
        dest.writeTypedList(collection);
        dest.writeString(this.f165977t);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12346x9c8f3056(android.os.Parcel source) {
        super(source);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        source.readTypedList(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12347x4c8da058.f35061x681a0c0c);
        this.f165976s = arrayList;
        if (source.dataAvail() > 0) {
            this.f165977t = source.readString();
        }
    }
}
