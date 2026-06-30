package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes3.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f293873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f293874e;

    public x(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var, int i17) {
        this.f293874e = c0Var;
        this.f293873d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f293874e;
        c0Var.f293791s.c(this.f293873d);
        c0Var.f293791s.invalidate();
    }
}
