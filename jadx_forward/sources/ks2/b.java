package ks2;

/* loaded from: classes8.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f393131d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ks2.j f393132e;

    public b(ks2.j jVar) {
        this.f393132e = jVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f393131d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ks2.h holder = (ks2.h) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f393131d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.dq4 dq4Var = (r45.dq4) obj;
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.obc);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jr_);
        textView.setText(dq4Var.m75945x2fec8307(0));
        com.p314xaae8f345.mm.ui.fk.a(textView);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(holder.f3639x46306858.getContext()));
        ks2.e eVar = new ks2.e(this.f393132e);
        c1163xf1deaba4.mo7960x6cab2c8d(eVar);
        eVar.f393137d.addAll(dq4Var.m75941xfb821914(1));
        eVar.m8146xced61ae5();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dh6, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new ks2.h(this.f393132e, inflate);
    }
}
