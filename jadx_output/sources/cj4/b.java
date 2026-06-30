package cj4;

/* loaded from: classes11.dex */
public final class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.k f41904d;

    public b(cj4.k kVar) {
        this.f41904d = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.TextView textView;
        android.view.ViewTreeObserver viewTreeObserver;
        cj4.k kVar = this.f41904d;
        android.widget.TextView textView2 = kVar.D;
        if (textView2 != null && (viewTreeObserver = textView2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        android.widget.TextView textView3 = kVar.D;
        android.text.Layout layout = textView3 != null ? textView3.getLayout() : null;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            kVar.getClass();
            if (lineCount <= 1 || (textView = kVar.D) == null) {
                return;
            }
            textView.setLines(1);
        }
    }
}
