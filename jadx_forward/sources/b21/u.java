package b21;

/* loaded from: classes11.dex */
public abstract class u extends b21.s {
    public static b21.r b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, b21.t tVar) {
        r45.xs4 xs4Var;
        b21.r a17 = b21.s.a(i17, str, str2, (tVar == null || (xs4Var = tVar.f98899b) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var.m75945x2fec8307(4))) ? str3 : tVar.f98899b.m75945x2fec8307(4), str4, str5, str6, str7, str8, str9, str10, str11);
        d(a17, tVar);
        return a17;
    }

    public static b21.r c(java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, int i17, b21.t tVar) {
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        if (c19807x593d1720 == null || (a90Var = c19807x593d1720.f39014x86965dde) == null || (linkedList = a90Var.f451373h) == null || linkedList.size() <= 0) {
            return null;
        }
        r45.jj4 jj4Var = (r45.jj4) c19807x593d1720.f39014x86965dde.f451373h.get(0);
        if (jj4Var == null) {
            return null;
        }
        b21.r rVar = new b21.r();
        rVar.f98878d = i17;
        rVar.f98879e = c19807x593d1720.Id;
        rVar.f98880f = 0.0f;
        rVar.f98883i = "";
        if (!android.text.TextUtils.isEmpty(jj4Var.P)) {
            rVar.f98895x = jj4Var.P;
        }
        rVar.f98884m = jj4Var.f459393i;
        rVar.f98889r = null;
        rVar.f98888q = jj4Var.Q;
        rVar.f98881g = jj4Var.f459397o;
        r45.xs4 xs4Var = c19807x593d1720.f39014x86965dde.f451385w;
        if (xs4Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var.m75945x2fec8307(4))) {
            rVar.f98882h = jj4Var.f459390f;
        } else {
            rVar.f98882h = c19807x593d1720.f39014x86965dde.f451385w.m75945x2fec8307(4);
        }
        r45.xs4 xs4Var2 = c19807x593d1720.f39014x86965dde.f451385w;
        if (xs4Var2 != null) {
            rVar.P = xs4Var2.m75945x2fec8307(11);
        }
        r45.a90 a90Var2 = c19807x593d1720.f39014x86965dde;
        rVar.f98887p = a90Var2 != null ? a90Var2.f451372g : null;
        rVar.f98886o = jj4Var.f459401q;
        rVar.f98885n = jj4Var.f459391g;
        rVar.f98892u = jj4Var.f459395m;
        rVar.f98894w = jj4Var.f459388d;
        rVar.f98891t = c19807x593d1720.f39012x33e0f24f.f472379d;
        rVar.f98897z = c19807x593d1720.f39018xf3f56116;
        rVar.f98877J = c19807x593d1720.Id;
        rVar.T = true;
        ((ja0.e0) ((ka0.j0) i95.n0.c(ka0.j0.class))).getClass();
        rVar.M = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_use_network_data_play, bm5.h0.RepairerConfig_Mv_UseNetworkDataPlay_Int, 0) == 1;
        d(rVar, tVar);
        return rVar;
    }

    public static void d(b21.r rVar, b21.t tVar) {
        r45.xs4 xs4Var;
        ka0.j0 j0Var = (ka0.j0) i95.n0.c(ka0.j0.class);
        java.lang.String str = rVar.f98891t;
        ((ja0.e0) j0Var).getClass();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wx5aa333606550dfd5", str)) {
            rVar.T = true;
        } else if (tVar != null) {
            rVar.T = !zy2.qc.a(tVar.f98899b);
        } else {
            rVar.T = false;
        }
        if (tVar != null && (xs4Var = tVar.f98899b) != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var.m75945x2fec8307(14)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98881g)) {
                xs4Var.set(14, rVar.f98881g);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var.m75945x2fec8307(15)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f98888q)) {
                xs4Var.set(15, rVar.f98888q);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var.m75945x2fec8307(11))) {
                rVar.P = xs4Var.m75945x2fec8307(11);
            }
        }
        ((ll3.k2) ((c21.j) i95.n0.c(c21.j.class))).getClass();
        ll3.q0.e(rVar, tVar);
    }
}
