package c23;

/* loaded from: classes.dex */
public final class t extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f38053d;

    /* renamed from: e, reason: collision with root package name */
    public long f38054e;

    /* renamed from: f, reason: collision with root package name */
    public final long f38055f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.i f38056g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f38053d = "MicroMsg.FTS.FTSPardusUIC";
        this.f38055f = 60L;
    }

    public static final void T6(c23.t tVar) {
        tVar.getClass();
        if (java.lang.System.currentTimeMillis() - tVar.f38054e <= tVar.f38055f * 1000 || su4.r2.l()) {
            return;
        }
        com.tencent.mm.modelbase.i iVar = tVar.f38056g;
        if (iVar != null) {
            iVar.j();
        }
        r45.b55 b55Var = new r45.b55();
        b55Var.f370532d = su4.r2.i();
        b55Var.f370533e = su4.r2.g();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1417;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/parduspresearch";
        lVar.f70664a = b55Var;
        lVar.f70665b = new r45.c55();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar2 = new com.tencent.mm.modelbase.i();
        iVar2.p(a17);
        tVar.f38056g = iVar2;
        pq5.g l17 = iVar2.l();
        if (l17 != null) {
            android.view.LayoutInflater.Factory activity = tVar.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.vending.lifecycle.ILifeCycleKeeper<*>");
            l17.f((im5.b) activity);
            l17.q(new c23.s(tVar));
        }
        tVar.f38054e = c01.id.c();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.m3(getActivity(), new c23.r(this));
        }
    }
}
