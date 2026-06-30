package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/media/FinderLiveMediaBrowserNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserNotificationReceiver */
/* loaded from: classes11.dex */
public final class C14433x6d52d330 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotificationReceiver", "onReceive: action=" + intent.getAction());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        df2.k2 k2Var = c14197x319b1b9e != null ? (df2.k2) c14197x319b1b9e.m56798x25fe639c(df2.k2.class) : null;
        if (k2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveNotificationReceiver", "onReceive - FinderLiveMediaBrowserController not available");
            return;
        }
        java.lang.String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -240155104) {
                if (hashCode == 1144817770 && action.equals("com.tencent.mm.plugin.finder.live.ACTION_PAUSE")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "userClickNotificationPause - Send pause command via MediaController");
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r rVar = k2Var.f312078n;
                    if (rVar != null) {
                        android.media.session.MediaController.TransportControls transportControls = ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k) rVar.f90523a).f90509a.getTransportControls();
                        (android.os.Build.VERSION.SDK_INT >= 29 ? new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.q(transportControls) : new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.p(transportControls)).f90522a.pause();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotificationReceiver", "onReceive - Called controller.pause()");
                    return;
                }
            } else if (action.equals("com.tencent.mm.plugin.finder.live.ACTION_PLAY")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "userClickNotificationPlay - Send play command via MediaController");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r rVar2 = k2Var.f312078n;
                if (rVar2 != null) {
                    android.media.session.MediaController.TransportControls transportControls2 = ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k) rVar2.f90523a).f90509a.getTransportControls();
                    (android.os.Build.VERSION.SDK_INT >= 29 ? new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.q(transportControls2) : new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.p(transportControls2)).f90522a.play();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotificationReceiver", "onReceive - Called controller.play()");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveNotificationReceiver", "onReceive - Unknown action: " + intent.getAction());
    }
}
