package eg4;

/* loaded from: classes3.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f334220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f334221e;

    public d0(android.widget.TextView textView, android.widget.TextView textView2) {
        this.f334220d = textView;
        this.f334221e = textView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.text.Layout layout = this.f334220d.getLayout();
        if (layout != null) {
            int ellipsisCount = layout.getEllipsisCount(0);
            android.widget.TextView textView = this.f334221e;
            if (textView == null) {
                return;
            }
            textView.setVisibility(ellipsisCount <= 0 ? 8 : 0);
        }
    }
}
