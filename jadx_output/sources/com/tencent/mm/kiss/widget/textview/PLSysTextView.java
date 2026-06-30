package com.tencent.mm.kiss.widget.textview;

/* loaded from: classes4.dex */
public class PLSysTextView extends com.tencent.mm.kiss.widget.textview.SysTextView {
    public PLSysTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.kiss.widget.textview.SysTextView
    public void e() {
    }

    @Override // com.tencent.mm.kiss.widget.textview.SysTextView
    public void g() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getLayoutWrapper() != null) {
            getLayoutWrapper().f328601a = false;
        }
    }

    @Override // com.tencent.mm.kiss.widget.textview.SysTextView, android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.tencent.mm.kiss.widget.textview.SysTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    @Override // com.tencent.mm.kiss.widget.textview.SysTextView, android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        if (com.tencent.mm.sdk.platformtools.t8.J0(charSequence)) {
            return;
        }
        if (getLayoutWrapper() != null && getLayoutWrapper().f328601a) {
            mm0.c.f328575b.c(getConfig(), getLayoutWrapper());
        }
        mm0.g b17 = mm0.c.f328575b.b(getConfig(), charSequence);
        if (b17 != null) {
            setTextLayout(b17);
        } else {
            h(charSequence, false);
        }
    }

    public PLSysTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
