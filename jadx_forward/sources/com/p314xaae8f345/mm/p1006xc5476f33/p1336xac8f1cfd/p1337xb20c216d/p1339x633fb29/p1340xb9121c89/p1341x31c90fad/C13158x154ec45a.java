package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad;

/* renamed from: com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText */
/* loaded from: classes12.dex */
public class C13158x154ec45a extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 implements android.text.SpanWatcher {
    public android.text.Spannable A;
    public int B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a C;
    public boolean D;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public nx1.x f178130J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public android.graphics.Paint P;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 Q;
    public ox1.c R;
    public boolean S;
    public android.graphics.Path T;
    public int U;
    public int V;
    public int W;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f178131p0;

    /* renamed from: r, reason: collision with root package name */
    public mx1.c f178132r;

    /* renamed from: s, reason: collision with root package name */
    public int f178133s;

    /* renamed from: t, reason: collision with root package name */
    public int f178134t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f178135u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f178136v;

    /* renamed from: w, reason: collision with root package name */
    public int f178137w;

    /* renamed from: x, reason: collision with root package name */
    public int f178138x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.text.TextWatcher f178139x0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f178140y;

    /* renamed from: y0, reason: collision with root package name */
    public int f178141y0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f178142z;

    public C13158x154ec45a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f178133s = -1;
        this.f178134t = -1;
        this.f178135u = false;
        this.f178142z = "";
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
        this.f178131p0 = false;
        this.f178139x0 = new nx1.s(this);
        this.f178141y0 = 0;
        r();
    }

    /* renamed from: getRTLayout */
    private nx1.x m54585xa0eb9162() {
        nx1.x xVar;
        synchronized (this) {
            if (this.f178130J == null || this.I) {
                this.f178130J = new nx1.x(getText());
                this.I = false;
            }
            xVar = this.f178130J;
        }
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setParagraphsAreUp2Date */
    public synchronized void m54586x97e02678(boolean z17) {
        if (!this.G) {
            this.F = z17;
        }
    }

    public void A(android.text.Spannable spannable) {
        int selectionStart = getSelectionStart();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.gb) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.c7) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.c7.class))).getClass();
        com.p314xaae8f345.mm.p2614xca6eae71.x1 Di = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di();
        getContext();
        m54600x44df82c9(Di.Ri(spannable, true));
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
        this.f178136v = false;
    }

    public final void C() {
        ox1.c cVar = this.R;
        if (cVar == null) {
            this.R = new ox1.c();
            return;
        }
        cVar.f431114a = 0;
        cVar.f431115b = -1.0f;
        cVar.f431116c = -1.0f;
        cVar.f431117d = -1.0f;
        cVar.f431118e = -1.0f;
        cVar.f431119f = -1;
        cVar.f431120g = -1.0f;
        cVar.f431121h = -1.0f;
        cVar.f431122i = -1.0f;
        cVar.f431123j = -1.0f;
        cVar.f431124k = -1;
    }

    public final void D() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.Q;
        if (b4Var == null) {
            this.Q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new nx1.t(this), false);
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

    /* renamed from: getCurrentEditorCursorNumberSpan */
    public px1.k[] m54587xfeada2d9() {
        nx1.p m54591x80562c = m54591x80562c();
        return (px1.k[]) getText().getSpans(m54591x80562c.f422848d, m54591x80562c.f422849e, px1.k.class);
    }

    /* renamed from: getCurrentEditorCursorParagraphStr */
    public java.lang.String m54588x90297509() {
        nx1.p m54591x80562c = m54591x80562c();
        return getText().subSequence(m54591x80562c.f422848d, m54591x80562c.f422849e).toString().trim();
    }

    /* renamed from: getEditTextType */
    public int m54589xbc88a4a7() {
        return this.B;
    }

    /* renamed from: getParagraphs */
    public java.util.ArrayList<px1.l> m54590xa1cbb() {
        return m54585xa0eb9162().f422860e;
    }

    /* renamed from: getParagraphsInSelection */
    public nx1.p m54591x80562c() {
        nx1.x m54585xa0eb9162 = m54585xa0eb9162();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart > selectionEnd) {
            selectionEnd = selectionStart;
            selectionStart = selectionEnd;
        }
        int a17 = m54585xa0eb9162.a(selectionStart);
        int i17 = 0;
        if (!(selectionStart == selectionEnd)) {
            selectionEnd--;
        }
        int a18 = m54585xa0eb9162.a(selectionEnd);
        java.util.ArrayList arrayList = m54585xa0eb9162.f422860e;
        int i18 = m54585xa0eb9162.f422859d;
        int i19 = (i18 == 0 || a17 < 0) ? 0 : a17 < i18 ? ((px1.l) arrayList.get(a17)).f422848d : ((px1.l) arrayList.get(i18 - 1)).f422849e - 1;
        if (i18 != 0 && a18 >= 0) {
            i17 = a18 < i18 ? ((px1.l) arrayList.get(a18)).f422849e : ((px1.l) arrayList.get(i18 - 1)).f422849e - 1;
        }
        return new nx1.p(i19, i17);
    }

    /* renamed from: getPosInDataList */
    public int m54592x1c481d6b() {
        return this.N;
    }

    /* renamed from: getRecyclerItemPosition */
    public int m54593xef703fb1() {
        if (this.E.m8186xceeefb69() == -1) {
            return 0;
        }
        return this.E.m8186xceeefb69();
    }

    /* renamed from: getSelectedText */
    public java.lang.String m54594xf85f78de() {
        int i17;
        android.text.Editable text = getText();
        nx1.p m54595x9925e2d6 = m54595x9925e2d6();
        if (m54595x9925e2d6.f422848d < 0 || (i17 = m54595x9925e2d6.f422849e) < 0 || i17 > text.length()) {
            return null;
        }
        return text.subSequence(m54595x9925e2d6.f422848d, m54595x9925e2d6.f422849e).toString();
    }

    /* renamed from: getSelection */
    public nx1.p m54595x9925e2d6() {
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
                int i19 = l17.f431129b;
                int i27 = l17.f431131d;
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
                i17 = l17.f431131d;
                z17 = false;
                z18 = true;
            } else if (g17 != 4) {
                z18 = false;
                z17 = false;
                i17 = -1;
                i18 = -1;
            } else {
                int i28 = l17.f431129b;
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
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("noteeditor.WXRTEditText", "tryDrawCover: ", e);
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
        this.f178131p0 = false;
        this.f178133s = -1;
        this.f178134t = -1;
        super.onFocusChanged(z17, i17, rect);
        mx1.c cVar = this.f178132r;
        if (cVar != null) {
            int m54593xef703fb1 = m54593xef703fb1();
            nx1.z zVar = (nx1.z) cVar;
            synchronized (zVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) zVar.f422865b;
                abstractActivityC13156x6363e8e1.getClass();
                if (abstractActivityC13156x6363e8e1.f178043t) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1338xbb6ca34f.C13157x77477b31 c13157x77477b31 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1338xbb6ca34f.C13157x77477b31) abstractActivityC13156x6363e8e1.f178030d.getLayoutManager();
                    if (c13157x77477b31 != null) {
                        if (abstractActivityC13156x6363e8e1.f178041r) {
                            c13157x77477b31.f178057x = false;
                        } else {
                            c13157x77477b31.f178057x = z17;
                        }
                    }
                    if (!z17) {
                        nx1.d.q().z(-1, false, true);
                    } else if (m54589xbc88a4a7() == 1) {
                        nx1.d.q().y(m54593xef703fb1, true);
                    } else {
                        nx1.d.q().y(m54593xef703fb1, false);
                    }
                }
            }
        }
        if (!z17 || this.f178131p0) {
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
            if (this.f178135u) {
                return;
            }
            this.f178131p0 = true;
            if (i17 < 0) {
                return;
            }
            if (this.f178133s != i17 || this.f178134t != i18) {
                this.f178133s = i17;
                this.f178134t = i18;
                super.onSelectionChanged(i17, i18);
                if (!this.F) {
                    this.G = true;
                    px1.v.b(this, new px1.u[0]);
                    this.G = false;
                    m54586x97e02678(true);
                }
                mx1.c cVar = this.f178132r;
                if (cVar != null) {
                    this.H = true;
                    nx1.z zVar = (nx1.z) cVar;
                    if (zVar.f422867d) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) zVar.f422865b;
                        abstractActivityC13156x6363e8e1.getClass();
                        abstractActivityC13156x6363e8e1.f178041r = java.lang.Math.abs(i18 - i17) >= 1;
                        if (m54589xbc88a4a7() == 0) {
                            java.util.Iterator it = px1.v.f440398f.iterator();
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
                        qx1.q qVar = (qx1.q) zVar.f422866c;
                        qVar.f448853n = z27;
                        qVar.f448847h.setPressed(z27);
                        qx1.q qVar2 = (qx1.q) zVar.f422866c;
                        qVar2.f448850k = z17;
                        qVar2.f448844e.setPressed(z17);
                        qx1.q qVar3 = (qx1.q) zVar.f422866c;
                        qVar3.f448851l = z18;
                        qVar3.f448845f.setPressed(z18);
                        qx1.q qVar4 = (qx1.q) zVar.f422866c;
                        qVar4.f448852m = z19;
                        qVar4.f448846g.setPressed(z19);
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
            m54586x97e02678(false);
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18, int i19, int i27) {
        if ((obj instanceof px1.h) && (obj instanceof android.text.style.ParagraphStyle)) {
            m54586x97e02678(false);
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        if ((obj instanceof px1.h) && (obj instanceof android.text.style.ParagraphStyle)) {
            m54586x97e02678(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if (i17 == 16908319) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) ((nx1.z) this.f178132r).f422865b;
            abstractActivityC13156x6363e8e1.getClass();
            if (!abstractActivityC13156x6363e8e1.f178033g.f448848i) {
                abstractActivityC13156x6363e8e1.b5();
                abstractActivityC13156x6363e8e1.f178040q.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p0(abstractActivityC13156x6363e8e1, abstractActivityC13156x6363e8e1.mo55332x76847179()), 400L);
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
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e12 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) ((nx1.z) this.f178132r).f422865b;
                abstractActivityC13156x6363e8e12.getClass();
                java.util.ArrayList arrayList = nx1.b.f422812b;
                if (arrayList != null && arrayList.size() > 0) {
                    z17 = true;
                }
                if (z17) {
                    java.util.ArrayList b17 = nx1.b.b();
                    if (nx1.d.q().g(b17)) {
                        abstractActivityC13156x6363e8e12.f7();
                    } else {
                        nx1.d.q().s(b17, this, true, true, true, false, false);
                        int m54593xef703fb1 = m54593xef703fb1();
                        nx1.d.q().d(m54593xef703fb1, b17.size() + m54593xef703fb1 + 1, true);
                        abstractActivityC13156x6363e8e12.b5();
                        if (abstractActivityC13156x6363e8e12.f178037n) {
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
                this.f178141y0 = 0;
                android.text.Editable text = getText();
                try {
                    A(text);
                } catch (java.lang.IndexOutOfBoundsException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("noteeditor.WXRTEditText", "!!MMEditText Exception %d", java.lang.Integer.valueOf(this.f178141y0));
                    if (this.f178141y0 >= 3) {
                        throw e17;
                    }
                    this.f178141y0++;
                    A(new android.text.SpannableStringBuilder(android.text.TextUtils.concat(" ", text)));
                }
            }
            if (i17 == 16908322 && this.D) {
                mx1.c cVar = this.f178132r;
                if (cVar != null) {
                    ((nx1.z) cVar).h(false, 0L);
                    ((nx1.z) this.f178132r).g(0, 0L);
                }
                this.D = false;
            }
            return onTextContextMenuItem;
        } catch (java.lang.NullPointerException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("noteeditor.WXRTEditText", "!!MMEditText NullPointerException %s", e18);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        this.C = this;
        android.text.TextWatcher textWatcher = this.f178139x0;
        removeTextChangedListener(textWatcher);
        addTextChangedListener(textWatcher);
        if (px1.f.f440356a == null) {
            px1.f.f440356a = new px1.f();
        }
        setMovementMethod(px1.f.f440356a);
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
        jg5.c.f381198a.a(this, 1);
    }

    /* renamed from: setEditTextType */
    public void m54596xf2d19fb3(int i17) {
        this.B = i17;
    }

    /* renamed from: setIgnoreSelectChangeByMultiSelect */
    public void m54597xd8d9cbde(boolean z17) {
        this.S = z17;
    }

    @Override // android.widget.TextView
    public void setMaxHeight(int i17) {
        super.setMaxHeight(i17);
    }

    /* renamed from: setPosInDataList */
    public void m54598xaf1e83df(int i17) {
        this.N = i17;
    }

    /* renamed from: setRichTextEditing */
    public void m54599xe08d546d(java.lang.String str) {
        x();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            m54601x765074af("");
        } else {
            m54600x44df82c9(lx1.a.a(str));
        }
        B();
    }

    /* renamed from: setSpannableText */
    public void m54600x44df82c9(android.text.Spanned spanned) {
        x();
        synchronized (this) {
            this.f178135u = true;
        }
        super.setText(spanned, android.widget.TextView.BufferType.EDITABLE);
        synchronized (this) {
            this.f178135u = false;
        }
        t();
        px1.v.b(this, new px1.u[0]);
        B();
    }

    /* renamed from: setText */
    public void m54601x765074af(java.lang.String str) {
        x();
        super.setText((java.lang.CharSequence) str);
        B();
    }

    /* renamed from: setTextWithoutIgnore */
    public void m54602x5bdd444b(java.lang.String str) {
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
        android.text.Spannable v17 = this.f178136v ? null : v();
        uVar.a(this, obj);
        synchronized (this) {
            if (this.f178132r != null && !this.f178136v) {
                ((nx1.z) this.f178132r).e(this, v17, v(), getSelectionStart(), getSelectionEnd(), getSelectionStart(), getSelectionEnd());
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
        return wVar == nx1.w.f422856a ? getText().toString() : wVar == nx1.w.f422857b ? lx1.c.a(getText()) : "";
    }

    public synchronized void x() {
        this.f178136v = true;
    }

    public void y() {
        mx1.c cVar = this.f178132r;
        if (cVar != null) {
            ((nx1.z) cVar).h(true, 50L);
            ((nx1.z) this.f178132r).g(1, 0L);
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
            boolean r0 = r0.f431148a
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
            r9.m54597xd8d9cbde(r2)
            r9.setSelection(r10, r11)
            r9.m54597xd8d9cbde(r3)
            mx1.c r0 = r9.f178132r
            if (r0 == 0) goto L79
            nx1.z r0 = (nx1.z) r0
            r0.h(r2, r4)
            mx1.c r0 = r9.f178132r
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a.z(int, boolean):void");
    }

    public C13158x154ec45a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f178133s = -1;
        this.f178134t = -1;
        this.f178135u = false;
        this.f178142z = "";
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
        this.f178131p0 = false;
        this.f178139x0 = new nx1.s(this);
        this.f178141y0 = 0;
        r();
    }
}
