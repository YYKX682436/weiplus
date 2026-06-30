package sp2;

/* loaded from: classes3.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f492540a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f492541b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f492542c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.qt2 f492543d;

    /* renamed from: e, reason: collision with root package name */
    public final long f492544e;

    /* renamed from: f, reason: collision with root package name */
    public final int f492545f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.f1 f492546g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a f492547h;

    /* renamed from: i, reason: collision with root package name */
    public az2.f f492548i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f492549j;

    public d3(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, sp2.q qVar, android.view.View parentView, r45.qt2 contextObj, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f492540a = context;
        this.f492541b = fragment;
        this.f492542c = parentView;
        this.f492543d = contextObj;
        this.f492544e = j17;
        this.f492545f = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(sp2.d3 r26, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r27, yl2.k r28, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r29) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.d3.a(sp2.d3, com.tencent.mm.ui.MMActivity, yl2.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(yz5.a aVar) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f492540a;
        if (!(abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            abstractActivityC21394xb3d2c0cf = null;
        }
        if (abstractActivityC21394xb3d2c0cf != null) {
            if (this.f492547h == null) {
                if (aVar != null) {
                    aVar.mo152xb9724478();
                    return;
                }
                return;
            }
            try {
                p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractActivityC21394xb3d2c0cf.mo7595x9cdc264().m7630xb2c12e75();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a c14217x338c613a = this.f492547h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14217x338c613a);
                m7630xb2c12e75.j(c14217x338c613a);
                sp2.p2 p2Var = new sp2.p2(aVar, this);
                if (m7630xb2c12e75.f92883g) {
                    throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
                }
                m7630xb2c12e75.f92884h = false;
                if (m7630xb2c12e75.f92893q == null) {
                    m7630xb2c12e75.f92893q = new java.util.ArrayList();
                }
                m7630xb2c12e75.f92893q.add(p2Var);
                sp2.r2 r2Var = new sp2.r2(abstractActivityC21394xb3d2c0cf);
                if (m7630xb2c12e75.f92883g) {
                    throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
                }
                m7630xb2c12e75.f92884h = false;
                if (m7630xb2c12e75.f92893q == null) {
                    m7630xb2c12e75.f92893q = new java.util.ArrayList();
                }
                m7630xb2c12e75.f92893q.add(r2Var);
                m7630xb2c12e75.e();
            } catch (java.lang.Exception e17) {
                e17.getMessage();
                this.f492547h = null;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
            }
        }
    }

    public final void c(java.util.LinkedList linkedList) {
        r45.pm2 pm2Var;
        r45.wm2 wm2Var;
        if (!linkedList.isEmpty()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.X(linkedList);
            c19792x256d2725.m76784x5db1b11();
            c19792x256d2725.m76801x8010e5e4();
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, wk0Var.m75945x2fec8307(0));
            wk0Var.set(1, wk0Var.m75945x2fec8307(1));
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            r45.qt2 qt2Var = this.f492543d;
            y74Var.set(1, java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)));
            java.lang.String m76801x8010e5e4 = c19792x256d2725.m76801x8010e5e4();
            if (m76801x8010e5e4 == null) {
                m76801x8010e5e4 = "";
            }
            y74Var.set(2, m76801x8010e5e4);
            y74Var.set(5, c19792x256d2725);
            wk0Var.set(6, y74Var);
            r45.ta4 ta4Var = new r45.ta4();
            ta4Var.set(2, c19792x256d2725.m76829x97edf6c0());
            java.util.LinkedList m75941xfb821914 = ta4Var.m75941xfb821914(20);
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, "UserClick");
            qa4Var.set(1, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            m75941xfb821914.add(qa4Var);
            r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
            if (m76806xdef68064 != null && (pm2Var = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) != null && (wm2Var = (r45.wm2) pm2Var.m75936x14adae67(10)) != null) {
                ta4Var.set(30, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(wm2Var.mo14344x5f01b1f6()));
            }
            ta4Var.set(34, 4);
            wk0Var.set(7, ta4Var);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("main_page_position", "7");
            android.content.Intent intent = new android.content.Intent();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                java.util.Set<java.lang.String> keySet = bundle.keySet();
                java.util.Iterator<java.lang.String> it = keySet != null ? keySet.iterator() : null;
                if (it != null) {
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        jSONObject.putOpt(next, bundle.get(next));
                    }
                }
            } catch (java.lang.Exception e17) {
                e17.getMessage();
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            intent.putExtra("key_chnl_extra", jSONObject2);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).bl(java.lang.String.valueOf(qt2Var.m75939xb282bd08(5)));
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            java.lang.String valueOf = java.lang.String.valueOf(qt2Var.m75939xb282bd08(5));
            r0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
            r0Var.f409405m = valueOf;
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            java.lang.String valueOf2 = java.lang.String.valueOf(qt2Var.m75939xb282bd08(5));
            y4Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf2, "<set-?>");
            y4Var.f409819a = valueOf2;
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(this.f492540a, intent, linkedList, 0, wk0Var, null);
        }
    }

    public final void d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        az2.f fVar = this.f492548i;
        if (fVar != null) {
            fVar.b();
        }
        az2.f a17 = az2.c.a(az2.f.f97658d, abstractActivityC21394xb3d2c0cf, null, 0L, null, 10, null);
        this.f492548i = a17;
        a17.a();
        p3325xe03a0797.p3326xc267989b.f1 f1Var = this.f492546g;
        if (f1Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(f1Var, null, 1, null);
        }
    }
}
