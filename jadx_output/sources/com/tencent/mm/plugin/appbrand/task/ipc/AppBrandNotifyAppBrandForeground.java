package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandNotifyAppBrandForeground;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "Ljz5/f0;", "z", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "g", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "runtimeInfo", "<init>", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class AppBrandNotifyAppBrandForeground extends com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNotifyAppBrandForeground> CREATOR = new com.tencent.mm.plugin.appbrand.task.ipc.n();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandNotifyAppBrandForeground(com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo) {
        super(runtimeInfo);
        kotlin.jvm.internal.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt
    /* renamed from: B, reason: from getter */
    public com.tencent.luggage.sdk.processes.main.RuntimeInfo getRuntimeInfo() {
        return this.runtimeInfo;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.runtimeInfo, i17);
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
        java.lang.String str = getRuntimeInfo().f47660e;
        ((l02.q) sVar).getClass();
        java.util.LinkedList linkedList = com.tencent.mm.plugin.downloader_app.model.l0.D;
        com.tencent.mm.plugin.downloader_app.model.l0 l0Var = com.tencent.mm.plugin.downloader_app.model.j0.f97286a;
        java.util.LinkedList linkedList2 = l0Var.f97296u;
        java.util.Iterator it = linkedList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.downloader_app.model.i0 i0Var = (com.tencent.mm.plugin.downloader_app.model.i0) it.next();
            if (i0Var.f97279a.equals(str) && i0Var.f97281c == 5) {
                h02.a e17 = com.tencent.mm.plugin.downloader.model.m0.e(i0Var.f97280b);
                if (e17 != null && e17.field_status == 3) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onAppBrandForeground:%s, remove finished wva task", str);
                    linkedList2.remove(i0Var);
                    l0Var.f97297v.remove(i0Var);
                    l0Var.g0();
                }
            }
        }
        if (linkedList2.isEmpty() && l0Var.f97298w.isEmpty()) {
            l0Var.f97299x = true;
            l0Var.d();
        } else if (l0Var.n0()) {
            l0Var.p0();
            l0Var.o0();
        }
    }
}
