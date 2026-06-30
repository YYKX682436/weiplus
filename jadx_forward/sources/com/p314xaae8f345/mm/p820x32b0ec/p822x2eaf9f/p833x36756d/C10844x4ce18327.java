package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000e\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\u000eJ*\u0010\u0015\u001a\u00020\u00052\"\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012`\u0013¨\u0006 "}, d2 = {"Lcom/tencent/mm/live/core/trtc/TRTCVideoRatioLayout;", "Lcom/tencent/mm/view/ratio/RatioLayout;", "Lio0/b;", "Lio0/a;", "callback", "Ljz5/f0;", "setPluginCallback", "Ljava/util/ArrayList;", "Ljo0/a;", "getTRTCDataList", "Landroid/view/TextureView;", "getCameraView", "cameraView", "setCameraView", "Lio0/e;", "getCameraLayout", "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "radiusMap", "setPreviewCornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "io0/f", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout */
/* loaded from: classes3.dex */
public final class C10844x4ce18327 extends com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 implements io0.b {

    /* renamed from: o, reason: collision with root package name */
    public final io0.e f150109o;

    /* renamed from: p, reason: collision with root package name */
    public io0.a f150110p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f150111q;

    /* renamed from: r, reason: collision with root package name */
    public final io0.c f150112r;

    /* renamed from: s, reason: collision with root package name */
    public final jo0.c f150113s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f150114t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10844x4ce18327(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributeSet, "attributeSet");
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        this.f150109o = new io0.e(context2);
        this.f150111q = new java.util.HashMap();
        io0.c cVar = new io0.c(this);
        this.f150112r = cVar;
        jo0.c cVar2 = new jo0.c();
        this.f150113s = cVar2;
        m82883x6cab2c8d(cVar);
        m82887x900dcbe1(cVar2);
        post(new io0.d(this));
    }

    public final io0.f a(java.lang.String userId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
        java.util.HashMap hashMap = this.f150111q;
        io0.f fVar = (io0.f) hashMap.get(userId);
        if (fVar == null) {
            fVar = null;
        }
        if (fVar != null) {
            return fVar;
        }
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        io0.f fVar2 = new io0.f(context);
        hashMap.put(userId, fVar2);
        return fVar2;
    }

    /* renamed from: getCameraLayout, reason: from getter */
    public final io0.e getF150109o() {
        return this.f150109o;
    }

    /* renamed from: getCameraView */
    public final android.view.TextureView m46514x76530f60() {
        return this.f150109o.m139651x76530f60();
    }

    /* renamed from: getTRTCDataList */
    public final java.util.ArrayList<jo0.a> m46515xf32e824b() {
        return this.f150112r.f374980c;
    }

    /* renamed from: setCameraView */
    public final void m46516xa4775d6c(android.view.TextureView cameraView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraView, "cameraView");
        this.f150109o.m139652xa4775d6c(cameraView);
    }

    /* renamed from: setPluginCallback */
    public final void m46517x742f459a(io0.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f150110p = callback;
        jo0.c cVar = this.f150113s;
        cVar.getClass();
        cVar.f382409c = callback;
    }

    /* renamed from: setPreviewCornerRadius */
    public final void m46518xf9325f6d(java.util.LinkedHashMap<java.lang.String, java.lang.Float> radiusMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(radiusMap, "radiusMap");
        jo0.c cVar = this.f150113s;
        cVar.getClass();
        for (jo0.b bVar : cVar.f382408b) {
            java.lang.Float f17 = radiusMap.get(bVar.f382406a.f382403a);
            if (f17 == null) {
                f17 = java.lang.Float.valueOf(0.0f);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
            float floatValue = f17.floatValue();
            android.view.View view = bVar.f382407b;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) view : null;
            if (c22645x24069159 != null) {
                c22645x24069159.m81436x205ac394(floatValue);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10844x4ce18327(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributeSet, "attributeSet");
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        this.f150109o = new io0.e(context2);
        this.f150111q = new java.util.HashMap();
        io0.c cVar = new io0.c(this);
        this.f150112r = cVar;
        jo0.c cVar2 = new jo0.c();
        this.f150113s = cVar2;
        m82883x6cab2c8d(cVar);
        m82887x900dcbe1(cVar2);
        post(new io0.d(this));
    }
}
