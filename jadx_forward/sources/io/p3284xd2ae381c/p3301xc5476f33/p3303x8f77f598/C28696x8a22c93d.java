package io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598;

/* renamed from: io.flutter.plugin.editing.InputConnectionAdaptor */
/* loaded from: classes15.dex */
public class C28696x8a22c93d extends android.view.inputmethod.BaseInputConnection implements io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a.EditingStateWatcher {
    private static final java.lang.String TAG = "InputConnectionAdaptor";

    /* renamed from: batchEditNestDepth */
    private int f71656x4c094b47;

    /* renamed from: flutterTextUtils */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28694x20aa9ae8 f71657x52e656c8;

    /* renamed from: keyboardDelegate */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d.KeyboardDelegate f71658x7453de8c;

    /* renamed from: mClient */
    private final int f71659xfe7f1a98;

    /* renamed from: mCursorAnchorInfoBuilder */
    private android.view.inputmethod.CursorAnchorInfo.Builder f71660x4fc1e535;

    /* renamed from: mEditable */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a f71661x848095f1;

    /* renamed from: mEditorInfo */
    private final android.view.inputmethod.EditorInfo f71662x7f687408;

    /* renamed from: mExtractRequest */
    private android.view.inputmethod.ExtractedTextRequest f71663x57cfd49b;

    /* renamed from: mExtractedText */
    private android.view.inputmethod.ExtractedText f71664x54b21ec0;

    /* renamed from: mFlutterView */
    private final android.view.View f71665x8c928a34;

    /* renamed from: mImm */
    private android.view.inputmethod.InputMethodManager f71666x32ac1c;

    /* renamed from: mLayout */
    private final android.text.Layout f71667xd4721f7;

    /* renamed from: mMonitorCursorUpdate */
    private boolean f71668x662dc88c;

    /* renamed from: scribeChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679 f71669xebd32699;

    /* renamed from: textInputChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6 f71670xda083a6;

    /* renamed from: io.flutter.plugin.editing.InputConnectionAdaptor$KeyboardDelegate */
    /* loaded from: classes15.dex */
    public interface KeyboardDelegate {
        /* renamed from: handleEvent */
        boolean mo44271x5797ad52(android.view.KeyEvent keyEvent);
    }

