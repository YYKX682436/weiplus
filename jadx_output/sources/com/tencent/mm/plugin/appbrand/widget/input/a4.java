package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class a4 extends android.view.inputmethod.InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.inputmethod.InputConnection f91287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.e4 f91288b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var, android.view.inputmethod.InputConnection inputConnection, boolean z17, android.view.inputmethod.InputConnection inputConnection2) {
        super(inputConnection, z17);
        this.f91288b = e4Var;
        this.f91287a = inputConnection2;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            this.f91288b.v(charSequence.charAt(charSequence.length() - 1));
        }
        return super.commitText(charSequence, i17);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i17, int i18) {
        this.f91288b.v('\b');
        return super.deleteSurroundingText(i17, i18);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        android.view.inputmethod.InputConnection inputConnection = this.f91287a;
        boolean z17 = inputConnection instanceof android.view.inputmethod.BaseInputConnection;
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = this.f91288b;
        boolean e17 = com.tencent.mm.plugin.appbrand.widget.input.m5.e(z17 ? ((android.view.inputmethod.BaseInputConnection) inputConnection).getEditable() : e4Var.getEditableText());
        boolean finishComposingText = super.finishComposingText();
        if (finishComposingText && e4Var.f91407d == this && e17) {
            com.tencent.mm.plugin.appbrand.widget.input.j4 j4Var = e4Var.f91416p;
            com.tencent.mm.sdk.platformtools.n3 n3Var = j4Var.f91504d;
            java.lang.Runnable runnable = j4Var.f91507g;
            n3Var.removeCallbacks(runnable);
            if (j4Var.f91505e) {
                ((com.tencent.mm.plugin.appbrand.widget.input.g4) runnable).run();
            }
        }
        return finishComposingText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextAfterCursor(int i17, int i18) {
        try {
            return super.getTextAfterCursor(i17, i18);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextBeforeCursor(int i17, int i18) {
        try {
            return super.getTextBeforeCursor(i17, i18);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(java.lang.CharSequence charSequence, int i17) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            this.f91288b.v(charSequence.charAt(charSequence.length() - 1));
        }
        return super.setComposingText(charSequence, i17);
    }
}
