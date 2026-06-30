package u;

/* loaded from: classes16.dex */
public final class o extends u.n implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {
    public final java.util.ArrayList B6;
    public com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 C6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.B6 = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.C6;
        boolean z17 = false;
        if (c22584xf7d97e83 != null && (abstractActivityC22579xbed01a37 = c22584xf7d97e83.f292654p) != null) {
            abstractActivityC22579xbed01a37.onBackPressed();
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CombineViewPagerUIC", "onBackPressed, consume result=" + z17);
        return z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [com.tencent.mm.ui.vas.VASCommonFragment] */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.C13150x1ad45f01 c13150x1ad45f01;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CombineViewPagerUIC", "onCreate");
        android.content.Intent intent = m158354x19263085().getIntent();
        int[] intArrayExtra = intent.getIntArrayExtra("visibility_tab_type_list");
        if (intArrayExtra == null) {
            intArrayExtra = new int[]{0, 1};
        }
        int length = intArrayExtra.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            arrayList = this.B6;
            if (i17 >= length) {
                break;
            }
            int i19 = intArrayExtra[i17];
            int i27 = i18 + 1;
            android.content.Intent intent2 = new android.content.Intent();
            android.os.Bundle bundleExtra = intent.getBundleExtra("visibility_tab_type_list" + i19);
            if (bundleExtra == null) {
                bundleExtra = new android.os.Bundle();
            }
            intent2.putExtras(bundleExtra);
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (i19 == 0) {
                int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384.f224804p1;
                intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.C13150x1ad45f01 c13150x1ad45f012 = (com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.C13150x1ad45f01) lk5.q0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384.class, intent2, false, false, false, com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.C13150x1ad45f01.class, 28, null);
                c13150x1ad45f012.S1 = false;
                c13150x1ad45f01 = c13150x1ad45f012;
            } else if (i19 != 1) {
                c13150x1ad45f01 = new com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83();
            } else {
                int i29 = com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.f290785h;
                intent2.setClass(context, com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.C13150x1ad45f01 c13150x1ad45f013 = (com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.C13150x1ad45f01) lk5.q0.a(com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class, intent2, false, false, false, com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.C13150x1ad45f01.class, 28, null);
                c13150x1ad45f013.S1 = false;
                c13150x1ad45f01 = c13150x1ad45f013;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CombineViewPagerUIC", "index:" + i18 + " type:" + i19 + " fragment:" + c13150x1ad45f01);
            arrayList.add(new jz5.l(java.lang.Integer.valueOf(i19), c13150x1ad45f01));
            if (i18 == T6()) {
                this.C6 = c13150x1ad45f01;
            }
            i17++;
            i18 = i27;
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe P6 = P6();
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = m158354x19263085().mo7595x9cdc264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo7595x9cdc264, "getSupportFragmentManager(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) ((jz5.l) it.next()).f384367e);
        }
        P6.m8315x6cab2c8d(new u.p(mo7595x9cdc264, arrayList2));
        P6().m8321x40341e13(intArrayExtra.length - 1);
        P6().m8289xa5a25773(this);
        P6().m8316x940d026a(T6());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CombineViewPagerUIC", "onDestroy");
        P6().m8314x7cd807d6(this);
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
        java.lang.Object obj = this.B6.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        jz5.l lVar = (jz5.l) obj;
        this.C6 = (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) lVar.f384367e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CombineViewPagerUIC", "onPageSelected position=" + i17 + " type=" + ((java.lang.Number) lVar.f384366d).intValue());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        u.k kVar = (u.k) pf5.z.f435481a.a(activity).a(u.k.class);
        kVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CombineTabBarUIC", "onPageSelected position=" + i17);
        oa.i k17 = kVar.a().k(i17);
        if (k17 == null || k17.a()) {
            return;
        }
        k17.b();
    }
}
