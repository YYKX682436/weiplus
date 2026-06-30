package sn2;

/* loaded from: classes10.dex */
public final class f extends p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v {

    /* renamed from: f, reason: collision with root package name */
    public final sn2.g f491664f;

    public f(sn2.g service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f491664f = service;
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void b(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        sn2.c cVar = sn2.c.f491653e;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "NOTIFY_PLAYING");
        sn2.g gVar = this.f491664f;
        if (b17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf serviceC14434x2b82fbf = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf) gVar;
            serviceC14434x2b82fbf.h();
            serviceC14434x2b82fbf.i(3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC14434x2b82fbf.f202384n, "notifyPlaying - Playing state updated");
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "NOTIFY_PAUSED")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf serviceC14434x2b82fbf2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf) gVar;
            serviceC14434x2b82fbf2.h();
            serviceC14434x2b82fbf2.i(2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC14434x2b82fbf2.f202384n, "notifyPaused - Paused state updated");
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SHOW_CONTROLS")) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf) gVar).f(true);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "HIDE_CONTROLS")) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf) gVar).f(false);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "UPDATE_LIVE_INFO")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf serviceC14434x2b82fbf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf) gVar;
            serviceC14434x2b82fbf3.h();
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0 k0Var = serviceC14434x2b82fbf3.f202386p;
            if (k0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stateBuilder");
                throw null;
            }
            serviceC14434x2b82fbf3.i(k0Var.a().f90485d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC14434x2b82fbf3.f202384n, "notifyLiveInfoChanged - Live info updated");
        }
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void d() {
        l(false);
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void e() {
        l(true);
    }

    public final void l(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserCallback", "updatePlayingState - User clicked button and target play state: " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        df2.k2 k2Var = c14197x319b1b9e != null ? (df2.k2) c14197x319b1b9e.m56798x25fe639c(df2.k2.class) : null;
        if (k2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMediaBrowserCallback", "updatePlayingState - Controller not available");
            return;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "handleUserPauseCommand - User requested pause");
            mn0.b0 Z6 = k2Var.Z6();
            if (Z6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMediaBrowserController", "handleUserPauseCommand - CDN player not available");
                return;
            }
            k2Var.f312081q = true;
            mn0.b0.M(Z6, false, 1, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "handleUserPauseCommand - Player paused, pausedByMediaSessionOrNotificationAction set to true");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "handleUserPlayCommand - User requested play");
        if (((mm2.c1) k2Var.m56788xbba4bfc0(mm2.c1.class)).U7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "handleUserPlayCommand - Live has finished, ignore play command and keep paused state");
            k2Var.g7();
            return;
        }
        if (pm0.v.z(((mm2.c1) k2Var.m56788xbba4bfc0(mm2.c1.class)).f410340g2, 524288)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "handleUserPlayCommand - Anchor has paused live, ignore play command and keep paused state");
            k2Var.g7();
            return;
        }
        mn0.b0 Z62 = k2Var.Z6();
        if (Z62 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMediaBrowserController", "handleUserPlayCommand - CDN player not available");
            return;
        }
        k2Var.f312081q = false;
        ((mn0.y) Z62).y();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "handleUserPlayCommand - Player resumed, pausedByMediaSessionOrNotificationAction cleared");
    }
}
