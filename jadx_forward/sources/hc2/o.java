package hc2;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f361868a = jz5.h.b(hc2.m.f361863d);

    public static final void a(android.widget.TextView textView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), z17 ? "fonts/WeChatSansSS-Medium.ttf" : "fonts/WeChatSansStd-Medium.ttf"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderExt", "setTypeface() Exception:" + e17.getMessage());
        }
    }

    public static final void b(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), "fonts/WeChatSansStd-Regular.ttf"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderExt", "setTypeface() Exception:" + e17.getMessage());
        }
    }
}
