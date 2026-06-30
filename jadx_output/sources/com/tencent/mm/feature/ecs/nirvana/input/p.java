package com.tencent.mm.feature.ecs.nirvana.input;

/* loaded from: classes15.dex */
public class p implements io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate, io.flutter.embedding.engine.systemchannels.KeyboardChannel.KeyboardMethodHandler {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.nirvana.input.n[] f65783a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f65784b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.nirvana.input.o f65785c;

    public p(com.tencent.mm.feature.ecs.nirvana.input.o oVar) {
        this.f65785c = oVar;
        this.f65783a = new com.tencent.mm.feature.ecs.nirvana.input.n[]{new com.tencent.mm.feature.ecs.nirvana.input.g(oVar.getTextInputMethodJsApiDispatcher()), new com.tencent.mm.feature.ecs.nirvana.input.e((com.tencent.mm.feature.ecs.nirvana.input.h) ((jz5.n) oVar.getTextInputMethodJsApiDispatcher().f65803c).getValue())};
    }

    public final void a(android.view.KeyEvent keyEvent) {
        android.view.inputmethod.InputConnection inputConnection;
        com.tencent.mm.feature.ecs.nirvana.input.o oVar = this.f65785c;
        if (oVar != null) {
            com.tencent.mm.feature.ecs.nirvana.mb.view.MagicEcsNirvanaCanvasViewContainer magicEcsNirvanaCanvasViewContainer = (com.tencent.mm.feature.ecs.nirvana.mb.view.MagicEcsNirvanaCanvasViewContainer) oVar;
            magicEcsNirvanaCanvasViewContainer.getClass();
            kotlin.jvm.internal.o.g(keyEvent, "keyEvent");
            com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var = magicEcsNirvanaCanvasViewContainer.textInputPlugin;
            boolean z17 = false;
            if (c0Var.f65733b.isAcceptingText() && (inputConnection = c0Var.f65741j) != null) {
                if (inputConnection instanceof com.tencent.mm.feature.ecs.nirvana.input.d) {
                    com.tencent.mm.feature.ecs.nirvana.input.d dVar = (com.tencent.mm.feature.ecs.nirvana.input.d) inputConnection;
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
                                android.view.inputmethod.EditorInfo editorInfo = dVar.f65749e;
                                if ((editorInfo.inputType & 131072) == 0) {
                                    dVar.performEditorAction(editorInfo.imeOptions & 255);
                                    z17 = true;
                                }
                            }
                            com.tencent.mm.feature.ecs.nirvana.input.s sVar = dVar.f65748d;
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
                    z17 = ((com.tencent.mm.feature.ecs.nirvana.input.d) inputConnection).sendKeyEvent(keyEvent);
                }
            }
            if (z17) {
                return;
            }
            java.util.HashSet hashSet = this.f65784b;
            hashSet.add(keyEvent);
            com.tencent.mm.feature.ecs.nirvana.mb.view.MagicEcsNirvanaCanvasViewContainer magicEcsNirvanaCanvasViewContainer2 = (com.tencent.mm.feature.ecs.nirvana.mb.view.MagicEcsNirvanaCanvasViewContainer) oVar;
            magicEcsNirvanaCanvasViewContainer2.getClass();
            magicEcsNirvanaCanvasViewContainer2.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                io.flutter.Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.KeyboardChannel.KeyboardMethodHandler
    public java.util.Map getKeyboardState() {
        return java.util.Collections.unmodifiableMap(((com.tencent.mm.feature.ecs.nirvana.input.g) this.f65783a[0]).f65765a);
    }

    @Override // io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate
    public boolean handleEvent(android.view.KeyEvent keyEvent) {
        if (this.f65784b.remove(keyEvent)) {
            return false;
        }
        com.tencent.mm.feature.ecs.nirvana.input.n[] nVarArr = this.f65783a;
        if (nVarArr.length <= 0) {
            a(keyEvent);
            return true;
        }
        com.tencent.mm.feature.ecs.nirvana.input.l lVar = new com.tencent.mm.feature.ecs.nirvana.input.l(this, keyEvent);
        for (com.tencent.mm.feature.ecs.nirvana.input.n nVar : nVarArr) {
            nVar.a(keyEvent, new com.tencent.mm.feature.ecs.nirvana.input.k(lVar, null));
        }
        return true;
    }
}
