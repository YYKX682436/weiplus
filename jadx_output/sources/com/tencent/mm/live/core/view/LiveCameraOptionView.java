package com.tencent.mm.live.core.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/live/core/view/LiveCameraOptionView;", "Landroid/widget/RelativeLayout;", "Lmo0/b;", "callback", "Ljz5/f0;", "setTouchCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveCameraOptionView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public mo0.b f68599d;

    /* renamed from: e, reason: collision with root package name */
    public long f68600e;

    /* renamed from: f, reason: collision with root package name */
    public float f68601f;

    /* renamed from: g, reason: collision with root package name */
    public int f68602g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.live.core.view.LiveCameraFocusView f68603h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.GestureDetector f68604i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveCameraOptionView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f68601f = -1.0f;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.live.core.view.LiveCameraFocusView liveCameraFocusView = new com.tencent.mm.live.core.view.LiveCameraFocusView(context2);
        liveCameraFocusView.a(i65.a.b(liveCameraFocusView.getContext(), 120), i65.a.b(liveCameraFocusView.getContext(), 120), liveCameraFocusView.getContext().getResources().getColor(com.tencent.mm.R.color.aaq));
        this.f68603h = liveCameraFocusView;
        addView(liveCameraFocusView);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), new mo0.c(this));
        this.f68604i = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.live.core.view.LiveCameraOptionView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setTouchCallback(mo0.b callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f68599d = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveCameraOptionView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f68601f = -1.0f;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.live.core.view.LiveCameraFocusView liveCameraFocusView = new com.tencent.mm.live.core.view.LiveCameraFocusView(context2);
        liveCameraFocusView.a(i65.a.b(liveCameraFocusView.getContext(), 120), i65.a.b(liveCameraFocusView.getContext(), 120), liveCameraFocusView.getContext().getResources().getColor(com.tencent.mm.R.color.aaq));
        this.f68603h = liveCameraFocusView;
        addView(liveCameraFocusView);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), new mo0.c(this));
        this.f68604i = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }
}
