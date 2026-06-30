package j11;

/* loaded from: classes11.dex */
public class m implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f378665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nd3 f378666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j11.h f378667f;

    public m(j11.h hVar, int i17, r45.nd3 nd3Var) {
        this.f378667f = hVar;
        this.f378665d = i17;
        this.f378666e = nd3Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        if (m1Var.mo808xfb85f7b0() != 182) {
            return 0;
        }
        j11.h hVar = this.f378667f;
        hVar.f378645a = false;
        int i19 = this.f378665d;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetContactService", "tryStartNetscene onSceneEnd errType:" + i17 + " errCode:" + i18 + " getScene:" + i19 + " will retry");
            hVar.f378652h.c(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            return 0;
        }
        if (!((java.util.ArrayList) hVar.f378648d).isEmpty() && hVar.f378652h.e()) {
            hVar.f378652h.c(500L, 500L);
        }
        if (oVar != null) {
            j11.p pVar = new j11.p(hVar);
            pVar.f378675c = i19;
            r45.od3 od3Var = (r45.od3) oVar.f152244b.f152233a;
            pVar.f378673a = od3Var;
            r45.nd3 nd3Var = this.f378666e;
            if (nd3Var != null && od3Var != null && (linkedList = od3Var.f463703n) != null) {
                java.util.Iterator it = linkedList.iterator();
                int i27 = 0;
                while (it.hasNext()) {
                    int i28 = i27 + 1;
                    r45.eu5 eu5Var = (r45.eu5) it.next();
                    if (eu5Var != null && eu5Var.f455266d == 1) {
                        java.util.LinkedList linkedList2 = nd3Var.f462796e;
                        r45.du5 du5Var = (r45.du5) ((linkedList2 != null && linkedList2.size() > i27) ? linkedList2.get(i27) : null);
                        java.lang.String str2 = du5Var != null ? du5Var.f454289d : null;
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
                        c6423x452b9f7c.f137646e = 2663L;
                        c6423x452b9f7c.p("GetContact");
                        c6423x452b9f7c.f137648g = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;
                        c6423x452b9f7c.f137650i = nd3Var.f462801m;
                        c6423x452b9f7c.r(str2);
                        java.util.LinkedList linkedList3 = nd3Var.f462800i;
                        r45.du5 du5Var2 = (r45.du5) ((linkedList3 != null && linkedList3.size() > i27) ? linkedList3.get(i27) : null);
                        c6423x452b9f7c.s(du5Var2 != null ? du5Var2.f454289d : null);
                        c6423x452b9f7c.t((java.lang.String) hn1.e.f363982a.get(str2));
                        c6423x452b9f7c.k();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetContactServiceHelper", "bad get contact request: scene: " + c6423x452b9f7c.f137650i + ", username: " + c6423x452b9f7c.f137653l + ", chatroom: " + c6423x452b9f7c.f137654m);
                    }
                    i27 = i28;
                }
            }
            ((java.util.ArrayList) hVar.f378649e).add(pVar);
        }
        if (!((java.util.ArrayList) hVar.f378649e).isEmpty() && hVar.f378653i.e()) {
            hVar.f378653i.c(50L, 50L);
        }
        return 0;
    }
}
