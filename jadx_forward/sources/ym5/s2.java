package ym5;

/* loaded from: classes10.dex */
public final class s2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 f545048a;

    public s2(com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 c22792x31410810) {
        this.f545048a = c22792x31410810;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 c22792x31410810 = this.f545048a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter = c22792x31410810.getAdapter();
        if (adapter != null) {
            c22792x31410810.getIndicator().mo62752x52d311cd(adapter.mo1894x7e414b06());
            if (c22792x31410810.getIndicator().getF213888e2() > 0) {
                com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b pagerView = c22792x31410810.getPagerView();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(pagerView, arrayList.toArray(), "com/tencent/mm/view/MediaBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
                pagerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(pagerView, "com/tencent/mm/view/MediaBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void e(int i17, int i18) {
        com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 c22792x31410810 = this.f545048a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter = c22792x31410810.getAdapter();
        if (adapter != null) {
            c22792x31410810.getIndicator().mo62752x52d311cd(adapter.mo1894x7e414b06());
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void g(int i17, int i18) {
        com.p314xaae8f345.mm.p2776x373aa5.C22792x31410810 c22792x31410810 = this.f545048a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter = c22792x31410810.getAdapter();
        if (adapter != null) {
            c22792x31410810.getIndicator().mo62752x52d311cd(adapter.mo1894x7e414b06());
        }
    }
}
