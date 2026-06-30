package com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageUpdateTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageRegisterTask;", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "h", "Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "B", "()Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "runtimeInfo", "<init>", "(Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;)V", "Lze/n;", "rt", "(Lze/n;)V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.luggage.sdk.processes.main.LuggageUpdateTask */
/* loaded from: classes7.dex */
public final class C3951xad23e6a4 extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3948xc55c09fe {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3951xad23e6a4> f15717x681a0c0c = new ye.l();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 runtimeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3951xad23e6a4(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 runtimeInfo) {
        super(runtimeInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtimeInfo, "runtimeInfo");
        this.runtimeInfo = runtimeInfo;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3948xc55c09fe, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3945xb60ab5bc
    /* renamed from: B, reason: from getter */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 getRuntimeInfo() {
        return this.runtimeInfo;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3948xc55c09fe, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3945xb60ab5bc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        this.runtimeInfo.writeToParcel(out, i17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3951xad23e6a4(ze.n rt6) {
        this(ye.e.a(rt6));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
    }
}
