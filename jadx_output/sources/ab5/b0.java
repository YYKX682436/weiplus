package ab5;

/* loaded from: classes.dex */
public class b0 implements com.tencent.mm.modelbase.e3 {
    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceHelper", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.lh3 lh3Var = (r45.lh3) oVar.f70711b.f70700a;
        if (i17 != 0 || i18 != 0 || lh3Var == null || (linkedList = lh3Var.f379479d) == null) {
            return 0;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb6.append(((java.lang.String) it.next()) + "|");
        }
        linkedList.size();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.APPBRAND_BLOCK_QRCODE_PREFIX_STRING_SYNC, sb6.toString());
        return 0;
    }
}
