package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public class v1 extends fm2.a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f198259h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f198260i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f198261m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.util.AttributeSet attributeSet) {
        super(context, componentCallbacksC1101xa17d4670, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f198259h = "Finder.LiveAnchorPluginLayout";
        this.f198260i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.s1(this);
        this.f198261m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.t1(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: activate */
    public void mo57461x9d4bd4f3(km2.m data, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.mo57461x9d4bd4f3(data, z17, z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198259h, "liveFinish:" + ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).G1 + ",isFromFloat:" + z17 + ", restart:" + z18 + ",liveId:" + ((mm2.e1) m57635xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0) + ",objectId:" + ((mm2.e1) m57635xbba4bfc0(mm2.e1.class)).f410516m + ",nonceId:" + ((mm2.e1) m57635xbba4bfc0(mm2.e1.class)).f410525v + ",username:" + ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).f410385o);
        sm2.k9 m129722x7ffc6cca = m129722x7ffc6cca();
        if (((mm2.e1) m129722x7ffc6cca.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0) == 0) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            y4Var.U = false;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            y4Var.V = false;
            fm2.a aVar = m129722x7ffc6cca.f101128c;
            if (aVar != null) {
                qo0.c.a(aVar, qo0.b.f446896i, null, 2, null);
            }
        } else if (!z17) {
            if (!dk2.ef.S) {
                ((mm2.c1) m129722x7ffc6cca.c(mm2.c1.class)).a9(((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ni(((mm2.e1) m129722x7ffc6cca.c(mm2.e1.class)).f410516m).m59240x7c94657b());
            }
            ((mm2.f6) m129722x7ffc6cca.c(mm2.f6.class)).f410566g = true;
            fm2.a aVar2 = m129722x7ffc6cca.f101128c;
            if (aVar2 != null) {
                aVar2.m129725xe466bfa0(false);
            }
        } else if (((mm2.c1) m129722x7ffc6cca.c(mm2.c1.class)).G1) {
            fm2.a aVar3 = m129722x7ffc6cca.f101128c;
            if (aVar3 != null) {
                qo0.c.a(aVar3, qo0.b.H, null, 2, null);
            }
        } else {
            fm2.a aVar4 = m129722x7ffc6cca.f101128c;
            if (aVar4 != null) {
                aVar4.m129725xe466bfa0(true);
            }
        }
        android.content.Intent intent = m129722x7ffc6cca.f101127b.getIntent();
        if (intent.hasExtra("KEY_PARAMS_POST_CREATE_LIVE")) {
            r45.sm1 sm1Var = new r45.sm1();
            byte[] byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_POST_CREATE_LIVE");
            if (byteArrayExtra != null) {
                try {
                    sm1Var.mo11468x92b714fd(byteArrayExtra);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            r45.Cdo cdo = (r45.Cdo) sm1Var.m75936x14adae67(6);
            if (cdo != null && pm0.v.z((int) cdo.m75942xfb822ef2(0), 256)) {
                if (((int) cdo.m75942xfb822ef2(1)) == 0) {
                    ((mm2.c1) m129722x7ffc6cca.c(mm2.c1.class)).p8(((int) ((mm2.c1) m129722x7ffc6cca.c(mm2.c1.class)).f410399q) & (-257));
                    ((mm2.c1) m129722x7ffc6cca.c(mm2.c1.class)).D8(0);
                    fm2.a aVar5 = m129722x7ffc6cca.f101128c;
                    if (aVar5 != null) {
                        qo0.b bVar = qo0.b.f446899i4;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
                        aVar5.mo46557x60d69242(bVar, bundle);
                    }
                } else if (((int) cdo.m75942xfb822ef2(1)) == 256) {
                    ((mm2.c1) m129722x7ffc6cca.c(mm2.c1.class)).p8(((int) ((mm2.c1) m129722x7ffc6cca.c(mm2.c1.class)).f410399q) | 256);
                    ((mm2.c1) m129722x7ffc6cca.c(mm2.c1.class)).D8(1);
                    fm2.a aVar6 = m129722x7ffc6cca.f101128c;
                    if (aVar6 != null) {
                        qo0.b bVar2 = qo0.b.f446899i4;
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
                        aVar6.mo46557x60d69242(bVar2, bundle2);
                    }
                }
            }
        }
        dk2.jf.f315198a.a(mo57003x337a8b(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: applyState */
    public void mo57462x4ab45c3(int i17, boolean z17, int i18, boolean z18, android.os.Bundle bundle) {
        android.view.ViewGroup viewGroup;
        yz5.l lVar;
        java.util.LinkedList linkedList = null;
        if (((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).T7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57627xbbf42674(this, false, 1, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qa qaVar = m129722x7ffc6cca().f491077g;
            if (qaVar != null) {
                qaVar.K0(0);
            }
            sm2.o4 m129723x1ce28c0f = m129723x1ce28c0f();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var = m129723x1ce28c0f.f491149i;
            if (o9Var != null) {
                o9Var.K0(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j90 j90Var = m129723x1ce28c0f.f491151j;
            if (j90Var != null) {
                j90Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var = m129723x1ce28c0f.f491153k;
            if (nd0Var != null) {
                nd0Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = m129723x1ce28c0f.f491155l;
            if (khVar != null) {
                khVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = m129723x1ce28c0f.f491161o;
            if (mgVar != null) {
                mgVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k5 k5Var = m129723x1ce28c0f.f491164q;
            if (k5Var != null) {
                k5Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar = m129723x1ce28c0f.f491165r;
            if (tyVar != null) {
                tyVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar = m129723x1ce28c0f.f491166s;
            if (ivVar != null) {
                ivVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var = m129723x1ce28c0f.f491167t;
            if (w00Var != null) {
                w00Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = m129723x1ce28c0f.f491169v;
            if (r60Var != null) {
                r60Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0 ga0Var = m129723x1ce28c0f.f491170w;
            if (ga0Var != null) {
                ga0Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 v5Var = m129723x1ce28c0f.f491147h;
            if (v5Var != null) {
                v5Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = m129723x1ce28c0f.f491168u;
            if (owVar != null) {
                owVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var = m129723x1ce28c0f.f491172y;
            if (v6Var != null) {
                v6Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn bnVar = m129723x1ce28c0f.H;
            if (bnVar != null) {
                bnVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kn knVar = m129723x1ce28c0f.I;
            if (knVar != null) {
                knVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar = m129723x1ce28c0f.f491137J;
            if (apVar != null) {
                apVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar = m129723x1ce28c0f.K;
            if (dqVar != null) {
                dqVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var = m129723x1ce28c0f.f491171x;
            if (de0Var != null) {
                de0Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var = m129723x1ce28c0f.f491173z;
            if (a5Var != null) {
                a5Var.K0(8);
            }
            pn2.f fVar = m129723x1ce28c0f.B;
            if (fVar != null) {
                fVar.K0(8);
            }
            my2.e eVar = m129723x1ce28c0f.D;
            if (eVar != null) {
                eVar.K0(8);
            }
            my2.k0 k0Var = m129723x1ce28c0f.E;
            if (k0Var != null) {
                k0Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d1 d1Var = m129723x1ce28c0f.F;
            if (d1Var != null) {
                d1Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f1 f1Var = m129723x1ce28c0f.G;
            if (f1Var != null) {
                f1Var.K0(8);
            }
            qn2.n nVar = m129723x1ce28c0f.C;
            if (nVar != null) {
                nVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 v70Var = m129723x1ce28c0f.L;
            if (v70Var != null) {
                v70Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = m129723x1ce28c0f.M;
            if (x7Var != null) {
                x7Var.K0(8);
            }
            zi2.w wVar = m129723x1ce28c0f.P;
            if (wVar != null) {
                wVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = m129723x1ce28c0f.N;
            if (c4Var != null) {
                c4Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t20 t20Var = m129723x1ce28c0f.f491146g0;
            if (t20Var != null) {
                t20Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww wwVar = m129723x1ce28c0f.O;
            if (wwVar != null) {
                wwVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bb0 bb0Var = m129723x1ce28c0f.Q;
            if (bb0Var != null) {
                bb0Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar = m129723x1ce28c0f.W;
            if (naVar != null) {
                naVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30 r30Var = m129723x1ce28c0f.X;
            if (r30Var != null) {
                r30Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f8 f8Var = m129723x1ce28c0f.f491138a0;
            if (f8Var != null) {
                f8Var.K0(8);
            }
            if (((mm2.c1) m129723x1ce28c0f.c(mm2.c1.class)).l7()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa faVar = m129723x1ce28c0f.R;
                if (faVar != null) {
                    faVar.K0(0);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa faVar2 = m129723x1ce28c0f.R;
                if (faVar2 != null) {
                    faVar2.K0(8);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q5 q5Var = m129723x1ce28c0f.Y;
            if (q5Var != null) {
                q5Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x5 x5Var = m129723x1ce28c0f.Z;
            if (x5Var != null) {
                x5Var.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wh whVar = m129723x1ce28c0f.f491139b0;
            if (whVar != null) {
                whVar.K0(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = m129721x9e94176().f490982g;
            if (v3Var != null) {
                v3Var.K0(8);
            }
        } else if (!((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).X7()) {
            if (((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).U7()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57627xbbf42674(this, false, 1, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qa qaVar2 = m129722x7ffc6cca().f491077g;
                if (qaVar2 != null) {
                    qaVar2.K0(8);
                }
                sm2.o4 m129723x1ce28c0f2 = m129723x1ce28c0f();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j90 j90Var2 = m129723x1ce28c0f2.f491151j;
                if (j90Var2 != null) {
                    j90Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var2 = m129723x1ce28c0f2.f491153k;
                if (nd0Var2 != null) {
                    nd0Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar2 = m129723x1ce28c0f2.f491155l;
                if (khVar2 != null) {
                    khVar2.K0(8);
                }
                xu2.u uVar = m129723x1ce28c0f2.f491159n;
                if (uVar != null) {
                    uVar.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar2 = m129723x1ce28c0f2.f491161o;
                if (mgVar2 != null) {
                    mgVar2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a80 a80Var = m129723x1ce28c0f2.f491163p;
                if (a80Var != null) {
                    a80Var.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar2 = m129723x1ce28c0f2.f491168u;
                if (owVar2 != null) {
                    owVar2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var2 = m129723x1ce28c0f2.f491172y;
                if (v6Var2 != null) {
                    v6Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var2 = m129723x1ce28c0f2.f491169v;
                if (r60Var2 != null) {
                    r60Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0 ga0Var2 = m129723x1ce28c0f2.f491170w;
                if (ga0Var2 != null) {
                    ga0Var2.K0(8);
                }
                if (((mm2.t2) m129723x1ce28c0f2.c(mm2.t2.class)).f410966o) {
                    java.lang.String str = m129723x1ce28c0f2.f491143f;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onLiveEnd: isLiveEndByForceQuit = true");
                    r45.qp1 qp1Var = ((mm2.t2) m129723x1ce28c0f2.c(mm2.t2.class)).f410967p;
                    java.lang.Integer num = ((mm2.t2) m129723x1ce28c0f2.c(mm2.t2.class)).f410968q;
                    if (qp1Var == null || num == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onLiveEnd: isLiveEndByForceQuit, but no cache errorPage");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 v5Var2 = m129723x1ce28c0f2.f491147h;
                        if (v5Var2 != null) {
                            v5Var2.K0(8);
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 v5Var3 = m129723x1ce28c0f2.f491147h;
                        if (v5Var3 != null) {
                            v5Var3.K0(0);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 v5Var4 = m129723x1ce28c0f2.f491147h;
                        if (v5Var4 != null) {
                            v5Var4.u1(((mm2.c1) m129723x1ce28c0f2.c(mm2.c1.class)).f410385o, qp1Var, num.intValue());
                        }
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 v5Var5 = m129723x1ce28c0f2.f491147h;
                    if (v5Var5 != null) {
                        v5Var5.K0(8);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var2 = m129723x1ce28c0f2.f491167t;
                if (w00Var2 != null) {
                    w00Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn bnVar2 = m129723x1ce28c0f2.H;
                if (bnVar2 != null) {
                    bnVar2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kn knVar2 = m129723x1ce28c0f2.I;
                if (knVar2 != null) {
                    knVar2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar2 = m129723x1ce28c0f2.f491137J;
                if (apVar2 != null) {
                    apVar2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar2 = m129723x1ce28c0f2.K;
                if (dqVar2 != null) {
                    dqVar2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var2 = m129723x1ce28c0f2.f491171x;
                if (de0Var2 != null) {
                    de0Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var2 = m129723x1ce28c0f2.f491173z;
                if (a5Var2 != null) {
                    a5Var2.K0(8);
                }
                pn2.f fVar2 = m129723x1ce28c0f2.B;
                if (fVar2 != null) {
                    fVar2.K0(8);
                }
                qn2.n nVar2 = m129723x1ce28c0f2.C;
                if (nVar2 != null) {
                    nVar2.K0(8);
                }
                my2.e eVar2 = m129723x1ce28c0f2.D;
                if (eVar2 != null) {
                    eVar2.K0(8);
                }
                my2.k0 k0Var2 = m129723x1ce28c0f2.E;
                if (k0Var2 != null) {
                    k0Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d1 d1Var2 = m129723x1ce28c0f2.F;
                if (d1Var2 != null) {
                    d1Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f1 f1Var2 = m129723x1ce28c0f2.G;
                if (f1Var2 != null) {
                    f1Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 v70Var2 = m129723x1ce28c0f2.L;
                if (v70Var2 != null) {
                    v70Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var2 = m129723x1ce28c0f2.M;
                if (x7Var2 != null) {
                    x7Var2.K0(8);
                }
                zi2.w wVar2 = m129723x1ce28c0f2.P;
                if (wVar2 != null) {
                    wVar2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h8 h8Var = m129723x1ce28c0f2.S;
                if (h8Var != null) {
                    h8Var.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l8 l8Var = m129723x1ce28c0f2.f491141d0;
                if (l8Var != null) {
                    l8Var.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6 c6Var = m129723x1ce28c0f2.f491142e0;
                if (c6Var != null) {
                    c6Var.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r9 r9Var = m129723x1ce28c0f2.T;
                if (r9Var != null) {
                    r9Var.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t8 t8Var = m129723x1ce28c0f2.U;
                if (t8Var != null) {
                    t8Var.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b9 b9Var = m129723x1ce28c0f2.V;
                if (b9Var != null) {
                    b9Var.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var2 = m129723x1ce28c0f2.N;
                if (c4Var2 != null) {
                    c4Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t20 t20Var2 = m129723x1ce28c0f2.f491146g0;
                if (t20Var2 != null) {
                    t20Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w60 w60Var = m129723x1ce28c0f2.f491148h0;
                if (w60Var != null) {
                    w60Var.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww wwVar2 = m129723x1ce28c0f2.O;
                if (wwVar2 != null) {
                    wwVar2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bb0 bb0Var2 = m129723x1ce28c0f2.Q;
                if (bb0Var2 != null) {
                    bb0Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa faVar3 = m129723x1ce28c0f2.R;
                if (faVar3 != null) {
                    faVar3.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar2 = m129723x1ce28c0f2.W;
                if (naVar2 != null) {
                    naVar2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30 r30Var2 = m129723x1ce28c0f2.X;
                if (r30Var2 != null) {
                    r30Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q5 q5Var2 = m129723x1ce28c0f2.Y;
                if (q5Var2 != null) {
                    q5Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x5 x5Var2 = m129723x1ce28c0f2.Z;
                if (x5Var2 != null) {
                    x5Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f8 f8Var2 = m129723x1ce28c0f2.f491138a0;
                if (f8Var2 != null) {
                    f8Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wh whVar2 = m129723x1ce28c0f2.f491139b0;
                if (whVar2 != null) {
                    whVar2.K0(8);
                }
                sm2.f m129721x9e94176 = m129721x9e94176();
                if (((mm2.t2) m129721x9e94176.c(mm2.t2.class)).f410966o) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m129721x9e94176.f490981f, "finish live by force quit, hide normal end page");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var2 = m129721x9e94176.f490982g;
                    if (v3Var2 != null) {
                        v3Var2.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184132a.b(m129721x9e94176.f101142a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184137f > 0 ? 1 : 0, 0, "anchorEndByForceQuit", "0-vBitrate:" + hn0.v.f363975c);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveStatisticsReport", "anchorStatisticsReport reset");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184133b = 0L;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184134c = 0L;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184135d = 0L;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184136e = 0L;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184137f = 0L;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184139h = 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184138g = 1;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var3 = m129721x9e94176.f490982g;
                    if (v3Var3 != null) {
                        v3Var3.I1(new sm2.a(m129721x9e94176));
                    }
                    ((ku5.t0) ku5.t0.f394148d).q(new sm2.b(m129721x9e94176));
                }
                un0.h hVar = un0.s.f510951b;
                if (hVar != null && (lVar = hVar.f510898n) != null) {
                    lVar.mo146xb9724478("FinderLiveAnchorPluginLayout-applyState");
                }
            } else if (((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).a8()) {
                if ((((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).f410357j2 != 2 && ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).f410346h2 == 2) || !(!pm0.v.z(((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).f410352i2, 32) || pm0.v.z(((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).f410340g2, 32) || ((mm2.t2) m57635xbba4bfc0(mm2.t2.class)).f410961g)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57627xbbf42674(this, false, 1, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qa qaVar3 = m129722x7ffc6cca().f491077g;
                if (qaVar3 != null) {
                    qaVar3.K0(8);
                }
                sm2.o4 m129723x1ce28c0f3 = m129723x1ce28c0f();
                m129723x1ce28c0f3.getClass();
                ae2.in inVar = ae2.in.f85221a;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85429v).mo141623x754a37bb()).r()).intValue() == 1 && !m129723x1ce28c0f3.f491145g) {
                    m129723x1ce28c0f3.f491145g = true;
                    fm2.a aVar = m129723x1ce28c0f3.f101128c;
                    if (aVar != null) {
                        sm2.l9 l9Var = new sm2.l9(aVar);
                        l9Var.a(new sm2.m9(null, 8, new sm2.x7(m129723x1ce28c0f3, aVar), sm2.b7.f490913d));
                        sm2.l9.b(l9Var, 8, null, new sm2.t8(m129723x1ce28c0f3, aVar), 2, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.z8(m129723x1ce28c0f3, aVar), 2, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.tqx, 8, null, new sm2.b9(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.f566067tg1, 8, null, new sm2.d9(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.f566068tg2, 8, null, new sm2.f9(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.tg_, null, null, new sm2.h9(m129723x1ce28c0f3, aVar), 6, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.fnv, 8, null, new sm2.j9(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.f566250tl5, 8, null, new sm2.g6(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.j6(aVar, m129723x1ce28c0f3), 2, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.f9c, 8, null, new sm2.l6(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.tit, 8, null, new sm2.n6(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.f2s, 8, null, new sm2.q6(aVar, m129723x1ce28c0f3), 4, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.s6(m129723x1ce28c0f3, aVar), 2, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.f1i, 8, null, new sm2.u6(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.tg7, 8, null, new sm2.w6(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.to7, 8, null, new sm2.y6(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.f_u, 8, null, new sm2.a7(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.e7(m129723x1ce28c0f3, aVar), 2, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.f566355tp5, 8, null, new sm2.g7(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.tgg, 8, null, new sm2.i7(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.tqy, 8, null, new sm2.k7(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.b(l9Var, null, null, new sm2.m7(m129723x1ce28c0f3, aVar), 3, null);
                        sm2.l9.b(l9Var, null, null, new sm2.o7(m129723x1ce28c0f3, aVar), 3, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.q7(m129723x1ce28c0f3, aVar), 2, null);
                        sm2.l9.b(l9Var, null, null, new sm2.s7(m129723x1ce28c0f3, aVar), 3, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.u7(m129723x1ce28c0f3, aVar), 2, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.w7(m129723x1ce28c0f3, aVar), 2, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.tga, 8, null, new sm2.a8(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.b(l9Var, null, null, new sm2.c8(m129723x1ce28c0f3, aVar), 3, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.eww, 8, null, new sm2.e8(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.b(l9Var, null, null, new sm2.g8(m129723x1ce28c0f3, aVar), 3, null);
                        sm2.l9.b(l9Var, null, null, new sm2.i8(m129723x1ce28c0f3, aVar), 3, null);
                        sm2.l9.b(l9Var, null, null, new sm2.k8(m129723x1ce28c0f3, aVar), 3, null);
                        sm2.l9.b(l9Var, null, null, new sm2.m8(m129723x1ce28c0f3, aVar), 3, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.euu, null, null, new sm2.o8(m129723x1ce28c0f3, aVar), 6, null);
                        sm2.l9.b(l9Var, null, null, new sm2.q8(m129723x1ce28c0f3, aVar), 3, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.tqs, null, null, new sm2.s8(m129723x1ce28c0f3, aVar), 6, null);
                        sm2.l9.c(l9Var, com.p314xaae8f345.mm.R.id.ff8, 8, null, new sm2.w8(m129723x1ce28c0f3, aVar), 4, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.y8(m129723x1ce28c0f3, aVar), 2, null);
                        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l> S0 = kz5.n0.S0(l9Var.f491091b);
                        fm2.a aVar2 = m129723x1ce28c0f3.f101128c;
                        if (aVar2 != null) {
                            aVar2.mo273xed6858b4();
                        }
                        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 : S0) {
                            try {
                                lVar2.z0();
                            } catch (java.lang.Throwable unused) {
                                lVar2.getClass();
                            }
                        }
                        if (((mm2.c1) m129723x1ce28c0f3.c(mm2.c1.class)).a8()) {
                            S0.size();
                            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar3 : S0) {
                                try {
                                    if (lVar3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l) {
                                        lVar3.M0(qo0.b.f446919n, bundle);
                                        android.os.Bundle bundle2 = new android.os.Bundle();
                                        bundle2.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", ((mm2.c1) m129723x1ce28c0f3.c(mm2.c1.class)).l7());
                                        bundle2.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", ((ct2.j) m129723x1ce28c0f3.c(ct2.j.class)).f303805p);
                                        lVar3.M0(qo0.b.f446899i4, bundle2);
                                    }
                                } catch (java.lang.Throwable unused2) {
                                    lVar3.getClass();
                                }
                            }
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var3 = m129723x1ce28c0f3.f491153k;
                if (nd0Var3 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0.P1(nd0Var3, null, false, 3, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var2 = m129723x1ce28c0f3.f491149i;
                if (o9Var2 != null) {
                    o9Var2.K0(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j90 j90Var3 = m129723x1ce28c0f3.f491151j;
                if (j90Var3 != null) {
                    j90Var3.t1();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var4 = m129723x1ce28c0f3.f491153k;
                if (nd0Var4 != null) {
                    nd0Var4.K0(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar3 = m129723x1ce28c0f3.f491155l;
                if (khVar3 != null) {
                    khVar3.K0(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar3 = m129723x1ce28c0f3.f491161o;
                if (mgVar3 != null) {
                    mgVar3.K0(0);
                }
                if (pm0.v.z((int) ((mm2.c1) m129723x1ce28c0f3.c(mm2.c1.class)).f410399q, 512)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var3 = m129723x1ce28c0f3.f491172y;
                    if (v6Var3 != null) {
                        v6Var3.K0(8);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var4 = m129723x1ce28c0f3.f491172y;
                    if (v6Var4 != null) {
                        v6Var4.K0(0);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 v70Var3 = m129723x1ce28c0f3.L;
                if (v70Var3 != null) {
                    v70Var3.K0(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a80 a80Var2 = m129723x1ce28c0f3.f491163p;
                if (a80Var2 != null) {
                    a80Var2.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var3 = m129723x1ce28c0f3.f491173z;
                if (a5Var3 != null) {
                    a5Var3.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 v5Var6 = m129723x1ce28c0f3.f491147h;
                if (v5Var6 != null) {
                    v5Var6.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar3 = m129723x1ce28c0f3.f491168u;
                if (owVar3 != null) {
                    owVar3.K0(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k5 k5Var2 = m129723x1ce28c0f3.f491164q;
                if (k5Var2 != null) {
                    k5Var2.K0(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar4 = m129723x1ce28c0f3.f491155l;
                if (khVar4 != null && (viewGroup = khVar4.f446856d) != null) {
                    viewGroup.post(new sm2.u3(m129723x1ce28c0f3));
                }
                if (((mm2.o4) m129723x1ce28c0f3.c(mm2.o4.class)).Z != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar3 = m129723x1ce28c0f3.W;
                    if (naVar3 != null) {
                        naVar3.K0(0);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar4 = m129723x1ce28c0f3.W;
                    if (naVar4 != null) {
                        naVar4.K0(8);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f10Var = m129723x1ce28c0f3.f491150i0;
                if (f10Var != null) {
                    f10Var.K0(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var3 = m129723x1ce28c0f3.N;
                if (c4Var3 != null) {
                    c4Var3.F1();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t8 t8Var2 = m129723x1ce28c0f3.U;
                if (t8Var2 != null) {
                    t8Var2.t1();
                }
                if (pm0.v.z(((mm2.c1) m129723x1ce28c0f3.c(mm2.c1.class)).f410340g2, 32)) {
                    fm2.a aVar3 = m129723x1ce28c0f3.f101128c;
                    if (aVar3 != null) {
                        java.lang.String str2 = ((mm2.c1) m129723x1ce28c0f3.c(mm2.c1.class)).f410385o;
                        java.lang.String string = m129723x1ce28c0f3.f101127b.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dod);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        aVar3.m57772x3e15da70(str2, string);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t8 t8Var3 = m129723x1ce28c0f3.U;
                    if (t8Var3 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t8Var3.f195888q, "hide!");
                        t8Var3.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var5 = m129723x1ce28c0f3.f491172y;
                    if (v6Var5 != null) {
                        v6Var5.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0 ga0Var3 = m129723x1ce28c0f3.f491170w;
                    if (ga0Var3 != null) {
                        ga0Var3.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var3 = m129723x1ce28c0f3.f491169v;
                    if (r60Var3 != null) {
                        r60Var3.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar4 = m129723x1ce28c0f3.f491168u;
                    if (owVar4 != null) {
                        owVar4.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar4 = m129723x1ce28c0f3.f491161o;
                    if (mgVar4 != null) {
                        mgVar4.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var3 = m129723x1ce28c0f3.f491167t;
                    if (w00Var3 != null) {
                        w00Var3.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var4 = m129723x1ce28c0f3.f491173z;
                    if (a5Var4 != null) {
                        a5Var4.K0(8);
                    }
                    qn2.n nVar3 = m129723x1ce28c0f3.C;
                    if (nVar3 != null) {
                        nVar3.K0(8);
                    }
                    my2.k0 k0Var3 = m129723x1ce28c0f3.E;
                    if (k0Var3 != null) {
                        k0Var3.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var4 = m129723x1ce28c0f3.N;
                    if (c4Var4 != null) {
                        c4Var4.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t20 t20Var3 = m129723x1ce28c0f3.f491146g0;
                    if (t20Var3 != null) {
                        t20Var3.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w60 w60Var2 = m129723x1ce28c0f3.f491148h0;
                    if (w60Var2 != null) {
                        w60Var2.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 v70Var4 = m129723x1ce28c0f3.L;
                    if (v70Var4 != null) {
                        v70Var4.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar5 = m129723x1ce28c0f3.W;
                    if (naVar5 != null) {
                        naVar5.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30 r30Var3 = m129723x1ce28c0f3.X;
                    if (r30Var3 != null) {
                        r30Var3.K0(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f8 f8Var3 = m129723x1ce28c0f3.f491138a0;
                    if (f8Var3 != null) {
                        f8Var3.K0(8);
                    }
                    fm2.a aVar4 = m129723x1ce28c0f3.f101128c;
                    if (aVar4 != null) {
                        qo0.c.a(aVar4, qo0.b.P3, null, 2, null);
                    }
                } else if (pm0.v.z(((mm2.c1) m129723x1ce28c0f3.c(mm2.c1.class)).f410340g2, 65536)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var5 = m129723x1ce28c0f3.N;
                    java.lang.String w17 = c4Var5 != null ? c4Var5.w1(15) : null;
                    r45.xm1 xm1Var = (r45.xm1) ((mm2.c1) m129723x1ce28c0f3.c(mm2.c1.class)).f410354i4.get(15);
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Xj(ml2.h5.f409057e, "", 0, w17, xm1Var != null ? xm1Var.m75945x2fec8307(2) : null, xm1Var != null ? xm1Var.m75945x2fec8307(1) : null);
                    java.lang.String string2 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_SING_SONG_NAME") : null;
                    java.lang.String string3 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_LINK_USERNAME") : null;
                    java.lang.String string4 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_LINK_NICKNAME") : null;
                    java.lang.String string5 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_LINK_AVATAR") : null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m129723x1ce28c0f3.f491143f, "UI_STATE_GIFT targetUsername:" + string3 + " targetNickname:" + string4 + " targetAvatar:" + string5);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lj ljVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lj(string3, string4, string5);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = m129723x1ce28c0f3.f491140c0;
                        if (hmVar != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.T1(hmVar, ljVar, string2, null, 4, null);
                        }
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar2 = m129723x1ce28c0f3.f491140c0;
                        if (hmVar2 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.T1(hmVar2, null, null, null, 7, null);
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar3 = m129723x1ce28c0f3.f491140c0;
                        if (hmVar3 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.T1(hmVar3, null, string2, null, 5, null);
                        }
                    }
                }
                rl2.i iVar = (rl2.i) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).f148530u).mo141623x754a37bb();
                java.lang.String liveId = java.lang.String.valueOf(((mm2.e1) m129723x1ce28c0f3.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
                iVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
                android.database.Cursor B = iVar.f478731e.B("select *, rowid from FinderLiveLastRewardInfo where liveId = '" + liveId + '\'', null);
                ce2.j jVar = new ce2.j();
                if (B.moveToFirst()) {
                    jVar.mo9015xbf5d97fd(B);
                }
                B.close();
                if (!(jVar.f72763xa3c65b86 != -1)) {
                    jVar = null;
                }
                if (jVar != null) {
                    r45.s62 s62Var = new r45.s62();
                    s62Var.mo11468x92b714fd(jVar.f67893x213c1d98);
                    java.util.LinkedList m75941xfb821914 = s62Var.m75941xfb821914(0);
                    if (m75941xfb821914 != null) {
                        linkedList = m75941xfb821914;
                    }
                }
                if (linkedList != null) {
                    ((mm2.c1) m129723x1ce28c0f3.c(mm2.c1.class)).f410365k5.clear();
                    ((mm2.c1) m129723x1ce28c0f3.c(mm2.c1.class)).f410365k5.addAll(linkedList);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var4 = m129721x9e94176().f490982g;
                if (v3Var4 != null) {
                    v3Var4.K0(8);
                }
            }
        }
        super.mo57462x4ab45c3(i17, z17, i18, z18, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: bindData */
    public void mo57463x37f82187(km2.m data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.mo57463x37f82187(data);
        java.lang.String str = this.f198259h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindData liveData.isLiveStarted():");
        sb6.append(((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).a8());
        sb6.append(" liveMicSetting:");
        ya2.b2 b2Var = ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).J4;
        sb6.append(b2Var != null ? java.lang.Long.valueOf(b2Var.f69322x673c81fa) : null);
        sb6.append(" liveMicSettingSwitch:");
        ya2.b2 b2Var2 = ((mm2.c1) m57635xbba4bfc0(mm2.c1.class)).J4;
        sb6.append(b2Var2 != null ? java.lang.Long.valueOf(b2Var2.f69323x4b4e41ce) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (in0.q.f374302b2 == null) {
            in0.q.f374302b2 = new in0.q(rn0.a.f479142a.a());
        }
        in0.q qVar = in0.q.f374302b2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
        m129726xcb0b1d2d(qVar);
        in0.q m129720xd052bc21 = m129720xd052bc21();
        if (m129720xd052bc21 != null) {
            m129720xd052bc21.z0(1);
        }
        m129722x7ffc6cca().i(this);
        m129723x1ce28c0f().i(this);
        m129721x9e94176().i(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: callbackSEIData */
    public void mo57464x2499a89c(int i17, r45.fa4 fa4Var) {
        fm2.a aVar;
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        ch2.o2 o2Var;
        sm2.o4 m129723x1ce28c0f = m129723x1ce28c0f();
        if (m129723x1ce28c0f == null || i17 != 35 || fa4Var == null || (aVar = m129723x1ce28c0f.f101128c) == null || (m57663xfb7e5820 = aVar.m57663xfb7e5820()) == null || (c14197x319b1b9e = m57663xfb7e5820.f390664f) == null || (o2Var = (ch2.o2) c14197x319b1b9e.m56798x25fe639c(ch2.o2.class)) == null) {
            return;
        }
        o2Var.A7(fa4Var);
    }

    @Override // fm2.a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a, qo0.c
    /* renamed from: getLiveRole */
    public int mo11219xd0598cf8() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a
    /* renamed from: getRelativeLayoutId */
    public int mo46545x959e1c47() {
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85429v).mo141623x754a37bb()).r()).intValue() == 0 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.anh : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570385er1;
    }

    /* renamed from: getTAG */
    public final java.lang.String m57821xb5886c64() {
        return this.f198259h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: getTRTCLiveCore */
    public tn0.w0 mo57476xdd07d18e() {
        return m129720xd052bc21();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a
    /* renamed from: mount */
    public void mo46547x6343c19() {
        super.mo46547x6343c19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m129720xd052bc21(), "null cannot be cast to non-null type com.tencent.mm.live.core.core.anchor.LiveAnchorTRTCCore");
        no0.h hVar = no0.h.f420253a;
        hVar.c(mo57003x337a8b(), this.f198260i);
        hVar.d(mo57003x337a8b(), this.f198261m);
        gm0.j1.n().f354821b.a(3582, this);
        gm0.j1.n().f354821b.a(3917, this);
        gm0.j1.n().f354821b.a(3861, this);
        gm0.j1.n().f354821b.a(3603, this);
        ((we2.s) m57635xbba4bfc0(we2.s.class)).O6();
    }

    @Override // to0.a
    /* renamed from: name */
    public java.lang.String mo57003x337a8b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1.class.getSimpleName();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: notifySEIMicUserChange */
    public boolean mo57711xfc876354(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, boolean z17, jz5.l lVar) {
        boolean mo57711xfc876354 = super.mo57711xfc876354(jSONObject, jSONObject2, jSONObject3, z17, lVar);
        if (mo57711xfc876354) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.u1(this));
        }
        return mo57711xfc876354;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: onAcceptBattleTimeout */
    public void mo57712x41e21502() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, no0.g
    /* renamed from: onAcceptLiveMic */
    public void mo57488xdfff53f4(no0.a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        m129723x1ce28c0f().getClass();
        if (info.f420247o) {
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            ml2.k1 k1Var = ml2.k1.f409171e;
            j0Var.Bj(13, info.f420234b);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198259h, "onAcceptLiveMic info:" + info);
    }

    @Override // mk2.a
    /* renamed from: onAcceptMicNewPkTimeout */
    public void mo57489xb7c88e46(java.lang.String str) {
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        qf2.v0 v0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198259h, "accept new pk mic timeout, will auto cancel. curLinkUser:" + ((mm2.o4) m57635xbba4bfc0(mm2.o4.class)).l7() + ", userName: " + str);
        sm2.o4 m129723x1ce28c0f = m129723x1ce28c0f();
        fm2.a aVar = m129723x1ce28c0f.f101128c;
        if (aVar == null || (m57663xfb7e5820 = aVar.m57663xfb7e5820()) == null || (c14197x319b1b9e = m57663xfb7e5820.f390664f) == null || (v0Var = (qf2.v0) c14197x319b1b9e.m56798x25fe639c(qf2.v0.class)) == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        qf2.v0.e7(v0Var, str, false, false, new sm2.a3(m129723x1ce28c0f), 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        r1 = r3.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        if (r3.m() == true) goto L20;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, mk2.a
    /* renamed from: onAcceptMicTimeout */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo57714xbd168c41(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = r10.f198259h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "accept mic timeout, will auto cancel. curLinkUser:"
            r1.<init>(r2)
            java.lang.Class<mm2.o4> r2 = mm2.o4.class
            androidx.lifecycle.c1 r2 = r10.m57635xbba4bfc0(r2)
            mm2.o4 r2 = (mm2.o4) r2
            km2.q r2 = r2.l7()
            r1.append(r2)
            java.lang.String r2 = " micId:"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            sm2.o4 r2 = r10.m129723x1ce28c0f()
            java.lang.Class<mm2.o4> r0 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r2.c(r0)
            mm2.o4 r0 = (mm2.o4) r0
            java.util.Map r0 = r0.f410861w
            java.lang.String r1 = "<get-audienceLinkMicUserTempMap>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            monitor-enter(r0)
            java.util.Set r1 = r0.entrySet()     // Catch: java.lang.Throwable -> Lb0
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb0
        L43:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto L63
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lb0
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Throwable -> Lb0
            km2.q r4 = (km2.q) r4     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r4 = r4.f390708f     // Catch: java.lang.Throwable -> Lb0
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r4, r11)     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L43
            java.lang.Object r1 = r3.getValue()     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r0)
            goto L65
        L63:
            monitor-exit(r0)
            r1 = 0
        L65:
            r3 = r1
            km2.q r3 = (km2.q) r3
            java.lang.String r0 = r2.f491143f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "onAcceptMicTimeout micId: "
            r1.<init>(r4)
            r1.append(r11)
            java.lang.String r11 = " micUser: "
            r1.append(r11)
            r1.append(r3)
            java.lang.String r11 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r11)
            r11 = 0
            if (r3 == 0) goto L8e
            boolean r0 = r3.m()
            r1 = 1
            if (r0 != r1) goto L8e
            goto L8f
        L8e:
            r1 = r11
        L8f:
            if (r1 == 0) goto Laf
            androidx.appcompat.app.AppCompatActivity r0 = r2.f101127b
            r1 = 2131764206(0x7f1023ee, float:1.9159539E38)
            java.lang.String r1 = r0.getString(r1)
            android.widget.Toast r11 = db5.t7.m123883x26a183b(r0, r1, r11)
            r11.show()
            r4 = 3
            r5 = 0
            r6 = 0
            sm2.b3 r7 = new sm2.b3
            r7.<init>(r2)
            r8 = 12
            r9 = 0
            sm2.o4.H(r2, r3, r4, r5, r6, r7, r8, r9)
        Laf:
            return
        Lb0:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1.mo57714xbd168c41(java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a
    /* renamed from: onActivityResult */
    public void mo46548x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo46548x9d4787cb(i17, i18, intent);
        if (i17 == 1005) {
            if (i18 == -1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.k5 k5Var = ml2.j0.f409116i.T;
                if (intent == null) {
                    k5Var.f409200n++;
                    return;
                }
                k5Var.getClass();
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
                if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                    k5Var.f409200n++;
                    return;
                } else {
                    k5Var.f409200n += stringArrayListExtra.size();
                    return;
                }
            }
            return;
        }
        if (i17 == 1006) {
            if (i18 == -1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.j0.f409116i.T.f409199m++;
                return;
            }
            return;
        }
        if (i17 != 1012) {
            if (i17 == 1013 && i18 == 1000) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("ACTIVITY_RESULT_REMOVE_NOTICE_KEY") : null;
                qo0.b bVar = qo0.b.I2;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("KEY_FINDER_NOTICE_DELED_ID", stringExtra);
                mo46557x60d69242(bVar, bundle);
                return;
            }
            return;
        }
        if (i18 == -1) {
            qo0.b bVar2 = qo0.b.I2;
            android.os.Bundle bundle2 = new android.os.Bundle();
            byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO") : null;
            r45.a52 a52Var = new r45.a52();
            a52Var.set(0, 1);
            a52Var.set(1, 1);
            a52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(byteArrayExtra));
            bundle2.putByteArray("KEY_FINDER_NOTICE_ITEM", a52Var.mo14344x5f01b1f6());
            mo46557x60d69242(bVar2, bundle2);
            qo0.c.a(this, qo0.b.H2, null, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, mk2.a
    /* renamed from: onApplyBattleTimeout */
    public void mo57717x8a90b4fa() {
        sm2.o4 m129723x1ce28c0f = m129723x1ce28c0f();
        fm2.a aVar = m129723x1ce28c0f.f101128c;
        if (aVar != null) {
            qo0.c.a(aVar, qo0.b.f446979z4, null, 2, null);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.G;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.k1 k1Var = ml2.k1.f409171e;
        jSONObject.putOpt("type", 6);
        dk2.u4 u4Var = ((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).Z;
        jSONObject.putOpt("result", u4Var != null ? u4Var.f315687a : null);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
    }

    @Override // mk2.a
    /* renamed from: onApplyMicNewPkTimeout */
    public void mo57490x8f4f103e(java.lang.String str) {
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        qf2.v0 v0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198259h, "apply new pk mic timeout, will auto cancel. curLinkUser:" + ((mm2.o4) m57635xbba4bfc0(mm2.o4.class)).l7() + ", userName: " + str);
        fm2.a aVar = m129723x1ce28c0f().f101128c;
        if (aVar == null || (m57663xfb7e5820 = aVar.m57663xfb7e5820()) == null || (c14197x319b1b9e = m57663xfb7e5820.f390664f) == null || (v0Var = (qf2.v0) c14197x319b1b9e.m56798x25fe639c(qf2.v0.class)) == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        qf2.v0.e7(v0Var, str, false, false, null, 14, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a
    /* renamed from: onBackPress */
    public boolean mo46549x4ceae47d() {
        org.json.JSONObject jSONObject;
        boolean mo46549x4ceae47d = super.mo46549x4ceae47d();
        if (!mo46549x4ceae47d) {
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) m57635xbba4bfc0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198580h;
            long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) m57635xbba4bfc0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198581i;
            if (i17 == 0 || j17 == 0) {
                jSONObject = null;
            } else {
                jSONObject = new org.json.JSONObject();
                jSONObject.put("entrance_type", i17);
                jSONObject.put("entrance_id", j17);
                mm2.g1 g1Var = (mm2.g1) m57635xbba4bfc0(mm2.g1.class);
                java.lang.Integer num = g1Var.f410615w;
                java.lang.Long l17 = g1Var.f410616x;
                java.lang.String str = g1Var.f410617y;
                if (num != null && l17 != null && str != null) {
                    long longValue = l17.longValue();
                    jSONObject.put("strategy_id", num.intValue());
                    jSONObject.put("guide_live_id", longValue);
                    jSONObject.put("guide_finderusername", str);
                }
            }
            if (jSONObject != null) {
                jSONObject.put("display_mode", ((r45.aa0) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.e1) m57635xbba4bfc0(mm2.e1.class)).E).mo144003x754a37bb()).f451401d);
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 13L, jSONObject != null ? jSONObject.toString() : null, null, 4, null);
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            j0Var.nj(ml2.j0.f409116i.f409818J);
        }
        return mo46549x4ceae47d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r1.g() == true) goto L13;
     */
    @Override // no0.g
    /* renamed from: onBattleApply */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo57492xee3c7e37() {
        /*
            r5 = this;
            sm2.o4 r0 = r5.m129723x1ce28c0f()
            fm2.a r1 = r0.f101128c
            if (r1 == 0) goto Lf
            qo0.b r2 = qo0.b.f446950t4
            r3 = 2
            r4 = 0
            qo0.c.a(r1, r2, r4, r3, r4)
        Lf:
            com.tencent.mm.plugin.finder.live.plugin.x7 r0 = r0.M
            if (r0 == 0) goto L33
            java.lang.Class<mm2.o4> r1 = mm2.o4.class
            androidx.lifecycle.c1 r1 = r0.P0(r1)
            mm2.o4 r1 = (mm2.o4) r1
            dk2.u4 r1 = r1.Z
            if (r1 == 0) goto L27
            boolean r1 = r1.g()
            r2 = 1
            if (r1 != r2) goto L27
            goto L28
        L27:
            r2 = 0
        L28:
            if (r2 == 0) goto L33
            int r1 = r0.w0()
            if (r1 != 0) goto L33
            r0.C1()
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1.mo57492xee3c7e37():void");
    }

    @Override // no0.g
    /* renamed from: onBattleClose */
    public void mo57493xee56d8c1() {
        fm2.a aVar = m129723x1ce28c0f().f101128c;
        if (aVar != null) {
            qo0.c.a(aVar, qo0.b.f446962w4, null, 2, null);
        }
    }

    @Override // no0.g
    /* renamed from: onBattleDismiss */
    public void mo57494xe4011f13() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar = m129723x1ce28c0f().W;
        if (naVar != null) {
            naVar.B1();
        }
    }

    @Override // no0.g
    /* renamed from: onBattleEnd */
    public void mo57495xe114a1e4() {
        sm2.o4 m129723x1ce28c0f = m129723x1ce28c0f();
        fm2.a aVar = m129723x1ce28c0f.f101128c;
        if (aVar != null) {
            qo0.c.a(aVar, qo0.b.f446958v4, null, 2, null);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.G;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.k1 k1Var = ml2.k1.f409171e;
        jSONObject.putOpt("type", 7);
        dk2.u4 u4Var = ((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).Z;
        jSONObject.putOpt("result", u4Var != null ? u4Var.f315687a : null);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
    }

    @Override // no0.g
    /* renamed from: onBattleStart */
    public void mo57496xef3bbf2b() {
        sm2.o4 m129723x1ce28c0f = m129723x1ce28c0f();
        m129723x1ce28c0f.getClass();
        mk2.h hVar = mk2.h.f408666a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LinkMicTimeoutTimer", "stopApplyBattleTimer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(mk2.h.f408671f);
        fm2.a aVar = m129723x1ce28c0f.f101128c;
        if (aVar != null) {
            qo0.c.a(aVar, qo0.b.f446954u4, null, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (pm0.v.F(r1) == false) goto L24;
     */
    @Override // com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a
    /* renamed from: onCallStateChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo46550x22910660(int r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1.mo46550x22910660(int, java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, no0.g
    /* renamed from: onCloseLiveMic */
    public void mo57497x3011e422(no0.f info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        sm2.o4 m129723x1ce28c0f = m129723x1ce28c0f();
        m129723x1ce28c0f.getClass();
        km2.q l76 = ((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).l7();
        java.lang.String str = m129723x1ce28c0f.f491143f;
        if (l76 == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(l76.f390708f, info.f420250c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "close mic. info:" + info + " liveData.business(LiveCommonSlice::class.java).audienceLinkMicUserList:" + ((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).f410860v);
            java.util.List list = ((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            pm0.v.G(list, new sm2.e3(info));
            java.util.List list2 = ((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).f410868z;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-linkMicUserInfoList>(...)");
            pm0.v.G(list2, new sm2.f3(info));
            fm2.a aVar = m129723x1ce28c0f.f101128c;
            if (aVar != null) {
                in0.q qVar = m129723x1ce28c0f.f101130e;
                cl0.g gVar = qVar != null ? qVar.T1 : null;
                org.json.JSONObject J2 = qVar != null ? qVar.J() : null;
                in0.q qVar2 = m129723x1ce28c0f.f101130e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57628x9aa6f4f1(aVar, gVar, J2, qVar2 != null ? qVar2.W0() : null, false, null, 24, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = m129723x1ce28c0f.N;
            if (c4Var != null) {
                c4Var.E1();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "close mic pk. curLinkUser:" + l76);
            if (l76.f390710h) {
                java.util.List list3 = ((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).f410857s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list3);
                kz5.h0.C(list3);
                zn0.x.f555947a.i(null);
                ((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).X6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "notifyUIAfterCloseLinkPk audienceLinkMicUserList=" + ((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).f410860v);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).f410860v, "<get-audienceLinkMicUserList>(...)");
                if (!r1.isEmpty()) {
                    fm2.a aVar2 = m129723x1ce28c0f.f101128c;
                    if (aVar2 != null) {
                        aVar2.m57752xd058acff(null);
                    }
                    fm2.a aVar3 = m129723x1ce28c0f.f101128c;
                    if (aVar3 != null) {
                        in0.q qVar3 = m129723x1ce28c0f.f101130e;
                        cl0.g gVar2 = qVar3 != null ? qVar3.T1 : null;
                        org.json.JSONObject J3 = qVar3 != null ? qVar3.J() : null;
                        in0.q qVar4 = m129723x1ce28c0f.f101130e;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57628x9aa6f4f1(aVar3, gVar2, J3, qVar4 != null ? qVar4.W0() : null, false, null, 24, null);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var2 = m129723x1ce28c0f.N;
                if (c4Var2 != null) {
                    c4Var2.E1();
                }
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f409365s, "", -1, -1);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.z4 z4Var = ml2.z4.G;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                ml2.k1 k1Var = ml2.k1.f409171e;
                jSONObject.putOpt("type", 8);
                jSONObject.putOpt("result", 0);
                zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198259h, "onCloseLiveMic info:" + info);
    }

    @Override // no0.g
    /* renamed from: onCloseLiveMicNotify */
    public void mo57498xbe17460b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar = m129723x1ce28c0f().W;
        if (naVar != null) {
            naVar.v1();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: onLiveEventCallback */
    public void mo57499x5609e754(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198259h, "sdk callback errorCode:" + i17);
        m129723x1ce28c0f().F(i17, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, mk2.a
    /* renamed from: onRandomMatchTimeout */
    public void mo57729xe407507e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198259h, "random match mic timeout, will auto cancel. curLinkState:" + ((mm2.o4) m57635xbba4bfc0(mm2.o4.class)).D);
        sm2.o4 m129723x1ce28c0f = m129723x1ce28c0f();
        if (((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).D) {
            m129723x1ce28c0f.q(new sm2.v3(m129723x1ce28c0f));
        }
    }

    @Override // no0.g
    /* renamed from: onRandomMicAccept */
    public void mo57501x714c6ccd(r45.ch1 appMsg, r45.ij1 info) {
        r45.xn1 xn1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appMsg, "appMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198259h, "onRandomNewMicAccept info:" + info);
        sm2.o4 m129723x1ce28c0f = m129723x1ce28c0f();
        m129723x1ce28c0f.getClass();
        r45.yt4 yt4Var = (r45.yt4) info.m75936x14adae67(0);
        if (yt4Var == null || (xn1Var = (r45.xn1) yt4Var.m75936x14adae67(0)) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRandomMicAccept: new accept anchor link mic pk. nickName: ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
        sb6.append(c19782x23db1cfa != null ? c19782x23db1cfa.m76184x8010e5e4() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m129723x1ce28c0f.f491143f, sb6.toString());
        ((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).R7(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 v70Var = m129723x1ce28c0f.L;
        if (v70Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
            v70Var.y1(c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76175x6d346f39() : null);
        }
        mk2.h.f408666a.f();
        pm0.v.V(4000L, new sm2.w3(m129723x1ce28c0f, xn1Var));
    }

    @Override // no0.g
    /* renamed from: onRandomMicApply */
    public void mo57502x45be3f09(r45.kj1 info) {
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        qf2.v0 v0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        sm2.o4 m129723x1ce28c0f = m129723x1ce28c0f();
        m129723x1ce28c0f.getClass();
        r45.xn1 xn1Var = (r45.xn1) info.m75936x14adae67(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRandomMicApply: apply anchor link mic pk. toContact.username:");
        sb6.append((xn1Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c());
        sb6.append(", toContact.nickname:");
        sb6.append((xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76184x8010e5e4());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m129723x1ce28c0f.f491143f, sb6.toString());
        if (xn1Var != null) {
            ((mm2.o4) m129723x1ce28c0f.c(mm2.o4.class)).R7(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 v70Var = m129723x1ce28c0f.L;
            if (v70Var != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                v70Var.y1(c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76175x6d346f39() : null);
            }
            mk2.h.f408666a.f();
            fm2.a aVar = m129723x1ce28c0f.f101128c;
            if (aVar == null || (m57663xfb7e5820 = aVar.m57663xfb7e5820()) == null || (c14197x319b1b9e = m57663xfb7e5820.f390664f) == null || (v0Var = (qf2.v0) c14197x319b1b9e.m56798x25fe639c(qf2.v0.class)) == null) {
                return;
            }
            qf2.v0.c7(v0Var, xn1Var, info, 1, null, null, null, 56, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198259h, "onSceneEnd errType:" + i17 + ", errCode:" + i18 + ", scene:" + m1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0
    /* renamed from: release */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo57508x41012807() {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1.mo57508x41012807():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a
    /* renamed from: resume */
    public void mo46554xc84dc82d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var;
        super.mo46554xc84dc82d();
        sm2.o4 m129723x1ce28c0f = m129723x1ce28c0f();
        ((we2.w) m129723x1ce28c0f.c(we2.w.class)).N6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6 c6Var = m129723x1ce28c0f.f491142e0;
        if (c6Var != null) {
            c6Var.m56914x57429eec();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = m129723x1ce28c0f.f491169v;
        if (r60Var == null || (ep0Var = r60Var.f195633u) == null) {
            return;
        }
        ep0Var.mo56919x57429eec();
    }

    /* renamed from: setTAG */
    public final void m57822xca0293d8(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f198259h = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a
    /* renamed from: start */
    public void mo46556x68ac462() {
        super.mo46556x68ac462();
        sm2.o4 m129723x1ce28c0f = m129723x1ce28c0f();
        m129723x1ce28c0f.f491156l0 = ((mm2.c1) m129723x1ce28c0f.c(mm2.c1.class)).f410458z2;
        m129723x1ce28c0f.O(false);
        if (((mm2.c1) m129723x1ce28c0f.c(mm2.c1.class)).a8()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = m129723x1ce28c0f.f491154k0;
            b4Var.d();
            b4Var.c(1000L, 1000L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r3 != 122) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a, qo0.c
    /* renamed from: statusChange */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo46557x60d69242(qo0.b r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1.mo46557x60d69242(qo0.b, android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a
    /* renamed from: stop */
    public void mo46558x360802() {
        super.mo46558x360802();
        m129723x1ce28c0f().t();
    }
}
