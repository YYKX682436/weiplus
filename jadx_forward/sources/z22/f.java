package z22;

/* loaded from: classes10.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f551250d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f551251e = -1;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f551252f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f551253g;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f551250d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        t85.d dVar = (t85.d) kz5.n0.a0(this.f551250d, i17);
        r45.p64 p64Var = dVar != null ? dVar.f497989a : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p64Var, u22.r.f505543t) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p64Var, u22.r.f505545v)) {
            return 1;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p64Var, u22.r.f505544u) ? 2 : 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        z22.a holder = (z22.a) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        t85.d dVar = (t85.d) kz5.n0.a0(this.f551250d, i17);
        if (dVar != null) {
            holder.i(i17, dVar.f497989a);
        }
        holder.f3639x46306858.setSelected(i17 == this.f551251e);
        yz5.l lVar = this.f551253g;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a67, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new z22.e(this, inflate);
        }
        if (i17 != 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6_, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new z22.d(this, inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570262a65, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
        return new z22.b(this, inflate3);
    }
}
