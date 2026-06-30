package com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageRegisterTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "Lcom/tencent/luggage/sdk/processes/h;", "Lcom/tencent/luggage/sdk/processes/w;", "process", "Ljz5/f0;", "C", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "g", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "runtimeInfo", "<init>", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;)V", "Lze/n;", "rt", "(Lze/n;)V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.luggage.sdk.processes.main.LuggageRegisterTask */
/* loaded from: classes7.dex */
public class C3948xc55c09fe extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3945xb60ab5bc {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3948xc55c09fe> f15714x681a0c0c = new ye.h();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 runtimeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3948xc55c09fe(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 runtimeInfo) {
        super(runtimeInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3945xb60ab5bc
    /* renamed from: B, reason: from getter */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 getRuntimeInfo() {
        return this.runtimeInfo;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3945xb60ab5bc
    public void C(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h process) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r rVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(process, "process");
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s f17 = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h.f(process, getRuntimeInfo().f129193e, 0, 2, null);
        if (f17 == null) {
            java.lang.String appId = getRuntimeInfo().f129193e;
            int i17 = getRuntimeInfo().f129194f;
            java.lang.String instanceId = getRuntimeInfo().f129197i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 initConfig = getRuntimeInfo().f129199n;
            boolean z17 = getRuntimeInfo().f129200o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
            f17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) process).n(appId, z17, i17, instanceId, initConfig);
        }
        if (getRuntimeInfo().f129194f != f17.f129218b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LuggageRegisterTask", "runInMainProcess appId:" + getRuntimeInfo().f129193e + ", instanceId:" + getRuntimeInfo().f129197i + ", runtimeInfo.versionType(" + getRuntimeInfo().f129194f + ") != record.debugType(" + f17.f129218b + ')');
            return;
        }
        f17.f129221e = getRuntimeInfo().f129200o;
        java.lang.String str = getRuntimeInfo().f129197i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        f17.f129224h = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718 = getRuntimeInfo().f129199n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c11808xe47dc718, "<set-?>");
        f17.f129220d = c11808xe47dc718;
        D(f17);
        f17.f129219c = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.t.f129227f;
        if (i95.n0.h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48900x42891314();
        }
        synchronized (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r.f129214e) {
            rVar = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r.f129215f;
            if (rVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("INSTANCE_");
                throw null;
            }
        }
        java.lang.String excludeInstanceId = f17.f129224h;
        java.lang.String appId2 = f17.f129217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(excludeInstanceId, "excludeInstanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId2, "appId");
        for (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar : rVar.k()) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(process.i(), hVar.i())) {
                hVar.d(appId2, true);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(process, hVar)) {
                hVar.c(excludeInstanceId, appId2, true);
            } else {
                hVar.d(appId2, false);
            }
        }
    }

    public void D(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s record) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3945xb60ab5bc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        this.runtimeInfo.writeToParcel(out, i17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3948xc55c09fe(ze.n rt6) {
        this(ye.e.a(rt6));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
    }
}
