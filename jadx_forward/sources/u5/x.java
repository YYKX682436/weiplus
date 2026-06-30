package u5;

/* loaded from: classes14.dex */
public abstract class x {
    public static final u5.s a(c6.j request, r5.j imageLoader, u5.e eVar, n0.o oVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageLoader, "imageLoader");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(604402625);
        if ((i18 & 4) != 0) {
            int i19 = u5.e.f506235a;
            eVar = u5.d.f506234b;
        }
        java.lang.Object obj = request.f120363b;
        if (obj instanceof e1.g0) {
            c("ImageBitmap");
            throw null;
        }
        if (obj instanceof i1.e) {
            c("ImageVector");
            throw null;
        }
        if (obj instanceof h1.c) {
            c("Painter");
            throw null;
        }
        if (!(request.f120364c == null)) {
            throw new java.lang.IllegalArgumentException("request.target must be null.".toString());
        }
        y0Var.U(-723524056);
        y0Var.U(-3687241);
        java.lang.Object y17 = y0Var.y();
        int i27 = n0.o.f415162a;
        java.lang.Object obj2 = n0.n.f415153a;
        if (y17 == obj2) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            n0.o1 o1Var = new n0.o1(n0.d2.i(((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, y0Var));
            y0Var.g0(o1Var);
            y17 = o1Var;
        }
        y0Var.o(false);
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = ((n0.o1) y17).f415164d;
        y0Var.o(false);
        y0Var.U(-3686930);
        boolean e17 = y0Var.e(y0Var2);
        java.lang.Object y18 = y0Var.y();
        if (e17 || y18 == obj2) {
            y18 = new u5.s(y0Var2, request, imageLoader);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        u5.s sVar = (u5.s) y18;
        sVar.getClass();
        ((n0.q4) sVar.f506269v).mo148714x53d8522f(request);
        ((n0.q4) sVar.f506270w).mo148714x53d8522f(imageLoader);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<set-?>");
        sVar.f506266s = eVar;
        sVar.f506267t = ((java.lang.Boolean) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h3.f92110a)).booleanValue();
        d(sVar, request, imageLoader, y0Var, 576);
        y0Var.o(false);
        return sVar;
    }

    public static final h1.c b(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "bitmap");
            return new h1.a(e1.e.b(bitmap), 0L, 0L, 6, null);
        }
        if (drawable instanceof android.graphics.drawable.ColorDrawable) {
            return new h1.b(e1.a0.b(((android.graphics.drawable.ColorDrawable) drawable).getColor()), null);
        }
        android.graphics.drawable.Drawable mutate = drawable.mutate();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mutate, "mutate()");
        return new l8.c(mutate);
    }

    public static final java.lang.Void c(java.lang.String str) {
        throw new java.lang.IllegalArgumentException("Unsupported type: " + str + ". If you wish to display this " + str + ", use androidx.compose.foundation.Image.");
    }

    public static final void d(u5.s sVar, c6.j jVar, r5.j jVar2, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-234146095);
        boolean z17 = sVar.f506267t;
        n0.v2 v2Var = sVar.f506265r;
        if (z17) {
            android.graphics.drawable.Drawable c17 = h6.h.c(jVar, jVar.B, jVar.A, jVar.H.f120312g);
            ((n0.q4) v2Var).mo148714x53d8522f(c17 != null ? b(c17) : null);
            n0.f4 q17 = y0Var.q();
            if (q17 == null) {
                return;
            }
            ((n0.l3) q17).f415141d = new u5.t(sVar, jVar, jVar2, i17);
            return;
        }
        u5.k key = (u5.k) ((n0.q4) sVar.f506268u).mo128745x754a37bb();
        y0Var.U(-3686930);
        boolean e17 = y0Var.e(key);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj = n0.n.f415153a;
        if (e17 || y17 == obj) {
            y17 = key.a();
            y0Var.g0(y17);
        }
        y0Var.o(false);
        h1.c cVar = (h1.c) y17;
        g6.e eVar = jVar.G.f120322e;
        if (eVar == null) {
            eVar = ((r5.p) jVar2).f474090b.f120307b;
        }
        if (!(eVar instanceof g6.c)) {
            ((n0.q4) v2Var).mo148714x53d8522f(cVar);
            n0.f4 q18 = y0Var.q();
            if (q18 == null) {
                return;
            }
            ((n0.l3) q18).f415141d = new u5.u(sVar, jVar, jVar2, i17);
            return;
        }
        y0Var.U(-3686930);
        boolean e18 = y0Var.e(jVar);
        java.lang.Object y18 = y0Var.y();
        if (e18 || y18 == obj) {
            y18 = new u5.z(null);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        u5.z zVar = (u5.z) y18;
        if (key instanceof u5.i) {
            zVar.f506288a = key.a();
        }
        if (key instanceof u5.j) {
            c6.k kVar = ((u5.j) key).f506244b.f120398c;
            if (kVar.f120390c != v5.d.MEMORY_CACHE) {
                h1.c cVar2 = (h1.c) zVar.f506288a;
                d6.g gVar = jVar.G.f120320c;
                if (gVar == null) {
                    gVar = d6.g.FIT;
                }
                d6.g gVar2 = gVar;
                int i18 = ((g6.c) eVar).f350562b;
                boolean z18 = !kVar.f120391d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                y0Var.U(-1764073009);
                y0Var.U(-3686930);
                boolean e19 = y0Var.e(key);
                java.lang.Object y19 = y0Var.y();
                if (e19 || y19 == obj) {
                    y19 = new u5.a(cVar2, cVar, gVar2, i18, z18);
                    y0Var.g0(y19);
                }
                y0Var.o(false);
                y0Var.o(false);
                ((n0.q4) v2Var).mo148714x53d8522f((u5.a) y19);
                n0.f4 q19 = y0Var.q();
                if (q19 == null) {
                    return;
                }
                ((n0.l3) q19).f415141d = new u5.w(sVar, jVar, jVar2, i17);
                return;
            }
        }
        ((n0.q4) v2Var).mo148714x53d8522f(cVar);
        n0.f4 q27 = y0Var.q();
        if (q27 == null) {
            return;
        }
        ((n0.l3) q27).f415141d = new u5.v(sVar, jVar, jVar2, i17);
    }
}
