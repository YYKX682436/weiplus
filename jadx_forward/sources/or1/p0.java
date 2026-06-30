package or1;

/* loaded from: classes9.dex */
public class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.s0 f429084d;

    public p0(or1.s0 s0Var) {
        this.f429084d = s0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        or1.s0 s0Var = this.f429084d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f429100d) && menuItem.getItemId() == 1) {
            java.lang.String str = s0Var.f429100d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871) s0Var.f429103g.get();
            if (c12980x8e9ea871 == null) {
                return;
            }
            android.content.Context context = c12980x8e9ea871.getContext();
            db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c17), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572660c16), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new or1.r0(s0Var, str, context), null);
        }
    }
}
