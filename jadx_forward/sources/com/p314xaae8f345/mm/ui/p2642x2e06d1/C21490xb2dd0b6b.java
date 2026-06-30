package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMFormInputView */
/* loaded from: classes5.dex */
public class C21490xb2dd0b6b extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f278890d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f278891e;

    /* renamed from: f, reason: collision with root package name */
    public final int f278892f;

    /* renamed from: g, reason: collision with root package name */
    public final int f278893g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f278894h;

    public C21490xb2dd0b6b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f278892f = -1;
        this.f278893g = -1;
        this.f278894h = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544635i, i17, 0);
        this.f278893g = obtainStyledAttributes.getResourceId(1, -1);
        this.f278892f = obtainStyledAttributes.getResourceId(3, -1);
        int resourceId = obtainStyledAttributes.getResourceId(2, -1);
        obtainStyledAttributes.recycle();
        android.view.View.inflate(context, resourceId, this);
    }

    public void a(android.text.TextWatcher textWatcher) {
        android.widget.EditText editText;
        if (textWatcher == null || (editText = this.f278891e) == null) {
            com.p314xaae8f345.mm.ui.yk.f("MicroMsg.MMFormInputView", "watcher : %s, contentET : %s", textWatcher, this.f278891e);
        } else {
            editText.addTextChangedListener(textWatcher);
        }
    }

    /* renamed from: getContentEditText */
    public android.widget.EditText m78930xd454f3ba() {
        return this.f278891e;
    }

    /* renamed from: getText */
    public android.text.Editable m78931xfb85ada3() {
        android.widget.EditText editText = this.f278891e;
        if (editText != null) {
            return editText.getText();
        }
        com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMFormInputView", "contentET is null!", new java.lang.Object[0]);
        return null;
    }

    /* renamed from: getTitleTextView */
    public android.widget.TextView m78932xc6410034() {
        return this.f278890d;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        this.f278890d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.f278891e = editText;
        android.widget.TextView textView = this.f278890d;
        if (textView == null || editText == null) {
            com.p314xaae8f345.mm.ui.yk.f("MicroMsg.MMFormInputView", "titleTV : %s, contentET : %s", textView, editText);
        } else {
            int i17 = this.f278892f;
            if (i17 != -1) {
                textView.setText(i17);
            }
            int i18 = this.f278893g;
            if (i18 != -1) {
                this.f278891e.setHint(i18);
            }
        }
        android.widget.EditText editText2 = this.f278891e;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(new db5.b2(this));
        }
    }

    /* renamed from: setFocusListener */
    public void m78933xd748486a(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f278894h = onFocusChangeListener;
    }

    /* renamed from: setHint */
    public void m78935x764b0e09(java.lang.String str) {
        android.widget.EditText editText = this.f278891e;
        if (editText != null) {
            editText.setHint(str);
        } else {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMFormInputView", "contentET is null!", new java.lang.Object[0]);
        }
    }

    /* renamed from: setImeOption */
    public void m78936xd2b7a954(int i17) {
        android.widget.EditText editText = this.f278891e;
        if (editText != null) {
            editText.setImeOptions(i17);
        } else {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMFormInputView", "contentET is null!", new java.lang.Object[0]);
        }
    }

    /* renamed from: setInputType */
    public void m78937xc17f97e2(int i17) {
        android.widget.EditText editText = this.f278891e;
        if (editText != null) {
            editText.setInputType(i17);
        } else {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMFormInputView", "contentET is null!", new java.lang.Object[0]);
        }
    }

    /* renamed from: setText */
    public void m78938x765074af(java.lang.String str) {
        android.widget.EditText editText = this.f278891e;
        if (editText != null) {
            editText.setText(str);
        } else {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMFormInputView", "contentET is null!", new java.lang.Object[0]);
        }
    }

    /* renamed from: setTitle */
    public void m78940x53bfe316(java.lang.String str) {
        android.widget.TextView textView = this.f278890d;
        if (textView != null) {
            textView.setText(str);
        } else {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMFormInputView", "titleTV is null!", new java.lang.Object[0]);
        }
    }

    /* renamed from: setHint */
    public void m78934x764b0e09(int i17) {
        android.widget.EditText editText = this.f278891e;
        if (editText != null) {
            editText.setHint(i17);
        } else {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMFormInputView", "contentET is null!", new java.lang.Object[0]);
        }
    }

    /* renamed from: setTitle */
    public void m78939x53bfe316(int i17) {
        android.widget.TextView textView = this.f278890d;
        if (textView != null) {
            textView.setText(i17);
        } else {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMFormInputView", "titleTV is null!", new java.lang.Object[0]);
        }
    }

    public C21490xb2dd0b6b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
