package gp2;

/* loaded from: classes10.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f355824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 f355826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355827g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f355828h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yz5.a aVar, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962, gp2.l0 l0Var, so2.h1 h1Var) {
        super(0);
        this.f355824d = aVar;
        this.f355825e = view;
        this.f355826f = c14522x8ffd8962;
        this.f355827g = l0Var;
        this.f355828h = h1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.a aVar = this.f355824d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!this.f355826f.f203066q);
        android.view.View view = this.f355825e;
        view.setTag(com.p314xaae8f345.mm.R.id.k67, valueOf);
        view.setTag(com.p314xaae8f345.mm.R.id.f567633k62, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        boolean z17 = gp2.l0.N;
        gp2.l0 l0Var = this.f355827g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "checkAutoPlayByOutside: onFirstFrameRendStartCallback feed=" + this.f355828h + " tabId:" + l0Var.f355779e);
        return jz5.f0.f384359a;
    }
}
