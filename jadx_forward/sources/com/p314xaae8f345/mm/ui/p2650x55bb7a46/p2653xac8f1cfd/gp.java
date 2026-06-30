package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class gp extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f280652b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f280653c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f280654d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f280655e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f280656f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f280657g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f280658h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f280659i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f280660j;

    /* renamed from: k, reason: collision with root package name */
    public int f280661k;

    /* renamed from: l, reason: collision with root package name */
    public int f280662l;

    /* renamed from: m, reason: collision with root package name */
    public int f280663m;

    /* renamed from: n, reason: collision with root package name */
    public int f280664n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnPreDrawListener f280665o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(android.content.Context context, java.lang.String tipsText, boolean z17, android.view.View.OnClickListener onClickListener, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(context);
        onClickListener = (i17 & 8) != 0 ? null : onClickListener;
        z18 = (i17 & 16) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsText, "tipsText");
        this.f280652b = context;
        this.f280653c = z18;
        this.f280654d = jz5.h.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fp(this));
        this.f280660j = new int[]{0, 0};
        this.f280665o = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ep(this);
        setContentView(d().f335577a);
        setOutsideTouchable(!z18);
        if (onClickListener != null) {
            em.a0 d17 = d();
            if (d17.f335580d == null) {
                d17.f335580d = (android.widget.TextView) d17.f335577a.findViewById(com.p314xaae8f345.mm.R.id.voh);
            }
            android.widget.TextView textView = d17.f335580d;
            textView.setVisibility(0);
            textView.setText(tipsText);
            textView.setOnClickListener(onClickListener);
            em.a0 d18 = d();
            if (d18.f335581e == null) {
                d18.f335581e = (android.widget.TextView) d18.f335577a.findViewById(com.p314xaae8f345.mm.R.id.vok);
            }
            d18.f335581e.setVisibility(8);
        } else {
            em.a0 d19 = d();
            if (d19.f335580d == null) {
                d19.f335580d = (android.widget.TextView) d19.f335577a.findViewById(com.p314xaae8f345.mm.R.id.voh);
            }
            d19.f335580d.setVisibility(8);
            em.a0 d27 = d();
            if (d27.f335581e == null) {
                d27.f335581e = (android.widget.TextView) d27.f335577a.findViewById(com.p314xaae8f345.mm.R.id.vok);
            }
            android.widget.TextView textView2 = d27.f335581e;
            textView2.setVisibility(0);
            textView2.setText(tipsText);
        }
        em.a0 d28 = d();
        if (d28.f335579c == null) {
            d28.f335579c = (android.widget.LinearLayout) d28.f335577a.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
        }
        android.widget.LinearLayout linearLayout = d28.f335579c;
        if (!z17) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bp(this));
        }
    }

    public final void a() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.dismiss();
        android.view.View view = this.f280657g;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            if (!viewTreeObserver.isAlive()) {
                viewTreeObserver = null;
            }
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this.f280665o);
            }
        }
        this.f280657g = null;
        this.f280659i = false;
    }

    public final void b() {
        if (this.f280658h) {
            this.f280658h = false;
            this.f280659i = false;
            return;
        }
        yz5.a aVar = this.f280656f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        this.f280656f = null;
        getContentView().animate().alpha(0.0f).setDuration(300L).setInterpolator(ta5.h.f498412a.b()).withEndAction(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.dp
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gp.this.a();
            }
        }).start();
    }

    public final void c() {
        if (isShowing()) {
            yz5.a aVar = this.f280656f;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            this.f280656f = null;
            getContentView().animate().cancel();
            a();
        }
    }

    public final em.a0 d() {
        return (em.a0) this.f280654d.mo141623x754a37bb();
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        if (!isShowing() || this.f280659i) {
            return;
        }
        this.f280659i = true;
        android.view.View view = this.f280657g;
        if (view != null) {
            view.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.cp
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gp.this.b();
                }
            }, 50L);
        } else {
            b();
        }
    }
}
