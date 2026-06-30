package xs5;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final xs5.c f537949a = new xs5.c();

    /* renamed from: b, reason: collision with root package name */
    public static xs5.a f537950b;

    public static /* synthetic */ void g(xs5.c cVar, xs5.b bVar, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 8) != 0) {
            z19 = false;
        }
        cVar.f(bVar, z17, z18, z19);
    }

    public final void a(r45.vs2 vs2Var, boolean z17) {
        r45.xs2 c17 = c();
        c17.set(17, 1);
        c17.set(13, java.lang.Integer.valueOf(z17 ? 1 : 0));
        vs2Var.f470021f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(c17.mo14344x5f01b1f6());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.f03 d17 = d();
        d17.f455425i = "NearbyEntrance";
        linkedList.add(d17);
        r45.f03 e17 = e();
        e17.f455425i = "NearbyLiveTab";
        e17.f455426m = "NearbyEntrance";
        linkedList.add(e17);
        vs2Var.f470022g = linkedList;
    }

    public final void b(r45.vs2 vs2Var, boolean z17, boolean z18, boolean z19, boolean z27) {
        r45.xs2 c17 = c();
        c17.set(17, 0);
        c17.set(13, java.lang.Integer.valueOf(z17 ? 1 : 0));
        r45.wo1 wo1Var = new r45.wo1();
        c17.set(0, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        wo1Var.set(0, java.lang.Boolean.TRUE);
        long j17 = z18 ? 3L : 1L;
        if (z19) {
            j17 |= 8;
        }
        if (z27) {
            j17 |= 4;
        }
        wo1Var.set(1, java.lang.Long.valueOf(j17));
        wo1Var.set(2, 100);
        wo1Var.set(3, java.lang.Long.valueOf((c01.id.c() / 1000) + 300));
        wo1Var.set(4, 60);
        c17.set(30, wo1Var);
        if (z27) {
            r45.y62 y62Var = new r45.y62();
            y62Var.set(1, java.lang.Double.valueOf(0.8d));
            y62Var.set(0, 1);
            c17.set(31, y62Var);
        }
        vs2Var.f470021f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(c17.mo14344x5f01b1f6());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.f03 d17 = d();
        d17.f455425i = "FinderLiveEntrance";
        linkedList.add(d17);
        r45.f03 e17 = e();
        e17.f455426m = "FinderLiveEntrance";
        e17.f455425i = "NearbyLiveTab";
        linkedList.add(e17);
        long m75942xfb822ef2 = c17.m75942xfb822ef2(3);
        r45.f03 f03Var = new r45.f03();
        f03Var.f455424h = 1;
        f03Var.f455427n = 1;
        f03Var.f455428o = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(new r45.j03().mo14344x5f01b1f6());
        f03Var.f455431r = f537949a.h();
        f03Var.f455420d = 15;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e c19795xce8b809e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e();
        c19795xce8b809e.set(2, 2);
        c19795xce8b809e.set(5, "testreport");
        c19795xce8b809e.set(0, java.lang.Long.valueOf(m75942xfb822ef2));
        f03Var.f455428o = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(c19795xce8b809e.mo14344x5f01b1f6());
        f03Var.f455425i = "FinderLiveEntrance";
        linkedList.add(f03Var);
        vs2Var.f470022g = linkedList;
    }

    public final r45.xs2 c() {
        r45.xs2 xs2Var = new r45.xs2();
        xs2Var.set(12, java.lang.Integer.valueOf(h()));
        xs5.a aVar = f537950b;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRedDotData");
            throw null;
        }
        xs2Var.set(3, java.lang.Long.valueOf(aVar.f537937a));
        xs2Var.set(9, 12);
        xs5.a aVar2 = f537950b;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRedDotData");
            throw null;
        }
        xs2Var.set(8, aVar2.f537940d);
        xs5.a aVar3 = f537950b;
        if (aVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRedDotData");
            throw null;
        }
        xs2Var.set(14, aVar3.f537941e);
        xs5.a aVar4 = f537950b;
        if (aVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRedDotData");
            throw null;
        }
        xs2Var.set(15, aVar4.f537942f);
        xs5.a aVar5 = f537950b;
        if (aVar5 != null) {
            xs2Var.set(16, aVar5.f537943g);
            return xs2Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRedDotData");
        throw null;
    }

    public final r45.f03 d() {
        r45.f03 f03Var = new r45.f03();
        f03Var.f455424h = 1;
        xs5.a aVar = f537950b;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRedDotData");
            throw null;
        }
        f03Var.f455423g = aVar.f537938b;
        f03Var.f455422f = "直播中";
        f03Var.f455427n = 1;
        f03Var.f455420d = 16;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e c19795xce8b809e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e();
        xs5.a aVar2 = f537950b;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRedDotData");
            throw null;
        }
        c19795xce8b809e.set(0, java.lang.Long.valueOf(aVar2.f537937a));
        c19795xce8b809e.set(2, 12);
        f03Var.f455428o = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(c19795xce8b809e.mo14344x5f01b1f6());
        return f03Var;
    }

    public final r45.f03 e() {
        r45.f03 f03Var = new r45.f03();
        f03Var.f455424h = 1;
        f03Var.f455427n = 2;
        f03Var.f455428o = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(new r45.j03().mo14344x5f01b1f6());
        f03Var.f455431r = f537949a.h();
        f03Var.f455420d = 15;
        return f03Var;
    }

    public final void f(xs5.b redDotType, boolean z17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotType, "redDotType");
        if (f537950b == null) {
            return;
        }
        r45.vs2 vs2Var = new r45.vs2();
        vs2Var.f470019d = 400000;
        vs2Var.f470024i = 0;
        vs2Var.f470020e = 16;
        vs2Var.f470023h = "test";
        r45.dz2 dz2Var = new r45.dz2();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.gz2 gz2Var = new r45.gz2();
        gz2Var.set(0, vs2Var);
        linkedList.add(gz2Var);
        dz2Var.set(0, linkedList);
        int ordinal = redDotType.ordinal();
        if (ordinal == 0) {
            b(vs2Var, true, z17, z18, z19);
        } else if (ordinal == 1) {
            b(vs2Var, false, z17, z18, z19);
        } else if (ordinal == 2) {
            a(vs2Var, true);
        } else if (ordinal == 3) {
            a(vs2Var, false);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk()).e1(dz2Var, "nearbyRedDotGenerateTest");
        ((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).getClass();
        pq2.e.f439120u = 1;
    }

    public final int h() {
        try {
            xs5.a aVar = f537950b;
            if (aVar != null) {
                return java.lang.Integer.parseInt(aVar.f537939c);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRedDotData");
            throw null;
        } catch (java.lang.NumberFormatException unused) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveCurrentTestRedDot NumberFormatException jumpTabId: ");
            xs5.a aVar2 = f537950b;
            if (aVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRedDotData");
                throw null;
            }
            sb6.append(aVar2.f537939c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyRedDotGenerate", sb6.toString());
            return 0;
        }
    }
}
