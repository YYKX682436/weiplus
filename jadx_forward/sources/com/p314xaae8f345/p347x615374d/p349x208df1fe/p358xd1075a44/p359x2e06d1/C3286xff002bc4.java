package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.FrLifeController */
/* loaded from: classes9.dex */
public class C3286xff002bc4 {

    /* renamed from: HandleControlInfoAction */
    public static final java.lang.String f12681x6fcec459 = "handleControlInfo";

    /* renamed from: PageNotifyAction */
    public static final java.lang.String f12682xc567432e = "pageNotify";
    public static final java.lang.String TAG = "MicroMsg.FragmentController";

    /* renamed from: activity */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc f12683x9d4bf30f;

    /* renamed from: mFragmentBackStack */
    private java.util.Stack<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061> f12687x28ae2484;

    /* renamed from: fragmentCount */
    private int f12684xcb42709f = 0;

    /* renamed from: webviewCount */
    private int f12692x769cb896 = 0;

    /* renamed from: tinyappCount */
    private int f12690xde42666e = 0;

    /* renamed from: liteAppCount */
    private int f12685xc8ef9a3c = 0;

    /* renamed from: needTinyCallback */
    private boolean f12688x4582831b = true;

    /* renamed from: webViewFragment */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749 f12691xc568cd89 = null;

    /* renamed from: tinyAppFragment */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749 f12689xa8488471 = null;

    /* renamed from: liteAppFragment */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749 f12686xd69e6e03 = null;

    /* renamed from: com.tencent.kinda.framework.widget.base.FrLifeController$IFrLife */
    /* loaded from: classes9.dex */
    public interface IFrLife {
        /* renamed from: onDestroyView */
        void mo26150xa6664a60();

        /* renamed from: onPause */
        void mo26151xb01dfb57();

        /* renamed from: onResume */
        void mo26152x57429eec();

        /* renamed from: onViewCreate */
        void mo26153x3cafd740(android.os.Bundle bundle);
    }

