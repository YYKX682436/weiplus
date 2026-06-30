package hc2;

/* loaded from: classes2.dex */
public abstract class b0 {
    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e first;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractC14490x69736cb5, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_ring_tone_entrance_switch, true)) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = abstractC14490x69736cb5.getFeedObject().m59240x7c94657b();
        if (hc2.o0.j(m59240x7c94657b) != 4 || abstractC14490x69736cb5.getFeedObject().m59315x31740422()) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = m59240x7c94657b.m76802x2dd01666();
        if ((m76802x2dd016662 != null ? m76802x2dd016662.m76962x74cd162e() : null) != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = m59240x7c94657b.m76802x2dd01666();
            if (!((m76802x2dd016663 == null || (m76962x74cd162e2 = m76802x2dd016663.m76962x74cd162e()) == null || !m76962x74cd162e2.isEmpty()) ? false : true) && (m76802x2dd01666 = m59240x7c94657b.m76802x2dd01666()) != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (first = m76962x74cd162e.getFirst()) != null) {
                return ((long) first.m76629x36bbd779()) <= com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderRingToneVideoDurationLimit"), 300L) && (m59240x7c94657b.m76810x98d986d1() & 64) == 0;
            }
        }
        return false;
    }

    public static final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('.');
        sb6.append(k(c14989xf862ae88 != null ? c14989xf862ae88.getDescription() : null, 0, 0, 3, null));
        sb6.append('.');
        return sb6.toString();
    }

    public static final java.lang.String c(cw2.wa waVar) {
        r45.mb4 mb4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        int position = (waVar == null || (c14989xf862ae88 = waVar.f305632f) == null) ? -1 : c14989xf862ae88.getPosition();
        java.lang.String k17 = k((waVar == null || (mb4Var = waVar.f305630d) == null) ? null : mb4Var.m75945x2fec8307(9), 0, 0, 3, null);
        if (waVar == null) {
            return position + ".NULL_MEDIAINFO";
        }
        return position + '.' + k(waVar.f305632f.getDescription(), 0, 0, 3, null) + '.' + waVar.f305631e.g() + '.' + k17;
    }

    public static final java.lang.String d(so2.j5 j5Var, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('.');
        sb6.append(j5Var != null ? h(j5Var, false, 1, null) : null);
        sb6.append('.');
        return sb6.toString();
    }

    public static final java.lang.String e(so2.j5 j5Var, java.lang.String tag, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(j5Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        return tag + '.' + i17 + '.' + h(j5Var, false, 1, null);
    }

    public static final java.lang.String f(so2.j5 j5Var, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NIL.");
        java.lang.String str2 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
        if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null) {
            str2 = hc2.o0.m(feedObject2);
        }
        sb6.append(str2);
        if (z17) {
            str = ".".concat(pm0.v.u(j5Var != null ? j5Var.mo2128x1ed62e84() : 0L));
        } else {
            str = "";
        }
        sb6.append(str);
        return sb6.toString();
    }

    public static /* synthetic */ java.lang.String g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = c14989xf862ae88 != null ? c14989xf862ae88.getPosition() : -1;
        }
        return b(c14989xf862ae88, i17);
    }

    public static /* synthetic */ java.lang.String h(so2.j5 j5Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        return f(j5Var, z17);
    }

    public static final boolean i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractC14490x69736cb5, "<this>");
        g92.b bVar = g92.b.f351302e;
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.U()) && abstractC14490x69736cb5.getFeedObject().f66949xdec927b.equals(bVar.U());
    }

    public static final boolean j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractC14490x69736cb5, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String e17 = xy2.c.e(context);
        java.lang.String r17 = c01.z1.r();
        if (e17.length() > 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76760x76845fea();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m76760x76845fea != null ? m76760x76845fea.m76197x6c03c64c() : null, e17)) {
                return true;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
        if (r17.length() > 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76760x76845fea();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m76760x76845fea2 != null ? m76760x76845fea2.m76197x6c03c64c() : null, r17)) {
                return true;
            }
        }
        return false;
    }

    public static java.lang.String k(java.lang.String str, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 0;
        }
        if ((i19 & 2) != 0) {
            i18 = 4;
        }
        if (str == null || str.length() == 0) {
            return "";
        }
        int i27 = i18 + i17;
        int length = str.length();
        if (i27 > length) {
            i27 = length;
        }
        java.lang.String substring = str.substring(i17, i27);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }

    public static java.lang.String l(hc2.d dVar, int i17, so2.j5 j5Var, in5.s0 s0Var, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            s0Var = null;
        }
        if ((i27 & 8) != 0) {
            i18 = 0;
        }
        if ((i27 & 16) != 0) {
            i19 = 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FeedLifeStage.");
        sb6.append(dVar.name());
        sb6.append('.');
        sb6.append(d(j5Var, i17));
        sb6.append('.');
        sb6.append(s0Var != null ? s0Var.hashCode() : 0);
        sb6.append(".type:");
        sb6.append(i18);
        sb6.append(",poolSize:");
        sb6.append(i19);
        return sb6.toString();
    }
}
