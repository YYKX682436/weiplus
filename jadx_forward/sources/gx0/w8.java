package gx0;

/* loaded from: classes5.dex */
public final class w8 extends ou0.p implements yt0.c {
    public java.lang.ref.WeakReference A;
    public android.widget.FrameLayout B;
    public android.widget.FrameLayout C;
    public android.widget.FrameLayout D;
    public android.widget.FrameLayout E;
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41 F;
    public android.widget.ImageView G;
    public android.widget.TextView H;
    public android.view.ViewGroup I;

    /* renamed from: J, reason: collision with root package name */
    public final ou0.s f358645J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;
    public final jz5.g N;
    public final jz5.g P;
    public final jz5.g Q;
    public final jz5.g R;
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.c S;
    public volatile com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 T;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 U;
    public final hx0.e V;
    public final jz5.g W;
    public final jz5.g X;
    public final jz5.g Y;
    public final jz5.g Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f358646l1;

    /* renamed from: p0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.m f358647p0;

    /* renamed from: r, reason: collision with root package name */
    public volatile gx0.y4 f358648r;

    /* renamed from: s, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f358649s;

    /* renamed from: t, reason: collision with root package name */
    public volatile p3325xe03a0797.p3326xc267989b.r2 f358650t;

    /* renamed from: u, reason: collision with root package name */
    public final gx0.h7 f358651u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f358652v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f358653w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.uic.C10955x675e70c1 f358654x;

    /* renamed from: x0, reason: collision with root package name */
    public final xt0.d f358655x0;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f358656y;

