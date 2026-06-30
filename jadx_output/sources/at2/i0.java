package at2;

/* loaded from: classes3.dex */
public final class i0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f13688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at2.q0 f13689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f13690f;

    public i0(com.tencent.mm.ui.widget.dialog.k0 k0Var, at2.q0 q0Var, android.content.Context context) {
        this.f13688d = k0Var;
        this.f13689e = q0Var;
        this.f13690f = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f13688d.o(null);
        g4Var.clear();
        at2.q0 q0Var = this.f13689e;
        android.content.Context context = this.f13690f;
        q0Var.getClass();
        zl2.q4 q4Var = zl2.q4.f473933a;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) q0Var.P0(mm2.c1.class)).f328846n;
        if (((finderObject != null ? finderObject.getPermissionFlag() : 0) & 1) == 0) {
            g4Var.h(1, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.dyd), com.tencent.mm.R.raw.finder_icons_filled_share, context.getResources().getColor(com.tencent.mm.R.color.f478502m));
            g4Var.h(2, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.dye), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0);
        }
    }
}
