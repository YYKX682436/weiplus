package cg2;

/* loaded from: classes3.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cg2.l f41098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f41099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f41100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f41101g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f41102h;

    public e(cg2.l lVar, dk2.zf zfVar, in5.s0 s0Var, android.content.Context context, android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f41098d = lVar;
        this.f41099e = zfVar;
        this.f41100f = s0Var;
        this.f41101g = context;
        this.f41102h = onDismissListener;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        dk2.zf zfVar = this.f41099e;
        cg2.i iVar = cg2.i.f41106a;
        in5.s0 s0Var = this.f41100f;
        if (itemId != 2) {
            if (itemId != 5) {
                return;
            }
            cg2.i.f41108c = false;
            ((bg2.x0) this.f41098d).Z6(zfVar);
            cg2.i.a(iVar, s0Var, ml2.t1.f327944e3);
            return;
        }
        cg2.i.a(iVar, s0Var, ml2.t1.f327947f3);
        cg2.i.f41108c = true;
        android.content.Context context = this.f41101g;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        k0Var.f211872n = new cg2.b(zfVar, context.getResources());
        android.content.Context context2 = this.f41101g;
        in5.s0 s0Var2 = this.f41100f;
        dk2.zf zfVar2 = this.f41099e;
        cg2.l lVar = this.f41098d;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.f41102h;
        k0Var.f211881s = new cg2.c(s0Var2, lVar, zfVar2, onDismissListener, context2);
        k0Var.f211854d = new cg2.d(onDismissListener, s0Var2);
        k0Var.v();
        iVar.b(s0Var, ml2.u1.f328042e3);
    }
}
