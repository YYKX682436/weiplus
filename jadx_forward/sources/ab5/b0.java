package ab5;

/* loaded from: classes.dex */
public class b0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceHelper", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.lh3 lh3Var = (r45.lh3) oVar.f152244b.f152233a;
        if (i17 != 0 || i18 != 0 || lh3Var == null || (linkedList = lh3Var.f461012d) == null) {
            return 0;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb6.append(((java.lang.String) it.next()) + "|");
        }
        linkedList.size();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.APPBRAND_BLOCK_QRCODE_PREFIX_STRING_SYNC, sb6.toString());
        return 0;
    }
}
