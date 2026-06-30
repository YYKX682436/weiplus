package k95;

/* loaded from: classes12.dex */
public abstract class b {
    public static boolean a(android.app.Activity activity) {
        java.lang.String name = activity.getClass().getName();
        return (name.startsWith("com.tencent.mm.splash.") || name.equals("com.tencent.mm.app.WeChatSplashActivity") || name.equals("com.tencent.mm.app.WeChatSplashFallbackActivity")) ? false : true;
    }
}
