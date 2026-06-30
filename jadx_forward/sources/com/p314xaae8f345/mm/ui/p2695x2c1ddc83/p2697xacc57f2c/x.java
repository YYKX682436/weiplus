package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes11.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 f289120f;

    public x(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 a0Var, int i17, int i18) {
        this.f289120f = a0Var;
        this.f289118d = i17;
        this.f289119e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f289118d, this.f289119e);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 a0Var = this.f289120f;
        android.content.Context context = (android.content.Context) a0Var.f484375g.get();
        a0Var.getClass();
        j45.l.h(context, "game", ".ui.GameCenterUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11002, 9, 1);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
