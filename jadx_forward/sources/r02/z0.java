package r02;

/* loaded from: classes8.dex */
public class z0 implements vl1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 f449881a;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928) {
        this.f449881a = c13250xfa9a7928;
    }

    @Override // vl1.o
    public boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        m43.e eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928 = this.f449881a;
        if (!c13250xfa9a7928.f178963r2) {
            return false;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        if ((viewGroup.getChildAt(0) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) && (eVar = c13250xfa9a7928.f178951f2.f449857d) != null) {
            java.util.Iterator it = eVar.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) it.next()).f178845a = true;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) viewGroup.getChildAt(0)).setSelected(true);
            c13250xfa9a7928.f178955j2 = true;
            m43.e eVar2 = c13250xfa9a7928.f178951f2.f449857d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(eVar2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskListView", "enterTaskManagerView, list is nil");
            } else {
                c13250xfa9a7928.f178955j2 = true;
                java.util.Iterator it6 = eVar2.iterator();
                while (it6.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) it6.next()).f178845a = true;
                }
                r02.w wVar = c13250xfa9a7928.f178953h2;
                if (wVar != null) {
                    ((r02.m) wVar).a(true);
                }
                r02.r0 r0Var = c13250xfa9a7928.f178951f2;
                r0Var.f449863m = false;
                r0Var.m8146xced61ae5();
                c13250xfa9a7928.f178963r2 = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.b(true);
                o02.a.b(11, 0, 0, 1, "", "", "");
                o02.a.b(11, 0, 0, 1, "", "", "");
            }
        }
        return true;
    }
}
