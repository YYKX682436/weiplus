package bv1;

/* loaded from: classes7.dex */
public abstract class c {
    public static final android.app.Notification a(android.content.Intent intent, java.lang.String title, java.lang.String content, java.lang.String tickerContent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tickerContent, "tickerContent");
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 47, intent, fp.g0.a(134217728));
        z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
        k0Var.m(tickerContent);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(title);
        k0Var.f550996g = activity;
        k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        k0Var.h(2, true);
        if (fp.h.a(16)) {
            android.app.Notification b17 = k0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
            return b17;
        }
        android.app.Notification b18 = k0Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "build(...)");
        return b18;
    }
}
