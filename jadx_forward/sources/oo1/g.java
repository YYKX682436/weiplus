package oo1;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final oo1.g f428676a = new oo1.g();

    public final java.lang.CharSequence a(android.content.Context ctx, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return (java.lang.CharSequence) b(ctx, kz5.b0.c(username)).get(0);
    }

    public final java.util.List b(android.content.Context ctx, java.util.List usernames) {
        java.lang.String e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernames, "usernames");
        if (usernames.isEmpty()) {
            return kz5.p0.f395529d;
        }
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(usernames, 10));
        java.util.Iterator it = usernames.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                ((sg3.a) v0Var).getClass();
                e17 = c01.a2.f(str, str);
            } else {
                ((sg3.a) v0Var).getClass();
                e17 = c01.a2.e(str);
            }
            ((ke0.e) xVar).getClass();
            arrayList.add(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(ctx, e17));
        }
        return arrayList;
    }

    public final java.util.List c() {
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        oo1.f fVar = oo1.f.f428675d;
        android.database.Cursor y17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().y("@all.contact.android", null, kz5.n0.S0(c01.e2.i()), null, true, false);
        while (true) {
            try {
                boolean z17 = true;
                if (!y17.moveToNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(y17);
                if ((z3Var.m124896xfb85f7b0() & 7) == 0 || z3Var.k2()) {
                    z17 = false;
                }
                if (z17) {
                    java.lang.String d17 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    if (((java.lang.Boolean) fVar.mo146xb9724478(d17)).booleanValue()) {
                        hashSet.add(z3Var.d1());
                    }
                }
                hashSet2.add(z3Var.d1());
            } finally {
            }
        }
        vz5.b.a(y17, null);
        ot5.g.c("ConversationQueryHelper", "After contact table: validSize=" + hashSet.size() + ", invalidSize=" + hashSet2.size());
        android.database.Cursor s17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().s(1, kn1.k.s(), "*", -1);
        try {
            int columnIndex = s17.getColumnIndex(dm.i4.f66875xa013b0d5);
            while (s17.moveToNext()) {
                java.lang.String string = s17.getString(columnIndex);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                if (((java.lang.Boolean) fVar.mo146xb9724478(string)).booleanValue() && !hashSet2.contains(string)) {
                    if (!r26.i0.y(string, "gh_", false) || hashSet.contains(string)) {
                        hashSet3.add(string);
                    } else {
                        ot5.g.c("ConversationQueryHelper", "Ignore talker=" + string);
                    }
                }
            }
            vz5.b.a(s17, null);
            for (java.lang.String str : hashSet) {
                if (!r26.i0.A(str, "gh_", false, 2, null) && !hashSet3.contains(str)) {
                    ot5.g.c("ConversationQueryHelper", "Merge talker=" + str + " into result set from contact");
                    hashSet3.add(str);
                }
            }
            ot5.g.c("ConversationQueryHelper", "After conversation table: resultSize=" + hashSet3.size());
            return kz5.n0.S0(hashSet3);
        } finally {
        }
    }
}
