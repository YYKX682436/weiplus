package c61;

@j95.b
/* loaded from: classes8.dex */
public final class k8 extends i95.w implements zy2.y9 {
    public void wi(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        i95.m c17 = i95.n0.c(c61.t8.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.t8 t8Var = (c61.t8) c17;
        byte[] bArr = gVar != null ? gVar.f273689a : null;
        java.lang.String str = t8Var.f120837d;
        if (bArr == null) {
            c61.t8.mj(gVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[revokeRedDot] dataString = " + gVar + ", dataBytes is null, fall back");
            return;
        }
        r45.ct2 ct2Var = new r45.ct2();
        ct2Var.m75932x347fbd55(bArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = false;
        sb6.append(pm0.v.u(ct2Var.m75942xfb822ef2(0)));
        sb6.append('_');
        sb6.append(ct2Var.m75939xb282bd08(1));
        java.lang.String revokeId = sb6.toString();
        i95.m c18 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2 x2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) ((c61.l7) ((zy2.b6) c18)).nk();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(revokeId, "revokeId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb c19 = x2Var.c(revokeId);
        if (c19 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManager", "[revokeByRevokeId] revokeId: " + revokeId + " not found, source=" + source);
            x2Var.c1().put(revokeId, revokeId);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).vj(0, "", revokeId, 0);
        } else {
            x2Var.F(c19.f65874xb5f7102a, source);
            boolean L = x2Var.L(c19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManager", "[revokeByRevokeId] ret=" + L + " revokeId=" + revokeId + " removeRedDot=" + c19 + ", source=" + source);
            if (L) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                int m55856xfb85f7b0 = c19.m55856xfb85f7b0();
                java.lang.String str2 = c19.f65880x11c19d58;
                o3Var.vj(m55856xfb85f7b0, str2 != null ? str2 : "", revokeId, 1);
                x2Var.Z0().d(source, c19);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                int m55856xfb85f7b02 = c19.m55856xfb85f7b0();
                java.lang.String str3 = c19.f65880x11c19d58;
                o3Var2.vj(m55856xfb85f7b02, str3 != null ? str3 : "", revokeId, 0);
            }
            z17 = L;
        }
        c61.t8.mj(gVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[revokeRedDot] revoke success:" + z17);
    }
}
