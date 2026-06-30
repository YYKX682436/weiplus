package ma;

/* loaded from: classes14.dex */
public abstract class e extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager f406657d;

    /* renamed from: e, reason: collision with root package name */
    public final o3.d f406658e;

    public e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f515662s);
        if (obtainStyledAttributes.hasValue(1)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.a1.s(this, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        this.f406657d = accessibilityManager;
        ma.d dVar = new ma.d(this);
        this.f406658e = dVar;
        o3.c.a(accessibilityManager, dVar);
        m147083xca593eeb(accessibilityManager.isTouchExplorationEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setClickableOrFocusableBasedOnAccessibility */
    public void m147083xca593eeb(boolean z17) {
        setClickable(!z17);
        setFocusable(z17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.y0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o3.c.b(this.f406657d, this.f406658e);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    /* renamed from: setOnAttachStateChangeListener */
    public void m147084x8314060f(ma.b bVar) {
    }

    /* renamed from: setOnLayoutChangeListener */
    public void m147085xc09231cf(ma.c cVar) {
    }
}
