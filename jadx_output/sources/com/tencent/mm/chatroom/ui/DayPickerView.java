package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class DayPickerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public gn.d f63740b2;

    /* renamed from: c2, reason: collision with root package name */
    public gn.a f63741c2;

    /* renamed from: d2, reason: collision with root package name */
    public final android.content.res.TypedArray f63742d2;

    /* renamed from: e2, reason: collision with root package name */
    public androidx.recyclerview.widget.w2 f63743e2;

    /* renamed from: f2, reason: collision with root package name */
    public long f63744f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.h2 f63745g2;

    public DayPickerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int[] getBeginDate() {
        java.util.Calendar calendar;
        gn.d dVar = this.f63740b2;
        if (dVar == null || (calendar = dVar.f273566g) == null) {
            return null;
        }
        return new int[]{calendar.get(1), dVar.f273569m.intValue()};
    }

    public gn.a getController() {
        return this.f63741c2;
    }

    public int[] getNowDate() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        return new int[]{calendar.get(1), calendar.get(2)};
    }

    public gn.b getSelectedDays() {
        return this.f63740b2.f273567h;
    }

    public android.content.res.TypedArray getTypedArray() {
        return this.f63742d2;
    }

    public void setBeginDate(long j17) {
        this.f63744f2 = j17;
    }

    public void setScrolledCallback(com.tencent.mm.chatroom.ui.h2 h2Var) {
        this.f63745g2 = h2Var;
    }

    public void setUpAdapter(java.util.Collection<kn.a> collection) {
        if (this.f63740b2 == null) {
            this.f63740b2 = new gn.d(getContext(), this.f63741c2, this.f63742d2, this.f63744f2, collection);
        }
    }

    public DayPickerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f63744f2 = -1L;
        if (isInEditMode()) {
            return;
        }
        this.f63742d2 = context.obtainStyledAttributes(attributeSet, com.tencent.mm.chatroom.ui.f5.f64150a);
        setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -1));
        setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        this.f63743e2 = new com.tencent.mm.chatroom.ui.g2(this);
        setVerticalScrollBarEnabled(false);
        i(this.f63743e2);
        setFadingEdgeLength(0);
        setOverScrollMode(2);
    }
}
