package ax2;

/* loaded from: classes3.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15392x7f6daf59 f96630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f96631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f96632f;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15392x7f6daf59 c15392x7f6daf59, float f17, float f18) {
        this.f96630d = c15392x7f6daf59;
        this.f96631e = f17;
        this.f96632f = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 m62572x20050e0b;
        android.view.View m62577x284cda25;
        android.view.View m62577x284cda252;
        android.view.View m62577x284cda253;
        android.view.View m62577x284cda254;
        android.view.View m62577x284cda255;
        android.view.View m62577x284cda256;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15392x7f6daf59 c15392x7f6daf59 = this.f96630d;
        m62572x20050e0b = c15392x7f6daf59.m62572x20050e0b();
        int left = (int) (m62572x20050e0b.getLeft() + this.f96631e + ((this.f96632f / 2) - (c15392x7f6daf59.m62578xac266407() / 2)));
        m62577x284cda25 = c15392x7f6daf59.m62577x284cda25();
        m62577x284cda252 = c15392x7f6daf59.m62577x284cda25();
        android.view.ViewGroup.LayoutParams layoutParams = m62577x284cda252.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            m62577x284cda254 = c15392x7f6daf59.m62577x284cda25();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m62577x284cda254, "access$getLightView(...)");
            android.view.ViewGroup.LayoutParams layoutParams2 = m62577x284cda254.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i17 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
            m62577x284cda255 = c15392x7f6daf59.m62577x284cda25();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m62577x284cda255, "access$getLightView(...)");
            android.view.ViewGroup.LayoutParams layoutParams3 = m62577x284cda255.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i18 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
            m62577x284cda256 = c15392x7f6daf59.m62577x284cda25();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m62577x284cda256, "access$getLightView(...)");
            android.view.ViewGroup.LayoutParams layoutParams4 = m62577x284cda256.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
            marginLayoutParams.setMargins(left, i17, i18, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
        }
        m62577x284cda25.setLayoutParams(layoutParams);
        m62577x284cda253 = c15392x7f6daf59.m62577x284cda25();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m62577x284cda253, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView$updateBuffDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m62577x284cda253.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m62577x284cda253, "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView$updateBuffDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
