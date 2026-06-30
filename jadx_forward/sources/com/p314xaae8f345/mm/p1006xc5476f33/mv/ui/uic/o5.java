package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class o5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 f232876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm3.q f232877e;

    public o5(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var, fm3.q qVar) {
        this.f232876d = z5Var;
        this.f232877e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var = this.f232876d;
        int paddingStart = z5Var.Q6().getPaddingStart();
        int width = z5Var.Q6().getWidth() - (paddingStart * 2);
        z5Var.f233116v = (width * 1.0f) / ((float) z5Var.f233115u);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((jz5.n) z5Var.f233108n).mo141623x754a37bb();
        int i17 = -((int) (((float) z5Var.f233113s) * z5Var.f233116v));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$setVideoData$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$setVideoData$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        fm3.o oVar = this.f232877e.f345646n;
        boolean z17 = oVar instanceof fm3.p;
        if (z17) {
            fm3.p pVar = z17 ? (fm3.p) oVar : null;
            if (pVar != null) {
                i95.m c17 = i95.n0.c(bg0.v.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                kp4.a Ai = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ai(bg0.v.Z2((bg0.v) c17, pVar.f345629b, false, 2, null));
                long j17 = z5Var.f233114t;
                Ai.f392608e = j17;
                Ai.f392604a = 80;
                Ai.f392605b = 120;
                Ai.f392609f = (z5Var.f233116v * ((float) j17)) / (((z5Var.C * 1.0f) / 120) * 80);
                Ai.f();
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x4 P6 = z5Var.P6();
                ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                P6.f233060e = new kp4.b();
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x4 P62 = z5Var.P6();
                java.util.List c18 = kz5.b0.c(Ai);
                P62.getClass();
                java.util.ArrayList arrayList2 = P62.f233059d;
                arrayList2.clear();
                arrayList2.addAll(c18);
                P62.m8146xced61ae5();
            }
        } else {
            boolean z18 = oVar instanceof fm3.l;
            if (z18) {
                fm3.l lVar = z18 ? (fm3.l) oVar : null;
                if (lVar != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(z5Var.E, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.u5(z5Var, lVar, null), 3, null);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16696x18533e6c S6 = z5Var.S6();
        S6.getClass();
        S6.post(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.g4(S6, width, paddingStart, width));
        z5Var.S6().f(true, paddingStart);
        z5Var.S6().f(true, paddingStart + width);
    }
}
