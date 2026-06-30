package ho1;

/* loaded from: classes5.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f364256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364257e;

    public j0(ho1.a1 a1Var, long j17) {
        this.f364256d = a1Var;
        this.f364257e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String e17;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.database.Cursor y17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().y("@all.contact.android", null, kz5.n0.S0(c01.e2.i()), null, true, false);
        while (y17.moveToNext()) {
            try {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(y17);
                java.lang.String d17 = z3Var.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                hashMap.put(d17, z3Var);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(y17, th6);
                    throw th7;
                }
            }
        }
        vz5.b.a(y17, null);
        ot5.g.c("ConversationQueryHelper", "contact map size = " + hashMap.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor s17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().s(1, kn1.k.s(), "*", -1);
        while (s17.moveToNext()) {
            try {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
                l4Var.mo9015xbf5d97fd(s17);
                java.lang.String h17 = l4Var.h1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getUsername(...)");
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) hashMap.get(l4Var.h1());
                if ((r26.n0.B(h17, ",", false) ? java.lang.Boolean.FALSE : (z3Var2 == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(z3Var2.f1())) ? com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(h17) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE : java.lang.Boolean.FALSE).booleanValue()) {
                    arrayList.add(l4Var);
                }
            } catch (java.lang.Throwable th8) {
                try {
                    throw th8;
                } catch (java.lang.Throwable th9) {
                    vz5.b.a(s17, th8);
                    throw th9;
                }
            }
        }
        vz5.b.a(s17, null);
        ot5.g.c("ConversationQueryHelper", "Size of allConvList is " + arrayList.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.r rVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.r();
            rVar.f297501d = l4Var2.h1();
            java.lang.String h18 = l4Var2.h1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h18, "getUsername(...)");
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(h18)) {
                ((sg3.a) v0Var).getClass();
                e17 = c01.a2.f(h18, h18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
            } else {
                ((sg3.a) v0Var).getClass();
                e17 = c01.a2.e(h18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
            }
            rVar.f297502e = e17;
            rVar.f297503f = l4Var2.w0();
            arrayList2.add(rVar);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e0 e0Var = this.f364256d.f364156b;
        if (e0Var != null) {
            e0Var.x1(this.f364257e, arrayList2);
        }
    }
}
