package wr3;

/* loaded from: classes11.dex */
public final class h0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba f530345d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba abstractC16899xcafbd5ba) {
        this.f530345d = abstractC16899xcafbd5ba;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.l5 l5Var;
        r45.y5 y5Var;
        r45.p5 p5Var;
        r45.l5 l5Var2;
        r45.y5 y5Var2;
        r45.gl glVar;
        r45.gl glVar2;
        r45.gl glVar3;
        r45.gl glVar4;
        r45.wl wlVar = (r45.wl) obj;
        if (wlVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba abstractC16899xcafbd5ba = this.f530345d;
        r45.tj6 t07 = abstractC16899xcafbd5ba.t0(wlVar);
        r45.ul ulVar = null;
        java.util.List list = (t07 == null || (glVar4 = t07.f468042e) == null) ? null : glVar4.f456856d;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        java.util.List list2 = list;
        java.util.LinkedList linkedList = (t07 == null || (glVar3 = t07.f468042e) == null) ? null : glVar3.f456860h;
        java.lang.Integer valueOf = (t07 == null || (glVar2 = t07.f468042e) == null) ? null : java.lang.Integer.valueOf(glVar2.f456861i);
        if (t07 != null && (glVar = t07.f468042e) != null) {
            ulVar = glVar.f456859g;
        }
        r45.ul ulVar2 = ulVar;
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b.c(wlVar, abstractC16899xcafbd5ba.mo7438x76847179());
        if (c17 == null) {
            c17 = "";
        }
        java.lang.String str = c17;
        abstractC16899xcafbd5ba.F0(abstractC16899xcafbd5ba.m0(), t07);
        r45.s5 s5Var = (r45.s5) kz5.n0.Z(list2);
        int i17 = (s5Var == null || (y5Var2 = s5Var.f467042d) == null) ? 0 : y5Var2.f472325f;
        java.util.Iterator it = abstractC16899xcafbd5ba.f235962s.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            vr3.h hVar = (vr3.h) next;
            r45.s5 s5Var2 = hVar.f521164a;
            int i18 = (s5Var2 == null || (p5Var = s5Var2.f467047i) == null || (l5Var2 = p5Var.f464286d) == null) ? 0 : l5Var2.f460671d;
            int i19 = (s5Var2 == null || (y5Var = s5Var2.f467042d) == null) ? 0 : y5Var.f472325f;
            if (hVar.f521165b != wr3.n0.f530378i || i19 >= i17) {
                java.util.Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    r45.p5 p5Var2 = ((r45.s5) it6.next()).f467047i;
                    if ((p5Var2 == null || (l5Var = p5Var2.f464286d) == null || l5Var.f460671d != i18) ? false : true) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s.class)).wi(i18);
                        it.remove();
                    }
                }
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s.class)).wi(i18);
                it.remove();
            }
        }
        this.f530345d.H0(list2, linkedList, ulVar2, str, valueOf);
        abstractC16899xcafbd5ba.o0().a(abstractC16899xcafbd5ba.q0(wlVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC16899xcafbd5ba.getF235957w(), "refresh topic");
    }
}
