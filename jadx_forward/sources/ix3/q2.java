package ix3;

/* loaded from: classes8.dex */
public final class q2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f377068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f377068d = jz5.h.b(new ix3.p2(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dxx;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo54450xbf7c1df6("荣耀风险Api调试页面");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo54448x9c8c0d33(new ix3.m2(this));
        }
        jz5.g gVar = this.f377068d;
        em.c3 c3Var = (em.c3) ((jz5.n) gVar).mo141623x754a37bb();
        if (c3Var.f335708c == null) {
            c3Var.f335708c = (android.widget.Button) c3Var.f335706a.findViewById(com.p314xaae8f345.mm.R.id.f565605hh4);
        }
        c3Var.f335708c.setOnClickListener(new ix3.n2(this));
        em.c3 c3Var2 = (em.c3) ((jz5.n) gVar).mo141623x754a37bb();
        if (c3Var2.f335707b == null) {
            c3Var2.f335707b = (android.widget.Button) c3Var2.f335706a.findViewById(com.p314xaae8f345.mm.R.id.hnl);
        }
        c3Var2.f335707b.setOnClickListener(new ix3.o2(this));
    }
}
