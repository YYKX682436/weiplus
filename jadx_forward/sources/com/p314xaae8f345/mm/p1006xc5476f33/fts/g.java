package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public class g extends p13.c implements java.lang.Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final p13.u f218940n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.ref.WeakReference f218941o;

    public g(int i17, p13.u uVar) {
        this.f218940n = uVar;
        this.f218941o = new java.lang.ref.WeakReference(uVar.f432684m);
        uVar.f432684m = null;
    }

    @Override // p13.c
    /* renamed from: getPriority */
    public int mo63528x3662b71a() {
        return 0;
    }

    @Override // p13.c
    public boolean i() {
        p13.u uVar = this.f218940n;
        p13.v vVar = new p13.v(uVar);
        vVar.f432690b = this;
        vVar.f432691c = -2;
        vVar.f432693e = new java.util.LinkedList();
        vVar.f432692d = p13.r.b(uVar.f432674c, false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = uVar.f432685n;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fts.f(this, vVar));
            return true;
        }
        o13.x xVar = (o13.x) this.f218941o.get();
        if (xVar == null) {
            return true;
        }
        xVar.X2(vVar);
        return true;
    }

    @Override // p13.c
    public int k() {
        return -1;
    }

    @Override // p13.c
    public boolean m() {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            i();
        } catch (java.lang.Exception unused) {
        }
    }
}
