package oz4;

/* loaded from: classes12.dex */
public class l implements android.text.style.LeadingMarginSpan, oz4.h, oz4.g {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f431813d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f431814e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f431815f;

    /* renamed from: g, reason: collision with root package name */
    public final int f431816g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f431817h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f431818i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f431819m;

    public l(boolean z17, int i17, boolean z18, boolean z19, boolean z27) {
        boolean z28 = false;
        this.f431813d = false;
        this.f431814e = false;
        this.f431815f = false;
        this.f431818i = false;
        this.f431816g = i17;
        if (z18 && z27 && !z19) {
            z28 = true;
        }
        this.f431817h = z28;
        this.f431818i = z17;
        this.f431813d = z19;
        this.f431814e = z27;
        this.f431815f = z18;
    }

    @Override // oz4.g
    public oz4.g a() {
        return new oz4.l(this.f431818i, this.f431816g, this.f431815f, this.f431813d, this.f431814e);
    }

    public void b(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent, oz4.l lVar) {
        iz4.c l17;
        if (motionEvent.getX() > this.f431816g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NoteTodoSpan", "x > mGapWidth");
            return;
        }
        int spanStart = spannable.getSpanStart(lVar);
        int spanEnd = spannable.getSpanEnd(lVar);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = this.f431818i ? "true" : "false";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteTodoSpan", "current mIsTodoCheck: %s", objArr);
        spannable.removeSpan(this);
        boolean z17 = !this.f431818i;
        this.f431818i = z17;
        spannable.setSpan(new oz4.l(z17, this.f431816g, this.f431815f, this.f431813d, this.f431814e), spanStart, spanEnd, 33);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a) textView;
        if (c19515x154ec45a.m74966xbc88a4a7() == 0 && (l17 = c19515x154ec45a.m74970x7a6fbc1().f495716e.l(c19515x154ec45a.m74971xef703fb1())) != null && l17.d() == 1) {
            iz4.i iVar = (iz4.i) l17;
            iVar.f377688t = kz4.c.b(spannable);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "item content = " + iVar.f377688t);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence charSequence, int i29, int i37, boolean z17, android.text.Layout layout) {
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        if (this.f431817h || spanned.getSpanStart(this) != i29) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f431819m;
        android.graphics.drawable.Drawable drawable = weakReference != null ? (android.graphics.drawable.Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = this.f431818i ? b3.l.m9707x4a96be14(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.cc9) : b3.l.m9707x4a96be14(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.cc_);
            this.f431819m = new java.lang.ref.WeakReference(drawable);
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
        if (this.f431817h) {
            return 0;
        }
        return this.f431816g;
    }

    @Override // oz4.h
    /* renamed from: getValue */
    public java.lang.Object mo74982x754a37bb() {
        return java.lang.Boolean.TRUE;
    }
}
