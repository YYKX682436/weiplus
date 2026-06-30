package at4;

/* loaded from: classes9.dex */
public final class c2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final at4.c2 f95349d = new at4.c2();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f95350e = new java.util.HashMap();

    public final at4.z1 a(int i17, ss4.e0 e0Var, at4.a2 a2Var, boolean z17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        if (i17 == 8 || i17 == 12 || i17 == 26) {
            dt4.c Ni = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ni();
            Ni.getClass();
            android.database.Cursor f17 = Ni.f324764d.f("select * from WalletBankcardScene where scene=" + i17, null, 2);
            if (f17 == null) {
                arrayList = null;
            } else {
                if (f17.moveToFirst()) {
                    arrayList = new java.util.ArrayList();
                    do {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19092x6dc28480 c19092x6dc28480 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19092x6dc28480();
                        c19092x6dc28480.mo9015xbf5d97fd(f17);
                        arrayList.add(c19092x6dc28480);
                    } while (f17.moveToNext());
                } else {
                    arrayList = null;
                }
                f17.close();
            }
            if (arrayList == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w0.a((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19092x6dc28480) it.next()));
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList2);
        } else {
            arrayList2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        }
        java.util.ArrayList arrayList3 = arrayList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        pm0.v.b0(arrayList3, new at4.b2(h0Var, h0Var2));
        at4.v1 r17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().r();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) h0Var.f391656d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) h0Var2.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
        return new at4.z1(arrayList3, c19091x9511676c, c19091x9511676c2, r17, e0Var, a2Var, z17);
    }

    public final void b(at4.y1 y1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayBindQueryDataFetcher", "do bind query: " + y1Var.f95549a);
        ss4.e0 e0Var = new ss4.e0(null, y1Var.f95549a);
        f95350e.put(e0Var, y1Var);
        gm0.j1.d().a(385, this);
        gm0.j1.d().g(e0Var);
    }

    public final void c(ss4.e0 e0Var, at4.z1 z1Var) {
        yz5.l lVar;
        int i17 = e0Var.f493580r;
        java.util.HashMap hashMap = f95350e;
        java.util.Objects.toString(hashMap.get(e0Var));
        at4.y1 y1Var = (at4.y1) hashMap.get(e0Var);
        if (y1Var != null && (lVar = y1Var.f95552d) != null) {
            lVar.mo146xb9724478(z1Var);
        }
        hashMap.remove(e0Var);
    }

    public final void d(at4.y1 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.util.HashMap hashMap = f95350e;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getValue(), request)) {
                hashMap.remove(entry.getKey());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayBindQueryDataFetcher", "remove request " + request);
                break;
            }
        }
        if (hashMap.isEmpty()) {
            gm0.j1.d().q(385, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ss4.e0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayBindQueryDataFetcher", "on scene end: " + i17 + ", " + i18);
            if (i17 == 0 && i18 == 0) {
                ss4.e0 e0Var = (ss4.e0) m1Var;
                c(e0Var, a(e0Var.f493580r, e0Var, at4.a2.f95340e, true));
            } else {
                ss4.e0 e0Var2 = (ss4.e0) m1Var;
                c(e0Var2, a(e0Var2.f493580r, e0Var2, at4.a2.f95340e, false));
            }
        }
    }
}
