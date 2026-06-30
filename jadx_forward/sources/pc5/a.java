package pc5;

/* loaded from: classes3.dex */
public final class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5.C21800x7ffd7e9e f434969d;

    public a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5.C21800x7ffd7e9e c21800x7ffd7e9e) {
        this.f434969d = c21800x7ffd7e9e;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5.C21800x7ffd7e9e c21800x7ffd7e9e = this.f434969d;
        if (c21800x7ffd7e9e.f283046e.getLineCount() > 1) {
            c21800x7ffd7e9e.f283046e.setTextSize(0, i65.a.h(c21800x7ffd7e9e.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
        }
        c21800x7ffd7e9e.f283046e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
