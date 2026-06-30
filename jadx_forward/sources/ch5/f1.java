package ch5;

/* loaded from: classes14.dex */
public final class f1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c f123098d;

    public f1(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c) {
        this.f123098d = c22426x8efb1b1c;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c = this.f123098d;
        c22426x8efb1b1c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.ViewParent parent = c22426x8efb1b1c.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setClipChildren(false);
    }
}
