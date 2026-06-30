package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class el extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15290x1a2d74fc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f215808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca f215809e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca, java.util.ArrayList arrayList) {
        super((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112, arrayList);
        this.f215808d = activityC0065xcd7aa112;
        this.f215809e = c15456x2c452bca;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void G3(int i17, int i18, int i19, int i27) {
        java.util.Iterator it = this.f215809e.f215108o.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka) it.next()).G3(i17, i18, i19, i27);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void l(int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$1", "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", "onFragmentChange", "(IIII)V", this, bVar.a());
        if (i17 != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206788a, true, false, 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca = this.f215809e;
        ey2.t0 t0Var = c15456x2c452bca.f215107n;
        t0Var.f339040m = i27;
        t0Var.f339041n = i27;
        c15456x2c452bca.getClass();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f215808d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl) a17).n7(i18);
        java.util.Iterator it = c15456x2c452bca.f215108o.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka) it.next()).l(i17, i18, i19, i27);
        }
        if (c15456x2c452bca.b7()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = c15456x2c452bca.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ya0) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ya0.class)).P6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$1", "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", "onFragmentChange", "(IIII)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15290x1a2d74fc, p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        java.util.Iterator it = this.f215809e.f215108o.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka) it.next()).mo62777xcb2941fe(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15290x1a2d74fc, p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        java.util.Iterator it = this.f215809e.f215108o.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka) it.next()).mo55649xf210c75a(i17, f17, i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void z(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Boolean.valueOf(z17));
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(fragment);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$1", "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", "onUserVisibleFragmentChange", "(ZILcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f215808d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 activityC14075x761bf857 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) activityC0065xcd7aa112 : null;
            boolean c76 = activityC14075x761bf857 != null ? activityC14075x761bf857.c7() : false;
            java.lang.String name = fragment.getClass().getName();
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            java.lang.String str = (java.lang.String) ml2.j0.f409116i.H.get(name);
            if (!c76 && str != null) {
                p52.h.f433556h = fragment.getClass().getName();
            }
        }
        java.util.Iterator it = this.f215809e.f215108o.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka) it.next()).z(z17, i17, fragment);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$1", "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", "onUserVisibleFragmentChange", "(ZILcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;)V");
    }
}
