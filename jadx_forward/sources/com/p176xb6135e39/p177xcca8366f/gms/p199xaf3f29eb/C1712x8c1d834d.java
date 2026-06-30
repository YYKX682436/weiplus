package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* renamed from: com.google.android.gms.common.GooglePlayServicesUtil */
/* loaded from: classes13.dex */
public final class C1712x8c1d834d extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9 {

    /* renamed from: GMS_ERROR_DIALOG */
    public static final java.lang.String f5832x787fe651 = "GooglePlayServicesErrorDialog";

    /* renamed from: GOOGLE_PLAY_SERVICES_PACKAGE */
    @java.lang.Deprecated
    public static final java.lang.String f5833x1100896a = "com.google.android.gms";

    /* renamed from: GOOGLE_PLAY_SERVICES_VERSION_CODE */
    @java.lang.Deprecated
    public static final int f5834x7aedca50 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.f5840x7aedca50;

    /* renamed from: GOOGLE_PLAY_STORE_PACKAGE */
    public static final java.lang.String f5835x5fbc30a3 = "com.android.vending";

    private C1712x8c1d834d() {
    }

    @java.lang.Deprecated
    /* renamed from: getErrorDialog */
    public static android.app.Dialog m17654x7a665c3a(int i17, android.app.Activity activity, int i18) {
        return m17655x7a665c3a(i17, activity, i18, null);
    }

    @java.lang.Deprecated
    /* renamed from: getErrorPendingIntent */
    public static android.app.PendingIntent m17656xc1b32be1(int i17, android.content.Context context, int i18) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.m17641x9cf0d20b().mo17627x6703115(context, i17, i18);
    }

    @java.lang.Deprecated
    /* renamed from: getErrorString */
    public static java.lang.String m17657x94a1bf03(int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17674x94a1bf03(i17);
    }

    /* renamed from: getRemoteContext */
    public static android.content.Context m17658x14cfd6d3(android.content.Context context) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17676x14cfd6d3(context);
    }

    /* renamed from: getRemoteResource */
    public static android.content.res.Resources m17659x92a7476a(android.content.Context context) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17677x92a7476a(context);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    /* renamed from: isGooglePlayServicesAvailable */
    public static int m17660x402556f4(android.content.Context context) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17679x402556f4(context);
    }

    @java.lang.Deprecated
    /* renamed from: isUserRecoverableError */
    public static boolean m17662x19567a1f(int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17686x19567a1f(i17);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    /* renamed from: showErrorDialogFragment */
    public static boolean m17663x94f575a3(int i17, android.app.Activity activity, int i18) {
        return m17664x94f575a3(i17, activity, i18, null);
    }

    @java.lang.Deprecated
    /* renamed from: showErrorNotification */
    public static void m17666xd6620196(int i17, android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc m17618x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b();
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17682x244e0a07(context, i17) || com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17683xe90c3e0e(context, i17)) {
            m17618x9cf0d20b.zaf(context);
        } else {
            m17618x9cf0d20b.m17638xd6620196(context, i17);
        }
    }

    @java.lang.Deprecated
    /* renamed from: getErrorDialog */
    public static android.app.Dialog m17655x7a665c3a(int i17, android.app.Activity activity, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (true == com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17682x244e0a07(activity, i17)) {
            i17 = 18;
        }
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b().m17623x7a665c3a(activity, i17, i18, onCancelListener);
    }

    @java.lang.Deprecated
    /* renamed from: isGooglePlayServicesAvailable */
    public static int m17661x402556f4(android.content.Context context, int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17680x402556f4(context, i17);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    /* renamed from: showErrorDialogFragment */
    public static boolean m17664x94f575a3(int i17, android.app.Activity activity, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return m17665x94f575a3(i17, activity, null, i18, onCancelListener);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: showErrorDialogFragment */
    public static boolean m17665x94f575a3(int i17, android.app.Activity activity, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (true == com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17682x244e0a07(activity, i17)) {
            i17 = 18;
        }
        int i19 = i17;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc m17618x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b();
        if (componentCallbacksC1101xa17d4670 == null) {
            return m17618x9cf0d20b.m17636x94f575a3(activity, i19, i18, onCancelListener);
        }
        android.app.Dialog zaa = m17618x9cf0d20b.zaa(activity, i19, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zag.zac(componentCallbacksC1101xa17d4670, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b().mo17626x91cd42da(activity, i19, "d"), i18), onCancelListener, null);
        if (zaa == null) {
            return false;
        }
        m17618x9cf0d20b.zad(activity, zaa, f5832x787fe651, onCancelListener);
        return true;
    }
}
