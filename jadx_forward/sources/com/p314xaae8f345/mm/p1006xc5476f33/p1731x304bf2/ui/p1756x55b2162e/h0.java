package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public final class h0 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16007x9ab46e2d f222807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15749x39c3d7b4 f222808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222809g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16007x9ab46e2d c16007x9ab46e2d, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15749x39c3d7b4 c15749x39c3d7b4, android.view.View view) {
        super(1, null);
        this.f222807e = c16007x9ab46e2d;
        this.f222808f = c15749x39c3d7b4;
        this.f222809g = view;
    }

    @Override // tg3.a
    public void a(android.view.View widget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        s33.y.h(this.f222807e.m7550xf0c4608a(), this.f222808f.f36652x28d1961f);
        android.view.View view = this.f222809g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment$handleGamePermission$2", "onClickImp", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment$handleGamePermission$2", "onClickImp", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
