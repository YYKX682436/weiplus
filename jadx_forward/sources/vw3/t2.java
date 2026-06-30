package vw3;

/* loaded from: classes5.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI f522647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd f522648e;

    public t2(com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI repairerMagicBootsUI, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd) {
        this.f522647d = repairerMagicBootsUI;
        this.f522648e = c16421xe4d4fcd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI repairerMagicBootsUI = this.f522647d;
        vw3.q2 q2Var = repairerMagicBootsUI.e;
        if (q2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listAdapter");
            throw null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class))).getClass();
        q2Var.f522613d = fe3.j.b().e();
        vw3.q2 q2Var2 = repairerMagicBootsUI.e;
        if (q2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listAdapter");
            throw null;
        }
        q2Var2.notifyDataSetChanged();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = repairerMagicBootsUI.mo55332x76847179();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("check succ pkg:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd = this.f522648e;
        sb6.append(c16421xe4d4fcd.f229391d);
        sb6.append(",version:");
        sb6.append(c16421xe4d4fcd.f229399o);
        dp.a.m125854x26a183b(mo55332x76847179, sb6.toString(), 1).show();
    }
}
