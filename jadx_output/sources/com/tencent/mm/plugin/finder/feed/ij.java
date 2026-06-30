package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ij extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f107037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f107038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f107039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f107040g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f107041h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f107042i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f107043m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(com.tencent.mm.plugin.finder.feed.xj xjVar, android.widget.TextView textView, int i17, so2.u1 u1Var, android.content.Context context, yz5.a aVar, boolean z17) {
        super(0);
        this.f107037d = xjVar;
        this.f107038e = textView;
        this.f107039f = i17;
        this.f107040g = u1Var;
        this.f107041h = context;
        this.f107042i = aVar;
        this.f107043m = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f107037d.b(this.f107038e, this.f107039f - 1, this.f107040g, this.f107041h, this.f107042i, this.f107043m);
        return jz5.f0.f302826a;
    }
}
