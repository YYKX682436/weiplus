package com.tencent.mm.app;

/* loaded from: classes16.dex */
final class GPAppInlineFence extends android.os.Handler {
    private final com.tencent.tinker.entry.ApplicationLike mAppLike;

    private GPAppInlineFence(com.tencent.tinker.entry.ApplicationLike applicationLike) {
        this.mAppLike = applicationLike;
    }

    private static void dummyThrowExceptionMethod() {
        if ((java.lang.System.currentTimeMillis() & 2147483647L) < 0) {
            throw new java.lang.RuntimeException();
        }
    }

    private void handleMessageImpl(android.os.Message message) {
        switch (message.what) {
            case 1:
                this.mAppLike.onBaseContextAttached((android.content.Context) message.obj);
                return;
            case 2:
                this.mAppLike.onCreate();
                return;
            case 3:
                this.mAppLike.onConfigurationChanged((android.content.res.Configuration) message.obj);
                return;
            case 4:
                this.mAppLike.onTrimMemory(((java.lang.Integer) message.obj).intValue());
                return;
            case 5:
                this.mAppLike.onLowMemory();
                return;
            case 6:
                this.mAppLike.onTerminate();
                return;
            case 7:
                message.obj = this.mAppLike.getClassLoader((java.lang.ClassLoader) message.obj);
                return;
            case 8:
                message.obj = this.mAppLike.getBaseContext((android.content.Context) message.obj);
                return;
            case 9:
                message.obj = this.mAppLike.getAssets((android.content.res.AssetManager) message.obj);
                return;
            case 10:
                message.obj = this.mAppLike.getResources((android.content.res.Resources) message.obj);
                return;
            case 11:
                java.lang.Object[] objArr = (java.lang.Object[]) message.obj;
                message.obj = this.mAppLike.getSystemService((java.lang.String) objArr[0], objArr[1]);
                return;
            case 12:
                message.obj = java.lang.Integer.valueOf(this.mAppLike.mzNightModeUseOf());
                return;
            default:
                throw new java.lang.IllegalStateException("Should not be here.");
        }
    }

    private void handleMessage_$noinline$(android.os.Message message) {
        try {
            dummyThrowExceptionMethod();
        } finally {
            handleMessageImpl(message);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        handleMessage_$noinline$(message);
    }
}
