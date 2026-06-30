package du2;

/* loaded from: classes2.dex */
public final class v extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.pb {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        i95.m c17 = i95.n0.c(du2.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!du2.j.f325009d.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerController", "[onConfigurationChanged] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((eu2.b0) c18).f338309z = newConfig;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        i95.m c17 = i95.n0.c(du2.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!du2.j.f325009d.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerController", "[onActivityCreate] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((eu2.b0) c18).B.add(activity.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        android.content.Context context;
        i95.m c17 = i95.n0.c(du2.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!du2.j.f325009d.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerController", "[onActivityDestroy] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        eu2.b0 b0Var = (eu2.b0) c18;
        b0Var.B.remove(activity.toString());
        b0Var.f338304u = null;
        in5.s0 s0Var = b0Var.f338294h;
        if (s0Var != null && (context = s0Var.f374654e) != null) {
            while (context instanceof android.content.ContextWrapper) {
                if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                    abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
                    break;
                } else {
                    context = ((android.content.ContextWrapper) context).getBaseContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getBaseContext(...)");
                }
            }
        }
        abstractActivityC21394xb3d2c0cf = null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractActivityC21394xb3d2c0cf, activity)) {
            b0Var.f338294h = null;
        }
        java.lang.ref.WeakReference weakReference = b0Var.A;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(weakReference != null ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) weakReference.get() : null, activity)) {
            b0Var.A = null;
        }
        cw2.da daVar = b0Var.f338290d;
        if (daVar != null && activity.hashCode() != daVar.getI()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onActivityDestroy] hashCode is not equal to activity, playingView = " + daVar);
        } else {
            eu2.k kVar = b0Var.f338293g;
            if (kVar == eu2.k.f338328e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onActivityDestroy] currentScene = MINI_VIEW, return!");
            } else {
                b0Var.hj(kVar);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        super.mo2281xb01dfb57();
        i95.m c17 = i95.n0.c(du2.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!du2.j.f325009d.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerController", "[onActivityPaused] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        eu2.b0 b0Var = (eu2.b0) c18;
        if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onActivityPaused] activity = " + activity);
            return;
        }
        in5.s0 Ri = b0Var.Ri(activity);
        cw2.da videoView = (Ri == null || (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) Ri.k(com.p314xaae8f345.mm.R.id.e_k)) == null) ? null : c15196x85976f5f.getVideoView();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
        java.lang.Object m61394x356ded51 = c15188xd8bd4bd != null ? c15188xd8bd4bd.m61394x356ded51() : null;
        android.view.TextureView textureView = m61394x356ded51 instanceof android.view.TextureView ? (android.view.TextureView) m61394x356ded51 : null;
        if (textureView == null) {
            return;
        }
        b0Var.f338304u = textureView.getBitmap();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        ls5.k mo58776x51603325;
        super.mo2286xb05099c3();
        i95.m c17 = i95.n0.c(du2.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!du2.j.f325009d.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerController", "[onActivityStart] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        eu2.b0 b0Var = (eu2.b0) c18;
        if (b0Var.f338293g == eu2.k.f338327d) {
            b0Var.ij("unlock_screen_and_return_finder");
        }
        cw2.da daVar = b0Var.f338290d;
        java.lang.Long l17 = null;
        cw2.u9 u9Var = daVar instanceof cw2.u9 ? (cw2.u9) daVar : null;
        if (u9Var != null) {
            ls5.m mVar = u9Var instanceof ls5.m ? (ls5.m) u9Var : null;
            if (mVar != null && (mo58776x51603325 = mVar.mo58776x51603325()) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[restoreOriginalDetectorLifeCycle] restoring original lifecycle: " + b0Var.f338306w);
                ((ls5.d) mo58776x51603325).f402661h = b0Var.f338306w;
                b0Var.f338306w = null;
            }
        }
        b0Var.wi();
        int hashCode = activity.hashCode();
        cw2.da daVar2 = b0Var.f338290d;
        if (!(daVar2 != null && hashCode == daVar2.getI())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onActivityStart] the context of playingView is not equal to current activity, activity = " + activity + ", return!");
            return;
        }
        cw2.da daVar3 = b0Var.f338290d;
        if (daVar3 != null) {
            daVar3.w();
        }
        b0Var.nj();
        b0Var.Di();
        if (!b0Var.f338299p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onActivityStart] have not click system player when key guard show, cancel notification, activity = " + activity);
            b0Var.hj(b0Var.f338293g);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onActivityStart] already do operation manually!");
        in5.s0 Ri = b0Var.Ri(activity);
        so2.j5 j5Var = Ri != null ? (so2.j5) Ri.f374658i : null;
        so2.u1 u1Var = j5Var instanceof so2.u1 ? (so2.u1) j5Var : null;
        java.lang.Long valueOf = u1Var != null ? java.lang.Long.valueOf(u1Var.mo2128x1ed62e84()) : null;
        cw2.wa waVar = b0Var.f338291e;
        if (waVar != null && (c14989xf862ae88 = waVar.f305632f) != null) {
            l17 = java.lang.Long.valueOf(c14989xf862ae88.m59124x87980ca());
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, l17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onActivityStart] update current scene.");
            b0Var.f338293g = eu2.k.f338329f;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        i95.m c17 = i95.n0.c(du2.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!du2.j.f325009d.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerController", "[onActivityStopped] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        eu2.b0 b0Var = (eu2.b0) c18;
        b0Var.A = new java.lang.ref.WeakReference(activity);
        if (b0Var.Zi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onActivityStopped] keyGuard is locked, return!");
        } else {
            if (b0Var.f338293g == eu2.k.f338328e || !b0Var.aj()) {
                return;
            }
            b0Var.Ni();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onWindowFocusChanged */
    public void mo14961xa4ec7b0b(boolean z17) {
        super.mo14961xa4ec7b0b(z17);
        i95.m c17 = i95.n0.c(du2.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!du2.j.f325009d.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerController", "[onWindowFocusChanged] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        eu2.b0 b0Var = (eu2.b0) c18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[onWindowFocusChanged] hasFocus = " + z17 + ", livePausedByMediaSessionOrNotificationAction = " + b0Var.f338296m + ", currentFeedType = " + b0Var.f338295i);
        if (z17) {
            if (!b0Var.f338296m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "skip, livePausedByMediaSessionOrNotificationAction = false");
                return;
            }
            if (b0Var.f338295i != eu2.e.f338316e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "skip, currentFeedType = " + b0Var.f338295i + ", not LIVE");
                return;
            }
            if (b0Var.f338293g != eu2.k.f338329f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "skip, currentScene = " + b0Var.f338293g + ", not FEED_STREAM");
                return;
            }
            in5.s0 Ri = b0Var.Ri(activity);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = Ri != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) Ri.k(com.p314xaae8f345.mm.R.id.e_k) : null;
            if (c15196x85976f5f == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "skip, videoLayout is null");
                return;
            }
            if (c15196x85976f5f.J()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "skip, live feed is already playing");
                b0Var.f338296m = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "auto resume live feed playback");
                b0Var.f338296m = false;
                cw2.v9.n(c15196x85976f5f, 0, null, null, 7, null);
            }
        }
    }
}
