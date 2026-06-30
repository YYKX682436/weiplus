package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab.p1726x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/gallery/picker/tab/view/MediaTabPickerViewPager;", "Lcom/tencent/mm/ui/base/CustomViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gallery.picker.tab.view.MediaTabPickerViewPager */
/* loaded from: classes5.dex */
public final class C15644x74a709bf extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f219993d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.GestureDetector f219994e;

    public C15644x74a709bf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f219994e = new android.view.GestureDetector(getContext(), new c33.a(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        android.view.GestureDetector gestureDetector = this.f219994e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(ev6);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/gallery/picker/tab/view/MediaTabPickerViewPager", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/gallery/picker/tab/view/MediaTabPickerViewPager", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return super.dispatchTouchEvent(ev6);
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d
    /* renamed from: onPageScrolled */
    public void mo63668xf210c75a(int i17, float f17, int i18) {
        super.mo63668xf210c75a(i17, f17, i18);
        this.f219993d = i18 != 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d, com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        android.view.GestureDetector gestureDetector = this.f219994e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(ev6);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/gallery/picker/tab/view/MediaTabPickerViewPager", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/gallery/picker/tab/view/MediaTabPickerViewPager", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return super.onTouchEvent(ev6);
    }
}
