package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.l2 f77742d;

    public f2(com.tencent.mm.plugin.appbrand.debugger.l2 l2Var) {
        this.f77742d = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = this.f77742d;
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = l2Var.f77783d;
        synchronized (a1Var) {
            z17 = a1Var.f77613o;
        }
        if (z17) {
            l2Var.f77795s.setImageResource(com.tencent.mm.R.drawable.f480822dk);
            l2Var.f77788i.setText(l2Var.getContext().getString(com.tencent.mm.R.string.f490268q8));
        } else if (l2Var.f77783d.d()) {
            l2Var.f77795s.setImageResource(com.tencent.mm.R.drawable.f480822dk);
            l2Var.f77788i.setText(l2Var.getContext().getString(com.tencent.mm.R.string.q_));
        } else {
            l2Var.f77795s.setImageResource(com.tencent.mm.R.drawable.f480821dj);
            l2Var.f77788i.setText(l2Var.getContext().getString(com.tencent.mm.R.string.f490267q7));
        }
        com.tencent.mm.plugin.appbrand.debugger.l2.b(l2Var);
    }
}
