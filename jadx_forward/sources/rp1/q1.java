package rp1;

/* loaded from: classes14.dex */
public class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 f480049d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700) {
        this.f480049d = c12931xa4a39700;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/FloatMenuView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700 = this.f480049d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = c12931xa4a39700.f175115m;
        if (c12929x567537a0 != null) {
            int i17 = c12931xa4a39700.f175116n;
            int i18 = c12931xa4a39700.f175117o;
            if (c12929x567537a0.f175083q == null || !c12929x567537a0.l(i17, i18)) {
                z17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallView", "checkClickInCustomView click in customView");
                c12929x567537a0.f175083q.performClick();
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "checkClickInCustomView true");
                yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatMenuView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) c12931xa4a39700.f175119q).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d) ((mp1.f) it.next());
            dVar.getClass();
            yj0.a.a("com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuBackgroundClicked", "()V", dVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onFloatMenuBackgroundClicked");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = dVar.f174816a;
            nVar.f174861m.a(2);
            nVar.i();
            yj0.a.h(dVar, "com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuBackgroundClicked", "()V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatMenuView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
