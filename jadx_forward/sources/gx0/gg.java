package gx0;

/* loaded from: classes5.dex */
public abstract class gg extends du0.g implements nv0.f {

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f358009i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f358010m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f358011n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f358012o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f358013p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f358014q;

    /* renamed from: r, reason: collision with root package name */
    public final float f358015r;

    /* renamed from: s, reason: collision with root package name */
    public gx0.jf f358016s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358009i = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("MC_SubtitleRecommendedUse");
        this.f358010m = jz5.h.b(new gx0.vf(this));
        this.f358011n = jz5.h.b(new gx0.bg(this));
        this.f358012o = jz5.h.b(gx0.fg.f357972d);
        this.f358013p = new java.util.concurrent.ConcurrentHashMap();
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dvg, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rwt);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rws);
        textView.setOnClickListener(new gx0.zf(this));
        textView2.setOnClickListener(new gx0.ag(this));
        this.f358014q = inflate;
        this.f358015r = j65.q.a(m80379x76847179()).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
        this.f358016s = gx0.jf.f358128d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U6(gx0.gg r10, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof gx0.nf
            if (r0 == 0) goto L16
            r0 = r12
            gx0.nf r0 = (gx0.nf) r0
            int r1 = r0.f358311h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f358311h = r1
            goto L1b
        L16:
            gx0.nf r0 = new gx0.nf
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f358309f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f358311h
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r10 = r0.f358308e
            r11 = r10
            com.tencent.maas.moviecomposing.segments.ClipSegment r11 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) r11
            java.lang.Object r10 = r0.f358307d
            gx0.gg r10 = (gx0.gg) r10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L7d
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.lang.String r7 = r11.s1()
            if (r7 != 0) goto L47
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L8c
        L47:
            gx0.if r12 = gx0.Cif.f358084f
            java.lang.Boolean r2 = r10.Y6(r11, r12)
            if (r2 == 0) goto L51
            r1 = r2
            goto L8c
        L51:
            java.util.concurrent.ConcurrentHashMap r2 = r10.f358013p
            java.lang.Object r12 = r2.get(r12)
            boolean r2 = r12 instanceof pu0.b
            if (r2 == 0) goto L5e
            pu0.b r12 = (pu0.b) r12
            goto L5f
        L5e:
            r12 = 0
        L5f:
            r8 = r12
            if (r8 != 0) goto L65
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L8c
        L65:
            kotlinx.coroutines.p0 r12 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            gx0.pf r2 = new gx0.pf
            r9 = 0
            r4 = r2
            r5 = r11
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f358307d = r10
            r0.f358308e = r11
            r0.f358311h = r3
            java.lang.Object r12 = p3325xe03a0797.p3326xc267989b.l.g(r12, r2, r0)
            if (r12 != r1) goto L7d
            goto L8c
        L7d:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            gx0.if r0 = gx0.Cif.f358084f
            r10.b7(r11, r12, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.gg.U6(gx0.gg, com.tencent.maas.moviecomposing.segments.ClipSegment, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object V6(gx0.gg r7, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof gx0.qf
            if (r0 == 0) goto L16
            r0 = r9
            gx0.qf r0 = (gx0.qf) r0
            int r1 = r0.f358431i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f358431i = r1
            goto L1b
        L16:
            gx0.qf r0 = new gx0.qf
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f358429g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f358431i
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.f358427e
            r8 = r7
            com.tencent.maas.moviecomposing.segments.ClipSegment r8 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) r8
            java.lang.Object r7 = r0.f358426d
            gx0.gg r7 = (gx0.gg) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L99
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            gx0.if r9 = gx0.Cif.f358085g
            java.lang.Boolean r9 = r7.Y6(r8, r9)
            if (r9 == 0) goto L48
            r1 = r9
            goto La8
        L48:
            du0.t1 r9 = r7.S6()
            pp0.s0 r9 = r9.f324978i
            if (r9 != 0) goto L53
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto La8
        L53:
            r0.f358426d = r7
            r0.f358427e = r8
            r0.f358428f = r9
            r0.f358431i = r3
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r2.<init>(r0, r3)
            r2.k()
            vu0.o0 r0 = new vu0.o0
            android.app.Activity r4 = r7.m80379x76847179()
            java.lang.String r4 = xy2.c.e(r4)
            gx0.lf r5 = new gx0.lf
            gx0.sf r6 = new gx0.sf
            r6.<init>(r2)
            r5.<init>(r6)
            r0.<init>(r4, r9, r5)
            com.tencent.maas.moviecomposing.segments.ClipSegment[] r9 = new com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3[r3]
            r3 = 0
            r9[r3] = r8
            java.util.ArrayList r9 = kz5.c0.d(r9)
            r0.b(r9)
            gx0.rf r9 = new gx0.rf
            r9.<init>(r0, r7)
            r2.m(r9)
            java.lang.Object r9 = r2.j()
            if (r9 != r1) goto L99
            goto La8
        L99:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            gx0.if r0 = gx0.Cif.f358085g
            r7.b7(r8, r9, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.gg.V6(gx0.gg, com.tencent.maas.moviecomposing.segments.ClipSegment, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W6(gx0.gg r10, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof gx0.wf
            if (r0 == 0) goto L16
            r0 = r12
            gx0.wf r0 = (gx0.wf) r0
            int r1 = r0.f358674h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f358674h = r1
            goto L1b
        L16:
            gx0.wf r0 = new gx0.wf
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f358672f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f358674h
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r10 = r0.f358671e
            r11 = r10
            com.tencent.maas.moviecomposing.segments.ClipSegment r11 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) r11
            java.lang.Object r10 = r0.f358670d
            gx0.gg r10 = (gx0.gg) r10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L7f
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.lang.String r6 = r11.s1()
            if (r6 != 0) goto L47
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L8e
        L47:
            gx0.if r12 = gx0.Cif.f358082d
            java.lang.Boolean r12 = r10.Y6(r11, r12)
            if (r12 == 0) goto L51
            r1 = r12
            goto L8e
        L51:
            java.util.concurrent.ConcurrentHashMap r12 = r10.f358013p
            gx0.if r2 = gx0.Cif.f358083e
            java.lang.Object r12 = r12.get(r2)
            boolean r2 = r12 instanceof pu0.e
            if (r2 == 0) goto L60
            pu0.e r12 = (pu0.e) r12
            goto L61
        L60:
            r12 = 0
        L61:
            r5 = r12
            if (r5 != 0) goto L67
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L8e
        L67:
            kotlinx.coroutines.p0 r12 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            gx0.yf r2 = new gx0.yf
            r9 = 0
            r4 = r2
            r7 = r11
            r8 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f358670d = r10
            r0.f358671e = r11
            r0.f358674h = r3
            java.lang.Object r12 = p3325xe03a0797.p3326xc267989b.l.g(r12, r2, r0)
            if (r12 != r1) goto L7f
            goto L8e
        L7f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            gx0.if r0 = gx0.Cif.f358082d
            r10.b7(r11, r12, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.gg.W6(gx0.gg, com.tencent.maas.moviecomposing.segments.ClipSegment, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void X6() {
        android.view.View view = this.f358014q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/SubtitleRecommendedUseUIC", "appearView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/SubtitleRecommendedUseUIC", "appearView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float f17 = this.f358015r;
        android.view.View view2 = this.f358014q;
        view2.setTranslationY(f17);
        view2.animate().translationY(0.0f).alpha(1.0f).setDuration(200L).withEndAction(new gx0.mf(this)).start();
    }

    public final java.lang.Boolean Y6(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, gx0.Cif cif) {
        java.lang.String s17 = c4181x2248e1a3.s1();
        java.lang.Boolean bool = null;
        if (s17 != null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 x17 = c4181x2248e1a3.x1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(x17, "getTimeRangeInMedia(...)");
            java.lang.String t17 = this.f358009i.t(c7(s17, x17, cif.name()).f481209b);
            if (t17 != null) {
                bool = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(t17));
            }
        }
        java.util.Objects.toString(cif);
        return bool;
    }

    public final void Z6() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f358013p;
        if (!concurrentHashMap.isEmpty()) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((pu0.a) ((java.util.Map.Entry) it.next()).getValue()).a();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubtitleRecommendedUseUIC", "destroyApi: ");
        }
        concurrentHashMap.clear();
    }

    public void a7() {
        android.view.View view = this.f358014q;
        if (view.getParent() == null || this.f358016s != gx0.jf.f358130f) {
            return;
        }
        e7(gx0.jf.f358131g);
        android.view.View view2 = this.f358014q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/SubtitleRecommendedUseUIC", "disAppearView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/SubtitleRecommendedUseUIC", "disAppearView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setTranslationY(0.0f);
        view.animate().translationY(this.f358015r).alpha(0.0f).setDuration(200L).withEndAction(new gx0.uf(this)).start();
    }

    public final void b7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, boolean z17, gx0.Cif cif) {
        java.lang.String s17 = c4181x2248e1a3.s1();
        if (s17 != null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 x17 = c4181x2248e1a3.x1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(x17, "getTimeRangeInMedia(...)");
            ru0.h c76 = c7(s17, x17, cif.name());
            this.f358009i.D(c76.f481209b, java.lang.String.valueOf(z17));
            cif.toString();
        }
    }

    public final ru0.h c7(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, java.lang.String str2) {
        java.lang.String c17 = dx0.o.c(c4129xdee64553);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubtitleRecommendedUseUIC", "generateUniqueHexKey: mediaFilePath: " + str + ", timeRange: " + c17 + " suffix " + str2);
        byte[] bytes = (str + '_' + c17 + '_' + str2).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("generateUniqueHexKey: uniqueHexKey: ");
        sb6.append(g17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubtitleRecommendedUseUIC", sb6.toString());
        com.p314xaae8f345.mm.vfs.r6 b17 = ru0.m.b(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        return new ru0.h(b17, g17);
    }

    /* renamed from: cancel */
    public final void m132419xae7a2e7a() {
        gx0.jf jfVar = this.f358016s;
        gx0.jf jfVar2 = gx0.jf.f358133i;
        if (jfVar != jfVar2) {
            e7(jfVar2);
            if (p3325xe03a0797.p3326xc267989b.z0.h(m158345xefc66565())) {
                p3325xe03a0797.p3326xc267989b.z0.e(m158345xefc66565(), null, 1, null);
            }
            android.view.View subtitleTipView = this.f358014q;
            subtitleTipView.animate().cancel();
            subtitleTipView.clearAnimation();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subtitleTipView, "subtitleTipView");
            android.view.ViewParent parent = subtitleTipView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(subtitleTipView);
            }
        }
    }

    public final gx0.w8 d7() {
        return (gx0.w8) this.f358010m.mo141623x754a37bb();
    }

    public final void e7(gx0.jf value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (value == gx0.jf.f358130f) {
            yy0.m7 m7Var = (yy0.m7) R6().O6();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.r3(m7Var, null), 3, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubtitleRecommendedUseUIC", ":  state Change  " + this.f358016s + " -> " + value);
        this.f358016s = value;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f7(java.util.List r16, android.widget.FrameLayout r17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r18) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.gg.f7(java.util.List, android.widget.FrameLayout, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        m132419xae7a2e7a();
        Z6();
        e7(gx0.jf.f358128d);
        nv0.d t76 = d7().t7();
        t76.getClass();
        java.util.ArrayList arrayList = t76.f421960a;
        if (arrayList.contains(this)) {
            arrayList.remove(this);
        }
    }

    @Override // du0.g, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        d7().t7().a(this);
    }

    @Override // nv0.f
    public void v4(boolean z17, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q composingPanel, nv0.d stack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composingPanel, "composingPanel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stack, "stack");
    }
}
