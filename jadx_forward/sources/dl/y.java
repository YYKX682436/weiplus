package dl;

/* loaded from: classes10.dex */
public class y extends dl.b {
    public android.graphics.Paint D;
    public an0.a I;
    public int L;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Runnable f316687s;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Handler f316685q = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f316686r = false;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Rect f316688t = new android.graphics.Rect();

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f316689u = new android.graphics.Rect();

    /* renamed from: v, reason: collision with root package name */
    public boolean f316690v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f316691w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f316692x = false;

    /* renamed from: y, reason: collision with root package name */
    public float f316693y = 0.0f;

    /* renamed from: z, reason: collision with root package name */
    public float f316694z = 0.0f;
    public int A = 0;
    public int B = 0;
    public boolean C = false;
    public boolean E = false;
    public boolean G = false;
    public final ok.m H = new ok.m(this);

    /* renamed from: J, reason: collision with root package name */
    public boolean f316684J = false;
    public boolean K = false;
    public final hk0.v0 M = new hk0.v0();
    public final android.graphics.Matrix N = new android.graphics.Matrix();
    public boolean O = false;

    @Override // dl.b
    public void A(java.lang.String str) {
        boolean z17;
        hk0.n g17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAndTextArtist", "onForwardUndo editId: %s", str);
        if (l() == null && android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiAndTextArtist", "forwardUndo but model is null or editId is empty");
            return;
        }
        hk0.n g18 = l().f363351i.g(str);
        boolean z18 = false;
        if (g18 != null && g18.a() != null) {
            if (g18.b() == hk0.p.f363319d || (g17 = l().f363351i.g(str)) == null) {
                z17 = false;
            } else {
                ((um.g) d()).h(g17.c());
                z17 = true;
            }
            if (g18.b() != hk0.p.f363320e) {
                g18.a().w(false);
                ((um.g) d()).add(g18.a());
            }
            z18 = z17;
        }
        E(z18);
    }

    @Override // dl.b
    public void C() {
        E(true);
    }

    public final int G(int i17, int i18, int[] iArr, int i19, int i27) {
        if (i17 <= 0 || i17 > 90 || i27 == 0) {
            return -1;
        }
        int max = java.lang.Math.max(iArr[0], iArr[1]);
        if (i18 >= java.lang.Math.min(iArr[0], iArr[1]) && i18 <= max) {
            return (iArr[0] + iArr[1]) / 2;
        }
        iArr[0] = iArr[0] + i19;
        iArr[1] = iArr[1] + i19;
        return G(i17, i18, iArr, i19, i27 - i19);
    }

    public float[] H() {
        android.graphics.Rect c17 = c();
        return a(c17.centerX(), c17.centerY());
    }

    public void I(c01.s2 s2Var) {
        l45.p pVar = ((l45.n) this.f316572a).f398008p;
        if (pVar != null) {
            ((aw3.e) pVar).a(s2Var, ((um.g) d()).g());
        }
    }

