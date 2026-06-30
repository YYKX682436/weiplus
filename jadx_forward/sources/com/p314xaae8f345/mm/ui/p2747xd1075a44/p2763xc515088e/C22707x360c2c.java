package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* renamed from: com.tencent.mm.ui.widget.picker.CustomTimePicker */
/* loaded from: classes15.dex */
public class C22707x360c2c extends android.widget.TimePicker {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.NumberPicker f293748d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.NumberPicker f293749e;

    /* renamed from: f, reason: collision with root package name */
    public final int f293750f;

    /* renamed from: g, reason: collision with root package name */
    public final int f293751g;

    /* renamed from: h, reason: collision with root package name */
    public final int f293752h;

    /* renamed from: i, reason: collision with root package name */
    public final int f293753i;

    public C22707x360c2c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(new android.view.ContextThemeWrapper(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576289ve), attributeSet);
        this.f293750f = -1;
        this.f293751g = -1;
        this.f293752h = -1;
        this.f293753i = -1;
        a();
    }

    public final void a() {
        setIs24HourView(java.lang.Boolean.TRUE);
        this.f293748d = b("mHourSpinner");
        this.f293749e = b("mMinuteSpinner");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.d(this.f293748d);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.d(this.f293749e);
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.auc);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.c(this.f293748d, drawable);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.c(this.f293749e, drawable);
        android.widget.NumberPicker numberPicker = this.f293748d;
        if (numberPicker != null) {
            numberPicker.setOnValueChangedListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.e(this));
        }
        android.widget.NumberPicker numberPicker2 = this.f293749e;
        if (numberPicker2 != null) {
            numberPicker2.setOnValueChangedListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.f(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.e(this.f293748d);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.e(this.f293749e);
    }

    public final android.widget.NumberPicker b(java.lang.String str) {
        try {
            java.lang.Object a17 = new com.p314xaae8f345.mm.ui.ak(this, "mDelegate", null).a();
            if (a17 != null) {
                return (android.widget.NumberPicker) new com.p314xaae8f345.mm.ui.ak(a17, str, null).a();
            }
            return null;
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.mm.ui.yk.d("CustomTimePicker", e17, "super_getNumberPickerApi21 IllegalAccessException", new java.lang.Object[0]);
            return null;
        } catch (java.lang.NoSuchFieldException e18) {
            com.p314xaae8f345.mm.ui.yk.d("CustomTimePicker", e18, "super_getNumberPickerApi21 NoSuchFieldException", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.a(this.f293748d);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.a(this.f293749e);
    }

    public C22707x360c2c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293750f = -1;
        this.f293751g = -1;
        this.f293752h = -1;
        this.f293753i = -1;
        a();
    }
}
