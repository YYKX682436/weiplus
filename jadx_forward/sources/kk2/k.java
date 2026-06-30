package kk2;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk2.p f390030d;

    public k(kk2.p pVar) {
        this.f390030d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        c50.m0 y17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252;
        c50.m0 y18;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253;
        c50.m0 y19;
        kk2.p pVar = this.f390030d;
        r45.fa2 fa2Var = pVar.f390047s;
        if (fa2Var != null) {
            java.util.LinkedList card_list = fa2Var.f455662h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_list, "card_list");
            r45.ea2 ea2Var = (r45.ea2) kz5.n0.a0(card_list, 0);
            if (ea2Var != null && (c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2)) != null && (y19 = pVar.y()) != null) {
                fg2.s1 s1Var = pVar.f390043o;
                if (s1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14366x19fff717 liveOne = s1Var.f343834g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveOne, "liveOne");
                c50.m0.a(y19, c19792x256d27253, liveOne, null, null, null, false, 60, null);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_list, "card_list");
            r45.ea2 ea2Var2 = (r45.ea2) kz5.n0.a0(card_list, 1);
            if (ea2Var2 != null && (c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var2.m75936x14adae67(2)) != null && (y18 = pVar.y()) != null) {
                fg2.s1 s1Var2 = pVar.f390043o;
                if (s1Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14366x19fff717 liveTwo = s1Var2.f343836i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveTwo, "liveTwo");
                c50.m0.a(y18, c19792x256d27252, liveTwo, null, null, null, false, 60, null);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_list, "card_list");
            r45.ea2 ea2Var3 = (r45.ea2) kz5.n0.a0(card_list, 2);
            if (ea2Var3 == null || (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var3.m75936x14adae67(2)) == null || (y17 = pVar.y()) == null) {
                return;
            }
            fg2.s1 s1Var3 = pVar.f390043o;
            if (s1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14366x19fff717 liveThree = s1Var3.f343835h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveThree, "liveThree");
            c50.m0.a(y17, c19792x256d2725, liveThree, null, null, null, false, 60, null);
        }
    }
}