    public void J(xk0.h hVar) {
        an0.a aVar = this.I;
        if (aVar != null) {
            final l45.h hVar2 = (l45.h) aVar;
            l45.n nVar = hVar2.f397980d;
            android.widget.EditText editText = (android.widget.EditText) nVar.f397993a.mo177319xb073c692().findViewById(com.p314xaae8f345.mm.R.id.o4a);
            editText.setTag(hVar);
            l45.m mVar = nVar.f398012t;
            if (mVar != null && (hVar instanceof xk0.p) && mVar.a((xk0.p) hVar)) {
                return;
            }
            xk0.q a17 = hVar.a();
            editText.setText(a17.f536536e);
            com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671 viewOnClickListenerC22813xf4f26671 = (com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671) nVar.f397993a.findViewById(com.p314xaae8f345.mm.R.id.agw);
            com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec c22825xd78e1eec = (com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec) nVar.f397993a.findViewById(com.p314xaae8f345.mm.R.id.mii);
            int i17 = a17.f536533b;
            if (i17 != 0) {
                viewOnClickListenerC22813xf4f26671.setTag(java.lang.Integer.valueOf(i17));
                viewOnClickListenerC22813xf4f26671.m82779x764d6925(3);
            } else if (a17.f536534c) {
                viewOnClickListenerC22813xf4f26671.m82779x764d6925(2);
            } else {
                viewOnClickListenerC22813xf4f26671.m82779x764d6925(1);
            }
            int curMode = viewOnClickListenerC22813xf4f26671.getCurMode();
            int i18 = a17.f536532a;
            if (curMode == 3) {
                c22825xd78e1eec.m82874x7b868205(i17);
            } else {
                c22825xd78e1eec.m82874x7b868205(i18);
            }
            editText.setTextColor(i18);
            editText.setTag(hVar);
            nVar.y(true);
            if (nVar.f397994b.f445764a == qk.n9.VIDEO_COVER && (nVar.e() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
                nVar.f397993a.mo177319xb073c692().post(new java.lang.Runnable() { // from class: l45.h$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        l45.n nVar2 = l45.h.this.f397980d;
                        nVar2.f397993a.mo177319xb073c692().requestFocus();
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) nVar2.e()).mo26063x7b383410();
                    }
                });
            }
            if (nVar.f397994b.f445764a == qk.n9.LIVE_STICKER && (nVar.e() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
                nVar.f397993a.mo177319xb073c692().requestFocus();
                nVar.f397993a.mo177319xb073c692().postDelayed(new java.lang.Runnable() { // from class: l45.h$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        l45.h hVar3 = l45.h.this;
                        hVar3.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "onTextChange: showVKB");
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) hVar3.f397980d.e()).mo26063x7b383410();
                    }
                }, 350L);
            }
        }
    }

    public boolean K(xk0.f fVar, android.view.MotionEvent motionEvent, android.graphics.Rect rect, float f17) {
        if (fVar == null || !fVar.s()) {
            return false;
        }
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public xk0.f L(android.content.Context context, android.graphics.Matrix matrix, java.lang.String str, android.graphics.Rect rect, android.graphics.Rect rect2, android.text.SpannableString spannableString, int i17, int i18, java.lang.String str2) {
        return new xk0.p(context, matrix, str, rect, rect2, spannableString, i17, i18, str2);
    }

    public xk0.f M(java.lang.String str) {
        um.g gVar = (um.g) d();
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
            return null;
        }
        java.util.ListIterator f17 = gVar.f();
        while (f17.hasPrevious()) {
            xk0.f fVar = (xk0.f) f17.previous();
            if (fVar.q().equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    public final void N() {
        if (this.D == null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.D = paint;
            paint.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta));
            this.D.setStrokeWidth(5.0f);
            this.D.setStyle(android.graphics.Paint.Style.STROKE);
            this.D.setPathEffect(new android.graphics.DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        }
    }

    public final xk0.f O(float f17, float f18) {
        if (d() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiAndTextArtist", "[isContainsItem] getCache is null!");
            return null;
        }
        java.util.ListIterator f19 = ((um.g) d()).f();
        float[] a17 = a(f17, f18);
        while (f19.hasPrevious()) {
            xk0.f fVar = (xk0.f) f19.previous();
            if (fVar.f536493r) {
                float f27 = a17[0];
                float f28 = a17[1];
                boolean z17 = this.K;
                fVar.r(new android.graphics.Rect(), z17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new android.graphics.PointF(r10.left, r10.top));
                arrayList.add(new android.graphics.PointF(r10.right, r10.top));
                arrayList.add(new android.graphics.PointF(r10.right, r10.bottom));
                arrayList.add(new android.graphics.PointF(r10.left, r10.bottom));
                xk0.e eVar = new xk0.e(fVar, arrayList);
                int i17 = eVar.f536481c;
                int i18 = i17 - 1;
                boolean z18 = false;
                for (int i19 = 0; i19 < i17; i19++) {
                    float[] fArr = eVar.f536480b;
                    float f29 = fArr[i19];
                    if ((f29 < f28 && fArr[i18] >= f28) || (fArr[i18] < f28 && f29 >= f28)) {
                        float[] fArr2 = eVar.f536479a;
                        float f37 = fArr2[i19];
                        if (f37 + (((f28 - f29) / (fArr[i18] - f29)) * (fArr2[i18] - f37)) < f27) {
                            z18 = !z18;
                        }
                    }
                    i18 = i19;
                }
                if (z18) {
                    return fVar;
                }
            }
        }
        return null;
    }

    public void P() {
        if (this.f316687s != null) {
            this.f316685q.removeCallbacksAndMessages(null);
        }
        if (this.f316686r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiAndTextArtist", "[registerFocusTask] isTimerCancel=true");
            return;
        }
        dl.x xVar = new dl.x(this);
        this.f316687s = xVar;
        this.f316685q.postDelayed(xVar, 1500L);
    }

    public xk0.f Q() {
        um.g gVar = (um.g) d();
        xk0.f fVar = null;
        if (gVar == null) {
            return null;
        }
        java.util.ListIterator f17 = gVar.f();
        while (f17.hasPrevious()) {
            xk0.f fVar2 = (xk0.f) f17.previous();
            if (fVar2.s()) {
                fVar = fVar2;
            }
            fVar2.w(false);
        }
        return fVar;
    }

    public void R(xk0.f fVar, float f17) {
        fVar.f536490o = f17;
    }

    public void S() {
        if (this.f316687s != null) {
            this.f316685q.removeCallbacksAndMessages(null);
            this.f316687s = null;
        }
    }

    public void T(boolean z17, boolean z18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAndTextArtist", "undoAndShowByEditId lastEditId:%s isRemove: %b，isEdit: %b", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (!z17) {
            ((um.g) d()).h(str);
            ((um.g) d()).o5();
        }
        ((l45.n) this.f316572a).f397993a.removeCallbacks(this.f316581j);
        ym5.h hVar = ((l45.n) this.f316572a).f397993a;
        dl.w wVar = new dl.w(this, z18, z17, str);
        this.f316581j = wVar;
        hVar.postDelayed(wVar, 66L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void U(xk0.f fVar, boolean z17, float f17, boolean z18, int i17) {
        if (fVar instanceof xk0.h) {
            xk0.h hVar = (xk0.h) fVar;
            hVar.c(z17);
            hVar.d(z18);
            hVar.b(i17);
            if (f17 != 0.0f) {
                hVar.mo175638x3abfd950(f17);
            }
        }
    }

    @Override // dl.b
    public dl.a m() {
        return dl.a.EMOJI_AND_TEXT;
    }

    @Override // dl.b
    public void t() {
        super.t();
        int dimension = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562125a94);
        int dimension2 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562126a95);
        int c17 = com.p314xaae8f345.mm.ui.bl.c(((l45.n) this.f316572a).f397993a.getContext());
        this.f316688t.set((c().width() - dimension2) / 2, (c().height() - dimension) - c17, (c().width() + dimension2) / 2, c().height() - c17);
        if (this.f316686r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAndTextArtist", "onAlive: isTimerCancel=%s", java.lang.Boolean.valueOf(this.f316686r));
            this.f316685q.removeCallbacksAndMessages(null);
        }
        N();
        if (l() != null) {
            this.M.f363365b = l();
        }
    }

    @Override // dl.b
    public void w() {
        super.w();
        this.f316686r = true;
        S();
        this.f316685q.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dl.b
    public boolean x(android.view.MotionEvent motionEvent) {
        xk0.f g17;
        an0.a aVar;
        boolean contains;
        int i17;
        int i18;
        java.lang.String str;
        int i19;
        float f17;
        hk0.v0 v0Var;
        xk0.f g18;
        an0.a aVar2;
        if (motionEvent.getAction() == 3) {
            super.x(motionEvent);
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            android.graphics.Rect rect = this.f316688t;
            hk0.v0 v0Var2 = this.M;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 5) {
                        if (this.f316690v) {
                            this.f316693y = f(motionEvent);
                            this.A = (int) java.lang.Math.toDegrees(java.lang.Math.atan2(g(motionEvent)[0], g(motionEvent)[1]));
                            xk0.f g19 = ((um.g) d()).g();
                            if (g19 != null && g19.s()) {
                                int i27 = g19.f536489n;
                                this.B = i27;
                                this.f316694z = g19.f536490o;
                                v0Var2.getClass();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditRotateHelper", "setCurrentRotation >> " + i27);
                                v0Var2.f363364a = i27;
                                v0Var2.f363366c = i27;
                            }
                        } else {
                            int[] iArr = new int[2];
                            if (motionEvent.getPointerCount() > 1) {
                                iArr[0] = ((int) (motionEvent.getX(0) + motionEvent.getX(1))) / 2;
                                iArr[1] = ((int) (motionEvent.getY(0) + motionEvent.getY(1))) / 2;
                            }
                            xk0.f O = O(iArr[0], iArr[1]);
                            if (O != null) {
                                boolean z17 = O.f536497v;
                                Q();
                                O.f536497v = z17;
                                this.f316690v = true;
                                O.w(true);
                                ((um.g) d()).i(O);
                                this.f316693y = f(motionEvent);
                                this.A = (int) java.lang.Math.toDegrees(java.lang.Math.atan2(g(motionEvent)[0], g(motionEvent)[1]));
                                if (O.s()) {
                                    int i28 = O.f536489n;
                                    this.B = i28;
                                    v0Var2.getClass();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditRotateHelper", "setCurrentRotation >> " + i28);
                                    v0Var2.f363364a = i28;
                                    v0Var2.f363366c = i28;
                                    this.f316694z = O.f536490o;
                                }
                                E(true);
                                r();
                            }
                        }
                    }
                } else if (this.f316690v && p(motionEvent)) {
                    if (!this.f316691w && (aVar2 = this.I) != null) {
                        l45.n nVar = ((l45.h) aVar2).f397980d;
                        l45.n.a(nVar, true);
                        l45.m mVar = nVar.f398012t;
                        if (mVar != null) {
                            mVar.c(java.lang.Boolean.TRUE);
                        }
                    }
                    float x17 = motionEvent.getX(0);
                    android.graphics.PointF pointF = this.f316583l;
                    int[] iArr2 = {(int) (x17 - pointF.x), (int) (motionEvent.getY(0) - pointF.y)};
                    if (motionEvent.getPointerCount() > 1) {
                        float f18 = 0.0f != this.f316693y ? f(motionEvent) / this.f316693y : 1.0f;
                        str = "MicroMsg.ImproveEditRotateHelper";
                        i19 = this.A - ((int) java.lang.Math.toDegrees(java.lang.Math.atan2(g(motionEvent)[0], g(motionEvent)[1])));
                        if (v0Var2.f363365b == null || !v0Var2.a(v0Var2.f363364a) || java.lang.Math.abs(i19) > 5) {
                            this.f316692x = true;
                        } else {
                            i19 = 0;
                        }
                        xk0.f g27 = ((um.g) d()).g();
                        if (g27 != null) {
                            f17 = !g27.l() ? 1.0f : f18;
                            if (!g27.k()) {
                                this.f316692x = false;
                                i19 = 0;
                            }
                        } else {
                            f17 = f18;
                        }
                    } else {
                        str = "MicroMsg.ImproveEditRotateHelper";
                        this.f316692x = false;
                        i19 = 0;
                        f17 = 1.0f;
                    }
                    float f19 = iArr2[0];
                    float f27 = iArr2[1];
                    float f28 = this.f316694z;
                    int i29 = this.B;
                    int pointerCount = motionEvent.getPointerCount();
                    motionEvent.getX();
                    motionEvent.getY();
                    xk0.f g28 = ((um.g) d()).g();
                    if (g28 != null) {
                        android.graphics.Matrix matrix = this.N;
                        matrix.reset();
                        matrix.postRotate(-i());
                        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                        matrix.invert(matrix2);
                        v0Var = v0Var2;
                        float[] fArr = {f19, f27};
                        matrix2.mapPoints(fArr);
                        if (pointerCount > 1) {
                            g28.y(0.0f, 0.0f, f17 * f28, (i29 + i19) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
                        } else {
                            g28.y(fArr[0] / k(), fArr[1] / k(), 0.0f, g28.f536489n);
                        }
                        g28.u();
                        android.graphics.PointF pointF2 = g28.f536488m;
                        float[] fArr2 = {pointF2.x, pointF2.y};
                        this.f316573b.mapPoints(fArr2);
                        int i37 = rect.top;
                        if (K(g28, motionEvent, rect, fArr2[1])) {
                            an0.a aVar3 = this.I;
                            if (aVar3 != null) {
                                l45.h hVar = (l45.h) aVar3;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "[onReach] distance:%s", java.lang.Float.valueOf((fArr2[1] - rect.top) / rect.height()));
                                hVar.f397977a.setActivated(true);
                                l45.n nVar2 = hVar.f397980d;
                                hVar.f397978b.setText(nVar2.e().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7_));
                                hVar.f397979c.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(nVar2.e(), com.p314xaae8f345.mm.R.raw.f79698x7f34c4db, -1));
                            }
                            this.O = true;
                        } else {
                            an0.a aVar4 = this.I;
                            if (aVar4 != null && this.O) {
                                l45.h hVar2 = (l45.h) aVar4;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "[onUnReach]");
                                hVar2.f397977a.setActivated(false);
                                l45.n nVar3 = hVar2.f397980d;
                                hVar2.f397979c.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(nVar3.e(), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3, -1));
                                hVar2.f397978b.setText(nVar3.e().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7a));
                            }
                            this.O = false;
                        }
                        if (g28 instanceof xk0.h) {
                            g28.f536497v = false;
                        }
                    } else {
                        v0Var = v0Var2;
                    }
                    this.f316691w = true;
                    r();
                    if (this.f316692x) {
                        um.g cache = (um.g) d();
                        v0Var.getClass();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cache, "cache");
                        hk0.v0 v0Var3 = v0Var;
                        if (v0Var3.f363365b != null && (g18 = cache.g()) != null && g18.s()) {
                            int i38 = v0Var3.f363366c;
                            int i39 = g18.f536489n;
                            if (i38 != i39) {
                                v0Var3.f363366c = i39;
                                if (v0Var3.a(v0Var3.f363364a + i19)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkRotateToStandard is in standard");
                                    hk0.u0 u0Var = v0Var3.f363365b;
                                    if (u0Var != null) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add(new hk0.j(7, new android.os.Bundle()));
                                        p3325xe03a0797.p3326xc267989b.l.d(u0Var.f363355p, null, null, new hk0.n0(u0Var, arrayList, null), 3, null);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (!n()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiAndTextArtist", "[ACTION_UP] is not alive!");
                    return false;
                }
                if (d() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiAndTextArtist", "[getCache] is null!");
                    return false;
                }
                xk0.f g29 = ((um.g) d()).g();
                if (g29 != 0) {
                    if (this.G) {
                        android.graphics.Rect rect2 = this.f316689u;
                        g29.r(rect2, false);
                        contains = this.f316575d.contains(rect2);
                    } else {
                        android.graphics.Rect rect3 = this.f316575d;
                        android.graphics.PointF pointF3 = g29.f536488m;
                        contains = rect3.contains((int) pointF3.x, (int) pointF3.y);
                    }
                    boolean z18 = !contains;
                    if (!this.f316691w) {
                        I(c01.s2.f118978u);
                    }
                    if (z18) {
                        ok.m mVar2 = this.H;
                        mVar2.f427460a = true;
                        android.graphics.PointF pointF4 = g29.f536494s;
                        float f29 = pointF4.x;
                        android.graphics.PointF pointF5 = g29.f536488m;
                        mVar2.f427477f = f29 - pointF5.x;
                        mVar2.f427478g = pointF4.y - pointF5.y;
                        mVar2.f427476e = g29.q();
                        if (mVar2.f427460a) {
                            android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("deltaY", 0.0f, mVar2.f427478g), android.animation.PropertyValuesHolder.ofFloat("deltaX", 0.0f, mVar2.f427477f));
                            mVar2.f427475d = ofPropertyValuesHolder;
                            ofPropertyValuesHolder.addUpdateListener(new ok.k(mVar2));
                            mVar2.f427475d.addListener(new ok.l(mVar2));
                            mVar2.f427475d.setInterpolator(new android.view.animation.LinearInterpolator());
                            mVar2.f427475d.setDuration(100L);
                            mVar2.f427475d.start();
                        }
                    }
                    float f37 = g29.f536490o;
                    float f38 = this.f316694z;
                    if (f37 != f38 && f38 != 0.0f) {
                        I(c01.s2.f118970m);
                    }
                    if (g29.f536489n != this.B) {
                        I(c01.s2.f118969i);
                    }
                    int i47 = this.L;
                    int[] iArr3 = {-i47, i47};
                    int i48 = g29.f536489n;
                    if (i48 < 0) {
                        i18 = -360;
                        i17 = -90;
                    } else {
                        i17 = 90;
                        i18 = 360;
                    }
                    int G = G(i47, i48, iArr3, i17, i18);
                    if (G != -1) {
                        ok.e eVar = new ok.e(this);
                        eVar.f427460a = true;
                        float f39 = g29.f536489n;
                        float f47 = G;
                        java.lang.String itemId = g29.q();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemId, "itemId");
                        float[] fArr3 = eVar.f427459f;
                        fArr3[0] = f39;
                        fArr3[1] = f47;
                        eVar.f427458e = itemId;
                        if (eVar.f427460a) {
                            android.animation.ValueAnimator ofPropertyValuesHolder2 = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("rotation", f39, f47));
                            eVar.f427457d = ofPropertyValuesHolder2;
                            if (ofPropertyValuesHolder2 != null) {
                                ofPropertyValuesHolder2.addUpdateListener(new ok.d(eVar));
                            }
                            android.animation.ValueAnimator valueAnimator = eVar.f427457d;
                            if (valueAnimator != null) {
                                valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
                            }
                            android.animation.ValueAnimator valueAnimator2 = eVar.f427457d;
                            if (valueAnimator2 != null) {
                                valueAnimator2.setDuration(100L);
                            }
                            android.animation.ValueAnimator valueAnimator3 = eVar.f427457d;
                            if (valueAnimator3 != null) {
                                valueAnimator3.start();
                            }
                        }
                    }
                    if (g29 instanceof xk0.h) {
                        xk0.h hVar3 = (xk0.h) g29;
                        if (hVar3.e()) {
                            if (g29.s() && g29.f536497v) {
                                J(hVar3);
                            } else if (g29.s()) {
                                g29.f536497v = true;
                            }
                        }
                    }
                    android.graphics.PointF pointF6 = g29.f536488m;
                    float[] fArr4 = {pointF6.x, pointF6.y};
                    this.f316573b.mapPoints(fArr4);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAndTextArtist", "mRubbishRect:%s pointF:%s isHasMove: %b isHasRotate: %b", rect, java.lang.Float.valueOf(fArr4[1]), java.lang.Boolean.valueOf(this.f316691w), java.lang.Boolean.valueOf(this.f316692x));
                    if (K(g29, motionEvent, rect, fArr4[1])) {
                        if (this.f316690v && this.I != null) {
                            xk0.f fVar = (xk0.f) ((um.g) d()).f510214d.pop();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAndTextCache", "pop item %s", fVar);
                            I(c01.s2.f118968h);
                            if (l() != null) {
                                l().c7(fVar, hk0.p.f363320e);
                            }
                        }
                    } else if (this.f316691w || this.f316692x) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAndTextArtist", "isChange to add new editData");
                        if (this.f316692x) {
                            int b17 = v0Var2.b();
                            if (v0Var2.b() != -1) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAndTextArtist", "is need to fix rotation %d", java.lang.Integer.valueOf(b17));
                                g29.f536489n = b17;
                                r();
                            }
                        }
                        if (l() != null) {
                            g29.f536499x = l().c7(g29.m175636x5a5dd5d(), hk0.p.f363321f);
                        }
                    }
                }
                P();
                if (this.f316691w && (aVar = this.I) != null) {
                    l45.n nVar4 = ((l45.h) aVar).f397980d;
                    l45.n.a(nVar4, false);
                    l45.m mVar3 = nVar4.f398012t;
                    if (mVar3 != null) {
                        mVar3.b();
                    }
                }
                this.f316691w = false;
                this.f316692x = false;
                r();
            }
        } else {
            S();
            xk0.f O2 = O(motionEvent.getX(), motionEvent.getY());
            motionEvent.getX();
            motionEvent.getY();
            if (O2 == null) {
                this.f316690v = false;
                if (((d() == null || (g17 = ((um.g) d()).g()) == null) ? false : g17.s()) && !this.f316684J) {
                    Q();
                    E(false);
                    r();
                }
            } else {
                boolean z19 = O2.f536497v;
                Q();
                this.f316690v = true;
                O2.w(true);
                O2.f536497v = z19;
                O2.f536494s.set(O2.f536488m);
                ((um.g) d()).i(O2);
                E(true);
                r();
                xk0.f g37 = ((um.g) d()).g();
                if (g37 != null && g37.s()) {
                    this.B = g37.f536489n;
                    this.f316694z = g37.f536490o;
                }
            }
        }
        super.x(motionEvent);
        return this.f316690v;
    }

    @Override // dl.b
    public void y(android.graphics.Canvas canvas) {
        um.g gVar = (um.g) d();
        xk0.f g17 = gVar != null ? gVar.g() : null;
        if (this.C && this.f316691w) {
            android.graphics.Rect rect = this.f316574c;
            xk0.f g18 = ((um.g) d()).g();
            if (g18 != null) {
                android.graphics.Rect rect2 = this.f316689u;
                g18.r(rect2, false);
                if (!rect.contains(rect2)) {
                    canvas.drawRoundRect(rect.left, rect.top, rect.right, rect.bottom, 5.0f, 5.0f, this.D);
                }
                if (g18.f536489n % 90 == 0 && this.f316692x) {
                    canvas.drawLine(rect.left, rect.top + (rect.height() / 2), rect.right, rect.top + (rect.height() / 2), this.D);
                    canvas.drawLine(rect.left + (rect.width() / 2), rect.top, rect.left + (rect.width() / 2), rect.bottom, this.D);
                }
            }
        }
        if (this.E && this.f316691w && ((um.g) d()).g() != null) {
            android.graphics.Rect rect3 = this.f316574c;
            int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta);
            if (this.D == null) {
                N();
            }
            this.D.setColor(a17);
            canvas.drawLine(rect3.left, rect3.top + (rect3.height() / 2), rect3.right, rect3.top + (rect3.height() / 2), this.D);
            canvas.drawLine(rect3.left + (rect3.width() / 2), rect3.top, rect3.left + (rect3.width() / 2), rect3.bottom, this.D);
            android.graphics.Rect rect4 = this.f316575d;
            int a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560743sy);
            if (this.D == null) {
                N();
            }
            this.D.setColor(a18);
            canvas.drawRoundRect(rect4.left, rect4.top, rect4.right, rect4.bottom, 5.0f, 5.0f, this.D);
            canvas.drawLine(rect4.left, rect4.top + (rect4.height() / 2), rect4.right, rect4.top + (rect4.height() / 2), this.D);
            canvas.drawLine(rect4.left + (rect4.width() / 2), rect4.top, rect4.left + (rect4.width() / 2), rect4.bottom, this.D);
        }
        v(canvas);
        if (g17 == null || !g17.s()) {
            return;
        }
        g17.i(canvas);
    }
}
