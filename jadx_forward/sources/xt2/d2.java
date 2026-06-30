package xt2;

/* loaded from: classes3.dex */
public final class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538215d;

    public d2(xt2.e3 e3Var) {
        this.f538215d = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xt2.e3 e3Var = this.f538215d;
        if (e3Var.f538254x0) {
            e3Var.f538254x0 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.f538239h, "animateSubsidyPriceCrossFade skipped (replay path: priceView already updated to new price)");
        } else {
            yt2.v vVar = e3Var.V;
            if (vVar != null) {
                vVar.a();
            }
            e3Var.V = null;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            yt2.v a17 = yt2.w.a(e3Var.f538252w, new xt2.c2(e3Var, h0Var));
            h0Var.f391656d = a17;
            e3Var.V = a17;
            cm2.m0 m0Var = e3Var.f538245p0;
            if (m0Var != null) {
                e3Var.m(m0Var);
                e3Var.f538245p0 = null;
            }
        }
        e3Var.W = null;
    }
}
