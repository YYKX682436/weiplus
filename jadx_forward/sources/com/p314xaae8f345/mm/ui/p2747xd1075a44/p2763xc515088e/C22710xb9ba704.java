package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* renamed from: com.tencent.mm.ui.widget.picker.YADatePicker */
/* loaded from: classes15.dex */
public class C22710xb9ba704 extends android.widget.FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f293771e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.u0 f293772d;

    public C22710xb9ba704(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559750dv);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d;
        accessibilityEvent.getText().add(android.text.format.DateUtils.formatDateTime(x0Var.f293866b, x0Var.f293889r.getTimeInMillis(), 20));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704.class.getName();
    }

    /* renamed from: getCalendarView */
    public android.widget.CalendarView m82079x4bee6d79() {
        return ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d).f293882k;
    }

    /* renamed from: getCalendarViewShown */
    public boolean m82080xcc4aab18() {
        return ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d).f293882k.getVisibility() == 0;
    }

    /* renamed from: getDayOfMonth */
    public int mo82050xa7d8f7a3() {
        return ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d).f293889r.get(5);
    }

    /* renamed from: getFirstDayOfWeek */
    public int m82081xdb9c94d() {
        return ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d).f293882k.getFirstDayOfWeek();
    }

    /* renamed from: getMaxDate */
    public long m82082x7015f2fc() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d;
        x0Var.getClass();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(x0Var.f293882k.getMaxDate());
        return calendar.getTimeInMillis();
    }

    /* renamed from: getMinDate */
    public long m82083x7d2fccea() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d;
        x0Var.getClass();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(x0Var.f293882k.getMinDate());
        return calendar.getTimeInMillis();
    }

    /* renamed from: getMonth */
    public int mo82051x74d1c8ca() {
        return ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d).f293889r.get(2);
    }

    /* renamed from: getSpinnersShown */
    public boolean m82084x52149c01() {
        return ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d).f293878g.isShown();
    }

    /* renamed from: getUIDelegate */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.u0 m82085x1005540f() {
        return this.f293772d;
    }

    /* renamed from: getYear */
    public int mo82052xfb87f0b3() {
        return ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d).f293889r.get(1);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d).f293890s;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d;
        x0Var.getClass();
        x0Var.a(configuration.locale);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d;
        accessibilityEvent.getText().add(android.text.format.DateUtils.formatDateTime(x0Var.f293866b, x0Var.f293889r.getTimeInMillis(), 20));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.View.BaseSavedState baseSavedState = (android.view.View.BaseSavedState) parcelable;
        super.onRestoreInstanceState(baseSavedState.getSuperState());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d;
        x0Var.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704.SavedState savedState = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704.SavedState) baseSavedState;
        x0Var.d(savedState.f293773d, savedState.f293774e, savedState.f293775f);
        x0Var.i();
        x0Var.h();
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d;
        x0Var.getClass();
        return new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704.SavedState(onSaveInstanceState, x0Var.f293889r.get(1), x0Var.f293889r.get(2), x0Var.f293889r.get(5), null);
    }

    /* renamed from: setCalendarViewShown */
    public void m82086xa7e0b78c(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d;
        x0Var.getClass();
        x0Var.f293882k.setVisibility(z17 ? 0 : 8);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.u0 u0Var = this.f293772d;
        if (((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) u0Var).f293890s == z17) {
            return;
        }
        super.setEnabled(z17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) u0Var;
        x0Var.f293875d.setEnabled(z17);
        x0Var.f293876e.setEnabled(z17);
        x0Var.f293877f.setEnabled(z17);
        x0Var.f293882k.setEnabled(z17);
        x0Var.f293890s = z17;
    }

    /* renamed from: setFirstDayOfWeek */
    public void m82087xd5b03159(int i17) {
        if (i17 < 1 || i17 > 7) {
            throw new java.lang.IllegalArgumentException("firstDayOfWeek must be between 1 and 7");
        }
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d).f293882k.setFirstDayOfWeek(i17);
    }

    /* renamed from: setMaxDate */
    public void mo82053xe3874070(long j17) {
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d).f(j17);
    }

    /* renamed from: setMinDate */
    public void mo82054xf0a11a5e(long j17) {
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d).g(j17);
    }

    /* renamed from: setSpinnersShown */
    public void m82088xe4eb0275(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) this.f293772d;
        x0Var.getClass();
        x0Var.f293878g.setVisibility(z17 ? 0 : 8);
    }

    /* renamed from: setValidationCallback */
    public void m82089x9e1627e0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.z0 z0Var) {
        this.f293772d.getClass();
    }

    public C22710xb9ba704(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293772d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0(this, context, attributeSet, i17, 0);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544632f, i17, 0);
        int i18 = obtainStyledAttributes.getInt(6, 0);
        obtainStyledAttributes.recycle();
        if (i18 != 0) {
            m82087xd5b03159(i18);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.YADatePicker$SavedState */
    /* loaded from: classes15.dex */
    public static class SavedState extends android.view.View.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704.SavedState> f39756x681a0c0c = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.y0();

        /* renamed from: d, reason: collision with root package name */
        public final int f293773d;

        /* renamed from: e, reason: collision with root package name */
        public final int f293774e;

        /* renamed from: f, reason: collision with root package name */
        public final int f293775f;

        public SavedState(android.os.Parcelable parcelable, int i17, int i18, int i19, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.s0 s0Var) {
            super(parcelable);
            this.f293773d = i17;
            this.f293774e = i18;
            this.f293775f = i19;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f293773d);
            parcel.writeInt(this.f293774e);
            parcel.writeInt(this.f293775f);
        }

        public SavedState(android.os.Parcel parcel, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.s0 s0Var) {
            super(parcel);
            this.f293773d = parcel.readInt();
            this.f293774e = parcel.readInt();
            this.f293775f = parcel.readInt();
        }
    }
}
