package com.tencent.mm.plugin.component.editor.model.nativenote.manager;

/* loaded from: classes12.dex */
public class WXRTEditText extends com.tencent.mm.ui.widget.edittext.PasterEditText implements android.text.SpanWatcher {
    public android.text.Spannable A;
    public int B;
    public com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText C;
    public boolean D;
    public androidx.recyclerview.widget.k3 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public nx1.x f96597J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public android.graphics.Paint P;
    public com.tencent.mm.sdk.platformtools.b4 Q;
    public ox1.c R;
    public boolean S;
    public android.graphics.Path T;
    public int U;
    public int V;
    public int W;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f96598p0;

    /* renamed from: r, reason: collision with root package name */
    public mx1.c f96599r;

    /* renamed from: s, reason: collision with root package name */
    public int f96600s;

    /* renamed from: t, reason: collision with root package name */
    public int f96601t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f96602u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f96603v;

    /* renamed from: w, reason: collision with root package name */
    public int f96604w;

    /* renamed from: x, reason: collision with root package name */
    public int f96605x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.text.TextWatcher f96606x0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f96607y;

    /* renamed from: y0, reason: collision with root package name */
    public int f96608y0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f96609z;

    public WXRTEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96600s = -1;
        this.f96601t = -1;
        this.f96602u = false;
        this.f96609z = "";
        this.B = 0;
        this.C = null;
        this.D = false;
        this.H = false;
        this.K = false;
        this.L = 0;
        this.M = false;
        this.N = -1;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = false;
        this.T = null;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f96598p0 = false;
        this.f96606x0 = new nx1.s(this);
        this.f96608y0 = 0;
        r();
    }

    private nx1.x getRTLayout() {
        nx1.x xVar;
        synchronized (this) {
            if (this.f96597J == null || this.I) {
                this.f96597J = new nx1.x(getText());
                this.I = false;
            }
            xVar = this.f96597J;
        }
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setParagraphsAreUp2Date(boolean z17) {
        if (!this.G) {
            this.F = z17;
        }
    }

    public void A(android.text.Spannable spannable) {
        int selectionStart = getSelectionStart();
        ((com.tencent.mm.feature.emoji.gb) ((com.tencent.mm.feature.emoji.api.c7) i95.n0.c(com.tencent.mm.feature.emoji.api.c7.class))).getClass();
        com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
        getContext();
        setSpannableText(Di.Ri(spannable, true));
        int length = getText().length() - spannable.length();
        if (length <= 0) {
            setSelection(selectionStart);
            return;
        }
        int i17 = selectionStart + length;
        if (i17 <= getText().length()) {
            setSelection(i17);
        }
    }

    public synchronized void B() {
        this.f96603v = false;
    }

    public final void C() {
        ox1.c cVar = this.R;
        if (cVar == null) {
            this.R = new ox1.c();
            return;
        }
        cVar.f349581a = 0;
        cVar.f349582b = -1.0f;
        cVar.f349583c = -1.0f;
        cVar.f349584d = -1.0f;
        cVar.f349585e = -1.0f;
        cVar.f349586f = -1;
        cVar.f349587g = -1.0f;
        cVar.f349588h = -1.0f;
        cVar.f349589i = -1.0f;
        cVar.f349590j = -1.0f;
        cVar.f349591k = -1;
    }

    public final void D() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.Q;
        if (b4Var == null) {
            this.Q = new com.tencent.mm.sdk.platformtools.b4(new nx1.t(this), false);
        } else {
            b4Var.d();
        }
    }

    public final void E(int i17, int i18) {
        int i19 = this.B;
        if (i19 == 2) {
            ox1.s h17 = ox1.s.h();
            int i27 = this.N;
            h17.v(i27, 1, i27, 1);
        } else if (i19 == 1) {
            ox1.s h18 = ox1.s.h();
            int i28 = this.N;
            h18.v(i28, 0, i28, 0);
        } else {
            ox1.s h19 = ox1.s.h();
            int i29 = this.N;
            h19.v(i29, i17, i29, i18);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public px1.k[] getCurrentEditorCursorNumberSpan() {
        nx1.p paragraphsInSelection = getParagraphsInSelection();
        return (px1.k[]) getText().getSpans(paragraphsInSelection.f341315d, paragraphsInSelection.f341316e, px1.k.class);
    }

    public java.lang.String getCurrentEditorCursorParagraphStr() {
        nx1.p paragraphsInSelection = getParagraphsInSelection();
        return getText().subSequence(paragraphsInSelection.f341315d, paragraphsInSelection.f341316e).toString().trim();
    }

    public int getEditTextType() {
        return this.B;
    }

    public java.util.ArrayList<px1.l> getParagraphs() {
        return getRTLayout().f341327e;
    }

    public nx1.p getParagraphsInSelection() {
        nx1.x rTLayout = getRTLayout();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart > selectionEnd) {
            selectionEnd = selectionStart;
            selectionStart = selectionEnd;
        }
        int a17 = rTLayout.a(selectionStart);
        int i17 = 0;
        if (!(selectionStart == selectionEnd)) {
            selectionEnd--;
        }
        int a18 = rTLayout.a(selectionEnd);
        java.util.ArrayList arrayList = rTLayout.f341327e;
        int i18 = rTLayout.f341326d;
        int i19 = (i18 == 0 || a17 < 0) ? 0 : a17 < i18 ? ((px1.l) arrayList.get(a17)).f341315d : ((px1.l) arrayList.get(i18 - 1)).f341316e - 1;
        if (i18 != 0 && a18 >= 0) {
            i17 = a18 < i18 ? ((px1.l) arrayList.get(a18)).f341316e : ((px1.l) arrayList.get(i18 - 1)).f341316e - 1;
        }
        return new nx1.p(i19, i17);
    }

    public int getPosInDataList() {
        return this.N;
    }

    public int getRecyclerItemPosition() {
        if (this.E.getLayoutPosition() == -1) {
            return 0;
        }
        return this.E.getLayoutPosition();
    }

    public java.lang.String getSelectedText() {
        int i17;
        android.text.Editable text = getText();
        nx1.p selection = getSelection();
        if (selection.f341315d < 0 || (i17 = selection.f341316e) < 0 || i17 > text.length()) {
            return null;
        }
        return text.subSequence(selection.f341315d, selection.f341316e).toString();
    }

    public nx1.p getSelection() {
        return new nx1.p(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.text.Editable text;
        boolean z17;
        int i17;
        boolean z18;
        android.text.Layout layout;
        int lineForOffset;
        int lineForOffset2;
        if (ox1.s.K && this.B == 0 && (text = getText()) != null) {
            ox1.e l17 = ox1.s.h().l();
            int g17 = ox1.s.h().g(this.N);
            int i18 = 0;
            if (g17 == 1) {
                int i19 = l17.f349596b;
                int i27 = l17.f349598d;
                if (i19 != i27) {
                    z17 = false;
                    i18 = i19;
                    i17 = i27;
                    z18 = false;
                }
            } else if (g17 == 2) {
                i17 = text.length();
                z18 = true;
                z17 = true;
            } else if (g17 == 3) {
                i17 = l17.f349598d;
                z17 = false;
                z18 = true;
            } else if (g17 != 4) {
                z18 = false;
                z17 = false;
                i17 = -1;
                i18 = -1;
            } else {
                int i28 = l17.f349596b;
                i17 = text.length();
                z17 = true;
                i18 = i28;
                z18 = false;
            }
            if (i18 >= 0 && i17 <= text.length() && i18 <= i17 && (layout = getLayout()) != null) {
                if (this.U == -1) {
                    this.U = getPaddingLeft();
                }
                if (this.V == -1) {
                    this.V = getPaddingTop();
                }
                if (this.W == -1) {
                    this.W = getPaddingBottom();
                }
                if (this.T == null) {
                    this.T = new android.graphics.Path();
                }
                this.T.reset();
                try {
                    lineForOffset = layout.getLineForOffset(i18);
                    lineForOffset2 = layout.getLineForOffset(i17);
                } catch (java.lang.Exception e17) {
                    e = e17;
                }
                if (lineForOffset <= lineForOffset2) {
                    int width = layout.getWidth();
                    float primaryHorizontal = layout.getPrimaryHorizontal(i18) + this.U;
                    float lineTop = layout.getLineTop(lineForOffset) + this.V;
                    float lineBottom = layout.getLineBottom(lineForOffset) + this.V;
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(i17) + this.U;
                    float lineTop2 = layout.getLineTop(lineForOffset2) + this.V;
                    float lineBottom2 = layout.getLineBottom(lineForOffset2) + this.V;
                    if (z18 && z17) {
                        this.T.addRect(this.U, 0.0f, r2 + width, lineBottom2 + this.W, android.graphics.Path.Direction.CW);
                    } else if (lineForOffset != lineForOffset2) {
                        if (z18) {
                            this.T.addRect(this.U, 0.0f, r2 + width, lineBottom, android.graphics.Path.Direction.CW);
                            this.T.addRect(this.U, lineTop2, primaryHorizontal2, lineBottom2, android.graphics.Path.Direction.CW);
                        } else if (z17) {
                            this.T.addRect(primaryHorizontal, lineTop, this.U + width, lineBottom, android.graphics.Path.Direction.CW);
                            this.T.addRect(this.U, lineTop2, r2 + width, lineBottom2 + this.W, android.graphics.Path.Direction.CW);
                        } else {
                            this.T.addRect(primaryHorizontal, lineTop, this.U + width, lineBottom, android.graphics.Path.Direction.CW);
                            this.T.addRect(this.U, lineTop2, primaryHorizontal2, lineBottom2, android.graphics.Path.Direction.CW);
                        }
                        if (lineForOffset2 - lineForOffset > 1) {
                            this.T.addRect(this.U, lineBottom, r0 + width, lineTop2, android.graphics.Path.Direction.CW);
                        }
                    } else if (z18) {
                        this.T.addRect(this.U, 0.0f, primaryHorizontal2, lineBottom2, android.graphics.Path.Direction.CW);
                    } else if (z17) {
                        this.T.addRect(primaryHorizontal, lineTop, this.U + width, lineBottom2 + this.W, android.graphics.Path.Direction.CW);
                    } else {
                        this.T.addRect(primaryHorizontal, lineTop, primaryHorizontal2, lineBottom2, android.graphics.Path.Direction.CW);
                    }
                    if (!this.T.isEmpty()) {
                        if (this.P == null) {
                            android.graphics.Paint paint = new android.graphics.Paint(1);
                            this.P = paint;
                            paint.setColor(1347529272);
                        }
                        try {
                            canvas.drawPath(this.T, this.P);
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            com.tencent.mars.xlog.Log.e("noteeditor.WXRTEditText", "tryDrawCover: ", e);
                            super.onDraw(canvas);
                        }
                        super.onDraw(canvas);
                    }
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        this.f96598p0 = false;
        this.f96600s = -1;
        this.f96601t = -1;
        super.onFocusChanged(z17, i17, rect);
        mx1.c cVar = this.f96599r;
        if (cVar != null) {
            int recyclerItemPosition = getRecyclerItemPosition();
            nx1.z zVar = (nx1.z) cVar;
            synchronized (zVar) {
                com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) zVar.f341332b;
                editorUI.getClass();
                if (editorUI.f96510t) {
                    com.tencent.mm.plugin.component.editor.adapter.EditorLinearLayoutManager editorLinearLayoutManager = (com.tencent.mm.plugin.component.editor.adapter.EditorLinearLayoutManager) editorUI.f96497d.getLayoutManager();
                    if (editorLinearLayoutManager != null) {
                        if (editorUI.f96508r) {
                            editorLinearLayoutManager.f96524x = false;
                        } else {
                            editorLinearLayoutManager.f96524x = z17;
                        }
                    }
                    if (!z17) {
                        nx1.d.q().z(-1, false, true);
                    } else if (getEditTextType() == 1) {
                        nx1.d.q().y(recyclerItemPosition, true);
                    } else {
                        nx1.d.q().y(recyclerItemPosition, false);
                    }
                }
            }
        }
        if (!z17 || this.f96598p0) {
            return;
        }
        onSelectionChanged(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i17, int i18) {
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        synchronized (this) {
            if (this.f96602u) {
                return;
            }
            this.f96598p0 = true;
            if (i17 < 0) {
                return;
            }
            if (this.f96600s != i17 || this.f96601t != i18) {
                this.f96600s = i17;
                this.f96601t = i18;
                super.onSelectionChanged(i17, i18);
                if (!this.F) {
                    this.G = true;
                    px1.v.b(this, new px1.u[0]);
                    this.G = false;
                    setParagraphsAreUp2Date(true);
                }
                mx1.c cVar = this.f96599r;
                if (cVar != null) {
                    this.H = true;
                    nx1.z zVar = (nx1.z) cVar;
                    if (zVar.f341334d) {
                        com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) zVar.f341332b;
                        editorUI.getClass();
                        editorUI.f96508r = java.lang.Math.abs(i18 - i17) >= 1;
                        if (getEditTextType() == 0) {
                            java.util.Iterator it = px1.v.f358865f.iterator();
                            z17 = false;
                            z18 = false;
                            z19 = false;
                            z27 = false;
                            while (it.hasNext()) {
                                px1.u uVar = (px1.u) it.next();
                                if (!uVar.d(getText(), uVar.c(this), px1.r.SPAN_FLAGS).isEmpty()) {
                                    if (uVar instanceof px1.b) {
                                        z27 = true;
                                    } else if (uVar instanceof px1.c) {
                                        z17 = true;
                                    } else if (uVar instanceof px1.j) {
                                        z18 = true;
                                    } else if (uVar instanceof px1.s) {
                                        z19 = true;
                                    }
                                }
                            }
                        } else {
                            z17 = false;
                            z18 = false;
                            z19 = false;
                            z27 = false;
                        }
                        qx1.q qVar = (qx1.q) zVar.f341333c;
                        qVar.f367320n = z27;
                        qVar.f367314h.setPressed(z27);
                        qx1.q qVar2 = (qx1.q) zVar.f341333c;
                        qVar2.f367317k = z17;
                        qVar2.f367311e.setPressed(z17);
                        qx1.q qVar3 = (qx1.q) zVar.f341333c;
                        qVar3.f367318l = z18;
                        qVar3.f367312f.setPressed(z18);
                        qx1.q qVar4 = (qx1.q) zVar.f341333c;
                        qVar4.f367319m = z19;
                        qVar4.f367313g.setPressed(z19);
                    }
                    this.H = false;
                }
            }
            if (!ox1.s.K || this.S || !hasFocus() || this.N < 0) {
                return;
            }
            E(i17, i18);
            if (ox1.s.h().g(this.N) == 1) {
                ox1.s h17 = ox1.s.h();
                if (!ox1.s.K) {
                    h17.getClass();
                    return;
                }
                h17.E(true, 0L);
                h17.n();
                h17.p();
            }
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        if ((obj instanceof px1.h) && (obj instanceof android.text.style.ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18, int i19, int i27) {
        if ((obj instanceof px1.h) && (obj instanceof android.text.style.ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        if ((obj instanceof px1.h) && (obj instanceof android.text.style.ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
    }

    @Override // com.tencent.mm.ui.widget.edittext.PasterEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if (i17 == 16908319) {
            com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) ((nx1.z) this.f96599r).f341332b;
            editorUI.getClass();
            if (!editorUI.f96500g.f367315i) {
                editorUI.b5();
                editorUI.f96507q.postDelayed(new com.tencent.mm.plugin.component.editor.p0(editorUI, editorUI.getContext()), 400L);
            }
            return true;
        }
        boolean z17 = false;
        if (i17 == 16908321 || i17 == 16908320) {
            nx1.b.a();
        } else if (i17 == 16908322) {
            int c17 = nx1.b.c(getContext());
            if (c17 == 2) {
                nx1.b.a();
            } else if (c17 == 3) {
                com.tencent.mm.plugin.component.editor.EditorUI editorUI2 = (com.tencent.mm.plugin.component.editor.EditorUI) ((nx1.z) this.f96599r).f341332b;
                editorUI2.getClass();
                java.util.ArrayList arrayList = nx1.b.f341279b;
                if (arrayList != null && arrayList.size() > 0) {
                    z17 = true;
                }
                if (z17) {
                    java.util.ArrayList b17 = nx1.b.b();
                    if (nx1.d.q().g(b17)) {
                        editorUI2.f7();
                    } else {
                        nx1.d.q().s(b17, this, true, true, true, false, false);
                        int recyclerItemPosition = getRecyclerItemPosition();
                        nx1.d.q().d(recyclerItemPosition, b17.size() + recyclerItemPosition + 1, true);
                        editorUI2.b5();
                        if (editorUI2.f96504n) {
                            ox1.s.h().c();
                        }
                    }
                }
                return true;
            }
        }
        try {
            boolean onTextContextMenuItem = super.onTextContextMenuItem(i17);
            if (i17 == 16908322) {
                this.f96608y0 = 0;
                android.text.Editable text = getText();
                try {
                    A(text);
                } catch (java.lang.IndexOutOfBoundsException e17) {
                    com.tencent.mars.xlog.Log.e("noteeditor.WXRTEditText", "!!MMEditText Exception %d", java.lang.Integer.valueOf(this.f96608y0));
                    if (this.f96608y0 >= 3) {
                        throw e17;
                    }
                    this.f96608y0++;
                    A(new android.text.SpannableStringBuilder(android.text.TextUtils.concat(" ", text)));
                }
            }
            if (i17 == 16908322 && this.D) {
                mx1.c cVar = this.f96599r;
                if (cVar != null) {
                    ((nx1.z) cVar).h(false, 0L);
                    ((nx1.z) this.f96599r).g(0, 0L);
                }
                this.D = false;
            }
            return onTextContextMenuItem;
        } catch (java.lang.NullPointerException e18) {
            com.tencent.mars.xlog.Log.e("noteeditor.WXRTEditText", "!!MMEditText NullPointerException %s", e18);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        this.C = this;
        android.text.TextWatcher textWatcher = this.f96606x0;
        removeTextChangedListener(textWatcher);
        addTextChangedListener(textWatcher);
        if (px1.f.f358823a == null) {
            px1.f.f358823a = new px1.f();
        }
        setMovementMethod(px1.f.f358823a);
        this.N = -1;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.P = paint;
        paint.setColor(1347529272);
        this.R = new ox1.c();
        this.T = new android.graphics.Path();
        this.U = -1;
        this.V = -1;
        this.W = -1;
        if (ox1.s.K) {
            setHighlightColor(0);
            setCustomSelectionActionModeCallback(new nx1.r(this));
        }
        jg5.c.f299665a.a(this, 1);
    }

    public void setEditTextType(int i17) {
        this.B = i17;
    }

    public void setIgnoreSelectChangeByMultiSelect(boolean z17) {
        this.S = z17;
    }

    @Override // android.widget.TextView
    public void setMaxHeight(int i17) {
        super.setMaxHeight(i17);
    }

    public void setPosInDataList(int i17) {
        this.N = i17;
    }

    public void setRichTextEditing(java.lang.String str) {
        x();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            setText("");
        } else {
            setSpannableText(lx1.a.a(str));
        }
        B();
    }

    public void setSpannableText(android.text.Spanned spanned) {
        x();
        synchronized (this) {
            this.f96602u = true;
        }
        super.setText(spanned, android.widget.TextView.BufferType.EDITABLE);
        synchronized (this) {
            this.f96602u = false;
        }
        t();
        px1.v.b(this, new px1.u[0]);
        B();
    }

    public void setText(java.lang.String str) {
        x();
        super.setText((java.lang.CharSequence) str);
        B();
    }

    public void setTextWithoutIgnore(java.lang.String str) {
        super.setText((java.lang.CharSequence) str);
    }

    public final void t() {
        android.text.Editable text = getText();
        if (text.getSpans(0, text.length(), getClass()) != null) {
            text.setSpan(this, 0, text.length(), 18);
        }
    }

    public void u(px1.u uVar, java.lang.Object obj) {
        if (this.H) {
            return;
        }
        android.text.Spannable v17 = this.f96603v ? null : v();
        uVar.a(this, obj);
        synchronized (this) {
            if (this.f96599r != null && !this.f96603v) {
                ((nx1.z) this.f96599r).e(this, v17, v(), getSelectionStart(), getSelectionEnd(), getSelectionStart(), getSelectionEnd());
            }
            this.I = true;
        }
    }

    public android.text.Spannable v() {
        java.lang.CharSequence text = super.getText();
        if (text == null) {
            text = "";
        }
        return new nx1.a(text);
    }

    public java.lang.String w(nx1.w wVar) {
        return wVar == nx1.w.f341323a ? getText().toString() : wVar == nx1.w.f341324b ? lx1.c.a(getText()) : "";
    }

    public synchronized void x() {
        this.f96603v = true;
    }

    public void y() {
        mx1.c cVar = this.f96599r;
        if (cVar != null) {
            ((nx1.z) cVar).h(true, 50L);
            ((nx1.z) this.f96599r).g(1, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(int r10, boolean r11) {
        /*
            r9 = this;
            android.text.Editable r0 = r9.getText()
            if (r0 != 0) goto L7
            return
        L7:
            android.text.Layout r1 = r9.getLayout()
            if (r1 != 0) goto Le
            return
        Le:
            int r2 = r0.length()
            if (r10 < 0) goto L83
            if (r10 <= r2) goto L18
            goto L83
        L18:
            r3 = 0
            if (r2 != 0) goto L1d
            r10 = r3
            goto L3a
        L1d:
            if (r10 >= r2) goto L2e
            if (r11 != 0) goto L29
            char r11 = r0.charAt(r10)
            r0 = 10
            if (r11 == r0) goto L3a
        L29:
            int r11 = r1.getOffsetToRightOf(r10)
            goto L3b
        L2e:
            if (r10 != r2) goto L3a
            if (r11 == 0) goto L3a
            int r11 = r1.getOffsetToLeftOf(r10)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L3b
        L3a:
            r11 = r10
        L3b:
            if (r10 < 0) goto L83
            if (r10 > r2) goto L83
            if (r11 < 0) goto L83
            if (r11 <= r2) goto L44
            goto L83
        L44:
            ox1.s r0 = ox1.s.h()
            boolean r1 = ox1.s.K
            r2 = 1
            if (r1 == 0) goto L53
            boolean r0 = r0.f349615a
            if (r0 == 0) goto L56
            r0 = r2
            goto L57
        L53:
            r0.getClass()
        L56:
            r0 = r3
        L57:
            r4 = 50
            if (r0 == 0) goto L79
            r9.requestFocus()
            r9.setIgnoreSelectChangeByMultiSelect(r2)
            r9.setSelection(r10, r11)
            r9.setIgnoreSelectChangeByMultiSelect(r3)
            mx1.c r0 = r9.f96599r
            if (r0 == 0) goto L79
            nx1.z r0 = (nx1.z) r0
            r0.h(r2, r4)
            mx1.c r0 = r9.f96599r
            r6 = 0
            nx1.z r0 = (nx1.z) r0
            r0.g(r2, r6)
        L79:
            r9.E(r10, r11)
            ox1.s r10 = ox1.s.h()
            r10.A(r2, r2, r4)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText.z(int, boolean):void");
    }

    public WXRTEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f96600s = -1;
        this.f96601t = -1;
        this.f96602u = false;
        this.f96609z = "";
        this.B = 0;
        this.C = null;
        this.D = false;
        this.H = false;
        this.K = false;
        this.L = 0;
        this.M = false;
        this.N = -1;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = false;
        this.T = null;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f96598p0 = false;
        this.f96606x0 = new nx1.s(this);
        this.f96608y0 = 0;
        r();
    }
}
