package com.tencent.mm.plugin.appbrand.widget.picker;

/* loaded from: classes15.dex */
public final class AppBrandTimePicker extends android.widget.TimePicker implements com.tencent.mm.plugin.appbrand.jsapi.picker.f {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f91812m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.NumberPicker f91813d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.NumberPicker f91814e;

    /* renamed from: f, reason: collision with root package name */
    public final int f91815f;

    /* renamed from: g, reason: collision with root package name */
    public final int f91816g;

    /* renamed from: h, reason: collision with root package name */
    public final int f91817h;

    /* renamed from: i, reason: collision with root package name */
    public final int f91818i;

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|2|3|(10:5|6|7|8|(2:10|11)|13|(1:15)|(1:17)|18|19)|23|6|7|8|(0)|13|(0)|(0)|18|19) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[Catch: Exception -> 0x0051, TRY_LEAVE, TryCatch #1 {Exception -> 0x0051, blocks: (B:8:0x003a, B:10:0x0045), top: B:7:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBrandTimePicker(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "mDelegate"
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r2 = 2131821742(0x7f1104ae, float:1.9276236E38)
            r1.<init>(r5, r2)
            r4.<init>(r1)
            r5 = -1
            r4.f91815f = r5
            r4.f91816g = r5
            r4.f91817h = r5
            r4.f91818i = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.setIs24HourView(r5)
            java.lang.String r5 = "mHourSpinner"
            r1 = 0
            yo.b r2 = new yo.b     // Catch: java.lang.Exception -> L35
            r2.<init>(r4, r0, r1)     // Catch: java.lang.Exception -> L35
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Exception -> L35
            if (r2 == 0) goto L35
            yo.b r3 = new yo.b     // Catch: java.lang.Exception -> L35
            r3.<init>(r2, r5, r1)     // Catch: java.lang.Exception -> L35
            java.lang.Object r5 = r3.a()     // Catch: java.lang.Exception -> L35
            android.widget.NumberPicker r5 = (android.widget.NumberPicker) r5     // Catch: java.lang.Exception -> L35
            goto L36
        L35:
            r5 = r1
        L36:
            r4.f91813d = r5
            java.lang.String r2 = "mMinuteSpinner"
            yo.b r3 = new yo.b     // Catch: java.lang.Exception -> L51
            r3.<init>(r4, r0, r1)     // Catch: java.lang.Exception -> L51
            java.lang.Object r0 = r3.a()     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L51
            yo.b r3 = new yo.b     // Catch: java.lang.Exception -> L51
            r3.<init>(r0, r2, r1)     // Catch: java.lang.Exception -> L51
            java.lang.Object r0 = r3.a()     // Catch: java.lang.Exception -> L51
            android.widget.NumberPicker r0 = (android.widget.NumberPicker) r0     // Catch: java.lang.Exception -> L51
            r1 = r0
        L51:
            r4.f91814e = r1
            com.tencent.mm.ui.widget.picker.q0.d(r5)
            com.tencent.mm.ui.widget.picker.q0.d(r1)
            tl1.b0.a(r5)
            tl1.b0.a(r1)
            android.content.res.Resources r0 = r4.getResources()
            r2 = 2131231118(0x7f08018e, float:1.8078308E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            com.tencent.mm.ui.widget.picker.q0.c(r5, r0)
            com.tencent.mm.ui.widget.picker.q0.c(r1, r0)
            if (r5 == 0) goto L7a
            tl1.w r0 = new tl1.w
            r0.<init>(r4)
            r5.setOnValueChangedListener(r0)
        L7a:
            if (r1 == 0) goto L84
            tl1.x r0 = new tl1.x
            r0.<init>(r4)
            r1.setOnValueChangedListener(r0)
        L84:
            com.tencent.mm.ui.widget.picker.q0.e(r5)
            com.tencent.mm.ui.widget.picker.q0.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePicker.<init>(android.content.Context):void");
    }

    public final void a() {
        int i17 = this.f91815f;
        boolean z17 = i17 >= 0 && i17 <= 23;
        android.widget.NumberPicker numberPicker = this.f91813d;
        android.widget.NumberPicker numberPicker2 = this.f91814e;
        if (z17) {
            int i18 = this.f91816g;
            if ((i18 >= 0 && i18 <= 59) && numberPicker != null && numberPicker2 != null) {
                if (numberPicker.getValue() == i17) {
                    numberPicker2.setMinValue(i18);
                } else {
                    numberPicker2.setMinValue(0);
                }
            }
        }
        int i19 = this.f91817h;
        if (!(i19 >= 0 && i19 <= 23) || numberPicker == null || numberPicker2 == null) {
            return;
        }
        if (numberPicker.getValue() == i19) {
            numberPicker2.setMaxValue(this.f91818i);
        } else {
            numberPicker2.setMaxValue(59);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public java.lang.Object currentValue() {
        return java.lang.String.format(java.util.Locale.US, "%02d:%02d", getCurrentHour(), getCurrentMinute());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public android.view.View getView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onAttach(tl1.v vVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.ui.widget.picker.q0.a(this.f91813d);
        com.tencent.mm.ui.widget.picker.q0.a(this.f91814e);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onDetach(tl1.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onHide(tl1.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onShow(tl1.v vVar) {
    }

    @Override // android.widget.TimePicker
    public void setCurrentHour(java.lang.Integer num) {
        super.setCurrentHour(java.lang.Integer.valueOf(num == null ? 0 : num.intValue()));
        a();
    }

    @Override // android.widget.TimePicker
    public void setCurrentMinute(java.lang.Integer num) {
        super.setCurrentMinute(java.lang.Integer.valueOf(num == null ? 0 : num.intValue()));
        a();
    }
}
