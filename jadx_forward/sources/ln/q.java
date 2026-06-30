package ln;

/* loaded from: classes11.dex */
public class q implements vg3.q4 {
    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = "null";
        boolean z17 = false;
        if (a3Var != null) {
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a3Var.f69081x1856cb8d)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str2);
                    java.lang.Object[] objArr = new java.lang.Object[4];
                    objArr[0] = str;
                    objArr[1] = java.lang.Boolean.valueOf(a3Var.J0());
                    objArr[2] = str2;
                    if (z07 != null) {
                        str3 = java.lang.Boolean.valueOf(z07.J0());
                    }
                    objArr[3] = str3;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "associateRoomName %s finish %s, imunionRoomName %s finish %s", objArr);
                    if (z07 != null && !z07.J0()) {
                        z07.f69102x22419ccf = 2;
                        z07.f69081x1856cb8d = str;
                        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(z07);
                        z17 = true;
                    }
                    if (z17) {
                        a3Var.f69102x22419ccf = 1;
                    } else {
                        a3Var.f69102x22419ccf = 3;
                    }
                    a3Var.f69081x1856cb8d = str2;
                    ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(a3Var);
                    if (z17) {
                        ((nn.j) i95.n0.c(nn.j.class)).Ni().c(str, str2);
                        return;
                    }
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "handleInfo Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                return;
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        if (a3Var != null) {
            java.lang.String str4 = a3Var.f69081x1856cb8d;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            str3 = str4 == null ? "" : str4;
        }
        objArr2[0] = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "handleInfo member:%s", objArr2);
    }

    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = "";
        if (!(str == null ? "" : str).equals("IMUnionRoom2AssociateRoom")) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "consumeNewXml subType:%s", objArr);
        if (map == null) {
            return null;
        }
        try {
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.associateroomname");
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String trim = str3.trim();
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.imunionroomname");
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String trim2 = str4.trim();
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = trim2 == null ? "" : trim2;
            if (trim != null) {
                str2 = trim;
            }
            objArr2[1] = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "consumeNewXml %s %s", objArr2);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(trim) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim2)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(trim);
                if (z07 == null) {
                    ((c01.k7) c01.n8.a()).b(trim, 8, new ln.p(this, trim, trim2));
                } else {
                    b(z07, trim, trim2);
                }
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "consumeNewXml Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            return null;
        }
    }
}
