package kj2;

/* loaded from: classes10.dex */
public final class w implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.x f389970d;

    public w(kj2.x xVar) {
        this.f389970d = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewGroup.LayoutParams layoutParams;
        kj2.x xVar = this.f389970d;
        xVar.m151490xfb84e958().getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab4 = xVar.m151491x9fd65ab4();
        if (m151491x9fd65ab4 == null || (layoutParams = m151491x9fd65ab4.getLayoutParams()) == null) {
            return true;
        }
        int width = (int) (xVar.m151490xfb84e958().getWidth() / 0.7083333f);
        layoutParams.width = width;
        layoutParams.height = width;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab42 = xVar.m151491x9fd65ab4();
        if (m151491x9fd65ab42 == null) {
            return true;
        }
        m151491x9fd65ab42.m56877x290db7c4(xVar.m151490xfb84e958().getWidth() / 2.0f);
        return true;
    }
}
