package so3;

/* loaded from: classes9.dex */
public class u implements xg3.i0 {
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0075. Please report as an issue. */
    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 M1;
        if (z65.c.f551991d) {
            return;
        }
        st0.e wi6 = ((ro3.e) i95.n0.c(ro3.e.class)).wi();
        if (wi6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifyMsgChangeListener", "get message notify storage return null");
            return;
        }
        if (m0Var == null || (arrayList = l0Var.f535945c) == null || arrayList.isEmpty()) {
            if ("delete".equals(l0Var.f535944b)) {
                java.lang.String str = l0Var.f535943a;
                if ("notifymessage".equals(str) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(str) == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyMsgChangeListener", "clear service notify record");
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.z9) wi6).m145253xb158737d("NotifyMessageRecord", "DELETE FROM NotifyMessageRecord");
                    return;
                }
                return;
            }
            return;
        }
        java.util.Iterator it = l0Var.f535945c.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            if (f9Var != null && "notifymessage".equals(l0Var.f535943a) && (M1 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.M1(f9Var)) != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z9 z9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z9) wi6;
                java.lang.String P0 = z9Var.P0(f9Var);
                java.lang.String z07 = z9Var.z0(f9Var);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyMsgChangeListener", "username is null or nil");
                } else {
                    M1.u1(P0);
                }
                java.lang.String str2 = l0Var.f535944b;
                str2.getClass();
                char c17 = 65535;
                switch (str2.hashCode()) {
                    case -1335458389:
                        if (str2.equals("delete")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case -1183792455:
                        if (str2.equals("insert")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case -838846263:
                        if (str2.equals("update")) {
                            c17 = 2;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        z9Var.y0(M1);
                        break;
                    case 1:
                        z9Var.W0(M1, z07);
                        break;
                    case 2:
                        z9Var.i1(M1, z07);
                        break;
                }
            }
        }
    }
}
