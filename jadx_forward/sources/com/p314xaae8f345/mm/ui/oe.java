package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class oe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f291005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.pe f291006e;

    public oe(com.p314xaae8f345.mm.ui.pe peVar, int i17) {
        this.f291006e = peVar;
        this.f291005d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.t1 t1Var = this.f291006e.f291037d.f290399g;
        if (t1Var != null) {
            ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) t1Var).i(this.f291005d);
        }
    }
}
