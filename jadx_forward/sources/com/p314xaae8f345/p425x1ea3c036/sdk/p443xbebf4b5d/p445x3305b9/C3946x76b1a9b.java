package com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0012\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageOnRuntimeFinishTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "Ljz5/f0;", "z", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "g", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "D", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;)V", "runtimeInfo", "<init>", "Lze/n;", "rt", "(Lze/n;)V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.luggage.sdk.processes.main.LuggageOnRuntimeFinishTask */
/* loaded from: classes7.dex */
public final class C3946x76b1a9b extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3945xb60ab5bc {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3946x76b1a9b> f15712x681a0c0c = new ye.f();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 runtimeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3946x76b1a9b(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 runtimeInfo) {
        super(runtimeInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3945xb60ab5bc
    /* renamed from: B, reason: from getter */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 getRuntimeInfo() {
        return this.runtimeInfo;
    }

    public void D(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 c3952x9062a486) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c3952x9062a486, "<set-?>");
        this.runtimeInfo = c3952x9062a486;
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

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3945xb60ab5bc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r rVar;
        super.z();
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
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 runtimeInfo = getRuntimeInfo();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtimeInfo, "runtimeInfo");
        java.lang.String str = runtimeInfo.f129193e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0) rVar).g(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o oVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o) (kVar != null ? com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h.f(kVar, str, 0, 2, null) : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRuntimeFinish appId=");
        sb6.append(str);
        sb6.append(", record=");
        sb6.append(oVar != null ? java.lang.Integer.valueOf(oVar.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", sb6.toString());
        if (oVar != null && oVar.f170640k) {
            oVar.f170640k = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e.class);
        if (eVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e.Bi(eVar, runtimeInfo.f129197i, null, 2, null);
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11560xc99a07f4(runtimeInfo.f129198m, str).e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3946x76b1a9b(ze.n rt6) {
        this(ye.e.a(rt6));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
    }
}
