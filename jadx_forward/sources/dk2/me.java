package dk2;

/* loaded from: classes3.dex */
public final class me implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.me f315304d = new dk2.me();

    @Override // java.lang.Runnable
    public final void run() {
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "doRefreshMic[" + dk2.ef.I + ']');
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null) {
            if (!zl2.r4.f555483a.w1()) {
                mm2.n0 n0Var = (mm2.n0) efVar.i(mm2.n0.class);
                r5 = ((n0Var == null || !n0Var.f410806r) ? 0 : 1) != 0 ? 16 : 2;
            }
            int i17 = r5;
            long m75942xfb822ef2 = e1Var.f410521r.m75942xfb822ef2(0);
            long j17 = e1Var.f410516m;
            java.lang.String str = e1Var.f410525v;
            byte[] bArr = e1Var.f410518o;
            java.lang.String m86 = ((mm2.c1) e1Var.m147920xbba4bfc0(mm2.c1.class)).m8();
            dk2.vd vdVar = new dk2.vd(e1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "refreshLinkMic liveId:" + m75942xfb822ef2 + ", objectId:" + j17 + ", nonceId:" + str + ", scene:" + i17 + ", sdkUserId:" + m86);
            new ek2.g2(m75942xfb822ef2, j17, str, bArr, i17, m86, vdVar).l();
        }
    }
}
