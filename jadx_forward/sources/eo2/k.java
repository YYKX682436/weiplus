package eo2;

/* loaded from: classes2.dex */
public final class k implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 f337114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 f337115e;

    public k(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x240691592) {
        this.f337114d = c22645x24069159;
        this.f337115e = c22645x240691592;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = this.f337114d;
        c22645x24069159.m81436x205ac394(this.f337115e.getHeight() / 2.0f);
        android.view.ViewTreeObserver viewTreeObserver = c22645x24069159.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
