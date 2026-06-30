package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class j9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 f205379e;

    public j9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var) {
        this.f205378d = obVar;
        this.f205379e = l2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserTagLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z18 = true;
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209574yb).mo141623x754a37bb()).r()).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205378d;
            if (intValue == 1) {
                ((ks2.j) ((jz5.n) obVar.W1).mo141623x754a37bb()).i();
            } else {
                hs2.b bVar = obVar.V1;
                android.app.Activity context = obVar.m80379x76847179();
                bVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 info = this.f205379e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570610b74, (android.view.ViewGroup) null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                y1Var.k(inflate);
                com.p314xaae8f345.mm.ui.bk.q0(((android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.obc)).getPaint());
                r45.dc1 dc1Var = info.f205459o;
                java.lang.String m75945x2fec8307 = dc1Var != null ? dc1Var.m75945x2fec8307(0) : null;
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    ((android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.o4i)).setText(m75945x2fec8307);
                }
                r45.dc1 dc1Var2 = info.f205461q;
                java.lang.String m75945x2fec83072 = dc1Var2 != null ? dc1Var2.m75945x2fec8307(0) : null;
                if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
                    z18 = false;
                }
                if (!z18) {
                    android.widget.TextView textView = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.o5b);
                    r45.dc1 dc1Var3 = info.f205461q;
                    textView.setText(dc1Var3 != null ? dc1Var3.m75945x2fec8307(0) : null);
                }
                y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.bys).setOnClickListener(new hs2.a(y1Var));
                y1Var.s();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserTagLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
