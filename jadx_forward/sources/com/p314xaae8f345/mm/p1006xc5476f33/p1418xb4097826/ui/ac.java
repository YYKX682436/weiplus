package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class ac extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f210390d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d f210391e;

    public ac(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d) {
        this.f210391e = activityC15052xa671b52d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        boolean z17 = this.f210390d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d = this.f210391e;
        return (z17 ? 1 : 0) + (activityC15052xa671b52d.f210178u.size() == 0 ? 0 : activityC15052xa671b52d.f210178u.size() + 1) + (activityC15052xa671b52d.f210177t.size() != 0 ? activityC15052xa671b52d.f210177t.size() + 1 : 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (!this.f210390d) {
            i17++;
        }
        if (i17 == 0) {
            return 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d = this.f210391e;
        if (activityC15052xa671b52d.f210178u.size() <= 0) {
            return i17 == 1 ? 4 : 5;
        }
        if (i17 == 1) {
            return 2;
        }
        if (i17 == activityC15052xa671b52d.f210178u.size() + 2) {
            return 4;
        }
        return i17 > activityC15052xa671b52d.f210178u.size() + 2 ? 5 : 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        ya2.b2 b2Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        boolean z17 = viewHolder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qb;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d = this.f210391e;
        if (!z17) {
            if (viewHolder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sb) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewHolder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.meo);
                int dimension = (int) viewHolder.f3639x46306858.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                viewGroup.setPadding(dimension, 0, dimension, dimension);
                viewGroup.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
                ((android.view.ViewGroup) viewHolder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.sac)).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
                viewHolder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.zb(activityC15052xa671b52d, this));
                return;
            }
            if (viewHolder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rb) {
                if (mo863xcdaf1228(i17) == 2) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rb) viewHolder).f211307d.setText(activityC15052xa671b52d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573520ev1));
                    return;
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rb) viewHolder).f211307d.setText(activityC15052xa671b52d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573519ev0));
                    return;
                }
            }
            return;
        }
        int i18 = this.f210390d ? 2 : 1;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        int size = activityC15052xa671b52d.f210178u.size();
        java.util.ArrayList arrayList = activityC15052xa671b52d.f210177t;
        if (size == 0) {
            b2Var = (ya2.b2) arrayList.get(i17 - i18);
        } else {
            java.util.ArrayList arrayList2 = activityC15052xa671b52d.f210178u;
            b2Var = i17 < arrayList2.size() + i18 ? (ya2.b2) arrayList2.get(i17 - i18) : (ya2.b2) arrayList.get(((i17 - arrayList2.size()) - i18) - 1);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b2Var);
        h0Var.f391656d = b2Var;
        mn2.g1 g1Var = mn2.g1.f411508a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qb qbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qb) viewHolder;
        g1Var.a().c(new mn2.n(((ya2.b2) h0Var.f391656d).m176700xe5e0d2a0(), null, 2, null), qbVar.f211261d, g1Var.h(mn2.f1.f411490h));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15052xa671b52d.mo55332x76847179();
        java.lang.String w07 = ((ya2.b2) h0Var.f391656d).w0();
        ((ke0.e) xVar).getClass();
        qbVar.f211262e.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, w07));
        android.widget.TextView textView = qbVar.f211264g;
        textView.setVisibility(8);
        r45.xk b17 = ya2.d.b((ya2.b2) h0Var.f391656d, false);
        if (b17 == null || (c19780xceb4c4dc = ya2.d.e(b17)) == null) {
            c19780xceb4c4dc = ((ya2.b2) h0Var.f391656d).f69300x731cac1b;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc2 = c19780xceb4c4dc;
        int m76027x1cbb0791 = c19780xceb4c4dc2 != null ? c19780xceb4c4dc2.m76027x1cbb0791() : 0;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.tb.a(ya2.m1.f542044a, qbVar.f211263f, c19780xceb4c4dc2, 0, 4, null);
        if (m76027x1cbb0791 <= 0) {
            textView.setVisibility(8);
        } else if (m76027x1cbb0791 == 1) {
            textView.setVisibility(0);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc3 = ((ya2.b2) h0Var.f391656d).f69300x731cac1b;
            if (c19780xceb4c4dc3 == null || (str = c19780xceb4c4dc3.m76029xad9975ba()) == null) {
                str = "";
            }
            textView.setText(str);
        } else if (m76027x1cbb0791 == 100) {
            textView.setVisibility(8);
        }
        viewHolder.f3639x46306858.setTag(h0Var.f391656d);
        viewHolder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.yb(h0Var, this.f210391e, this, viewHolder, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d = this.f210391e;
        if (i17 == 1) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15052xa671b52d.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo55332x76847179);
            android.view.View inflate = mo55332x76847179.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569376m, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sb(activityC15052xa671b52d, inflate);
        }
        if (i17 == 2) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC15052xa671b52d.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo55332x768471792);
            android.view.View inflate2 = mo55332x768471792.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5j, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rb(activityC15052xa671b52d, inflate2);
        }
        if (i17 != 4) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = activityC15052xa671b52d.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo55332x768471793);
            android.view.View inflate3 = mo55332x768471793.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.afg, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qb(activityC15052xa671b52d, inflate3);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471794 = activityC15052xa671b52d.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo55332x768471794);
        android.view.View inflate4 = mo55332x768471794.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5j, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate4, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rb(activityC15052xa671b52d, inflate4);
    }

    public final void x(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        java.lang.Object tag = viewHolder.f3639x46306858.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.api.LocalFinderContact");
        ya2.b2 b2Var = (ya2.b2) tag;
        r45.gb4 gb4Var = new r45.gb4();
        gb4Var.set(0, b2Var.D0());
        gb4Var.set(2, b2Var.w0());
        gb4Var.set(1, b2Var.m176700xe5e0d2a0());
        gb4Var.set(3, b2Var.f69300x731cac1b);
        gb4Var.set(7, java.lang.Integer.valueOf(b2Var.f69345xaed49e5b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d = this.f210391e;
        activityC15052xa671b52d.getIntent().putExtra("key_select_contact", gb4Var.mo14344x5f01b1f6());
        if (mo863xcdaf1228(i17) == 5) {
            activityC15052xa671b52d.getIntent().putExtra("key_source", 2);
        } else {
            activityC15052xa671b52d.getIntent().putExtra("key_source", 1);
        }
        activityC15052xa671b52d.setResult(-1, activityC15052xa671b52d.getIntent());
        activityC15052xa671b52d.finish();
    }
}
