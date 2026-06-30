package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class x6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f111039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f111040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(com.tencent.mm.plugin.finder.feed.a7 a7Var, long j17) {
        super(0);
        this.f111039d = a7Var;
        this.f111040e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yw2.a0 a0Var = this.f111039d.f106216o;
        if (a0Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.DrawerPresenter", "onJumpToLastViewed viewCallback is null!!!");
        } else {
            com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView = a0Var.D;
            if (finderJumpAnchorView != null) {
                finderJumpAnchorView.setLoading(true);
            }
            kotlinx.coroutines.l.d(v65.m.a(a0Var.s()), kotlinx.coroutines.q1.f310568a, null, new com.tencent.mm.plugin.finder.feed.w6(this.f111039d, this.f111040e, a0Var, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
