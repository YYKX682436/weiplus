package fm3;

/* loaded from: classes10.dex */
public final class h {
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3 data, fm3.q item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        item.f345642g = 2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = data.f233485b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
        item.f345645m = new fm3.k(c19792x256d2725);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
        item.f345646n = new fm3.l(c19792x256d2725);
    }

    public final fm3.q b(r45.jf2 jf2Var, ll3.h1 h1Var, java.util.List list) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        fm3.q qVar = new fm3.q();
        if (h1Var != null && h1Var.e() > 1) {
            qVar.f345639d = h1Var;
        }
        qVar.f345640e = (int) jf2Var.m75942xfb822ef2(0);
        qVar.f345641f = (int) (jf2Var.m75942xfb822ef2(0) + jf2Var.m75939xb282bd08(1));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19792x256d2725.m76803x6c285d75(), jf2Var.m75945x2fec8307(3)) && (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.a0(m76962x74cd162e, 0)) != null) {
                if (jf2Var.m75942xfb822ef2(2) != 0) {
                    qVar.f345645m = new fm3.k(c19792x256d2725);
                    qVar.f345646n = new fm3.l(c19792x256d2725);
                    qVar.f345642g = 2;
                } else {
                    java.lang.String m76625xb5887639 = c19788xd7cfd73e.m76625xb5887639();
                    if (m76625xb5887639 == null) {
                        m76625xb5887639 = "";
                    }
                    qVar.f345645m = new fm3.g("", m76625xb5887639);
                    java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76803x6c285d75);
                    java.lang.String m76625xb58876392 = c19788xd7cfd73e.m76625xb5887639();
                    qVar.f345646n = new fm3.p(m76803x6c285d75, m76625xb58876392 == null ? "" : m76625xb58876392, c19788xd7cfd73e.m76629x36bbd779() * 1000, (int) c19788xd7cfd73e.m76632x755bd410(), (int) c19788xd7cfd73e.m76605x1c4fb41d());
                    qVar.f345642g = 1;
                }
                fm3.o oVar = qVar.f345646n;
                if (oVar != null) {
                    oVar.a(jf2Var.m75942xfb822ef2(4));
                }
            }
        }
        return qVar;
    }

    public final void c(fm3.q item, fm3.q newItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newItem, "newItem");
        newItem.f345639d = item.f345639d;
        newItem.f345640e = item.f345640e;
        newItem.f345641f = item.f345641f;
        newItem.f345643h = item.f345643h;
        newItem.f345644i = item.f345644i;
    }
}
