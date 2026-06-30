package v61;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v61.g0 f514974a = new v61.g0(null);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f514975b = kz5.c0.i("es-419", "pt", "zh_TW", "zh_HK", "en", "ja", "ko", "th", "vi", dm.i4.f66865x76d1ec5a);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f514976c = kz5.c1.k(new jz5.l("es-419", "Español"), new jz5.l("pt", "Português"), new jz5.l("zh-TW", "中文(国语) "), new jz5.l("zh-HK", "中文(粵語)"), new jz5.l("en", "English"), new jz5.l("ja", "日本語"), new jz5.l("ko", "한국어"), new jz5.l("th", "ภาษาไทย"), new jz5.l("vi", "Tiếng Việt"), new jz5.l(dm.i4.f66865x76d1ec5a, "Bahasa Indonesia"));

    static {
        kz5.c1.k(new jz5.l("+86", "中文(国语) "), new jz5.l("+886", "中文(国语)"), new jz5.l("+852", "中文(粵語)"), new jz5.l("+853", "中文(粵語)"), new jz5.l("+81", "日本語"), new jz5.l("+82", "한국어"), new jz5.l("+66", "ภาษาไทย"), new jz5.l("+84", "Tiếng Việt"), new jz5.l("+62", "Bahasa Indonesia"), new jz5.l("+55", "Português"), new jz5.l("es-+34", "Español"));
    }

    public static final void a(android.view.View loginAsOtherDeviceBtn, p012xc85e97e9.p093xedfae76a.y yVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loginAsOtherDeviceBtn, "loginAsOtherDeviceBtn");
        if (!com.p314xaae8f345.mm.ui.bk.A() && !com.p314xaae8f345.mm.ui.bk.Q()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(loginAsOtherDeviceBtn, arrayList.toArray(), "com/tencent/mm/plugin/account/model/LoginUtil$Companion", "updateLoginAsExdevice", "(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loginAsOtherDeviceBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(loginAsOtherDeviceBtn, "com/tencent/mm/plugin/account/model/LoginUtil$Companion", "updateLoginAsExdevice", "(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.String BRAND = android.os.Build.BRAND;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(BRAND, "BRAND");
        java.util.Locale locale = java.util.Locale.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = BRAND.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        v65.i.b(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("aspad", yVar, 1), null, new c01.i1(new v61.f0(loginAsOtherDeviceBtn), lowerCase, wo.w0.m() + android.os.Build.CPU_ABI, null), 1, null);
    }
}
