package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class er extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f103282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.kr f103283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103285g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er(so2.u1 u1Var, com.tencent.mm.plugin.finder.convert.kr krVar, int i17, in5.s0 s0Var) {
        super(0);
        this.f103282d = u1Var;
        this.f103283e = krVar;
        this.f103284f = i17;
        this.f103285g = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class)).P6(this.f103282d.getItemId());
        this.f103283e.f103855g.g().f111082k.onItemRangeChanged(this.f103284f, 1);
        android.content.Context context = this.f103285g.f293121e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            vn2.u0.f438387a.c(activity);
        }
        return jz5.f0.f302826a;
    }
}
