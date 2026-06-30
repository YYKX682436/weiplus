package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 f213281d;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176) {
        this.f213281d = c15258xcd50c176;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = this.f213281d;
        try {
            boolean z17 = true;
            float f17 = c15258xcd50c176.m61722x390676d5().mo84153x22f21e20().f(c15258xcd50c176.m61722x390676d5().mo84153x22f21e20().g(c15258xcd50c176.getLimitLine() - 1, Float.MAX_VALUE));
            int width = c15258xcd50c176.m61722x390676d5().getWidth();
            if (c15258xcd50c176.f212429u != 0.0f) {
                z17 = false;
            }
            if (z17) {
                c15258xcd50c176.f212429u = c15258xcd50c176.m61719xd4a087b5().m84162x74f59ea8().measureText(c15258xcd50c176.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572809cl4));
            }
            float f18 = c15258xcd50c176.f212429u + 3;
            if (!c15258xcd50c176.getFadeCollapseStyle()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176.c(c15258xcd50c176, f17, width, f18);
            } else {
                c15258xcd50c176.getClass();
                c15258xcd50c176.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d4(c15258xcd50c176, width, f18));
            }
        } catch (java.lang.Exception e17) {
            java.lang.String str = "#2:Exception:" + e17.getMessage();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.q3 q3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176.f212414z;
            c15258xcd50c176.d(str);
        }
    }
}
