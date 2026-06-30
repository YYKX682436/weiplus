package c33;

/* loaded from: classes5.dex */
public final class a extends db5.w5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.tab.view.MediaTabPickerViewPager f38179d;

    public a(com.tencent.mm.plugin.gallery.picker.tab.view.MediaTabPickerViewPager mediaTabPickerViewPager) {
        this.f38179d = mediaTabPickerViewPager;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.gallery.picker.tab.view.MediaTabPickerViewPager mediaTabPickerViewPager = this.f38179d;
        return mediaTabPickerViewPager.f138460d && !mediaTabPickerViewPager.isCanSlide();
    }
}
