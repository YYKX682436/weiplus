package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class m4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 f188884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f188885e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        super(0);
        this.f188884d = yj0Var;
        this.f188885e = a7Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = this.f188884d;
        if (yj0Var.f68958xdad0d5ae != 3) {
            mv2.l lVar = mv2.l.f413130d;
            lVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderActionManager", "rePost " + yj0Var);
            yj0Var.f68965x29d3a50c = 1;
            yj0Var.f68956x9a04736f = 0;
            yj0Var.u0().m76115x6e101bcb(c01.id.a() / 1000);
            yj0Var.f68963x4ae21932 = c01.id.a();
            yj0Var.f68966x90b085b9 = 0L;
            lVar.d(new mv2.b(yj0Var, null, 0, 6, null));
        } else if (yj0Var.w0() == 2) {
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().J0(yj0Var.f68961xf609be94);
            mv2.l.f413130d.f(yj0Var, null, 0, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.DrawerPresenter", "onClickResendComment unknown:" + yj0Var.w0());
        }
        yw2.a0 a0Var = this.f188885e.f187749o;
        if (a0Var != null && (m82555x4905e9fa = a0Var.s().m82555x4905e9fa()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m82555x4905e9fa, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onClickResendComment$1$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
            m82555x4905e9fa.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m82555x4905e9fa, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onClickResendComment$1$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
