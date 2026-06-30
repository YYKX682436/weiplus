package m31;

/* loaded from: classes9.dex */
public final class y0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f404770d;

    /* renamed from: e, reason: collision with root package name */
    public final m31.p1 f404771e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f404772f;

    public y0(java.util.List items, m31.p1 dialog) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        this.f404770d = items;
        this.f404771e = dialog;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f404772f = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : items) {
            if (((m31.q0) obj).f404733a) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        m31.p1 p1Var = this.f404771e;
        int size = ((java.util.ArrayList) this.f404772f).size();
        p1Var.getClass();
        p1Var.f404725s.setEnabled(size != 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f404770d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return this.f404770d.get(i17) instanceof m31.z0 ? 2 : 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z17 = holder instanceof m31.u0;
        java.util.List list = this.f404770d;
        if (z17) {
            m31.u0 u0Var = (m31.u0) holder;
            u0Var.f404750d.setText(((m31.q0) list.get(i17)).f404734b);
            boolean z18 = ((m31.q0) list.get(i17)).f404733a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = u0Var.f404751e;
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z18);
            viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new m31.v0(this, holder, i17));
            return;
        }
        if (holder instanceof m31.s0) {
            m31.s0 s0Var = (m31.s0) holder;
            boolean z19 = ((m31.q0) list.get(i17)).f404733a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = s0Var.f404744f;
            viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(z19);
            s0Var.f404742d.setText(((m31.q0) list.get(i17)).f404734b);
            int i18 = ((m31.q0) list.get(i17)).f404733a ? 0 : 8;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = s0Var.f404743e;
            c22699x3dcdb352.setVisibility(i18);
            viewOnClickListenerC22631x1cc07cc82.m81396xb3e0a10a(new m31.w0(this, holder, i17));
            m31.q0 q0Var = (m31.q0) list.get(i17);
            if (q0Var instanceof m31.z0) {
                x(i17, ((m31.z0) q0Var).f404775e, false, s0Var, (m31.q0) list.get(i17));
                c22699x3dcdb352.setOnClickListener(new m31.x0(q0Var, this, i17, holder));
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 2) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cx7, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new m31.s0(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cx8, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new m31.u0(inflate2);
    }

    public final void x(int i17, boolean z17, boolean z18, m31.s0 s0Var, m31.q0 q0Var) {
        android.content.res.Resources resources;
        int i18;
        m31.d1 d1Var;
        m31.p1 p1Var = this.f404771e;
        m31.c1 c1Var = p1Var.f404714e;
        if (c1Var != null) {
            c1Var.b(m31.b1.f404655d, z17, q0Var, z18);
        }
        if (z18) {
            if (z17) {
                java.lang.Object systemService = p1Var.f404713d.getSystemService("vibrator");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                ((android.os.Vibrator) systemService).vibrate(10L);
                m31.d1 d1Var2 = p1Var.f404715f;
                if (d1Var2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.j) d1Var2).a(p1Var.f404713d, true);
                }
            } else if (s0Var.f404744f.f292896x && (d1Var = p1Var.f404715f) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.j) d1Var).a(p1Var.f404713d, false);
            }
        }
        if (z17) {
            resources = s0Var.f404743e.getContext().getResources();
            i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f561063a82;
        } else {
            resources = s0Var.f404743e.getContext().getResources();
            i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c;
        }
        int color = resources.getColor(i18);
        android.graphics.drawable.Drawable drawable = s0Var.f3639x46306858.getContext().getResources().getDrawable(z17 ? com.p314xaae8f345.mm.R.raw.f79611x6e16da76 : com.p314xaae8f345.mm.R.raw.f80019x988cbbc4);
        com.p314xaae8f345.mm.ui.uk.f(drawable, color);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = s0Var.f404743e;
        c22699x3dcdb352.setImageDrawable(drawable);
        c22699x3dcdb352.m82040x7541828(color);
    }

    public final void y(boolean z17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z18 = holder instanceof m31.u0;
        java.util.List list = this.f404772f;
        m31.p1 p1Var = this.f404771e;
        java.util.List list2 = this.f404770d;
        if (z18) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = ((m31.u0) holder).f404751e;
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z17);
            ((m31.q0) list2.get(i17)).f404733a = viewOnClickListenerC22631x1cc07cc8.f292896x;
            if (((m31.q0) list2.get(i17)).f404733a) {
                ((java.util.ArrayList) list).add(list2.get(i17));
            } else {
                ((java.util.ArrayList) list).remove(list2.get(i17));
            }
            int size = ((java.util.ArrayList) list).size();
            p1Var.getClass();
            p1Var.f404725s.setEnabled(size != 0);
            return;
        }
        if (holder instanceof m31.s0) {
            m31.s0 s0Var = (m31.s0) holder;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = s0Var.f404744f;
            viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(z17);
            m31.q0 q0Var = (m31.q0) list2.get(i17);
            boolean z19 = viewOnClickListenerC22631x1cc07cc82.f292896x;
            q0Var.f404733a = z19;
            s0Var.f404743e.setVisibility(z19 ? 0 : 8);
            m31.q0 q0Var2 = (m31.q0) list2.get(i17);
            if (q0Var2.f404733a) {
                ((java.util.ArrayList) list).add(q0Var2);
            } else {
                ((java.util.ArrayList) list).remove(q0Var2);
                if (q0Var2 instanceof m31.z0) {
                    ((m31.z0) q0Var2).f404775e = false;
                    x(i17, false, true, s0Var, (m31.q0) list2.get(i17));
                }
            }
            int size2 = ((java.util.ArrayList) list).size();
            p1Var.getClass();
            p1Var.f404725s.setEnabled(size2 != 0);
        }
    }
}
