package r21;

/* loaded from: classes11.dex */
public abstract class a {
    public static java.util.ArrayList a(final java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u();
        final java.lang.String X8 = g9Var.X8(str);
        android.database.Cursor c17 = g9Var.Da(X8) ? ot0.c3.l().c("getCursor", new yz5.a() { // from class: com.tencent.mm.storage.g9$$z4
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                return ot0.z2.f430355a.K(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str);
            }
        }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$i5
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                java.lang.String str2 = X8;
                com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                return g9Var2.f275522r.E(str2, null, g9Var2.Z8(str), null, null, null, "createTime ASC ");
            }
        }) : g9Var.Pb(X8) ? ot0.z2.f430355a.K(g9Var.f275522r, X8, str) : g9Var.f275522r.E(X8, null, g9Var.Z8(str), null, null, null, "createTime ASC ");
        if (c17 != null && c17.getCount() != 0) {
            if (c17.moveToFirst()) {
                int i17 = 0;
                while (!c17.isAfterLast()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var.mo9015xbf5d97fd(c17);
                    c17.moveToNext();
                    if (f9Var.b3()) {
                        arrayList.add(f9Var.j());
                    } else {
                        arrayList.add("");
                    }
                    i17++;
                    if (i17 == 10) {
                        break;
                    }
                }
            }
            c17.close();
        }
        return arrayList;
    }

    public static java.util.ArrayList b(int i17, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p2621x8fb0427b.p7[] d17 = r21.w.Ai().d1(str, 10);
        if (d17 != null) {
            for (com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var : d17) {
                if (p7Var.f66494x2262335f == 1) {
                    java.lang.String str2 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(p7Var.f66491xbeb3161d).f275397f;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static java.util.ArrayList c(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p2621x8fb0427b.t8[] L0 = r21.w.Bi().L0(str, 10);
        if (L0 != null) {
            for (com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var : L0) {
                arrayList.add(t8Var.f66512x7236dff2);
            }
        }
        return arrayList;
    }

    public static java.util.ArrayList d(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p2621x8fb0427b.pa[] D0 = r21.w.Di().D0(str, 10);
        if (D0 != null) {
            for (com.p314xaae8f345.mm.p2621x8fb0427b.pa paVar : D0) {
                arrayList.add(paVar.f66542x7236dff2);
            }
        }
        return arrayList;
    }
}
