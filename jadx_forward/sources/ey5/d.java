package ey5;

/* loaded from: classes13.dex */
public class d implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 f339176d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 f339177e;

    public d(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25946x7e4576a7 c25946x7e4576a7) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7;
        com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.C4422xd8343bf2.v("vector MapView construct function start");
        if (c25946x7e4576a7 != null) {
            c25966x7e4576a7 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7();
            c25966x7e4576a7.m99231x3bc5aa16(com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.C4423xff8c9b4d.m37443x694b1279());
            if (c25946x7e4576a7.m99045xd6193b42() != null) {
                c25966x7e4576a7.m99235x43d894e(c25946x7e4576a7.m99045xd6193b42());
            }
            c25966x7e4576a7.m99239x994c50aa(c25946x7e4576a7.m99055xfdb0a8e2());
            c25966x7e4576a7.m99254x41da004c(c25946x7e4576a7.m99053x2ff2e2f5(), c25946x7e4576a7.m99052x7528ddc5());
            c25966x7e4576a7.m99245x4e8a8213(c25946x7e4576a7.m99056x4e999141());
            c25966x7e4576a7.m99190x70d4ec49(c25946x7e4576a7.m99044x70d4ec49());
            if (c25946x7e4576a7.m99050x2f8cbf89() != null) {
                c25966x7e4576a7.m99253x299d9fab(c25946x7e4576a7.m99051x6a85a0d8(), c25946x7e4576a7.m99050x2f8cbf89());
            }
            if (c25946x7e4576a7.m99049x25b9efff() != null) {
                c25966x7e4576a7.m99248x950fa8e(c25946x7e4576a7.m99049x25b9efff());
            }
            if (c25946x7e4576a7.m99054x61d18b3d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.VectorMapView", "initLogger");
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.Builder m99600x3136c9db = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.m99600x3136c9db();
                m99600x3136c9db.m99612xcc2fc297(false);
                m99600x3136c9db.m99611xd5943e5c(false);
                m99600x3136c9db.m99608x6219b84(4);
                m99600x3136c9db.m99609x5d72a3a9(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.LogCallback() { // from class: ey5.d$$a
                    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.LogCallback
                    /* renamed from: onLog */
                    public final void mo99613x64f5ce5(java.lang.String str) {
                        ey5.d.this.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.VectorMapView", "" + str);
                    }
                });
                c25966x7e4576a7.m99221x3323ac0(m99600x3136c9db.m99607x59bc66e());
            }
        } else {
            c25966x7e4576a7 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7();
            c25966x7e4576a7.m99231x3bc5aa16(com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.C4423xff8c9b4d.m37443x694b1279());
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 c25958x9518de01 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01(context, c25966x7e4576a7);
        this.f339176d = c25958x9518de01;
        this.f339177e = new ey5.r(c25958x9518de01.mo99086xb5885626());
        c25958x9518de01.mo99086xb5885626().mo37466xbd4012cd().mo37038xca0bb396(false);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: addView */
    public void mo98896xbb8aeee6(android.view.View view, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01.LayoutParams layoutParams) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 c25958x9518de01 = this.f339176d;
        if (c25958x9518de01.mo99086xb5885626() != null) {
            c25958x9518de01.mo99086xb5885626().mo36540xf4c43c3b(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4().m99696x313c79(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99345xb5d0e16f(view)).m99714x2c929929(ey5.x.f(layoutParams.f49145x65e5590)));
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 c25958x9518de01 = this.f339176d;
        if (c25958x9518de01 == null) {
            return false;
        }
        return c25958x9518de01.dispatchTouchEvent(motionEvent) || c25958x9518de01.onTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: getMap */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 mo98897xb5885626() {
        return this.f339177e;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: getMapController */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25941x689711f8 mo98898xf6579e62() {
        return this.f339177e;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: getMapView */
    public android.view.View mo98899x6fad81eb() {
        return this.f339176d;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: getProjection */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f mo98900x78d58245() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7 = this.f339177e;
        if (interfaceC25945x718093f7 != null) {
            return ((ey5.r) interfaceC25945x718093f7).mo98968x78d58245();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: getUiSettings */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25947x45d136f7 mo98901xbd4012cd() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 c25958x9518de01 = this.f339176d;
        if (c25958x9518de01.mo99086xb5885626() != null) {
            return new ey5.y(c25958x9518de01.mo99086xb5885626().mo37466xbd4012cd());
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onCreate */
    public void mo98902x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onDestroy */
    public void mo98903xac79a11b() {
        this.f339176d.mo99090xac79a11b();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7 = this.f339177e;
        if (interfaceC25945x718093f7 instanceof ey5.r) {
            ey5.r rVar = (ey5.r) interfaceC25945x718093f7;
            java.util.List list = rVar.f339201m;
            if (list != null) {
                ((java.util.LinkedList) list).clear();
            }
            java.util.List list2 = rVar.f339203o;
            if (list2 != null) {
                ((java.util.LinkedList) list2).clear();
            }
            java.util.List list3 = rVar.f339205q;
            if (list3 != null) {
                ((java.util.LinkedList) list3).clear();
            }
            java.util.List list4 = rVar.f339207s;
            if (list4 != null) {
                ((java.util.LinkedList) list4).clear();
            }
            java.util.List list5 = rVar.f339209u;
            if (list5 != null) {
                ((java.util.LinkedList) list5).clear();
            }
            java.util.List list6 = rVar.f339211w;
            if (list6 != null) {
                ((java.util.LinkedList) list6).clear();
            }
            java.util.List list7 = rVar.f339213y;
            if (list7 != null) {
                ((java.util.LinkedList) list7).clear();
            }
            java.util.List list8 = rVar.A;
            if (list8 != null) {
                ((java.util.LinkedList) list8).clear();
            }
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onDestroyView */
    public void mo98904xa6664a60() {
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onLowMemory */
    public void mo98905xb5d8ba56() {
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onPause */
    public void mo98906xb01dfb57() {
        this.f339176d.mo99091xb01dfb57();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onRestart */
    public void mo98907x91109f30() {
        this.f339176d.mo99092x91109f30();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onResume */
    public void mo98908x57429eec() {
        this.f339176d.mo99093x57429eec();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onSaveInstanceState */
    public void mo98909xa71a2260(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onSizeChanged */
    public void mo128406x6521d014(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 c25958x9518de01 = this.f339176d;
        if (c25958x9518de01 != null) {
            c25958x9518de01.onSizeChanged(i17, i18, i19, i27);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onStart */
    public void mo98910xb05099c3() {
        this.f339176d.mo99094xb05099c3();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onStop */
    public void mo98911xc39f8281() {
        this.f339176d.mo99095xc39f8281();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onSurfaceChanged */
    public void mo98912xd8f18906(java.lang.Object obj, int i17, int i18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 c25958x9518de01 = this.f339176d;
        if (c25958x9518de01 != null) {
            c25958x9518de01.mo99136xd8f18906(obj, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onTouchEvent */
    public boolean mo128407x667eb1da(android.view.MotionEvent motionEvent) {
        return motionEvent.getAction() == 0;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998, android.view.ViewManager
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 c25958x9518de01 = this.f339176d;
        if (c25958x9518de01 != null) {
            c25958x9518de01.updateViewLayout(view, layoutParams);
        }
    }
}
