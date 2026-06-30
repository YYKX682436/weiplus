package bm2;

/* loaded from: classes3.dex */
public final class h8 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f103484d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f103485e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f103486f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f103487g = 1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f103488h;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103486f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((r45.of1) this.f103486f.get(i17)).m75939xb282bd08(2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!(holder instanceof bm2.c8)) {
            if (holder instanceof bm2.b8) {
                bm2.b8 b8Var = (bm2.b8) holder;
                b8Var.f3639x46306858.setOnClickListener(new bm2.e8(this, i17, b8Var));
                return;
            }
            return;
        }
        bm2.c8 c8Var = (bm2.c8) holder;
        r45.of1 of1Var = i17 >= 0 && i17 < mo1894x7e414b06() ? (r45.of1) this.f103486f.get(i17) : null;
        if (of1Var != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.l().c(new mn2.n(of1Var.m75945x2fec8307(1), null, 2, null), c8Var.f103359d, g1Var.h(mn2.f1.f411494o));
            c8Var.f103360e.setText(of1Var.m75945x2fec8307(0));
            java.lang.String g17 = zl2.r4.f555483a.g1(of1Var.m75939xb282bd08(2));
            boolean z17 = g17.length() == 0;
            android.widget.TextView textView = c8Var.f103361f;
            if (z17) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(g17);
            }
            int m75939xb282bd08 = of1Var.m75939xb282bd08(2);
            int i18 = this.f103487g;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c8Var.f103362g;
            if (m75939xb282bd08 == i18) {
                c22699x3dcdb352.setVisibility(0);
            } else {
                c22699x3dcdb352.setVisibility(4);
            }
            c8Var.f3639x46306858.setTag(of1Var);
        }
        c8Var.f3639x46306858.setOnClickListener(new bm2.f8(this, c8Var));
        c8Var.f3639x46306858.setOnLongClickListener(new bm2.g8(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 10001) {
            android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.b1b, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new bm2.b8(this, inflate);
        }
        android.view.View inflate2 = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.b1d, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new bm2.c8(this, inflate2);
    }

    public final void x(int i17, java.util.LinkedList linkedList, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateAliasInfoList,ori size:");
        java.util.LinkedList linkedList2 = this.f103486f;
        sb6.append(linkedList2.size());
        sb6.append(",new size:");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        sb6.append(",curroleType:");
        sb6.append(this.f103487g);
        sb6.append(",roleType:");
        sb6.append(i17);
        sb6.append(",enableCreate:");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorRoleAdapter", sb6.toString());
        this.f103487g = i17;
        this.f103488h = z17;
        if (linkedList != null) {
            linkedList2.clear();
            linkedList2.addAll(linkedList);
            if (zl2.r4.f555483a.F(linkedList2)) {
                return;
            }
            r45.of1 of1Var = new r45.of1();
            of1Var.set(2, 10001);
            linkedList2.add(of1Var);
        }
    }
}
