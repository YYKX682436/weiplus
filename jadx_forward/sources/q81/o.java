package q81;

/* loaded from: classes4.dex */
public class o extends q81.a {
    public static java.lang.String g(java.util.List list) {
        if (list == null) {
            return "null";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append(it.next().toString());
            sb6.append(',');
        }
        sb6.append("}");
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Boolean] */
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.mf7 mf7Var = (r45.mf7) obj;
        java.lang.String str3 = mf7Var.f461995e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], empty base64", str, str2);
            return java.lang.Boolean.FALSE;
        }
        java.util.LinkedList linkedList = mf7Var.f461996f;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], empty sceneList", str, str2);
            return java.lang.Boolean.FALSE;
        }
        try {
            byte[] decode = android.util.Base64.decode(str3, 0);
            r45.v54 v54Var = new r45.v54();
            v54Var.mo11468x92b714fd(decode);
            if (v54Var.f469436e.f451958d.f273689a.length == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], parse pb, invalid foreground control bytes", str, str2);
                r81.f.INSTANCE.b(mf7Var.f461994d.f453064f, 105);
                str = java.lang.Boolean.FALSE;
            } else {
                r81.f fVar = r81.f.INSTANCE;
                fVar.b(mf7Var.f461994d.f453064f, 104);
                long b17 = ik1.c0.b(mf7Var.f461997g);
                long b18 = ik1.c0.b(mf7Var.f461998h);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s| %s] WriteToStorage, sceneList %s, time[%d, %d]", str, str2, g(linkedList), java.lang.Long.valueOf(b17), java.lang.Long.valueOf(b18));
                boolean y07 = ((t81.e) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.e.class)).y0(decode, str2, linkedList, b17, b18);
                fVar.b(mf7Var.f461994d.f453064f, y07 ? 107 : 108);
                str = java.lang.Boolean.valueOf(y07);
            }
            return str;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", e17, "call[%s | %s], decode base64", str, str2);
            return java.lang.Boolean.FALSE;
        }
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        return ((r45.mf7) obj).f461994d;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdIssueLaunch";
    }
}
