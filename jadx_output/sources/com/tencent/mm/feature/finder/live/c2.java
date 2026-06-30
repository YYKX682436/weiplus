package com.tencent.mm.feature.finder.live;

/* loaded from: classes2.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f66630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.content.Context context, yz5.l lVar, int i17) {
        super(0);
        this.f66628d = context;
        this.f66629e = lVar;
        this.f66630f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        g92.b bVar = g92.b.f269769e;
        m92.f fVar = new m92.f();
        fVar.set(4, java.lang.Integer.valueOf(this.f66630f));
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[saveVisitorRoleInfo] current_alias_role_type:" + fVar.getInteger(4) + ", next_alias_mod_available_time:" + fVar.getLong(5));
        bVar.S1(fVar, m92.j.f324996n);
        db5.t7.h(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f66628d.getString(com.tencent.mm.R.string.cqj));
        this.f66629e.invoke(java.lang.Boolean.TRUE);
        return jz5.f0.f302826a;
    }
}
