package com.tencent.luggage.sdk.processes.main;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageRegisterTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "Lcom/tencent/luggage/sdk/processes/h;", "Lcom/tencent/luggage/sdk/processes/w;", "process", "Ljz5/f0;", "C", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "g", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "runtimeInfo", "<init>", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;)V", "Lze/n;", "rt", "(Lze/n;)V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class LuggageRegisterTask extends com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.processes.main.LuggageRegisterTask> CREATOR = new ye.h();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuggageRegisterTask(com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo) {
        super(runtimeInfo);
        kotlin.jvm.internal.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt
    /* renamed from: B, reason: from getter */
    public com.tencent.luggage.sdk.processes.main.RuntimeInfo getRuntimeInfo() {
        return this.runtimeInfo;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt
    public void C(com.tencent.luggage.sdk.processes.h process) {
        com.tencent.luggage.sdk.processes.r rVar;
        kotlin.jvm.internal.o.g(process, "process");
        com.tencent.luggage.sdk.processes.s f17 = com.tencent.luggage.sdk.processes.h.f(process, getRuntimeInfo().f47660e, 0, 2, null);
        if (f17 == null) {
            java.lang.String appId = getRuntimeInfo().f47660e;
            int i17 = getRuntimeInfo().f47661f;
            java.lang.String instanceId = getRuntimeInfo().f47664i;
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig initConfig = getRuntimeInfo().f47666n;
            boolean z17 = getRuntimeInfo().f47667o;
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(instanceId, "instanceId");
            kotlin.jvm.internal.o.g(initConfig, "initConfig");
            f17 = ((com.tencent.mm.plugin.appbrand.task.k) process).n(appId, z17, i17, instanceId, initConfig);
        }
        if (getRuntimeInfo().f47661f != f17.f47685b) {
            com.tencent.mars.xlog.Log.e("Luggage.LuggageRegisterTask", "runInMainProcess appId:" + getRuntimeInfo().f47660e + ", instanceId:" + getRuntimeInfo().f47664i + ", runtimeInfo.versionType(" + getRuntimeInfo().f47661f + ") != record.debugType(" + f17.f47685b + ')');
            return;
        }
        f17.f47688e = getRuntimeInfo().f47667o;
        java.lang.String str = getRuntimeInfo().f47664i;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        f17.f47691h = str;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig = getRuntimeInfo().f47666n;
        kotlin.jvm.internal.o.g(appBrandInitConfig, "<set-?>");
        f17.f47687d = appBrandInitConfig;
        D(f17);
        f17.f47686c = com.tencent.luggage.sdk.processes.t.f47694f;
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
        java.lang.String excludeInstanceId = f17.f47691h;
        java.lang.String appId2 = f17.f47684a;
        kotlin.jvm.internal.o.g(excludeInstanceId, "excludeInstanceId");
        kotlin.jvm.internal.o.g(appId2, "appId");
        for (com.tencent.luggage.sdk.processes.h hVar : rVar.k()) {
            if (!kotlin.jvm.internal.o.b(process.i(), hVar.i())) {
                hVar.d(appId2, true);
            } else if (kotlin.jvm.internal.o.b(process, hVar)) {
                hVar.c(excludeInstanceId, appId2, true);
            } else {
                hVar.d(appId2, false);
            }
        }
    }

    public void D(com.tencent.luggage.sdk.processes.s record) {
        kotlin.jvm.internal.o.g(record, "record");
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        this.runtimeInfo.writeToParcel(out, i17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuggageRegisterTask(ze.n rt6) {
        this(ye.e.a(rt6));
        kotlin.jvm.internal.o.g(rt6, "rt");
    }
}
