package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06;

/* loaded from: classes11.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f232456a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f232457b;

    /* renamed from: c, reason: collision with root package name */
    public final int f232458c;

    /* renamed from: d, reason: collision with root package name */
    public final int f232459d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f232460e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f232461f;

    /* renamed from: g, reason: collision with root package name */
    public ll3.h1 f232462g;

    /* renamed from: h, reason: collision with root package name */
    public int f232463h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.v f232464i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.z f232465j;

    public a0(android.content.Context context, android.view.View rootView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f232456a = context;
        this.f232457b = rootView;
        this.f232458c = i17;
        this.f232459d = i18;
        this.f232460e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.w(this));
        this.f232461f = new java.util.ArrayList();
        this.f232463h = -1;
        this.f232464i = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.v();
        this.f232465j = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.z(this);
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.a0 a0Var, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de;
        int i18 = a0Var.f232463h;
        ll3.h1 h1Var = a0Var.f232462g;
        if (h1Var != null) {
            i18 = h1Var.a(i17);
        }
        if (i18 != a0Var.f232463h && i18 >= 0 && (c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) a0Var.b().mo7951xfd37656d()) != null) {
            int w17 = c1162x665295de.w();
            int y17 = c1162x665295de.y();
            a0Var.b().f1();
            if (a0Var.b().mo7951xfd37656d() instanceof com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.C16661xe4b4559e) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = a0Var.b().mo7946xf939df19();
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.t tVar = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.t ? (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.t) mo7946xf939df19 : null;
                if (tVar != null && tVar.f232496e == 1) {
                    tVar.f232498g = i18;
                    tVar.m8147xed6e4d18(i18);
                    tVar.m8147xed6e4d18(i18 - 1);
                }
            }
            if (i18 <= y17 + 1 && w17 - 1 <= i18) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 b17 = a0Var.b();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricManager", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                b17.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(b17, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricManager", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 b18 = a0Var.b();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(b18, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricManager", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                b18.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(b18, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricManager", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        a0Var.f232463h = i18;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 b() {
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) this.f232460e).mo141623x754a37bb();
    }
}
