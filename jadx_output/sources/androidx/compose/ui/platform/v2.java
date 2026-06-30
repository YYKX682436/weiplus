package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public class v2 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f10765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        setClipChildren(false);
        setTag(com.tencent.mm.R.id.f485243h04, java.lang.Boolean.TRUE);
    }

    public final void a(e1.u canvas, android.view.View view, long j17) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(view, "view");
        android.graphics.Canvas canvas2 = e1.c.f246229a;
        super.drawChild(((e1.b) canvas).f246225a, view, j17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        boolean z17;
        kotlin.jvm.internal.o.g(canvas, "canvas");
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
            if (((androidx.compose.ui.platform.p4) childAt).f10696n) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17) {
            this.f10765d = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.f10765d = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f10765d) {
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
