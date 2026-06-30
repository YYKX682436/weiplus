package ze5;

/* loaded from: classes9.dex */
public final class t7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f553741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f553743f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(long j17, yb5.d dVar, android.view.View view) {
        super(2);
        this.f553741d = j17;
        this.f553742e = dVar;
        this.f553743f = view;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int m75888x1c4fb41d;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((android.view.View) obj, "<anonymous parameter 0>");
        long j17 = this.f553741d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "[LAYOUT_TRACE] smoothHeightChanged: svrId=%d, dy=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue));
        sb5.r2 r2Var = (sb5.r2) this.f553742e.f542241c.a(sb5.r2.class);
        if (r2Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hp hpVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hp) r2Var;
            android.view.View itemView = this.f553743f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
            yb5.d dVar = hpVar.f280113d;
            boolean B = dVar != null ? dVar.B() : false;
            if (intValue > 0) {
                if (hpVar.f280734i) {
                    hpVar.f280734i = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawMdScroll", "suppressNextDy consumed, svrId=%d", java.lang.Long.valueOf(j17));
                } else if (!hpVar.f280731f) {
                    if (B) {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 p17 = dVar != null ? dVar.p() : null;
                        if (p17 != null && (m75888x1c4fb41d = p17.m75888x1c4fb41d()) > 0) {
                            android.util.DisplayMetrics displayMetrics = itemView.getResources().getDisplayMetrics();
                            int max = (int) (java.lang.Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels) * 0.25f);
                            int top = itemView.getTop();
                            int i17 = m75888x1c4fb41d - top;
                            if (!hpVar.f280733h) {
                                if (!hpVar.f280732g) {
                                    if (i17 >= max) {
                                        hpVar.f280732g = true;
                                        fd5.d m07 = hpVar.m0();
                                        if (m07 != null) {
                                            m07.c(false);
                                        }
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawMdScroll", "enter CAPPED: svrId=%d, top=%d, rvH=%d, remain=%d, reserve=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(top), java.lang.Integer.valueOf(m75888x1c4fb41d), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(max));
                                    }
                                }
                            }
                            fd5.d m08 = hpVar.m0();
                            if (m08 != null) {
                                m08.c(true);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawMdScroll", "follow layoutToLast: svrId=%d, dy=%d, top=%d, uncapped=%b", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(top), java.lang.Boolean.valueOf(hpVar.f280733h));
                        }
                    } else {
                        fd5.d m09 = hpVar.m0();
                        if (m09 != null) {
                            m09.c(false);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawMdScroll", "skip: not at bottom, svrId=%d, dy=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue));
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
