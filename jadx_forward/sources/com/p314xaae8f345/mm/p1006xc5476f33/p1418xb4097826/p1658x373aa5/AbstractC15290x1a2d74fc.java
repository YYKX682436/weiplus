package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Lcom/tencent/mm/plugin/finder/view/ka;", "Lcom/tencent/mm/ui/MMActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Lcom/tencent/mm/ui/MMActivity;", "getActivity", "()Lcom/tencent/mm/ui/MMActivity;", "", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "fragments", "Ljava/util/List;", "", "lastIndex", "I", "lastType", "Companion", "com/tencent/mm/plugin/finder/view/la", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver */
/* loaded from: classes2.dex */
public abstract class AbstractC15290x1a2d74fc implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka {

    /* renamed from: Companion */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.la f36314x233c02ec = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.la(null);
    public static final java.lang.String TAG = "Finder.FragmentChangeObserver";
    private final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity;
    private final java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180> fragments;
    private int lastIndex;
    private int lastType;

    public AbstractC15290x1a2d74fc(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, java.util.List fragments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragments, "fragments");
        this.activity = activity;
        this.fragments = fragments;
        this.lastIndex = -1;
        this.lastType = -1;
    }

    public final void a() {
        int i17 = 0;
        for (java.lang.Object obj : this.fragments) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) obj;
            if (this.lastIndex == i17) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).w8(abstractC15124x7bae6180);
                abstractC15124x7bae6180.p0();
                z(false, i17, abstractC15124x7bae6180);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class)).a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ma.f214169d);
            }
            i17 = i18;
        }
    }

    public final void b() {
        int i17 = this.lastIndex;
        l(i17, i17, this.lastType, this.fragments.get(i17).f210798p);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) kz5.n0.a0(this.fragments, this.lastIndex);
        if (abstractC15124x7bae6180 != null) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = abstractC15124x7bae6180.mo7430x19263085();
            if (mo7430x19263085 != null) {
                if (this.lastIndex == -1) {
                    android.app.Activity Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui();
                    if (Ui == null) {
                        Ui = abstractC15124x7bae6180.mo7430x19263085();
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo7430x19263085, Ui)) {
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(abstractC15124x7bae6180);
                    }
                } else {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(abstractC15124x7bae6180);
                }
            }
            abstractC15124x7bae6180.o0();
            z(true, this.lastIndex, abstractC15124x7bae6180);
        }
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
        if (i17 >= 0 && i17 < this.fragments.size()) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.activity;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 activityC14075x761bf857 = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) abstractActivityC21394xb3d2c0cf : null;
            boolean c76 = activityC14075x761bf857 != null ? activityC14075x761bf857.c7() : false;
            java.lang.String name = this.fragments.get(i17).getClass().getName();
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            java.lang.String str = (java.lang.String) ml2.j0.f409116i.H.get(name);
            if (!c76 && str != null) {
                p52.h.f433556h = name;
            }
        }
        int i18 = this.lastIndex;
        if (i18 != i17) {
            G3(i18, i17, this.lastType, this.fragments.get(i17).f210798p);
            int i19 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = null;
            for (java.lang.Object obj : this.fragments) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae61802 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) obj;
                if (i17 == i19) {
                    abstractC15124x7bae6180 = abstractC15124x7bae61802;
                } else if (this.lastIndex == i19) {
                    abstractC15124x7bae61802.p0();
                    z(false, i19, abstractC15124x7bae61802);
                }
                if (i17 != i19) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).w8(abstractC15124x7bae61802);
                }
                i19 = i27;
            }
            l(this.lastIndex, i17, this.lastType, this.fragments.get(i17).f210798p);
            if (abstractC15124x7bae6180 != null) {
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = abstractC15124x7bae6180.mo7430x19263085();
                if (mo7430x19263085 != null) {
                    if (this.lastIndex == -1) {
                        android.app.Activity Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui();
                        if (Ui == null) {
                            Ui = abstractC15124x7bae6180.mo7430x19263085();
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo7430x19263085, Ui)) {
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(abstractC15124x7bae6180);
                        }
                    } else {
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(abstractC15124x7bae6180);
                    }
                }
                abstractC15124x7bae6180.o0();
                z(true, i17, abstractC15124x7bae6180);
            }
        }
        this.lastIndex = i17;
        this.lastType = this.fragments.get(i17).f210798p;
    }
}