    /* renamed from: y0, reason: collision with root package name */
    public ou0.z f358657y0;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f358658z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358648r = gx0.y4.f358733d;
        this.f358649s = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.J(1).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f358651u = new gx0.h7(this);
        this.f358652v = jz5.h.b(new gx0.w5(this));
        this.f358653w = jz5.h.b(new gx0.i5(this));
        this.f358656y = new java.util.ArrayList();
        this.f358645J = new ou0.s();
        this.K = jz5.h.b(new gx0.r8(this));
        this.L = jz5.h.b(new gx0.o8(this));
        this.M = jz5.h.b(new gx0.m5(this));
        this.N = jz5.h.b(new gx0.t6(this));
        this.P = jz5.h.b(new gx0.i7(this, activity));
        this.Q = jz5.h.b(new gx0.s6(this));
        this.R = jz5.h.b(new gx0.q6(this));
        this.V = new hx0.e(m80379x76847179(), new gx0.s5(this));
        this.W = jz5.h.b(new gx0.k7(this));
        this.X = jz5.h.b(new gx0.r6(activity));
        this.Y = jz5.h.b(new gx0.q7(this));
        this.Z = jz5.h.b(new gx0.j7(this));
        this.f358647p0 = new gx0.n5(this);
        this.f358655x0 = new xt0.d();
        this.f358657y0 = new ou0.w(false);
    }

    public static final void Y6(gx0.w8 w8Var) {
        ex0.a0 a0Var;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = w8Var.W6().o7();
        if (o76 == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a l17 = o76.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getDuration(...)");
        if (l17.m33988x124aa384() < 6.0d && (a0Var = w8Var.W6().f358175r) != null) {
            java.util.List list = a0Var.f338630g.f338710e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (true) {
                ex0.c cVar = null;
                if (!it.hasNext()) {
                    break;
                }
                ex0.r rVar = (ex0.r) it.next();
                if (rVar.f338702c == ug.m.ImageClip && (rVar instanceof ex0.c)) {
                    cVar = (ex0.c) rVar;
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
            ex0.a0 a0Var2 = w8Var.W6().f358175r;
            if (a0Var2 != null) {
                java.util.List list2 = a0Var2.f338630g.f338710e;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
                while (it6.hasNext()) {
                    ex0.r rVar2 = (ex0.r) it6.next();
                    ug.m mVar = rVar2.f338702c;
                    ex0.c cVar2 = ((mVar == ug.m.MovieClip || mVar == ug.m.VideoClip) && (rVar2 instanceof ex0.c)) ? (ex0.c) rVar2 : null;
                    if (cVar2 != null) {
                        arrayList2.add(cVar2);
                    }
                }
                java.util.Iterator it7 = arrayList2.iterator();
                double d17 = 0.0d;
                while (it7.hasNext()) {
                    d17 += ((ex0.c) it7.next()).i().m33988x124aa384();
                }
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b17 = o76.b(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775((6.0d - d17) / arrayList.size()));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "alignTimeToVideoFrameBoundaryForward(...)");
                java.util.Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    ((ex0.c) it8.next()).y(b17);
                }
            }
        }
    }

    public static final java.lang.Object Z6(gx0.w8 w8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        w8Var.getClass();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new gx0.z4(w8Var, c16997xb0aa383a, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(2:25|(2:27|(2:29|30)))(1:31))|12|13|(1:15)|16|17))|34|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        r5 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r4 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(gx0.w8 r4, p3325xe03a0797.p3326xc267989b.r2 r5, java.lang.String r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof gx0.e5
            if (r0 == 0) goto L16
            r0 = r7
            gx0.e5 r0 = (gx0.e5) r0
            int r1 = r0.f357895h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f357895h = r1
            goto L1b
        L16:
            gx0.e5 r0 = new gx0.e5
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r4 = r0.f357893f
            pz5.a r7 = pz5.a.f440719d
            int r1 = r0.f357895h
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r5 = r0.f357892e
            kotlinx.coroutines.r2 r5 = (p3325xe03a0797.p3326xc267989b.r2) r5
            java.lang.Object r6 = r0.f357891d
            java.lang.String r6 = (java.lang.String) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r4)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r4)
            kotlin.Result$Companion r4 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L54
            boolean r4 = r5.a()     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L55
            r0.f357891d = r6     // Catch: java.lang.Throwable -> L5a
            r0.f357892e = r5     // Catch: java.lang.Throwable -> L5a
            r0.f357895h = r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r4 = p3325xe03a0797.p3326xc267989b.v2.d(r5, r0)     // Catch: java.lang.Throwable -> L5a
            if (r4 != r7) goto L55
            goto L8a
        L54:
            r5 = 0
        L55:
            java.lang.Object r4 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r5)     // Catch: java.lang.Throwable -> L5a
            goto L65
        L5a:
            r4 = move-exception
            kotlin.Result$Companion r5 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r4 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r4)
            java.lang.Object r4 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r4)
        L65:
            java.lang.Throwable r4 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r4)
            if (r4 == 0) goto L88
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = " cancelAndJoinSafely error: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "MovieComp.MainComposingUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r4)
        L88:
            jz5.f0 r7 = jz5.f0.f384359a
        L8a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.a7(gx0.w8, kotlinx.coroutines.r2, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [kotlinx.coroutines.f1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x02a5 -> B:21:0x0431). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0331 -> B:20:0x0428). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x034c -> B:14:0x0350). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0244 -> B:21:0x0431). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(gx0.w8 r29, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r30) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.b7(gx0.w8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:10:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c7(gx0.w8 r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof gx0.h5
            if (r0 == 0) goto L16
            r0 = r11
            gx0.h5 r0 = (gx0.h5) r0
            int r1 = r0.f358031m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f358031m = r1
            goto L1b
        L16:
            gx0.h5 r0 = new gx0.h5
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.f358029h
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f358031m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 != r4) goto L39
            int r10 = r0.f358028g
            java.lang.Object r2 = r0.f358027f
            zu0.a r2 = (zu0.a) r2
            java.lang.Object r5 = r0.f358026e
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f358025d
            gx0.w8 r6 = (gx0.w8) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L7a
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.util.ArrayList r11 = r10.f358656y
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L53
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L53
            r11 = r10
            r10 = r3
            goto La9
        L53:
            java.util.Iterator r11 = r11.iterator()
            r5 = r11
            r11 = r10
            r10 = r3
        L5a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto La9
            java.lang.Object r2 = r5.next()
            zu0.a r2 = (zu0.a) r2
            r0.f358025d = r11
            r0.f358026e = r5
            r0.f358027f = r2
            r0.f358028g = r10
            r0.f358031m = r4
            java.lang.Object r6 = zu0.g.e(r2, r0)
            if (r6 != r1) goto L77
            goto Lbd
        L77:
            r9 = r6
            r6 = r11
            r11 = r9
        L7a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "checkIsRealShoot: "
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r8 = ", "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r7 = "MovieComp.MainComposingUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r2)
            if (r11 == 0) goto La7
            int r10 = r10 + 1
            if (r10 < 0) goto La2
            goto La7
        La2:
            kz5.c0.o()
            r10 = 0
            throw r10
        La7:
            r11 = r6
            goto L5a
        La9:
            float r10 = (float) r10
            java.util.ArrayList r11 = r11.f358656y
            int r11 = r11.size()
            float r11 = (float) r11
            float r10 = r10 / r11
            r11 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 < 0) goto Lb9
            r3 = r4
        Lb9:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.c7(gx0.w8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void d7(gx0.w8 w8Var) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 c4160xdd704649;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713[] l17;
        float doubleValue;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 o17;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o77 = w8Var.W6().o7();
        if (o77 == null || (o76 = w8Var.W6().o7()) == null || (c4160xdd704649 = o76.f129947a) == null || (l17 = c4160xdd704649.l()) == null) {
            return;
        }
        for (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 : l17) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
            double q17 = o77.q();
            java.lang.Double valueOf = (c4181x2248e1a3 == null || (o17 = c4181x2248e1a3.o1()) == null) ? null : java.lang.Double.valueOf(o17.f129896b);
            if (c4181x2248e1a3 != null && valueOf != null && ou0.b0.a(c4181x2248e1a3)) {
                yy0.m0 m0Var = (yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class));
                m0Var.getClass();
                float hj6 = !pp0.h0.Q2(m0Var, false, 1, null) ? 0.0f : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20388x1bccb557());
                float Ni = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Ni();
                if (valueOf.doubleValue() < hj6) {
                    doubleValue = (float) (q17 / valueOf.doubleValue());
                } else {
                    double d17 = Ni;
                    doubleValue = valueOf.doubleValue() > d17 ? (float) (valueOf.doubleValue() / d17) : 1.0f;
                }
                c4181x2248e1a3.t0(new android.graphics.PointF(c4181x2248e1a3.o0().x * doubleValue, c4181x2248e1a3.o0().y * doubleValue));
            }
        }
    }

    public static final bv0.e e7(gx0.w8 w8Var) {
        return (bv0.e) ((jz5.n) w8Var.X).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f7(gx0.w8 r6, java.lang.String r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof gx0.x5
            if (r0 == 0) goto L16
            r0 = r8
            gx0.x5 r0 = (gx0.x5) r0
            int r1 = r0.f358694g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f358694g = r1
            goto L1b
        L16:
            gx0.x5 r0 = new gx0.x5
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f358692e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f358694g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L90
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f358691d
            gx0.w8 r6 = (gx0.w8) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L7c
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            com.tencent.mm.vfs.r6 r8 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r7 = com.p314xaae8f345.mm.vfs.z7.a(r7)
            r8.<init>(r7)
            boolean r7 = r8.m()
            if (r7 == 0) goto L53
            r8.l()
        L53:
            r6.G7()
            hx0.e r7 = r6.V
            jx0.k r7 = r7.f367148b
            boolean r8 = r7.isShowing()
            if (r8 == 0) goto L63
            r7.dismiss()
        L63:
            r7 = 0
            int[] r7 = new int[r7]
            gx0.w7 r8 = new gx0.w7
            r2 = 2131771348(0x7f103fd4, float:1.9174025E38)
            r8.<init>(r6, r2, r7, r3)
            r6.D7(r8)
            r0.f358691d = r6
            r0.f358694g = r5
            java.lang.Object r7 = r6.I7(r0)
            if (r7 != r1) goto L7c
            goto L92
        L7c:
            kotlinx.coroutines.p0 r7 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r7 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            gx0.y5 r8 = new gx0.y5
            r8.<init>(r6, r3)
            r0.f358691d = r3
            r0.f358694g = r4
            java.lang.Object r6 = p3325xe03a0797.p3326xc267989b.l.g(r7, r8, r0)
            if (r6 != r1) goto L90
            goto L92
        L90:
            jz5.f0 r1 = jz5.f0.f384359a
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.f7(gx0.w8, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(2:25|(2:27|(2:29|30)))(1:31))|12|13|(1:15)|16|17))|34|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        r5 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r4 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g7(gx0.w8 r4, p3325xe03a0797.p3326xc267989b.r2 r5, java.lang.String r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof gx0.l6
            if (r0 == 0) goto L16
            r0 = r7
            gx0.l6 r0 = (gx0.l6) r0
            int r1 = r0.f358201h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f358201h = r1
            goto L1b
        L16:
            gx0.l6 r0 = new gx0.l6
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r4 = r0.f358199f
            pz5.a r7 = pz5.a.f440719d
            int r1 = r0.f358201h
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r5 = r0.f358198e
            kotlinx.coroutines.r2 r5 = (p3325xe03a0797.p3326xc267989b.r2) r5
            java.lang.Object r6 = r0.f358197d
            java.lang.String r6 = (java.lang.String) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r4)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r4)
            kotlin.Result$Companion r4 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L54
            boolean r4 = r5.a()     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L55
            r0.f358197d = r6     // Catch: java.lang.Throwable -> L5a
            r0.f358198e = r5     // Catch: java.lang.Throwable -> L5a
            r0.f358201h = r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r4 = r5.C(r0)     // Catch: java.lang.Throwable -> L5a
            if (r4 != r7) goto L55
            goto L8a
        L54:
            r5 = 0
        L55:
            java.lang.Object r4 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r5)     // Catch: java.lang.Throwable -> L5a
            goto L65
        L5a:
            r4 = move-exception
            kotlin.Result$Companion r5 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r4 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r4)
            java.lang.Object r4 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r4)
        L65:
            java.lang.Throwable r4 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r4)
            if (r4 == 0) goto L88
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = " joinSafely error: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "MovieComp.MainComposingUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r4)
        L88:
            jz5.f0 r7 = jz5.f0.f384359a
        L8a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.g7(gx0.w8, kotlinx.coroutines.r2, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h7(gx0.w8 r27, xt0.h r28, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 r29, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a r30, java.lang.String r31, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a r32, java.lang.String r33, java.lang.String r34, boolean r35, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r36) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.h7(gx0.w8, xt0.h, com.tencent.maas.moviecomposing.Timeline, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, java.lang.String, com.tencent.maas.model.time.MJTime, java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0086 -> B:10:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i7(gx0.w8 r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof gx0.p6
            if (r0 == 0) goto L16
            r0 = r8
            gx0.p6 r0 = (gx0.p6) r0
            int r1 = r0.f358360m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f358360m = r1
            goto L1b
        L16:
            gx0.p6 r0 = new gx0.p6
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f358358h
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f358360m
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f358357g
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r2 = r0.f358356f
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f358355e
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r5 = r0.f358354d
            gx0.w8 r5 = (gx0.w8) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L89
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.util.ArrayList r8 = r7.f358656y
            r8.clear()
            com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig r2 = r7.v7()
            java.util.List r2 = r2.f150876e
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto Lba
            com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig r2 = r7.v7()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r2 = r2.f150876e
            java.util.Iterator r2 = r2.iterator()
            r6 = r8
            r8 = r7
            r7 = r6
        L69:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L92
            java.lang.Object r5 = r2.next()
            com.tencent.mm.maas_api.MJMediaItem r5 = (com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa) r5
            r0.f358354d = r8
            r0.f358355e = r4
            r0.f358356f = r2
            r0.f358357g = r7
            r0.f358360m = r3
            java.lang.Object r5 = zu0.g.f(r5, r0)
            if (r5 != r1) goto L86
            goto Lbc
        L86:
            r6 = r5
            r5 = r8
            r8 = r6
        L89:
            zu0.a r8 = (zu0.a) r8
            if (r8 == 0) goto L90
            r4.add(r8)
        L90:
            r8 = r5
            goto L69
        L92:
            java.util.List r4 = (java.util.List) r4
            r7.addAll(r4)
            java.util.ArrayList r7 = r8.f358656y
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto Lba
            android.app.Activity r7 = r8.m80379x76847179()
            r0 = 0
            int[] r1 = new int[r0]
            r2 = 2131771353(0x7f103fd9, float:1.9174035E38)
            by0.t.a(r7, r2, r1)
            androidx.appcompat.app.AppCompatActivity r7 = r8.m158354x19263085()
            r7.setResult(r0)
            androidx.appcompat.app.AppCompatActivity r7 = r8.m158354x19263085()
            r7.finish()
        Lba:
            jz5.f0 r1 = jz5.f0.f384359a
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.i7(gx0.w8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void k7(gx0.w8 w8Var, java.lang.String str) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var = w8Var.f358649s;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        w8Var.f358650t = p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new gx0.v6(w8Var, str, null), 2, null);
    }

    public static final java.lang.Object l7(gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        gx0.y4 y4Var = w8Var.f358648r;
        gx0.y4 y4Var2 = gx0.y4.f358737h;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (y4Var != y4Var2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.MainComposingUIC", "releasePlaybackSessionUnderPlaybackState >> but state is " + w8Var.f358648r);
        } else {
            w8Var.J7(gx0.y4.f358738i);
            w8Var.f358650t = p3325xe03a0797.p3326xc267989b.l.d(w8Var.mo144225x95f74600(), null, null, new gx0.r7(w8Var, null), 3, null);
        }
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m7(gx0.w8 r15, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 r16, java.lang.String r17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            r0 = r15
            r1 = r19
            r15.getClass()
            boolean r2 = r1 instanceof gx0.y7
            if (r2 == 0) goto L19
            r2 = r1
            gx0.y7 r2 = (gx0.y7) r2
            int r3 = r2.f358751n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f358751n = r3
            goto L1e
        L19:
            gx0.y7 r2 = new gx0.y7
            r2.<init>(r15, r1)
        L1e:
            java.lang.Object r1 = r2.f358749i
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f358751n
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L51
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            goto Lbf
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            java.lang.Object r0 = r2.f358747g
            com.tencent.maas.instamovie.MJExportSettings r0 = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4) r0
            java.lang.Object r4 = r2.f358746f
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r2.f358745e
            com.tencent.maas.moviecomposing.Timeline r7 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861) r7
            java.lang.Object r8 = r2.f358744d
            gx0.w8 r8 = (gx0.w8) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            r9 = r0
            r10 = r7
            r0 = r8
            r8 = r4
            goto L76
        L51:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r1 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            gx0.e8 r4 = new gx0.e8
            r7 = 0
            r4.<init>(r15, r7)
            r2.f358744d = r0
            r7 = r16
            r2.f358745e = r7
            r8 = r17
            r2.f358746f = r8
            r9 = r18
            r2.f358747g = r9
            r2.f358751n = r6
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.l.g(r1, r4, r2)
            if (r1 != r3) goto L75
            goto Lc0
        L75:
            r10 = r7
        L76:
            r7 = r1
            com.tencent.maas.moviecomposing.ExportSession r7 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422) r7
            r2.f358744d = r0
            r2.f358745e = r10
            r2.f358746f = r8
            r2.f358747g = r9
            r2.f358748h = r7
            r2.f358751n = r5
            kotlinx.coroutines.r r1 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r2 = pz5.f.b(r2)
            r1.<init>(r2, r6)
            r1.k()
            gx0.a8 r2 = new gx0.a8
            r2.<init>(r7, r0, r8)
            r1.m(r2)
            kotlin.jvm.internal.f0 r2 = new kotlin.jvm.internal.f0
            r2.<init>()
            r2.f391649d = r6
            com.tencent.maas.moviecomposing.Storyline r4 = r10.f129947a
            com.tencent.maas.model.time.MJTimeRange r11 = r4.n()
            gx0.b8 r12 = new gx0.b8
            r12.<init>(r2, r0)
            gx0.c8 r13 = new gx0.c8
            r13.<init>(r2, r0)
            gx0.d8 r14 = new gx0.d8
            r14.<init>(r1)
            r7.c(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r1.j()
            if (r1 != r3) goto Lbf
            goto Lc0
        Lbf:
            r3 = r1
        Lc0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.m7(gx0.w8, com.tencent.maas.moviecomposing.Timeline, java.lang.String, com.tencent.maas.instamovie.MJExportSettings, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n7(gx0.w8 r15, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 r16, java.lang.String r17, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4142x2dcd1be9 r18, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            r0 = r15
            r1 = r20
            r15.getClass()
            boolean r2 = r1 instanceof gx0.f8
            if (r2 == 0) goto L19
            r2 = r1
            gx0.f8 r2 = (gx0.f8) r2
            int r3 = r2.f357948n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f357948n = r3
            goto L1e
        L19:
            gx0.f8 r2 = new gx0.f8
            r2.<init>(r15, r1)
        L1e:
            java.lang.Object r1 = r2.f357946i
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f357948n
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L51
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            goto Lc1
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            java.lang.Object r0 = r2.f357944g
            com.tencent.maas.instamovie.MJExportSettings r0 = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4) r0
            java.lang.Object r4 = r2.f357943f
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r2.f357942e
            com.tencent.maas.moviecomposing.Timeline r7 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861) r7
            java.lang.Object r8 = r2.f357941d
            gx0.w8 r8 = (gx0.w8) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            r9 = r0
            r10 = r7
            r0 = r8
            r8 = r4
            goto L78
        L51:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r1 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            gx0.l8 r4 = new gx0.l8
            r7 = 0
            r8 = r18
            r4.<init>(r8, r15, r7)
            r2.f357941d = r0
            r7 = r16
            r2.f357942e = r7
            r8 = r17
            r2.f357943f = r8
            r9 = r19
            r2.f357944g = r9
            r2.f357948n = r6
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.l.g(r1, r4, r2)
            if (r1 != r3) goto L77
            goto Lc2
        L77:
            r10 = r7
        L78:
            r7 = r1
            com.tencent.maas.moviecomposing.ExportSession r7 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422) r7
            r2.f357941d = r0
            r2.f357942e = r10
            r2.f357943f = r8
            r2.f357944g = r9
            r2.f357945h = r7
            r2.f357948n = r5
            kotlinx.coroutines.r r1 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r2 = pz5.f.b(r2)
            r1.<init>(r2, r6)
            r1.k()
            gx0.h8 r2 = new gx0.h8
            r2.<init>(r7, r0, r8)
            r1.m(r2)
            kotlin.jvm.internal.f0 r2 = new kotlin.jvm.internal.f0
            r2.<init>()
            r2.f391649d = r6
            com.tencent.maas.moviecomposing.Storyline r4 = r10.f129947a
            com.tencent.maas.model.time.MJTimeRange r11 = r4.n()
            gx0.i8 r12 = new gx0.i8
            r12.<init>(r2, r0)
            gx0.j8 r13 = new gx0.j8
            r13.<init>(r2, r0)
            gx0.k8 r14 = new gx0.k8
            r14.<init>(r1)
            r7.d(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r1.j()
            if (r1 != r3) goto Lc1
            goto Lc2
        Lc1:
            r3 = r1
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.n7(gx0.w8, com.tencent.maas.moviecomposing.Timeline, java.lang.String, com.tencent.maas.moviecomposing.ExportInitParam, com.tencent.maas.instamovie.MJExportSettings, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void o7(gx0.w8 w8Var) {
        w8Var.getClass();
        w8Var.J7(gx0.y4.f358736g);
        w8Var.f358650t = p3325xe03a0797.p3326xc267989b.l.d(w8Var.mo144225x95f74600(), null, null, new gx0.m8(w8Var, null), 3, null);
    }

    public static final java.lang.Object p7(gx0.w8 w8Var, boolean z17, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object C = ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.l.d(w8Var.f358649s, null, null, new gx0.q8(w8Var, z18, z17, null), 3, null)).C(interfaceC29045xdcb5ca57);
        return C == pz5.a.f440719d ? C : jz5.f0.f384359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    @Override // yt0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A2() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.A2():void");
    }

    @Override // yt0.c
    public boolean A4() {
        return (((z7().getScaleY() > 1.0f ? 1 : (z7().getScaleY() == 1.0f ? 0 : -1)) == 0) ^ true) || (((z7().getTranslationY() > 0.0f ? 1 : (z7().getTranslationY() == 0.0f ? 0 : -1)) == 0) ^ true);
    }

    @Override // yt0.c
    public java.lang.Object A6(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new gx0.x7(this, str, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    public final android.widget.FrameLayout A7() {
        android.widget.FrameLayout frameLayout = this.B;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topAreaContainer");
        throw null;
    }

    public final android.view.ViewGroup B7() {
        android.view.ViewGroup viewGroup = this.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoContainer");
        throw null;
    }

    public final android.util.SizeF C7() {
        return new android.util.SizeF(B7().getWidth(), B7().getHeight());
    }

    public final void D7(yz5.l lVar) {
        p3325xe03a0797.p3326xc267989b.y0 m158345xefc66565 = m158345xefc66565();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new gx0.o6(lVar, null), 2, null);
    }

    @Override // yt0.c
    public java.lang.Object E4(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new gx0.o5(this, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    public final java.lang.Object E7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new gx0.n7(this, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof gx0.o7
            if (r0 == 0) goto L13
            r0 = r6
            gx0.o7 r0 = (gx0.o7) r0
            int r1 = r0.f358325f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f358325f = r1
            goto L18
        L13:
            gx0.o7 r0 = new gx0.o7
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f358323d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f358325f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            kotlinx.coroutines.p0 r6 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r6 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            gx0.p7 r2 = new gx0.p7
            r4 = 0
            r2.<init>(r5, r4)
            r0.f358325f = r3
            java.lang.Object r6 = p3325xe03a0797.p3326xc267989b.l.g(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.F7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void G7() {
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe6876422 = this.T;
            if (c4143xe6876422 != null) {
                c4143xe6876422.b();
            }
            this.T = null;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }

    public final void H7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "reportPreparePlaybackSessionFinished");
        i95.m c17 = i95.n0.c(pp0.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        L("SCRecordToMC", "MJShootComposing", ((yy0.m7) ((pp0.l0) c17)).Ni(), 0);
        L("SCAssetGenerateToMC", "MJShootComposing", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ni(), 0);
        L("MCImport", "MJShootComposing", "", 0);
    }

    public final java.lang.Object I7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db k76 = V6().k7();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (k76 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "restartPlaybackSession: ");
            java.lang.Object r76 = r7(false, V6().h7(), interfaceC29045xdcb5ca57);
            if (r76 == pz5.a.f440719d) {
                return r76;
            }
        }
        return f0Var;
    }

    @Override // yt0.c
    public android.util.SizeF J1() {
        return C7();
    }

    public final void J7(gx0.y4 y4Var) {
        if (this.f358648r == y4Var) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "state: " + this.f358648r + " -> " + y4Var);
        this.f358648r = y4Var;
        this.f358650t = null;
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.n8(this, y4Var, null), 3, null);
    }

    public final void K7(java.lang.String str) {
        int dimensionPixelOffset = j65.q.a(m80379x76847179()).getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.agp);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41 s76 = s7();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.g3 a17 = n3.b1.a(s76);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        int c17 = (a18 != null ? a18.f328580d - a18.f328578b : com.p314xaae8f345.mm.ui.bl.c(s76.getContext())) - j65.q.a(s76.getContext()).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ajd);
        if (c17 < 0) {
            c17 = 0;
        }
        int i17 = c17 + dimensionPixelOffset;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41 s77 = s7();
        android.view.ViewGroup.LayoutParams layoutParams = s77.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = i17;
        s77.setLayoutParams(layoutParams2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "[updateBottomBarHeight] source:" + str + " bottomToolBarHeight:" + i17 + " defaultHeight:" + dimensionPixelOffset);
    }

    public final void L7(boolean z17) {
        android.widget.ImageView imageView = this.G;
        if (imageView != null) {
            imageView.setVisibility(z17 ? 0 : 8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playButton");
            throw null;
        }
    }

    public final void M7(boolean z17) {
        android.widget.TextView textView = this.H;
        if (textView != null) {
            textView.setVisibility(z17 ? 0 : 8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvPlayerTime");
            throw null;
        }
    }

    @Override // yt0.c
    public void N0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k panelUIC, java.util.Map map, boolean z17, zw0.b entrance) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelUIC, "panelUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        if (panelUIC.X6()) {
            return;
        }
        if (z17) {
            gx0.x4 x4Var = (gx0.x4) ((jz5.n) this.f430434o).mo141623x754a37bb();
            x4Var.getClass();
            if (x4Var.q()) {
                if (entrance == zw0.b.f558085f) {
                    x4Var.l7();
                } else {
                    x4Var.U6(false);
                }
            }
        }
        nv0.e.a((nv0.e) ((jz5.n) this.f358653w).mo141623x754a37bb(), panelUIC, map, new zw0.e(entrance, zw0.d.f558094f), z17 ? this.f358647p0 : null, null, false, 48, null);
    }

    @Override // yt0.c
    public java.util.List N5() {
        return this.f358656y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N7(boolean z17) {
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.C20377xb52718f()) == 1;
        if (!z17 || !z18) {
            android.view.View view = this.f358646l1;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC", "updateReeditBubbleVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC", "updateReeditBubbleVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        eu0.q qVar = v7().f150888t;
        if (qVar == null || !qVar.a()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setupReeditBubble: skip, reeditParams is null: ");
            sb6.append(qVar == null);
            sb6.append(", isValid: ");
            sb6.append(qVar != null ? java.lang.Boolean.valueOf(qVar.a()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", sb6.toString());
            return;
        }
        if (v7().f150889u == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "setupReeditBubble: skip, localCreateTemplateInfo is null");
            return;
        }
        r45.mi0 mi0Var = v7().f150890v;
        if (mi0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "setupReeditBubble: skip, effectEditInfo is null");
            return;
        }
        int i17 = mi0Var.f462070g;
        java.lang.String str = mi0Var.f462071h;
        if (str == null) {
            str = "";
        }
        if (i17 == 1) {
            if (!(str.length() == 0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = v7().f150881m;
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = c16993xacc19624 != null ? c16993xacc19624.I : null;
                java.lang.String str2 = c16995x8ab634cd != null ? c16995x8ab634cd.f237231o : null;
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.Object obj = c16995x8ab634cd != null ? c16995x8ab634cd.f237230n : null;
                qVar.f338268f = new eu0.o(str2, obj != null ? obj : "");
                android.view.View view2 = this.f358646l1;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC", "setupReeditBubbleIfNeeded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC", "setupReeditBubbleIfNeeded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.soi);
                    if (textView != null) {
                        textView.setText(str);
                    }
                    view2.setOnClickListener(new gx0.v7(this, qVar));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "setupReeditBubble: attached, wording=".concat(str));
                    return;
                }
                return;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setupReeditBubble: skip, enableEdit=");
        sb7.append(i17);
        sb7.append(", wording.empty=");
        sb7.append(str.length() == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", sb7.toString());
    }

    @Override // yt0.c
    public void Z2(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "reportExitMovieComposing");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = W6().o7();
        if (o76 != null) {
            du0.v0 R6 = R6();
            int h76 = W6().h7();
            int k76 = W6().k7();
            R6.getClass();
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.b1(m7Var, o76, h76, k76, null), 3, null);
        }
        if (v7().a()) {
            yt0.c.V(this, "MCToSC", "MJShootComposing", null, 0, 12, null);
        }
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        w40.e.fh((w40.e) c17, "andr_MJ_Edit_Video_Cancel", null, 2, null);
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.p5(this, z17, null), 3, null);
    }

    @Override // yt0.c
    public yw0.n f2() {
        return (yw0.n) ((jz5.n) this.Y).mo141623x754a37bb();
    }

    @Override // yt0.c
    public boolean h2() {
        ex0.a0 a0Var = W6().f358175r;
        if (a0Var != null) {
            return a0Var.f338624a.b();
        }
        return false;
    }

    @Override // yt0.c
    public void j() {
        nv0.e.c((nv0.e) ((jz5.n) this.f358653w).mo141623x754a37bb(), false, 1, null);
    }

    @Override // yt0.c
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.uic.C10955x675e70c1 l2() {
        return v7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        int i17 = v7().f150884p ? 1 : 3;
        vt3.l lVar = vt3.l.f521538a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AssetInfoStatistics", "removeAllMedia");
        lVar.c(new vt3.g(i17));
        if (U6().mo2274xbdc3c5dc() || nv0.e.c((nv0.e) ((jz5.n) this.f358653w).mo141623x754a37bb(), false, 1, null)) {
            return true;
        }
        O4(m80379x76847179());
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        D7(new gx0.w6(this, null));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.c7(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (P6().f324895d) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f358649s, null, null, new gx0.k6(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x025e  */
    @Override // du0.g, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo47092x594b1124(android.view.View r26) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.mo47092x594b1124(android.view.View):void");
    }

    public final void q7(float f17, int i17) {
        float width = A7().getWidth();
        float height = ((A7().getHeight() + s7().getHeight()) - i17) - X6().c7();
        boolean z17 = f17 > width / height;
        float height2 = A7().getHeight();
        android.util.SizeF sizeF = (f17 > (width / height2) ? 1 : (f17 == (width / height2) ? 0 : -1)) > 0 ? new android.util.SizeF(width, width / f17) : new android.util.SizeF(height2 * f17, height2);
        android.util.SizeF sizeF2 = z17 ? new android.util.SizeF(width, width / f17) : new android.util.SizeF(height * f17, height);
        by0.b.b(B7(), f17, sizeF.getWidth(), sizeF.getHeight());
        by0.b.b(z7(), f17, sizeF.getWidth(), sizeF.getHeight());
        by0.b.b(y7(), f17, sizeF.getWidth(), sizeF.getHeight());
        z7().setTranslationY(0.0f);
        y7().setTranslationY(0.0f);
        z7().setScaleX(1.0f);
        z7().setScaleY(1.0f);
        y7().setScaleX(1.0f);
        y7().setScaleY(1.0f);
        float f18 = (-(height2 - height)) / 2;
        z7().setTranslationY(f18);
        y7().setTranslationY(f18);
        if (!(sizeF.getWidth() == sizeF2.getWidth())) {
            float width2 = sizeF2.getWidth() / sizeF.getWidth();
            z7().setScaleX(width2);
            z7().setScaleY(width2);
            y7().setScaleX(width2);
            y7().setScaleY(width2);
        }
        B7().invalidate();
        B7().requestLayout();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|134|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x007e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0081, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0027. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f4 A[Catch: all -> 0x00c8, Exception -> 0x00cc, TRY_LEAVE, TryCatch #13 {Exception -> 0x00cc, all -> 0x00c8, blocks: (B:105:0x00bf, B:107:0x00f0, B:109:0x00f4), top: B:104:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0220 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0207 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ou0.p] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [gx0.w8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v34, types: [gx0.w8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r7(boolean r19, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.r7(boolean, com.tencent.maas.model.time.MJTime, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41 s7() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41 c10994x5f336d41 = this.F;
        if (c10994x5f336d41 != null) {
            return c10994x5f336d41;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomToolBar");
        throw null;
    }

    public final nv0.d t7() {
        return (nv0.d) ((jz5.n) this.f358652v).mo141623x754a37bb();
    }

    public final android.widget.TextView u7() {
        return (android.widget.TextView) ((jz5.n) this.R).mo141623x754a37bb();
    }

    @Override // yt0.c
    public nv0.d v6() {
        return t7();
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.uic.C10955x675e70c1 v7() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.uic.C10955x675e70c1 c10955x675e70c1 = this.f358654x;
        if (c10955x675e70c1 != null) {
            return c10955x675e70c1;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("movieComposingConfig");
        throw null;
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10998xc859527c w7() {
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10998xc859527c) ((jz5.n) this.P).mo141623x754a37bb();
    }

    public final java.util.Map x7() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = v7().f150881m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = c16993xacc19624 != null ? c16993xacc19624.I : null;
        jz5.l[] lVarArr = new jz5.l[4];
        java.lang.String str2 = c16995x8ab634cd != null ? c16995x8ab634cd.f237231o : null;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        java.lang.String str4 = c16995x8ab634cd != null ? c16995x8ab634cd.f237230n : null;
        if (str4 == null) {
            str4 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str4);
        lVarArr[2] = new jz5.l("comment_scene", 101);
        eu0.q qVar = v7().f150888t;
        if (qVar != null && (str = qVar.f338264b) != null) {
            str3 = str;
        }
        lVarArr[3] = new jz5.l("templateid", str3);
        return kz5.c1.k(lVarArr);
    }

    public final android.widget.FrameLayout y7() {
        android.widget.FrameLayout frameLayout = this.E;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scalableReferenceContainer");
        throw null;
    }

    public final android.widget.FrameLayout z7() {
        android.widget.FrameLayout frameLayout = this.D;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scalableVideoContainer");
        throw null;
    }
}
