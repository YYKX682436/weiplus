package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0014R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljz5/f0;", "writeToParcel", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "Lr45/br2;", "d", "Lr45/br2;", "a", "()Lr45/br2;", "b", "(Lr45/br2;)V", "productShareObject", "<init>", "()V", "shareProductShareObject", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/finder/b0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest */
/* loaded from: classes7.dex */
final class C12113x2646a205 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.b0 f34269x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.b0(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private r45.br2 productShareObject;

    public C12113x2646a205() {
    }

    /* renamed from: a, reason: from getter */
    public final r45.br2 getProductShareObject() {
        return this.productShareObject;
    }

    public final void b(r45.br2 br2Var) {
        this.productShareObject = br2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12114xbdfba9cf.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.d(this.productShareObject, dest);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12113x2646a205(r45.br2 shareProductShareObject) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareProductShareObject, "shareProductShareObject");
        this.productShareObject = shareProductShareObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12113x2646a205(android.os.Parcel parcel) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        mo50318xdc053d3f(parcel);
        java.lang.Object c17 = com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderProductShareObject");
        this.productShareObject = (r45.br2) c17;
    }
}
