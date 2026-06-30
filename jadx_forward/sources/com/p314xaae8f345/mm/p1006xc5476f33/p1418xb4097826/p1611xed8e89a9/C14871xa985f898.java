package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0016J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfilePoiDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$a;", "", "size", "Ljz5/f0;", "setTopPadding", "Lcom/tencent/mm/plugin/finder/profile/b0;", "y", "Lcom/tencent/mm/plugin/finder/profile/b0;", "getPoiListView", "()Lcom/tencent/mm/plugin/finder/profile/b0;", "setPoiListView", "(Lcom/tencent/mm/plugin/finder/profile/b0;)V", "poiListView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer */
/* loaded from: classes2.dex */
public final class C14871xa985f898 extends com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f204823z = 0;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 poiListView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14871xa985f898(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5, com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 m80997xdc5215a6;
        android.widget.EditText m80966xdb574fcd;
        android.text.Editable text;
        super.c(z17, z18, i17);
        if (z17 || (b0Var = this.poiListView) == null || (c22482x50bddb92 = b0Var.f204855p) == null || (m80997xdc5215a6 = c22482x50bddb92.m80997xdc5215a6()) == null || (m80966xdb574fcd = m80997xdc5215a6.m80966xdb574fcd()) == null || (text = m80966xdb574fcd.getText()) == null) {
            return;
        }
        text.clear();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 getPoiListView() {
        return this.poiListView;
    }

    /* renamed from: setPoiListView */
    public final void m58609xa443c70b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var) {
        this.poiListView = b0Var;
    }

    /* renamed from: setTopPadding */
    public final void m58610xbd04defe(int i17) {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int dimensionPixelSize = (i17 >= 20 ? context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.by) : context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn)) + (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo) * i17);
        int i18 = com.p314xaae8f345.mm.ui.bh.a(context).f278669b;
        int i19 = (int) (i18 * 0.75f);
        if (dimensionPixelSize >= i19) {
            dimensionPixelSize = i19;
        }
        m82810x46bc3006(i18 - dimensionPixelSize);
        setPadding(0, getTopOffset(), 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14871xa985f898(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14871xa985f898(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
