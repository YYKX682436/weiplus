package com.tencent.mm.plugin.collect.ui;

/* loaded from: classes9.dex */
public class DatePickerDialogView extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.collect.ui.CollectRadioBtnView f96420d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.collect.ui.CollectRadioBtnView f96421e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.collect.ui.CollectRadioBtnView f96422f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSpinnerDatePicker f96423g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f96424h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f96425i;

    /* renamed from: m, reason: collision with root package name */
    public int f96426m;

    public DatePickerDialogView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96426m = 0;
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488629yz, this);
        this.f96420d = (com.tencent.mm.plugin.collect.ui.CollectRadioBtnView) inflate.findViewById(com.tencent.mm.R.id.ptb);
        this.f96421e = (com.tencent.mm.plugin.collect.ui.CollectRadioBtnView) inflate.findViewById(com.tencent.mm.R.id.jqe);
        this.f96422f = (com.tencent.mm.plugin.collect.ui.CollectRadioBtnView) inflate.findViewById(com.tencent.mm.R.id.cqv);
        this.f96424h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c9z);
        this.f96425i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b5i);
        this.f96420d.setOnClickListener(this);
        this.f96421e.setOnClickListener(this);
        this.f96422f.setOnClickListener(this);
        this.f96420d.setTitleText("年");
        this.f96421e.setTitleText("月");
        this.f96422f.setTitleText("日");
        com.tencent.mm.ui.widget.MMSpinnerDatePicker mMSpinnerDatePicker = (com.tencent.mm.ui.widget.MMSpinnerDatePicker) inflate.findViewById(com.tencent.mm.R.id.cqt);
        this.f96423g = mMSpinnerDatePicker;
        mMSpinnerDatePicker.getClass();
        try {
            java.lang.reflect.Field declaredField = android.widget.NumberPicker.class.getDeclaredField("mSelectionDivider");
            declaredField.setAccessible(true);
            android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
            colorDrawable.setColor(mMSpinnerDatePicker.getResources().getColor(com.tencent.mm.R.color.a9e));
            declaredField.set(mMSpinnerDatePicker.f211341d, colorDrawable);
            declaredField.set(mMSpinnerDatePicker.f211342e, colorDrawable);
            declaredField.set(mMSpinnerDatePicker.f211343f, colorDrawable);
            mMSpinnerDatePicker.invalidate();
        } catch (java.lang.IllegalAccessException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", e17, "", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", e18, "", new java.lang.Object[0]);
        }
        this.f96423g.setTextSize(com.tencent.mm.R.dimen.f479897ia);
    }

    public final void b() {
        int i17 = this.f96426m;
        if (i17 == 2) {
            this.f96420d.setRadioSrc(com.tencent.mm.R.raw.radio_on);
            this.f96421e.setRadioSrc(com.tencent.mm.R.raw.radio_off);
            this.f96422f.setRadioSrc(com.tencent.mm.R.raw.radio_off);
        } else if (i17 == 1) {
            this.f96420d.setRadioSrc(com.tencent.mm.R.raw.radio_off);
            this.f96421e.setRadioSrc(com.tencent.mm.R.raw.radio_on);
            this.f96422f.setRadioSrc(com.tencent.mm.R.raw.radio_off);
        } else {
            this.f96420d.setRadioSrc(com.tencent.mm.R.raw.radio_off);
            this.f96421e.setRadioSrc(com.tencent.mm.R.raw.radio_off);
            this.f96422f.setRadioSrc(com.tencent.mm.R.raw.radio_on);
        }
        this.f96423g.setPickerMode(this.f96426m);
    }

    public int getDatePickerMode() {
        return this.f96423g.getPickerMode();
    }

    public int getDayOfMonth() {
        return this.f96423g.getDayOfMonth();
    }

    public int getMonth() {
        return this.f96423g.getMonth();
    }

    public int getYear() {
        return this.f96423g.getYear();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/DatePickerDialogView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        if (id6 == com.tencent.mm.R.id.ptb) {
            this.f96426m = 2;
        } else if (id6 == com.tencent.mm.R.id.jqe) {
            this.f96426m = 1;
        } else if (id6 == com.tencent.mm.R.id.cqv) {
            this.f96426m = 0;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.DatePickerDialogView", "unhandled click view: %s", view.getClass().toString());
        }
        b();
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/DatePickerDialogView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void setDatePickerMode(int i17) {
        this.f96426m = i17;
        b();
    }

    public void setOnCancelBtnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f96425i.setOnClickListener(onClickListener);
    }

    public void setOnOkBtnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f96424h.setOnClickListener(onClickListener);
    }

    public DatePickerDialogView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f96426m = 0;
        a(context);
    }
}
