package at2;

/* loaded from: classes2.dex */
public final class o0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.q0 f13725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f13726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f13727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f13728g;

    public o0(at2.q0 q0Var, o25.y1 y1Var, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f13725d = q0Var;
        this.f13726e = y1Var;
        this.f13727f = context;
        this.f13728g = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) this.f13725d.S0().a(mm2.c1.class)).f328846n;
        if (finderObject != null) {
            kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            ((com.tencent.mm.pluginsdk.forward.m) this.f13726e).aj((db5.h4) menuItem, new at2.n0(this.f13727f, this.f13728g, finderObject, menuItem));
        }
    }
}
