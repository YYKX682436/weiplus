package xe2;

/* loaded from: classes3.dex */
public final class h1 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535400c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535400c = "LivePromoteInfoInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        jz5.f0 f0Var;
        gk2.e m57654xd7793f26;
        gk2.e m57654xd7793f262;
        gk2.e m57654xd7793f263;
        kn0.p pVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.f52 f52Var = new r45.f52();
        boolean z17 = false;
        if (ch1Var != null) {
            if (!(ch1Var.m75934xbce7f2f(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                f52Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            }
        }
        java.lang.String str = "recive promote msg: " + pm0.b0.g(f52Var);
        java.lang.String str2 = this.f535400c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (f52Var.m75939xb282bd08(3) == 0 && f52Var.m75939xb282bd08(0) == 19) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            byte[] mo14344x5f01b1f6 = f52Var.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            cm2.t I2 = r4Var.I2(mo14344x5f01b1f6);
            cm2.g0 g0Var = I2 instanceof cm2.g0 ? (cm2.g0) I2 : null;
            r45.qy1 qy1Var = g0Var != null ? g0Var.f124879v : null;
            if (qy1Var != null) {
                r4Var.K2(str2, qy1Var);
            }
        }
        if ((f52Var.m75939xb282bd08(3) == 1 || ((f52Var.m75934xbce7f2f(2) != null || f52Var.m75933x41a8a7f2(12)) && f52Var.m75939xb282bd08(3) == 0) ? f52Var : null) != null) {
            dk2.ef efVar = dk2.ef.f314905a;
            tn0.w0 w0Var = dk2.ef.f314911d;
            if (w0Var != null && (pVar = w0Var.D) != null && pVar.i()) {
                z17 = true;
            }
            if (z17) {
                if (f52Var.m75939xb282bd08(3) == 1) {
                    zl2.r4 r4Var2 = zl2.r4.f555483a;
                    byte[] mo14344x5f01b1f62 = f52Var.mo14344x5f01b1f6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f62, "toByteArray(...)");
                    cm2.t I22 = r4Var2.I2(mo14344x5f01b1f62);
                    if (!(I22 instanceof cm2.t)) {
                        I22 = null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r0Var = (k0Var == null || (m57654xd7793f263 = k0Var.m57654xd7793f26()) == null) ? null : ((mm2.f6) m57654xd7793f263.a(mm2.f6.class)).f410582w;
                    cm2.t tVar = r0Var instanceof cm2.t ? (cm2.t) r0Var : null;
                    if (tVar != null && I22 != null && tVar.f124918d != I22.f124918d) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "promoteid no match dont del,promotingId:" + tVar.f124918d + ", newPromoteInfo:" + I22.f124918d);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
                if (k0Var2 != null) {
                    h(k0Var2, f52Var);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var3 = dk2.ef.f314913e;
                if (k0Var3 != null) {
                    h(k0Var3, f52Var);
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    if (f52Var.m75939xb282bd08(3) == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var4 = dk2.ef.f314913e;
                        mm2.f6 f6Var = (k0Var4 == null || (m57654xd7793f262 = k0Var4.m57654xd7793f26()) == null) ? null : (mm2.f6) m57654xd7793f262.a(mm2.f6.class);
                        if (f6Var != null) {
                            f6Var.c7(null);
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var5 = dk2.ef.f314913e;
                        mm2.f6 f6Var2 = (k0Var5 == null || (m57654xd7793f26 = k0Var5.m57654xd7793f26()) == null) ? null : (mm2.f6) m57654xd7793f26.a(mm2.f6.class);
                        if (f6Var2 != null) {
                            zl2.r4 r4Var3 = zl2.r4.f555483a;
                            byte[] mo14344x5f01b1f63 = f52Var.mo14344x5f01b1f6();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f63, "toByteArray(...)");
                            cm2.t I23 = r4Var3.I2(mo14344x5f01b1f63);
                            f6Var2.c7(I23 instanceof so2.j5 ? I23 : null);
                        }
                    }
                }
            }
        }
        if (f52Var.m75939xb282bd08(8) > 0) {
            dk2.ef efVar2 = dk2.ef.f314905a;
            dk2.tb tbVar = dk2.ef.f314925k;
            tbVar.f315660h.mo50293x3498a0(new dk2.sb(f52Var.m75939xb282bd08(8), tbVar, f52Var.m75939xb282bd08(9)));
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20051};
    }

    public final void h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, r45.f52 f52Var) {
        gk2.e m57654xd7793f26;
        if (f52Var.m75939xb282bd08(3) == 1) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
            bundle.putBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_ANCHOR", true);
            k0Var.mo46557x60d69242(bVar, bundle);
            return;
        }
        if (f52Var.m75933x41a8a7f2(12)) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            if (!r4Var.w1()) {
                byte[] mo14344x5f01b1f6 = f52Var.mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
                boolean z17 = r4Var.I2(mo14344x5f01b1f6) instanceof cm2.t;
                long j17 = f52Var.m75933x41a8a7f2(11) ? e06.p.j(new e06.k(1, f52Var.m75939xb282bd08(9)), c06.e.f119249d) : 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535400c, "[notifyBubble] delay = " + j17);
                pm0.v.V(j17 * ((long) 1000), new xe2.g1(f52Var));
                return;
            }
        }
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r0Var = (k0Var2 == null || (m57654xd7793f26 = k0Var2.m57654xd7793f26()) == null) ? null : ((mm2.f6) m57654xd7793f26.a(mm2.f6.class)).f410582w;
        cm2.t tVar = r0Var instanceof cm2.t ? (cm2.t) r0Var : null;
        qo0.b bVar2 = f52Var.m75942xfb822ef2(4) == (tVar != null ? tVar.f124918d : 0L) ? qo0.b.N2 : qo0.b.M2;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
        k0Var.mo46557x60d69242(bVar2, bundle2);
    }
}
