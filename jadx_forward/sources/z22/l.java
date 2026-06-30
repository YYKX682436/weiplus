package z22;

/* loaded from: classes10.dex */
public final class l extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f551259d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f551260e;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f551259d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        t85.d x17 = x(i17);
        r45.p64 p64Var = x17 != null ? x17.f497989a : null;
        u22.l lVar = u22.r.f505539p;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p64Var, u22.r.f505540q)) {
            return 1;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p64Var, u22.r.f505542s) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p64Var, u22.r.f505541r) ? 2 : 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        z22.h holder = (z22.h) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        t85.d x17 = x(i17);
        if (x17 != null) {
            holder.i(i17, x17.f497989a);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570261a64, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new z22.i(this, inflate);
        }
        if (i17 != 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570260a63, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new z22.k(this, inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570263a66, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
        return new z22.j(this, inflate3);
    }

    public final t85.d x(int i17) {
        return (t85.d) kz5.n0.a0(this.f551259d, i17);
    }
}
