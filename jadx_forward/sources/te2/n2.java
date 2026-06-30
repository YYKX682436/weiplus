package te2;

/* loaded from: classes14.dex */
public final class n2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f499780d;

    public n2(te2.a3 a3Var) {
        this.f499780d = a3Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        gk2.e eVar;
        java.util.ArrayList arrayList;
        te2.b2 b2Var = this.f499780d.f499392g;
        if (b2Var == null || (eVar = ((te2.l2) b2Var).f499724d) == null || (arrayList = ((je2.i) eVar.a(je2.i.class)).f380769g) == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        x91.c cVar;
        gk2.e eVar;
        java.util.ArrayList arrayList;
        te2.o2 holder = (te2.o2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        te2.a3 a3Var = this.f499780d;
        te2.b2 b2Var = a3Var.f499392g;
        te2.p2 p2Var = (b2Var == null || (eVar = ((te2.l2) b2Var).f499724d) == null || (arrayList = ((je2.i) eVar.a(je2.i.class)).f380769g) == null) ? null : (te2.p2) kz5.n0.a0(arrayList, i17);
        if (p2Var != null) {
            x91.h hVar = p2Var.f499832a;
            holder.f499807d.setText((hVar == null || (cVar = hVar.f534180a) == null) ? null : cVar.f534172g);
            x91.h hVar2 = p2Var.f499832a;
            x91.j jVar = hVar2 != null ? hVar2.f534184e.f534196a : null;
            x91.j jVar2 = x91.j.Transitioning;
            android.widget.ProgressBar progressBar = holder.f499808e;
            if (jVar == jVar2) {
                progressBar.setVisibility(0);
            } else {
                progressBar.setVisibility(8);
            }
            holder.f3639x46306858.setOnClickListener(new te2.m2(a3Var, p2Var));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup p07, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        android.view.View inflate = android.view.View.inflate(p07.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570405ap3, null);
        inflate.setBackground(p07.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1f));
        return new te2.o2(this.f499780d, inflate);
    }
}
