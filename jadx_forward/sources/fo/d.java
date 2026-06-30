package fo;

/* loaded from: classes.dex */
public final class d extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f346311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f346311d = jz5.h.b(new fo.c(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e0u;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo78530x8b45058f();
            abstractActivityC21394xb3d2c0cf.mo64405x4dab7448(m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            abstractActivityC21394xb3d2c0cf.mo54448x9c8c0d33(new fo.a(this));
            abstractActivityC21394xb3d2c0cf.mo54450xbf7c1df6("");
        }
        jz5.g gVar = this.f346311d;
        em.k kVar = (em.k) ((jz5.n) gVar).mo141623x754a37bb();
        if (kVar.f336022b == null) {
            kVar.f336022b = (android.widget.Button) kVar.f336021a.findViewById(com.p314xaae8f345.mm.R.id.khs);
        }
        android.widget.Button button = kVar.f336022b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(button, "getOkBtn(...)");
        com.p314xaae8f345.mm.ui.fk.b(button);
        em.k kVar2 = (em.k) ((jz5.n) gVar).mo141623x754a37bb();
        if (kVar2.f336023c == null) {
            kVar2.f336023c = (android.widget.TextView) kVar2.f336021a.findViewById(com.p314xaae8f345.mm.R.id.odi);
        }
        android.widget.TextView textView = kVar2.f336023c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "getTitleView(...)");
        com.p314xaae8f345.mm.ui.fk.b(textView);
        em.k kVar3 = (em.k) ((jz5.n) gVar).mo141623x754a37bb();
        if (kVar3.f336022b == null) {
            kVar3.f336022b = (android.widget.Button) kVar3.f336021a.findViewById(com.p314xaae8f345.mm.R.id.khs);
        }
        kVar3.f336022b.setOnClickListener(new fo.b(this));
    }
}
