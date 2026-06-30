package ni2;

/* loaded from: classes3.dex */
public final class v implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.w f419016d;

    public v(ni2.w wVar) {
        this.f419016d = wVar;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 contributorRv;
        ni2.w wVar = this.f419016d;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = wVar.f419023n;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        int m8300xfda78ef6 = c1190x18d3c3fe.m8300xfda78ef6();
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = wVar.f419023n;
        if (c1190x18d3c3fe2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        int childCount = c1190x18d3c3fe2.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe3 = wVar.f419023n;
            if (c1190x18d3c3fe3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            android.view.View childAt = c1190x18d3c3fe3.getChildAt(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 c14234xd22fbb35 = childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04.C14234xd22fbb35) childAt : null;
            if (c14234xd22fbb35 != null && (contributorRv = c14234xd22fbb35.getContributorRv()) != null) {
                int i19 = i18 == m8300xfda78ef6 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(contributorRv, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                contributorRv.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(contributorRv, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelWidget", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                contributorRv.setNestedScrollingEnabled(i18 == m8300xfda78ef6);
            }
            i18++;
        }
    }
}
