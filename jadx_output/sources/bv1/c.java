package bv1;

/* loaded from: classes7.dex */
public abstract class c {
    public static final android.app.Notification a(android.content.Intent intent, java.lang.String title, java.lang.String content, java.lang.String tickerContent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(tickerContent, "tickerContent");
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 47, intent, fp.g0.a(134217728));
        z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
        k0Var.m(tickerContent);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(title);
        k0Var.f469463g = activity;
        k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
        k0Var.h(2, true);
        if (fp.h.a(16)) {
            android.app.Notification b17 = k0Var.b();
            kotlin.jvm.internal.o.f(b17, "build(...)");
            return b17;
        }
        android.app.Notification b18 = k0Var.b();
        kotlin.jvm.internal.o.f(b18, "build(...)");
        return b18;
    }
}
