package wr3;

/* loaded from: classes11.dex */
public final class k0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba f530360d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba abstractC16899xcafbd5ba) {
        this.f530360d = abstractC16899xcafbd5ba;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.gl glVar;
        r45.gl glVar2;
        r45.gl glVar3;
        r45.gl glVar4;
        r45.gl glVar5;
        java.util.LinkedList linkedList;
        r45.gl glVar6;
        java.util.LinkedList linkedList2;
        r45.l5 l5Var;
        vr3.f fVar = (vr3.f) obj;
        if (fVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba abstractC16899xcafbd5ba = this.f530360d;
        abstractC16899xcafbd5ba.getClass();
        r45.tj6 t07 = abstractC16899xcafbd5ba.t0(abstractC16899xcafbd5ba.m0());
        int i17 = fVar.f521161a;
        if (t07 != null && (glVar6 = t07.f468042e) != null && (linkedList2 = glVar6.f456856d) != null) {
            java.util.Iterator it = linkedList2.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                r45.p5 p5Var = ((r45.s5) it.next()).f467047i;
                if (((p5Var == null || (l5Var = p5Var.f464286d) == null || l5Var.f460671d != i17) ? false : true) && p5Var.f464287e.size() == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC16899xcafbd5ba.getF235957w(), "delete msg " + i17 + " and index " + fVar.f521162b);
                    it.remove();
                }
            }
        }
        r45.tj6 t08 = abstractC16899xcafbd5ba.t0(abstractC16899xcafbd5ba.m0());
        if (t08 != null && (glVar5 = t08.f468042e) != null && (linkedList = glVar5.f456860h) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "iterator(...)");
            while (it6.hasNext()) {
                r45.s5 s5Var = (r45.s5) it6.next();
                java.util.LinkedList linkedList3 = s5Var.f467047i.f464287e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList3);
                java.util.Iterator it7 = linkedList3.iterator();
                int i18 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i18 = -1;
                        break;
                    }
                    r45.z5 z5Var = ((r45.o5) it7.next()).R;
                    if (z5Var != null && z5Var.f473251e == i17) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i18 != -1) {
                    if (linkedList3.size() == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC16899xcafbd5ba.getF235957w(), "delete featured msg " + i17 + " from " + abstractC16899xcafbd5ba.u0() + ".FeaturedList (single detail)");
                        it6.remove();
                    } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7.h(abstractC16899xcafbd5ba.n0(), s5Var, java.lang.Integer.valueOf(i17), null, 4, null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC16899xcafbd5ba.getF235957w(), abstractC16899xcafbd5ba.u0() + " feature list delete detail appMsgId=" + i17);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(abstractC16899xcafbd5ba.getF235957w(), abstractC16899xcafbd5ba.u0() + " removeDetailInfoFromMsg failed");
                    }
                }
            }
        }
        r45.tj6 t09 = abstractC16899xcafbd5ba.t0(abstractC16899xcafbd5ba.m0());
        r45.ul ulVar = null;
        java.util.List list = (t09 == null || (glVar4 = t09.f468042e) == null) ? null : glVar4.f456856d;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        java.util.List list2 = list;
        r45.tj6 t010 = abstractC16899xcafbd5ba.t0(abstractC16899xcafbd5ba.m0());
        java.util.LinkedList linkedList4 = (t010 == null || (glVar3 = t010.f468042e) == null) ? null : glVar3.f456860h;
        r45.tj6 t011 = abstractC16899xcafbd5ba.t0(abstractC16899xcafbd5ba.m0());
        java.lang.Integer valueOf = (t011 == null || (glVar2 = t011.f468042e) == null) ? null : java.lang.Integer.valueOf(glVar2.f456861i);
        r45.tj6 t012 = abstractC16899xcafbd5ba.t0(abstractC16899xcafbd5ba.m0());
        if (t012 != null && (glVar = t012.f468042e) != null) {
            ulVar = glVar.f456859g;
        }
        r45.ul ulVar2 = ulVar;
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b.c(abstractC16899xcafbd5ba.m0(), abstractC16899xcafbd5ba.mo7438x76847179());
        if (c17 == null) {
            c17 = "";
        }
        this.f530360d.H0(list2, linkedList4, ulVar2, c17, valueOf);
    }
}
