package com.tencent.live2.jsplugin;

/* loaded from: classes16.dex */
public class JSAdapterOnlineLog {
    private static final java.lang.String TAG = "JSAdapterOnlineLog";
    private static volatile com.tencent.live2.jsplugin.JSAdapterOnlineLog instance;
    private com.tencent.liteav.base.logger.OnlineLoggerAndroid mOnlineLogger;
    private com.tencent.liteav.base.logger.OnlineLoggerAndroid.b mLoggerLevel = com.tencent.liteav.base.logger.OnlineLoggerAndroid.b.kApi;
    private int mMaxCacheLogNumber = 10;
    private boolean mIsInitted = false;
    private com.tencent.liteav.base.logger.OnlineLoggerAndroid.a mBusinessName = com.tencent.liteav.base.logger.OnlineLoggerAndroid.a.kLive;
    private int mSDkAppId = 0;
    private java.lang.String mRoomId = "";
    private java.lang.String mUserId = "";
    private java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> mLoggerQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();

    private JSAdapterOnlineLog() {
    }

    private boolean checkNeedInit(com.tencent.liteav.base.logger.OnlineLoggerAndroid.a aVar, int i17, java.lang.String str, java.lang.String str2) {
        return (this.mBusinessName == aVar && this.mSDkAppId == i17 && this.mRoomId.equals(str) && this.mUserId.equals(str2)) ? false : true;
    }

    public static com.tencent.live2.jsplugin.JSAdapterOnlineLog getInstance() {
        if (instance == null) {
            synchronized (com.tencent.live2.jsplugin.JSAdapterOnlineLog.class) {
                if (instance == null) {
                    instance = new com.tencent.live2.jsplugin.JSAdapterOnlineLog();
                }
            }
        }
        return instance;
    }

    private void insertCacheLog(java.lang.String str) {
        while (this.mLoggerQueue.size() >= this.mMaxCacheLogNumber) {
            this.mLoggerQueue.poll();
        }
        this.mLoggerQueue.add(str);
    }

    private void reportCacheLog() {
        if (this.mLoggerQueue.isEmpty()) {
            return;
        }
        while (!this.mLoggerQueue.isEmpty()) {
            this.mOnlineLogger.log(this.mLoggerLevel, this.mLoggerQueue.poll());
        }
    }

    public synchronized void log(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (this.mIsInitted) {
            this.mOnlineLogger.log(this.mLoggerLevel, str);
        } else {
            insertCacheLog(str);
        }
    }

    public synchronized void updateUrl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.liteav.base.logger.OnlineLoggerAndroid onlineLoggerAndroid = this.mOnlineLogger;
            if (onlineLoggerAndroid != null) {
                onlineLoggerAndroid.destroy();
            }
            this.mOnlineLogger = null;
            this.mIsInitted = false;
            this.mBusinessName = com.tencent.liteav.base.logger.OnlineLoggerAndroid.a.kLive;
            this.mSDkAppId = 0;
            this.mRoomId = "";
            this.mUserId = "";
            return;
        }
        try {
            java.lang.String decode = java.net.URLDecoder.decode(str, com.tencent.mapsdk.internal.rv.f51270c);
            com.tencent.liteav.base.logger.OnlineLoggerAndroid.a aVar = com.tencent.liteav.base.logger.OnlineLoggerAndroid.a.kLive;
            if (decode.startsWith(com.tencent.live2.impl.V2TXLiveUtils.TRTC_ADDRESS1) || decode.startsWith(com.tencent.live2.impl.V2TXLiveUtils.TRTC_ADDRESS2) || decode.startsWith("trtc://")) {
                aVar = com.tencent.liteav.base.logger.OnlineLoggerAndroid.a.kTRTC;
            }
            java.lang.String str2 = "0";
            java.lang.String str3 = "";
            java.lang.String str4 = "";
            if (decode.startsWith("rtmp")) {
                str3 = com.tencent.live2.jsplugin.LiveURLParser.getStreamId(decode);
                str4 = com.tencent.live2.jsplugin.LiveURLParser.getStreamId(decode);
            } else if (decode.startsWith("trtc://")) {
                str2 = com.tencent.live2.jsplugin.LiveURLParser.getURLParams(decode, "sdkappid");
                str4 = com.tencent.live2.jsplugin.LiveURLParser.getURLParams(decode, "userId");
                str3 = com.tencent.live2.jsplugin.LiveURLParser.getStreamId(decode);
            } else if (decode.startsWith("room://")) {
                str2 = com.tencent.live2.jsplugin.LiveURLParser.getURLParams(decode, "sdkappid");
                str3 = com.tencent.live2.jsplugin.LiveURLParser.getURLParams(decode, "roomid");
                str4 = com.tencent.live2.jsplugin.LiveURLParser.getURLParams(decode, "userid");
            }
            int parseInt = java.lang.Integer.parseInt(str2);
            if (checkNeedInit(aVar, parseInt, str3, str4)) {
                com.tencent.liteav.base.logger.OnlineLoggerAndroid onlineLoggerAndroid2 = this.mOnlineLogger;
                if (onlineLoggerAndroid2 != null) {
                    onlineLoggerAndroid2.destroy();
                    this.mOnlineLogger = null;
                }
                this.mBusinessName = aVar;
                this.mSDkAppId = parseInt;
                this.mRoomId = str3;
                this.mUserId = str4;
                this.mOnlineLogger = new com.tencent.liteav.base.logger.OnlineLoggerAndroid(aVar, parseInt, str3, str4);
                this.mIsInitted = true;
                reportCacheLog();
            }
        } catch (java.lang.Exception unused) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "updateUrl fail, url:".concat(java.lang.String.valueOf(str)));
        }
    }
}
