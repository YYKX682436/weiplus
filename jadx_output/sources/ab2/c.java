package ab2;

/* loaded from: classes2.dex */
public final class c extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f2755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab2.g f2756b;

    public c(so2.j5 j5Var, ab2.g gVar) {
        this.f2755a = j5Var;
        this.f2756b = gVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) this.f2755a;
            ml2.x1 x1Var = ml2.x1.f328202f;
            ml2.q1 q1Var = ml2.q1.f327812e;
            zy2.zb.E9(zbVar, baseFinderFeed, x1Var, "temp_5", ab2.h.f2776a.a(this.f2756b), null, 0, 48, null);
        }
    }
}
