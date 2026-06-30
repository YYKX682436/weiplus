package wd2;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f526367a;

    /* renamed from: b, reason: collision with root package name */
    public final zl2.u4 f526368b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f526369c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f526370d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.RelativeLayout f526371e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f526372f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f526373g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f526374h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.FrameLayout f526375i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f526376j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f526377k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.TextView f526378l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.FrameLayout f526379m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f526380n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f526381o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f526382p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f526383q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f526384r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f526385s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f526386t;

    /* JADX WARN: Removed duplicated region for block: B:12:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.content.Context r11, boolean r12, zl2.u4 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wd2.g.<init>(android.content.Context, boolean, zl2.u4, boolean):void");
    }

    public final boolean a() {
        return this.f526367a.getResources().getConfiguration().orientation == 2;
    }

    public final void b(int i17) {
        android.view.View view;
        this.f526371e.setVisibility(i17);
        if (i17 != 0 || (view = this.f526381o) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c(android.graphics.drawable.Drawable drawable) {
        this.f526370d.setBackground(drawable);
    }

    public final void d(java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        boolean z17 = title.length() == 0;
        android.widget.TextView textView = this.f526376j;
        if (z17) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(title);
        textView.setVisibility(0);
        this.f526377k.setVisibility(8);
        this.f526378l.setVisibility(8);
    }

    public final void e(java.lang.String mainTitle, java.lang.String secondTitle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainTitle, "mainTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(secondTitle, "secondTitle");
        boolean z17 = mainTitle.length() == 0;
        android.widget.TextView textView = this.f526378l;
        android.widget.TextView textView2 = this.f526377k;
        if (!z17) {
            if (!(secondTitle.length() == 0)) {
                textView2.setText(mainTitle);
                textView2.setVisibility(0);
                textView.setText(secondTitle);
                textView.setVisibility(0);
                this.f526376j.setVisibility(8);
                return;
            }
        }
        textView2.setVisibility(8);
        textView.setVisibility(8);
    }

    public final void f(int i17) {
        android.widget.RelativeLayout relativeLayout = this.f526371e;
        int i18 = relativeLayout.getVisibility() == 0 ? relativeLayout.getLayoutParams().height : this.f526381o.getLayoutParams().height;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f526369c;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = y1Var.f293569r;
        if (c2690x46972046 != null && i17 > 0) {
            c2690x46972046.C(i17 + i18);
            c2690x46972046.D(3);
        }
        y1Var.s();
    }
}
