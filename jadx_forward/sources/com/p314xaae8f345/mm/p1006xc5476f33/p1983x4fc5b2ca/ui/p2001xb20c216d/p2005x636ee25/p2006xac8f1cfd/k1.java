package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class k1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m1 f237818a;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m1 m1Var) {
        this.f237818a = m1Var;
    }

    public void a(cw3.i newMode, java.lang.String mjMusicId) {
        java.lang.String a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjMusicId, "mjMusicId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m1 m1Var = this.f237818a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = m1Var.f237829r.f494923b;
        java.lang.String str = c16997xb0aa383a != null ? c16997xb0aa383a.C : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, mjMusicId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(m1Var.f237828q, "onMusicSwitchModeUpdate: failed id not match loading " + str + ", " + mjMusicId);
            return;
        }
        java.lang.String str2 = m1Var.f237828q;
        newMode.toString();
        sv3.b bVar = m1Var.f237829r;
        int i17 = bVar.f494922a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = bVar.f494923b;
        if (newMode instanceof cw3.g) {
            cw3.g gVar = (cw3.g) newMode;
            m1Var.getClass();
            if (c16997xb0aa383a2 == null || (a17 = c16997xb0aa383a2.a()) == null) {
                return;
            }
            java.util.Iterator it = m1Var.o(c16997xb0aa383a2, i17).iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) m1Var.f237754n).get(java.lang.Integer.valueOf(intValue));
                if (cVar != null) {
                    cVar.L(intValue, a17, gVar);
                }
            }
            return;
        }
        if (newMode instanceof cw3.h) {
            sv3.a aVar = m1Var.f237753m;
            m1Var.r(aVar.f494921b, aVar.f494920a);
            sv3.b bVar2 = m1Var.f237829r;
            m1Var.s(bVar2.f494923b, bVar2.f494922a);
            sv3.b bVar3 = m1Var.f237829r;
            m1Var.z(bVar3.f494922a, bVar3.f494923b);
            sv3.b bVar4 = m1Var.f237829r;
            bVar4.f494922a = -1;
            bVar4.f494923b = null;
            m1Var.x(m1Var.f237753m.f494921b);
        }
    }
}
