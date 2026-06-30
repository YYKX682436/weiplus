package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class a4 extends android.view.inputmethod.InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.inputmethod.InputConnection f172820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 f172821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var, android.view.inputmethod.InputConnection inputConnection, boolean z17, android.view.inputmethod.InputConnection inputConnection2) {
        super(inputConnection, z17);
        this.f172821b = e4Var;
        this.f172820a = inputConnection2;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            this.f172821b.v(charSequence.charAt(charSequence.length() - 1));
        }
        return super.commitText(charSequence, i17);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i17, int i18) {
        this.f172821b.v('\b');
        return super.deleteSurroundingText(i17, i18);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        android.view.inputmethod.InputConnection inputConnection = this.f172820a;
        boolean z17 = inputConnection instanceof android.view.inputmethod.BaseInputConnection;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var = this.f172821b;
        boolean e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.e(z17 ? ((android.view.inputmethod.BaseInputConnection) inputConnection).getEditable() : e4Var.getEditableText());
        boolean finishComposingText = super.finishComposingText();
        if (finishComposingText && e4Var.f172940d == this && e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j4 j4Var = e4Var.f172949p;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = j4Var.f173037d;
            java.lang.Runnable runnable = j4Var.f173040g;
            n3Var.mo50300x3fa464aa(runnable);
            if (j4Var.f173038e) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.g4) runnable).run();
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
            this.f172821b.v(charSequence.charAt(charSequence.length() - 1));
        }
        return super.setComposingText(charSequence, i17);
    }
}
