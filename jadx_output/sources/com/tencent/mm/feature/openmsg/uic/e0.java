package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class e0 extends com.tencent.mm.feature.openmsg.uic.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.feature.exdevice.NetworkDeviceInfo f67330d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f67331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.feature.openmsg.uic.n0 n0Var, com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        super(n0Var);
        z17 = (i17 & 2) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(networkDeviceInfo, "networkDeviceInfo");
        this.f67330d = networkDeviceInfo;
        this.f67331e = z17;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
