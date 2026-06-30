package sc2;

/* loaded from: classes2.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f487625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f487626e;

    public n1(android.widget.TextView textView, sc2.f2 f2Var) {
        this.f487625d = textView;
        this.f487626e = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.text.Layout layout;
        int i17 = 0;
        android.widget.TextView textView = this.f487625d;
        if (textView != null && (layout = textView.getLayout()) != null) {
            i17 = layout.getEllipsisCount(0);
        }
        if (i17 > 0) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487626e.k(), "bindBigCard: infoAfterWording is empty");
        }
    }
}
