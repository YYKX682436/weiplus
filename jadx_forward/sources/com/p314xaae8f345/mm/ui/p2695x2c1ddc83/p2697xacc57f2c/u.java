package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes11.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 f289111f;

    public u(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 a0Var, int i17, int i18) {
        this.f289111f = a0Var;
        this.f289109d = i17;
        this.f289110e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f289109d, this.f289110e);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 a0Var = this.f289111f;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0.l(a0Var, (android.content.Context) a0Var.f484375g.get(), false);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
