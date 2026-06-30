package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/music/ui/view/MarqueeLyricView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lll3/h1;", "lyricObj", "Ljz5/f0;", "setLyricObj", "", "currentTime", "setCurrentTime", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-music_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.music.ui.view.MarqueeLyricView */
/* loaded from: classes5.dex */
public final class C16637xca0f8dc2 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Scroller f232342g;

    /* renamed from: h, reason: collision with root package name */
    public final int f232343h;

    /* renamed from: i, reason: collision with root package name */
    public ll3.h1 f232344i;

    /* renamed from: m, reason: collision with root package name */
    public int f232345m;

    /* renamed from: n, reason: collision with root package name */
    public int f232346n;

    /* renamed from: o, reason: collision with root package name */
    public int f232347o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f232348p;

    /* renamed from: q, reason: collision with root package name */
    public long f232349q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f232350r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.animation.Animation f232351s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.animation.Animation f232352t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f232353u;

    /* renamed from: v, reason: collision with root package name */
    public int f232354v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16637xca0f8dc2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final int b(java.lang.String str) {
        android.text.TextPaint paint = getPaint();
        android.graphics.Rect rect = new android.graphics.Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        if (rect.width() > 0) {
            return rect.width();
        }
        return 25;
    }

    @Override // android.widget.TextView, android.view.View
    public void computeScroll() {
        super.computeScroll();
        android.widget.Scroller scroller = this.f232342g;
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), 0);
            invalidate();
        }
    }

    public final void e(int i17, java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        ll3.h1 h1Var = this.f232344i;
        if (h1Var != null) {
            setText(content);
            int i18 = i17 + 1;
            long j17 = i18 < h1Var.e() ? h1Var.d(i18).f400700a - h1Var.d(i17).f400700a : 5000L;
            boolean z17 = j17 > 1000;
            long j18 = (long) (j17 * 0.3d);
            if (200 <= j18) {
                j18 = 200;
            }
            this.f232349q = j18;
            int b17 = b(content);
            getWidth();
            java.lang.Runnable runnable = this.f232348p;
            removeCallbacks(runnable);
            this.f232342g.startScroll(0, 0, 0, 0, 0);
            if (this.f232353u) {
                long j19 = this.f232349q;
                android.view.animation.Animation animation = this.f232351s;
                animation.setDuration(j19);
                startAnimation(animation);
                this.f232353u = false;
            }
            if (getWidth() >= b17 || !z17) {
                return;
            }
            int b18 = b(content);
            int i19 = this.f232343h;
            int i27 = b18 - ((i19 * 3) / 4);
            if (i27 != 0) {
                this.f232347o = (int) (((i27 * 1.0f) / com.p314xaae8f345.mm.ui.zk.a(getContext(), 25)) * 1000);
                this.f232345m = i19;
                this.f232346n = i27;
                postDelayed(runnable, 1000L);
            }
            if (h1Var.e() - 1 > i17) {
                postDelayed(this.f232350r, j17 - this.f232349q);
                this.f232353u = true;
            }
        }
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    /* renamed from: setCurrentTime */
    public final void m67240x9411da24(long j17) {
        int i17;
        ll3.h1 h1Var = this.f232344i;
        if (h1Var == null || h1Var.e() <= 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarqueeLyricView", "getLyricLine, hasNoLyric");
            i17 = -2;
        } else if (-1 == this.f232354v) {
            this.f232354v = 0;
            ll3.h1 h1Var2 = this.f232344i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var2);
            java.lang.String content = h1Var2.d(this.f232354v).f400701b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content, "content");
            while (true) {
                int length = content.length() - 1;
                int i18 = 0;
                boolean z17 = false;
                while (i18 <= length) {
                    boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(content.charAt(!z17 ? i18 : length), 32) <= 0;
                    if (z17) {
                        if (!z18) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z18) {
                        i18++;
                    } else {
                        z17 = true;
                    }
                }
                if (!(content.subSequence(i18, length + 1).toString().length() == 0)) {
                    break;
                }
                this.f232354v++;
                ll3.h1 h1Var3 = this.f232344i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var3);
                content = h1Var3.d(this.f232354v).f400701b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content, "content");
            }
            i17 = this.f232354v;
        } else {
            ll3.h1 h1Var4 = this.f232344i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var4);
            int e17 = h1Var4.e();
            int i19 = 0;
            int i27 = -1;
            while (i19 < e17) {
                ll3.h1 h1Var5 = this.f232344i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var5);
                if (h1Var5.d(i19).f400700a >= j17) {
                    break;
                }
                ll3.h1 h1Var6 = this.f232344i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var6);
                h1Var6.d(i19).getClass();
                int i28 = i19;
                i19++;
                i27 = i28;
            }
            if (-1 == i27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MarqueeLyricView", "getLyricLine, can not found");
                i17 = -1;
            } else if (i27 == this.f232354v) {
                i17 = -3;
            } else {
                ll3.h1 h1Var7 = this.f232344i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var7);
                if (i27 >= h1Var7.e()) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i27);
                    ll3.h1 h1Var8 = this.f232344i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var8);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MarqueeLyricView", "getLyricLine, over range, tempHighLightIndex:%s, SentenceSize:%s", valueOf, java.lang.Integer.valueOf(h1Var8.e()));
                    i17 = -5;
                } else {
                    this.f232354v = i27;
                    ll3.h1 h1Var9 = this.f232344i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var9);
                    java.lang.String content2 = h1Var9.d(i27).f400701b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content2, "content");
                    int length2 = content2.length() - 1;
                    int i29 = 0;
                    boolean z19 = false;
                    while (i29 <= length2) {
                        boolean z27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(content2.charAt(!z19 ? i29 : length2), 32) <= 0;
                        if (z19) {
                            if (!z27) {
                                break;
                            } else {
                                length2--;
                            }
                        } else if (z27) {
                            i29++;
                        } else {
                            z19 = true;
                        }
                    }
                    i17 = content2.subSequence(i29, length2 + 1).toString().length() == 0 ? -6 : i27;
                }
            }
        }
        ll3.h1 h1Var10 = this.f232344i;
        if (h1Var10 == null || i17 < 0 || i17 >= h1Var10.e()) {
            return;
        }
        java.lang.String str = h1Var10.d(i17).f400701b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        e(i17, str);
    }

    /* renamed from: setLyricObj */
    public final void m67241x12e1de9a(ll3.h1 lyricObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricObj, "lyricObj");
        setText("");
        this.f232353u = false;
        removeCallbacks(this.f232350r);
        removeCallbacks(this.f232348p);
        this.f232342g.startScroll(0, 0, 0, 0, 0);
        this.f232344i = lyricObj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16637xca0f8dc2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.widget.Scroller scroller = new android.widget.Scroller(getContext(), new android.view.animation.LinearInterpolator());
        this.f232342g = scroller;
        this.f232343h = -getWidth();
        this.f232348p = new wl3.b(this);
        this.f232349q = 200L;
        this.f232350r = new wl3.a(this);
        this.f232351s = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
        this.f232352t = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd);
        this.f232354v = -1;
        setScroller(scroller);
        setHorizontallyScrolling(true);
    }
}