    public C3286xff002bc4(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc abstractActivityC3282x418ff5cc) {
        this.f12683x9d4bf30f = abstractActivityC3282x418ff5cc;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7614xcc18e6af(true);
        this.f12683x9d4bf30f.mo7595x9cdc264().m7625x962dcde7(new p012xc85e97e9.p087x9da2e250.app.p1() { // from class: com.tencent.kinda.framework.widget.base.FrLifeController.1
            @Override // p012xc85e97e9.p087x9da2e250.app.p1
            /* renamed from: onBackStackChanged */
            public void mo7757xf86bb992() {
                p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.this.f12683x9d4bf30f.mo7595x9cdc264();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.TAG, "onBackstackChanged: %s, fragments: %s", java.lang.Integer.valueOf(mo7595x9cdc264.m7670x180b2948()), mo7595x9cdc264.m7675x1626d96d());
            }
        });
        this.f12687x28ae2484 = new java.util.Stack<>();
    }

    /* renamed from: checkSwipeBackLayout */
    private void m26131x305d5fa3() {
        if (this.f12683x9d4bf30f.getF147381t()) {
            int size = this.f12687x28ae2484.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "checkSwipeBackLayout %s %s", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(this.f12683x9d4bf30f.getFragmentManager().getBackStackEntryCount()));
            if (size > 1) {
                this.f12683x9d4bf30f.m78735x28280f95().m81450x8e764904(false);
            } else {
                this.f12683x9d4bf30f.m78735x28280f95().m81450x8e764904(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getFragMent */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 m26132x196e93e6(int i17) {
        java.util.Stack<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061> stack = this.f12687x28ae2484;
        if (stack != null && stack.size() != 0) {
            if (i17 < 0) {
                int size = this.f12687x28ae2484.size() + i17;
                if (size < 0 || size >= this.f12687x28ae2484.size()) {
                    return null;
                }
                java.util.Stack<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061> stack2 = this.f12687x28ae2484;
                return stack2.get(stack2.size() + i17);
            }
            if (i17 < this.f12687x28ae2484.size()) {
                return this.f12687x28ae2484.get(i17);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setAccessibilityState */
    public void m26133xef4e97e5(boolean z17, int i17) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 m26132x196e93e6 = m26132x196e93e6(i17);
        if (m26132x196e93e6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "fragment is null");
            return;
        }
        if (m26132x196e93e6.m7474xfb86a31b() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "fragment " + m26132x196e93e6 + " getView() is null");
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) m26132x196e93e6.m7474xfb86a31b().findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11564x313a4cad);
        if (viewGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "fragment " + m26132x196e93e6 + " container is null");
            return;
        }
        if (!z17 || m26132x196e93e6.m26091x4d3444f7()) {
            viewGroup.setImportantForAccessibility(4);
        } else {
            viewGroup.setImportantForAccessibility(1);
        }
        m26132x196e93e6.m26091x4d3444f7();
    }

    /* renamed from: showAllFragment */
    private void m26134x29778bd4() {
        if (this.f12687x28ae2484 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n");
            for (int size = this.f12687x28ae2484.size(); size > 0; size--) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061 = this.f12687x28ae2484.get(size - 1);
                sb6.append(java.lang.String.format("%s(hide:%s %s %s %s)\n", abstractViewOnTouchListenerC3283x43ef4061.mo25456xea5dece5(), java.lang.Boolean.valueOf(abstractViewOnTouchListenerC3283x43ef4061.m7483xdf9b8f74()), java.lang.Boolean.valueOf(abstractViewOnTouchListenerC3283x43ef4061.m78665x15e8dd78()), java.lang.Boolean.valueOf(abstractViewOnTouchListenerC3283x43ef4061.m7493xf94337e8()), abstractViewOnTouchListenerC3283x43ef4061.mo7591x9616526c()));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "fragment stack: %s", sb6.toString());
        }
    }

    /* renamed from: watchLife */
    private void m26135xef41e86b(final com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061) {
        if (abstractViewOnTouchListenerC3283x43ef4061 != null) {
            abstractViewOnTouchListenerC3283x43ef4061.m26102xef41e86b(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.IFrLife() { // from class: com.tencent.kinda.framework.widget.base.FrLifeController.2
                @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.IFrLife
                /* renamed from: onDestroyView */
                public void mo26150xa6664a60() {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.TAG, "onDestroyView " + abstractViewOnTouchListenerC3283x43ef4061);
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.this.f12687x28ae2484.search(abstractViewOnTouchListenerC3283x43ef4061) > 0) {
                        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.this.m26132x196e93e6(-1) == abstractViewOnTouchListenerC3283x43ef4061) {
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.this.m26133xef4e97e5(true, -2);
                        } else {
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.this.m26133xef4e97e5(true, -1);
                        }
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 m26078xc7eb70d0 = abstractViewOnTouchListenerC3283x43ef4061.m26078xc7eb70d0();
                    if (m26078xc7eb70d0 == null || !m26078xc7eb70d0.m7427xb2c87fbf(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.this.m26132x196e93e6(-1))) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.TAG, "From onDestroyView, active covered fragment: " + m26078xc7eb70d0);
                    m26078xc7eb70d0.mo25472xf6e97578();
                }

                @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.IFrLife
                /* renamed from: onPause */
                public void mo26151xb01dfb57() {
                }

                @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.IFrLife
                /* renamed from: onResume */
                public void mo26152x57429eec() {
                }

                @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.IFrLife
                /* renamed from: onViewCreate */
                public void mo26153x3cafd740(android.os.Bundle bundle) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.TAG, "onViewCreate " + abstractViewOnTouchListenerC3283x43ef4061);
                    if (!abstractViewOnTouchListenerC3283x43ef4061.m26087xd35c70d0()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.TAG, "From onResume, Active create view fragment: " + abstractViewOnTouchListenerC3283x43ef4061);
                        abstractViewOnTouchListenerC3283x43ef4061.mo25472xf6e97578();
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 m26132x196e93e6 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.this.m26132x196e93e6(-2);
                    if (m26132x196e93e6 != null && (abstractViewOnTouchListenerC3283x43ef4061 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749) && m26132x196e93e6.m26087xd35c70d0()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.TAG, "From onCreateView, DeActive covered fragment: " + abstractViewOnTouchListenerC3283x43ef4061);
                        m26132x196e93e6.mo25473x2c7574d9();
                        abstractViewOnTouchListenerC3283x43ef4061.m26097x73d79e75(m26132x196e93e6);
                    }
                }
            });
            return;
        }
        java.lang.Throwable th6 = new java.lang.Throwable("Watch a null fragment!!");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
    }

    /* renamed from: addFragment */
    public boolean m26136x63908e11(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061) {
        java.util.Stack<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061> stack = this.f12687x28ae2484;
        if (stack != null && stack.size() > 0) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 lastElement = this.f12687x28ae2484.lastElement();
            abstractViewOnTouchListenerC3283x43ef4061.f12619x5e60fd14 = lastElement.f12619x5e60fd14 || lastElement.mo25458xa80d3394();
        }
        this.f12684xcb42709f++;
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = this.f12683x9d4bf30f.mo7595x9cdc264().m7630xb2c12e75();
        if (abstractViewOnTouchListenerC3283x43ef4061 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749) {
            int i17 = abstractViewOnTouchListenerC3283x43ef4061.f12616x55935a28;
            if (i17 == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13293xc35eb0de) {
                m7630xb2c12e75.l(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6, 0, 0);
            } else if (i17 == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13292x14b710be) {
                m7630xb2c12e75.l(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, 0, 0, 0);
            }
        }
        m7630xb2c12e75.h(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11558x604a6d8a, abstractViewOnTouchListenerC3283x43ef4061, null, 1);
        m26135xef41e86b(abstractViewOnTouchListenerC3283x43ef4061);
        this.f12687x28ae2484.add(abstractViewOnTouchListenerC3283x43ef4061);
        m7630xb2c12e75.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "fragment [" + abstractViewOnTouchListenerC3283x43ef4061 + "] has add! current fragmentCount: " + this.f12684xcb42709f);
        m26134x29778bd4();
        if (this.f12684xcb42709f > 1) {
            m26133xef4e97e5(false, -2);
        }
        return true;
    }

    /* renamed from: fixOnResume */
    public void m26137x606faa21(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061) {
        int search;
        int size;
        if (abstractViewOnTouchListenerC3283x43ef4061 != null && (search = this.f12687x28ae2484.search(abstractViewOnTouchListenerC3283x43ef4061)) > 0 && search <= this.f12687x28ae2484.size() && (this.f12687x28ae2484.size() - search) - 1 >= 0) {
            for (size = (this.f12687x28ae2484.size() - search) - 1; size >= 0; size--) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef40612 = this.f12687x28ae2484.get(size);
                if (abstractViewOnTouchListenerC3283x43ef40612 != null && !abstractViewOnTouchListenerC3283x43ef40612.m7483xdf9b8f74()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "fixOnResume:%s", abstractViewOnTouchListenerC3283x43ef40612);
                    abstractViewOnTouchListenerC3283x43ef40612.mo25465xa823495b();
                }
            }
        }
    }

    /* renamed from: getCurrent */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 m26138x80f8f943() {
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.m26044x8ef48bd9(m26139xd2dff184());
    }

    /* renamed from: getFragmentList */
    public java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m26139xd2dff184() {
        return this.f12687x28ae2484 == null ? new java.util.ArrayList() : new java.util.ArrayList(this.f12687x28ae2484);
    }

    /* renamed from: getFragmentListSize */
    public int m26140x96eae3a5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getFragmentListSize: %d", java.lang.Integer.valueOf(this.f12684xcb42709f));
        return this.f12684xcb42709f;
    }

    /* renamed from: hasOpenH5OrTinyApp */
    public boolean m26141x3fd59aad() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "hasOpenH5OrTinyApp, webviewCount: %d, tinyappCount: %d", java.lang.Integer.valueOf(this.f12692x769cb896), java.lang.Integer.valueOf(this.f12690xde42666e));
        return this.f12692x769cb896 > 0 || this.f12690xde42666e > 0 || this.f12685xc8ef9a3c > 0;
    }

    /* renamed from: onActivityDestroy */
    public void m26142x2711d60c() {
        this.f12687x28ae2484.clear();
    }

    /* renamed from: popFragment */
    public boolean m26143x8f5417c1(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "popFragment, fragmentCount: %d, isStateSaved: %b", java.lang.Integer.valueOf(this.f12684xcb42709f), java.lang.Boolean.valueOf(this.f12683x9d4bf30f.mo7595x9cdc264().m7690x7328e940()));
        if (this.f12684xcb42709f > 1 && !this.f12683x9d4bf30f.mo7595x9cdc264().m7690x7328e940()) {
            if (abstractViewOnTouchListenerC3283x43ef4061 == null) {
                abstractViewOnTouchListenerC3283x43ef4061 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.m26044x8ef48bd9(m26139xd2dff184());
            }
            m26145xed80c489(abstractViewOnTouchListenerC3283x43ef4061);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "popFragment to remove, fragmentCount: %d", java.lang.Integer.valueOf(this.f12684xcb42709f));
            m26134x29778bd4();
            return this.f12684xcb42709f > 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "NO popFragment before return, fragmentCount: %d", java.lang.Integer.valueOf(this.f12684xcb42709f));
        m26134x29778bd4();
        if (this.f12684xcb42709f == 1) {
            if (abstractViewOnTouchListenerC3283x43ef4061 == null) {
                abstractViewOnTouchListenerC3283x43ef4061 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.m26044x8ef48bd9(m26139xd2dff184());
            }
            if (abstractViewOnTouchListenerC3283x43ef4061 != null) {
                int i17 = abstractViewOnTouchListenerC3283x43ef4061.f12616x55935a28;
                if (i17 == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13293xc35eb0de) {
                    this.f12683x9d4bf30f.getIntent().putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13296xcbac186, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
                } else if (i17 == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13292x14b710be) {
                    this.f12683x9d4bf30f.getIntent().putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13296xcbac186, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
                }
            }
        }
        return false;
    }

    /* renamed from: processCallback */
    public boolean m26144x58d1c3d4(int i17) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749 c3156x441ad749;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749 c3156x441ad7492;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749 c3156x441ad7493;
        if (i17 == 2 && this.f12692x769cb896 > 0 && (c3156x441ad7493 = this.f12691xc568cd89) != null) {
            c3156x441ad7493.mo7504xac79a11b();
            this.f12691xc568cd89 = null;
            this.f12692x769cb896--;
            return true;
        }
        if (i17 == 3 && this.f12690xde42666e > 0 && (c3156x441ad7492 = this.f12689xa8488471) != null && this.f12688x4582831b) {
            c3156x441ad7492.mo7504xac79a11b();
            this.f12689xa8488471 = null;
            this.f12690xde42666e--;
            return true;
        }
        if (i17 != 11 || this.f12685xc8ef9a3c <= 0 || (c3156x441ad749 = this.f12686xd69e6e03) == null) {
            return false;
        }
        c3156x441ad749.mo7504xac79a11b();
        this.f12686xd69e6e03 = null;
        this.f12685xc8ef9a3c--;
        return true;
    }

    /* renamed from: removeModal */
    public boolean m26145xed80c489(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061) {
        if (this.f12684xcb42709f > 0) {
            if (abstractViewOnTouchListenerC3283x43ef4061.m26087xd35c70d0()) {
                abstractViewOnTouchListenerC3283x43ef4061.mo25473x2c7574d9();
            }
            this.f12684xcb42709f--;
            abstractViewOnTouchListenerC3283x43ef4061.m26100x103a21a9(true);
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = this.f12683x9d4bf30f.mo7595x9cdc264().m7630xb2c12e75();
            if (abstractViewOnTouchListenerC3283x43ef4061 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749) {
                int i17 = abstractViewOnTouchListenerC3283x43ef4061.f12616x55935a28;
                if (i17 == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13293xc35eb0de) {
                    m7630xb2c12e75.l(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed, 0, 0);
                } else if (i17 == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13292x14b710be) {
                    m7630xb2c12e75.l(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1, 0, 0);
                }
            }
            m7630xb2c12e75.j(abstractViewOnTouchListenerC3283x43ef4061);
            m7630xb2c12e75.e();
            this.f12687x28ae2484.remove(abstractViewOnTouchListenerC3283x43ef4061);
            m26133xef4e97e5(true, -1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "removeModal [%s] before return, fragmentCount: %d", abstractViewOnTouchListenerC3283x43ef4061, java.lang.Integer.valueOf(this.f12684xcb42709f));
        return this.f12684xcb42709f > 0;
    }

    /* renamed from: setTinyCallbackTag */
    public void m26146x68ba6533(boolean z17) {
        this.f12688x4582831b = z17;
    }

    /* renamed from: startLiteAppUIPage */
    public void m26147x502c8254(final android.os.Bundle bundle, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749 c3156x441ad749) {
        bundle.putInt("requestCode", 11);
        this.f12686xd69e6e03 = c3156x441ad749;
        this.f12685xc8ef9a3c++;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        final com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc m25455xfb83cb05 = c3156x441ad749.m25455xfb83cb05();
        m25455xfb83cb05.mo27671xedaaf3fe(new com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68() { // from class: com.tencent.kinda.framework.widget.base.FrLifeController.3
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: addReportInfo */
            public void mo25513x744b3383(com.p314xaae8f345.p347x615374d.gen.C3615xcb2a198e c3615xcb2a198e) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: beginIgnoringInteractionEvents */
            public void mo25514x58ec5ed3() {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: closeUI */
            public void mo25515x33a64a8c(boolean z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.TAG, "liteapp page closeUI");
                java.util.List tj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).tj(bundle.getString("appId"));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.TAG, "liteapp page closeUI appid=%s uuids=%s", bundle.getString("appId"), tj6);
                java.util.Iterator it = ((java.util.ArrayList) tj6).iterator();
                while (it.hasNext()) {
                    java.lang.Long l17 = (java.lang.Long) it.next();
                    android.content.Intent intent = new android.content.Intent();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("animated", z17);
                        intent.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, jSONObject.toString());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.TAG, "liteapp page closeUI closeWindow");
                        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                        long longValue = l17.longValue();
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65269x10864c08(longValue, intent);
                    } catch (org.json.JSONException e17) {
                        throw new java.lang.RuntimeException(e17);
                    }
                }
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: endEditing */
            public void mo25516x9d07683d() {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: endIgnoringInteractionEvents */
            public void mo25517xf4c38ae1() {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: getTitle */
            public java.lang.String mo25519x7531c8a2() {
                return null;
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: refreshNavigationBar */
            public void mo25522xc5b52a44() {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setBackBtnVisible */
            public void mo25524xe21cbbf(boolean z17) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setBackgroundColor */
            public void mo25525x67f06213(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setKeyBoardShowCallbackImpl */
            public void mo25526xb0a99c0b(com.p314xaae8f345.p347x615374d.gen.AbstractC3619x576eb74f abstractC3619x576eb74f) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setScreenBrightness */
            public void mo25527xaf7a2e5f(float f17) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setScreenKeepOn */
            public void mo25528x24aca152(boolean z17) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setSubTitle */
            public void mo25529xf9fefa7a(java.lang.String str) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setSubTitleDefaultColor */
            public void mo25530x6d45913c() {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setSubTitleVisibility */
            public void mo25531x4a93e92c(com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852 enumC3616x7f0a8852) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setTitle */
            public void mo25532x53bfe316(java.lang.String str) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setTopLeftBackBtnCallbackImpl */
            public void mo25533x4d6a0a00(com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setTopLeftBtnTitleAndCallbackImpl */
            public void mo25534x59efa0e6(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setTopRightBtnBgIsGreen */
            public void mo25535xf06113e1(boolean z17) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setTopRightBtnDone */
            public void mo25536xaab42f75() {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setTopRightBtnImage */
            public void mo25537xac171bc8(java.lang.String str) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setTopRightBtnTitle */
            public void mo25538xacb094c5(java.lang.String str, java.lang.String str2) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setTopRightCallbackImpl */
            public void mo25539x2a8bb6ee(com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setTopRightFull */
            public void mo25540x9cea8678(boolean z17) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: setWindowSoftInputAdjustMode */
            public void mo25541xac66ab60(com.p314xaae8f345.p347x615374d.gen.EnumC3379x39eda651 enumC3379x39eda651) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: startLoading */
            public void mo25542xc0d627a(java.lang.String str, boolean z17) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: stopLoading */
            public void mo25543xc77ccada() {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
            /* renamed from: triggerReport */
            public void mo25544x9f6b6d0c(com.p314xaae8f345.p347x615374d.gen.EnumC3595x5349f5a6 enumC3595x5349f5a6, java.lang.String str) {
            }
        });
        sVar.f225700d = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r() { // from class: com.tencent.kinda.framework.widget.base.FrLifeController.4
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
            /* renamed from: onDispatch */
            public boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
                if ((!str.equals(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.f12681x6fcec459) && !str.equals(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.f12682xc567432e)) || !(obj instanceof org.json.JSONObject) || m25455xfb83cb05 == null) {
                    return true;
                }
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                dd.d.f310404a.b((org.json.JSONObject) obj, m27539xaf65a0fc);
                m25455xfb83cb05.mo27658xc2079749(m27539xaf65a0fc);
                return true;
            }
        };
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(this.f12683x9d4bf30f, bundle, true, false, sVar, new q80.f0() { // from class: com.tencent.kinda.framework.widget.base.FrLifeController.5
            @Override // q80.f0
            /* renamed from: cancel */
            public /* bridge */ /* synthetic */ void mo25802xae7a2e7a() {
            }

            @Override // q80.f0
            /* renamed from: fail */
            public void mo555x2fd71e() {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.this.f12686xd69e6e03.mo7504xac79a11b();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4.this.f12686xd69e6e03 = null;
            }

            @Override // q80.f0
            /* renamed from: listenOnCreate */
            public /* bridge */ /* synthetic */ boolean mo25803x625332a2() {
                return false;
            }

            @Override // q80.f0
            /* renamed from: onCreate */
            public /* bridge */ /* synthetic */ void mo25804x3e5a77bb(long j17, java.lang.String str) {
            }

            @Override // q80.f0
            /* renamed from: success */
            public void mo556x90b54003() {
            }
        });
    }

    /* renamed from: startTinyAppUIPage */
    public void m26148x5ca55c42(android.os.Bundle bundle, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749 c3156x441ad749) {
        java.lang.String string = bundle.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13315x25cdeb97, "");
        java.lang.String string2 = bundle.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13311x3a055766, "");
        java.lang.String string3 = bundle.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13316x37b859d7, "");
        int i17 = bundle.getInt(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13314x3a07827b, 0);
        int i18 = bundle.getInt(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13312x6d08d4b, 0);
        boolean z17 = bundle.getBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13313xfddbfad1, false);
        c3156x441ad749.f12622x8f371677 = true;
        c3156x441ad749.f12637xfac09f17 = string;
        c3156x441ad749.mo25460x26fca0f7();
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = string;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        b1Var.f398555f = string2 != null ? string2 : "";
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "use transparent mode");
            b1Var.H = k91.z3.TRANSPARENT;
            k91.y3 y3Var = k91.y3.DISABLED;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Ni()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "current device has issue on transparent mode.");
                try {
                    android.view.View decorView = this.f12683x9d4bf30f.getWindow().getDecorView();
                    android.graphics.Bitmap d17 = uj5.g.d(decorView, decorView.getWidth(), decorView.getHeight(), false, android.graphics.Bitmap.Config.RGB_565);
                    if (d17 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "snap show ok, try save.");
                        java.lang.String str = com.p314xaae8f345.mm.vfs.q7.c("wallet_temp") + "/image/tiny_app_transparent_mode_snapshot";
                        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                            com.p314xaae8f345.mm.vfs.w6.h(str);
                        }
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(d17, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "snap shot path:".concat(str));
                        b1Var.I = str;
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "getSnapShot err", new java.lang.Object[0]);
                }
            }
        }
        if (i18 == 0) {
            b1Var.f398565k = 1034;
        } else {
            b1Var.f398565k = i18;
        }
        if (i17 == 0) {
            b1Var.f398549c = 0;
        } else {
            b1Var.f398549c = 2;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(string3, 0);
        if (P > 0) {
            b1Var.f398551d = P;
        }
        b1Var.f398572q = 3;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f12683x9d4bf30f, b1Var);
        this.f12689xa8488471 = c3156x441ad749;
        this.f12690xde42666e++;
        if (this.f12684xcb42709f != 0) {
            this.f12688x4582831b = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "only tinyApp,dont need TinyCallback");
            this.f12688x4582831b = false;
        }
    }

    /* renamed from: startWebViewUIPage */
    public void m26149xcef50b5a(android.os.Bundle bundle, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749 c3156x441ad749) {
        java.lang.String string = bundle.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13318xee032ac6, "");
        java.lang.String str = c01.id.a() + "_fromKinda";
        c3156x441ad749.f12623x7ba4fdde = true;
        c3156x441ad749.f12642xb944ac9b = string;
        c3156x441ad749.f12641x46724e4a = str;
        c3156x441ad749.mo25460x26fca0f7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "jumpToH5， fromKindaId is %s", str);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc abstractActivityC3282x418ff5cc = this.f12683x9d4bf30f;
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("showShare", true);
        intent.putExtra("allow_mix_content_mode", false);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            intent.putExtra("kFromKindaId", str);
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_web_new_task, false);
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_web_default_new_task, false);
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && string.contains("userroll/readtemplate");
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && string.contains("lingqiantong/lqtweb/trade");
        boolean c17 = fp.e0.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBaseUtil ", "[jumpToH5FromKinda] closeSwitch：%s , closeDefaultSwitch: %s, isHuawei: %s", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(fj7), java.lang.Boolean.valueOf(c17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBaseUtil ", "[jumpToH5FromKinda] isPayBill: %s, isLQTBill: %s, url：%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), string);
        if (!fj6) {
            try {
                boolean z19 = android.provider.Settings.Global.getInt(abstractActivityC3282x418ff5cc.getContentResolver(), "always_finish_activities") != 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBaseUtil ", "[jumpToH5FromKinda] settingSwitch: %s", java.lang.Boolean.valueOf(z19));
                if (z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBaseUtil ", "[jumpToH5FromKinda] do add new task flag.");
                    intent.addFlags(268435456);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletBaseUtil ", th6, "[jumpToH5FromKinda] check SettingSwitch fail", new java.lang.Object[0]);
                if (c17 && !fj7 && (z17 || z18)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBaseUtil ", "[jumpToH5FromKinda] default case：do add new task flag.");
                    intent.addFlags(268435456);
                }
            }
        }
        j45.l.n(abstractActivityC3282x418ff5cc, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 2);
        this.f12691xc568cd89 = c3156x441ad749;
        this.f12692x769cb896++;
    }
}
