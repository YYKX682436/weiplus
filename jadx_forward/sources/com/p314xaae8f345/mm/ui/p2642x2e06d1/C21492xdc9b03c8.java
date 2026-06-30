package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMFormSelectorView */
/* loaded from: classes5.dex */
public class C21492xdc9b03c8 extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f278901d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f278902e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f278903f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f278904g;

    public C21492xdc9b03c8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544635i, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            this.f278903f = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            this.f278904g = context.getString(resourceId2);
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, -1);
        obtainStyledAttributes.recycle();
        android.view.View.inflate(context, resourceId3, this);
    }

    /* renamed from: getText */
    public java.lang.String m78949xfb85ada3() {
        android.widget.EditText editText = this.f278902e;
        if (editText != null) {
            return editText.getText().toString();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormSelectorView", "contentET is null!");
        return null;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        this.f278901d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.f278902e = editText;
        android.widget.TextView textView = this.f278901d;
        if (textView == null || editText == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMFormSelectorView", "titleTV : %s, contentET : %s", textView, editText);
            return;
        }
        java.lang.String str = this.f278903f;
        if (str != null) {
            textView.setText(str);
        }
        java.lang.String str2 = this.f278904g;
        if (str2 != null) {
            this.f278902e.setHint(str2);
        }
    }

    /* renamed from: setHint */
    public void m78951x764b0e09(java.lang.String str) {
        android.widget.EditText editText = this.f278902e;
        if (editText != null) {
            editText.setHint(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormSelectorView", "contentET is null!");
        }
    }

    /* renamed from: setText */
    public void m78952x765074af(java.lang.String str) {
        android.widget.EditText editText = this.f278902e;
        if (editText != null) {
            editText.setText(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormSelectorView", "contentET is null!");
        }
    }

    /* renamed from: setTitle */
    public void m78954x53bfe316(java.lang.String str) {
        android.widget.TextView textView = this.f278901d;
        if (textView != null) {
            textView.setText(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormSelectorView", "titleTV is null!");
        }
    }

    /* renamed from: setHint */
    public void m78950x764b0e09(int i17) {
        android.widget.EditText editText = this.f278902e;
        if (editText != null) {
            editText.setHint(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormSelectorView", "contentET is null!");
        }
    }

    /* renamed from: setTitle */
    public void m78953x53bfe316(int i17) {
        android.widget.TextView textView = this.f278901d;
        if (textView != null) {
            textView.setText(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMFormSelectorView", "titleTV is null!");
        }
    }

    public C21492xdc9b03c8(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
