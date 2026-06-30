package org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382;

/* renamed from: org.chromium.base.compat.ApiHelperForO */
/* loaded from: classes13.dex */
public final class C29392xdcec370e {
    private C29392xdcec370e() {
    }

    /* renamed from: addItem */
    public static void m152817xbb852f54(android.content.ClipData clipData, android.content.ContentResolver contentResolver, android.content.ClipData.Item item) {
        clipData.addItem(contentResolver, item);
    }

    /* renamed from: areAnimatorsEnabled */
    public static boolean m152818x5f4e35a9() {
        return android.animation.ValueAnimator.areAnimatorsEnabled();
    }

    /* renamed from: cancelAutofillSession */
    public static void m152819x36c610aa(android.app.Activity activity) {
        android.view.autofill.AutofillManager autofillManager = (android.view.autofill.AutofillManager) activity.getSystemService(android.view.autofill.AutofillManager.class);
        if (autofillManager != null) {
            autofillManager.cancel();
        }
    }

    /* renamed from: createContextForSplit */
    public static android.content.Context m152820x2afe2e04(android.content.Context context, java.lang.String str) {
        org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152645xccdf4b7 = org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3.m152645xccdf4b7();
        try {
            android.content.Context createContextForSplit = context.createContextForSplit(str);
            if (m152645xccdf4b7 != null) {
                m152645xccdf4b7.close();
            }
            return createContextForSplit;
        } catch (java.lang.Throwable th6) {
            if (m152645xccdf4b7 != null) {
                try {
                    m152645xccdf4b7.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: getNotificationChannelId */
    public static java.lang.String m152821x4387931d(android.app.Notification notification) {
        return notification.getChannelId();
    }

    /* renamed from: getTimestamp */
    public static long m152822x2b69a60(android.content.ClipDescription clipDescription) {
        return clipDescription.getTimestamp();
    }

    /* renamed from: isInstantApp */
    public static boolean m152823xb736014a(android.content.pm.PackageManager packageManager) {
        return packageManager.isInstantApp();
    }

    /* renamed from: isScreenWideColorGamut */
    public static boolean m152824x86ce0218(android.content.res.Configuration configuration) {
        return configuration.isScreenWideColorGamut();
    }

    /* renamed from: isWideColorGamut */
    public static boolean m152825xfa77220c(android.view.Display display) {
        return display.isWideColorGamut();
    }

    /* renamed from: notifyValueChangedForAutofill */
    public static void m152826x2e6a1a0f(android.view.View view) {
        android.view.autofill.AutofillManager autofillManager = (android.view.autofill.AutofillManager) view.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        if (autofillManager != null) {
            autofillManager.notifyValueChanged(view);
        }
    }

    /* renamed from: registerDefaultNetworkCallback */
    public static void m152827x9fae3695(android.net.ConnectivityManager connectivityManager, android.net.ConnectivityManager.NetworkCallback networkCallback, android.os.Handler handler) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback, handler);
    }

    /* renamed from: registerReceiver */
    public static android.content.Intent m152828xc20729b2(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i17) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i17);
    }

    /* renamed from: setChannelId */
    public static android.app.Notification.Builder m152829xb2e1833c(android.app.Notification.Builder builder, java.lang.String str) {
        return builder.setChannelId(str);
    }

    /* renamed from: setColorMode */
    public static void m152830xd1d0a564(android.view.Window window, int i17) {
        window.setColorMode(i17);
    }

    /* renamed from: setDefaultFocusHighlightEnabled */
    public static void m152831xb04972a6(android.view.View view, boolean z17) {
        view.setDefaultFocusHighlightEnabled(z17);
    }

    /* renamed from: setTimeoutAfter */
    public static android.app.Notification.Builder m152832xa95e8a7d(android.app.Notification.Builder builder, long j17) {
        return builder.setTimeoutAfter(j17);
    }
}
