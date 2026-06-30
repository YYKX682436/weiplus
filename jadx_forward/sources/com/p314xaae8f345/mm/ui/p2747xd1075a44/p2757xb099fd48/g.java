package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes7.dex */
public abstract class g {
    public static void a(android.app.Dialog dialog, java.lang.String str) {
        try {
            android.os.Message message = (android.os.Message) d56.b.h(dialog).f(str);
            if (message != null) {
                message.recycle();
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            d56.b.h(dialog).k(str, null);
        } catch (java.lang.Exception unused2) {
        }
    }

    public static void b(android.app.Dialog dialog) {
        a(dialog, "mCancelMessage");
        a(dialog, "mDismissMessage");
        a(dialog, "mShowMessage");
        try {
            dialog.setOnCancelListener(null);
        } catch (java.lang.Exception unused) {
        }
        try {
            dialog.setOnDismissListener(null);
        } catch (java.lang.Exception unused2) {
        }
        try {
            dialog.setOnShowListener(null);
        } catch (java.lang.Exception unused3) {
        }
    }
}
