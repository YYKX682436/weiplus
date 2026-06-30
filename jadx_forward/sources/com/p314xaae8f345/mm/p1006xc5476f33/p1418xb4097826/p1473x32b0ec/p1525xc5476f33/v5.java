package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class v5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f196193p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f196194q;

    /* renamed from: r, reason: collision with root package name */
    public final int f196195r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se f196196s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f196197t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196193p = statusMonitor;
        this.f196194q = "Finder.LiveAnchorExceptionPlugin";
        this.f196195r = 10000;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f196197t = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin$realnameNotifyListener$1
            {
                this.f39173x3fe91575 = 323604482;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 event = c6256xb3fb7c12;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                mo48814x2efc64();
                int i17 = event.f136506g.f87653a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 v5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se seVar = v5Var.f196196s;
                if (seVar != null) {
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ke(seVar));
                }
                qo0.c cVar = v5Var.f196193p;
                android.view.ViewGroup viewGroup = v5Var.f194857f;
                if (i17 != -1) {
                    ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                    ml2.d3 d3Var = ml2.d3.f408891h;
                    android.content.Context context = viewGroup.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    j0Var.Jj(d3Var, xy2.c.e(context));
                    qo0.c.a(cVar, qo0.b.f446896i, null, 2, null);
                    return false;
                }
                qo0.b bVar = qo0.b.J1;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_POST_AFTER_FACE_VERIFY", true);
                cVar.mo46557x60d69242(bVar, bundle);
                ml2.j0 j0Var2 = (ml2.j0) i95.n0.c(ml2.j0.class);
                ml2.d3 d3Var2 = ml2.d3.f408890g;
                android.content.Context context2 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                j0Var2.Jj(d3Var2, xy2.c.e(context2));
                return false;
            }
        };
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        if (i17 == this.f196195r) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se seVar = this.f196196s;
            if (seVar != null) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ke(seVar));
            }
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (intent == null || (str = intent.getStringExtra("srcUsername")) == null) {
                str = "";
            }
            qo0.c cVar = this.f196193p;
            if (i18 == -1 && bundleExtra != null) {
                java.lang.String string = bundleExtra.getString("go_next", "");
                java.lang.String string2 = bundleExtra.getString("result_json");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                    int mo15072xb58848b9 = new cl0.g(string2).mo15072xb58848b9("code");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, "roomlive_verify") && mo15072xb58848b9 == 0) {
                        qo0.b bVar = qo0.b.J1;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putBoolean("PARAM_FINDER_LIVE_POST_AFTER_FACE_VERIFY", true);
                        cVar.mo46557x60d69242(bVar, bundle);
                        ((ml2.j0) i95.n0.c(ml2.j0.class)).Jj(ml2.d3.f408890g, str);
                        return;
                    }
                }
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Jj(ml2.d3.f408891h, str);
            qo0.c.a(cVar, qo0.b.f446896i, null, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(java.lang.String str) {
        if (this.f196196s == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se seVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se(this.f446856d, str, ((mm2.c1) S0().a(mm2.c1.class)).t7(), this);
            this.f196196s = seVar;
            seVar.f201291f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r5(this);
        }
    }

    public final void u1(java.lang.String anchorUserName, r45.qp1 qp1Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f196194q, "showAnchorForceQuit anchorUserName:".concat(anchorUserName));
        t1(anchorUserName);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se seVar = this.f196196s;
        if (seVar != null) {
            seVar.c(3, qp1Var, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s5(this));
        }
    }

    public final void v1(java.lang.String anchorUserName, r45.qp1 qp1Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f196194q, "showCreateLiveDynamicErrPage anchorUserName:".concat(anchorUserName));
        t1(anchorUserName);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se seVar = this.f196196s;
        if (seVar != null) {
            seVar.c(7, qp1Var, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t5(this));
        }
    }

    public final void w1(java.lang.String str, java.lang.String str2, r45.qp1 qp1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f196194q, "showFaceVerify:" + str);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Jj(ml2.d3.f408888e, str2);
        t1("");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se seVar = this.f196196s;
        if (seVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se.d(seVar, 2, qp1Var, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u5(this, str2), 4, null);
        }
    }
}
