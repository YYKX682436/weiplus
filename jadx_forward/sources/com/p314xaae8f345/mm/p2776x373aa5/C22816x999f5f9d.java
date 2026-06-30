package com.p314xaae8f345.mm.p2776x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB'\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/view/VoiceAnimImageView;", "Landroid/widget/RelativeLayout;", "", "iconColor", "Ljz5/f0;", "setIconColor", "", "d", "J", "getDuration", "()J", "setDuration", "(J)V", "duration", "", "e", "Z", "isPlaying", "()Z", "setPlaying", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.VoiceAnimImageView */
/* loaded from: classes8.dex */
public final class C22816x999f5f9d extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long duration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isPlaying;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f295049f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.AnimationDrawable f295050g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22816x999f5f9d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: setDuration */
    public final void m82786xffd6ec16(long j17) {
        this.duration = j17;
    }

    /* renamed from: setIconColor */
    public final void m82787x7541828(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f295049f;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("animShape");
            throw null;
        }
        c22699x3dcdb352.m82040x7541828(i17);
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("animShape");
            throw null;
        }
        c22699x3dcdb352.setColorFilter(i17);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.invalidate();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("animShape");
            throw null;
        }
    }

    /* renamed from: setPlaying */
    public final void m82788x93d3596c(boolean z17) {
        this.isPlaying = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22816x999f5f9d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.duration = 300L;
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eqh, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.u7u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        this.f295049f = c22699x3dcdb352;
        android.graphics.drawable.Drawable drawable = c22699x3dcdb352.getDrawable();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        this.f295050g = (android.graphics.drawable.AnimationDrawable) drawable;
    }
}
