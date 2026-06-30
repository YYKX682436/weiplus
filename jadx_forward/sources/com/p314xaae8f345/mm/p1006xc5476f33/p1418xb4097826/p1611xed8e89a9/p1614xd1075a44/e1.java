package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class e1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 f206055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206056b;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var, java.lang.String str) {
        this.f206055a = s1Var;
        this.f206056b = str;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        int i17;
        r45.h32 h32Var;
        java.lang.String m75945x2fec8307;
        r45.ov2 a17;
        java.lang.String m75945x2fec83072;
        java.lang.String m75945x2fec83073;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = this.f206055a;
        boolean z18 = s1Var.B;
        java.lang.String str = this.f206056b;
        if (z18) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("finder_username", str);
            hashMap.put("activityId", s1Var.C);
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.K1, hashMap, s1Var.f206252c.m75945x2fec8307(1), java.lang.String.valueOf(s1Var.f206252c.m75939xb282bd08(5)), null, null, false, 112, null);
        }
        if (z17) {
            java.lang.String str2 = this.f206056b;
            if (s1Var.f206258i.getVisibility() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) s1Var.f206254e.get(str2);
                java.lang.String str3 = null;
                r45.h32 h32Var2 = l2Var != null ? l2Var.f205449e : null;
                java.lang.String str4 = (h32Var2 == null || (m75945x2fec83073 = h32Var2.m75945x2fec8307(3)) == null) ? "" : m75945x2fec83073;
                java.lang.String str5 = (h32Var2 == null || (m75945x2fec83072 = h32Var2.m75945x2fec8307(4)) == null) ? "" : m75945x2fec83072;
                cl0.g gVar = new cl0.g();
                if (h32Var2 != null && (a17 = zl2.t.a(h32Var2)) != null) {
                    str3 = a17.m75945x2fec8307(1);
                }
                gVar.h("coupon_id", str3);
                gVar.o("ui_position", 1);
                cl0.g gVar2 = new cl0.g();
                gVar2.s("source_type", 0);
                gVar2.o("notice_type", 1);
                gVar2.s("ref_page_type", s1Var.H);
                c50.c1 c1Var = (c50.c1) i95.n0.c(c50.c1.class);
                ml2.i5 i5Var = ml2.i5.f409103e;
                java.lang.String str6 = s1Var.f206255f;
                java.lang.String gVar3 = gVar2.toString();
                java.lang.String gVar4 = gVar.toString();
                long e17 = s1Var.e();
                int d17 = s1Var.d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1Var);
                i17 = 4;
                c50.c1.l9(c1Var, i5Var, str2, 0L, 0, str6, null, null, null, null, str4, gVar3, str5, gVar4, e17, d17, null, 33248, null);
            } else {
                i17 = 4;
            }
            if (s1Var.e() != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a;
                r45.qt2 qt2Var = s1Var.f206252c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(s1Var.e());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) s1Var.f206254e.get(str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.e(l0Var, qt2Var, h17, 82, (l2Var2 == null || (h32Var = l2Var2.f205449e) == null || (m75945x2fec8307 = h32Var.m75945x2fec8307(i17)) == null) ? "" : m75945x2fec8307, 0, 16, null);
            }
        }
    }
}
