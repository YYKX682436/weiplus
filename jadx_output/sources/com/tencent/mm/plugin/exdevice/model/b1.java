package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class b1 extends u32.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.c1 f98851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.d1 f98852e;

    public b1(com.tencent.mm.plugin.exdevice.model.d1 d1Var, com.tencent.mm.plugin.exdevice.model.c1 c1Var) {
        this.f98852e = d1Var;
        this.f98851d = c1Var;
    }

    @Override // u32.j0
    public void Y6(long j17, int i17, int i18, int i19, long j18) {
        int i27 = com.tencent.mm.plugin.exdevice.model.d1.f98871g;
        u32.v e17 = this.f98852e.f98873e.e(j17);
        if (e17 != null) {
            e17.f424383e = i18;
            e17.f424385g = j18;
        } else {
            com.tencent.mars.xlog.Log.i("com.tencent.mm.plugin.exdevice.model.d1", "get connect state faild : %d", java.lang.Long.valueOf(j17));
        }
        ((com.tencent.mm.plugin.exdevice.model.i0) this.f98851d).a(j17, i17, i18, i19, j18);
    }
}
