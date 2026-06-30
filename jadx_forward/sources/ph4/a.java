package ph4;

/* loaded from: classes8.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph4.e f435993d;

    public a(ph4.e eVar) {
        this.f435993d = eVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f435993d.m145780xa0ab20ce().f400257d).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ph4.b viewHolder = (ph4.b) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ph4.e eVar = this.f435993d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) eVar.m145780xa0ab20ce().f400257d).get(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionBaseView", "configItemViewHolderOnBind %d %d", java.lang.Integer.valueOf(viewHolder.m8183xf806b362()), java.lang.Integer.valueOf(eVar.f400244e));
        android.view.View view = viewHolder.f3639x46306858;
        view.setTag(com.p314xaae8f345.mm.R.id.cvq, new rl5.r(eVar.getContext(), view));
        view.setOnClickListener(new lh4.c(viewHolder, eVar));
        view.setOnLongClickListener(new lh4.g(eVar, viewHolder));
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) eVar.m145780xa0ab20ce().f400257d).get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) eVar.f400243d;
        if (!c18557xc00aa3f3.f254078y2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = c18557xc00aa3f3.f254056c2;
            o2Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemAppear type:%d,multiTaskId:%s", java.lang.Integer.valueOf(multiTaskInfo.f66793x2262335f), multiTaskInfo.f66791xc8a07680);
            int a17 = o2Var.f254207t.a(multiTaskInfo.f66793x2262335f);
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a2 a2Var = o2Var.f254188a;
            if (a2Var != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) a2Var).f254075v2) {
                o2Var.f254207t.d(2, a17, multiTaskInfo.f66791xc8a07680, 1, "", "", 0, o2Var.f254199l, "", -1);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b2();
                b2Var.f254102a = 1;
                b2Var.f254103b = a17;
                b2Var.f254104c = multiTaskInfo.f66791xc8a07680;
                b2Var.f254105d = multiTaskInfo;
                o2Var.f254210w.add(b2Var);
            }
        }
        ph4.j jVar = (ph4.j) eVar.f436008o.get(java.lang.Integer.valueOf(c16601x7ed0e40c.f66793x2262335f));
        if (jVar != null) {
            jVar.d(i17, viewHolder, eVar.m145780xa0ab20ce());
        }
        android.view.View view2 = viewHolder.f3639x46306858;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) viewHolder.f435997g.getText());
        sb6.append(',');
        sb6.append((java.lang.Object) viewHolder.f435996f.getText());
        view2.setContentDescription(sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionOtherView", "onBindViewHolder end " + c16601x7ed0e40c.f66793x2262335f + ' ' + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ' ' + c16601x7ed0e40c.v0().m75945x2fec8307(1));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup p07, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        android.view.View inflate = android.view.LayoutInflater.from(p07.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxx, p07, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new ph4.b(inflate);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        ph4.b holder = (ph4.b) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.mo8157xe5e2e48d(holder, i17, payloads);
        }
    }
}
