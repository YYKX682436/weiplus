package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019R#\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderProgressBar;", "Landroid/widget/FrameLayout;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/SeekBar;", "kotlin.jvm.PlatformType", "f", "Ljz5/g;", "getSeekBar", "()Landroid/widget/SeekBar;", "seekBar", "g", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "getListener", "()Landroid/widget/SeekBar$OnSeekBarChangeListener;", "setListener", "(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderProgressBar */
/* loaded from: classes5.dex */
public final class C15340x97d97280 extends android.widget.FrameLayout implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f212970h = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f212971d;

    /* renamed from: e, reason: collision with root package name */
    public float f212972e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g seekBar;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.widget.SeekBar.OnSeekBarChangeListener listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15340x97d97280(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570632ba2, (android.view.ViewGroup) this, true);
        android.widget.SeekBar seekBar = (android.widget.SeekBar) findViewById(com.p314xaae8f345.mm.R.id.mhc);
        if (seekBar != null) {
            setAlpha(0.0f);
            seekBar.setOnTouchListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fi.f213641d);
        }
        setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gi(this));
        this.seekBar = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hi(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getSeekBar */
    public final android.widget.SeekBar m62355xb3543e45() {
        return (android.widget.SeekBar) this.seekBar.mo141623x754a37bb();
    }

    public final void b(boolean z17, long j17) {
        if (z17) {
            android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.listener;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(m62355xb3543e45());
            }
            animate().cancel();
            animate().alpha(1.0f).withStartAction(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ii(this)).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ji(this)).setDuration(300L).alpha(1.0f).setStartDelay(j17).start();
            return;
        }
        android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.listener;
        if (onSeekBarChangeListener2 != null) {
            onSeekBarChangeListener2.onStopTrackingTouch(m62355xb3543e45());
        }
        animate().cancel();
        animate().alpha(0.0f).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ki(this)).setDuration(300L).setStartDelay(j17).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (this.f212971d && event.getAction() == 0) {
            animate().cancel();
            setAlpha(1.0f);
        } else if (event.getAction() == 1 || event.getAction() == 3) {
            if (this.f212971d) {
                b(false, 0L);
            }
        } else if (event.getAction() == 2 && this.f212971d) {
            float x17 = this.f212972e - event.getX();
            float abs = java.lang.Math.abs(x17);
            float progress = m62355xb3543e45().getProgress();
            if (x17 >= 0.0f) {
                abs = -abs;
            }
            m62355xb3543e45().setProgress((int) (progress + abs));
        }
        this.f212972e = event.getX();
        return super.dispatchTouchEvent(event);
    }

    public final android.widget.SeekBar.OnSeekBarChangeListener getListener() {
        return this.listener;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seekBar, "seekBar");
        android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.listener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i17, z17);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seekBar, "seekBar");
    }

    /* renamed from: setListener */
    public final void m62357xc6cf6336(android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.listener = onSeekBarChangeListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15340x97d97280(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570632ba2, (android.view.ViewGroup) this, true);
        android.widget.SeekBar seekBar = (android.widget.SeekBar) findViewById(com.p314xaae8f345.mm.R.id.mhc);
        if (seekBar != null) {
            setAlpha(0.0f);
            seekBar.setOnTouchListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fi.f213641d);
        }
        setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gi(this));
        this.seekBar = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hi(this));
    }
}
