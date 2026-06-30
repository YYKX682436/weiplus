package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class mg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView f103998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx2.d f103999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.a2 f104000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qg f104001g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView, lx2.d dVar, so2.a2 a2Var, com.tencent.mm.plugin.finder.convert.qg qgVar) {
        super(0);
        this.f103998d = finderHomeTabRedDotTipsBubbleView;
        this.f103999e = dVar;
        this.f104000f = a2Var;
        this.f104001g = qgVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = this.f103998d;
        android.view.View findViewById = finderHomeTabRedDotTipsBubbleView.findViewById(com.tencent.mm.R.id.ovk);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams3 = finderHomeTabRedDotTipsBubbleView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
        lx2.d dVar = this.f103999e;
        if (dVar != null) {
            dVar.i(findViewById, layoutParams2, layoutParams4);
        }
        pm0.v.a(finderHomeTabRedDotTipsBubbleView, new com.tencent.mm.plugin.finder.convert.lg(finderHomeTabRedDotTipsBubbleView, this.f104000f, this.f104001g));
        finderHomeTabRedDotTipsBubbleView.requestLayout();
        return jz5.f0.f302826a;
    }
}
