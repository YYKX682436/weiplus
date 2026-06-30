package gl5;

/* loaded from: classes15.dex */
public class j extends android.view.inputmethod.BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 f354552a;

    /* renamed from: b, reason: collision with root package name */
    public int f354553b;

    public j(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023) {
        super(viewTreeObserverOnPreDrawListenerC22668xe0605023, true);
        this.f354552a = viewTreeObserverOnPreDrawListenerC22668xe0605023;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        synchronized (this) {
            if (this.f354553b < 0) {
                return false;
            }
            this.f354552a.u();
            this.f354553b++;
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i17) {
        android.text.Editable editable = getEditable();
        if (editable == null) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.f354552a;
        android.text.method.KeyListener m81659xded63efd = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81659xded63efd();
        if (m81659xded63efd == null) {
            return true;
        }
        try {
            m81659xded63efd.clearMetaKeyState(viewTreeObserverOnPreDrawListenerC22668xe0605023, editable, i17);
            return true;
        } catch (java.lang.AbstractMethodError unused) {
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        synchronized (this) {
            while (this.f354553b > 0) {
                endBatchEdit();
            }
            this.f354553b = -1;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        java.util.Objects.toString(completionInfo);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.f354552a;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.u();
        viewTreeObserverOnPreDrawListenerC22668xe0605023.getClass();
        viewTreeObserverOnPreDrawListenerC22668xe0605023.G();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        java.util.Objects.toString(correctionInfo);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.f354552a;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.u();
        gl5.e0 e0Var = viewTreeObserverOnPreDrawListenerC22668xe0605023.f293122g2;
        if (e0Var != null) {
            gl5.o oVar = e0Var.f354484i;
            if (oVar == null) {
                e0Var.f354484i = new gl5.o(e0Var);
            } else {
                oVar.a(false);
            }
            gl5.o oVar2 = e0Var.f354484i;
            oVar2.getClass();
            int offset = correctionInfo.getOffset();
            oVar2.f354583c = offset;
            oVar2.f354584d = offset + correctionInfo.getNewText().length();
            oVar2.f354585e = android.os.SystemClock.uptimeMillis();
            if (oVar2.f354583c < 0 || oVar2.f354584d < 0) {
                oVar2.f354587g.f354484i = null;
            }
        }
        viewTreeObserverOnPreDrawListenerC22668xe0605023.G();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        if (this.f354552a == null) {
            return super.commitText(charSequence, i17);
        }
        try {
            return super.commitText(charSequence, i17);
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("cmEdit.EditableInputConnection", "commitText err:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
            fl5.b.a(6);
            return false;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        synchronized (this) {
            if (this.f354553b <= 0) {
                return false;
            }
            this.f354552a.G();
            this.f354553b--;
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public android.text.Editable getEditable() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.f354552a;
        if (viewTreeObserverOnPreDrawListenerC22668xe0605023 != null) {
            return viewTreeObserverOnPreDrawListenerC22668xe0605023.m81636x4ef76827();
        }
        return null;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.f354552a;
        if (viewTreeObserverOnPreDrawListenerC22668xe0605023 == null) {
            return null;
        }
        android.view.inputmethod.ExtractedText extractedText = new android.view.inputmethod.ExtractedText();
        viewTreeObserverOnPreDrawListenerC22668xe0605023.D();
        if (!viewTreeObserverOnPreDrawListenerC22668xe0605023.f293122g2.f(extractedTextRequest, -1, -1, -1, extractedText)) {
            return null;
        }
        if ((i17 & 1) != 0) {
            viewTreeObserverOnPreDrawListenerC22668xe0605023.m81740x4930e5c3(extractedTextRequest);
        }
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.f354552a;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.u();
        viewTreeObserverOnPreDrawListenerC22668xe0605023.c0(i17);
        viewTreeObserverOnPreDrawListenerC22668xe0605023.G();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i17) {
        this.f354552a.Z(i17);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        this.f354552a.a0(str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i17) {
        if ((i17 & (-4)) != 0) {
            return false;
        }
        return false;
    }
}
