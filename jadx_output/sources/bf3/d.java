package bf3;

/* loaded from: classes3.dex */
public final class d extends androidx.appcompat.widget.AppCompatButton {

    /* renamed from: f, reason: collision with root package name */
    public final int f19615f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19616g;

    /* renamed from: h, reason: collision with root package name */
    public float f19617h;

    /* renamed from: i, reason: collision with root package name */
    public float f19618i;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f19619m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.RectF f19620n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, int i17) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f19615f = i17;
        setText("vConsole");
        setGravity(17);
        setBackground(new bf3.c(i17));
        setTextColor(-1);
        float f17 = getContext().getResources().getDisplayMetrics().density;
        int i18 = (int) (13 * f17);
        setPadding(i18, (int) (4 * f17), i18, (int) (6 * f17));
        this.f19619m = new int[2];
        this.f19620n = new android.graphics.RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getBackground() == null) {
            setBackground(new bf3.c(this.f19615f));
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelPendingInputEvents();
        this.f19616g = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r8.f19620n.contains(r9.getRawX(), r9.getRawY()) == false) goto L12;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            kotlin.jvm.internal.o.d(r9)
            int r0 = r9.getAction()
            r1 = 1
            if (r0 == 0) goto L6e
            if (r0 == r1) goto L49
            r2 = 2
            if (r0 == r2) goto L11
            goto L92
        L11:
            boolean r0 = r8.f19616g
            if (r0 != 0) goto L25
            float r0 = r9.getRawX()
            float r2 = r9.getRawY()
            android.graphics.RectF r3 = r8.f19620n
            boolean r0 = r3.contains(r0, r2)
            if (r0 != 0) goto L92
        L25:
            float r0 = r8.getX()
            float r2 = r9.getRawX()
            float r3 = r8.f19617h
            float r2 = r2 - r3
            float r0 = r0 + r2
            r8.setX(r0)
            float r0 = r8.getY()
            float r2 = r9.getRawY()
            float r3 = r8.f19618i
            float r2 = r2 - r3
            float r0 = r0 + r2
            r8.setY(r0)
            r8.requestLayout()
            r8.f19616g = r1
            goto L92
        L49:
            boolean r0 = r8.f19616g
            if (r0 != 0) goto L61
            float r0 = r9.getRawX()
            float r2 = r9.getRawY()
            android.graphics.RectF r3 = r8.f19620n
            boolean r0 = r3.contains(r0, r2)
            if (r0 == 0) goto L61
            r8.performClick()
            goto L92
        L61:
            r9.getRawX()
            r9.getRawY()
            r9.getX()
            r9.getY()
            goto L92
        L6e:
            int[] r0 = r8.f19619m
            r8.getLocationOnScreen(r0)
            android.graphics.RectF r2 = new android.graphics.RectF
            r3 = 0
            r4 = r0[r3]
            float r4 = (float) r4
            r5 = r0[r1]
            float r5 = (float) r5
            int r6 = r8.getWidth()
            float r6 = (float) r6
            float r6 = r6 + r4
            r0 = r0[r1]
            float r0 = (float) r0
            int r7 = r8.getHeight()
            float r7 = (float) r7
            float r0 = r0 + r7
            r2.<init>(r4, r5, r6, r0)
            r8.f19620n = r2
            r8.f19616g = r3
        L92:
            float r0 = r9.getRawX()
            r8.f19617h = r0
            float r9 = r9.getRawY()
            r8.f19618i = r9
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bf3.d.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
