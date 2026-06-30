package q81;

/* loaded from: classes4.dex */
public class b extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.df7 df7Var = (r45.df7) obj;
        t81.b bVar = (t81.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.b.class);
        bVar.getClass();
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(df7Var.f453938f);
        java.util.LinkedList linkedList = df7Var.f453938f;
        java.util.LinkedList linkedList2 = df7Var.f453937e;
        boolean z17 = false;
        if (L0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2)) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = java.lang.Integer.valueOf(linkedList == null ? -1 : linkedList.size());
            objArr[3] = java.lang.Integer.valueOf(linkedList2 != null ? linkedList2.size() : -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.CmdBlockCgiPersistentStorage", "saveBlockList with username(%s) appId(%s) sceneList.size(%d), blockCgi.size(%d), skip", objArr);
        } else {
            t81.a aVar = new t81.a();
            aVar.f67456xdec927b = str;
            boolean z18 = bVar.get(aVar, new java.lang.String[0]);
            aVar.f67450x28d45f97 = str2;
            aVar.f67455x1bb3b54a = df7Var.f453939g;
            aVar.f67452x14c61803 = df7Var.f453940h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(";");
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append(((java.lang.Integer) it.next()).intValue());
                sb6.append(";");
            }
            aVar.f67454x1ae4245 = sb6.toString();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(";");
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                sb7.append(((java.lang.Integer) it6.next()).intValue());
                sb7.append(";");
            }
            aVar.f67451x9f4a887e = sb7.toString();
            aVar.f67453x44eeb14 = df7Var.f453936d.f453064f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.CmdBlockCgiPersistentStorage", "saveBlockList, record( %s ), doUpdate %b", aVar, java.lang.Boolean.valueOf(z18));
            z17 = z18 ? bVar.mo9952xce0038c9(aVar, new java.lang.String[0]) : bVar.mo880xb970c2b9(aVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.CmdBlockCgiRequest", "saveBlockList with username(%s) appId(%s), ret %b", str, str2, java.lang.Boolean.valueOf(z17));
        return java.lang.Boolean.valueOf(z17);
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        return ((r45.df7) obj).f453936d;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdBlockCgiRequest";
    }
}
