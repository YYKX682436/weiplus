package id2;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372125d;

    public h0(id2.v1 v1Var) {
        this.f372125d = v1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl2.r4.f555483a.T2(4);
        id2.v1 v1Var = this.f372125d;
        dl2.f0 f0Var = (dl2.f0) ((jz5.n) v1Var.f372383w).mo141623x754a37bb();
        int i17 = v1Var.L;
        long j17 = v1Var.H;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList(v1Var.D);
        kz5.g0.t(linkedList2, new id2.g0(v1Var));
        java.util.Iterator it = linkedList2.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            r45.n30 n30Var = (r45.n30) it.next();
            if (n30Var.m75939xb282bd08(1) > 0) {
                z17 = true;
            }
            linkedList.add(new dl2.f(z17, n30Var));
        }
        dl2.g gVar = new dl2.g(i17, j17, linkedList);
        f0Var.getClass();
        yz5.a aVar = f0Var.f316739j;
        if (aVar != null && (lVar = (jz5.l) aVar.mo152xb9724478()) != null) {
            r45.qa1 qa1Var = (r45.qa1) lVar.f384366d;
            f0Var.f316741l = qa1Var.m75942xfb822ef2(5);
            f0Var.f316742m = qa1Var.m75942xfb822ef2(6);
            f0Var.f316743n = (java.util.LinkedHashMap) lVar.f384367e;
            java.util.LinkedList m75941xfb821914 = qa1Var.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getLevel_config_list(...)");
            f0Var.f316744o = m75941xfb821914;
            if (m75941xfb821914.size() > 1) {
                kz5.g0.t(m75941xfb821914, new dl2.e0());
            }
            f0Var.f316745p = qa1Var.m75942xfb822ef2(3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var.f316731b, "[showPanel] data = " + gVar);
        f0Var.f316740k = gVar;
        f0Var.f316746q = gVar.f316753a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : gVar.f316755c) {
            dl2.f fVar = (dl2.f) obj;
            if (fVar.f316728a && fVar.f316729b.m75939xb282bd08(1) > 0) {
                arrayList2.add(obj);
            }
        }
        f0Var.f316752w = arrayList2.size();
        ((dl2.p) ((jz5.n) f0Var.f316737h).mo141623x754a37bb()).m8146xced61ae5();
        f0Var.b();
        ((android.view.View) ((jz5.n) f0Var.f316733d).mo141623x754a37bb()).post(new dl2.d0(f0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
