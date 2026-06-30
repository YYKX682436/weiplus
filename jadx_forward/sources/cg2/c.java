package cg2;

/* loaded from: classes3.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f122619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cg2.l f122620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f122621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f122622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f122623h;

    public c(in5.s0 s0Var, cg2.l lVar, dk2.zf zfVar, android.widget.PopupWindow.OnDismissListener onDismissListener, android.content.Context context) {
        this.f122619d = s0Var;
        this.f122620e = lVar;
        this.f122621f = zfVar;
        this.f122622g = onDismissListener;
        this.f122623h = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        int itemId = menuItem.getItemId();
        dk2.zf bulletInfo = this.f122621f;
        cg2.l lVar = this.f122620e;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.f122622g;
        in5.s0 s0Var = this.f122619d;
        cg2.i iVar = cg2.i.f122639a;
        if (itemId == 1) {
            cg2.i.a(iVar, s0Var, ml2.t1.f409489i3);
            cg2.i.f122641c = false;
            bg2.x0 x0Var = (bg2.x0) lVar;
            x0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletInfo, "bulletInfo");
            in5.s0 s0Var2 = x0Var.f498674d.f498682i;
            if (s0Var2 != null && (y0Var = s0Var2.f374653d) != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.n0(x0Var, bulletInfo, null), 3, null);
            }
            onDismissListener.onDismiss();
            return;
        }
        if (itemId == 3) {
            cg2.i.a(iVar, s0Var, ml2.t1.f409486h3);
            bg2.x0 x0Var2 = (bg2.x0) lVar;
            in5.s0 s0Var3 = x0Var2.f498674d.f498682i;
            android.content.Context context = s0Var3 != null ? s0Var3.f374654e : null;
            if (context != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x0Var2.f102146e, "[closeDanmaku] start live feed danmaku close");
                zl2.q4.f555466a.J(context, false, new bg2.l0(x0Var2, context));
            }
            onDismissListener.onDismiss();
            return;
        }
        if (itemId != 4) {
            return;
        }
        cg2.i.a(iVar, s0Var, ml2.t1.f409483g3);
        java.lang.String j17 = bulletInfo.j();
        if (j17 == null) {
            j17 = "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(j17);
            android.content.Context context2 = this.f122623h;
            db5.e1.T(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
        }
        onDismissListener.onDismiss();
    }
}
