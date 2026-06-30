package fh;

/* loaded from: classes7.dex */
public abstract class d {
    public static final void a(com.p314xaae8f345.p485x5dc4f1ad.a aVar, java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        if (aVar.f130147p) {
            ah.i.b("MagicBrush", message, new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r5.y != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.p314xaae8f345.p485x5dc4f1ad.a r8) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.d.b(com.tencent.magicbrush.a):void");
    }

    public static final void c(com.p314xaae8f345.p485x5dc4f1ad.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<this>");
        yg.f0 f0Var = aVar.f130139h;
        if (!f0Var.f543588a) {
            if (f0Var.f543592e == null) {
                a(aVar, "ImageHandler invalid, BindingImage can not use. BE CAUTIOUS!");
                return;
            }
            return;
        }
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1591x6c90f41d c1591x6c90f41d = new com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1591x6c90f41d();
        c1591x6c90f41d.mo17100xcc2da62d(new eh.e(), false);
        java.util.List list = f0Var.f543589b;
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            h8.c cVar = (h8.c) obj;
            boolean z17 = true;
            if (i17 != ((java.util.ArrayList) list).size() - 1) {
                z17 = false;
            }
            c1591x6c90f41d.mo17100xcc2da62d(cVar, z17);
            i17 = i18;
        }
        g8.i iVar = f0Var.f543590c;
        if (iVar != null) {
            c1591x6c90f41d.mo17118x8af4a1a6(iVar);
        }
        e8.b bVar = f0Var.f543591d;
        if (bVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
            c1591x6c90f41d.mo17116xdebdab98(bVar);
        }
        f0Var.f543592e = c1591x6c90f41d;
    }
}
