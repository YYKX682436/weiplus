package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public abstract class x7 {
    public static final void a(android.app.Dialog dialog, android.content.Context context) {
        android.view.WindowManager.LayoutParams attributes;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int b17 = b(context);
        android.view.Window window = dialog.getWindow();
        if (window == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        attributes.width = b17;
        attributes.gravity = 1;
    }

    public static final int b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return java.lang.Math.min(com.p314xaae8f345.mm.ui.bl.b(context).y, com.p314xaae8f345.mm.ui.bl.b(context).x);
    }
}
