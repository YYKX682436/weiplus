package vt2;

/* loaded from: classes3.dex */
public final class m implements ek2.n2 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f521512d = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final long f521513a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.y23 f521514b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f521515c;

    public m(long j17, r45.y23 product, java.lang.ref.WeakReference rAdapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(product, "product");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rAdapter, "rAdapter");
        this.f521513a = j17;
        this.f521514b = product;
        this.f521515c = rAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ek2.n2
    public void a(ek2.o2 cgi, int i17, int i18, java.lang.String str, r45.zb2 resp) {
        java.util.LinkedList m75941xfb821914;
        r45.z64 z64Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgi, "cgi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        r45.y23 y23Var = this.f521514b;
        vt2.l lVar = (vt2.l) f521512d.get(java.lang.Long.valueOf(y23Var.m75942xfb822ef2(0)));
        if (lVar != null) {
            lVar.f521511d = false;
        }
        r45.yb2 yb2Var = cgi.f335046w;
        long m75942xfb822ef2 = yb2Var.m75942xfb822ef2(6);
        long j17 = this.f521513a;
        if (m75942xfb822ef2 != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ProductRefreshPresenter", "liveId not match: " + yb2Var.m75942xfb822ef2(6) + " request liveId: " + j17);
            return;
        }
        if (i17 != 0 || i18 != 0 || resp.m75941xfb821914(1) == null || (m75941xfb821914 = resp.m75941xfb821914(1)) == null) {
            return;
        }
        for (r45.ij6 ij6Var : kz5.n0.V(m75941xfb821914)) {
            if (ij6Var.m75939xb282bd08(1) == 0 && ij6Var.m75939xb282bd08(0) == 2 && ij6Var.m75934xbce7f2f(2) != null) {
                r45.yy2 yy2Var = new r45.yy2();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ij6Var.m75934xbce7f2f(2);
                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                if (g17 != null) {
                    try {
                        yy2Var.mo11468x92b714fd(g17);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
                r45.y23 y23Var2 = (r45.y23) yy2Var.m75936x14adae67(0);
                if (y23Var2 != 0 && y23Var2.m75942xfb822ef2(0) == y23Var.m75942xfb822ef2(0)) {
                    tt2.e1 e1Var = (tt2.e1) this.f521515c.get();
                    if (e1Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ProductRefreshPresenter", "refreshProduct suc,but adapter is null!");
                        return;
                    }
                    r45.w23 w23Var = (r45.w23) y23Var2.m75936x14adae67(77);
                    boolean z17 = (w23Var == null || (z64Var = (r45.z64) w23Var.m75936x14adae67(1)) == null || !z64Var.m75933x41a8a7f2(0)) ? false : true;
                    int i19 = z17 ? 12 : 5;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ProductRefreshPresenter", "refreshProduct price " + y23Var.m75939xb282bd08(5) + " -> " + y23Var2.m75939xb282bd08(5) + ", isLimitedSubsidy=" + z17 + ", payload=" + i19);
                    e1Var.U(1, y23Var2, java.lang.Integer.valueOf(i19));
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshProduct:");
                sb6.append(pm0.b0.b(y23Var2 != 0 ? y23Var2 : ""));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ProductRefreshPresenter", sb6.toString());
            }
        }
    }
}
