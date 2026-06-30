package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandStashRuntimeTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageStashRuntimeTask;", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "h", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "runtimeInfo", "commLibVersion", "", "isMagicBrushFrameHost", "isEnteredFullscreenCustomLoading", "<init>", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;IZZ)V", "Lcom/tencent/mm/plugin/appbrand/o6;", "rt", "(Lcom/tencent/mm/plugin/appbrand/o6;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandStashRuntimeTask */
/* loaded from: classes7.dex */
public final class C12617xdce2afee extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3950xe0f475fe {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12617xdce2afee> f35276x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.z();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 runtimeInfo;

    /* renamed from: i, reason: collision with root package name */
    public final int f170588i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f170589m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f170590n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12617xdce2afee(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 runtimeInfo, int i17, boolean z17, boolean z18) {
        super(runtimeInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
        this.f170588i = i17;
        this.f170589m = z17;
        this.f170590n = z18;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3950xe0f475fe, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3945xb60ab5bc
    /* renamed from: B, reason: from getter */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 getRuntimeInfo() {
        return this.runtimeInfo;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3950xe0f475fe
    public void D(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s record) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        boolean z17 = record instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o oVar = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o) record : null;
        if (oVar != null) {
            oVar.f170643n = this.f170589m;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o oVar2 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o) record : null;
        if (oVar2 == null) {
            return;
        }
        oVar2.f170639j = this.f170590n;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3950xe0f475fe, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3945xb60ab5bc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.runtimeInfo, i17);
        out.writeInt(this.f170588i);
        out.writeInt(this.f170589m ? 1 : 0);
        out.writeInt(this.f170590n ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12617xdce2afee(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "rt"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            com.tencent.luggage.sdk.processes.main.RuntimeInfo r0 = ye.e.a(r4)
            r1 = 0
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r2 = r4.S2(r1)
            if (r2 == 0) goto L15
            int r2 = r2.i()
            goto L16
        L15:
            r2 = -1
        L16:
            com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a r4 = r4.U2()
            if (r4 == 0) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = r1
        L1f:
            r3.<init>(r0, r2, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12617xdce2afee.<init>(com.tencent.mm.plugin.appbrand.o6):void");
    }
}
