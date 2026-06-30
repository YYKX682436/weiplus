package ng2;

/* loaded from: classes10.dex */
public final class d implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.g f418493d;

    public d(ng2.g gVar) {
        this.f418493d = gVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewTreeObserver viewTreeObserver;
        ng2.g gVar = this.f418493d;
        android.widget.FrameLayout frameLayout = gVar.f418490s;
        if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f400090e, "addCoverViewContainerToWindow onPreDraw");
        android.view.ViewGroup viewGroup = gVar.f400099q;
        if (viewGroup == null) {
            return true;
        }
        viewGroup.setVisibility(4);
        return true;
    }
}
