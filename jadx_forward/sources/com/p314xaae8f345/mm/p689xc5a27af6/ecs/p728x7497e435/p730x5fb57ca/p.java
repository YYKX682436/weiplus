package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* loaded from: classes15.dex */
public class p implements io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d.KeyboardDelegate, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28657x666876fc.KeyboardMethodHandler {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.n[] f147316a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f147317b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.o f147318c;

    public p(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.o oVar) {
        this.f147318c = oVar;
        this.f147316a = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.n[]{new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.g(oVar.mo44269x953b10d0()), new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.e((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.h) ((jz5.n) oVar.mo44269x953b10d0().f147336c).mo141623x754a37bb())};
    }

    public final void a(android.view.KeyEvent keyEvent) {
        android.view.inputmethod.InputConnection inputConnection;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.o oVar = this.f147318c;
        if (oVar != null) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.mb.p732x373aa5.AbstractC10540x771b4b57 abstractC10540x771b4b57 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.mb.p732x373aa5.AbstractC10540x771b4b57) oVar;
            abstractC10540x771b4b57.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyEvent, "keyEvent");
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c0 c0Var = abstractC10540x771b4b57.textInputPlugin;
            boolean z17 = false;
            if (c0Var.f147266b.isAcceptingText() && (inputConnection = c0Var.f147274j) != null) {
                if (inputConnection instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.d) {
                    com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.d dVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.d) inputConnection;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            z17 = dVar.c(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            z17 = dVar.c(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            z17 = dVar.d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            z17 = dVar.d(false, keyEvent.isShiftPressed());
                        } else {
                            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                                android.view.inputmethod.EditorInfo editorInfo = dVar.f147282e;
                                if ((editorInfo.inputType & 131072) == 0) {
                                    dVar.performEditorAction(editorInfo.imeOptions & 255);
                                    z17 = true;
                                }
                            }
                            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.s sVar = dVar.f147281d;
                            int selectionStart = android.text.Selection.getSelectionStart(sVar);
                            int selectionEnd = android.text.Selection.getSelectionEnd(sVar);
                            int unicodeChar = keyEvent.getUnicodeChar();
                            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                                int min = java.lang.Math.min(selectionStart, selectionEnd);
                                int max = java.lang.Math.max(selectionStart, selectionEnd);
                                dVar.beginBatchEdit();
                                if (min != max) {
                                    sVar.delete(min, max);
                                }
                                sVar.insert(min, (java.lang.CharSequence) java.lang.String.valueOf((char) unicodeChar));
                                int i17 = min + 1;
                                dVar.setSelection(i17, i17);
                                dVar.endBatchEdit();
                                z17 = true;
                            }
                        }
                    }
                } else {
                    z17 = ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.d) inputConnection).sendKeyEvent(keyEvent);
                }
            }
            if (z17) {
                return;
            }
            java.util.HashSet hashSet = this.f147317b;
            hashSet.add(keyEvent);
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.mb.p732x373aa5.AbstractC10540x771b4b57 abstractC10540x771b4b572 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.mb.p732x373aa5.AbstractC10540x771b4b57) oVar;
            abstractC10540x771b4b572.getClass();
            abstractC10540x771b4b572.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                io.p3284xd2ae381c.Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28657x666876fc.KeyboardMethodHandler
    /* renamed from: getKeyboardState */
    public java.util.Map mo44270x3f607534() {
        return java.util.Collections.unmodifiableMap(((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.g) this.f147316a[0]).f147298a);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d.KeyboardDelegate
    /* renamed from: handleEvent */
    public boolean mo44271x5797ad52(android.view.KeyEvent keyEvent) {
        if (this.f147317b.remove(keyEvent)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.n[] nVarArr = this.f147316a;
        if (nVarArr.length <= 0) {
            a(keyEvent);
            return true;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.l lVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.l(this, keyEvent);
        for (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.n nVar : nVarArr) {
            nVar.a(keyEvent, new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.k(lVar, null));
        }
        return true;
    }
}
