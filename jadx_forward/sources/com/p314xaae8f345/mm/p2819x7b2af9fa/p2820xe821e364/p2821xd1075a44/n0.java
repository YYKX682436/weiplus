package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296120d;

    public n0(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        this.f296120d = c22949xf1deaba4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296120d;
        if (!c22949xf1deaba4.A || c22949xf1deaba4.isLayoutRequested()) {
            return;
        }
        if (!c22949xf1deaba4.f295953y) {
            c22949xf1deaba4.requestLayout();
        } else if (c22949xf1deaba4.D) {
            c22949xf1deaba4.C = true;
        } else {
            c22949xf1deaba4.n();
        }
    }
}
