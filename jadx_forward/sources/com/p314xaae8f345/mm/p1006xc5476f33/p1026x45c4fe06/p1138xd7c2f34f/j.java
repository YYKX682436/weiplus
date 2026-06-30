package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j f166211a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j();

    public final k91.r a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f fVar) {
        java.lang.String b17;
        java.lang.String b18 = fVar.b("/app-config.json");
        boolean z17 = true;
        if (b18 == null || b18.length() == 0) {
            java.util.List a17 = fVar.a();
            if (a17 == null) {
                a17 = kz5.p0.f395529d;
            }
            java.util.Iterator it = a17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    b17 = null;
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(c11656xaf63146e.f33454x337a8b);
                java.lang.String str = c11656xaf63146e.f33454x337a8b;
                if (str == null) {
                    str = "";
                }
                sb6.append(r26.i0.n(str, "/", false) ? "" : "/");
                sb6.append("app-config.json");
                java.lang.String b19 = fVar.b(sb6.toString());
                if (b19 == null || b19.length() == 0) {
                    b18 = b19;
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(c11656xaf63146e.f33454x337a8b);
                    java.lang.String str2 = c11656xaf63146e.f33454x337a8b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb7.append(r26.i0.n(str2, "/", false) ? "" : "/");
                    sb7.append("app-config-darkmode.json");
                    b17 = fVar.b(sb7.toString());
                    b18 = b19;
                }
            }
        } else {
            b17 = fVar.b("/app-config-darkmode.json");
        }
        if (b18 == null || b18.length() == 0) {
            if (b17 != null && b17.length() != 0) {
                z17 = false;
            }
            if (z17) {
                return null;
            }
        }
        java.lang.String mo51710x74292566 = fVar.mo51710x74292566();
        if (b18 == null) {
            b18 = "{}";
        }
        if (b17 == null) {
            b17 = "{}";
        }
        return k91.r.h(mo51710x74292566, b18, b17, fVar.k(), fVar.c());
    }
}
