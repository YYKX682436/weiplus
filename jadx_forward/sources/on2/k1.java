package on2;

/* loaded from: classes3.dex */
public final class k1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.a2 f428488d;

    public k1(on2.a2 a2Var) {
        this.f428488d = a2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.dt1 dt1Var = (r45.dt1) obj;
        on2.a2 a2Var = this.f428488d;
        if (!a2Var.f428370t.isShown()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryPanelWidget", "updateLotteryList but invisible!");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = a2Var.f428370t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1163xf1deaba4, "access$getLotteryList$p(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dt1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a = a2Var.m58104xb7f4f95a();
        boolean z17 = m58104xb7f4f95a != null && ((mm2.c1) m58104xb7f4f95a.P0(mm2.c1.class)).S;
        on2.j1 j1Var = a2Var.f428373w;
        j1Var.getClass();
        java.util.LinkedList m75941xfb821914 = dt1Var.m75941xfb821914(1);
        java.util.ArrayList arrayList = j1Var.f428478d;
        arrayList.clear();
        if (!zl2.r4.f555483a.m()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
            pm0.v.d0(m75941xfb821914, on2.i1.f428469d);
        }
        if (!(m75941xfb821914 == null || m75941xfb821914.isEmpty())) {
            arrayList.addAll(m75941xfb821914);
        }
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((r45.dz1) it.next()).m75939xb282bd08(0) == dt1Var.m75939xb282bd08(2)) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 >= 0 && i17 < j1Var.mo1894x7e414b06()) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            c1163xf1deaba4.getViewTreeObserver().addOnGlobalLayoutListener(new zl2.f3(c1163xf1deaba4, i17, 0));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryPanelListAdapter", "updateLotteryList haveJoinLive:" + z17 + ", locationPos:" + i17 + ",location_id:" + dt1Var.m75939xb282bd08(2) + ", itemCount:" + j1Var.mo1894x7e414b06() + ',');
        }
        j1Var.f428479e = z17;
        j1Var.m8146xced61ae5();
    }
}
