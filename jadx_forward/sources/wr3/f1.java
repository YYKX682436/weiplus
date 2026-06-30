package wr3;

/* loaded from: classes11.dex */
public final class f1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2 f530322d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2 c16901x75950f2) {
        this.f530322d = c16901x75950f2;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        r45.gl glVar;
        java.util.LinkedList linkedList;
        r45.l5 l5Var;
        r45.l5 l5Var2;
        r45.l5 l5Var3;
        r45.p5 p5Var;
        java.util.LinkedList linkedList2;
        vr3.g gVar = (vr3.g) obj;
        if (gVar == null) {
            return;
        }
        java.util.List list = gVar.f521163a;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                vr3.h hVar = (vr3.h) obj2;
                r45.s5 s5Var = hVar.f521164a;
                if ((s5Var != null && (p5Var = s5Var.f467047i) != null && (linkedList2 = p5Var.f464287e) != null && (linkedList2.isEmpty() ^ true)) && ((r45.o5) hVar.f521164a.f467047i.f464287e.get(0)).f463456p != 8) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16901x75950f2 c16901x75950f2 = this.f530322d;
        c16901x75950f2.f235974w.clear();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            glVar = c16901x75950f2.f235973v;
            linkedList = c16901x75950f2.f235974w;
            if (!hasNext) {
                break;
            }
            vr3.h hVar2 = (vr3.h) it.next();
            if (hVar2.f521164a != null) {
                if (hVar2.f521165b == wr3.n0.f530378i) {
                    java.util.LinkedList Msg = glVar.f456856d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Msg, "Msg");
                    java.util.Iterator it6 = Msg.iterator();
                    boolean z17 = false;
                    while (it6.hasNext()) {
                        r45.p5 p5Var2 = ((r45.s5) it6.next()).f467047i;
                        java.lang.Integer valueOf = (p5Var2 == null || (l5Var3 = p5Var2.f464286d) == null) ? null : java.lang.Integer.valueOf(l5Var3.f460671d);
                        r45.s5 s5Var2 = hVar2.f521164a;
                        r45.p5 p5Var3 = s5Var2.f467047i;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, (p5Var3 == null || (l5Var2 = p5Var3.f464286d) == null) ? null : java.lang.Integer.valueOf(l5Var2.f460671d))) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s.class);
                            r45.p5 p5Var4 = s5Var2.f467047i;
                            sVar.wi((p5Var4 == null || (l5Var = p5Var4.f464286d) == null) ? 0 : l5Var.f460671d);
                            z17 = true;
                        }
                    }
                    if (!z17) {
                        linkedList.add(hVar2);
                    }
                } else {
                    linkedList.add(hVar2);
                }
            }
        }
        wr3.t0 t0Var = c16901x75950f2.f235972u;
        if (t0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAdapter");
            throw null;
        }
        r45.gl glVar2 = c16901x75950f2.m0().f470768f;
        java.lang.Integer valueOf2 = glVar2 != null ? java.lang.Integer.valueOf(glVar2.f456861i) : null;
        r45.gl glVar3 = c16901x75950f2.m0().f470768f;
        t0Var.N(glVar, valueOf2, glVar3 != null ? glVar3.f456860h : null, linkedList);
    }
}
