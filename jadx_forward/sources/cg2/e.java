package cg2;

/* loaded from: classes3.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cg2.l f122631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f122632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f122633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f122634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f122635h;

    public e(cg2.l lVar, dk2.zf zfVar, in5.s0 s0Var, android.content.Context context, android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f122631d = lVar;
        this.f122632e = zfVar;
        this.f122633f = s0Var;
        this.f122634g = context;
        this.f122635h = onDismissListener;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        dk2.zf zfVar = this.f122632e;
        cg2.i iVar = cg2.i.f122639a;
        in5.s0 s0Var = this.f122633f;
        if (itemId != 2) {
            if (itemId != 5) {
                return;
            }
            cg2.i.f122641c = false;
            ((bg2.x0) this.f122631d).Z6(zfVar);
            cg2.i.a(iVar, s0Var, ml2.t1.f409477e3);
            return;
        }
        cg2.i.a(iVar, s0Var, ml2.t1.f409480f3);
        cg2.i.f122641c = true;
        android.content.Context context = this.f122634g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        k0Var.f293405n = new cg2.b(zfVar, context.getResources());
        android.content.Context context2 = this.f122634g;
        in5.s0 s0Var2 = this.f122633f;
        dk2.zf zfVar2 = this.f122632e;
        cg2.l lVar = this.f122631d;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.f122635h;
        k0Var.f293414s = new cg2.c(s0Var2, lVar, zfVar2, onDismissListener, context2);
        k0Var.f293387d = new cg2.d(onDismissListener, s0Var2);
        k0Var.v();
        iVar.b(s0Var, ml2.u1.f409575e3);
    }
}
