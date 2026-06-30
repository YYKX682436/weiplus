package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class t1 {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f238558b = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f238557a = new java.lang.Object();

    public void a(java.lang.String str) {
        java.util.List b17 = b();
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        arrayList.add(str);
        if (arrayList.size() > 50) {
            b17 = arrayList.subList(arrayList.size() - 50, arrayList.size());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = b17.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            if (i17 != b17.size() - 1) {
                sb6.append(",");
            }
            i17++;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REMITTANCE_PAYMSGID_STRING_SYNC, sb6.toString());
    }

    public final java.util.List b() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REMITTANCE_PAYMSGID_STRING_SYNC, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String[] split = str.split(",");
            if (split.length > 0) {
                arrayList.addAll(java.util.Arrays.asList(split));
            }
        }
        return arrayList;
    }

    public boolean c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        boolean z17;
        ot0.q qVar;
        boolean D0;
        if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceLocalMsgMgr", "msgxml or toUserName or antiRepeatid is null");
            return false;
        }
        synchronized (this) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? false : ((java.util.ArrayList) b()).contains(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceLocalMsgMgr", "it is a duplicate msg");
                z17 = false;
            } else {
                a(str);
                z17 = true;
            }
        }
        if (!z17) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.d1(str2);
        f9Var.r1(2);
        f9Var.u1(str3);
        f9Var.e1(c01.w9.o(str3));
        f9Var.j1(1);
        f9Var.m124850x7650bebc(419430449);
        long M9 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        if (M9 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceLocalMsgMgr", fp.k.c() + "insert msg failed :" + M9);
            java.util.ArrayList arrayList = (java.util.ArrayList) b();
            arrayList.remove(str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                if (i17 != arrayList.size() - 1) {
                    sb6.append(",");
                }
                i17++;
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REMITTANCE_PAYMSGID_STRING_SYNC, sb6.toString());
            return false;
        }
        f9Var.m124849x5361953a(M9);
        if (f9Var.k2()) {
            v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
            int a17 = ot0.u.a(f9Var);
            ((u90.a) vVar).getClass();
            com.p314xaae8f345.mm.p959x883644fd.e.f153038a.a(f9Var, a17);
        } else {
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
            com.p314xaae8f345.mm.p959x883644fd.e.f153038a.b(f9Var);
        }
        ot0.t tVar = new ot0.t();
        tVar.f67771x4b6e9352 = f9Var.j();
        if (str2 != null) {
            qVar = ot0.q.v(f9Var.U1());
            if (qVar != null) {
                tVar.f67769x29dd02d3 = qVar.f430187f;
                tVar.f67764x4f4dc37 = qVar.f430191g;
            }
        } else {
            qVar = null;
        }
        tVar.f67770x2262335f = 2000;
        tVar.f67765x297eb4f7 = M9;
        tVar.f67767x436b2035 = f9Var.Q0();
        tVar.f67766xd09be28e = f9Var.I0();
        ot0.t y07 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(str3, M9);
        if (y07 == null || y07.f67765x297eb4f7 != M9) {
            D0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).D0(tVar);
            if (!D0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceLocalMsgMgr", "PinOpenApi.getAppMessageStorage().insert msg failed id:" + M9);
            }
        } else {
            D0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(tVar, new java.lang.String[0]);
        }
        if (qVar != null) {
            rw3.c cVar = new rw3.c();
            cVar.f68617x512156d6 = f9Var.m124847x74d37ac6();
            cVar.f68622x5231a6cb = qVar.L0;
            cVar.f68618xd3086e30 = -1;
            cVar.f68616xff7bdab7 = true;
            cVar.f68621x114ef53e = str3;
            cVar.f68620xdf27f83f = str4;
            kw3.p.Ai().Ni().mo11260x413cb2b4(cVar);
        }
        return D0;
    }

    public boolean d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = (java.lang.String) this.f238558b.get(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            return c(str, str4, str2, str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemittanceLocalMsgMgr", "empty transid: %s", str);
        return false;
    }

    public boolean e(java.lang.String str, java.lang.String str2, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.j1(0);
        f9Var.r1(6);
        f9Var.u1(str);
        f9Var.d1(str2);
        if (j17 > 0) {
            f9Var.e1(j17);
        } else {
            f9Var.e1(c01.w9.o(str));
        }
        f9Var.m124850x7650bebc(10000);
        long M9 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceLocalMsgMgr", "sendLocalSysMsg msgId:" + M9);
        return M9 >= 0;
    }
}
