package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* renamed from: com.google.android.gms.common.util.PlatformVersion */
/* loaded from: classes13.dex */
public final class C2006x32c52cc5 {
    private C2006x32c52cc5() {
    }

    /* renamed from: isAtLeastHoneycomb */
    public static boolean m18593xab76fcb0() {
        return true;
    }

    /* renamed from: isAtLeastHoneycombMR1 */
    public static boolean m18594x8ba8b07c() {
        return true;
    }

    /* renamed from: isAtLeastIceCreamSandwich */
    public static boolean m18595x123cc09e() {
        return true;
    }

    /* renamed from: isAtLeastIceCreamSandwichMR1 */
    public static boolean m18596x4bd43dce() {
        return true;
    }

    /* renamed from: isAtLeastJellyBean */
    public static boolean m18597x674a68a2() {
        return true;
    }

    /* renamed from: isAtLeastJellyBeanMR1 */
    public static boolean m18598xc07674a() {
        return true;
    }

    /* renamed from: isAtLeastJellyBeanMR2 */
    public static boolean m18599xc07674b() {
        return true;
    }

    /* renamed from: isAtLeastKitKat */
    public static boolean m18600x48a37bb4() {
        return true;
    }

    /* renamed from: isAtLeastKitKatWatch */
    public static boolean m18601xc171897b() {
        return true;
    }

    /* renamed from: isAtLeastLollipop */
    public static boolean m18602x4727d397() {
        return true;
    }

    /* renamed from: isAtLeastLollipopMR1 */
    public static boolean m18603x73a91c35() {
        return true;
    }

    /* renamed from: isAtLeastM */
    public static boolean m18604xacc9ec61() {
        return true;
    }

    /* renamed from: isAtLeastN */
    public static boolean m18605xacc9ec62() {
        return true;
    }

    /* renamed from: isAtLeastO */
    public static boolean m18606xacc9ec63() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: isAtLeastP */
    public static boolean m18607xacc9ec64() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: isAtLeastQ */
    public static boolean m18608xacc9ec65() {
        return android.os.Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: isAtLeastR */
    public static boolean m18609xacc9ec66() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: isAtLeastS */
    public static boolean m18610xacc9ec67() {
        return android.os.Build.VERSION.SDK_INT >= 31;
    }

    /* renamed from: isAtLeastSv2 */
    public static boolean m18611xa2007d23() {
        return android.os.Build.VERSION.SDK_INT >= 32;
    }

    /* renamed from: isAtLeastT */
    public static boolean m18612xacc9ec68() {
        return android.os.Build.VERSION.SDK_INT >= 33;
    }

    /* renamed from: isAtLeastU */
    public static boolean m18613xacc9ec69() {
        if (m18612xacc9ec68()) {
            return j3.b.c();
        }
        return false;
    }

    /* renamed from: isAtLeastV */
    public static boolean m18614xacc9ec6a() {
        if (!m18613xacc9ec69()) {
            return false;
        }
        int i17 = j3.b.f378865a;
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return false;
        }
        java.lang.String CODENAME = android.os.Build.VERSION.CODENAME;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CODENAME, "CODENAME");
        return j3.b.a("VanillaIceCream", CODENAME);
    }
}
