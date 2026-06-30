package com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarWaveView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarWaveView */
/* loaded from: classes13.dex */
public final class C16954x37c15e44 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f236584d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.Animation f236585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16954x37c15e44(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    public final void a() {
        setVisibility(0);
        android.view.View view = this.f236584d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        view.startAnimation(this.f236585e);
    }

    public final void b() {
        getMeasuredHeight();
        getMeasuredWidth();
        setVisibility(4);
        android.view.View view = this.f236584d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        view.clearAnimation();
    }
}
