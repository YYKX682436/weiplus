package au2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f14082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f14083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dq.b f14084f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kotlin.jvm.internal.h0 h0Var, boolean z17, dq.b bVar) {
        super(0);
        this.f14082d = h0Var;
        this.f14083e = z17;
        this.f14084f = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("FinderShortcutsService", "show drawer successfully!");
        com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer finderShortcutsDrawer = (com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer) this.f14082d.f310123d;
        if (finderShortcutsDrawer != null) {
            com.tencent.mm.view.drawer.RecyclerViewDrawer.s(finderShortcutsDrawer, false, false, 0, 7, null);
            hc2.v0.d(finderShortcutsDrawer, "finder_quick_add", "view_exp", false, null, null, 28, null);
        }
        long currentTimeMillis = this.f14083e ? java.lang.System.currentTimeMillis() : c01.id.c();
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f14084f.f242284a;
        if (o4Var != null) {
            o4Var.B("kFinderLastAddShortcutsShowTimeKey", currentTimeMillis);
        }
        return jz5.f0.f302826a;
    }
}
