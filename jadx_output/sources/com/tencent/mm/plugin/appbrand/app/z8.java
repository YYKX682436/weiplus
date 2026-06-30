package com.tencent.mm.plugin.appbrand.app;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/app/z8;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Parcel;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class z8 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Parcel parcel = (android.os.Parcel) obj;
        if (parcel != null) {
            ((com.tencent.mm.plugin.appbrand.service.r5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.r5.class)).Ug(parcel.readString(), parcel.readString(), null);
        }
        return com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
    }
}
