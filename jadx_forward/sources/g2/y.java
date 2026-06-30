package g2;

/* loaded from: classes14.dex */
public final class y implements android.view.inputmethod.InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final g2.m f349287a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f349288b;

    /* renamed from: c, reason: collision with root package name */
    public int f349289c;

    /* renamed from: d, reason: collision with root package name */
    public g2.e0 f349290d;

    /* renamed from: e, reason: collision with root package name */
    public int f349291e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f349292f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f349293g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f349294h;

    public y(g2.e0 initState, g2.m eventCallback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initState, "initState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventCallback, "eventCallback");
        this.f349287a = eventCallback;
        this.f349288b = z17;
        this.f349290d = initState;
        this.f349293g = new java.util.ArrayList();
        this.f349294h = true;
    }

    public final void a(g2.d dVar) {
        this.f349289c++;
        try {
            ((java.util.ArrayList) this.f349293g).add(dVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i17 = this.f349289c - 1;
        this.f349289c = i17;
        if (i17 == 0) {
            java.util.List list = this.f349293g;
            if (!list.isEmpty()) {
                java.util.List V0 = kz5.n0.V0(list);
                g2.j0 j0Var = (g2.j0) this.f349287a;
                j0Var.getClass();
                j0Var.f349246a.f349268d.mo146xb9724478(V0);
                ((java.util.ArrayList) list).clear();
            }
        }
        return this.f349289c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z17 = this.f349294h;
        if (!z17) {
            return z17;
        }
        this.f349289c++;
        return true;
    }

    public final void c(int i17) {
        sendKeyEvent(new android.view.KeyEvent(0, i17));
        sendKeyEvent(new android.view.KeyEvent(1, i17));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i17) {
        boolean z17 = this.f349294h;
        if (z17) {
            return false;
        }
        return z17;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        ((java.util.ArrayList) this.f349293g).clear();
        this.f349289c = 0;
        this.f349294h = false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        boolean z17 = this.f349294h;
        if (z17) {
            return false;
        }
        return z17;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i17, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputContentInfo, "inputContentInfo");
        boolean z17 = this.f349294h;
        if (z17) {
            return false;
        }
        return z17;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        boolean z17 = this.f349294h;
        return z17 ? this.f349288b : z17;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        boolean z17 = this.f349294h;
        if (z17) {
            a(new g2.a(java.lang.String.valueOf(charSequence), i17));
        }
        return z17;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i17, int i18) {
        boolean z17 = this.f349294h;
        if (!z17) {
            return z17;
        }
        a(new g2.b(i17, i18));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i17, int i18) {
        boolean z17 = this.f349294h;
        if (!z17) {
            return z17;
        }
        a(new g2.c(i17, i18));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z17 = this.f349294h;
        if (!z17) {
            return z17;
        }
        a(new g2.h());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i17) {
        g2.e0 e0Var = this.f349290d;
        return android.text.TextUtils.getCapsMode(e0Var.f349226a.f82214d, a2.m1.f(e0Var.f349227b), i17);
    }

    @Override // android.view.inputmethod.InputConnection
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i17) {
        boolean z17 = (i17 & 1) != 0;
        this.f349292f = z17;
        if (z17) {
            this.f349291e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return g2.q.a(this.f349290d);
    }

    @Override // android.view.inputmethod.InputConnection
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getSelectedText(int i17) {
        if (a2.m1.b(this.f349290d.f349227b)) {
            return null;
        }
        return g2.f0.a(this.f349290d).f82214d;
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextAfterCursor(int i17, int i18) {
        return g2.f0.b(this.f349290d, i17).f82214d;
    }

    @Override // android.view.inputmethod.InputConnection
    public java.lang.CharSequence getTextBeforeCursor(int i17, int i18) {
        return g2.f0.c(this.f349290d, i17).f82214d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i17) {
        boolean z17 = this.f349294h;
        if (z17) {
            z17 = false;
            switch (i17) {
                case android.R.id.selectAll:
                    a(new g2.b0(0, this.f349290d.f349226a.f82214d.length()));
                    break;
                case android.R.id.cut:
                    c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.k.f33927x366c91de);
                    break;
                case android.R.id.copy:
                    c(278);
                    break;
                case android.R.id.paste:
                    c(279);
                    break;
            }
        }
        return z17;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i17) {
        int i18;
        boolean z17 = this.f349294h;
        if (z17) {
            z17 = true;
            if (i17 != 0) {
                switch (i17) {
                    case 2:
                        i18 = 2;
                        break;
                    case 3:
                        i18 = 3;
                        break;
                    case 4:
                        i18 = 4;
                        break;
                    case 5:
                        i18 = 6;
                        break;
                    case 6:
                        i18 = 7;
                        break;
                    case 7:
                        i18 = 5;
                        break;
                }
                ((g2.j0) this.f349287a).f349246a.f349269e.mo146xb9724478(new g2.k(i18));
            }
            i18 = 1;
            ((g2.j0) this.f349287a).f349246a.f349269e.mo146xb9724478(new g2.k(i18));
        }
        return z17;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        boolean z17 = this.f349294h;
        if (z17) {
            return true;
        }
        return z17;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z17) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i17) {
        boolean z17 = this.f349294h;
        if (z17) {
            return false;
        }
        return z17;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        boolean z17 = this.f349294h;
        if (!z17) {
            return z17;
        }
        g2.j0 j0Var = (g2.j0) this.f349287a;
        j0Var.getClass();
        ((android.view.inputmethod.BaseInputConnection) j0Var.f349246a.f349273i.mo141623x754a37bb()).sendKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i17, int i18) {
        boolean z17 = this.f349294h;
        if (z17) {
            a(new g2.z(i17, i18));
        }
        return z17;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(java.lang.CharSequence charSequence, int i17) {
        boolean z17 = this.f349294h;
        if (z17) {
            a(new g2.a0(java.lang.String.valueOf(charSequence), i17));
        }
        return z17;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i17, int i18) {
        boolean z17 = this.f349294h;
        if (!z17) {
            return z17;
        }
        a(new g2.b0(i17, i18));
        return true;
    }
}
