package ze5;

/* loaded from: classes9.dex */
public abstract class o6 {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        if (r5 == 14) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z01.x a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 r19, yb5.d r20, ze5.w6 r21) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.o6.a(com.tencent.mm.storage.f9, com.tencent.mm.ui.chatting.viewitems.a0, yb5.d, ze5.w6):z01.x");
    }

    public static void b(android.widget.LinearLayout linearLayout, rd5.d dVar, yb5.d ui6, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        java.lang.Object[] objArr = {ze5.y8.a(te5.q0.f500260d, te5.t0.f500283d, te5.u0.f500284d)};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        ze5.y8.b(java.util.Collections.unmodifiableList(arrayList), linearLayout, ui6, dVar, g0Var);
    }

    public static void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, yb5.d dVar) {
        ot0.q w17 = ot0.q.w(2, f9Var.j());
        if (w17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w17.f430179d)) {
            return;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = w17.f430179d;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
        if (j17 == null || !j17.k()) {
            return;
        }
        a0Var.getClass();
        if (m33.a1.a() != null) {
            int i17 = dVar.D() ? 2 : 1;
            java.lang.String t17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.t(dVar, f9Var);
            android.content.Context g17 = dVar.g();
            java.lang.String str2 = w17.f430179d;
            java.lang.String str3 = j17.f67386xa1e9e82c;
            int i18 = w17.f430199i;
            java.lang.String str4 = w17.X;
            ((com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.c) jj0.a.a()).getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportImpl", "reportDelGameMsg fail, appId is null");
                return;
            }
            if (g17 == null) {
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            android.content.pm.PackageInfo a17 = ik1.b.a(g17, str3);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.k.a(jj0.b.a(10583, str2, java.lang.Integer.valueOf(a17 == null ? 0 : a17.versionCode), nj0.a.b(), t17, java.lang.Integer.valueOf(i18), str4, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(nj0.a.a(g17))));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) r17.f542241c.a(sb5.f.class))).f280287s == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(yb5.d r17, android.view.MenuItem r18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r19) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.o6.d(yb5.d, android.view.MenuItem, com.tencent.mm.storage.f9):boolean");
    }

    public static qd5.a e(rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        ic5.e eVar = ic5.f.f371970c;
        if (eVar.b(f9Var).isEmpty()) {
            return null;
        }
        java.lang.String b17 = eVar.b(dVar.f475787d.f526833b);
        java.lang.String v17 = dVar.v();
        if (v17 == null) {
            v17 = "";
        }
        return new ze5.p6(b17, v17);
    }
}
