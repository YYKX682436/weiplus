package com.p314xaae8f345.mm.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\f\u001a\u00060\bR\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/tencent/mm/ui/ProfileDispatchTouchEventLayout;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/ui/widget/listview/PullDownListView;", "i", "Ljz5/g;", "getPullDownListView", "()Lcom/tencent/mm/ui/widget/listview/PullDownListView;", "pullDownListView", "Lcom/tencent/mm/ui/tg;", "m", "getGestureListener", "()Lcom/tencent/mm/ui/tg;", "gestureListener", "Landroid/view/GestureDetector;", "n", "getGestureDetector", "()Landroid/view/GestureDetector;", "gestureDetector", "Lcom/tencent/mm/plugin/textstatus/ui/LongTextView;", "getCurStatusLongTextView", "()Lcom/tencent/mm/plugin/textstatus/ui/LongTextView;", "curStatusLongTextView", "Landroid/view/View;", "getBackPreviewContent", "()Landroid/view/View;", "backPreviewContent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.ProfileDispatchTouchEventLayout */
/* loaded from: classes11.dex */
public final class C21432x204668e8 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f278580d;

    /* renamed from: e, reason: collision with root package name */
    public final float f278581e;

    /* renamed from: f, reason: collision with root package name */
    public final float f278582f;

    /* renamed from: g, reason: collision with root package name */
    public float f278583g;

    /* renamed from: h, reason: collision with root package name */
    public float f278584h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g pullDownListView;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g gestureListener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g gestureDetector;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21432x204668e8(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getCurStatusLongTextView */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e m78815x73df4dca() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2 U6;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        uj4.e eVar = (uj4.e) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(uj4.e.class);
        if (eVar == null || (U6 = eVar.U6()) == null) {
            return null;
        }
        return U6.f255731o;
    }

    /* renamed from: getGestureDetector */
    private final android.view.GestureDetector m78816x601451f9() {
        return (android.view.GestureDetector) ((jz5.n) this.gestureDetector).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getGestureListener */
    public final com.p314xaae8f345.mm.ui.tg m78817x71d5fee7() {
        return (com.p314xaae8f345.mm.ui.tg) ((jz5.n) this.gestureListener).mo141623x754a37bb();
    }

    /* renamed from: getPullDownListView */
    private final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a m78818x83bdd180() {
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a) ((jz5.n) this.pullDownListView).mo141623x754a37bb();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean z17 = ((uj4.e) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(uj4.e.class)).f509956m;
        android.view.GestureDetector m78816x601451f9 = m78816x601451f9();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(event);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78816x601451f9, arrayList.toArray(), "com/tencent/mm/ui/ProfileDispatchTouchEventLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(m78816x601451f9, m78816x601451f9.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/ui/ProfileDispatchTouchEventLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (z17) {
            if (m78817x71d5fee7().f291434d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e m78815x73df4dca = m78815x73df4dca();
                if (m78815x73df4dca != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m78815x73df4dca.c(), java.lang.Boolean.TRUE) : false) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e m78815x73df4dca2 = m78815x73df4dca();
                    if (m78815x73df4dca2 != null ? m78815x73df4dca2.dispatchTouchEvent(event) : false) {
                        event.getAction();
                        return true;
                    }
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(event);
                event.getAction();
                if (dispatchTouchEvent) {
                    return dispatchTouchEvent;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a m78818x83bdd180 = m78818x83bdd180();
                boolean dispatchTouchEvent2 = m78818x83bdd180 != null ? m78818x83bdd180.dispatchTouchEvent(event) : false;
                event.getAction();
                return dispatchTouchEvent2;
            }
            android.view.View m78819xba93aa4e = m78819xba93aa4e();
            if (m78819xba93aa4e != null) {
                boolean dispatchTouchEvent3 = m78819xba93aa4e.dispatchTouchEvent(event);
                event.getAction();
                if (dispatchTouchEvent3) {
                    return true;
                }
            }
        }
        boolean dispatchTouchEvent4 = super.dispatchTouchEvent(event);
        event.getAction();
        return dispatchTouchEvent4;
    }

    /* renamed from: getBackPreviewContent */
    public final android.view.View m78819xba93aa4e() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.ref.WeakReference weakReference = ((uj4.e) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(uj4.e.class)).f509953g;
        if (weakReference != null) {
            return (android.view.ViewGroup) weakReference.get();
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        return super.onInterceptTouchEvent(ev6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21432x204668e8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f278580d = "MicroMsg.ProfileDispatchTouchEventLayout";
        this.f278581e = 50.0f;
        this.f278582f = 50.0f;
        this.pullDownListView = jz5.h.b(new com.p314xaae8f345.mm.ui.wg(context));
        this.gestureListener = jz5.h.b(new com.p314xaae8f345.mm.ui.vg(this));
        this.gestureDetector = jz5.h.b(new com.p314xaae8f345.mm.ui.ug(context, this));
    }
}
