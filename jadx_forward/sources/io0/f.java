package io0;

/* loaded from: classes3.dex */
public final class f extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f374984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = new com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf(context);
        this.f374984f = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        addView(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: getVideoView */
    public final com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf m139653x4ee17f0a() {
        return this.f374984f;
    }
}
