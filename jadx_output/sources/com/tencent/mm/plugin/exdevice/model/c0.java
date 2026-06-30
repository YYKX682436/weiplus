package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class c0 extends u32.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.d0 f98858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.exdevice.model.d0 d0Var, int i17, int i18) {
        super(i17);
        this.f98858c = d0Var;
        this.f98857b = i18;
    }

    @Override // u32.q
    public void a() {
        u32.n0 n0Var = u32.h1.c().f99006a;
        if (((u32.k1) n0Var).b(this.f98857b, this.f98858c.f98870f)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
    }
}
