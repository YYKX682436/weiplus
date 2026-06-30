package p012xc85e97e9.p075x2eaf9f.p079xd1075a44;

/* renamed from: androidx.core.widget.ContentLoadingProgressBar */
/* loaded from: classes11.dex */
public class C1092x2adae403 extends android.widget.ProgressBar {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f92580f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f92581d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f92582e;

    public C1092x2adae403(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f92581d = new java.lang.Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1092x2adae403.f92580f;
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1092x2adae403.this.setVisibility(8);
            }
        };
        this.f92582e = new java.lang.Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar$$b
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1092x2adae403.f92580f;
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1092x2adae403 c1092x2adae403 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1092x2adae403.this;
                c1092x2adae403.getClass();
                java.lang.System.currentTimeMillis();
                c1092x2adae403.setVisibility(0);
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f92581d);
        removeCallbacks(this.f92582e);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f92581d);
        removeCallbacks(this.f92582e);
    }
}
