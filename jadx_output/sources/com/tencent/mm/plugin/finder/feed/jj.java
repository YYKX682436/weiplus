package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class jj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f107110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f107111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f107112f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f107113g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f107114h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f107115i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f107116m;

    public jj(com.tencent.mm.plugin.finder.feed.xj xjVar, android.widget.TextView textView, int i17, so2.u1 u1Var, android.content.Context context, yz5.a aVar, boolean z17) {
        this.f107110d = xjVar;
        this.f107111e = textView;
        this.f107112f = i17;
        this.f107113g = u1Var;
        this.f107114h = context;
        this.f107115i = aVar;
        this.f107116m = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ij(this.f107110d, this.f107111e, this.f107112f, this.f107113g, this.f107114h, this.f107115i, this.f107116m));
    }
}
