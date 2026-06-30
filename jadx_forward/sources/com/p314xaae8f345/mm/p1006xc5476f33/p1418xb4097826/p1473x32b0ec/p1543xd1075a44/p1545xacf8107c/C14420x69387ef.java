package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1545xacf8107c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0007¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautySlider;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "<set-?>", "z", "D", "getMinimum", "()D", "minimum", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, "getMaximum", "maximum", "B", "getDefault", "default", "Lkotlin/Function1;", "Ljz5/f0;", "C", "Lyz5/l;", "getValueChangedHandler", "()Lyz5/l;", "setValueChangedHandler", "(Lyz5/l;)V", "valueChangedHandler", "getValue", "value", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.beauty.FinderLiveBeautySlider */
/* loaded from: classes14.dex */
public final class C14420x69387ef extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 {

    /* renamed from: A, reason: from kotlin metadata */
    public double maximum;

    /* renamed from: B, reason: from kotlin metadata */
    public double default;

    /* renamed from: C, reason: from kotlin metadata */
    public yz5.l valueChangedHandler;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2766x75877a9b.C22719x5a74f320 f199404v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f199405w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f199406x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Object f199407y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public double minimum;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14420x69387ef(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void A(double d17, double d18, double d19, double d27) {
        this.minimum = d17;
        this.maximum = d18;
        boolean z17 = d17 * d18 < 0.0d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2766x75877a9b.C22719x5a74f320 c22719x5a74f320 = this.f199404v;
        c22719x5a74f320.m82176xb42985fc(z17);
        double d28 = e06.p.d(d27, this.minimum, this.maximum);
        double d29 = this.minimum;
        double d37 = (d28 - d29) / (this.maximum - d29);
        c22719x5a74f320.setProgress(a06.d.a(100 * d37));
        B(d28, d37);
        this.default = d19;
        double d38 = e06.p.d(d19, this.minimum, this.maximum);
        double d39 = this.minimum;
        double d47 = (d38 - d39) / (this.maximum - d39);
        android.view.View view = this.f199406x;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
        layoutParams2.f92448z = (float) d47;
        view.setLayoutParams(layoutParams2);
    }

    public final void B(double d17, double d18) {
        java.lang.String str;
        int a17 = a06.d.a(d17 * 100);
        if (a17 < 0) {
            str = java.lang.String.valueOf(a17);
        } else if (a17 > 0) {
            str = "+" + a17;
        } else {
            str = "0";
        }
        android.widget.TextView textView = this.f199405w;
        textView.setText(str);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
        layoutParams2.f92448z = (float) d18;
        textView.setLayoutParams(layoutParams2);
    }

    public final double getDefault() {
        return this.default;
    }

    public final double getMaximum() {
        return this.maximum;
    }

    public final double getMinimum() {
        return this.minimum;
    }

    /* renamed from: getValue */
    public final double m57969x754a37bb() {
        return this.minimum + ((this.f199404v.getProgress() / 100.0d) * (this.maximum - this.minimum));
    }

    public final yz5.l getValueChangedHandler() {
        return this.valueChangedHandler;
    }

    /* renamed from: setValueChangedHandler */
    public final void m57971x5109fa05(yz5.l lVar) {
        this.valueChangedHandler = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14420x69387ef(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f199407y = context.getSystemService("vibrator");
        wm2.b bVar = new wm2.b(this);
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570394e91, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.vlg);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2766x75877a9b.C22719x5a74f320 c22719x5a74f320 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2766x75877a9b.C22719x5a74f320) findViewById;
        c22719x5a74f320.setMax(100);
        c22719x5a74f320.setOnSeekBarChangeListener(bVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        this.f199404v = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2766x75877a9b.C22719x5a74f320) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.vlf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f199405w = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.vld);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f199406x = findViewById3;
        this.maximum = 1.0d;
    }
}
