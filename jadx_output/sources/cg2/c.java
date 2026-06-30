package cg2;

/* loaded from: classes3.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f41086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cg2.l f41087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f41088f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f41089g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f41090h;

    public c(in5.s0 s0Var, cg2.l lVar, dk2.zf zfVar, android.widget.PopupWindow.OnDismissListener onDismissListener, android.content.Context context) {
        this.f41086d = s0Var;
        this.f41087e = lVar;
        this.f41088f = zfVar;
        this.f41089g = onDismissListener;
        this.f41090h = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlinx.coroutines.y0 y0Var;
        int itemId = menuItem.getItemId();
        dk2.zf bulletInfo = this.f41088f;
        cg2.l lVar = this.f41087e;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.f41089g;
        in5.s0 s0Var = this.f41086d;
        cg2.i iVar = cg2.i.f41106a;
        if (itemId == 1) {
            cg2.i.a(iVar, s0Var, ml2.t1.f327956i3);
            cg2.i.f41108c = false;
            bg2.x0 x0Var = (bg2.x0) lVar;
            x0Var.getClass();
            kotlin.jvm.internal.o.g(bulletInfo, "bulletInfo");
            in5.s0 s0Var2 = x0Var.f417141d.f417149i;
            if (s0Var2 != null && (y0Var = s0Var2.f293120d) != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new bg2.n0(x0Var, bulletInfo, null), 3, null);
            }
            onDismissListener.onDismiss();
            return;
        }
        if (itemId == 3) {
            cg2.i.a(iVar, s0Var, ml2.t1.f327953h3);
            bg2.x0 x0Var2 = (bg2.x0) lVar;
            in5.s0 s0Var3 = x0Var2.f417141d.f417149i;
            android.content.Context context = s0Var3 != null ? s0Var3.f293121e : null;
            if (context != null) {
                com.tencent.mars.xlog.Log.i(x0Var2.f20613e, "[closeDanmaku] start live feed danmaku close");
                zl2.q4.f473933a.J(context, false, new bg2.l0(x0Var2, context));
            }
            onDismissListener.onDismiss();
            return;
        }
        if (itemId != 4) {
            return;
        }
        cg2.i.a(iVar, s0Var, ml2.t1.f327950g3);
        java.lang.String j17 = bulletInfo.j();
        if (j17 == null) {
            j17 = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
            com.tencent.mm.sdk.platformtools.b0.e(j17);
            android.content.Context context2 = this.f41090h;
            db5.e1.T(context2, context2.getString(com.tencent.mm.R.string.f490361st));
        }
        onDismissListener.onDismiss();
    }
}
