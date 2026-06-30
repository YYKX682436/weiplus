package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.DayPickerView */
/* loaded from: classes14.dex */
public class C10341xc7527cef extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public gn.d f145273b2;

    /* renamed from: c2, reason: collision with root package name */
    public gn.a f145274c2;

    /* renamed from: d2, reason: collision with root package name */
    public final android.content.res.TypedArray f145275d2;

    /* renamed from: e2, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f145276e2;

    /* renamed from: f2, reason: collision with root package name */
    public long f145277f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.h2 f145278g2;

    public C10341xc7527cef(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getBeginDate */
    public int[] m43521xbf73d141() {
        java.util.Calendar calendar;
        gn.d dVar = this.f145273b2;
        if (dVar == null || (calendar = dVar.f355099g) == null) {
            return null;
        }
        return new int[]{calendar.get(1), dVar.f355102m.intValue()};
    }

    /* renamed from: getController */
    public gn.a m43522x143f1b92() {
        return this.f145274c2;
    }

    /* renamed from: getNowDate */
    public int[] m43523xbcd1ef6e() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        return new int[]{calendar.get(1), calendar.get(2)};
    }

    /* renamed from: getSelectedDays */
    public gn.b m43524xf8582408() {
        return this.f145273b2.f355100h;
    }

    /* renamed from: getTypedArray */
    public android.content.res.TypedArray m43525xb3a79405() {
        return this.f145275d2;
    }

    /* renamed from: setBeginDate */
    public void m43526x1bc791b5(long j17) {
        this.f145277f2 = j17;
    }

    /* renamed from: setScrolledCallback */
    public void m43527xb4820913(com.p314xaae8f345.mm.p648x55baa833.ui.h2 h2Var) {
        this.f145278g2 = h2Var;
    }

    /* renamed from: setUpAdapter */
    public void m43528xb030c9f2(java.util.Collection<kn.a> collection) {
        if (this.f145273b2 == null) {
            this.f145273b2 = new gn.d(getContext(), this.f145274c2, this.f145275d2, this.f145277f2, collection);
        }
    }

    public C10341xc7527cef(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f145277f2 = -1L;
        if (isInEditMode()) {
            return;
        }
        this.f145275d2 = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p648x55baa833.ui.f5.f145683a);
        setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, -1));
        mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        this.f145276e2 = new com.p314xaae8f345.mm.p648x55baa833.ui.g2(this);
        setVerticalScrollBarEnabled(false);
        i(this.f145276e2);
        setFadingEdgeLength(0);
        setOverScrollMode(2);
    }
}
