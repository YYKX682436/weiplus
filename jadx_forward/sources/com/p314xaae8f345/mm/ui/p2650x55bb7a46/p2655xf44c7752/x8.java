package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class x8 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f283089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f283090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja f283091f;

    public x8(p3325xe03a0797.p3326xc267989b.q qVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar) {
        this.f283089d = qVar;
        this.f283090e = f9Var;
        this.f283091f = jaVar;
    }

    @Override // wf0.u1
    public void h(wf0.r1 notifyInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
        p3325xe03a0797.p3326xc267989b.q qVar = this.f283089d;
        if (((p3325xe03a0797.p3326xc267989b.r) qVar).o()) {
            return;
        }
        t21.v2 s17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.s(this.f283090e);
        java.lang.String d17 = s17 != null ? s17.d() : null;
        java.lang.String str = notifyInfo.f527062a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, d17)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = this.f283091f;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t8 t8Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t8) jaVar.f282613u.get(str);
            if (s17 == null || t8Var == null) {
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().A(this);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("Couldn't find video info: info=" + s17 + ", item=" + t8Var))));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onNotifyChange, status:" + s17.f496544i);
            if (s17.f496544i == 198) {
                if (jaVar.G(t8Var)) {
                    dp.a.m125853x26a183b(jaVar.f282419d.f282625g, com.p314xaae8f345.mm.R.C30867xcad56011.k78, 0).show();
                }
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().A(this);
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("Video is expired or failed to download"))));
                return;
            }
            int g17 = t21.d3.g(s17);
            int i17 = t8Var.f282941a;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta k17 = jaVar.k(i17);
            if (jaVar.f282419d.f282625g.I7() == i17 && k17 != null) {
                jaVar.K(k17, g17);
            }
            if (s17.i()) {
                jaVar.G(t8Var);
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().A(this);
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
            }
        }
    }
}
