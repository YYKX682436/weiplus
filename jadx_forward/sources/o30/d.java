package o30;

/* loaded from: classes9.dex */
public class d implements vg3.q4 {
    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        h62.d vj6 = h62.d.vj();
        vj6.getClass();
        if (!"expt".equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService.Write", "receive expt xml but subtype[%s] is error", str);
        } else if (map == null || map.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService.Write", "receive expt xml but map is null");
        } else {
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.content");
            boolean z17 = false;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService.Write", "receive expt xml but content is null");
            } else {
                j62.a aVar = new j62.a();
                if (aVar.a(str2) && aVar.f379420o == 1 && aVar.f379412d > 0) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    if (aVar.f379414f < 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(863L, 164L, 1L);
                        linkedList.add(java.lang.Integer.valueOf(aVar.f379412d));
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(863L, 165L, 1L);
                        linkedList2.add(aVar);
                    }
                    vj6.Jj(0, linkedList, linkedList2);
                    vj6.Cj(false);
                    vj6.Dj(null, aVar);
                    z17 = true;
                }
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService.Write", "consumeNewXml xml [%s] ", str2);
            } else {
                vj6.yj(str2);
            }
        }
        return null;
    }
}
