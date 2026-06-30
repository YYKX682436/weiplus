package wk3;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final wk3.a f528490a = new wk3.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f528491b = kz5.o1.c("com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI");

    public final int a(int i17) {
        if (i17 == 1) {
            return com.p314xaae8f345.mm.R.raw.f78638xdc982204;
        }
        if (i17 == 2) {
            return com.p314xaae8f345.mm.R.raw.f80478xe39dc57;
        }
        if (i17 == 3) {
            return com.p314xaae8f345.mm.R.raw.f79121x9520e9b4;
        }
        if (i17 == 4) {
            return com.p314xaae8f345.mm.R.raw.f79391x63a94cb;
        }
        if (i17 == 8) {
            return com.p314xaae8f345.mm.R.raw.f80724x2c2ce30;
        }
        if (i17 == 29) {
            return com.p314xaae8f345.mm.R.raw.f78560xed91b7d6;
        }
        if (i17 == 30) {
            return com.p314xaae8f345.mm.R.raw.f81006x4a000405;
        }
        switch (i17) {
            case 22:
            case 25:
                return com.p314xaae8f345.mm.R.raw.f78765x517d1a2d;
            case 23:
                return com.p314xaae8f345.mm.R.raw.f80699x4a9ebf82;
            case 24:
                return com.p314xaae8f345.mm.R.raw.f78566x9f6813fe;
            case 26:
                return com.p314xaae8f345.mm.R.raw.f78650x47839927;
            case 27:
                return com.p314xaae8f345.mm.R.raw.f80724x2c2ce30;
            default:
                return com.p314xaae8f345.mm.R.raw.f80478xe39dc57;
        }
    }

    public final int b(int i17) {
        if (i17 == 1) {
            return com.p314xaae8f345.mm.R.raw.f78638xdc982204;
        }
        if (i17 == 2) {
            return com.p314xaae8f345.mm.R.raw.f79775xc850a312;
        }
        if (i17 == 3) {
            return com.p314xaae8f345.mm.R.raw.f78683x36757420;
        }
        if (i17 == 4) {
            return com.p314xaae8f345.mm.R.raw.f79702x463eaa2;
        }
        if (i17 == 8) {
            return com.p314xaae8f345.mm.R.raw.f80723x46addc4e;
        }
        if (i17 == 29) {
            return com.p314xaae8f345.mm.R.raw.f78559xeb2825e8;
        }
        if (i17 == 30) {
            return com.p314xaae8f345.mm.R.raw.f81003x40b817d9;
        }
        switch (i17) {
            case 22:
            case 25:
                return com.p314xaae8f345.mm.R.raw.f79664x14f92eb;
            case 23:
                return com.p314xaae8f345.mm.R.raw.f80686x61c578bc;
            case 24:
                return com.p314xaae8f345.mm.R.raw.f78565x93b231eb;
            case 26:
                return com.p314xaae8f345.mm.R.raw.f79537x4cbbcadf;
            case 27:
                return com.p314xaae8f345.mm.R.raw.f80723x46addc4e;
            default:
                return com.p314xaae8f345.mm.R.raw.f79775xc850a312;
        }
    }

    public final java.lang.CharSequence c(android.widget.TextView tv6, java.lang.CharSequence spanText, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanText, "spanText");
        android.content.Context context = tv6.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int b17 = i65.a.b(context, (i17 * 12) + 1);
        android.content.Context context2 = tv6.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        int b18 = i65.a.b(context2, ((i17 + 1) * 12) + 1);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(spanText, 0, spanText.length(), tv6.getPaint(), b17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (new android.text.StaticLayout(spanText, 0, spanText.length(), tv6.getPaint(), b18, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
            return spanText;
        }
        int lineEnd = staticLayout.getLineEnd(0);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context3 = tv6.getContext();
        java.lang.String substring = spanText.toString().substring(0, lineEnd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        java.lang.String concat = substring.concat("...");
        ((ke0.e) xVar).getClass();
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context3, concat);
    }
}
