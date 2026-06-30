package wr3;

/* loaded from: classes11.dex */
public final class j1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2 f530357d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2 c16901x75950f2) {
        this.f530357d = c16901x75950f2;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        int i17;
        java.util.LinkedList linkedList;
        vr3.f fVar = (vr3.f) obj;
        if (fVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2 c16901x75950f2 = this.f530357d;
        java.util.Iterator it = c16901x75950f2.f235973v.f456856d.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (true) {
            boolean hasNext = it.hasNext();
            str = c16901x75950f2.f235968q;
            boolean z17 = false;
            i17 = fVar.f521161a;
            if (!hasNext) {
                break;
            }
            r45.s5 s5Var = (r45.s5) it.next();
            r45.p5 p5Var = s5Var.f467047i;
            if (p5Var != null) {
                java.util.LinkedList linkedList2 = p5Var.f464287e;
                r45.l5 l5Var = p5Var.f464286d;
                if (l5Var != null && l5Var.f460671d == i17) {
                    z17 = true;
                }
                if (z17) {
                    int size = linkedList2.size();
                    int i18 = fVar.f521162b;
                    if (size == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "delete msg " + i17 + " and index " + i18);
                        it.remove();
                    } else if (!c16901x75950f2.s0(s5Var, new wr3.g1(i18), new wr3.h1(i17))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "skip delete for msg " + i17 + " index " + i18 + " to avoid empty DetailInfo");
                    }
                } else if (linkedList2.size() > 1 && !c16901x75950f2.s0(s5Var, new wr3.i1(i17), wr3.c1.f530297d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "skip delete for slide msg " + i17 + " to avoid empty DetailInfo");
                }
            }
        }
        r45.gl glVar = c16901x75950f2.m0().f470768f;
        if (glVar != null && (linkedList = glVar.f456860h) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "iterator(...)");
            while (it6.hasNext()) {
                r45.s5 s5Var2 = (r45.s5) it6.next();
                r45.p5 p5Var2 = s5Var2.f467047i;
                java.util.LinkedList linkedList3 = p5Var2 != null ? p5Var2.f464287e : null;
                if (linkedList3 == null) {
                    break;
                }
                java.util.Iterator it7 = linkedList3.iterator();
                int i19 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    r45.z5 z5Var = ((r45.o5) it7.next()).R;
                    if (z5Var != null && z5Var.f473251e == i17) {
                        break;
                    } else {
                        i19++;
                    }
                }
                if (i19 != -1) {
                    if (linkedList3.size() == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "delete featured msg " + i17 + " from all msg.FeaturedList (single detail)");
                        it6.remove();
                    } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7.h(c16901x75950f2.n0(), s5Var2, java.lang.Integer.valueOf(i17), null, 4, null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "all msg feature list delete detail appMsgId=" + i17);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "all msg removeDetailInfoFromMsg failed");
                    }
                }
            }
        }
        wr3.t0 t0Var = c16901x75950f2.f235972u;
        if (t0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
            throw null;
        }
        r45.gl glVar2 = c16901x75950f2.m0().f470768f;
        java.lang.Integer valueOf = glVar2 != null ? java.lang.Integer.valueOf(glVar2.f456861i) : null;
        r45.gl glVar3 = c16901x75950f2.m0().f470768f;
        t0Var.N(c16901x75950f2.f235973v, valueOf, glVar3 != null ? glVar3.f456860h : null, c16901x75950f2.f235974w);
    }
}
