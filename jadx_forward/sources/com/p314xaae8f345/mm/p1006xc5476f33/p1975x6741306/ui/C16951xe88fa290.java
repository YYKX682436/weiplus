package com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarStateView;", "Landroid/widget/RelativeLayout;", "Lps3/e;", "d", "Lps3/e;", "getState", "()Lps3/e;", "setState", "(Lps3/e;)V", "state", "Landroid/view/animation/Animation;", "g", "Ljz5/g;", "getSlideOutAnim", "()Landroid/view/animation/Animation;", "slideOutAnim", "h", "getSlideInAnim", "slideInAnim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarStateView */
/* loaded from: classes8.dex */
public final class C16951xe88fa290 extends android.widget.RelativeLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f236544m = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ps3.e state;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236546e;

    /* renamed from: f, reason: collision with root package name */
    public final qs3.f0 f236547f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g slideOutAnim;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g slideInAnim;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f236550i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16951xe88fa290(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.state = ps3.e.f439609d;
        this.f236546e = true;
        this.f236547f = new qs3.f0(this);
        this.slideOutAnim = jz5.h.b(new qs3.e0(this));
        this.slideInAnim = jz5.h.b(new qs3.c0(this));
    }

    /* renamed from: getSlideInAnim */
    private final android.view.animation.Animation m67808x9129d0b1() {
        java.lang.Object mo141623x754a37bb = this.slideInAnim.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.animation.Animation) mo141623x754a37bb;
    }

    /* renamed from: getSlideOutAnim */
    private final android.view.animation.Animation m67809xe021e204() {
        java.lang.Object mo141623x754a37bb = this.slideOutAnim.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.animation.Animation) mo141623x754a37bb;
    }

    public final void a() {
        if (this.f236550i == null) {
            this.f236550i = new android.widget.ImageView(getContext());
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.setMargins(0, 0, i65.a.b(getContext(), 5), i65.a.b(getContext(), 2));
            android.widget.ImageView imageView = this.f236550i;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            addView(this.f236550i);
        }
    }

    public final void b() {
        if (this.f236546e) {
            a();
            d();
            startAnimation(m67808x9129d0b1());
        }
    }

    public final void c() {
        if (this.f236546e) {
            a();
            d();
            startAnimation(m67809xe021e204());
        }
    }

    public final void d() {
        java.util.Objects.toString(this.state);
        if (!this.f236546e) {
            setVisibility(8);
            return;
        }
        int ordinal = this.state.ordinal();
        if (ordinal == 0) {
            setVisibility(8);
            return;
        }
        if (ordinal == 1) {
            setBackgroundResource(com.p314xaae8f345.mm.R.raw.f80927x40a73d0c);
            android.widget.ImageView imageView = this.f236550i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80931x8422a90f);
            setVisibility(0);
            return;
        }
        if (ordinal == 2) {
            setBackgroundResource(com.p314xaae8f345.mm.R.raw.f80928xfdc4e47f);
            android.widget.ImageView imageView2 = this.f236550i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
            imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f80930xd52c9da);
            setVisibility(0);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        setBackgroundResource(com.p314xaae8f345.mm.R.raw.f80928xfdc4e47f);
        android.widget.ImageView imageView3 = this.f236550i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView3);
        imageView3.setImageResource(com.p314xaae8f345.mm.R.raw.f80929xd52c8ff);
        setVisibility(0);
    }

    public final ps3.e getState() {
        return this.state;
    }

    /* renamed from: setState */
    public final void m67811x53b6854f(ps3.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<set-?>");
        this.state = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16951xe88fa290(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.state = ps3.e.f439609d;
        this.f236546e = true;
        this.f236547f = new qs3.f0(this);
        this.slideOutAnim = jz5.h.b(new qs3.e0(this));
        this.slideInAnim = jz5.h.b(new qs3.c0(this));
    }
}
