package com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.p2787xe21cab30;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R<\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout;", "Lcom/tencent/mm/ui/widget/FoursquareRelativeLayout;", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lkotlin/Function3;", "", "Landroid/view/View;", "Ljz5/f0;", "e", "Lyz5/q;", "getOnItemScrollListener", "()Lyz5/q;", "setOnItemScrollListener", "(Lyz5/q;)V", "onItemScrollListener", "Lkn5/g;", "f", "Lkn5/g;", "getItemGestureListener", "()Lkn5/g;", "setItemGestureListener", "(Lkn5/g;)V", "itemGestureListener", "Landroid/view/GestureDetector;", "g", "Landroid/view/GestureDetector;", "getGestureDetector", "()Landroid/view/GestureDetector;", "gestureDetector", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.recyclerview.dragselect.GestureFoursquareRelativeLayout */
/* loaded from: classes5.dex */
public final class C22850x1e5c7402 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22605x343029d9 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.q onItemScrollListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public kn5.g itemGestureListener;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final android.view.GestureDetector gestureDetector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22850x1e5c7402(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.TAG = "GestureFour." + hashCode();
        this.gestureDetector = new android.view.GestureDetector(context, new kn5.h(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        android.view.GestureDetector gestureDetector = this.gestureDetector;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(ev6);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return super.dispatchTouchEvent(ev6);
    }

    public final android.view.GestureDetector getGestureDetector() {
        return this.gestureDetector;
    }

    public final kn5.g getItemGestureListener() {
        return this.itemGestureListener;
    }

    public final yz5.q getOnItemScrollListener() {
        return this.onItemScrollListener;
    }

    public final java.lang.String getTAG() {
        return this.TAG;
    }

    /* renamed from: setItemGestureListener */
    public final void m82910x43981dc8(kn5.g gVar) {
        this.itemGestureListener = gVar;
    }

    /* renamed from: setOnItemScrollListener */
    public final void m82911x35d67855(yz5.q qVar) {
        this.onItemScrollListener = qVar;
    }
}
