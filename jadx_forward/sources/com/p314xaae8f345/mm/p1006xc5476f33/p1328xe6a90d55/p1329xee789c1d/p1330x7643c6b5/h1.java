package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz.k f177447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b f177448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 f177449f;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var, dz.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b bVar) {
        this.f177449f = p0Var;
        this.f177447d = kVar;
        this.f177448e = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = this.f177449f;
        int k17 = p0Var.k(this.f177447d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b bVar = this.f177448e;
        if (k17 == -9999) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: pending exit. waiting for next time");
            p0Var.X = bVar;
        } else if (bVar != null) {
            if (k17 == 0) {
                bVar.a(0, 0, "", "");
            } else {
                bVar.a(-10086, -17, "exit failed", "");
            }
        }
    }
}
