package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public class v2 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f92298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setClipChildren(false);
        setTag(com.p314xaae8f345.mm.R.id.f566776h04, java.lang.Boolean.TRUE);
    }

    public final void a(e1.u canvas, android.view.View view, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.graphics.Canvas canvas2 = e1.c.f327762a;
        super.drawChild(((e1.b) canvas).f327758a, view, j17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int childCount = super.getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 >= childCount) {
                z17 = false;
                break;
            }
            android.view.View childAt = getChildAt(i17);
            if (childAt == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            }
            if (((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p4) childAt).f92229n) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17) {
            this.f92298d = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.f92298d = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f92298d) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(0, 0);
    }
}
