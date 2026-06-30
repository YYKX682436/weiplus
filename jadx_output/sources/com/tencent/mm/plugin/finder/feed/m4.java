package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.yj0 f107351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f107352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.tencent.mm.plugin.finder.storage.yj0 yj0Var, com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(0);
        this.f107351d = yj0Var;
        this.f107352e = a7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f107351d;
        if (yj0Var.field_failedFlag != 3) {
            mv2.l lVar = mv2.l.f331597d;
            lVar.getClass();
            com.tencent.mars.xlog.Log.i("Finder.FinderActionManager", "rePost " + yj0Var);
            yj0Var.field_state = 1;
            yj0Var.field_canRemove = 0;
            yj0Var.u0().setCreatetime(c01.id.a() / 1000);
            yj0Var.field_postTime = c01.id.a();
            yj0Var.field_tryCount = 0L;
            lVar.d(new mv2.b(yj0Var, null, 0, 6, null));
        } else if (yj0Var.w0() == 2) {
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().J0(yj0Var.field_localCommentId);
            mv2.l.f331597d.f(yj0Var, null, 0, null);
        } else {
            com.tencent.mars.xlog.Log.w("Finder.DrawerPresenter", "onClickResendComment unknown:" + yj0Var.w0());
        }
        yw2.a0 a0Var = this.f107352e.f106216o;
        if (a0Var != null && (recyclerView = a0Var.s().getRecyclerView()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onClickResendComment$1$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onClickResendComment$1$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
