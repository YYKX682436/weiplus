package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u001d\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR*\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "value", "d2", "J", "getTotalDuration", "()J", "setTotalDuration", "(J)V", "totalDuration", "", "e2", "D", "getWidthPerMills", "()D", "widthPerMills", "f2", "getProgress", "setProgress", "progress", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sm3/i0", "sm3/j0", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.widget.TimeSpansView */
/* loaded from: classes5.dex */
public final class C16710x83571841 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f233584b2;

    /* renamed from: c2, reason: collision with root package name */
    public final double f233585c2;

    /* renamed from: d2, reason: collision with root package name and from kotlin metadata */
    public long totalDuration;

    /* renamed from: e2, reason: collision with root package name and from kotlin metadata */
    public final double widthPerMills;

    /* renamed from: f2, reason: collision with root package name and from kotlin metadata */
    public long progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16710x83571841(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false);
        this.f233584b2 = c1162x665295de;
        this.f233585c2 = 5000.0d;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c4o, (android.view.ViewGroup) null, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        new sm3.i0(inflate).f491409d.setText("00:00");
        inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        this.widthPerMills = inflate.getMeasuredWidth() / 5000.0d;
        mo7960x6cab2c8d(new sm3.j0(this));
        mo7967x900dcbe1(c1162x665295de);
        setClipChildren(false);
        setClipToPadding(false);
        i(new sm3.h0());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public final void g1(int i17, int i18) {
        double d17 = this.totalDuration;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7946xf939df19());
        int i19 = i17 / 2;
        setPadding(i19, 0, ((int) ((d17 - (r8.mo1894x7e414b06() * this.f233585c2)) * this.widthPerMills)) + i19, 0);
    }

    public final long getProgress() {
        return this.progress;
    }

    public final long getTotalDuration() {
        return this.totalDuration;
    }

    public final double getWidthPerMills() {
        return this.widthPerMills;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        g1(i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: setProgress */
    public final void m67435x3ae760af(long j17) {
        this.progress = j17;
        double d17 = j17;
        double d18 = this.f233585c2;
        int i17 = (int) (d17 / d18);
        double d19 = (d17 - (d18 * i17)) * this.widthPerMills;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f233584b2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(-((int) d19)));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView", "setProgress", "(J)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView", "setProgress", "(J)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    /* renamed from: setTotalDuration */
    public final void m67436xdb0e2bb6(long j17) {
        this.totalDuration = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeSpansView", "setup duration: " + this.totalDuration);
        g1(getWidth(), getHeight());
    }
}
