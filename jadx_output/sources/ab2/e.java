package ab2;

/* loaded from: classes2.dex */
public final class e implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab2.g f2761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f2762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f2763c;

    public e(ab2.g gVar, android.content.Intent intent, so2.j5 j5Var) {
        this.f2761a = gVar;
        this.f2762b = intent;
        this.f2763c = j5Var;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        ab2.g gVar = this.f2761a;
        i0Var.Ri(gVar.f106174d, this.f2762b, 10010);
        com.tencent.mm.ui.MMActivity context = gVar.f106174d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            so2.j5 j5Var = this.f2763c;
            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, V6, j5Var.getItemId(), ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).w(), gVar.f106180m.getRecyclerView(), 0, null, 0L, null, 240, null);
            com.tencent.mm.plugin.finder.report.l0.f125109a.b(V6, j5Var, 18);
        }
    }
}
