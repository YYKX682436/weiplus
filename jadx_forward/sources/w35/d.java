package w35;

/* loaded from: classes8.dex */
public final class d extends w35.b {

    /* renamed from: e, reason: collision with root package name */
    public kb0.g f524262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 params, w35.a aVar) {
        super(params, aVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a A[LOOP:0: B:45:0x0114->B:47:0x011a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    @Override // w35.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w35.d.a():void");
    }

    @Override // w35.b
    public void b(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w info) {
        android.content.Intent intent;
        java.lang.String str;
        jz5.f0 f0Var;
        lb0.d dVar;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenWayControllerAd", "open, itemType: " + info.h());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = info.f272547d;
        if (xVar == null || (intent = xVar.f272569o) == null) {
            return;
        }
        xj.m mVar = info.f272555o;
        jz5.f0 f0Var2 = null;
        if (mVar != null && (str = mVar.f536286a) != null) {
            ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).bj(str, new xj.n(wj.r0.f528032e, intent, context, null), new w35.c(this, info));
            jt.x xVar2 = (jt.x) i95.n0.c(jt.x.class);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = this.f524256a;
            boolean Bi = ((jb0.g) xVar2).Bi(g2Var.f270848h);
            jz5.f0 f0Var3 = jz5.f0.f384359a;
            if (Bi && (c17 = (dVar = lb0.d.f399202a).c(info.f272554n)) != null) {
                int i17 = g2Var.f270848h;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("recent_use_app_mmkv", 2, null);
                if (N != null) {
                    r45.mk5 mk5Var = new r45.mk5();
                    long c18 = c01.id.c();
                    byte[] j17 = N.j(str);
                    if (j17 != null) {
                        mk5Var.mo11468x92b714fd(j17);
                        long b17 = dVar.b(i17, c17) + c18;
                        f0Var = f0Var3;
                        long j18 = mk5Var.f462140f;
                        if (b17 < j18) {
                            b17 = j18;
                        }
                        mk5Var.f462140f = b17;
                        f0Var2 = f0Var;
                    } else {
                        f0Var = f0Var3;
                    }
                    if (f0Var2 == null) {
                        mk5Var.f462140f = dVar.e(i17, c17) + c18;
                    }
                    mk5Var.f462139e = c18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenByOtherMMKV", "refreshExposeRecord: " + str + ", expiredTime: " + mk5Var.f462140f + ", curTimeMs: " + c18);
                    N.H(str, mk5Var.mo14344x5f01b1f6());
                    f0Var2 = f0Var;
                }
            }
            f0Var = f0Var3;
            f0Var2 = f0Var;
        }
        if (f0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenWayControllerAd", "aid is null, magicAdPosId: " + info.f272554n);
        }
    }
}
