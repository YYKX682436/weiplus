package com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802;

/* renamed from: com.tencent.mm.plugin.location_soso.ViewManager */
/* loaded from: classes13.dex */
public class C16319x94a0c128 implements ab3.i {

    /* renamed from: mTencentMap */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 f37461xd6e0b024;

    /* renamed from: mMarkerMap */
    private java.util.Map<android.view.View, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a> f37460x430dc0d5 = new java.util.HashMap();

    /* renamed from: mMarkerClickMap */
    private java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener> f37459xdbce42db = new java.util.HashMap();

    /* renamed from: mInfoWindowClickMap */
    private java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener> f37458x3db52e5f = new java.util.HashMap();

    public C16319x94a0c128(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7) {
        this.f37461xd6e0b024 = interfaceC25945x718093f7;
        this.f37461xd6e0b024.mo99012xef348ca1(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener() { // from class: com.tencent.mm.plugin.location_soso.ViewManager.1
            @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener
            /* renamed from: onMarkerClick */
            public boolean mo14570x289a5e0f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener onMarkerClickListener = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener) com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128.this.f37459xdbce42db.get(interfaceC4409x88f1805a);
                if (onMarkerClickListener != null) {
                    return onMarkerClickListener.mo14570x289a5e0f(interfaceC4409x88f1805a);
                }
                return false;
            }
        });
        this.f37461xd6e0b024.mo99006xdfba4d9d(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener() { // from class: com.tencent.mm.plugin.location_soso.ViewManager.2
            @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener
            /* renamed from: onInfoWindowClick */
            public void mo66012xc56a6a0b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener onInfoWindowClickListener = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener) com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128.this.f37458x3db52e5f.get(interfaceC4409x88f1805a);
                if (onInfoWindowClickListener != null) {
                    onInfoWindowClickListener.mo66012xc56a6a0b(interfaceC4409x88f1805a);
                }
            }
        });
    }

    /* renamed from: addPinView */
    public void m65993x4fdae5f9(android.view.View view, double d17, double d18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7 = this.f37461xd6e0b024;
        if (interfaceC25945x718093f7 == null) {
            return;
        }
        this.f37460x430dc0d5.put(view, interfaceC25945x718093f7.mo98940xf4c43c3b(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4().m37307x2c929929(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18)).m37268xabc2c2b5(0.5f, 0.5f).m37306x427c95ff(view)));
    }

    /* renamed from: addView */
    public void m65994xbb8aeee6(android.view.View view, double d17, double d18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7 = this.f37461xd6e0b024;
        if (interfaceC25945x718093f7 == null) {
            return;
        }
        this.f37460x430dc0d5.put(view, interfaceC25945x718093f7.mo98940xf4c43c3b(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4().m37307x2c929929(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18)).m37306x427c95ff(view)));
    }

    /* renamed from: animateCamera */
    public void m65995x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25936xd5528c6e c25936xd5528c6e) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7 = this.f37461xd6e0b024;
        if (interfaceC25945x718093f7 != null) {
            interfaceC25945x718093f7.mo98952x59b77566(c25936xd5528c6e);
        }
    }

    /* renamed from: destroy */
    public void m65996x5cd39ffa() {
        java.util.Map<android.view.View, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a> map = this.f37460x430dc0d5;
        if (map != null) {
            map.clear();
            this.f37459xdbce42db.clear();
            this.f37458x3db52e5f.clear();
        }
    }

    /* renamed from: disableDarkMode */
    public void m65997xc5fe1141() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7 = this.f37461xd6e0b024;
        if (interfaceC25945x718093f7 != null) {
            interfaceC25945x718093f7.mo99002xe31e23f4(1000);
        }
    }

    /* renamed from: drawAccuracyCircle */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4395x7851a8f0 m65998x29f3758d(double d17, double d18, double d19) {
        if (this.f37461xd6e0b024 == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e c4396xfbda878e = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e();
        c4396xfbda878e.m37137xaeb2cc55(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18));
        c4396xfbda878e.m37151xc80e6c92(d19);
        c4396xfbda878e.m37152x7197ec0b(android.graphics.Color.parseColor("#00FFFFFF"));
        c4396xfbda878e.m37155x72aeea6e(0.0f);
        c4396xfbda878e.m37139xbbf043a0(android.graphics.Color.parseColor("#4D1485EE"));
        return this.f37461xd6e0b024.mo98936xe42464d1(c4396xfbda878e);
    }

    /* renamed from: enableDarkMode */
    public void m65999x7c4248dc() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7 = this.f37461xd6e0b024;
        if (interfaceC25945x718093f7 != null) {
            interfaceC25945x718093f7.mo99002xe31e23f4(1008);
        }
    }

    @Override // ab3.i
    /* renamed from: getTencentMap */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 mo1021xe8ef6fcd() {
        return this.f37461xd6e0b024;
    }

    /* renamed from: removeView */
    public void m66000x417bc549(android.view.View view) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a;
        if (this.f37461xd6e0b024 == null || (interfaceC4409x88f1805a = this.f37460x430dc0d5.get(view)) == null) {
            return;
        }
        interfaceC4409x88f1805a.mo37126xc84af884();
        this.f37459xdbce42db.remove(interfaceC4409x88f1805a);
        this.f37458x3db52e5f.remove(interfaceC4409x88f1805a);
    }

    /* renamed from: setInfoWindowAdapter */
    public void m66001x3d10faef(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter infoWindowAdapter) {
        this.f37461xd6e0b024.mo98998x3d10faef(infoWindowAdapter);
    }

    /* renamed from: setInfoWindowClick */
    public void m66002x35bb8528(android.view.View view, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener onInfoWindowClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a;
        if (this.f37461xd6e0b024 == null || (interfaceC4409x88f1805a = this.f37460x430dc0d5.get(view)) == null) {
            return;
        }
        this.f37458x3db52e5f.put(interfaceC4409x88f1805a, onInfoWindowClickListener);
    }

    /* renamed from: setMarker2Top */
    public void m66003x5ed0f0ff(android.view.View view) {
        if (this.f37461xd6e0b024 == null) {
            return;
        }
        this.f37460x430dc0d5.get(view).mo37247x7640bf25();
    }

    /* renamed from: setMarkerClick */
    public void m66004x7c478fac(android.view.View view, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener onMarkerClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a;
        if (this.f37461xd6e0b024 == null || (interfaceC4409x88f1805a = this.f37460x430dc0d5.get(view)) == null) {
            return;
        }
        this.f37459xdbce42db.put(interfaceC4409x88f1805a, onMarkerClickListener);
    }

    /* renamed from: setMarkerTag */
    public void m66005x2417c2be(android.view.View view, java.lang.String str) {
        if (this.f37461xd6e0b024 == null) {
            return;
        }
        this.f37460x430dc0d5.get(view).mo37263xca0297d8(str);
    }

    /* renamed from: showInfoWindowByView */
    public void m66006x57c07497(android.view.View view) {
        if (this.f37461xd6e0b024 == null) {
            return;
        }
        this.f37460x430dc0d5.get(view).mo37266x3487511b();
    }

    /* renamed from: toggleViewVisible */
    public void m66007x89c24a19(android.view.View view) {
        if (this.f37461xd6e0b024 == null) {
            return;
        }
        this.f37460x430dc0d5.get(view).mo37134xcd1079b0(view.getVisibility() == 0);
    }

    /* renamed from: updateLocationPinLayout */
    public void m66008x3c714321(android.view.View view, double d17, double d18, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a;
        if (this.f37461xd6e0b024 == null || (interfaceC4409x88f1805a = this.f37460x430dc0d5.get(view)) == null) {
            return;
        }
        interfaceC4409x88f1805a.mo37134xcd1079b0(view.getVisibility() == 0);
        interfaceC4409x88f1805a.mo37260xa32537ab(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18));
        if (z17) {
            interfaceC4409x88f1805a.mo37259x5ee19c01(view);
        }
        interfaceC4409x88f1805a.mo37249x40f19b7(0.5f, 0.5f);
    }

    /* renamed from: updateMarkerView */
    public void m66009xf5f903a8(android.view.View view) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a;
        if (this.f37461xd6e0b024 == null || (interfaceC4409x88f1805a = this.f37460x430dc0d5.get(view)) == null) {
            return;
        }
        interfaceC4409x88f1805a.mo37259x5ee19c01(view);
    }

    /* renamed from: updateRotation */
    public void m66010x3176d367(android.view.View view, float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a;
        if (this.f37461xd6e0b024 == null || (interfaceC4409x88f1805a = this.f37460x430dc0d5.get(view)) == null) {
            return;
        }
        interfaceC4409x88f1805a.mo37261x742bae00(f17);
    }

    /* renamed from: updateViewLayout */
    public void m66011x37843fd8(android.view.View view, double d17, double d18, boolean z17) {
        if (this.f37461xd6e0b024 == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a = this.f37460x430dc0d5.get(view);
        interfaceC4409x88f1805a.mo37134xcd1079b0(view.getVisibility() == 0);
        interfaceC4409x88f1805a.mo37260xa32537ab(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d17, d18));
        if (z17) {
            interfaceC4409x88f1805a.mo37259x5ee19c01(view);
        }
        interfaceC4409x88f1805a.mo37249x40f19b7(0.5f, 1.0f);
    }
}