    public C28696x8a22c93d(android.view.View view, int i17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6 c28675xdb64c7c6, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679 c28668x1b725679, io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d.KeyboardDelegate keyboardDelegate, io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a c28697x79969c3a, android.view.inputmethod.EditorInfo editorInfo, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        super(view, true);
        this.f71668x662dc88c = false;
        this.f71664x54b21ec0 = new android.view.inputmethod.ExtractedText();
        this.f71656x4c094b47 = 0;
        this.f71665x8c928a34 = view;
        this.f71659xfe7f1a98 = i17;
        this.f71670xda083a6 = c28675xdb64c7c6;
        this.f71669xebd32699 = c28668x1b725679;
        this.f71661x848095f1 = c28697x79969c3a;
        c28697x79969c3a.m138495x481aefee(this);
        this.f71662x7f687408 = editorInfo;
        this.f71658x7453de8c = keyboardDelegate;
        this.f71657x52e656c8 = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28694x20aa9ae8(c28586x96e67e09);
        this.f71667xd4721f7 = new android.text.DynamicLayout(c28697x79969c3a, new android.text.TextPaint(), Integer.MAX_VALUE, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f71666x32ac1c = (android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method");
    }

    /* renamed from: clampIndexToEditable */
    private static int m138484x5c5b7e36(int i17, android.text.Editable editable) {
        int max = java.lang.Math.max(0, java.lang.Math.min(editable.length(), i17));
        if (max != i17) {
            io.p3284xd2ae381c.Log.d("flutter", "Text selection index was clamped (" + i17 + "->" + max + ") to remain in bounds. This may not be your fault, as some keyboards may select outside of bounds.");
        }
        return max;
    }

    /* renamed from: doPerformContextMenuAction */
    private boolean m138485xfd44a5ce(int i17) {
        if (i17 == 16908319) {
            setSelection(0, this.f71661x848095f1.length());
            return true;
        }
        if (i17 == 16908320) {
            int selectionStart = android.text.Selection.getSelectionStart(this.f71661x848095f1);
            int selectionEnd = android.text.Selection.getSelectionEnd(this.f71661x848095f1);
            if (selectionStart != selectionEnd) {
                int min = java.lang.Math.min(selectionStart, selectionEnd);
                int max = java.lang.Math.max(selectionStart, selectionEnd);
                ((android.content.ClipboardManager) this.f71665x8c928a34.getContext().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", this.f71661x848095f1.subSequence(min, max)));
                this.f71661x848095f1.delete(min, max);
                setSelection(min, min);
            }
            return true;
        }
        if (i17 == 16908321) {
            int selectionStart2 = android.text.Selection.getSelectionStart(this.f71661x848095f1);
            int selectionEnd2 = android.text.Selection.getSelectionEnd(this.f71661x848095f1);
            if (selectionStart2 != selectionEnd2) {
                ((android.content.ClipboardManager) this.f71665x8c928a34.getContext().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", this.f71661x848095f1.subSequence(java.lang.Math.min(selectionStart2, selectionEnd2), java.lang.Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i17 != 16908322) {
            return false;
        }
        android.content.ClipData primaryClip = ((android.content.ClipboardManager) this.f71665x8c928a34.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            java.lang.CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f71665x8c928a34.getContext());
            int max2 = java.lang.Math.max(0, android.text.Selection.getSelectionStart(this.f71661x848095f1));
            int max3 = java.lang.Math.max(0, android.text.Selection.getSelectionEnd(this.f71661x848095f1));
            int min2 = java.lang.Math.min(max2, max3);
            int max4 = java.lang.Math.max(max2, max3);
            if (min2 != max4) {
                this.f71661x848095f1.delete(min2, max4);
            }
            this.f71661x848095f1.insert(min2, coerceToText);
            int length = min2 + coerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    /* renamed from: getCursorAnchorInfo */
    private android.view.inputmethod.CursorAnchorInfo m138486x7b83dc6f() {
        android.view.inputmethod.CursorAnchorInfo.Builder builder = this.f71660x4fc1e535;
        if (builder == null) {
            this.f71660x4fc1e535 = new android.view.inputmethod.CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f71660x4fc1e535.setSelectionRange(this.f71661x848095f1.m138503x6f2c472c(), this.f71661x848095f1.m138502xffd93625());
        int m138501xae47f8c9 = this.f71661x848095f1.m138501xae47f8c9();
        int m138500x527eab02 = this.f71661x848095f1.m138500x527eab02();
        if (m138501xae47f8c9 < 0 || m138500x527eab02 <= m138501xae47f8c9) {
            this.f71660x4fc1e535.setComposingText(-1, "");
        } else {
            this.f71660x4fc1e535.setComposingText(m138501xae47f8c9, this.f71661x848095f1.toString().subSequence(m138501xae47f8c9, m138500x527eab02));
        }
        return this.f71660x4fc1e535.build();
    }

    /* renamed from: getExtractedText */
    private android.view.inputmethod.ExtractedText m138487xb703d277(android.view.inputmethod.ExtractedTextRequest extractedTextRequest) {
        java.lang.CharSequence c28697x79969c3a;
        android.view.inputmethod.ExtractedText extractedText = this.f71664x54b21ec0;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f71661x848095f1.m138503x6f2c472c();
        this.f71664x54b21ec0.selectionEnd = this.f71661x848095f1.m138502xffd93625();
        android.view.inputmethod.ExtractedText extractedText2 = this.f71664x54b21ec0;
        if (extractedTextRequest != null && (extractedTextRequest.flags & 1) != 0) {
            c28697x79969c3a = this.f71661x848095f1;
        } else {
            c28697x79969c3a = this.f71661x848095f1.toString();
        }
        extractedText2.text = c28697x79969c3a;
        return this.f71664x54b21ec0;
    }

    /* renamed from: handleHorizontalMovement */
    private boolean m138488x929b7d3b(boolean z17, boolean z18) {
        int selectionStart = android.text.Selection.getSelectionStart(this.f71661x848095f1);
        int selectionEnd = android.text.Selection.getSelectionEnd(this.f71661x848095f1);
        boolean z19 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z17 ? java.lang.Math.max(this.f71657x52e656c8.m138463x64a22868(this.f71661x848095f1, selectionEnd), 0) : java.lang.Math.min(this.f71657x52e656c8.m138462x2439dbd3(this.f71661x848095f1, selectionEnd), this.f71661x848095f1.length());
        if (selectionStart == selectionEnd && !z18) {
            z19 = true;
        }
        if (z19) {
            setSelection(max, max);
        } else {
            setSelection(selectionStart, max);
        }
        return true;
    }

    /* renamed from: handleVerticalMovement */
    private boolean m138489xc452588d(boolean z17, boolean z18) {
        int selectionStart = android.text.Selection.getSelectionStart(this.f71661x848095f1);
        int selectionEnd = android.text.Selection.getSelectionEnd(this.f71661x848095f1);
        boolean z19 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z18) {
            z19 = true;
        }
        beginBatchEdit();
        if (z19) {
            if (z17) {
                android.text.Selection.moveUp(this.f71661x848095f1, this.f71667xd4721f7);
            } else {
                android.text.Selection.moveDown(this.f71661x848095f1, this.f71667xd4721f7);
            }
            int selectionStart2 = android.text.Selection.getSelectionStart(this.f71661x848095f1);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z17) {
                android.text.Selection.extendUp(this.f71661x848095f1, this.f71667xd4721f7);
            } else {
                android.text.Selection.extendDown(this.f71661x848095f1, this.f71667xd4721f7);
            }
            setSelection(android.text.Selection.getSelectionStart(this.f71661x848095f1), android.text.Selection.getSelectionEnd(this.f71661x848095f1));
        }
        endBatchEdit();
        return true;
    }

    /* renamed from: readStreamFully */
    private byte[] m138490x444b34b4(java.io.InputStream inputStream, int i17) {
        int i18;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[i17];
        while (true) {
            try {
                i18 = inputStream.read(bArr);
            } catch (java.io.IOException unused) {
                i18 = -1;
            }
            if (i18 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i18);
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f71661x848095f1.m138496xef81e1bb();
        this.f71656x4c094b47++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i17) {
        return super.clearMetaKeyStates(i17);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f71661x848095f1.m138504x1f50a051(this);
        while (this.f71656x4c094b47 > 0) {
            endBatchEdit();
            this.f71656x4c094b47--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i17, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 25 && (i17 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    android.net.Uri contentUri = inputContentInfo.getContentUri();
                    java.lang.String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    android.content.Context context = this.f71665x8c928a34.getContext();
                    if (contentUri != null) {
                        try {
                            java.io.InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] m138490x444b34b4 = m138490x444b34b4(openInputStream, 65536);
                                java.util.HashMap hashMap = new java.util.HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, m138490x444b34b4);
                                hashMap.put("uri", contentUri.toString());
                                this.f71670xda083a6.m138356x79612742(this.f71659xfe7f1a98, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (java.io.FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (java.lang.Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        return super.commitText(charSequence, i17);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i17, int i18) {
        if (this.f71661x848095f1.m138503x6f2c472c() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i17, i18);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i17, int i18) {
        return super.deleteSurroundingTextInCodePoints(i17, i18);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a.EditingStateWatcher
    /* renamed from: didChangeEditingState */
    public void mo138491x3186bc88(boolean z17, boolean z18, boolean z19) {
        this.f71666x32ac1c.updateSelection(this.f71665x8c928a34, this.f71661x848095f1.m138503x6f2c472c(), this.f71661x848095f1.m138502xffd93625(), this.f71661x848095f1.m138501xae47f8c9(), this.f71661x848095f1.m138500x527eab02());
        android.view.inputmethod.ExtractedTextRequest extractedTextRequest = this.f71663x57cfd49b;
        if (extractedTextRequest != null) {
            this.f71666x32ac1c.updateExtractedText(this.f71665x8c928a34, extractedTextRequest.token, m138487xb703d277(extractedTextRequest));
        }
        if (this.f71668x662dc88c) {
            this.f71666x32ac1c.updateCursorAnchorInfo(this.f71665x8c928a34, m138486x7b83dc6f());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f71656x4c094b47--;
        this.f71661x848095f1.m138498xad1ee9c9();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public android.text.Editable getEditable() {
        return this.f71661x848095f1;
    }

    /* renamed from: handleKeyEvent */
    public boolean m138492x47b131c3(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return m138488x929b7d3b(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return m138488x929b7d3b(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return m138489xc452588d(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return m138489xc452588d(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                android.view.inputmethod.EditorInfo editorInfo = this.f71662x7f687408;
                if ((editorInfo.inputType & 131072) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = android.text.Selection.getSelectionStart(this.f71661x848095f1);
            int selectionEnd = android.text.Selection.getSelectionEnd(this.f71661x848095f1);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = java.lang.Math.min(selectionStart, selectionEnd);
                int max = java.lang.Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.f71661x848095f1.delete(min, max);
                }
                this.f71661x848095f1.insert(min, (java.lang.CharSequence) java.lang.String.valueOf((char) unicodeChar));
                int i17 = min + 1;
                setSelection(i17, i17);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i17) {
        beginBatchEdit();
        boolean m138485xfd44a5ce = m138485xfd44a5ce(i17);
        endBatchEdit();
        return m138485xfd44a5ce;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i17) {
        if (i17 == 0) {
            this.f71670xda083a6.m138366x5dc9704d(this.f71659xfe7f1a98);
        } else if (i17 == 1) {
            this.f71670xda083a6.m138358x6e068994(this.f71659xfe7f1a98);
        } else if (i17 == 2) {
            this.f71670xda083a6.go(this.f71659xfe7f1a98);
        } else if (i17 == 3) {
            this.f71670xda083a6.m138363xc9fa65a8(this.f71659xfe7f1a98);
        } else if (i17 == 4) {
            this.f71670xda083a6.m138364x35cf88(this.f71659xfe7f1a98);
        } else if (i17 == 5) {
            this.f71670xda083a6.m138359x338af3(this.f71659xfe7f1a98);
        } else if (i17 != 7) {
            this.f71670xda083a6.m138357x2f2382(this.f71659xfe7f1a98);
        } else {
            this.f71670xda083a6.m138361xb413baf7(this.f71659xfe7f1a98);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        this.f71670xda083a6.m138360x68475e09(this.f71659xfe7f1a98, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i17) {
        if ((i17 & 1) != 0) {
            this.f71666x32ac1c.updateCursorAnchorInfo(this.f71665x8c928a34, m138486x7b83dc6f());
        }
        boolean z17 = (i17 & 2) != 0;
        if (z17 != this.f71668x662dc88c) {
            io.p3284xd2ae381c.Log.d(TAG, "The input method toggled cursor monitoring ".concat(z17 ? "on" : "off"));
        }
        this.f71668x662dc88c = z17;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f71658x7453de8c.mo44271x5797ad52(keyEvent);
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

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i17) {
        boolean z17 = (i17 & 1) != 0;
        if (z17 == (this.f71663x57cfd49b == null)) {
            io.p3284xd2ae381c.Log.d(TAG, "The input method toggled text monitoring ".concat(z17 ? "on" : "off"));
        }
        this.f71663x57cfd49b = z17 ? extractedTextRequest : null;
        return m138487xb703d277(extractedTextRequest);
    }

    public C28696x8a22c93d(android.view.View view, int i17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6 c28675xdb64c7c6, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679 c28668x1b725679, io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d.KeyboardDelegate keyboardDelegate, io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a c28697x79969c3a, android.view.inputmethod.EditorInfo editorInfo) {
        this(view, i17, c28675xdb64c7c6, c28668x1b725679, keyboardDelegate, c28697x79969c3a, editorInfo, new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09());
    }
}
