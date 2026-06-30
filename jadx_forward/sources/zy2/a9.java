package zy2;

/* loaded from: classes10.dex */
public interface a9 {
    static boolean h(zy2.a9 a9Var, ya2.b2 ct6, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceContactIngoreInteract");
        }
        boolean z18 = true;
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.na0 na0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.na0) a9Var;
        na0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ct6, "ct");
        if (z17) {
            ct6.f69344xa783a79b = c01.id.c();
        }
        ya2.b2 y07 = na0Var.y0(ct6.D0());
        if (y07 == null) {
            long z07 = na0Var.z0(ct6);
            ct6.f72763xa3c65b86 = z07;
            if (z07 <= 0) {
                z18 = false;
            }
        } else {
            ct6.f69302xb21664aa = y07.f69302xb21664aa;
            ct6.f69316x722c2 = y07.f69316x722c2;
            ct6.f69339x744b360c = y07.f69339x744b360c;
            z18 = na0Var.L0(ct6);
        }
        if (z18) {
            na0Var.D0(ct6);
            na0Var.mo142179xf35bbb4("FinderMsgContactStorage", 4, ct6.D0());
        }
        return z18;
    }
}
