package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006HÖ\u0001¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandRuntimePreloadNextInvoke;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "Landroid/os/Parcel;", "parcel", "", "flags", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/LuggageServiceType;", "serviceType", "<init>", "(Lcom/tencent/luggage/sdk/processes/LuggageServiceType;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRuntimePreloadNextInvoke */
/* loaded from: classes7.dex */
public final class C12616x516c0b62 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12616x516c0b62> f35275x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.y();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 f170586f;

    public C12616x516c0b62(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 serviceType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceType, "serviceType");
        this.f170586f = serviceType;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.f170586f, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runInMainProcess, serviceType:");
        sb6.append(this.f170586f);
        sb6.append(", isAppForeground:");
        com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
        sb6.append(wVar.f135422n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimePreloadNextInvoke", sb6.toString());
        if (wVar.f135422n) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().P(this.f170586f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170356n);
        }
    }
}
