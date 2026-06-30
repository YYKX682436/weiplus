package com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6;

/* renamed from: com.tencent.youtu.ytcommon.YTCommonExInterface */
/* loaded from: classes14.dex */
public class C27955x4b473500 {
    private static final java.lang.String TAG = "YTUtilityInterface";

    /* renamed from: VERSION */
    public static final java.lang.String f62576x3fc0a8b8 = "3.2.3";

    /* renamed from: commonSoInitAuth */
    protected static java.lang.reflect.Method f62577xcc5de19f;

    /* renamed from: mBusinessCode */
    private static int f62578x6f741ada;

    /* renamed from: com.tencent.youtu.ytcommon.YTCommonExInterface$BUSINESS_CODE */
    /* loaded from: classes14.dex */
    public interface BUSINESS_CODE {

        /* renamed from: YT_COMMON */
        public static final int f62579xb9ef6b8f = 0;

        /* renamed from: YT_WX */
        public static final int f62580x50dca85 = 1;
    }

    /* renamed from: getBusinessCode */
    public static int m121208x38d19443() {
        return f62578x6f741ada;
    }

    /* renamed from: setAppBrightness */
    public static float m121209xcf163010(android.app.Activity activity, int i17) {
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.i(TAG, "[YTUtilityInterface.setAppBrightness] brightness: " + i17);
        float f17 = -1.0f;
        try {
            if (!activity.isDestroyed() && !activity.isFinishing()) {
                android.view.Window window = activity.getWindow();
                android.view.WindowManager.LayoutParams attributes = window.getAttributes();
                if (i17 == -1) {
                    attributes.screenBrightness = -1.0f;
                } else {
                    if (i17 <= 0) {
                        i17 = 1;
                    }
                    attributes.screenBrightness = i17 / 255.0f;
                }
                f17 = attributes.screenBrightness;
                window.setAttributes(attributes);
                return f17;
            }
            return -1.0f;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.e(TAG, "set appbrightness failed :" + e17.getLocalizedMessage());
            return f17;
        }
    }

    /* renamed from: setBusinessCode */
    public static void m121210x6f1a8f4f(int i17) {
        f62578x6f741ada = i17;
    }

    /* renamed from: setIsEnabledLog */
    public static void m121211x8985d68f(boolean z17) {
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.m121274x8985d68f(z17);
    }

    /* renamed from: setIsEnabledNativeLog */
    public static void m121212x77ac9eb8(boolean z17) {
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.m121275x77ac9eb8(z17);
    }

    /* renamed from: setLogger */
    public static void m121213x16e44c92(com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.IFaceLiveLogger iFaceLiveLogger) {
        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27963xd0ec8b.m121276xca027b82(iFaceLiveLogger);
    }
}
