package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class im {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.im f188579a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.im();

    public final so2.k a(r45.gk2 lbsSection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lbsSection, "lbsSection");
        r45.dh2 dh2Var = new r45.dh2();
        dh2Var.set(0, 1);
        dh2Var.set(2, lbsSection);
        return b(dh2Var);
    }

    public final so2.k b(r45.dh2 dh2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ja0 ja0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ja0(dh2Var);
        r45.dh2 dh2Var2 = ja0Var.f208525a;
        int m75939xb282bd08 = dh2Var2.m75939xb282bd08(0);
        if (m75939xb282bd08 == 1) {
            r45.gk2 gk2Var = (r45.gk2) dh2Var2.m75936x14adae67(2);
            if (gk2Var == null) {
                gk2Var = new r45.gk2();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o90 o90Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o90(gk2Var);
            ja0Var.f208526b = o90Var;
            ja0Var.f208527c = null;
            ja0Var.f208528d = null;
            ja0Var.f208530f = o90Var.c().m75939xb282bd08(3) + 1000;
            ja0Var.f208531g = ((java.lang.Number) ((jz5.n) o90Var.f208833c).mo141623x754a37bb()).longValue() + (ja0Var.f208526b != null ? r8.hashCode() : 0);
        } else if (m75939xb282bd08 == 2) {
            ja0Var.f208526b = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) dh2Var2.m75936x14adae67(3);
            if (c19792x256d2725 == null) {
                c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = h90Var.a(c19792x256d2725, 0);
            ja0Var.f208527c = a17;
            ja0Var.f208528d = null;
            ja0Var.f208530f = a17.getMediaType();
            ja0Var.f208531g = a17.m59251x5db1b11();
        } else if (m75939xb282bd08 == 3) {
            ja0Var.f208526b = null;
            ja0Var.f208527c = null;
            r45.eh2 eh2Var = (r45.eh2) dh2Var2.m75936x14adae67(1);
            if (eh2Var == null) {
                eh2Var = new r45.eh2();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.la0 la0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.la0(eh2Var);
            ja0Var.f208528d = la0Var;
            ja0Var.f208530f = la0Var.f208657a.m75939xb282bd08(0);
            ja0Var.f208531g = ((java.lang.Number) ((jz5.n) la0Var.f208658b).mo141623x754a37bb()).longValue();
        } else if (m75939xb282bd08 == 4) {
            ja0Var.f208526b = null;
            ja0Var.f208527c = null;
            ja0Var.f208528d = null;
            r45.ro2 ro2Var = (r45.ro2) dh2Var2.m75936x14adae67(4);
            if (ro2Var == null) {
                ro2Var = new r45.ro2();
            }
            ja0Var.f208529e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.f0(ro2Var);
            ja0Var.f208530f = 3000;
        } else {
            ja0Var.f208526b = null;
            ja0Var.f208527c = null;
            ja0Var.f208528d = null;
            ja0Var.f208530f = 10000;
            ja0Var.f208531g = -1L;
        }
        return new so2.k(ja0Var);
    }
}
