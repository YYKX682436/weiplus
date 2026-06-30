package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes11.dex */
public class a4 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("type");
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != 740154499) {
                if (hashCode == 951526432 && stringExtra.equals("contact")) {
                    java.lang.String stringExtra2 = intent.getStringExtra(dm.i4.f66875xa013b0d5);
                    if (((stringExtra2 == null || r26.n0.N(stringExtra2)) ? 1 : 0) == 0) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(stringExtra2, true);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "print contact:%s", "name:" + n17.d1() + " type:" + n17.m124896xfb85f7b0() + " uiType:" + n17.c1() + " isTypeInConvBox:" + n17.z2() + " isUITypeInConvBox:" + n17.A2() + " isPlaceTop:" + n17.w2() + " uin:" + n17.L + " alias:" + n17.t0() + " conRemark:" + n17.w0() + " nickname:" + n17.P0() + " conRemarkPYFull:" + n17.y0() + " quanPin:" + n17.U0() + " verifyFlag:" + n17.f1() + " bizType:" + n17.f318119x1 + " usernameFlag:" + n17.e1() + " showHead:" + n17.W0() + " antiSpamTicket:" + n17.F1);
                        return;
                    }
                    return;
                }
                return;
            }
            if (stringExtra.equals("conversation")) {
                java.lang.String stringExtra3 = intent.getStringExtra(dm.i4.f66875xa013b0d5);
                if (stringExtra3 == null || r26.n0.N(stringExtra3)) {
                    return;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(stringExtra3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p17);
                java.lang.Object[] objArr = {"name:" + p17.h1() + " parentRef:" + p17.W0() + " msgCount:" + p17.T0() + " unReadCount:" + p17.d1() + " chatmode:" + p17.v0() + " status:" + p17.a1() + " isSend:" + p17.Q0() + " conversationTime:" + p17.w0() + " msgType:" + p17.U0() + " flag:" + p17.G0() + ' '};
                java.util.Locale locale = java.util.Locale.CHINA;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, 1);
                java.lang.String format = java.lang.String.format(locale, "print conversation:%s", java.util.Arrays.copyOf(copyOf, copyOf.length));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                if (format.length() <= 3000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", format);
                    return;
                }
                java.util.Iterator it = ((java.util.ArrayList) r26.p0.x0(format, 3000)).iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i17 = r8 + 1;
                    if (r8 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "LongLogSub:" + r8 + " -- " + ((java.lang.String) next));
                    r8 = i17;
                }
            }
        }
    }
}
