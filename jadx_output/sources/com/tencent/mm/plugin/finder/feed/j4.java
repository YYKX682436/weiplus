package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class j4 implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f107083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEmojiView f107084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f107085f;

    public j4(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, kotlin.jvm.internal.h0 h0Var) {
        this.f107083d = linkedList;
        this.f107084e = finderEmojiView;
        this.f107085f = h0Var;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "open comment emoji half screen isOpen %b isBegin %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z18) {
            return;
        }
        java.util.LinkedList linkedList = this.f107083d;
        if (z17) {
            java.lang.Integer num = (java.lang.Integer) linkedList.peek();
            if (num != null && num.intValue() == 17) {
                return;
            }
            linkedList.push(17);
            return;
        }
        android.content.Context context = this.f107084e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.u6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).f136098f = false;
        java.lang.Integer num2 = (java.lang.Integer) linkedList.peek();
        if (num2 != null && num2.intValue() == 17) {
            linkedList.pop();
        }
        com.tencent.mm.plugin.listener.FinderLiteAppHalfDrawListener finderLiteAppHalfDrawListener = (com.tencent.mm.plugin.listener.FinderLiteAppHalfDrawListener) this.f107085f.f310123d;
        if (finderLiteAppHalfDrawListener == null) {
            return;
        }
        finderLiteAppHalfDrawListener.f143403f = null;
    }
}
