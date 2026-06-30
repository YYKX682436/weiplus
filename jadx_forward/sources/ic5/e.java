package ic5;

/* loaded from: classes9.dex */
public final class e {
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        return b(f9Var) + (f9Var.T1() / 1000);
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        java.lang.String m161293x5db1b11;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        r15.d c17 = c(msg);
        return (c17 == null || (m161293x5db1b11 = c17.m161293x5db1b11()) == null) ? "" : m161293x5db1b11;
    }

    public final r15.d c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r15.d dVar = null;
        if (f9Var == null) {
            return null;
        }
        java.lang.String Q0 = f9Var.Q0();
        java.lang.String m66995x9616526c = tg3.l1.a(f9Var).m66995x9616526c();
        java.lang.String j17 = f9Var.j();
        int hashCode = j17 != null ? j17.hashCode() : 0;
        boolean z17 = Q0 == null || r26.n0.N(Q0);
        ic5.d dVar2 = ic5.d.f371969d;
        if (!z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q0);
            java.util.Map map = (java.util.Map) ic5.f.f371971d.c(Q0, dVar2);
            ic5.c cVar = (ic5.c) map.get(m66995x9616526c);
            if (cVar != null) {
                if (cVar.f371967a == hashCode) {
                    return cVar.f371968b;
                }
                map.remove(m66995x9616526c);
            }
        }
        if (f9Var.P2()) {
            w15.h hVar = new w15.h();
            java.lang.String f27 = f9Var.f2();
            hVar.m126728xdc93280d(f27 != null ? f27 : "");
            r15.b j18 = hVar.j();
            if (j18 != null) {
                dVar = j18.j();
            }
        } else if (f9Var.m78014x7b98c171()) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = f9Var.z0();
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(z07);
            if (h17 == null) {
                wg3.j jVar = (wg3.j) i95.n0.c(wg3.j.class);
                long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
                java.lang.String Q02 = f9Var.Q0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q02, "getTalker(...)");
                kc5.x xVar = (kc5.x) jVar;
                xVar.getClass();
                java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) xVar.f388123f).get(Q02 + m124847x74d37ac6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaGroupMsgHelper", "getGroupInfoWithoutCheck: videoInfo is null: " + f9Var.m124847x74d37ac6() + " - " + f9Var.z0() + " - " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str));
                if (str == null || r26.n0.N(str)) {
                    dVar = new r15.d();
                } else {
                    l15.c cVar2 = new l15.c();
                    cVar2.m126728xdc93280d(str != null ? str : "");
                    r15.b l17 = cVar2.l();
                    if (l17 != null) {
                        dVar = l17.j();
                    }
                }
            } else {
                java.lang.String g17 = h17.g();
                l15.c cVar3 = new l15.c();
                cVar3.m126728xdc93280d(g17 != null ? g17 : "");
                r15.b l18 = cVar3.l();
                if (l18 != null) {
                    dVar = l18.j();
                }
            }
        } else {
            java.lang.String j19 = f9Var.j();
            l15.c cVar4 = new l15.c();
            cVar4.m126728xdc93280d(j19 != null ? j19 : "");
            r15.b l19 = cVar4.l();
            if (l19 != null) {
                dVar = l19.j();
            }
        }
        if (!(Q0 == null || r26.n0.N(Q0))) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q0);
            ((java.util.Map) ic5.f.f371971d.c(Q0, dVar2)).put(m66995x9616526c, new ic5.c(hashCode, dVar == null ? new r15.d() : dVar));
        }
        return dVar;
    }
}
