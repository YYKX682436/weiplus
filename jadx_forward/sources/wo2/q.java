package wo2;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f529648a;

    /* renamed from: b, reason: collision with root package name */
    public final int f529649b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f529650c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f529651d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f529652e;

    public q(oa.i tab, int i17) {
        android.widget.ImageView imageView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        this.f529648a = tab;
        this.f529649b = i17;
        jz5.g b17 = jz5.h.b(new wo2.o(this));
        jz5.g b18 = jz5.h.b(new wo2.p(this));
        tab.f425311a = this;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f17 = (displayMetrics.density * 15.0f) / context.getResources().getDisplayMetrics().density;
        if (i17 != 1006) {
            switch (i17) {
                case 1001:
                    tab.c(com.p314xaae8f345.mm.R.C30864xbddafb2a.c6d);
                    android.widget.TextView textView = ((ap2.b) ((jz5.n) b17).mo141623x754a37bb()).f94311c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                    this.f529650c = textView;
                    android.widget.ImageView imageView2 = ((ap2.b) ((jz5.n) b17).mo141623x754a37bb()).f94310b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
                    this.f529652e = imageView2;
                    imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f79236x2de5f313);
                    textView.setTextSize(1, f17);
                    return;
                case 1002:
                    break;
                case 1003:
                    tab.c(com.p314xaae8f345.mm.R.C30864xbddafb2a.c6e);
                    ap2.c cVar = (ap2.c) ((jz5.n) b18).mo141623x754a37bb();
                    android.widget.TextView textView2 = cVar != null ? cVar.f94314c : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
                    this.f529650c = textView2;
                    textView2.setTextSize(1, f17);
                    ap2.c cVar2 = (ap2.c) ((jz5.n) b18).mo141623x754a37bb();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = cVar2 != null ? cVar2.f94315d : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
                    this.f529651d = c22699x3dcdb352;
                    ap2.c cVar3 = (ap2.c) ((jz5.n) b18).mo141623x754a37bb();
                    imageView = cVar3 != null ? cVar3.f94313b : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                    this.f529652e = imageView;
                    if (((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).wi()) {
                        c22699x3dcdb352.setVisibility(4);
                        return;
                    } else {
                        c22699x3dcdb352.setVisibility(0);
                        return;
                    }
                default:
                    tab.c(com.p314xaae8f345.mm.R.C30864xbddafb2a.aka);
                    return;
            }
        }
        tab.c(com.p314xaae8f345.mm.R.C30864xbddafb2a.c6d);
        ap2.b bVar = (ap2.b) ((jz5.n) b17).mo141623x754a37bb();
        android.widget.TextView textView3 = bVar != null ? bVar.f94311c : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        this.f529650c = textView3;
        ap2.b bVar2 = (ap2.b) ((jz5.n) b17).mo141623x754a37bb();
        imageView = bVar2 != null ? bVar2.f94310b : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        this.f529652e = imageView;
        textView3.setTextSize(1, f17);
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f529650c;
        if (textView != null) {
            if (z17) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView.getPaint().setFakeBoldText(false);
                textView.getPaint().setStrokeWidth(0.0f);
            }
        }
    }
}
