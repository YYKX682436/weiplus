package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public abstract class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0.h3 f10642a = n0.n1.c(androidx.compose.ui.platform.u1.f10754d);

    /* renamed from: b, reason: collision with root package name */
    public static final n0.h3 f10643b = n0.n1.c(androidx.compose.ui.platform.v1.f10764d);

    /* renamed from: c, reason: collision with root package name */
    public static final n0.h3 f10644c = n0.n1.c(androidx.compose.ui.platform.w1.f10783d);

    /* renamed from: d, reason: collision with root package name */
    public static final n0.h3 f10645d = n0.n1.c(androidx.compose.ui.platform.x1.f10809d);

    /* renamed from: e, reason: collision with root package name */
    public static final n0.h3 f10646e = n0.n1.c(androidx.compose.ui.platform.y1.f10819d);

    /* renamed from: f, reason: collision with root package name */
    public static final n0.h3 f10647f = n0.n1.c(androidx.compose.ui.platform.z1.f10830d);

    /* renamed from: g, reason: collision with root package name */
    public static final n0.h3 f10648g = n0.n1.c(androidx.compose.ui.platform.b2.f10514d);

    /* renamed from: h, reason: collision with root package name */
    public static final n0.h3 f10649h = n0.n1.c(androidx.compose.ui.platform.a2.f10508d);

    /* renamed from: i, reason: collision with root package name */
    public static final n0.h3 f10650i = n0.n1.c(androidx.compose.ui.platform.c2.f10531d);

    /* renamed from: j, reason: collision with root package name */
    public static final n0.h3 f10651j = n0.n1.c(androidx.compose.ui.platform.d2.f10537d);

    /* renamed from: k, reason: collision with root package name */
    public static final n0.h3 f10652k = n0.n1.c(androidx.compose.ui.platform.e2.f10552d);

    /* renamed from: l, reason: collision with root package name */
    public static final n0.h3 f10653l = n0.n1.c(androidx.compose.ui.platform.g2.f10565d);

    /* renamed from: m, reason: collision with root package name */
    public static final n0.h3 f10654m = n0.n1.c(androidx.compose.ui.platform.h2.f10576d);

    /* renamed from: n, reason: collision with root package name */
    public static final n0.h3 f10655n = n0.n1.c(androidx.compose.ui.platform.i2.f10599d);

    /* renamed from: o, reason: collision with root package name */
    public static final n0.h3 f10656o = n0.n1.c(androidx.compose.ui.platform.j2.f10613d);

    /* renamed from: p, reason: collision with root package name */
    public static final n0.h3 f10657p = n0.n1.c(androidx.compose.ui.platform.k2.f10619d);

    /* renamed from: q, reason: collision with root package name */
    public static final n0.h3 f10658q = n0.n1.c(androidx.compose.ui.platform.f2.f10561d);

    public static final void a(u1.r1 owner, androidx.compose.ui.platform.f4 uriHandler, yz5.p content, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(uriHandler, "uriHandler");
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(874662829);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(owner) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(uriHandler) ? 32 : 16;
        }
        if ((i17 & ce1.h.CTRL_INDEX) == 0) {
            i18 |= y0Var.e(content) ? 256 : 128;
        }
        if ((i18 & 731) == 146 && y0Var.v()) {
            y0Var.O();
        } else {
            n0.i3 b17 = f10642a.b(owner.getAccessibilityManager());
            n0.i3 b18 = f10643b.b(owner.getAutofill());
            n0.i3 b19 = f10644c.b(owner.getAutofillTree());
            n0.i3 b27 = f10645d.b(owner.getClipboardManager());
            n0.i3 b28 = f10646e.b(owner.getDensity());
            n0.i3 b29 = f10647f.b(owner.getFocusManager());
            n0.h3 h3Var = f10648g;
            f2.f fontLoader = owner.getFontLoader();
            h3Var.getClass();
            n0.i3 i3Var = new n0.i3(h3Var, fontLoader, false);
            n0.h3 h3Var2 = f10649h;
            f2.g fontFamilyResolver = owner.getFontFamilyResolver();
            h3Var2.getClass();
            n0.n1.a(new n0.i3[]{b17, b18, b19, b27, b28, b29, i3Var, new n0.i3(h3Var2, fontFamilyResolver, false), f10650i.b(owner.getHapticFeedBack()), f10651j.b(owner.getInputModeManager()), f10652k.b(owner.getLayoutDirection()), f10653l.b(owner.getTextInputService()), f10654m.b(owner.getTextToolbar()), f10655n.b(uriHandler), f10656o.b(owner.getViewConfiguration()), f10657p.b(owner.getWindowInfo()), f10658q.b(owner.getPointerIconService())}, content, y0Var, ((i18 >> 3) & 112) | 8);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new androidx.compose.ui.platform.l2(owner, uriHandler, content, i17);
    }

    public static final java.lang.Void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
