package com.tencent.luggage.game.widget.input;

/* loaded from: classes7.dex */
public class WAGamePanelInputEditText extends android.widget.EditText {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.j4 f47262d;

    /* renamed from: e, reason: collision with root package name */
    public final android.text.InputFilter f47263e;

    /* renamed from: f, reason: collision with root package name */
    public int f47264f;

    /* renamed from: g, reason: collision with root package name */
    public final android.text.Spannable.Factory f47265g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f47266h;

    public WAGamePanelInputEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478237ee);
    }

    public static android.text.Spannable a(com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText, android.text.Spannable spannable) {
        wAGamePanelInputEditText.getClass();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        pInt.value = wAGamePanelInputEditText.f47264f;
        kl1.h hVar = (kl1.h) i95.n0.c(kl1.h.class);
        if (hVar == null) {
            hVar = kl1.b.f308743a;
        }
        return hVar.Oh(wAGamePanelInputEditText.getContext(), spannable, java.lang.Math.round(wAGamePanelInputEditText.getTextSize()), pInt, wAGamePanelInputEditText.f47265g);
    }

    public int getMaxLength() {
        return this.f47264f;
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions |= 268435456;
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void onEditorAction(int i17) {
        ie.d N;
        super.onEditorAction(i17);
        if ((i17 == 6 || i17 == 5 || i17 == 3 || i17 == 2 || i17 == 4) && (N = ie.d.N(this)) != null && N.f91676f) {
            clearFocus();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        ie.d N;
        super.onFocusChanged(z17, i17, rect);
        if (z17 || this.f47266h || !isAttachedToWindow() || getWindowToken() == null || (N = ie.d.N(this)) == null || !N.f91676f) {
            return;
        }
        this.f47266h = true;
        try {
            N.z();
        } finally {
            this.f47266h = false;
        }
    }

    public void setComposingDismissedListener(ml1.c cVar) {
        this.f47262d.f91506f = cVar;
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        android.text.InputFilter inputFilter = this.f47263e;
        if (inputFilter != null) {
            int i17 = 0;
            if (inputFilterArr == null) {
                inputFilterArr = new android.text.InputFilter[0];
            }
            android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length + 1];
            while (i17 < inputFilterArr.length) {
                inputFilterArr2[i17] = inputFilterArr[i17];
                i17++;
            }
            inputFilterArr2[i17] = inputFilter;
            inputFilterArr = inputFilterArr2;
        }
        super.setFilters(inputFilterArr);
    }

    public void setMaxLength(int i17) {
        this.f47264f = i17;
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z17) {
        int maxHeight = getMaxHeight();
        super.setSingleLine(z17);
        if (maxHeight > 0) {
            setMaxHeight(maxHeight);
        }
    }

    public WAGamePanelInputEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        ie.f fVar = new ie.f(this);
        this.f47263e = fVar;
        this.f47264f = Integer.MAX_VALUE;
        this.f47265g = new ie.g(this);
        this.f47266h = false;
        if (android.os.Build.VERSION.SDK_INT >= 35 && com.tencent.mm.ui.b4.b(getContext())) {
            setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.f47262d = new com.tencent.mm.plugin.appbrand.widget.input.j4(this);
        super.setEditableFactory(new ie.e(this));
        super.setFilters(new android.text.InputFilter[]{fVar});
    }
}
