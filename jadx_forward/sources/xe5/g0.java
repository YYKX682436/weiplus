package xe5;

/* loaded from: classes10.dex */
public class g0 implements xe5.i0 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f535559g = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_LIVE_NOTIFY_REJECT_STATUS");

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f535560a;

    /* renamed from: c, reason: collision with root package name */
    public zy2.gc f535562c;

    /* renamed from: d, reason: collision with root package name */
    public zy2.gc f535563d;

    /* renamed from: f, reason: collision with root package name */
    public int f535565f;

    /* renamed from: b, reason: collision with root package name */
    public final xe5.i f535561b = new xe5.i();

    /* renamed from: e, reason: collision with root package name */
    public final j31.c f535564e = new j31.c();

    public static final void b(xe5.g0 g0Var, r45.ix0 ix0Var, xe5.i iVar, java.lang.String str, yb5.d dVar) {
        java.lang.String d17 = g0Var.d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rejectNotify unreject key:");
        sb6.append(str);
        sb6.append(", ret code = ");
        boolean z17 = true;
        sb6.append(ix0Var.m75939xb282bd08(1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d17, sb6.toString());
        if (ix0Var.m75939xb282bd08(1) == 0) {
            android.widget.TextView textView = iVar.f535583k;
            if (textView != null) {
                textView.setVisibility(8);
            }
            f535559g.putBoolean(str, false);
            return;
        }
        java.lang.String m75945x2fec8307 = ix0Var.m75945x2fec8307(2);
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        db5.t7.g(dVar.g(), ix0Var.m75945x2fec8307(2));
    }

    public static final void c(xe5.g0 g0Var, r45.ix0 ix0Var, xe5.i iVar, java.lang.String str, yb5.d dVar) {
        java.lang.String d17 = g0Var.d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rejectNotify reject key:");
        sb6.append(str);
        sb6.append(", ret code = ");
        boolean z17 = true;
        sb6.append(ix0Var.m75939xb282bd08(1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d17, sb6.toString());
        if (ix0Var.m75939xb282bd08(1) == 0) {
            android.widget.TextView textView = iVar.f535583k;
            if (textView != null) {
                textView.setVisibility(0);
            }
            f535559g.putBoolean(str, true);
            return;
        }
        java.lang.String m75945x2fec8307 = ix0Var.m75945x2fec8307(2);
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        db5.t7.g(dVar.g(), ix0Var.m75945x2fec8307(2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x034a, code lost:
    
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wk) r0).m0(r52.m124847x74d37ac6(), 21811) == false) goto L129;
     */
    @Override // xe5.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fl r50, java.util.Map r51, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r52, yb5.d r53) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xe5.g0.a(com.tencent.mm.ui.chatting.viewitems.fl, java.util.Map, com.tencent.mm.storage.f9, yb5.d):void");
    }

    public java.lang.String d() {
        return "FinderLiveNotifyTmplV1";
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.String r49, long r50, long r52, dm.r4 r54, long r55, java.lang.String r57, java.lang.String r58, xe5.i r59, java.lang.String r60, int r61, java.lang.String r62) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xe5.g0.e(java.lang.String, long, long, dm.r4, long, java.lang.String, java.lang.String, xe5.i, java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:377:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.Map r52, java.lang.String r53, xe5.i r54, boolean r55, java.lang.String r56, java.lang.String r57, yb5.d r58, long r59, long r61, java.lang.String r63, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r64, java.lang.String r65, java.lang.String r66, int r67) {
        /*
            Method dump skipped, instructions count: 3038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xe5.g0.f(java.util.Map, java.lang.String, xe5.i, boolean, java.lang.String, java.lang.String, yb5.d, long, long, java.lang.String, com.tencent.mm.storage.f9, java.lang.String, java.lang.String, int):void");
    }
}
