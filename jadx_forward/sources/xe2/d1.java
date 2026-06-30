package xe2;

/* loaded from: classes3.dex */
public final class d1 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xe2.f1 f535381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.c94 f535382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(xe2.f1 f1Var, r45.c94 c94Var, java.lang.Class cls) {
        super(cls);
        this.f535381b = f1Var;
        this.f535382c = c94Var;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.y23 y23Var;
        r45.hd5 hd5Var;
        r45.y23 y23Var2;
        r45.hd5 hd5Var2;
        qm0.a aVar;
        java.lang.Object obj;
        r45.nt2 nt2Var;
        r45.hd5 hd5Var3;
        r45.hd5 hd5Var4;
        r45.hd5 hd5Var5;
        r45.yy2 result = (r45.yy2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        xe2.f1 f1Var = this.f535381b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.f535393c, "[onPollingSuccess], result:" + pm0.b0.g(result));
        r45.y23 y23Var3 = (r45.y23) result.m75936x14adae67(0);
        boolean z17 = (y23Var3 == null || (hd5Var5 = (r45.hd5) y23Var3.m75936x14adae67(24)) == null || hd5Var5.m75939xb282bd08(5) != 1000) ? false : true;
        java.lang.String str = f1Var.f535393c;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onPollingSuccess], status is recording, return");
            return;
        }
        r45.y23 y23Var4 = (r45.y23) result.m75936x14adae67(0);
        if ((y23Var4 == null || (hd5Var4 = (r45.hd5) y23Var4.m75936x14adae67(24)) == null || hd5Var4.m75939xb282bd08(5) != 2) ? false : true) {
            r45.y23 y23Var5 = (r45.y23) result.m75936x14adae67(0);
            int m75939xb282bd08 = (y23Var5 == null || (hd5Var3 = (r45.hd5) y23Var5.m75936x14adae67(24)) == null) ? 0 : hd5Var3.m75939xb282bd08(3) - hd5Var3.m75939xb282bd08(2);
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            mm2.f6 f6Var = (mm2.f6) dk2.ef.f314905a.i(mm2.f6.class);
            int m75939xb282bd082 = (f6Var == null || (nt2Var = f6Var.E) == null) ? 0 : nt2Var.m75939xb282bd08(1);
            r45.y23 y23Var6 = (r45.y23) result.m75936x14adae67(0);
            j0Var.Pj(3, m75939xb282bd082, y23Var6 != null ? y23Var6.m75942xfb822ef2(0) : 0L, m75939xb282bd08);
            dk2.ef.f314925k.f(this.f535382c.m75939xb282bd08(0));
        }
        java.lang.String m75945x2fec8307 = result.m75945x2fec8307(1);
        if (m75945x2fec8307 != null) {
            if (m75945x2fec8307.length() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "update request id: ".concat(m75945x2fec8307));
                mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
                if (c1Var != null) {
                    c1Var.y9(m75945x2fec8307);
                }
            }
        }
        mm2.f6 f6Var2 = (mm2.f6) dk2.ef.f314905a.i(mm2.f6.class);
        if (f6Var2 == null || (aVar = f6Var2.f410572o) == null) {
            y23Var = null;
        } else {
            java.util.List b17 = aVar.b(xe2.c1.f535374d);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
            java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem");
                arrayList.add(((cm2.m0) j5Var).f124901v);
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                r45.y23 y23Var7 = (r45.y23) obj;
                r45.y23 y23Var8 = (r45.y23) result.m75936x14adae67(0);
                if (y23Var8 != null && y23Var7.m75942xfb822ef2(0) == y23Var8.m75942xfb822ef2(0)) {
                    break;
                }
            }
            y23Var = (r45.y23) obj;
        }
        if (y23Var != null && (hd5Var = (r45.hd5) y23Var.m75936x14adae67(24)) != null) {
            if (!(hd5Var.m75939xb282bd08(5) == 1000)) {
                hd5Var = null;
            }
            if (hd5Var != null && (y23Var2 = (r45.y23) result.m75936x14adae67(0)) != null && (hd5Var2 = (r45.hd5) y23Var2.m75936x14adae67(24)) != null) {
                if (!kz5.c0.i(0, 2, 100).contains(java.lang.Integer.valueOf(hd5Var2.m75939xb282bd08(5)))) {
                    hd5Var2 = null;
                }
                if (hd5Var2 != null) {
                    i95.m c17 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ml2.j0.Qj((ml2.j0) c17, 7, 0, 0L, 0, 12, null);
                    pm0.v.X(xe2.b1.f535371d);
                }
            }
        }
        if (y23Var != null) {
            r45.y23 y23Var9 = (r45.y23) result.m75936x14adae67(0);
            y23Var.set(24, y23Var9 != null ? (r45.hd5) y23Var9.m75936x14adae67(24) : null);
        }
        mm2.f6 f6Var3 = (mm2.f6) dk2.ef.f314905a.i(mm2.f6.class);
        if (f6Var3 != null) {
            qm0.a value = f6Var3.f410572o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
            f6Var3.S6(f6Var3.f410572o);
            f6Var3.f410572o = value;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            k0Var.mo46557x60d69242(qo0.b.f446905k2, null);
        }
    }
}
