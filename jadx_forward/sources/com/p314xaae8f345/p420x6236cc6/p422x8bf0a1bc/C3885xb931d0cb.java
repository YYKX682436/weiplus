package com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc;

/* renamed from: com.tencent.live2.jsplugin.JSAdapterOnlineLog */
/* loaded from: classes16.dex */
public class C3885xb931d0cb {
    private static final java.lang.String TAG = "JSAdapterOnlineLog";

    /* renamed from: instance */
    private static volatile com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3885xb931d0cb f15472x21169495;

    /* renamed from: mOnlineLogger */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c f15478xd08166d0;

    /* renamed from: mLoggerLevel */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c.b f15475x7f3ec127 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c.b.kApi;

    /* renamed from: mMaxCacheLogNumber */
    private int f15477xc3ed63e2 = 10;

    /* renamed from: mIsInitted */
    private boolean f15474xcc4a128c = false;

    /* renamed from: mBusinessName */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c.a f15473x6f78e778 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c.a.kLive;

    /* renamed from: mSDkAppId */
    private int f15480x96aba66f = 0;

    /* renamed from: mRoomId */
    private java.lang.String f15479x1844e623 = "";

    /* renamed from: mUserId */
    private java.lang.String f15481x1d975513 = "";

    /* renamed from: mLoggerQueue */
    private java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> f15476x7f8c3eb4 = new java.util.concurrent.ConcurrentLinkedQueue<>();

    private C3885xb931d0cb() {
    }

    /* renamed from: checkNeedInit */
    private boolean m31938xc380e7ee(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c.a aVar, int i17, java.lang.String str, java.lang.String str2) {
        return (this.f15473x6f78e778 == aVar && this.f15480x96aba66f == i17 && this.f15479x1844e623.equals(str) && this.f15481x1d975513.equals(str2)) ? false : true;
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3885xb931d0cb m31939x9cf0d20b() {
        if (f15472x21169495 == null) {
            synchronized (com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3885xb931d0cb.class) {
                if (f15472x21169495 == null) {
                    f15472x21169495 = new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3885xb931d0cb();
                }
            }
        }
        return f15472x21169495;
    }

    /* renamed from: insertCacheLog */
    private void m31940x3506923b(java.lang.String str) {
        while (this.f15476x7f8c3eb4.size() >= this.f15477xc3ed63e2) {
            this.f15476x7f8c3eb4.poll();
        }
        this.f15476x7f8c3eb4.add(str);
    }

    /* renamed from: reportCacheLog */
    private void m31941x7d1179b6() {
        if (this.f15476x7f8c3eb4.isEmpty()) {
            return;
        }
        while (!this.f15476x7f8c3eb4.isEmpty()) {
            this.f15478xd08166d0.log(this.f15475x7f3ec127, this.f15476x7f8c3eb4.poll());
        }
    }

    public synchronized void log(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f15474xcc4a128c) {
            this.f15478xd08166d0.log(this.f15475x7f3ec127, str);
        } else {
            m31940x3506923b(str);
        }
    }

    /* renamed from: updateUrl */
    public synchronized void m31942x8bd173e6(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c c3770x7b2cd70c = this.f15478xd08166d0;
            if (c3770x7b2cd70c != null) {
                c3770x7b2cd70c.m29400x5cd39ffa();
            }
            this.f15478xd08166d0 = null;
            this.f15474xcc4a128c = false;
            this.f15473x6f78e778 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c.a.kLive;
            this.f15480x96aba66f = 0;
            this.f15479x1844e623 = "";
            this.f15481x1d975513 = "";
            return;
        }
        try {
            java.lang.String decode = java.net.URLDecoder.decode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c.a aVar = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c.a.kLive;
            if (decode.startsWith(com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.f15470x6f8f616f) || decode.startsWith(com.p314xaae8f345.p420x6236cc6.p421x316220.C3884x280948e5.f15471x6f8f6170) || decode.startsWith("trtc://")) {
                aVar = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c.a.kTRTC;
            }
            java.lang.String str2 = "0";
            java.lang.String str3 = "";
            java.lang.String str4 = "";
            if (decode.startsWith("rtmp")) {
                str3 = com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3886xbc69c2c2.m31943xe699b631(decode);
                str4 = com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3886xbc69c2c2.m31943xe699b631(decode);
            } else if (decode.startsWith("trtc://")) {
                str2 = com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3886xbc69c2c2.m31944x4b3e091f(decode, "sdkappid");
                str4 = com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3886xbc69c2c2.m31944x4b3e091f(decode, "userId");
                str3 = com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3886xbc69c2c2.m31943xe699b631(decode);
            } else if (decode.startsWith("room://")) {
                str2 = com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3886xbc69c2c2.m31944x4b3e091f(decode, "sdkappid");
                str3 = com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3886xbc69c2c2.m31944x4b3e091f(decode, "roomid");
                str4 = com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3886xbc69c2c2.m31944x4b3e091f(decode, "userid");
            }
            int parseInt = java.lang.Integer.parseInt(str2);
            if (m31938xc380e7ee(aVar, parseInt, str3, str4)) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c c3770x7b2cd70c2 = this.f15478xd08166d0;
                if (c3770x7b2cd70c2 != null) {
                    c3770x7b2cd70c2.m29400x5cd39ffa();
                    this.f15478xd08166d0 = null;
                }
                this.f15473x6f78e778 = aVar;
                this.f15480x96aba66f = parseInt;
                this.f15479x1844e623 = str3;
                this.f15481x1d975513 = str4;
                this.f15478xd08166d0 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p383xbe97f590.C3770x7b2cd70c(aVar, parseInt, str3, str4);
                this.f15474xcc4a128c = true;
                m31941x7d1179b6();
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "updateUrl fail, url:".concat(java.lang.String.valueOf(str)));
        }
    }
}
