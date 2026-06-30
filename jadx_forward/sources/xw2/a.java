package xw2;

/* loaded from: classes10.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 f539217a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 c15387x98533664) {
        this.f539217a = c15387x98533664;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 c15387x98533664 = this.f539217a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter = c15387x98533664.getAdapter();
        if (adapter != null) {
            ym5.o1 indicator = c15387x98533664.getIndicator();
            if (indicator != null) {
                indicator.mo62752x52d311cd(adapter.mo1894x7e414b06());
            }
            ym5.o1 indicator2 = c15387x98533664.getIndicator();
            if ((indicator2 != null ? indicator2.getF213888e2() : 0) > 0) {
                com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b recyclerView = c15387x98533664.getRecyclerView();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void e(int i17, int i18) {
        ym5.o1 indicator;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 c15387x98533664 = this.f539217a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter = c15387x98533664.getAdapter();
        if (adapter == null || (indicator = c15387x98533664.getIndicator()) == null) {
            return;
        }
        indicator.mo62752x52d311cd(adapter.mo1894x7e414b06());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void g(int i17, int i18) {
        ym5.o1 indicator;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1661x2e06d1.C15387x98533664 c15387x98533664 = this.f539217a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter = c15387x98533664.getAdapter();
        if (adapter == null || (indicator = c15387x98533664.getIndicator()) == null) {
            return;
        }
        indicator.mo62752x52d311cd(adapter.mo1894x7e414b06());
    }
}
