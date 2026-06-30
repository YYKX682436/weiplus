package f93;

/* loaded from: classes3.dex */
public final class e5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.p5 f341863d;

    public e5(f93.p5 p5Var) {
        this.f341863d = p5Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f341863d.A.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        f93.p5 p5Var = this.f341863d;
        ((f93.u0) holder).i((com.p314xaae8f345.mm.p2621x8fb0427b.z3) p5Var.A.get(i17));
        if (i17 == 0 && i17 == mo1894x7e414b06() - 1) {
            holder.f3639x46306858.setBackground(i65.a.i(p5Var.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f563655b21));
            return;
        }
        if (i17 == 0) {
            holder.f3639x46306858.setBackground(i65.a.i(p5Var.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f563654b20));
        } else if (i17 == mo1894x7e414b06() - 1) {
            holder.f3639x46306858.setBackground(i65.a.i(p5Var.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.b1y));
        } else {
            holder.f3639x46306858.setBackground(i65.a.i(p5Var.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.b1z));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        f93.p5 p5Var = this.f341863d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(p5Var.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.crz, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new f93.u0(inflate, p5Var.f341959r, null);
    }
}
