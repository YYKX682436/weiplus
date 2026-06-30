package x14;

/* loaded from: classes15.dex */
public final class w implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364 f533001a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364 c17503x53f0d364) {
        this.f533001a = c17503x53f0d364;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        java.lang.String m69095xcf667dc5;
        i11.h e17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364 c17503x53f0d364 = this.f533001a;
        c17503x53f0d364.f243199p = z17;
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).sj(c17503x53f0d364.m69095xcf667dc5(), c17503x53f0d364.m69093x377efd36(), z17);
        long j17 = z17 ? 104L : 103L;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967 c6991x7b759967 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967();
        c6991x7b759967.f143055d = j17;
        c6991x7b759967.f143060i = c6991x7b759967.b("DeviceID", wo.w0.c(), true);
        c6991x7b759967.f143061j = c6991x7b759967.b("CurrentPrivacyFullStatus", ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ui(), true);
        c6991x7b759967.k();
        if (c01.e2.a0()) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).nj(c17503x53f0d364.m69095xcf667dc5(), c17503x53f0d364.m69093x377efd36()) && z17) {
                if (((u60.g) i95.n0.c(u60.g.class)) != null && (e17 = i11.h.e()) != null) {
                    e17.l(c17503x53f0d364.f243200q, true, false, false);
                }
                m69095xcf667dc5 = c17503x53f0d364.m69095xcf667dc5();
                java.lang.String m69093x377efd36 = c17503x53f0d364.m69093x377efd36();
                c17503x53f0d364.getClass();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m69095xcf667dc5, d85.g0.LOCAION.f308725d) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m69093x377efd36, d85.f0.G.f308709d)) {
                }
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                stringBuffer.append("0,0,");
                stringBuffer.append(z17 ? 1 : 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(37693, stringBuffer);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingPermissionView", "report37693 for wxShop location switch, rptValue:" + ((java.lang.Object) stringBuffer));
                return;
            }
        }
        android.widget.TextView textView = c17503x53f0d364.f243198o;
        if (textView != null) {
            textView.setText("");
        }
        android.widget.TextView textView2 = c17503x53f0d364.f243198o;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        m69095xcf667dc5 = c17503x53f0d364.m69095xcf667dc5();
        java.lang.String m69093x377efd362 = c17503x53f0d364.m69093x377efd36();
        c17503x53f0d364.getClass();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m69095xcf667dc5, d85.g0.LOCAION.f308725d)) {
        }
    }
}
