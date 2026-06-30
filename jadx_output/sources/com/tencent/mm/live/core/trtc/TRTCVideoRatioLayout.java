package com.tencent.mm.live.core.trtc;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000e\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\u000eJ*\u0010\u0015\u001a\u00020\u00052\"\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012`\u0013¨\u0006 "}, d2 = {"Lcom/tencent/mm/live/core/trtc/TRTCVideoRatioLayout;", "Lcom/tencent/mm/view/ratio/RatioLayout;", "Lio0/b;", "Lio0/a;", "callback", "Ljz5/f0;", "setPluginCallback", "Ljava/util/ArrayList;", "Ljo0/a;", "getTRTCDataList", "Landroid/view/TextureView;", "getCameraView", "cameraView", "setCameraView", "Lio0/e;", "getCameraLayout", "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "radiusMap", "setPreviewCornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "io0/f", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TRTCVideoRatioLayout extends com.tencent.mm.view.ratio.RatioLayout implements io0.b {

    /* renamed from: o, reason: collision with root package name */
    public final io0.e f68576o;

    /* renamed from: p, reason: collision with root package name */
    public io0.a f68577p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f68578q;

    /* renamed from: r, reason: collision with root package name */
    public final io0.c f68579r;

    /* renamed from: s, reason: collision with root package name */
    public final jo0.c f68580s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f68581t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TRTCVideoRatioLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attributeSet, "attributeSet");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.f68576o = new io0.e(context2);
        this.f68578q = new java.util.HashMap();
        io0.c cVar = new io0.c(this);
        this.f68579r = cVar;
        jo0.c cVar2 = new jo0.c();
        this.f68580s = cVar2;
        setAdapter(cVar);
        setLayoutManager(cVar2);
        post(new io0.d(this));
    }

    public final io0.f a(java.lang.String userId, int i17) {
        kotlin.jvm.internal.o.g(userId, "userId");
        java.util.HashMap hashMap = this.f68578q;
        io0.f fVar = (io0.f) hashMap.get(userId);
        if (fVar == null) {
            fVar = null;
        }
        if (fVar != null) {
            return fVar;
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        io0.f fVar2 = new io0.f(context);
        hashMap.put(userId, fVar2);
        return fVar2;
    }

    /* renamed from: getCameraLayout, reason: from getter */
    public final io0.e getF68576o() {
        return this.f68576o;
    }

    public final android.view.TextureView getCameraView() {
        return this.f68576o.getCameraView();
    }

    public final java.util.ArrayList<jo0.a> getTRTCDataList() {
        return this.f68579r.f293447c;
    }

    public final void setCameraView(android.view.TextureView cameraView) {
        kotlin.jvm.internal.o.g(cameraView, "cameraView");
        this.f68576o.setCameraView(cameraView);
    }

    public final void setPluginCallback(io0.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f68577p = callback;
        jo0.c cVar = this.f68580s;
        cVar.getClass();
        cVar.f300876c = callback;
    }

    public final void setPreviewCornerRadius(java.util.LinkedHashMap<java.lang.String, java.lang.Float> radiusMap) {
        kotlin.jvm.internal.o.g(radiusMap, "radiusMap");
        jo0.c cVar = this.f68580s;
        cVar.getClass();
        for (jo0.b bVar : cVar.f300875b) {
            java.lang.Float f17 = radiusMap.get(bVar.f300873a.f300870a);
            if (f17 == null) {
                f17 = java.lang.Float.valueOf(0.0f);
            }
            kotlin.jvm.internal.o.d(f17);
            float floatValue = f17.floatValue();
            android.view.View view = bVar.f300874b;
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = view instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) view : null;
            if (roundCornerRelativeLayout != null) {
                roundCornerRelativeLayout.setRadius(floatValue);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TRTCVideoRatioLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attributeSet, "attributeSet");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.f68576o = new io0.e(context2);
        this.f68578q = new java.util.HashMap();
        io0.c cVar = new io0.c(this);
        this.f68579r = cVar;
        jo0.c cVar2 = new jo0.c();
        this.f68580s = cVar2;
        setAdapter(cVar);
        setLayoutManager(cVar2);
        post(new io0.d(this));
    }
}
