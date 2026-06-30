package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f260525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.f1 f260526e;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.f1 f1Var, boolean z17) {
        this.f260526e = f1Var;
        this.f260525d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f260525d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.f1 f1Var = this.f260526e;
        if (z17) {
            f1Var.f260531a.f260438d.fullScroll(130);
        } else {
            f1Var.f260531a.f260438d.fullScroll(33);
        }
    }
}
