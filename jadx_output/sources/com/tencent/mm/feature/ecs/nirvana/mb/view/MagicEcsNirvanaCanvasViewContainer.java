package com.tencent.mm.feature.ecs.nirvana.mb.view;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/tencent/mm/feature/ecs/nirvana/mb/view/MagicEcsNirvanaCanvasViewContainer;", "Lzq0/a;", "Lcom/tencent/mm/feature/ecs/nirvana/input/o;", "Lcom/tencent/mm/feature/ecs/nirvana/accessibility/p;", "Lcom/tencent/mm/feature/ecs/nirvana/accessibility/h;", "getOrCreateAccessibilityDelegate", "Lio/flutter/plugin/common/BinaryMessenger;", "getBinaryMessenger", "Lcom/tencent/mm/feature/ecs/nirvana/input/w;", "getTextInputMethodJsApiDispatcher", "Landroid/view/accessibility/AccessibilityNodeProvider;", "getAccessibilityNodeProvider", "Lcom/tencent/mm/feature/ecs/nirvana/input/c0;", "e", "Lcom/tencent/mm/feature/ecs/nirvana/input/c0;", "getTextInputPlugin", "()Lcom/tencent/mm/feature/ecs/nirvana/input/c0;", "textInputPlugin", "Lcom/tencent/mm/feature/ecs/nirvana/input/p;", "f", "Lcom/tencent/mm/feature/ecs/nirvana/input/p;", "getKeyboardManager", "()Lcom/tencent/mm/feature/ecs/nirvana/input/p;", "keyboardManager", "Lcom/tencent/mm/feature/ecs/nirvana/accessibility/l;", "g", "Lcom/tencent/mm/feature/ecs/nirvana/accessibility/l;", "getAccessibilityChannel", "()Lcom/tencent/mm/feature/ecs/nirvana/accessibility/l;", "accessibilityChannel", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-nirvana_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public abstract class MagicEcsNirvanaCanvasViewContainer extends zq0.a implements com.tencent.mm.feature.ecs.nirvana.input.o, com.tencent.mm.feature.ecs.nirvana.accessibility.p {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.nirvana.input.c0 textInputPlugin;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.nirvana.input.p keyboardManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.nirvana.accessibility.l accessibilityChannel;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.nirvana.accessibility.f f65812h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.feature.ecs.nirvana.accessibility.h f65813i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicEcsNirvanaCanvasViewContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        setFocusableInTouchMode(true);
        setFocusable(true);
        this.textInputPlugin = new com.tencent.mm.feature.ecs.nirvana.input.c0(this, new com.tencent.mm.feature.ecs.nirvana.input.w());
        this.keyboardManager = new com.tencent.mm.feature.ecs.nirvana.input.p(this);
        this.accessibilityChannel = new com.tencent.mm.feature.ecs.nirvana.accessibility.l();
        this.f65812h = o10.a.f342043a;
    }

    private final com.tencent.mm.feature.ecs.nirvana.accessibility.h getOrCreateAccessibilityDelegate() {
        com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar = this.f65813i;
        if (hVar != null) {
            return hVar;
        }
        com.tencent.mm.feature.ecs.nirvana.accessibility.l lVar = this.accessibilityChannel;
        java.lang.Object systemService = getContext().getSystemService("accessibility");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar2 = new com.tencent.mm.feature.ecs.nirvana.accessibility.h(this, lVar, (android.view.accessibility.AccessibilityManager) systemService, getContext().getContentResolver(), this);
        hVar2.f65699q = this.f65812h;
        this.f65813i = hVar2;
        return hVar2;
    }

    @Override // android.view.View
    public void autofill(android.util.SparseArray values) {
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill;
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill2;
        kotlin.jvm.internal.o.g(values, "values");
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var = this.textInputPlugin;
        if (i17 < 26) {
            c0Var.getClass();
            return;
        }
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration = c0Var.f65737f;
        if (configuration == null || c0Var.f65738g == null || (autofill = configuration.autofill) == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i18 = 0; i18 < values.size(); i18++) {
            io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration2 = (io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration) c0Var.f65738g.get(values.keyAt(i18));
            if (configuration2 != null && (autofill2 = configuration2.autofill) != null) {
                java.lang.String charSequence = ((android.view.autofill.AutofillValue) values.valueAt(i18)).getTextValue().toString();
                io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState = new io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (autofill2.uniqueIdentifier.equals(autofill.uniqueIdentifier)) {
                    c0Var.f65739h.f(textEditState);
                } else {
                    hashMap.put(autofill2.uniqueIdentifier, textEditState);
                }
            }
        }
        int i19 = c0Var.f65736e.f65730b;
        com.tencent.mm.feature.ecs.nirvana.input.w wVar = c0Var.f65735d;
        wVar.getClass();
        hashMap.size();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState2 = (io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState) entry.getValue();
            java.lang.String text = textEditState2.text;
            kotlin.jvm.internal.o.f(text, "text");
            hashMap2.put(str, wVar.a(text, textEditState2.selectionStart, textEditState2.selectionEnd, -1, -1));
        }
        com.tencent.mm.feature.ecs.nirvana.input.t tVar = wVar.f65802b;
        if (tVar != null) {
            ((com.tencent.mm.feature.ecs.nirvana.input.u) tVar).a("TextInputClient.updateEditingStateWithTag", kz5.c0.i(java.lang.Integer.valueOf(i19), hashMap2));
        }
    }

    public final com.tencent.mm.feature.ecs.nirvana.accessibility.l getAccessibilityChannel() {
        return this.accessibilityChannel;
    }

    @Override // android.view.View
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        com.tencent.mm.feature.ecs.nirvana.accessibility.h orCreateAccessibilityDelegate = getOrCreateAccessibilityDelegate();
        if (orCreateAccessibilityDelegate.f65685c.isEnabled()) {
            return orCreateAccessibilityDelegate;
        }
        return null;
    }

    public io.flutter.plugin.common.BinaryMessenger getBinaryMessenger() {
        return null;
    }

    public final com.tencent.mm.feature.ecs.nirvana.input.p getKeyboardManager() {
        return this.keyboardManager;
    }

    @Override // com.tencent.mm.feature.ecs.nirvana.input.o
    public com.tencent.mm.feature.ecs.nirvana.input.w getTextInputMethodJsApiDispatcher() {
        com.tencent.mm.feature.ecs.nirvana.input.w wVar = this.textInputPlugin.f65735d;
        kotlin.jvm.internal.o.f(wVar, "getTextInputJsApiDispatcher(...)");
        return wVar;
    }

    public final com.tencent.mm.feature.ecs.nirvana.input.c0 getTextInputPlugin() {
        return this.textInputPlugin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.Object systemService = getContext().getSystemService("accessibility");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        if (((android.view.accessibility.AccessibilityManager) systemService).isEnabled()) {
            getOrCreateAccessibilityDelegate();
        }
    }

    @Override // android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
        int i17;
        kotlin.jvm.internal.o.g(outAttrs, "outAttrs");
        com.tencent.mm.feature.ecs.nirvana.input.p pVar = this.keyboardManager;
        com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var = this.textInputPlugin;
        com.tencent.mars.xlog.Log.i("TextInputPlugin", "createInputConnection %s", c0Var.f65736e.f65729a);
        com.tencent.mm.feature.ecs.nirvana.input.a0 a0Var = c0Var.f65736e.f65729a;
        if (a0Var == com.tencent.mm.feature.ecs.nirvana.input.a0.NO_TARGET) {
            c0Var.f65741j = null;
            return null;
        }
        if (a0Var == com.tencent.mm.feature.ecs.nirvana.input.a0.PHYSICAL_DISPLAY_PLATFORM_VIEW || a0Var == com.tencent.mm.feature.ecs.nirvana.input.a0.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration = c0Var.f65737f;
        io.flutter.embedding.engine.systemchannels.TextInputChannel.InputType inputType = configuration.inputType;
        boolean z17 = configuration.obscureText;
        boolean z18 = configuration.autocorrect;
        boolean z19 = configuration.enableSuggestions;
        boolean z27 = configuration.enableIMEPersonalizedLearning;
        io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization textCapitalization = configuration.textCapitalization;
        io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType textInputType = inputType.type;
        int i18 = 1;
        if (textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.DATETIME) {
            i17 = 4;
        } else if (textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.NUMBER) {
            int i19 = inputType.isSigned ? 4098 : 2;
            i17 = inputType.isDecimal ? i19 | 8192 : i19;
        } else if (textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.PHONE) {
            i17 = 3;
        } else if (textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.NONE) {
            i17 = 0;
        } else {
            i17 = textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.MULTILINE ? 131073 : textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.EMAIL_ADDRESS ? 33 : textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.URL ? 17 : textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.VISIBLE_PASSWORD ? 145 : textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.NAME ? 97 : textInputType == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.POSTAL_ADDRESS ? 113 : 1;
            if (z17) {
                i17 = i17 | 524288 | 128;
            } else {
                if (z18) {
                    i17 |= 32768;
                }
                if (!z19) {
                    i17 = i17 | 524288 | 144;
                }
            }
            if (textCapitalization == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization.CHARACTERS) {
                i17 |= 4096;
            } else if (textCapitalization == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization.WORDS) {
                i17 |= 8192;
            } else if (textCapitalization == io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization.SENTENCES) {
                i17 |= 16384;
            }
        }
        outAttrs.inputType = i17;
        outAttrs.imeOptions = com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        if (android.os.Build.VERSION.SDK_INT >= 26 && !z27) {
            outAttrs.imeOptions = 50331648;
        }
        java.lang.Integer num = configuration.inputAction;
        if (num != null) {
            i18 = num.intValue();
        } else if ((131072 & i17) == 0) {
            i18 = 6;
        }
        io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration configuration2 = c0Var.f65737f;
        java.lang.String str = configuration2.actionLabel;
        if (str != null) {
            outAttrs.actionLabel = str;
            outAttrs.actionId = i18;
        }
        outAttrs.imeOptions |= i18;
        java.lang.String[] strArr = configuration2.contentCommitMimeTypes;
        if (strArr != null) {
            q3.a.a(outAttrs, strArr);
        }
        com.tencent.mm.feature.ecs.nirvana.input.d dVar = new com.tencent.mm.feature.ecs.nirvana.input.d(this, c0Var.f65736e.f65730b, c0Var.f65735d, pVar, c0Var.f65739h, outAttrs);
        com.tencent.mm.feature.ecs.nirvana.input.s sVar = c0Var.f65739h;
        sVar.getClass();
        outAttrs.initialSelStart = android.text.Selection.getSelectionStart(sVar);
        com.tencent.mm.feature.ecs.nirvana.input.s sVar2 = c0Var.f65739h;
        sVar2.getClass();
        outAttrs.initialSelEnd = android.text.Selection.getSelectionEnd(sVar2);
        c0Var.f65741j = dVar;
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar = this.f65813i;
        if (hVar != null) {
            hVar.f65701s = true;
            hVar.f65687e.getClass();
            hVar.f65699q = null;
            android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = hVar.f65703u;
            android.view.accessibility.AccessibilityManager accessibilityManager = hVar.f65685c;
            accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
            accessibilityManager.removeTouchExplorationStateChangeListener(hVar.f65704v);
            hVar.f65688f.unregisterContentObserver(hVar.f65705w);
            hVar.f65684b.f65710a = null;
        }
        this.f65813i = null;
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar = this.f65813i;
        if (hVar == null) {
            return super.onHoverEvent(event);
        }
        if (hVar.d(event)) {
            return true;
        }
        return super.onHoverEvent(event);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(android.view.ViewStructure structure, int i17) {
        android.graphics.Rect rect;
        kotlin.jvm.internal.o.g(structure, "structure");
        super.onProvideAutofillVirtualStructure(structure, i17);
        int i18 = android.os.Build.VERSION.SDK_INT;
        com.tencent.mm.feature.ecs.nirvana.input.c0 c0Var = this.textInputPlugin;
        if (i18 < 26) {
            c0Var.getClass();
            return;
        }
        if (c0Var.f65738g != null) {
            java.lang.String str = c0Var.f65737f.autofill.uniqueIdentifier;
            android.view.autofill.AutofillId autofillId = structure.getAutofillId();
            for (int i19 = 0; i19 < c0Var.f65738g.size(); i19++) {
                int keyAt = c0Var.f65738g.keyAt(i19);
                io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill autofill = ((io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration) c0Var.f65738g.valueAt(i19)).autofill;
                if (autofill != null) {
                    structure.addChildCount(1);
                    android.view.ViewStructure newChild = structure.newChild(i19);
                    newChild.setAutofillId(autofillId, keyAt);
                    java.lang.String[] strArr = autofill.hints;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    java.lang.String str2 = autofill.hintText;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = c0Var.f65742k) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                        newChild.setAutofillValue(android.view.autofill.AutofillValue.forText(autofill.editState.text));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), c0Var.f65742k.height());
                        newChild.setAutofillValue(android.view.autofill.AutofillValue.forText(c0Var.f65739h));
                    }
                }
            }
        }
    }
}
