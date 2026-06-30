package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u0002B!\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/music/ui/view/MusicMainSeekBar;", "Landroid/widget/FrameLayout;", "Lwl3/h;", "onSeekBarChange", "Ljz5/f0;", "setOnSeekBarChange", "", "currentPos", "setProgress", "totalDuration", "setMaxProgress", "", "d", "Z", "isSeeking", "()Z", "setSeeking", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "wl3/g", "music-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar */
/* loaded from: classes10.dex */
public final class C16639xd269873d extends android.widget.FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final wl3.g f232355h = new wl3.g(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isSeeking;

    /* renamed from: e, reason: collision with root package name */
    public wl3.h f232357e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f232358f;

    /* renamed from: g, reason: collision with root package name */
    public ii0.a f232359g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16639xd269873d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f232358f = "04:00";
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c4i, (android.view.ViewGroup) this, false);
        addView(inflate);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        int i18 = com.p314xaae8f345.mm.R.id.mha;
        android.widget.SeekBar seekBar = (android.widget.SeekBar) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.mha);
        if (seekBar != null) {
            i18 = com.p314xaae8f345.mm.R.id.o7k;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o7k);
            if (textView != null) {
                i18 = com.p314xaae8f345.mm.R.id.o7l;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o7l);
                if (textView2 != null) {
                    this.f232359g = new ii0.a(linearLayout, linearLayout, seekBar, textView, textView2);
                    android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.aqz);
                    p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                    h0Var.f391656d = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563528ar0);
                    ii0.a aVar = this.f232359g;
                    if (aVar != null) {
                        aVar.f373142b.setOnTouchListener(new wl3.i(this));
                        ii0.a aVar2 = this.f232359g;
                        if (aVar2 != null) {
                            aVar2.f373143c.setOnSeekBarChangeListener(new wl3.j(this, h0Var, drawable));
                            ii0.a aVar3 = this.f232359g;
                            if (aVar3 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBarBinding");
                                throw null;
                            }
                            aVar3.f373143c.setOnTouchListener(wl3.k.f528604d);
                            return;
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBarBinding");
                        throw null;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBarBinding");
                    throw null;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public final void a(int i17) {
        ii0.a aVar = this.f232359g;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBarBinding");
            throw null;
        }
        android.widget.TextView textView = aVar.f373145e;
        if (textView != null) {
            textView.setText(f232355h.a(i17));
        }
        ii0.a aVar2 = this.f232359g;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBarBinding");
            throw null;
        }
        android.widget.TextView textView2 = aVar2.f373144d;
        if (textView2 == null) {
            return;
        }
        textView2.setText(java.lang.String.valueOf(this.f232358f));
    }

    /* renamed from: setMaxProgress */
    public final void m67243xadb2e1ef(int i17) {
        this.f232358f = f232355h.a(i17);
        ii0.a aVar = this.f232359g;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBarBinding");
            throw null;
        }
        aVar.f373143c.setMax(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMainSeekBar", "maxDuration:" + this.f232358f + ", " + i17);
    }

    /* renamed from: setOnSeekBarChange */
    public final void m67244xf1df49aa(wl3.h onSeekBarChange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSeekBarChange, "onSeekBarChange");
        this.f232357e = onSeekBarChange;
    }

    /* renamed from: setProgress */
    public final void m67245x3ae760af(int i17) {
        if (this.isSeeking) {
            return;
        }
        a(i17);
        ii0.a aVar = this.f232359g;
        if (aVar != null) {
            aVar.f373143c.setProgress(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBarBinding");
            throw null;
        }
    }

    /* renamed from: setSeeking */
    public final void m67246x26c61fa8(boolean z17) {
        this.isSeeking = z17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16639xd269873d(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
