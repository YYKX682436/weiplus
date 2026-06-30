package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class a4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("type");
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != 740154499) {
                if (hashCode == 951526432 && stringExtra.equals("contact")) {
                    java.lang.String stringExtra2 = intent.getStringExtra(dm.i4.COL_USERNAME);
                    if (((stringExtra2 == null || r26.n0.N(stringExtra2)) ? 1 : 0) == 0) {
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(stringExtra2, true);
                        kotlin.jvm.internal.o.d(n17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "print contact:%s", "name:" + n17.d1() + " type:" + n17.getType() + " uiType:" + n17.c1() + " isTypeInConvBox:" + n17.z2() + " isUITypeInConvBox:" + n17.A2() + " isPlaceTop:" + n17.w2() + " uin:" + n17.L + " alias:" + n17.t0() + " conRemark:" + n17.w0() + " nickname:" + n17.P0() + " conRemarkPYFull:" + n17.y0() + " quanPin:" + n17.U0() + " verifyFlag:" + n17.f1() + " bizType:" + n17.f236586x1 + " usernameFlag:" + n17.e1() + " showHead:" + n17.W0() + " antiSpamTicket:" + n17.F1);
                        return;
                    }
                    return;
                }
                return;
            }
            if (stringExtra.equals("conversation")) {
                java.lang.String stringExtra3 = intent.getStringExtra(dm.i4.COL_USERNAME);
                if (stringExtra3 == null || r26.n0.N(stringExtra3)) {
                    return;
                }
                com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(stringExtra3);
                kotlin.jvm.internal.o.d(p17);
                java.lang.Object[] objArr = {"name:" + p17.h1() + " parentRef:" + p17.W0() + " msgCount:" + p17.T0() + " unReadCount:" + p17.d1() + " chatmode:" + p17.v0() + " status:" + p17.a1() + " isSend:" + p17.Q0() + " conversationTime:" + p17.w0() + " msgType:" + p17.U0() + " flag:" + p17.G0() + ' '};
                java.util.Locale locale = java.util.Locale.CHINA;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, 1);
                java.lang.String format = java.lang.String.format(locale, "print conversation:%s", java.util.Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.o.f(format, "format(...)");
                if (format.length() <= 3000) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Shell", format);
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
                    com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "LongLogSub:" + r8 + " -- " + ((java.lang.String) next));
                    r8 = i17;
                }
            }
        }
    }
}
