package mx2;

/* loaded from: classes2.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 f414017a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041) {
        this.f414017a = c15401xb8016041;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041 = this.f414017a;
        ym5.o1 indicator = c15401xb8016041.getIndicator();
        if (indicator != null) {
            indicator.mo62752x52d311cd(c15401xb8016041.getImageAdapter().mo1894x7e414b06());
        }
        ym5.o1 indicator2 = c15401xb8016041.getIndicator();
        if ((indicator2 != null ? indicator2.getF213888e2() : 0) > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15299xde732234 m61652x7f02fdf3 = c15401xb8016041.m61652x7f02fdf3();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m61652x7f02fdf3, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
            m61652x7f02fdf3.h1(((java.lang.Integer) arrayList.get(0)).intValue(), true);
            yj0.a.f(m61652x7f02fdf3, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void e(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041 = this.f414017a;
        ym5.o1 indicator = c15401xb8016041.getIndicator();
        if (indicator != null) {
            indicator.mo62752x52d311cd(c15401xb8016041.getImageAdapter().mo1894x7e414b06());
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void g(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041 = this.f414017a;
        ym5.o1 indicator = c15401xb8016041.getIndicator();
        if (indicator != null) {
            indicator.mo62752x52d311cd(c15401xb8016041.getImageAdapter().mo1894x7e414b06());
        }
    }
}
