package com.p314xaae8f345.p2926x359365.p2927x6b0147b;

/* renamed from: com.tencent.rtmp.video.ScreenCaptureService */
/* loaded from: classes13.dex */
public class ServiceC25493x6c93903b extends android.app.Service {

    /* renamed from: CHANNEL_ID */
    private static final java.lang.String f46627xa9d495f7 = "notification_id";

    /* renamed from: NOTIFICATION_ID */
    private static final int f46628xf31cd0ef = 13957237;
    private static final java.lang.String TAG = "ScreenCaptureService";

    /* renamed from: createNotification */
    private android.app.Notification m94632x9a35e407() {
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 26) {
            ((android.app.NotificationManager) getSystemService("notification")).createNotificationChannel(new android.app.NotificationChannel(f46627xa9d495f7, "notification_name", 2));
        }
        android.app.Notification.Builder defaults = new android.app.Notification.Builder(this).setDefaults(1);
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 26) {
            defaults.setChannelId(f46627xa9d495f7);
        }
        return defaults.build();
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "Service on bind");
        return new android.os.Binder();
    }

    @Override // android.app.Service
    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        android.media.projection.MediaProjection mediaProjection;
        int intExtra = intent.getIntExtra("code", -1);
        android.content.Intent intent2 = (android.content.Intent) intent.getParcelableExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "On Start server command, code:" + intExtra + ", data:" + intent2);
        if (intent2 == null) {
            stopSelf();
            return 2;
        }
        try {
            if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 29) {
                startForeground(f46628xf31cd0ef, m94632x9a35e407(), 32);
            } else if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 26) {
                startForeground(f46628xf31cd0ef, m94632x9a35e407());
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "start foreground failed.", th6);
        }
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 21) {
            try {
                mediaProjection = ((android.media.projection.MediaProjectionManager) getSystemService("media_projection")).getMediaProjection(intExtra, intent2);
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "onStartCommand mediaProjectionManager getMediaProjection fail.", th7);
                mediaProjection = null;
            }
            com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a(this).a(mediaProjection);
        }
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "Service on unbind");
        return super.onUnbind(intent);
    }
}
