package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes10.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 f191372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084) {
        super(1);
        this.f191372d = activityC14126xa5cf9084;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String d17;
        int intValue = ((java.lang.Number) obj).intValue();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.U;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084 = this.f191372d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.d1 d76 = activityC14126xa5cf9084.d7();
        d76.getClass();
        java.util.ArrayList arrayList = d76.f191360n;
        if (intValue >= 0 && intValue < arrayList.size()) {
            java.lang.Object obj2 = arrayList.get(intValue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            so2.y0 y0Var = (so2.y0) obj2;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            c0Var.f391645d = nv2.n1.f422084h.i(d76.O6().m59251x5db1b11(), y0Var.f492236d, d76.f191355f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentImageFlowViewModel", "[onLikeComment] position=" + intValue + " isLike=" + c0Var.f391645d + " commentObj=" + y0Var.f492236d);
            c0Var.f391645d = c0Var.f391645d ^ true;
            pf5.z zVar = pf5.z.f435481a;
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC14126xa5cf9084).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            boolean H = hc2.o0.H(d76.O6().getFeedObject());
            if (!H) {
                str = "get(...)";
            } else if (c0Var.f391645d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = y0Var.f492236d;
                yj0Var.l1(yj0Var.z0() | 1);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 u07 = y0Var.f492236d.u0();
                r45.dc dcVar = new r45.dc();
                str = "get(...)";
                dcVar.set(0, java.lang.Long.valueOf(c01.id.a() / 1000));
                u07.m76105x37f04d2(dcVar);
            } else {
                str = "get(...)";
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var2 = y0Var.f492236d;
                yj0Var2.l1(yj0Var2.z0() & (-2));
            }
            d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a.d(null, 0, y0Var.D, y0Var.f492236d.w0(), y0Var.f492247r, y0Var.f492236d.J0(), (r21 & 64) != 0 ? null : null, (r21 & 128) != 0 ? null : null);
            so2.e2.a(so2.e2.f491861a, V6, d76.O6().m59251x5db1b11(), d76.O6().m59229xb5af1dd5(), d76.O6().m59276x6c285d75(), y0Var.f492236d, c0Var.f391645d, d76.f191355f, H, null, 0, d17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.x0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.a1(d76, y0Var, c0Var)), 768, null);
            java.lang.Object a17 = zVar.a(activityC14126xa5cf9084).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, str);
            ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
            if (e27 != null) {
                long m59251x5db1b11 = d76.O6().m59251x5db1b11();
                java.lang.String m59229xb5af1dd5 = d76.O6().m59229xb5af1dd5();
                boolean z17 = c0Var.f391645d;
                e27.a(new ec2.a(15, m59251x5db1b11, m59229xb5af1dd5));
                if (z17) {
                    e27.a(new ec2.a(27, m59251x5db1b11, m59229xb5af1dd5));
                } else {
                    e27.a(new ec2.a(28, m59251x5db1b11, m59229xb5af1dd5));
                }
            }
            long m59251x5db1b112 = d76.O6().m59251x5db1b11();
            long mo2128x1ed62e84 = y0Var.mo2128x1ed62e84();
            boolean z18 = c0Var.f391645d;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1 c5457xd6bc6fd1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1();
            am.ta taVar = c5457xd6bc6fd1.f135796g;
            taVar.f89526a = m59251x5db1b112;
            taVar.f89527b = mo2128x1ed62e84;
            taVar.f89528c = z18 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.Z : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.f209792p0;
            c5457xd6bc6fd1.e();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ok(c0Var.f391645d, y0Var.f492236d.t0());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentImageFlowViewModel", "onLikeComment position: " + intValue);
        }
        return jz5.f0.f384359a;
    }
}
