package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public abstract class f1 {
    public static java.lang.String a() {
        c34.u Ri = c34.h0.Ri();
        Ri.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = Ri.f119776d.f("SELECT * FROM " + Ri.mo145255x88e404c3() + " where status != 1", null, 2);
        if (f17 != null) {
            while (f17.moveToNext()) {
                c34.t tVar = new c34.t();
                tVar.mo9015xbf5d97fd(f17);
                arrayList.add(tVar);
            }
            f17.close();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb6.append(((c34.t) it.next()).f4160x13320504);
            sb6.append("|");
        }
        return sb6.toString();
    }

    public static void b(android.widget.ImageView imageView, java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        if (imageView == null) {
            return;
        }
        imageView.setImageBitmap(null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        o11.f fVar = new o11.f();
        if (gm0.j1.a()) {
            if (c34.h0.f119725q == null) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c01.d9.b().f());
                c34.h0.f119725q = r6Var;
                r6Var.J();
            }
            str2 = java.lang.String.format("%s/Sk_%s", c01.d9.b().f(), kk.k.g(str.getBytes()));
        } else {
            str2 = "";
        }
        fVar.f423615f = str2;
        fVar.f423611b = true;
        fVar.f423628s = true;
        fVar.f423629t = z17;
        if (i17 != 0) {
            fVar.f423626q = i17;
        }
        n11.a.b().h(str, imageView, fVar.a());
    }
}
