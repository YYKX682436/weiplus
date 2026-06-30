package gy0;

/* loaded from: classes5.dex */
public final class q extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 implements fy0.k {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final int E;
    public float F;
    public bx0.c G;
    public final android.graphics.PointF H;
    public final android.graphics.PointF I;

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.PointF f359053J;
    public boolean K;
    public boolean L;
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 M;
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 N;
    public final android.graphics.RectF P;
    public final android.graphics.RectF Q;
    public final jz5.g R;
    public boolean S;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f359054d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 f359055e;

    /* renamed from: f, reason: collision with root package name */
    public final ex0.a0 f359056f;

    /* renamed from: g, reason: collision with root package name */
    public final bx0.h f359057g;

    /* renamed from: h, reason: collision with root package name */
    public gy0.i f359058h;

    /* renamed from: i, reason: collision with root package name */
    public gy0.f f359059i;

    /* renamed from: m, reason: collision with root package name */
    public gy0.j f359060m;

    /* renamed from: n, reason: collision with root package name */
    public gy0.h f359061n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f359062o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f359063p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f359064q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f359065r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f359066s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.l f359067t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f359068u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f359069v;

    /* renamed from: w, reason: collision with root package name */
    public long f359070w;

    /* renamed from: x, reason: collision with root package name */
    public final int f359071x;

    /* renamed from: y, reason: collision with root package name */
    public final gy0.d f359072y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f359073z;

