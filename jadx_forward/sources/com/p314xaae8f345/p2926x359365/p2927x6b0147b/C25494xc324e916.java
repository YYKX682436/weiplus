package com.p314xaae8f345.p2926x359365.p2927x6b0147b;

/* renamed from: com.tencent.rtmp.video.TXScreenCapture */
/* loaded from: classes6.dex */
public class C25494xc324e916 {

    /* renamed from: com.tencent.rtmp.video.TXScreenCapture$TXScreenCaptureAssistantActivity */
    /* loaded from: classes13.dex */
    public static class TXScreenCaptureAssistantActivity extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

        /* renamed from: REQUEST_CODE */
        private static final int f46629xd9888dbd = 100;
        private static final java.lang.String TAG = "TXScreenCaptureAssistantActivity";

        /* renamed from: mMediaProjectionManager */
        private android.media.projection.MediaProjectionManager f46630xb9a777a7;

        /* renamed from: createOnePixelActivity */
        private void m94633x3729480b() {
            android.view.Window window = getWindow();
            window.setGravity(8388659);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = 0;
            attributes.y = 0;
            attributes.height = 1;
            attributes.width = 1;
            window.setAttributes(attributes);
        }

        @Override // android.app.Activity
        public void onActivityResult(int i17, int i18, android.content.Intent intent) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "onActivityResult " + this + ", resultCode:" + i18 + ", data:" + intent);
            android.media.projection.MediaProjection mediaProjection = null;
            if (intent == null) {
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a(this).a((android.media.projection.MediaProjection) null);
                finish();
                return;
            }
            if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 26) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "startForegroundService");
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.p2926x359365.p2927x6b0147b.ServiceC25493x6c93903b.class);
                intent2.putExtra("code", i18);
                intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, intent);
                startForegroundService(intent2);
            } else {
                try {
                    mediaProjection = this.f46630xb9a777a7.getMediaProjection(i18, intent);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "onActivityResult mMediaProjectionManager.getMediaProjection fail.", th6);
                }
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "ProjectionManger get mediaProjection:".concat(java.lang.String.valueOf(mediaProjection)));
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a(this).a(mediaProjection);
            }
            finish();
        }

        @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "onCreate ".concat(java.lang.String.valueOf(this)));
            requestWindowFeature(1);
            m94633x3729480b();
            android.media.projection.MediaProjectionManager mediaProjectionManager = (android.media.projection.MediaProjectionManager) getSystemService("media_projection");
            this.f46630xb9a777a7 = mediaProjectionManager;
            try {
                startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 100);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Start permission activity failed. ".concat(java.lang.String.valueOf(th6)));
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a(this).a((android.media.projection.MediaProjection) null);
                finish();
            }
        }

        @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
        public void onDestroy() {
            super.onDestroy();
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "onDestroy ".concat(java.lang.String.valueOf(this)));
        }
    }
}
