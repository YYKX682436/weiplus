package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1589x46a97710;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/commonview/IndicatorView;", "Landroid/widget/LinearLayout;", "", "count", "Ljz5/f0;", "setPointCount", "selectIndex", "setSelectPoint", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.commonview.IndicatorView */
/* loaded from: classes.dex */
public final class C14548x1c1bfd34 extends android.widget.LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final int f203614e = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f203615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14548x1c1bfd34(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.c6j, this);
        this.f203615d = new java.util.ArrayList();
    }

    /* renamed from: setPointCount */
    public final void m58435x66520b61(int i17) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f566870hc2);
        linearLayout.removeAllViews();
        java.util.List list = this.f203615d;
        ((java.util.ArrayList) list).clear();
        int i18 = 1;
        if (1 > i17) {
            return;
        }
        while (true) {
            android.view.View view = new android.view.View(getContext());
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.acu);
            int i19 = f203614e;
            view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i19, i19));
            ((java.util.ArrayList) list).add(view);
            linearLayout.addView(view);
            if (i18 == i17) {
                return;
            } else {
                i18++;
            }
        }
    }

    /* renamed from: setSelectPoint */
    public final void m58436x7c3da832(int i17) {
        int i18 = 0;
        for (java.lang.Object obj : this.f203615d) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((android.view.View) obj).setBackgroundResource(i18 == i17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.acv : com.p314xaae8f345.mm.R.C30861xcebc809e.acu);
            i18 = i19;
        }
    }
}
