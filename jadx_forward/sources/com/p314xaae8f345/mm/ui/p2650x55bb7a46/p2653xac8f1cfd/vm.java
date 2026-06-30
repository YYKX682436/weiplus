package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class vm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f281672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm f281674f;

    public vm(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f281674f = xmVar;
        this.f281672d = i17;
        this.f281673e = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.Pair pair;
        synchronized (this.f281674f) {
            java.util.Iterator it = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm.f281782t.entrySet().iterator();
            pair = it.hasNext() ? (android.util.Pair) ((java.util.Map.Entry) it.next()).getValue() : null;
        }
        if (pair != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar = this.f281674f;
            if (xmVar.f281787f) {
                xmVar.m0(4);
            }
            this.f281674f.p0((com.p314xaae8f345.mm.p2621x8fb0427b.f9) pair.first, false, ((java.lang.Integer) pair.second).intValue(), 0);
            return;
        }
        if (this.f281672d != -1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f281674f.f280113d.f542241c.a(sb5.z.class))).mo75871xfb80e389(this.f281672d + 1);
            if (mo75871xfb80e389 != null && mo75871xfb80e389.g3() && mo75871xfb80e389.A0() == 0) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar2 = this.f281674f;
                if (xmVar2.f281789h) {
                    xmVar2.f281789h = false;
                    xmVar2.m0(2);
                    new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6221xe44826f2().b(android.os.Looper.getMainLooper());
                    return;
                }
            }
            if (mo75871xfb80e389 != null && mo75871xfb80e389.g3() && mo75871xfb80e389.A0() == 0 && !w21.x0.n(mo75871xfb80e389)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar3 = this.f281674f;
                if (!xmVar3.f281787f) {
                    ((java.util.ArrayList) xmVar3.f281790i).add(java.lang.Long.valueOf(this.f281673e.m124847x74d37ac6()));
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar4 = this.f281674f;
                xmVar4.f281787f = true;
                ((java.util.ArrayList) xmVar4.f281790i).add(java.lang.Long.valueOf(mo75871xfb80e389.m124847x74d37ac6()));
                w21.x0.q(mo75871xfb80e389);
                this.f281674f.p0(mo75871xfb80e389, false, this.f281672d + 1, 0);
                return;
            }
            this.f281674f.m0(0);
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6221xe44826f2().b(android.os.Looper.getMainLooper());
    }
}
