package px1;

/* loaded from: classes12.dex */
public class t implements android.text.style.LeadingMarginSpan, px1.h, px1.g {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f440386d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f440387e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f440388f;

    /* renamed from: g, reason: collision with root package name */
    public final int f440389g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f440390h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f440391i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f440392m;

    public t(boolean z17, int i17, boolean z18, boolean z19, boolean z27) {
        boolean z28 = false;
        this.f440386d = false;
        this.f440387e = false;
        this.f440388f = false;
        this.f440391i = false;
        this.f440389g = i17;
        if (z18 && z27 && !z19) {
            z28 = true;
        }
        this.f440390h = z28;
        this.f440391i = z17;
        this.f440386d = z19;
        this.f440387e = z27;
        this.f440388f = z18;
    }

    @Override // px1.g
    public px1.g a() {
        return new px1.t(this.f440391i, this.f440389g, this.f440388f, this.f440386d, this.f440387e);
    }

    public void b(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent, px1.t tVar) {
        ix1.a l17;
        if (motionEvent.getX() > this.f440389g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TodoSpan", "x > mGapWidth");
            return;
        }
        int spanStart = spannable.getSpanStart(tVar);
        int spanEnd = spannable.getSpanEnd(tVar);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = this.f440391i ? "true" : "false";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TodoSpan", "current mIsTodoCheck: %s", objArr);
        spannable.removeSpan(this);
        boolean z17 = !this.f440391i;
        this.f440391i = z17;
        spannable.setSpan(new px1.t(z17, this.f440389g, this.f440388f, this.f440386d, this.f440387e), spanStart, spanEnd, 33);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a) textView;
        if (c13158x154ec45a.m54589xbc88a4a7() == 0 && (l17 = nx1.d.q().l(c13158x154ec45a.m54593xef703fb1())) != null && l17.b() == 1) {
            ((ix1.l) l17).f376871s = lx1.c.a(spannable);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence charSequence, int i29, int i37, boolean z17, android.text.Layout layout) {
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        if (this.f440390h || spanned.getSpanStart(this) != i29) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f440392m;
        android.graphics.drawable.Drawable drawable = weakReference != null ? (android.graphics.drawable.Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = this.f440391i ? b3.l.m9707x4a96be14(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.c1h) : b3.l.m9707x4a96be14(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.c1i);
            this.f440392m = new java.lang.ref.WeakReference(drawable);
        }
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        canvas.save();
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.translate(0.0f, ((((fontMetricsInt.descent + i27) + i27) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        if (this.f440390h) {
            return 0;
        }
        return this.f440389g;
    }

    @Override // px1.h
    /* renamed from: getValue */
    public java.lang.Object mo54603x754a37bb() {
        return java.lang.Boolean.TRUE;
    }
}
