package com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api;

/* renamed from: com.tencent.mm.plugin.location_soso.api.SoSoMapView */
/* loaded from: classes13.dex */
public class C16320xe3e95109 extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01 implements ab3.h {
    public static final java.lang.String TAG = "MicroMsg.SoSoMapView";

    /* renamed from: firstanim */
    private boolean f37464x7f3bcc1;

    /* renamed from: iController */
    private ab3.f f37465xae9d90e5;

    /* renamed from: mViewManager */
    private com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 f37466xdb442a9b;

    /* renamed from: tagsView */
    private java.util.HashMap<java.lang.String, java.lang.Object> f37467xd3852e5e;

    public C16320xe3e95109(android.content.Context context) {
        super(context);
        this.f37467xd3852e5e = new java.util.HashMap<>();
        this.f37464x7f3bcc1 = true;
        m66015x316510();
    }

    /* renamed from: init */
    private void m66015x316510() {
        this.f37466xdb442a9b = new com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128(mo98897xb5885626());
        mo98897xb5885626().mo98989xadb5f9b6(true);
        this.f37465xae9d90e5 = new ab3.f() { // from class: com.tencent.mm.plugin.location_soso.api.SoSoMapView.1
            @Override // ab3.f
            /* renamed from: animateTo */
            public void mo990x42ab093c(double d17, double d18, int i17) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109.this.f37464x7f3bcc1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109.this.mo98897xb5885626().mo98977x85700a56(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25937xd3dd04bc.m98886xf75ad3b9(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18), i17));
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109.this.mo98897xb5885626().mo98952x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25937xd3dd04bc.m98886xf75ad3b9(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18), i17));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109.this.f37464x7f3bcc1 = false;
            }

            /* renamed from: offsetCenter */
            public void m66032x56822c8(double d17, double d18) {
                mo991x6ff2357((com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109.this.mo1002x1cd6e99d() / 1000000.0d) + d17, (com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109.this.mo1003x1cd6e99e() / 1000000.0d) + d18);
            }

            @Override // ab3.f
            /* renamed from: setCenter */
            public void mo991x6ff2357(double d17, double d18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109.this.mo98897xb5885626().mo98977x85700a56(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25937xd3dd04bc.m98881xcf810ec6(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18)));
            }

            @Override // ab3.f
            /* renamed from: setZoom */
            public void mo992x76535355(int i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109.this.mo98897xb5885626().mo98977x85700a56(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25937xd3dd04bc.m98893xd67f85ae(i17));
            }

            @Override // ab3.f
            /* renamed from: animateTo */
            public void mo989x42ab093c(double d17, double d18) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109.this.f37464x7f3bcc1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109.this.mo98897xb5885626().mo98977x85700a56(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25937xd3dd04bc.m98881xcf810ec6(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18)));
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109.this.mo98897xb5885626().mo98952x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25937xd3dd04bc.m98881xcf810ec6(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18)));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109.this.f37464x7f3bcc1 = false;
            }
        };
    }

    /* renamed from: setEnableForeignMap */
    private void m66016xb6ef424d(boolean z17) {
        try {
            java.lang.reflect.Method declaredMethod = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01.class.getDeclaredMethod("setForeignEnabled", java.lang.Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: addAnimTrackView */
    public void m66017x623ca85e(android.view.View view, double d17, double d18, java.lang.String str) {
        this.f37467xd3852e5e.put(str, view);
        new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df((int) (d17 * 1000000.0d), (int) (d18 * 1000000.0d));
    }

    /* renamed from: addLocationPin */
    public void m66018x45f1b23f(android.view.View view) {
        m66021xbb8aeee6(view, 0.0d, 0.0d);
    }

    /* renamed from: addNullView */
    public void m66019x544e048d(android.view.View view) {
        addView(view);
    }

    /* renamed from: addOverlay */
    public void m66020x30b19c6f(java.lang.Object obj) {
    }

    @Override // ab3.h
    /* renamed from: addPinView */
    public void mo993x4fdae5f9(android.view.View view, double d17, double d18) {
        this.f37466xdb442a9b.m65993x4fdae5f9(view, d17, d18);
    }

    /* renamed from: addView */
    public void m66021xbb8aeee6(android.view.View view, double d17, double d18) {
        this.f37466xdb442a9b.m65994xbb8aeee6(view, d17, d18);
    }

    @Override // ab3.h
    /* renamed from: animateCamera */
    public void mo995x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25936xd5528c6e c25936xd5528c6e) {
        this.f37466xdb442a9b.m65995x59b77566(c25936xd5528c6e);
    }

    @Override // ab3.h
    /* renamed from: clean */
    public void mo996x5a5b649() {
        this.f37467xd3852e5e.clear();
        this.f37466xdb442a9b.m65996x5cd39ffa();
    }

    @Override // ab3.h
    /* renamed from: destroy */
    public void mo997x5cd39ffa() {
        this.f37466xdb442a9b.m65996x5cd39ffa();
    }

    /* renamed from: disableDarkMode */
    public void m66023xc5fe1141() {
        this.f37466xdb442a9b.m65997xc5fe1141();
    }

    @Override // ab3.h
    /* renamed from: drawAccuracyCircle */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4395x7851a8f0 mo998x29f3758d(double d17, double d18, double d19) {
        return this.f37466xdb442a9b.m65998x29f3758d(d17, d18, d19);
    }

    /* renamed from: enableDarkMode */
    public void m66024x7c4248dc() {
        this.f37466xdb442a9b.m65999x7c4248dc();
    }

    @Override // ab3.h
    /* renamed from: enableIndoorLevelPick */
    public void mo999x4e2a20af(boolean z17) {
        mo98901xbd4012cd().mo99076x2e99c7e4(z17);
    }

    @Override // ab3.h
    /* renamed from: getChilds */
    public java.util.Collection<java.lang.Object> mo1000x13f1d1cd() {
        return this.f37467xd3852e5e.values();
    }

    /* renamed from: getController */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25941x689711f8 m66025x143f1b92() {
        return mo98898xf6579e62();
    }

    @Override // ab3.h
    /* renamed from: getIController */
    public ab3.f mo1001x8873d7af() {
        return this.f37465xae9d90e5;
    }

    @Override // ab3.h
    /* renamed from: getMapCenterX */
    public int mo1002x1cd6e99d() {
        if (m98922x19b45a1b() != null) {
            return (int) (m98922x19b45a1b().m37195x2605e9e2() * 1000000.0d);
        }
        return 0;
    }

    @Override // ab3.h
    /* renamed from: getMapCenterY */
    public int mo1003x1cd6e99e() {
        if (m98922x19b45a1b() != null) {
            return (int) (m98922x19b45a1b().m37196x79d7af9() * 1000000.0d);
        }
        return 0;
    }

    @Override // ab3.h
    /* renamed from: getPointByGeoPoint */
    public android.graphics.Point mo1004x3cd439b0(double d17, double d18) {
        android.graphics.Point point = new android.graphics.Point();
        mo98900x78d58245().mo98931x905f7108(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df((int) (d17 * 1000000.0d), (int) (d18 * 1000000.0d)), point);
        return point;
    }

    @Override // ab3.h
    /* renamed from: getTags */
    public java.util.Set<java.lang.String> mo1005xfb859c8f() {
        return this.f37467xd3852e5e.keySet();
    }

    @Override // ab3.h
    /* renamed from: getViewByItag */
    public java.lang.Object mo1006x62748683(java.lang.String str) {
        if (this.f37467xd3852e5e.containsKey(str)) {
            return this.f37467xd3852e5e.get(str);
        }
        return null;
    }

    @Override // ab3.h
    /* renamed from: getViewManager */
    public ab3.i mo1007xb0d6012() {
        return this.f37466xdb442a9b;
    }

    @Override // ab3.h
    /* renamed from: getZoom */
    public int mo1008xfb888c49() {
        return mo1009x60df64bb();
    }

    @Override // ab3.h
    /* renamed from: getZoomLevel */
    public int mo1009x60df64bb() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 mo98897xb5885626 = mo98897xb5885626();
        if (mo98897xb5885626 == null) {
            return 16;
        }
        return mo98897xb5885626.mo98972x60df64bb();
    }

    /* renamed from: metersToEquatorPixels */
    public float m66026xcbd44b87(double d17) {
        return mo98900x78d58245().mo98929xcbd44b87((float) d17);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager, ab3.h
    public void removeView(android.view.View view) {
        this.f37466xdb442a9b.m66000x417bc549(view);
        for (java.lang.String str : this.f37467xd3852e5e.keySet()) {
            if (this.f37467xd3852e5e.get(str).equals(view)) {
                this.f37467xd3852e5e.remove(str);
                return;
            }
        }
    }

    @Override // ab3.h
    /* renamed from: removeViewByTag */
    public java.lang.Object mo1011x1e8377fa(java.lang.String str) {
        java.lang.Object obj = this.f37467xd3852e5e.get(str);
        if (obj instanceof android.view.View) {
            removeView((android.view.View) obj);
        }
        return obj;
    }

    /* renamed from: requestMapFocus */
    public void m66027xa39b108b() {
        requestFocus();
    }

    @Override // ab3.h
    /* renamed from: setBuiltInZoomControls */
    public void mo1012x463017ca(boolean z17) {
    }

    @Override // ab3.h
    /* renamed from: setCanRotate */
    public void mo1013x5bb75f09(boolean z17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25947x45d136f7 mo98901xbd4012cd = mo98901xbd4012cd();
        if (mo98901xbd4012cd != null) {
            mo98901xbd4012cd.mo99080xca66ed7a(z17);
        }
    }

    @Override // ab3.h
    /* renamed from: setLogoMargin */
    public void mo1014xb96b113b(int[] iArr) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25947x45d136f7 mo98901xbd4012cd = mo98901xbd4012cd();
        mo98901xbd4012cd.mo99082xb3303ca(0, 0, 0, 0, 0);
        mo98901xbd4012cd.mo99078x28fc7576(1, iArr);
    }

    @Override // ab3.h
    /* renamed from: setMapAnchor */
    public void mo1015x731810ef(float f17, float f18) {
        mo98897xb5885626().mo98999x731810ef(f17, f18);
    }

    @Override // ab3.h
    /* renamed from: setMapViewOnTouchListener */
    public void mo1016xda829c15(android.view.View.OnTouchListener onTouchListener) {
        setOnTouchListener(onTouchListener);
    }

    @Override // ab3.h
    /* renamed from: setMarkerClickListener */
    public void mo1017x715a4c80(android.view.View view, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener onMarkerClickListener) {
        this.f37466xdb442a9b.m66004x7c478fac(view, onMarkerClickListener);
    }

    /* renamed from: updateAnimViewLayout */
    public void m66028x38384049(android.view.View view, double d17, double d18) {
        new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df((int) (d17 * 1000000.0d), (int) (d18 * 1000000.0d));
    }

    @Override // ab3.h
    /* renamed from: updateLocaitonPinLayout */
    public void mo1018x517216ab(android.view.View view, double d17, double d18) {
        m66029x517216ab(view, d17, d18, false);
    }

    @Override // ab3.h
    /* renamed from: updateMarkerView */
    public void mo1019xf5f903a8(android.view.View view) {
        this.f37466xdb442a9b.m66009xf5f903a8(view);
    }

    /* renamed from: updateViewLayout */
    public void m66030x37843fd8(android.view.View view, double d17, double d18) {
        this.f37466xdb442a9b.m66011x37843fd8(view, d17, d18, false);
    }

    @Override // ab3.h
    /* renamed from: zoomToSpan */
    public void mo1020xdaf06a18(double d17, double d18, double d19, double d27) {
        mo1001x8873d7af().mo991x6ff2357(d17, d18);
        if (d19 == 0.0d || d27 == 0.0d || m66025x143f1b92() == null) {
            return;
        }
        m66025x143f1b92().mo98919xdaf06a18(d19, d27);
    }

    @Override // ab3.h
    /* renamed from: addView */
    public void mo994xbb8aeee6(java.lang.Object obj, double d17, double d18, java.lang.String str) {
        this.f37467xd3852e5e.put(str, obj);
    }

    /* renamed from: updateLocaitonPinLayout */
    public void m66029x517216ab(android.view.View view, double d17, double d18, boolean z17) {
        this.f37466xdb442a9b.m66008x3c714321(view, d17, d18, z17);
    }

    /* renamed from: updateViewLayout */
    public void m66031x37843fd8(android.view.View view, double d17, double d18, int i17) {
        new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df((int) (d17 * 1000000.0d), (int) (d18 * 1000000.0d));
    }

    /* renamed from: addView */
    public void m66022xbb8aeee6(android.view.View view, double d17, double d18, int i17) {
        new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4399x704e24df((int) (d17 * 1000000.0d), (int) (1000000.0d * d18));
        if (i17 == -2) {
            mo98896xbb8aeee6(view, new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01.LayoutParams(-2, -2, new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18), 17));
        } else if (i17 == -1) {
            mo98896xbb8aeee6(view, new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01.LayoutParams(-1, -1, new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18), 17));
        } else {
            mo98896xbb8aeee6(view, new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01.LayoutParams(i17, i17, new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18), 17));
        }
    }

    public C16320xe3e95109(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37467xd3852e5e = new java.util.HashMap<>();
        this.f37464x7f3bcc1 = true;
        m66015x316510();
    }

    public C16320xe3e95109(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25946x7e4576a7 c25946x7e4576a7) {
        super(context, c25946x7e4576a7);
        this.f37467xd3852e5e = new java.util.HashMap<>();
        this.f37464x7f3bcc1 = true;
        m66015x316510();
    }
}
