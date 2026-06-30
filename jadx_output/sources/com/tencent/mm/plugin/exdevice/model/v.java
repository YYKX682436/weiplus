package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f99072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.d0 f99073f;

    public v(com.tencent.mm.plugin.exdevice.model.d0 d0Var, java.lang.String str, boolean z17) {
        this.f99073f = d0Var;
        this.f99071d = str;
        this.f99072e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.model.d0 d0Var = this.f99073f;
        if (d0Var.f98865a != null) {
            u32.u.f424372d.d(this.f99071d, this.f99072e);
            return;
        }
        d0Var.f98865a = new u32.r();
        u32.r rVar = d0Var.f98865a;
        rVar.f424356d = new com.tencent.mm.plugin.exdevice.model.u(this, 0);
        rVar.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    public java.lang.String toString() {
        return super.toString() + "|ranging";
    }
}
