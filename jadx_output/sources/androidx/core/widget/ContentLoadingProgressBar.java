package androidx.core.widget;

/* loaded from: classes11.dex */
public class ContentLoadingProgressBar extends android.widget.ProgressBar {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11047f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f11048d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f11049e;

    public ContentLoadingProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11048d = new java.lang.Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = androidx.core.widget.ContentLoadingProgressBar.f11047f;
                androidx.core.widget.ContentLoadingProgressBar.this.setVisibility(8);
            }
        };
        this.f11049e = new java.lang.Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar$$b
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = androidx.core.widget.ContentLoadingProgressBar.f11047f;
                androidx.core.widget.ContentLoadingProgressBar contentLoadingProgressBar = androidx.core.widget.ContentLoadingProgressBar.this;
                contentLoadingProgressBar.getClass();
                java.lang.System.currentTimeMillis();
                contentLoadingProgressBar.setVisibility(0);
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f11048d);
        removeCallbacks(this.f11049e);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f11048d);
        removeCallbacks(this.f11049e);
    }
}
