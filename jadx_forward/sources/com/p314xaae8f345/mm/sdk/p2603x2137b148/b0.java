package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f274000a;

    /* renamed from: b, reason: collision with root package name */
    public static long f274001b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.CharSequence f274002c;

    public static java.lang.CharSequence a() {
        return b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    public static java.lang.CharSequence b(android.content.Context context) {
        android.content.ClipData.Item itemAt;
        if (java.lang.System.currentTimeMillis() - f274001b < 1000 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(f274002c)) {
            return f274002c;
        }
        f274001b = java.lang.System.currentTimeMillis();
        android.content.ClipData primaryClip = ((android.content.ClipboardManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("clipboard")).getPrimaryClip();
        java.lang.CharSequence text = (primaryClip == null || primaryClip.getItemCount() <= 0 || (itemAt = primaryClip.getItemAt(0)) == null) ? null : itemAt.getText();
        f274002c = text;
        if (text != null) {
            return text;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ClipboardHelper", "getText null");
        return "";
    }

    public static boolean c(java.lang.CharSequence charSequence) {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence) || f274000a == 0 || charSequence.toString().hashCode() != f274000a) ? false : true;
    }

    public static void d(android.content.Context context, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str) {
        f274001b = 0L;
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("clipboard");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(charSequence, charSequence2));
        } else {
            clipboardManager.setPrimaryClip(android.content.ClipData.newHtmlText(charSequence, charSequence2, str));
        }
        if (charSequence2 != null) {
            f274000a = charSequence2.toString().hashCode();
        }
    }

    public static void e(java.lang.CharSequence charSequence) {
        d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, null, charSequence, null);
    }

    public static boolean f(java.lang.CharSequence charSequence) {
        try {
            d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, null, charSequence, null);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ClipboardHelper", th6, "", new java.lang.Object[0]);
            return false;
        }
    }
}
