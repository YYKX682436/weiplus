package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class a1 {
    public a1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.List a(java.util.List paths, java.util.List types, java.util.List sourceFrom) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paths, "paths");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceFrom, "sourceFrom");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        for (java.lang.Object obj : paths) {
            int i19 = i18 + 1;
            r8 = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q1 q1Var = null;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String path = (java.lang.String) obj;
            java.lang.Integer num = (java.lang.Integer) kz5.n0.a0(types, i18);
            if (num != null && num.intValue() == 2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
                try {
                    qc0.d1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a.b(path);
                    if (b17 != null) {
                        int i27 = b17.f442896a;
                        int i28 = b17.f442897b;
                        long j17 = b17.f442899d;
                        int i29 = b17.f442901f;
                        if (i29 == 90 || i29 == 270) {
                            i17 = i28;
                        } else {
                            i17 = i27;
                            i27 = i28;
                        }
                        q1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q1(i17, i27, path, j17);
                    }
                } catch (java.lang.Exception e17) {
                    int i37 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SourceMaterial", e17, "createVideoSource error", new java.lang.Object[0]);
                }
                if (q1Var != null) {
                    q1Var.f257103c = ((java.lang.Number) sourceFrom.get(i18)).intValue();
                    linkedList.add(q1Var);
                }
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.p314xaae8f345.mm.p786x600aa8b.e.d(path, options);
                java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(path);
                if (E != null) {
                    try {
                        c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(E);
                        vz5.b.a(E, null);
                    } finally {
                    }
                } else {
                    c1098xe10e35e9 = null;
                }
                java.lang.Integer valueOf = c1098xe10e35e9 != null ? java.lang.Integer.valueOf(c1098xe10e35e9.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 1)) : null;
                char c17 = (valueOf != null && valueOf.intValue() == 6) ? 'Z' : (valueOf != null && valueOf.intValue() == 3) ? (char) 180 : (valueOf != null && valueOf.intValue() == 8) ? (char) 270 : (char) 0;
                int i38 = options.outWidth;
                int i39 = options.outHeight;
                if (c17 == 'Z' || c17 == 270) {
                    i38 = i39;
                    i39 = i38;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.o0(i38, i39, path);
                o0Var.f257103c = ((java.lang.Number) sourceFrom.get(i18)).intValue();
                linkedList.add(o0Var);
            }
            i18 = i19;
        }
        return linkedList;
    }
}
