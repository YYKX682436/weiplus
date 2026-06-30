package lh4;

/* loaded from: classes8.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f400234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lh4.h f400235e;

    public c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, lh4.h hVar) {
        this.f400234d = k3Var;
        this.f400235e = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f400234d.m8183xf806b362();
        if (m8183xf806b362 >= 0) {
            lh4.h hVar = this.f400235e;
            if (m8183xf806b362 < ((java.util.ArrayList) hVar.m145780xa0ab20ce().f400257d).size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) hVar.m145775x71965dbb();
                c18557xc00aa3f3.E2 = hVar.g(m8183xf806b362);
                c18557xc00aa3f3.D2 = true;
                lh4.b m145775x71965dbb = hVar.m145775x71965dbb();
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) hVar.m145780xa0ab20ce().f400257d).get(m8183xf806b362);
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) m145775x71965dbb).f254056c2;
                o2Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemClicked type:%d,pos:%d", java.lang.Integer.valueOf(multiTaskInfo.f66793x2262335f), java.lang.Integer.valueOf(m8183xf806b362));
                int a17 = o2Var.f254207t.a(multiTaskInfo.f66793x2262335f);
                o2Var.f254211x = a17;
                o2Var.f254207t.e(a17, m8183xf806b362, multiTaskInfo.f66791xc8a07680, 1, null, "", o2Var.f254199l, "", -1);
                gh4.e0 e0Var = (gh4.e0) i95.n0.c(gh4.e0.class);
                android.content.Context context = hVar.getContext();
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) hVar.f400247h.f400257d).get(m8183xf806b362);
                e0Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo2, "multiTaskInfo");
                gh4.s0 s0Var = (gh4.s0) i95.n0.c(gh4.s0.class);
                s0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewService", "notifyClick " + multiTaskInfo2.v0().m75945x2fec8307(1) + ' ' + multiTaskInfo2.f66791xc8a07680 + ' ' + multiTaskInfo2.f66793x2262335f);
                java.util.HashSet hashSet = (java.util.HashSet) s0Var.f353487d.get(multiTaskInfo2.f66793x2262335f);
                if (hashSet != null) {
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((hh4.k) it.next()).a(multiTaskInfo2);
                    }
                }
                fs.g.c(hh4.j.class, java.lang.Integer.valueOf(multiTaskInfo2.f66793x2262335f), new gh4.p0(context, multiTaskInfo2));
                yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
