package ez;

/* loaded from: classes9.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ez.v0 f339310a = new ez.v0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f339311b = jz5.h.b(ez.u0.f339308d);

    public static /* synthetic */ boolean b(ez.v0 v0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, v05.b bVar, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            bVar = null;
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        return v0Var.a(f9Var, bVar, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r6, v05.b r7, java.lang.String r8) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L7b
            ez.v0 r1 = ez.v0.f339310a
            if (r7 != 0) goto L17
            v05.b r7 = new v05.b
            r7.<init>()
            java.lang.String r2 = r6.U1()
            if (r2 != 0) goto L14
            java.lang.String r2 = ""
        L14:
            r7.m126728xdc93280d(r2)
        L17:
            if (r8 != 0) goto L1d
            java.lang.String r8 = r1.f(r6, r7)
        L1d:
            java.lang.Class<e40.v> r2 = e40.v.class
            i95.m r2 = i95.n0.c(r2)
            e40.v r2 = (e40.v) r2
            d40.n r2 = (d40.n) r2
            r2.getClass()
            java.lang.Class<sx.e0> r2 = sx.e0.class
            i95.m r2 = i95.n0.c(r2)
            sx.e0 r2 = (sx.e0) r2
            rx.l r2 = (rx.l) r2
            r3 = 1
            boolean r2 = r2.Ri(r3)
            if (r2 != 0) goto L67
            java.lang.Class<e40.u> r2 = e40.u.class
            i95.m r2 = i95.n0.c(r2)
            e40.u r2 = (e40.u) r2
            int r4 = r7.f449898d
            int r4 = r4 + 6
            int r4 = r7.m75939xb282bd08(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            bf5.o r2 = (bf5.o) r2
            r2.getClass()
            if (r4 == 0) goto L63
            r4.intValue()
            r2 = 130(0x82, float:1.82E-43)
            int r4 = r4.intValue()
            if (r4 != r2) goto L63
            r2 = r3
            goto L64
        L63:
            r2 = r0
        L64:
            if (r2 == 0) goto L67
            return r0
        L67:
            boolean r2 = com.p314xaae8f345.mm.vfs.w6.j(r8)
            if (r2 == 0) goto L6e
            return r3
        L6e:
            boolean r7 = r1.e(r7)
            if (r7 == 0) goto L7b
            boolean r6 = r1.c(r6, r8)
            if (r6 != 0) goto L7b
            return r3
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ez.v0.a(com.tencent.mm.storage.f9, v05.b, java.lang.String):boolean");
    }

    public final boolean c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        if (str == null) {
            v05.b bVar = new v05.b();
            java.lang.String U1 = msgInfo.U1();
            if (U1 == null) {
                U1 = "";
            }
            bVar.m126728xdc93280d(U1);
            str = f(msgInfo, bVar);
        }
        return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.c(msgInfo, str);
    }

    public final boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(str);
        return f339310a.e(bVar);
    }

    public final boolean e(v05.b appMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appMsg, "appMsg");
        v05.a aVar = (v05.a) appMsg.m75936x14adae67(appMsg.f513848e + 8);
        if (aVar != null) {
            int i17 = aVar.f449897d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.m75945x2fec8307(i17 + 3)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.m75945x2fec8307(i17 + 2))) {
                java.lang.String m75945x2fec8307 = aVar.m75945x2fec8307(i17 + 2);
                return (r26.i0.y(m75945x2fec8307, "/", false) || r26.i0.y(m75945x2fec8307, "content://", false)) ? false : true;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.u()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.C())) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, v05.b bVar) {
        java.lang.String str;
        pt.j0 j0Var = (pt.j0) i95.n0.c(pt.j0.class);
        java.lang.String g17 = g(bVar);
        if (g17 == null) {
            g17 = bVar.m75945x2fec8307(bVar.f449898d + 2);
        }
        v05.a aVar = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8);
        if (aVar == null || (str = aVar.r()) == null) {
            str = "";
        }
        return ((ez.e) j0Var).cj(f9Var, g17, str, false);
    }

    public final java.lang.String g(v05.b bVar) {
        v05.a aVar;
        java.lang.String s17;
        if (!i(bVar != null ? java.lang.Integer.valueOf(bVar.m75939xb282bd08(bVar.f449898d + 6)) : null)) {
            if (bVar != null) {
                return bVar.m75945x2fec8307(bVar.f449898d + 2);
            }
            return null;
        }
        if (bVar != null && (aVar = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8)) != null && (s17 = aVar.s()) != null) {
            if (!(!r26.n0.N(s17))) {
                s17 = null;
            }
            if (s17 != null) {
                return s17;
            }
        }
        if (bVar != null) {
            return bVar.m75945x2fec8307(bVar.f449898d + 2);
        }
        return null;
    }

    public final long h() {
        java.lang.Object m143895xf1229813;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), ez.t0.class)).f149938d;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Long.valueOf(ip.c.k()));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = 1073741824L;
        }
        return ((java.lang.Number) m143895xf1229813).longValue();
    }

    public final boolean i(java.lang.Integer num) {
        if (num == null) {
            return false;
        }
        num.intValue();
        return j(num) || k(num);
    }

    public final boolean j(java.lang.Integer num) {
        if (num == null) {
            return false;
        }
        num.intValue();
        return num.intValue() == 6 || num.intValue() == 130;
    }

    public final boolean k(java.lang.Integer num) {
        if (num == null) {
            return false;
        }
        num.intValue();
        return num.intValue() == 74 || num.intValue() == 131;
    }
}
