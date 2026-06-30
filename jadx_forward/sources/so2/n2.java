package so2;

/* loaded from: classes2.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.o2 f492026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f492027e;

    public n2(so2.o2 o2Var, java.lang.String str) {
        this.f492026d = o2Var;
        this.f492027e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        so2.o2 o2Var = this.f492026d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = o2Var.f492056e;
        java.lang.String str = this.f492027e;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(str);
        if (num == null || num.intValue() != 2) {
            if (num != null && num.intValue() == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveJumpReportManager", "[tryCheckExposeReport] expose report with resume}");
                so2.m2 m2Var = (so2.m2) o2Var.f492054c.get(str);
                if (m2Var != null) {
                    ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
                    ml2.f0 liveFeed = m2Var.f492012a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveFeed, "liveFeed");
                    ml2.j0.f409117m.i(liveFeed, m2Var.f492013b);
                    return;
                }
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveJumpReportManager", "[tryCheckExposeReport] expose report with pageSelected}");
        so2.l2 l2Var = (so2.l2) o2Var.f492055d.get(str);
        if (l2Var != null) {
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            int i17 = l2Var.f491997b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = l2Var.f491999d;
            r45.qt2 qt2Var = l2Var.f492000e;
            ((ml2.j0) zbVar).getClass();
            ml2.x1 actionType = l2Var.f491996a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
            java.lang.String commentscene = l2Var.f491998c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
            ml2.j0.f409117m.j(actionType, i17, commentscene, c14989xf862ae88, qt2Var);
        }
    }
}
