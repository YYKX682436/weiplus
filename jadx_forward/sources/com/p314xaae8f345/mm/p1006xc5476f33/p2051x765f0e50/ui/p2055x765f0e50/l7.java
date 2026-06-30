package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class l7 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f242807d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f f242808e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f242809f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f242810g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f242811h;

    /* renamed from: i, reason: collision with root package name */
    public int f242812i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g7 f242813m;

    /* renamed from: n, reason: collision with root package name */
    public int f242814n;

    /* renamed from: o, reason: collision with root package name */
    public int f242815o;

    /* renamed from: p, reason: collision with root package name */
    public final int f242816p;

    /* renamed from: q, reason: collision with root package name */
    public final int f242817q;

    /* renamed from: r, reason: collision with root package name */
    public final int f242818r;

    public l7(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f242807d = context;
        this.f242808e = recyclerView;
        this.f242809f = new java.util.ArrayList();
        this.f242811h = true;
        int B = (((i65.a.B(context) - (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7) * 2)) - context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8)) - context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz)) - context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        this.f242816p = B;
        int i17 = B / 2;
        this.f242817q = i17;
        int i18 = B / 2;
        this.f242818r = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAuthUI", "computeViewWidth appName: %s, appType: %s, content: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(B));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f242809f).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h7 h7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h7) kz5.n0.a0(this.f242809f, i17);
        if (h7Var != null) {
            return h7Var.f242630a;
        }
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.lang.String appname;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e7 e7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e7) holder;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h7 h7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h7) kz5.n0.a0(this.f242809f, i17);
            r45.ov6 ov6Var = h7Var != null ? h7Var.f242631b : null;
            if (ov6Var == null) {
                return;
            }
            java.lang.String str = ov6Var.f464094e;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = e7Var.f242517e;
            c22624x85d69039.b(str);
            java.lang.String string = this.f242807d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iiq);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.util.LinkedList linkedList = ov6Var.f464096g;
            java.lang.String g07 = linkedList == null ? "" : kz5.n0.g0(k14.j0.a(linkedList), string, null, null, 0, null, k14.h0.f384872d, 30, null);
            boolean z17 = g07.length() > 0;
            com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = e7Var.f242519g;
            if (z17) {
                c23001x9d3a0bdc.b(g07);
                c23001x9d3a0bdc.setVisibility(0);
            } else {
                c23001x9d3a0bdc.b("");
                c23001x9d3a0bdc.setVisibility(4);
            }
            java.lang.String str2 = ov6Var.f464098i;
            boolean z18 = str2 == null || str2.length() == 0;
            android.widget.TextView textView = e7Var.f242518f;
            if (z18) {
                textView.setText("");
                textView.setVisibility(8);
            } else {
                textView.setText(ov6Var.f464098i);
                textView.setVisibility(0);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22624x85d69039, "<get-authName>(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "<get-authType>(...)");
            k14.k0.a(c22624x85d69039, textView, this.f242816p, this.f242817q, this.f242818r, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i7 i7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i7(this);
            android.widget.RelativeLayout relativeLayout = e7Var.f242516d;
            relativeLayout.setOnTouchListener(i7Var);
            relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.j7(this, i17, ov6Var));
            relativeLayout.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k7(this, i17, ov6Var));
            java.lang.String str3 = ov6Var.f464094e;
            if (str3 == null || str3.length() == 0) {
                appname = "";
            } else {
                appname = ov6Var.f464094e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appname, "appname");
            }
            java.lang.String str4 = ov6Var.f464098i;
            if (!(str4 == null || str4.length() == 0)) {
                appname = appname + ',' + ov6Var.f464098i;
            }
            if (g07.length() > 0) {
                appname = appname + ',' + g07;
            }
            if (appname.length() > 0) {
                relativeLayout.setContentDescription(appname);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = this.f242807d;
        if (i17 == 2) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bp7, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.f7(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bp6, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e7(inflate2);
    }

    public final boolean x() {
        return this.f242812i <= 0;
    }

    public final boolean y(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAuthUI", "removeAuthItem position: " + i17 + ", size: " + mo1894x7e414b06());
        if (!(i17 >= 0 && i17 < mo1894x7e414b06())) {
            return false;
        }
        ((java.util.ArrayList) this.f242809f).remove(i17);
        this.f242812i--;
        m8155x27702c4(i17);
        return true;
    }
}