    public q(android.content.Context context, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 timelineView, ex0.a0 timelineVM, bx0.h layoutCalc, gy0.e autoScrolledListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineView, "timelineView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineVM, "timelineVM");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutCalc, "layoutCalc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(autoScrolledListener, "autoScrolledListener");
        this.f359054d = context;
        this.f359055e = timelineView;
        this.f359056f = timelineVM;
        this.f359057g = layoutCalc;
        this.f359062o = jz5.h.b(new gy0.o(this));
        this.f359063p = new java.util.ArrayList();
        this.f359064q = new android.graphics.Rect();
        this.f359065r = new android.graphics.Rect();
        this.f359066s = jz5.h.b(new gy0.n(this));
        this.f359070w = -1L;
        this.f359071x = android.view.ViewConfiguration.getDoubleTapTimeout();
        this.f359072y = new gy0.d(timelineView, 50.0d, new gy0.l(this), layoutCalc);
        this.f359073z = new java.util.ArrayList();
        this.E = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 30);
        this.F = -1.0f;
        this.H = new android.graphics.PointF();
        this.I = new android.graphics.PointF();
        this.f359053J = new android.graphics.PointF();
        this.P = new android.graphics.RectF();
        this.Q = new android.graphics.RectF();
        this.R = jz5.h.b(new gy0.p(this));
    }

    public final boolean d(float f17, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        ex0.a0 timelineViewModel = this.f359056f;
        ex0.r n17 = timelineViewModel.n();
        ex0.r rVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (rVar == null) {
            return false;
        }
        int ordinal = rVar.f338702c.ordinal();
        bx0.h layoutCalc = this.f359057g;
        switch (ordinal) {
            case 1:
            case 2:
            case 3:
            case 4:
                return false;
            case 5:
            case 7:
            case 8:
            case 9:
                android.graphics.Rect b17 = layoutCalc.b(c3971x241f78, false);
                if (b17.isEmpty()) {
                    return false;
                }
                bx0.f fVar = layoutCalc.f117810d;
                return (((f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) < 0 && b17.left <= fVar.f117799r.f328577a) || ((f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) > 0 && b17.right >= layoutCalc.e() - fVar.f117799r.f328579c)) ? false : true;
            case 6:
            case 10:
            default:
                return true;
            case 11:
                ex0.q qVar = rVar instanceof ex0.q ? (ex0.q) rVar : null;
                if (qVar == null) {
                    return false;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineViewModel, "timelineViewModel");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutCalc, "layoutCalc");
                android.graphics.Rect b18 = layoutCalc.b(qVar.f338701b, false);
                android.graphics.Rect rect = new android.graphics.Rect();
                if (b18.isEmpty()) {
                    return false;
                }
                int i17 = (int) f17;
                rect.set(b18.left + i17, b18.top, b18.right + i17, b18.bottom);
                bx0.f fVar2 = layoutCalc.f117810d;
                boolean z17 = f17 < 0.0f && b18.left <= fVar2.f117799r.f328577a;
                boolean z18 = f17 > 0.0f && b18.right >= layoutCalc.e() - fVar2.f117799r.f328579c;
                if (qVar.J(timelineViewModel)) {
                    if (z17 || z18) {
                        return false;
                    }
                } else if (z17 || z18 || qVar.K(rect, timelineViewModel, layoutCalc)) {
                    return false;
                }
                return true;
            case 12:
                ex0.b bVar = rVar instanceof ex0.b ? (ex0.b) rVar : null;
                if (bVar == null) {
                    return false;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineViewModel, "timelineViewModel");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutCalc, "layoutCalc");
                android.graphics.Rect b19 = layoutCalc.b(bVar.f338701b, false);
                android.graphics.Rect rect2 = new android.graphics.Rect();
                if (b19.isEmpty()) {
                    return false;
                }
                int i18 = (int) f17;
                rect2.set(b19.left + i18, b19.top, b19.right + i18, b19.bottom);
                bx0.f fVar3 = layoutCalc.f117810d;
                boolean z19 = f17 < 0.0f && b19.left <= fVar3.f117799r.f328577a;
                boolean z27 = f17 > 0.0f && b19.right >= layoutCalc.e() - fVar3.f117799r.f328579c;
                if (bVar.G(timelineViewModel)) {
                    if (z19 || z27) {
                        return false;
                    }
                } else if (z19 || z27 || bVar.H(rect2, timelineViewModel, layoutCalc)) {
                    return false;
                }
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0113, code lost:
    
        if (r5.H(r9, r2, r7) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d7, code lost:
    
        if (r5.K(r6, r2, r7) == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032a, code lost:
    
        if (r5.K(r6, r2, r7) == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x024d, code lost:
    
        if (r5.K(r4, r2, r7) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x027c, code lost:
    
        if (r5.K(r4, r2, r7) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016e, code lost:
    
        if (r5.H(r4, r2, r7) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c1, code lost:
    
        if (r5.H(r4, r2, r7) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00e5, code lost:
    
        if (r5.H(r9, r2, r7) == false) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Type inference failed for: r3v3, types: [ex0.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(float r17) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gy0.q.e(float):boolean");
    }

    public final void f(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, float f17, gy0.g moveType) {
        ex0.f fVar;
        android.graphics.Rect b17;
        bx0.c cVar = this.G;
        if (cVar == null || (fVar = cVar.f117774f) == null || !d(f17, c3971x241f78)) {
            return;
        }
        bx0.c cVar2 = this.G;
        bx0.h hVar = this.f359057g;
        if (cVar2 == null || (b17 = cVar2.f117770b) == null) {
            b17 = hVar.b(c3971x241f78, false);
        }
        float f18 = hVar.f117810d.f117799r.f328577a;
        float e17 = hVar.e() - hVar.f117810d.f117799r.f328579c;
        int width = b17.width();
        this.f359068u = true;
        float f19 = b17.left + (this.f359053J.x - this.H.x);
        ex0.a0 a0Var = this.f359056f;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34009x8082fb99 = f19 <= f18 ? a0Var.q().m34009x8082fb99() : ((float) width) + f19 >= e17 ? a0Var.q().m34007xde00a612().sub(fVar.j()) : com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775((f19 - f18) / a0Var.s(this.f359055e.getTimelineLayoutType()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m34009x8082fb99);
        ex0.r n17 = a0Var.n();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = n17 != null ? n17.f338700a : null;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7) c4190xd8dd3713 : null;
        if (c4183xefcb50b7 != null) {
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f782 = this.N;
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f783 = c4183xefcb50b7.f130065a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c3971x241f783, c3971x241f782)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f783, "getSegmentID(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moveType, "moveType");
                a0Var.f338625b.u(c3971x241f783, null, m34009x8082fb99);
                int ordinal = moveType.ordinal();
                if (ordinal == 0) {
                    java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f306043f);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(of6, "of(...)");
                    a0Var.J(of6, null);
                } else if (ordinal == 1) {
                    java.util.EnumSet of7 = java.util.EnumSet.of(cx0.d.f306043f);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(of7, "of(...)");
                    a0Var.J(of7, cx0.e.f306048g);
                }
            }
        }
        gy0.j jVar = this.f359060m;
        if (jVar != null) {
            jVar.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r5 > r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r5 < r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(bx0.c r20, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 r21, float r22, gy0.k r23) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gy0.q.g(bx0.c, com.tencent.maas.moviecomposing.segments.ElementSegment, float, gy0.k):void");
    }

    public final int h() {
        return ((java.lang.Number) ((jz5.n) this.f359066s).mo141623x754a37bb()).intValue();
    }

    public final int i() {
        return ((java.lang.Number) ((jz5.n) this.R).mo141623x754a37bb()).intValue();
    }

    public boolean j(android.view.MotionEvent e17) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78;
        hy0.y2 y2Var;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f782;
        gy0.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        if (!this.A) {
            return false;
        }
        double x17 = e17.getX();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 abstractC11003x25486817 = this.f359055e;
        int m47441x185482f6 = (int) (x17 + abstractC11003x25486817.m47441x185482f6());
        int y17 = (int) e17.getY();
        boolean z17 = this.K;
        bx0.h hVar = this.f359057g;
        if (!z17 && !this.L) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = hVar.f117811e;
            if (concurrentHashMap.isEmpty()) {
                y2Var = null;
            } else {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (((android.graphics.RectF) entry.getValue()).contains(m47441x185482f6, y17)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                y2Var = (hy0.y2) kz5.n0.Y(linkedHashMap.keySet());
            }
            if (y2Var != null && (iVar = this.f359058h) != null) {
                rv0.l0 l0Var = (rv0.l0) iVar;
                if (rv0.k0.f481607a[y2Var.ordinal()] == 1) {
                    ((gx0.p9) ((jz5.n) l0Var.f481630a.f481661p).mo141623x754a37bb()).r7(zw0.b.f558084e);
                }
                return true;
            }
            java.util.Iterator it = ((java.util.LinkedHashMap) hVar.f117810d.f117796o).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    c3971x241f782 = null;
                    break;
                }
                java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                c3971x241f782 = ((android.graphics.Rect) entry2.getValue()).contains(m47441x185482f6, y17) ? (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) entry2.getKey() : null;
                if (c3971x241f782 != null) {
                    break;
                }
            }
            if (c3971x241f782 != null && this.f359067t != null) {
                gy0.h hVar2 = this.f359061n;
                if (hVar2 != null) {
                    hVar2.a(c3971x241f782);
                }
                yz5.l lVar = this.f359067t;
                if (lVar != null) {
                    lVar.mo146xb9724478(c3971x241f782);
                }
                return true;
            }
        }
        java.util.Iterator it6 = ((java.util.LinkedHashMap) hVar.f117810d.f117795n).entrySet().iterator();
        while (true) {
            if (!it6.hasNext()) {
                c3971x241f78 = null;
                break;
            }
            java.util.Map.Entry entry3 = (java.util.Map.Entry) it6.next();
            c3971x241f78 = ((android.graphics.Rect) entry3.getValue()).contains(m47441x185482f6, y17) ? (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) entry3.getKey() : null;
            if (c3971x241f78 != null) {
                break;
            }
        }
        ex0.a0 a0Var = this.f359056f;
        ex0.r K = a0Var.K(c3971x241f78);
        if ((K != null ? K.f338702c : null) == ug.m.Transition) {
            return true;
        }
        if (this.D && K != null) {
            ug.m mVar = ug.m.ImageClip;
            ug.m mVar2 = K.f338702c;
            if (mVar2 == mVar || mVar2 == ug.m.MovieClip) {
                c3971x241f78 = null;
            }
        }
        if (c3971x241f78 != null) {
            c3971x241f78.m32424x9616526c();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c3971x241f78, this.f359069v) || currentTimeMillis - this.f359070w >= this.f359071x) {
                this.f359069v = c3971x241f78;
                this.f359070w = currentTimeMillis;
                if (!this.K && !this.L) {
                    ex0.i0.j(a0Var, c3971x241f78);
                    gy0.h hVar3 = this.f359061n;
                    if (hVar3 != null) {
                        hVar3.a(c3971x241f78);
                    }
                }
            } else {
                this.f359069v = null;
                this.f359070w = -1L;
                gy0.h hVar4 = this.f359061n;
                if (hVar4 != null) {
                    hVar4.b(c3971x241f78);
                }
            }
        } else if (!this.K && !this.L) {
            ex0.i0.l(a0Var);
        }
        abstractC11003x25486817.post(new gy0.m(this));
        return true;
    }

    public void k(android.view.MotionEvent e17) {
        gy0.j jVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        this.f359072y.f359040f = false;
        ex0.a0 a0Var = this.f359056f;
        int ordinal = a0Var.r().ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5 || ordinal == 6) {
            a0Var.n();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            boolean z17 = this.K;
            if (z17 || this.L) {
                gy0.j jVar2 = this.f359060m;
                if (jVar2 != null) {
                    jVar2.b(z17, this.f359068u);
                }
                ex0.i0.i(a0Var);
                gy0.j jVar3 = this.f359060m;
                if (jVar3 != null) {
                    jVar3.f();
                }
            }
            if (this.N != null && (jVar = this.f359060m) != null) {
                jVar.a(this.f359068u);
            }
            this.f359055e.post(new gy0.m(this));
        }
        this.f359068u = false;
        this.G = null;
        this.K = false;
        this.L = false;
        this.N = null;
        this.M = null;
    }

    public final void l(java.util.List timelineDrawerList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineDrawerList, "timelineDrawerList");
        java.util.ArrayList arrayList = this.f359063p;
        arrayList.clear();
        arrayList.addAll(timelineDrawerList);
    }

    public final void m(ex0.r rVar) {
        boolean o17 = rVar.o();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = rVar.f338701b;
        if (o17) {
            this.M = c3971x241f78;
            return;
        }
        ex0.a0 a0Var = this.f359056f;
        ex0.r n17 = a0Var.n();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c3971x241f78, n17 != null ? n17.f338701b : null)) {
            ex0.r n18 = a0Var.n();
            if ((n18 != null ? n18.f338704e : null) == ax0.b.f96498e) {
                this.M = c3971x241f78;
            }
        }
    }

    public boolean n() {
        return this.K || this.L || this.N != null;
    }

    public final void o(gy0.b direction, gy0.c touchType) {
        java.util.Objects.toString(direction);
        java.util.Objects.toString(touchType);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 abstractC11003x25486817 = this.f359055e;
        abstractC11003x25486817.m47441x185482f6();
        abstractC11003x25486817.m47447x4390b3e9();
        h();
        abstractC11003x25486817.m47447x4390b3e9();
        gy0.d dVar = this.f359072y;
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(direction, "direction");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchType, "touchType");
        dVar.f359041g = direction;
        dVar.f359040f = true;
        fy0.i.b(dVar);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7903x73cebf37(c17, parent, state);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 abstractC11003x25486817 = this.f359055e;
        this.f359065r.set((int) abstractC11003x25486817.m47441x185482f6(), 0, ((int) abstractC11003x25486817.m47441x185482f6()) + h(), abstractC11003x25486817.getHeight());
        ex0.a0 a0Var = this.f359056f;
        ex0.o o17 = a0Var.o();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 abstractC11003x254868172 = this.f359055e;
        hy0.z2 z2Var = new hy0.z2(abstractC11003x254868172, this.f359056f, this.f359057g, this.f359065r, bx0.b.b(abstractC11003x254868172.m47432x1e87e5ec().f328577a, abstractC11003x25486817.m47432x1e87e5ec().f328578b, (abstractC11003x25486817.m47447x4390b3e9() - abstractC11003x25486817.m47432x1e87e5ec().f328577a) - abstractC11003x25486817.m47432x1e87e5ec().f328579c, abstractC11003x25486817.m47442xb3b742ba()), o17);
        bx0.h hVar = this.f359057g;
        float f17 = -((float) hVar.f117812f);
        int save = c17.save();
        c17.translate(f17, 0.0f);
        try {
            java.util.Iterator it = this.f359063p.iterator();
            while (it.hasNext()) {
                ((iy0.c) it.next()).a(c17, z2Var);
            }
            c17.restoreToCount(save);
            ex0.r n17 = a0Var.n();
            if (n17 == null || !a0Var.A()) {
                return;
            }
            android.graphics.Rect d17 = hVar.d(n17.f338701b, n17.f338703d);
            int width = d17.width();
            float f18 = d17.left;
            float f19 = d17.right;
            float f27 = d17.top;
            float f28 = d17.bottom;
            android.graphics.RectF rectF = this.P;
            float i17 = f18 - i();
            float i18 = f27 - i();
            int i19 = i();
            int i27 = width / 2;
            if (i19 > i27) {
                i19 = i27;
            }
            rectF.set(i17, i18, f18 + i19, i() + f28);
            android.graphics.RectF rectF2 = this.Q;
            int i28 = i();
            if (i28 <= i27) {
                i27 = i28;
            }
            rectF2.set(f19 - i27, f27 - i(), f19 + i(), f28 + i());
        } catch (java.lang.Throwable th6) {
            c17.restoreToCount(save);
            throw th6;
        }
    }
}
