package fl1;

/* loaded from: classes7.dex */
public final class r1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f345384d;

    /* renamed from: e, reason: collision with root package name */
    public fl1.i1 f345385e;

    /* renamed from: f, reason: collision with root package name */
    public fl1.j1 f345386f;

    public r1(java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f345384d = items;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f345384d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        fl1.h1 h1Var = (fl1.h1) this.f345384d.get(i17);
        if (h1Var != null) {
            return h1Var.f345312a;
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        fl1.p1 holder = (fl1.p1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        fl1.h1 h1Var = (fl1.h1) this.f345384d.get(i17);
        if (h1Var != null) {
            fl1.q1 q1Var = new fl1.q1(this);
            holder.i(h1Var);
            holder.j(h1Var.f345317f, h1Var);
            fl1.n1 n1Var = new fl1.n1(h1Var, holder, q1Var, i17);
            android.view.View view = holder.f345375d;
            view.setOnClickListener(n1Var);
            view.setOnLongClickListener(new fl1.o1(holder, h1Var, i17));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        java.util.List list = this.f345384d;
        return i17 == 1 ? new fl1.k1(parent, list, this) : new fl1.m1(parent, list, this);
    }
}
