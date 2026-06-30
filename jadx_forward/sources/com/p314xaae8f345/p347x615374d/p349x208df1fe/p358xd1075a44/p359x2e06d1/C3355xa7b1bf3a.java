package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKViewLayout */
/* loaded from: classes15.dex */
public class C3355xa7b1bf3a<Layout extends android.view.ViewGroup> extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<Layout> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda {
    protected static final java.lang.String TAG = "MMKViewLayout";

    /* renamed from: childList */
    public java.util.ArrayList<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0> f13249xfa502bda = new java.util.ArrayList<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: addViewImpl */
    private void m27129xd2fe226(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190, int i17) {
        if (mo27110xfb86a31b() != 0) {
            com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 m24884xf6b77e76 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3103xa8635ff5.m24884xf6b77e76(interfaceC3545x4499190);
            boolean z17 = m24884xf6b77e76 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0;
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "error error %s child %s %s", mo27110xfb86a31b(), m24884xf6b77e76, java.lang.Boolean.valueOf(z17));
                return;
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf0 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) m24884xf6b77e76;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(TAG, "%s addview this %s | child %s | childparent %s | childCount: %s", this, mo27110xfb86a31b(), c3352x70ee8bf0.mo27110xfb86a31b(), c3352x70ee8bf0.mo27110xfb86a31b().getParent(), java.lang.Integer.valueOf(this.f13249xfa502bda.size()));
            if (c3352x70ee8bf0.m27160x33ae02() != null && c3352x70ee8bf0.m27160x33ae02().mo16940xfb7e5820() == null) {
                c3352x70ee8bf0.m27160x33ae02().mo16987x76491f2c(c3352x70ee8bf0.mo27110xfb86a31b());
            }
            if (mo27110xfb86a31b() instanceof com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda) {
                ((com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda) mo27110xfb86a31b()).m17087xbb8aeee6(c3352x70ee8bf0.mo27110xfb86a31b(), c3352x70ee8bf0.m27160x33ae02());
            } else {
                ((android.view.ViewGroup) mo27110xfb86a31b()).addView(c3352x70ee8bf0.mo27110xfb86a31b());
            }
            this.f13249xfa502bda.add(c3352x70ee8bf0);
        }
    }

    /* renamed from: addView */
    public void mo26016xbb8aeee6(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
        mo26894xbb8aeee6(interfaceC3545x4499190, m27160x33ae02().mo16939x3d79f549());
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: getAlignContent */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 mo27130x3416c82a() {
        return this.f13268x67eca98a.m27210x3416c82a();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: getAlignItems */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 mo27131xaee0b3b1() {
        return this.f13268x67eca98a.m27211xaee0b3b1();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: getDisableHighlightDarkMode */
    public boolean mo26209xe604ca7b() {
        return super.mo26209xe604ca7b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: getFlexDirection */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3398xf57f3f66 mo27132x833fcbd0() {
        return this.f13268x67eca98a.m27217x833fcbd0();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: getFlexWrap */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3640x29446a mo27133xe3d0dd59() {
        return this.f13268x67eca98a.m27220xe3d0dd59();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: getJustifyContent */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3419x18bf0270 mo27134x5d7f2cbf() {
        return this.f13268x67eca98a.m27223x5d7f2cbf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: removeAllViews */
    public void mo27135xba225f1() {
        ((android.view.ViewGroup) mo27110xfb86a31b()).removeAllViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeView */
    public void mo27081x417bc549(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
        if (mo27110xfb86a31b() == 0 || !(interfaceC3545x4499190 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0)) {
            return;
        }
        ((android.view.ViewGroup) mo27110xfb86a31b()).removeView(((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) interfaceC3545x4499190).mo27110xfb86a31b());
        this.f13249xfa502bda.remove(interfaceC3545x4499190);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setAccessible */
    public void mo26268xd85ca1b8(boolean z17) {
        if (z17) {
            ((android.view.ViewGroup) mo27110xfb86a31b()).setImportantForAccessibility(1);
            ((android.view.ViewGroup) mo27110xfb86a31b()).post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKViewLayout.1
                @Override // java.lang.Runnable
                public void run() {
                    for (int i17 = 0; i17 < com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a.this.f13249xfa502bda.size(); i17++) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a.this.f13249xfa502bda.get(i17).mo27110xfb86a31b().setImportantForAccessibility(4);
                    }
                }
            });
        } else {
            ((android.view.ViewGroup) mo27110xfb86a31b()).setImportantForAccessibility(2);
            ((android.view.ViewGroup) mo27110xfb86a31b()).post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKViewLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    for (int i17 = 0; i17 < com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a.this.f13249xfa502bda.size(); i17++) {
                        android.view.View mo27110xfb86a31b = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a.this.f13249xfa502bda.get(i17).mo27110xfb86a31b();
                        if (mo27110xfb86a31b.getImportantForAccessibility() == 4) {
                            mo27110xfb86a31b.setImportantForAccessibility(0);
                        }
                    }
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: setAlignContent */
    public void mo27136x6a5fc336(com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 enumC3377x3c6a6e5) {
        this.f13268x67eca98a.m27256x6a5fc336(enumC3377x3c6a6e5);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: setAlignItems */
    public void mo27137xdd0501bd(com.p314xaae8f345.p347x615374d.gen.EnumC3377x3c6a6e5 enumC3377x3c6a6e5) {
        this.f13268x67eca98a.m27257xdd0501bd(enumC3377x3c6a6e5);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: setClip */
    public void mo27138x7648d2d2(boolean z17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setDisableHighlightDarkMode */
    public void mo26282x95d19387(boolean z17) {
        super.mo26282x95d19387(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "setDisableDarkMode: %b, childlist's size: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f13249xfa502bda.size()));
        for (int i17 = 0; i17 < this.f13249xfa502bda.size(); i17++) {
            this.f13249xfa502bda.get(i17).mo26282x95d19387(z17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: setFlexDirection */
    public void mo27139x16163244(com.p314xaae8f345.p347x615374d.gen.EnumC3398xf57f3f66 enumC3398xf57f3f66) {
        this.f13268x67eca98a.m27263x16163244(enumC3398xf57f3f66);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: setFlexWrap */
    public void mo27140xde893e65(com.p314xaae8f345.p347x615374d.gen.EnumC3640x29446a enumC3640x29446a) {
        this.f13268x67eca98a.m27266xde893e65(enumC3640x29446a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: setFocusableInTouchMode */
    public void mo27141xfb5943cd(boolean z17) {
        ((android.view.ViewGroup) mo27110xfb86a31b()).setFocusable(true);
        ((android.view.ViewGroup) mo27110xfb86a31b()).setFocusableInTouchMode(true);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: setJustifyContent */
    public void mo27142x257594cb(com.p314xaae8f345.p347x615374d.gen.EnumC3419x18bf0270 enumC3419x18bf0270) {
        this.f13268x67eca98a.m27269x257594cb(enumC3419x18bf0270);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda
    /* renamed from: setOhosRenderGroup */
    public void mo27143xb4267c0a(boolean z17) {
    }

    /* renamed from: addView */
    public void mo26894xbb8aeee6(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190, int i17) {
        m27129xd2fe226(interfaceC3545x4499190, m27160x33ae02().mo16939x3d79f549());
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView */
    public Layout mo26107x519d71c1(android.content.Context context) {
        com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda c1589x9549ddda = new com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda(context);
        this.f13268x67eca98a.m27301x3513b714(c1589x9549ddda.m17088x3a5b5608());
        return c1589x9549ddda;
    }
}
