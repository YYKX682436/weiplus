package ix3;

/* loaded from: classes.dex */
public final class e0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f376924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f376924d = jz5.h.b(new ix3.d0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.emo;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("TraceInfo");
        em.n3 n3Var = (em.n3) ((jz5.n) this.f376924d).mo141623x754a37bb();
        if (n3Var.f336178b == null) {
            n3Var.f336178b = (android.widget.TextView) n3Var.f336177a.findViewById(com.p314xaae8f345.mm.R.id.vgq);
        }
        n3Var.f336178b.setText(stringExtra);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.w_, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new ix3.z(this));
        }
    }
}
