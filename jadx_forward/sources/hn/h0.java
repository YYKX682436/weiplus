package hn;

@j95.b
/* loaded from: classes13.dex */
public class h0 extends i95.w implements vg3.h4 {
    public void Ai(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str) && c01.e2.V(str)) {
            int i27 = c01.e2.T(str) ? 2 : 1;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6843x743569f3 c6843x743569f3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6843x743569f3();
            c6843x743569f3.f141644d = c6843x743569f3.b("roomid", str, true);
            c6843x743569f3.f141645e = i27;
            c6843x743569f3.f141646f = c6843x743569f3.b("appid", str2, true);
            c6843x743569f3.f141647g = c6843x743569f3.b("appname", str3, true);
            c6843x743569f3.f141648h = i17;
            c6843x743569f3.f141649i = i18;
            c6843x743569f3.f141650j = i19;
            c6843x743569f3.k();
        }
    }

    public void wi(java.lang.String str, long j17) {
        boolean z17;
        android.database.Cursor E;
        boolean z18;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        if (Li.m124847x74d37ac6() == j17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Li.X1())) {
                return;
            }
            java.lang.String X1 = Li.X1();
            rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(str, X1);
            if (z07 != null) {
                z18 = kn.j0.i(z07);
                java.util.Iterator it = ((java.util.ArrayList) z07.S).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, ((java.lang.Long) it.next()).longValue());
                    o27.s3("");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.m124847x74d37ac6(), o27, true);
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe c5759x7ac701fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe();
                am.ql qlVar = c5759x7ac701fe.f136078g;
                qlVar.f89248a = 1;
                qlVar.f89250c = X1;
                qlVar.f89249b = str;
                c5759x7ac701fe.b(android.os.Looper.getMainLooper());
            } else {
                z18 = false;
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = z07 != null ? z07.f66264x1210aac6 : "null";
            objArr[1] = java.lang.Boolean.valueOf(z18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.RoomTodoService", "deleteChatroomInfoTodo delete(%s) result:%s", objArr);
            return;
        }
        rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
        Bi.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (E = Bi.f479135d.E("GroupTodo", rn.c.T.f398487c, "roomname=? and username=? and state!=?", new java.lang.String[]{str, "roomannouncement@app.origin", "2"}, null, null, null)) != null) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (E.moveToNext()) {
                    rn.c cVar = new rn.c();
                    cVar.mo9015xbf5d97fd(E);
                    arrayList.add(cVar);
                }
                r6 = arrayList.size() != 0 ? (rn.c) arrayList.get(0) : null;
            } finally {
                E.close();
            }
        }
        if (r6 != null) {
            z17 = kn.j0.i(r6);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe c5759x7ac701fe2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe();
            am.ql qlVar2 = c5759x7ac701fe2.f136078g;
            qlVar2.f89248a = 1;
            qlVar2.f89250c = r6.f66264x1210aac6;
            qlVar2.f89249b = str;
            c5759x7ac701fe2.b(android.os.Looper.getMainLooper());
        } else {
            z17 = false;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = r6 != null ? r6.f66264x1210aac6 : "null";
        objArr2[1] = str;
        objArr2[2] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.RoomTodoService", "deleteChatroomAtAllTodo delete(%s) roomname:%s result:%s", objArr2);
    }
}
