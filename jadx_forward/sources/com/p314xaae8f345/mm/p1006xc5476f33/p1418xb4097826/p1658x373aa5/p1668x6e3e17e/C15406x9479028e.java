package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator2;", "Lcom/tencent/mm/view/MediaBannerIndicator;", "Lcom/tencent/mm/plugin/finder/view/z;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator2 */
/* loaded from: classes2.dex */
public final class C15406x9479028e extends com.p314xaae8f345.mm.p2776x373aa5.C22793x8500e7df implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z {

    /* renamed from: o, reason: collision with root package name */
    public float f213892o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15406x9479028e(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        m82619x59b925f9((int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        m82618xcbf093db(ym5.x.a(getContext(), 3.0f));
        m82621xcb8d3535(getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563194zd));
        m82620xbe0d92bc(getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563195ze));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        super.onTouchEvent(event);
        if (event.getAction() == 0) {
            this.f213892o = event.getX();
        } else if (event.getAction() == 1 || event.getAction() == 3) {
            float x17 = event.getX() - this.f213892o;
            if (java.lang.Math.abs(x17) >= 15.0f) {
                if (x17 < 0.0f) {
                    ym5.n1 f294903n = getF294903n();
                    if (f294903n != null) {
                        ((mx2.f) f294903n).a(java.lang.Math.min(getF294902m() + 1, getF213888e2() - 1));
                    }
                } else {
                    ym5.n1 f294903n2 = getF294903n();
                    if (f294903n2 != null) {
                        ((mx2.f) f294903n2).a(java.lang.Math.max(getF294902m() - 1, 0));
                    }
                }
            } else if (this.f213892o < getWidth() / 2.0f) {
                ym5.n1 f294903n3 = getF294903n();
                if (f294903n3 != null) {
                    ((mx2.f) f294903n3).a(java.lang.Math.max(getF294902m() - 1, 0));
                }
            } else {
                ym5.n1 f294903n4 = getF294903n();
                if (f294903n4 != null) {
                    ((mx2.f) f294903n4).a(java.lang.Math.min(getF294902m() + 1, getF213888e2() - 1));
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z
    /* renamed from: canScrollHorizontally */
    public boolean mo57364xc6ea780e(int i17, android.view.ViewGroup parent, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.app.Activity) context).findViewById(com.p314xaae8f345.mm.R.id.f566402fs3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041 = viewGroup instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041) viewGroup : null;
        if (c15401xb8016041 != null) {
            return c15401xb8016041.mo57364xc6ea780e(i17, parent, f17, f18);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15406x9479028e(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        m82619x59b925f9((int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        m82618xcbf093db(ym5.x.a(getContext(), 3.0f));
        m82621xcb8d3535(getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563194zd));
        m82620xbe0d92bc(getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563195ze));
    }
}
