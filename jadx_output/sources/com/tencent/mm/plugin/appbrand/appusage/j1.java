package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class j1 extends l75.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f76482d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.r1 f76483e;

    public j1(com.tencent.mm.plugin.appbrand.appusage.r1 r1Var) {
        this.f76483e = r1Var;
    }

    @Override // l75.s0, l75.l0
    public void add(l75.q0 q0Var) {
        add(q0Var, android.os.Looper.getMainLooper());
    }

    @Override // l75.s0, l75.l0
    public void remove(l75.q0 q0Var) {
        if (q0Var == null) {
            return;
        }
        super.remove(q0Var);
        synchronized (this.f76482d) {
            ((java.util.HashSet) this.f76482d).remove(q0Var);
        }
    }

    @Override // l75.s0, l75.l0
    public void add(l75.q0 q0Var, android.os.Looper looper) {
        boolean z17;
        if (q0Var == null || looper == null) {
            return;
        }
        super.add(q0Var, looper);
        synchronized (this.f76482d) {
            ((java.util.HashSet) this.f76482d).add(q0Var);
            z17 = true;
            if (((java.util.HashSet) this.f76482d).size() != 1) {
                z17 = false;
            }
        }
        if (z17) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.appusage.p1.class, new com.tencent.mm.plugin.appbrand.appusage.i1(this));
        }
    }
}
