package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* loaded from: classes15.dex */
public class d extends android.view.inputmethod.BaseInputConnection implements com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f147278a;

    /* renamed from: b, reason: collision with root package name */
    public final int f147279b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.w f147280c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.s f147281d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.inputmethod.EditorInfo f147282e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.inputmethod.ExtractedTextRequest f147283f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f147284g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.inputmethod.CursorAnchorInfo.Builder f147285h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.inputmethod.ExtractedText f147286i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.inputmethod.InputMethodManager f147287j;

    /* renamed from: k, reason: collision with root package name */
    public final android.text.Layout f147288k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.a f147289l;

    /* renamed from: m, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d.KeyboardDelegate f147290m;

    /* renamed from: n, reason: collision with root package name */
    public int f147291n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.view.View view, int i17, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.w wVar, io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d.KeyboardDelegate keyboardDelegate, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.s sVar, android.view.inputmethod.EditorInfo editorInfo) {
        super(view, true);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09();
        this.f147284g = false;
        this.f147286i = new android.view.inputmethod.ExtractedText();
        this.f147291n = 0;
        this.f147278a = view;
        this.f147279b = i17;
        this.f147280c = wVar;
        this.f147281d = sVar;
        sVar.a(this);
        this.f147282e = editorInfo;
        this.f147290m = keyboardDelegate;
        this.f147289l = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.a(c28586x96e67e09);
        this.f147288k = new android.text.DynamicLayout(sVar, new android.text.TextPaint(), Integer.MAX_VALUE, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f147287j = (android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method");
    }

    public final android.view.inputmethod.CursorAnchorInfo a() {
        android.view.inputmethod.CursorAnchorInfo.Builder builder = this.f147285h;
        if (builder == null) {
            this.f147285h = new android.view.inputmethod.CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        android.view.inputmethod.CursorAnchorInfo.Builder builder2 = this.f147285h;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.s sVar = this.f147281d;
        sVar.getClass();
        int selectionStart = android.text.Selection.getSelectionStart(sVar);
        sVar.getClass();
        builder2.setSelectionRange(selectionStart, android.text.Selection.getSelectionEnd(sVar));
        sVar.getClass();
        int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(sVar);
        sVar.getClass();
        int composingSpanEnd = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(sVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f147285h.setComposingText(-1, "");
        } else {
            this.f147285h.setComposingText(composingSpanStart, sVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f147285h.build();
    }

    public final android.view.inputmethod.ExtractedText b(android.view.inputmethod.ExtractedTextRequest extractedTextRequest) {
        android.view.inputmethod.ExtractedText extractedText = this.f147286i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        java.lang.CharSequence charSequence = this.f147281d;
        charSequence.getClass();
        extractedText.selectionStart = android.text.Selection.getSelectionStart(charSequence);
        charSequence.getClass();
        extractedText.selectionEnd = android.text.Selection.getSelectionEnd(charSequence);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = charSequence.toString();
        }
        extractedText.text = charSequence;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f147281d.b();
        this.f147291n++;
        return super.beginBatchEdit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0293, code lost:
    
        r6 = r6 + 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.d.c(boolean, boolean):boolean");
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i17) {
        return super.clearMetaKeyStates(i17);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f147281d.e(this);
        while (this.f147291n > 0) {
            endBatchEdit();
            this.f147291n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i17, android.os.Bundle bundle) {
        int i18;
        if (android.os.Build.VERSION.SDK_INT >= 25 && (i17 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    android.net.Uri contentUri = inputContentInfo.getContentUri();
                    java.lang.String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    android.content.Context context = this.f147278a.getContext();
                    if (contentUri != null) {
                        try {
                            java.io.InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i18 = openInputStream.read(bArr);
                                    } catch (java.io.IOException unused) {
                                        i18 = -1;
                                    }
                                    if (i18 == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i18);
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                java.util.HashMap hashMap = new java.util.HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, byteArray);
                                hashMap.put("uri", contentUri.toString());
                                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.w wVar = this.f147280c;
                                wVar.getClass();
                                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar = wVar.f147335b;
                                if (tVar != null) {
                                    ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar).a("TextInputClient.performAction", kz5.c0.i(java.lang.Integer.valueOf(this.f147279b), "TextInputAction.commitContent", hashMap));
                                }
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (java.io.FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (java.lang.Exception unused3) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        charSequence.toString();
        return super.commitText(charSequence, i17);
    }

    public final boolean d(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.s sVar = this.f147281d;
        int selectionStart = android.text.Selection.getSelectionStart(sVar);
        int selectionEnd = android.text.Selection.getSelectionEnd(sVar);
        boolean z19 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z18) {
            z19 = true;
        }
        beginBatchEdit();
        android.text.Layout layout = this.f147288k;
        if (z19) {
            if (z17) {
                android.text.Selection.moveUp(sVar, layout);
            } else {
                android.text.Selection.moveDown(sVar, layout);
            }
            int selectionStart2 = android.text.Selection.getSelectionStart(sVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z17) {
                android.text.Selection.extendUp(sVar, layout);
            } else {
                android.text.Selection.extendDown(sVar, layout);
            }
            setSelection(android.text.Selection.getSelectionStart(sVar), android.text.Selection.getSelectionEnd(sVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i17, int i18) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.s sVar = this.f147281d;
        sVar.getClass();
        if (android.text.Selection.getSelectionStart(sVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i17, i18);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i17, int i18) {
        return super.deleteSurroundingTextInCodePoints(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.r
    /* renamed from: didChangeEditingState */
    public void mo44265x3186bc88(boolean z17, boolean z18, boolean z19) {
        android.view.inputmethod.InputMethodManager inputMethodManager = this.f147287j;
        android.view.View view = this.f147278a;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.s sVar = this.f147281d;
        sVar.getClass();
        int selectionStart = android.text.Selection.getSelectionStart(sVar);
        sVar.getClass();
        int selectionEnd = android.text.Selection.getSelectionEnd(sVar);
        sVar.getClass();
        int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(sVar);
        sVar.getClass();
        inputMethodManager.updateSelection(view, selectionStart, selectionEnd, composingSpanStart, android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(sVar));
        android.view.inputmethod.ExtractedTextRequest extractedTextRequest = this.f147283f;
        android.view.View view2 = this.f147278a;
        android.view.inputmethod.InputMethodManager inputMethodManager2 = this.f147287j;
        if (extractedTextRequest != null) {
            inputMethodManager2.updateExtractedText(view2, extractedTextRequest.token, b(extractedTextRequest));
        }
        if (this.f147284g) {
            inputMethodManager2.updateCursorAnchorInfo(view2, a());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f147291n--;
        this.f147281d.c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public android.text.Editable getEditable() {
        return this.f147281d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i17) {
        boolean z17 = (i17 & 1) != 0;
        if (this.f147283f != null) {
        }
        this.f147283f = z17 ? extractedTextRequest : null;
        return b(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i17) {
        beginBatchEdit();
        boolean z17 = true;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.s sVar = this.f147281d;
        if (i17 == 16908319) {
            setSelection(0, sVar.length());
        } else {
            android.view.View view = this.f147278a;
            if (i17 == 16908320) {
                int selectionStart = android.text.Selection.getSelectionStart(sVar);
                int selectionEnd = android.text.Selection.getSelectionEnd(sVar);
                if (selectionStart != selectionEnd) {
                    int min = java.lang.Math.min(selectionStart, selectionEnd);
                    int max = java.lang.Math.max(selectionStart, selectionEnd);
                    ((android.content.ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", sVar.subSequence(min, max)));
                    sVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i17 == 16908321) {
                int selectionStart2 = android.text.Selection.getSelectionStart(sVar);
                int selectionEnd2 = android.text.Selection.getSelectionEnd(sVar);
                if (selectionStart2 != selectionEnd2) {
                    ((android.content.ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", sVar.subSequence(java.lang.Math.min(selectionStart2, selectionEnd2), java.lang.Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i17 == 16908322) {
                android.content.ClipData primaryClip = ((android.content.ClipboardManager) view.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    java.lang.CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(view.getContext());
                    int max2 = java.lang.Math.max(0, android.text.Selection.getSelectionStart(sVar));
                    int max3 = java.lang.Math.max(0, android.text.Selection.getSelectionEnd(sVar));
                    int min2 = java.lang.Math.min(max2, max3);
                    int max4 = java.lang.Math.max(max2, max3);
                    if (min2 != max4) {
                        sVar.delete(min2, max4);
                    }
                    sVar.insert(min2, coerceToText);
                    int length = min2 + coerceToText.length();
                    setSelection(length, length);
                }
            } else {
                z17 = false;
            }
        }
        endBatchEdit();
        return z17;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i17) {
        int i18 = this.f147279b;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.w wVar = this.f147280c;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar = wVar.f147335b;
            if (tVar != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar).a("TextInputClient.performAction", kz5.c0.i(java.lang.Integer.valueOf(i18), "TextInputAction.unspecified"));
            }
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar2 = wVar.f147335b;
            if (tVar2 != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar2).a("TextInputClient.performAction", kz5.c0.i(java.lang.Integer.valueOf(i18), "TextInputAction.newline"));
            }
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar3 = wVar.f147335b;
            if (tVar3 != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar3).a("TextInputClient.performAction", kz5.c0.i(java.lang.Integer.valueOf(i18), "TextInputAction.go"));
            }
        } else if (i17 == 3) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar4 = wVar.f147335b;
            if (tVar4 != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar4).a("TextInputClient.performAction", kz5.c0.i(java.lang.Integer.valueOf(i18), "TextInputAction.search"));
            }
        } else if (i17 == 4) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar5 = wVar.f147335b;
            if (tVar5 != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar5).a("TextInputClient.performAction", kz5.c0.i(java.lang.Integer.valueOf(i18), "TextInputAction.send"));
            }
        } else if (i17 == 5) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar6 = wVar.f147335b;
            if (tVar6 != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar6).a("TextInputClient.performAction", kz5.c0.i(java.lang.Integer.valueOf(i18), "TextInputAction.next"));
            }
        } else if (i17 != 7) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar7 = wVar.f147335b;
            if (tVar7 != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar7).a("TextInputClient.performAction", kz5.c0.i(java.lang.Integer.valueOf(i18), "TextInputAction.done"));
            }
        } else {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar8 = wVar.f147335b;
            if (tVar8 != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar8).a("TextInputClient.performAction", kz5.c0.i(java.lang.Integer.valueOf(i18), "TextInputAction.previous"));
            }
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String action, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.w wVar = this.f147280c;
        wVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        java.util.Map l17 = kz5.c1.l(new jz5.l("action", action));
        if (bundle != null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str);
                if (obj instanceof byte[]) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    byte[] byteArray = bundle.getByteArray(str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(byteArray);
                    linkedHashMap.put(str, byteArray);
                } else if (obj instanceof java.lang.Byte) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    linkedHashMap.put(str, java.lang.Byte.valueOf(bundle.getByte(str)));
                } else if (obj instanceof char[]) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    char[] charArray = bundle.getCharArray(str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charArray);
                    linkedHashMap.put(str, charArray);
                } else if (obj instanceof java.lang.Character) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    linkedHashMap.put(str, java.lang.Character.valueOf(bundle.getChar(str)));
                } else if (obj instanceof java.lang.Object[]) {
                    if (((java.lang.Object[]) obj) instanceof java.lang.CharSequence[]) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        java.lang.CharSequence[] charSequenceArray = bundle.getCharSequenceArray(str);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequenceArray);
                        linkedHashMap.put(str, charSequenceArray);
                    }
                } else if (obj instanceof java.lang.CharSequence) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    java.lang.CharSequence charSequence = bundle.getCharSequence(str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence);
                    linkedHashMap.put(str, charSequence);
                } else if (obj instanceof float[]) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    float[] floatArray = bundle.getFloatArray(str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(floatArray);
                    linkedHashMap.put(str, floatArray);
                } else if (obj instanceof java.lang.Float) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    linkedHashMap.put(str, java.lang.Float.valueOf(bundle.getFloat(str)));
                }
            }
            l17.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, linkedHashMap);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar = wVar.f147335b;
        if (tVar == null) {
            return true;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar).a("TextInputClient.performPrivateCommand", kz5.c0.i(java.lang.Integer.valueOf(this.f147279b), l17));
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i17) {
        if ((i17 & 1) != 0) {
            this.f147287j.updateCursorAnchorInfo(this.f147278a, a());
        }
        boolean z17 = (i17 & 2) != 0;
        boolean z18 = this.f147284g;
        this.f147284g = z17;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f147290m.mo44271x5797ad52(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i17, int i18) {
        return super.setComposingRegion(i17, i18);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(java.lang.CharSequence charSequence, int i17) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i17) : super.setComposingText(charSequence, i17);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i17, int i18) {
        beginBatchEdit();
        boolean selection = super.setSelection(i17, i18);
        endBatchEdit();
        return selection;
    }
}
