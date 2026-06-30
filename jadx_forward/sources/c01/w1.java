package c01;

@j95.b
/* loaded from: classes4.dex */
public class w1 extends i95.w implements rv1.e {
    public boolean wi(java.lang.String str) {
        java.util.List m17 = c01.v1.m(str);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (m17 != null) {
            linkedList.addAll(m17);
        }
        linkedList.remove(gm0.j1.u().c().l(2, null));
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = a17.W0(str);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            linkedList2.add((java.lang.String) linkedList.get(i17));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
            W0.f69107x5be1edb3 = "";
        }
        W0.U0(linkedList2);
        W0.f69094xd1f9ba88 = c01.v1.j(linkedList2, str);
        W0.f69098xbcb1bed0 = linkedList2.size();
        return a17.mo11260x413cb2b4(W0);
    }
}
