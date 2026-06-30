package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.MMSpinnerDatePicker */
/* loaded from: classes9.dex */
public class C22630x1f521715 extends android.widget.DatePicker implements android.widget.DatePicker.OnDateChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.NumberPicker f292874d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.NumberPicker f292875e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.NumberPicker f292876f;

    /* renamed from: g, reason: collision with root package name */
    public int f292877g;

    public C22630x1f521715(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f292877g = 0;
        a();
    }

    public final void a() {
        setCalendarViewShown(false);
        android.content.res.Resources system = android.content.res.Resources.getSystem();
        int identifier = system.getIdentifier("year", dm.i4.f66865x76d1ec5a, com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        int identifier2 = system.getIdentifier("month", dm.i4.f66865x76d1ec5a, com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        int identifier3 = system.getIdentifier("day", dm.i4.f66865x76d1ec5a, com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        this.f292874d = (android.widget.NumberPicker) findViewById(identifier);
        this.f292875e = (android.widget.NumberPicker) findViewById(identifier2);
        this.f292876f = (android.widget.NumberPicker) findViewById(identifier3);
        android.view.View childAt = getChildAt(0);
        android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.width = -1;
        childAt.setLayoutParams(layoutParams);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f292874d.getLayoutParams();
        layoutParams2.topMargin = 0;
        layoutParams2.bottomMargin = 0;
        layoutParams2.leftMargin = 0;
        layoutParams2.rightMargin = 0;
        layoutParams2.weight = 1.0f;
        this.f292874d.setLayoutParams(layoutParams2);
        this.f292875e.setLayoutParams(layoutParams2);
        this.f292876f.setLayoutParams(layoutParams2);
        setDescendantFocusability(393216);
        m81390xc7abc553(2);
    }

    public final void b(android.widget.NumberPicker numberPicker, int i17) {
        if (numberPicker == null) {
            return;
        }
        android.widget.EditText editText = (android.widget.EditText) numberPicker.findViewById(android.content.res.Resources.getSystem().getIdentifier("numberpicker_input", dm.i4.f66865x76d1ec5a, com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f));
        editText.setTextSize(0, getResources().getDimension(i17));
        int textSize = (int) editText.getTextSize();
        try {
            java.lang.reflect.Field declaredField = android.widget.NumberPicker.class.getDeclaredField("mTextSize");
            declaredField.setAccessible(true);
            declaredField.set(numberPicker, java.lang.Integer.valueOf(textSize));
            java.lang.reflect.Field declaredField2 = android.widget.NumberPicker.class.getDeclaredField("mSelectorWheelPaint");
            declaredField2.setAccessible(true);
            android.graphics.Paint paint = (android.graphics.Paint) declaredField2.get(numberPicker);
            paint.setTextSize(textSize);
            declaredField2.set(numberPicker, paint);
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSpinnerDatePicker", e17, "", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSpinnerDatePicker", e18, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: getPickerMode */
    public int m81388x99877747() {
        return this.f292877g;
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public void onDateChanged(android.widget.DatePicker datePicker, int i17, int i18, int i19) {
    }

    /* renamed from: setOnDateChangeListener */
    public void m81389x6ac5db93(al5.a2 a2Var) {
    }

    /* renamed from: setPickerMode */
    public void m81390xc7abc553(int i17) {
        this.f292877g = i17;
        if (i17 == 0) {
            this.f292874d.setVisibility(0);
            this.f292875e.setVisibility(0);
            this.f292876f.setVisibility(0);
        } else if (i17 == 1) {
            this.f292874d.setVisibility(0);
            this.f292875e.setVisibility(0);
            this.f292876f.setVisibility(8);
        } else {
            this.f292874d.setVisibility(0);
            this.f292875e.setVisibility(8);
            this.f292876f.setVisibility(8);
        }
    }

    /* renamed from: setTextSize */
    public void m81391x3abfd950(int i17) {
        b(this.f292874d, i17);
        b(this.f292875e, i17);
        b(this.f292876f, i17);
    }

    public C22630x1f521715(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292877g = 0;
        a();
    }
}
