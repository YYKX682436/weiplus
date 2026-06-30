package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002&\u0002B!\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$B\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006R\"\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Lcom/tencent/mm/plugin/music/ui/view/MusicPlayerSeekBar;", "Landroid/widget/FrameLayout;", "Lwl3/r;", "onSeekBarChange", "Ljz5/f0;", "setOnSeekBarChange", "", "textSize", "setTextSize", "color", "setColor", "currentPos", "setProgress", "totalDuration", "setMaxProgress", "", "d", "Z", "isSeeking", "()Z", "setSeeking", "(Z)V", "Landroid/graphics/drawable/Drawable;", "e", "Landroid/graphics/drawable/Drawable;", "getThumbDrawable", "()Landroid/graphics/drawable/Drawable;", "setThumbDrawable", "(Landroid/graphics/drawable/Drawable;)V", "thumbDrawable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "wl3/q", "plugin-music_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.music.ui.view.MusicPlayerSeekBar */
/* loaded from: classes5.dex */
public final class C16642xc9151255 extends android.widget.FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final wl3.q f232380g = new wl3.q(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isSeeking;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.graphics.drawable.Drawable thumbDrawable;

    /* renamed from: f, reason: collision with root package name */
    public final il3.a f232383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16642xc9151255(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c5d, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i18 = com.p314xaae8f345.mm.R.id.cnx;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.cnx);
        if (textView != null) {
            i18 = com.p314xaae8f345.mm.R.id.dgd;
            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.dgd);
            if (textView2 != null) {
                i18 = com.p314xaae8f345.mm.R.id.g6n;
                android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.g6n);
                if (a17 != null) {
                    i18 = com.p314xaae8f345.mm.R.id.js6;
                    android.widget.SeekBar seekBar = (android.widget.SeekBar) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.js6);
                    if (seekBar != null) {
                        this.f232383f = new il3.a((android.widget.LinearLayout) inflate, textView, textView2, a17, seekBar);
                        textView.setText("00:00");
                        textView2.setText("--:--");
                        this.thumbDrawable = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.asb);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q(seekBar, 100, 100, 100, 100);
                        seekBar.setOnSeekBarChangeListener(new wl3.s(this));
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public final android.graphics.drawable.Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    /* renamed from: setColor */
    public final void m67258x52d2f021(int i17) {
        il3.a aVar = this.f232383f;
        android.widget.TextView textView = aVar.f373621b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        textView.setTextColor(i17);
        android.widget.TextView textView2 = aVar.f373622c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        textView2.setTextColor(i17);
        android.widget.SeekBar seekBar = aVar.f373624e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(seekBar);
        seekBar.getProgressDrawable().setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
        android.widget.SeekBar seekBar2 = aVar.f373624e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(seekBar2);
        seekBar2.getThumb().setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
        android.graphics.drawable.Drawable drawable = this.thumbDrawable;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
        drawable.setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
        aVar.f373623d.setBackgroundColor(i17);
    }

    /* renamed from: setMaxProgress */
    public final void m67259xadb2e1ef(int i17) {
        il3.a aVar = this.f232383f;
        android.widget.TextView textView = aVar.f373622c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        textView.setText(f232380g.a(i17));
        android.widget.SeekBar seekBar = aVar.f373624e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(seekBar);
        seekBar.setMax(i17);
    }

    /* renamed from: setOnSeekBarChange */
    public final void m67260xf1df49aa(wl3.r onSeekBarChange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSeekBarChange, "onSeekBarChange");
    }

    /* renamed from: setProgress */
    public final void m67261x3ae760af(int i17) {
        if (this.isSeeking) {
            return;
        }
        il3.a aVar = this.f232383f;
        android.widget.TextView textView = aVar.f373621b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        textView.setText(f232380g.a(i17));
        android.widget.SeekBar seekBar = aVar.f373624e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(seekBar);
        seekBar.setProgress(i17);
        if (i17 > 0) {
            android.view.View view = aVar.f373623d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/music/ui/view/MusicPlayerSeekBar", "setProgress", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/music/ui/view/MusicPlayerSeekBar", "setProgress", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: setSeeking */
    public final void m67262x26c61fa8(boolean z17) {
        this.isSeeking = z17;
    }

    /* renamed from: setTextSize */
    public final void m67263x3abfd950(int i17) {
        il3.a aVar = this.f232383f;
        android.widget.TextView textView = aVar.f373621b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        float f17 = i17;
        textView.setTextSize(0, f17);
        android.widget.TextView textView2 = aVar.f373622c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        textView2.setTextSize(0, f17);
    }

    /* renamed from: setThumbDrawable */
    public final void m67264x28548352(android.graphics.drawable.Drawable drawable) {
        this.thumbDrawable = drawable;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16642xc9151255(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
