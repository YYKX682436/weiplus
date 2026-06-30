package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.ipc.ResultReceiverFixLeak$ResultReceiverLifecycleWrapper */
/* loaded from: classes7.dex */
public final class C11897x7c800cad extends p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: g, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c f159924g;

    public C11897x7c800cad(p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(c0050x5b3754c.f90543e);
        this.f159924g = c0050x5b3754c;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            yVar.mo273xed6858b4().a(this);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.w0(this, yVar));
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c
    public void a(int i17, android.os.Bundle bundle) {
        p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c = this.f159924g;
        if (c0050x5b3754c != null) {
            c0050x5b3754c.a(i17, bundle);
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onDestroy */
    public void m50407xac79a11b() {
        this.f159924g = null;
    }
}
