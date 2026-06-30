package com.p314xaae8f345.mm.p2776x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/view/MMEmojiCompatTextView;", "Landroid/widget/TextView;", "Lkg5/b;", "getEmojiTextViewProcessor", "", "getSizePx", "", "Landroid/text/InputFilter;", "filters", "Ljz5/f0;", "setFilters", "([Landroid/text/InputFilter;)V", "", "allCaps", "setAllCaps", "", "emojiTextProcessType", "setEmojiTextProcessType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.MMEmojiCompatTextView */
/* loaded from: classes15.dex */
public final class C22788x4b30ff3a extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public kg5.b f294859d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22788x4b30ff3a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getEmojiTextViewProcessor */
    private final kg5.b m82569xc952e290() {
        if (this.f294859d == null) {
            float m82570x2f5510df = m82570x2f5510df();
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.f294859d = new kg5.b(this, m82570x2f5510df, context);
        }
        kg5.b bVar = this.f294859d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bVar, "null cannot be cast to non-null type com.tencent.mm.ui.emoji.replace.EmojiTextProcessor");
        return bVar;
    }

    /* renamed from: getSizePx */
    private final float m82570x2f5510df() {
        return (getTextSize() * i65.a.q(getContext())) / i65.a.g(getContext());
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z17) {
        super.setAllCaps(z17);
        kg5.b m82569xc952e290 = m82569xc952e290();
        if (!z17) {
            m82569xc952e290.getClass();
            return;
        }
        android.widget.TextView textView = m82569xc952e290.f389271a;
        android.text.method.TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod == null || (transformationMethod instanceof android.text.method.PasswordTransformationMethod)) {
            return;
        }
        kg5.c cVar = transformationMethod instanceof kg5.c ? (kg5.c) transformationMethod : null;
        if (cVar == null) {
            cVar = new kg5.c(transformationMethod, m82569xc952e290.f389272b, m82569xc952e290.f389273c);
        }
        textView.setTransformationMethod(cVar);
    }

    /* renamed from: setEmojiTextProcessType */
    public final void m82571x94d47538(int i17) {
        android.text.InputFilter[] filters = m82569xc952e290().f389271a.getFilters();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(filters);
        for (android.text.InputFilter inputFilter : filters) {
            if (inputFilter instanceof kg5.a) {
                kg5.a aVar = (kg5.a) inputFilter;
                aVar.f389269e = i17;
                aVar.f389270f = true;
                return;
            }
        }
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] filters) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filters, "filters");
        kg5.b m82569xc952e290 = m82569xc952e290();
        m82569xc952e290.getClass();
        int length = filters.length;
        int length2 = filters.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length2) {
                android.text.InputFilter[] inputFilterArr = new android.text.InputFilter[filters.length + 1];
                java.lang.System.arraycopy(filters, 0, inputFilterArr, 0, length);
                inputFilterArr[length] = m82569xc952e290.f389274d;
                filters = inputFilterArr;
                break;
            }
            if (filters[i17] instanceof kg5.a) {
                break;
            } else {
                i17++;
            }
        }
        super.setFilters(filters);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22788x4b30ff3a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
