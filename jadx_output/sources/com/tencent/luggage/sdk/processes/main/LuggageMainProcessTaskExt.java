package com.tencent.luggage.sdk.processes.main;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0019\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "Lcom/tencent/luggage/sdk/processes/h;", "Lcom/tencent/luggage/sdk/processes/w;", "process", "C", "Landroid/os/Parcel;", "parcel", "", "flags", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "f", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "runtimeInfo", "<init>", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;)V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class LuggageMainProcessTaskExt extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt> CREATOR = new ye.d();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo;

    public LuggageMainProcessTaskExt(com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo) {
        kotlin.jvm.internal.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
    }

    /* renamed from: B, reason: from getter */
    public com.tencent.luggage.sdk.processes.main.RuntimeInfo getRuntimeInfo() {
        return this.runtimeInfo;
    }

    public void C(com.tencent.luggage.sdk.processes.h process) {
        kotlin.jvm.internal.o.g(process, "process");
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        this.runtimeInfo.writeToParcel(out, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.luggage.sdk.processes.h hVar;
        com.tencent.luggage.sdk.processes.r rVar;
        try {
            if (i95.n0.h(com.tencent.mm.plugin.appbrand.fc.class)) {
                ((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).waitFor();
            }
            synchronized (com.tencent.luggage.sdk.processes.r.f47681e) {
                rVar = com.tencent.luggage.sdk.processes.r.f47682f;
                if (rVar == null) {
                    kotlin.jvm.internal.o.o("INSTANCE_");
                    throw null;
                }
            }
            hVar = rVar.e(getRuntimeInfo().f47659d);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("Luggage.LuggageMainProcessTaskExt", "Main process index list has been changed and give up registering task.The consequence is we can't do clearDuplicatedApp() because runtime record is lost. processIndex:" + getRuntimeInfo().f47659d + ", appId:" + getRuntimeInfo().f47660e);
            hVar = null;
        }
        if (hVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Luggage.LuggageMainProcessTaskExt", "runInMainProcess: [" + getRuntimeInfo().f47660e + "] run [" + getClass().getSimpleName() + "] by process [" + getRuntimeInfo().f47659d + "][" + hVar.i() + ']');
        try {
            C(hVar);
        } catch (java.lang.Throwable th6) {
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = getClass().getCanonicalName();
            objArr[1] = th6.getMessage();
            objArr[2] = th6.getStackTrace();
            if (i95.n0.h(com.tencent.mm.plugin.appbrand.fc.class)) {
                ((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).waitFor();
            }
            synchronized (com.tencent.luggage.sdk.processes.r.f47681e) {
                com.tencent.luggage.sdk.processes.r rVar2 = com.tencent.luggage.sdk.processes.r.f47682f;
                if (rVar2 == null) {
                    kotlin.jvm.internal.o.o("INSTANCE_");
                    throw null;
                }
                java.util.List k17 = rVar2.k();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(k17, 10));
                java.util.Iterator it = k17.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.tencent.luggage.sdk.processes.h) it.next()).toString());
                }
                java.util.Iterator it6 = arrayList.iterator();
                if (!it6.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                java.lang.Object next = it6.next();
                while (it6.hasNext()) {
                    next = ((java.lang.String) next) + '\n' + ((java.lang.String) it6.next());
                }
                objArr[3] = (java.lang.String) next;
                objArr[4] = getRuntimeInfo();
                com.tencent.mars.xlog.Log.e("Luggage.LuggageMainProcessTaskExt", "invoke[%s]: fatal error[%s][%s]\ndump processes[%s]\ndump origin invoke info[%s]", objArr);
                throw th6;
            }
        }
    }
}
