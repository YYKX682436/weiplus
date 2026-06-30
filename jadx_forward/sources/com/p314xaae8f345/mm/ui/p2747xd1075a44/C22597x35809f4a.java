package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.AutoMatchKeywordEditText */
/* loaded from: classes12.dex */
public class C22597x35809f4a extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 {
    public al5.e G;
    public int H;
    public int I;

    public C22597x35809f4a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.H = getSelectionStart();
        this.I = getSelectionEnd();
    }

    @Override // android.widget.EditText
    public void extendSelection(int i17) {
        super.extendSelection(i17);
        this.H = getSelectionStart();
        this.I = getSelectionEnd();
    }

    /* renamed from: getOnSelectionChangeListener */
    public al5.e m81249x5e0a619b() {
        return this.G;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, fl5.i
    /* renamed from: getRealEditText */
    public fl5.i mo61840xc52e48b() {
        return this;
    }

    @Override // android.widget.TextView
    public boolean moveCursorToVisibleOffset() {
        return super.moveCursorToVisibleOffset();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(android.view.DragEvent dragEvent) {
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.H == selectionStart && this.I == selectionEnd) {
            return;
        }
        this.H = selectionStart;
        this.I = selectionEnd;
        al5.e eVar = this.G;
        if (eVar != null) {
            ((com.p314xaae8f345.mm.ui.p2740x696c9db.l) eVar).a(this, getSelectionStart(), getSelectionEnd());
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i17, android.os.Bundle bundle) {
        return super.performAccessibilityAction(i17, bundle);
    }

    /* renamed from: setOnSelectionChangeListener */
    public void m81250xa7d6ba0f(al5.e eVar) {
        this.G = eVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, android.widget.EditText, fl5.i
    /* renamed from: setSelection */
    public void mo81549xf579a34a(int i17) {
        al5.e eVar;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.mo81549xf579a34a(i17);
        this.H = getSelectionStart();
        this.I = getSelectionEnd();
        if ((selectionStart == getSelectionStart() && selectionEnd == getSelectionEnd()) || (eVar = this.G) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.l) eVar).a(this, getSelectionStart(), getSelectionEnd());
    }

    public C22597x35809f4a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = getSelectionStart();
        this.I = getSelectionEnd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, android.widget.EditText
    public void setSelection(int i17, int i18) {
        al5.e eVar;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setSelection(i17, i18);
        this.H = getSelectionStart();
        this.I = getSelectionEnd();
        if ((selectionStart == getSelectionStart() && selectionEnd == getSelectionEnd()) || (eVar = this.G) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.l) eVar).a(this, getSelectionStart(), getSelectionEnd());
    }
}
