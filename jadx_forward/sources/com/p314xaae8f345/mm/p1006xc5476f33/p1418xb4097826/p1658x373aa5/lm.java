package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class lm {
    public lm(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isInShareStatus time interval:");
        long c17 = c01.id.c();
        jz5.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mm.F;
        sb6.append(c17 - ((java.lang.Number) lVar.f384367e).longValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineShareDialog", sb6.toString());
        return ((java.lang.Boolean) lVar.f384366d).booleanValue() && ((java.lang.Number) lVar.f384367e).longValue() != 0 && c01.id.c() - ((java.lang.Number) lVar.f384367e).longValue() < 500;
    }
}
