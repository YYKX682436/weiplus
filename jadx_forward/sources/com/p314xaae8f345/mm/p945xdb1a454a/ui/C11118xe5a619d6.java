package com.p314xaae8f345.mm.p945xdb1a454a.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/modelbiz/ui/BizProfileCardFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "v01/a", "plugin-biz_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.modelbiz.ui.BizProfileCardFragment */
/* loaded from: classes11.dex */
public final class C11118xe5a619d6 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f152398q = 0;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b f152399n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f152400o;

    /* renamed from: p, reason: collision with root package name */
    public em.e f152401p;

    public C11118xe5a619d6(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar, boolean z17) {
        this.f152399n = bVar;
        this.f152400o = z17;
    }

    public static final void r0(com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 c11118xe5a619d6, tk.u uVar) {
        android.content.Context mo7438x76847179 = c11118xe5a619d6.mo7438x76847179();
        if (mo7438x76847179 == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("draftScene", "personalCenter");
        jSONObject.put("publishScene", "mineTab");
        tk.u uVar2 = tk.u.f501405f;
        int i17 = uVar == uVar2 ? 2 : uVar == tk.u.f501406g ? 1 : 0;
        java.lang.String str = (uVar == uVar2 || uVar == tk.u.f501407h) ? "3" : "2";
        jSONObject.put("mpPublishAction", uVar.f501410d);
        jSONObject.put("draftType", i17);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1396);
        jSONObject2.put("sceneNote", str);
        jSONObject.put("weAppParam", jSONObject2);
        ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Ai(mo7438x76847179, jSONObject, new v01.k(c11118xe5a619d6));
    }

    public static final void s0(com.p314xaae8f345.mm.p945xdb1a454a.ui.C11118xe5a619d6 c11118xe5a619d6, boolean z17) {
        if (c11118xe5a619d6.u0() || c11118xe5a619d6.t0()) {
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = c11118xe5a619d6.f152399n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
        if (bVar.f299428n == 0) {
            em.e eVar = c11118xe5a619d6.f152401p;
            if (eVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (eVar.f335793p == null) {
                eVar.f335793p = (android.widget.TextView) eVar.f335778a.findViewById(com.p314xaae8f345.mm.R.id.sim);
            }
            eVar.f335793p.setVisibility(z17 ? 0 : 8);
            em.e eVar2 = c11118xe5a619d6.f152401p;
            if (eVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (eVar2.f335784g == null) {
                eVar2.f335784g = (android.widget.ImageView) eVar2.f335778a.findViewById(com.p314xaae8f345.mm.R.id.sin);
            }
            eVar2.f335784g.setVisibility(z17 ? 0 : 8);
            return;
        }
        em.e eVar3 = c11118xe5a619d6.f152401p;
        if (eVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (eVar3.f335793p == null) {
            eVar3.f335793p = (android.widget.TextView) eVar3.f335778a.findViewById(com.p314xaae8f345.mm.R.id.sim);
        }
        eVar3.f335793p.setVisibility(8);
        em.e eVar4 = c11118xe5a619d6.f152401p;
        if (eVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (eVar4.f335784g == null) {
            eVar4.f335784g = (android.widget.ImageView) eVar4.f335778a.findViewById(com.p314xaae8f345.mm.R.id.sin);
        }
        eVar4.f335784g.setVisibility(8);
    }

    public final void A0() {
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f501403d;
        ((ox.r) d0Var).Bi(1).a(true, new v01.m(this));
    }

    public final void B0() {
        em.e eVar = this.f152401p;
        if (eVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (eVar.f335789l == null) {
            eVar.f335789l = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) eVar.f335778a.findViewById(com.p314xaae8f345.mm.R.id.sjc);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = eVar.f335789l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22646x1e9ca55, "getBizProfileCard(...)");
        w0(c22646x1e9ca55, "my_biz_account");
        em.e eVar2 = this.f152401p;
        if (eVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        android.widget.RelativeLayout f17 = eVar2.f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getSinglePublishImageBtn(...)");
        w0(f17, "post_image_text");
        em.e eVar3 = this.f152401p;
        if (eVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        android.widget.RelativeLayout d17 = eVar3.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getPublishImageBtn(...)");
        w0(d17, "post_image_text");
        em.e eVar4 = this.f152401p;
        if (eVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        android.widget.RelativeLayout h17 = eVar4.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getWriteArticleBtn(...)");
        w0(h17, "write_article");
        if (!t0()) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = this.f152399n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
            if (bVar.f299428n == 0) {
                x0(bVar);
                em.e eVar5 = this.f152401p;
                if (eVar5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                    throw null;
                }
                eVar5.a().setOnClickListener(new v01.c(this, bVar));
                y0();
                com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0.f299291c.g(new v01.q(this));
            } else {
                x0(bVar);
                y0();
                em.e eVar6 = this.f152401p;
                if (eVar6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                    throw null;
                }
                eVar6.a().setOnClickListener(new v01.b(this));
                em.e eVar7 = this.f152401p;
                if (eVar7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                    throw null;
                }
                if (eVar7.f335788k == null) {
                    eVar7.f335788k = (android.widget.LinearLayout) eVar7.f335778a.findViewById(com.p314xaae8f345.mm.R.id.f567895ur4);
                }
                eVar7.f335788k.setVisibility(8);
            }
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            ((ox.r) d0Var).Bi(1).e(new v01.s(this));
            return;
        }
        em.e eVar8 = this.f152401p;
        if (eVar8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        eVar8.a().setVisibility(8);
        em.e eVar9 = this.f152401p;
        if (eVar9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        eVar9.g().setVisibility(8);
        em.e eVar10 = this.f152401p;
        if (eVar10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (eVar10.f335786i == null) {
            eVar10.f335786i = eVar10.f335778a.findViewById(com.p314xaae8f345.mm.R.id.u_e);
        }
        android.view.View view = eVar10.f335786i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "initNoAccountView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "initNoAccountView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((t01.m) ((rm.c0) i95.n0.c(rm.c0.class))).getClass();
        boolean i17 = t01.i.a(t01.m.f495932d).i(t01.m.f495934f, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "getCurrentNoticeInfoRedDot: " + i17);
        z0(i17 && t0());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dzw;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        yj0.a.a("com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        yj0.a.h(this, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f501403d;
        ((ox.r) d0Var).Bi(1).j("BizFailedRedDotEventKey");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileCardFragment", "onResume");
        super.mo7517x57429eec();
        A0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        this.f152401p = new em.e(view);
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f501403d;
        ((ox.r) d0Var).Bi(1).h("BizFailedRedDotEventKey", new v01.o(this));
        B0();
        A0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        yj0.a.a("com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public final boolean t0() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = this.f152399n;
        if (bVar == null) {
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar != null ? bVar.f299422e : null)) {
            return true;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar2 = this.f152399n;
        return bVar2 != null && !bVar2.f299427m;
    }

    public final boolean u0() {
        if (!m7481x7a6e8df6() || m7482xefa32bc()) {
            return true;
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        return mo7430x19263085 != null && mo7430x19263085.isFinishing();
    }

    public final void w0(android.view.View view, java.lang.String str) {
        java.util.Map c17;
        int i17 = t0() ? 3 : this.f152400o ? 2 : 1;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, str);
        aVar.Tj(view, 40, 1, false);
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        android.content.Context mo7438x76847179 = mo7438x76847179();
        ((c61.l7) b6Var).getClass();
        if (mo7438x76847179 == null) {
            c17 = new java.util.LinkedHashMap();
        } else {
            c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.c(mo7438x76847179);
            c17.put("finder_username", xy2.c.e(mo7438x76847179));
        }
        c17.put("page_account_type", java.lang.Integer.valueOf(i17));
        c17.put("bizuin", ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Ai());
        aVar.gk(view, c17);
    }

    public final void x0(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar) {
        em.e eVar = this.f152401p;
        if (eVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (eVar.f335786i == null) {
            eVar.f335786i = eVar.f335778a.findViewById(com.p314xaae8f345.mm.R.id.u_e);
        }
        android.view.View view = eVar.f335786i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "initBizRole", "(Lcom/tencent/wechat/mm/biz/AcctResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "initBizRole", "(Lcom/tencent/wechat/mm/biz/AcctResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        em.e eVar2 = this.f152401p;
        if (eVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        eVar2.a().setVisibility(0);
        if (this.f152400o) {
            em.e eVar3 = this.f152401p;
            if (eVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (eVar3.f335781d == null) {
                eVar3.f335781d = (android.widget.TextView) eVar3.f335778a.findViewById(com.p314xaae8f345.mm.R.id.f564957as2);
            }
            eVar3.f335781d.setVisibility(8);
            em.e eVar4 = this.f152401p;
            if (eVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (eVar4.f335789l == null) {
                eVar4.f335789l = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) eVar4.f335778a.findViewById(com.p314xaae8f345.mm.R.id.sjc);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = eVar4.f335789l;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22646x1e9ca55, "getBizProfileCard(...)");
            com.p314xaae8f345.mm.ui.kk.f(c22646x1e9ca55, 0);
        }
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        fVar.f545620k = true;
        yo0.i a17 = fVar.a();
        vo0.a aVar = vo0.e.f520001b;
        java.lang.String headimgurl = bVar.f299425h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(headimgurl, "headimgurl");
        em.e eVar5 = this.f152401p;
        if (eVar5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (eVar5.f335791n == null) {
            eVar5.f335791n = (android.widget.ImageView) eVar5.f335778a.findViewById(com.p314xaae8f345.mm.R.id.sie);
        }
        android.widget.ImageView imageView = eVar5.f335791n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getBizAvatarIv(...)");
        aVar.c(headimgurl, imageView, a17);
        em.e eVar6 = this.f152401p;
        if (eVar6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (eVar6.f335794q == null) {
            eVar6.f335794q = (android.widget.TextView) eVar6.f335778a.findViewById(com.p314xaae8f345.mm.R.id.f564929sj1);
        }
        com.p314xaae8f345.mm.ui.bk.r0(eVar6.f335794q.getPaint(), 0.8f);
        em.e eVar7 = this.f152401p;
        if (eVar7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (eVar7.f335794q == null) {
            eVar7.f335794q = (android.widget.TextView) eVar7.f335778a.findViewById(com.p314xaae8f345.mm.R.id.f564929sj1);
        }
        eVar7.f335794q.setText(bVar.f299424g);
        if ((bVar.f299431q & 512) != 0) {
            em.e eVar8 = this.f152401p;
            if (eVar8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            eVar8.c().setVisibility(0);
            em.e eVar9 = this.f152401p;
            if (eVar9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            eVar9.c().setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6t);
        } else {
            em.e eVar10 = this.f152401p;
            if (eVar10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            eVar10.c().setVisibility(8);
        }
        int i17 = bVar.f299428n;
        if (i17 == 0) {
            em.e eVar11 = this.f152401p;
            if (eVar11 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            android.widget.TextView b17 = eVar11.b();
            android.content.Context mo7438x76847179 = mo7438x76847179();
            b17.setText(mo7438x76847179 != null ? mo7438x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nf7, java.lang.Integer.valueOf(bVar.f299426i.f299384d)) : null);
            return;
        }
        em.e eVar12 = this.f152401p;
        if (eVar12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        android.widget.TextView b18 = eVar12.b();
        android.content.Context mo7438x768471792 = mo7438x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x768471792);
        b18.setTextColor(mo7438x768471792.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        if (i17 == 1) {
            em.e eVar13 = this.f152401p;
            if (eVar13 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            android.widget.TextView b19 = eVar13.b();
            android.content.Context mo7438x768471793 = mo7438x76847179();
            b19.setText(mo7438x768471793 != null ? mo7438x768471793.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ngc) : null);
            return;
        }
        if (i17 == 2) {
            em.e eVar14 = this.f152401p;
            if (eVar14 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            android.widget.TextView b27 = eVar14.b();
            android.content.Context mo7438x768471794 = mo7438x76847179();
            b27.setText(mo7438x768471794 != null ? mo7438x768471794.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nga) : null);
            return;
        }
        if (i17 != 3) {
            return;
        }
        em.e eVar15 = this.f152401p;
        if (eVar15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        android.widget.TextView b28 = eVar15.b();
        android.content.Context mo7438x768471795 = mo7438x76847179();
        b28.setText(mo7438x768471795 != null ? mo7438x768471795.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ngb) : null);
    }

    public final void y0() {
        if (mo7438x76847179() == null) {
            return;
        }
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("MpMyTabAuthorProfile");
        r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
        r45.f03 I0 = nk6.I0("MpMyTabAuthorProfile");
        if (vs2Var == null || I0 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(I0.f455422f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileCardFragment", "initRedDot, hide red dot");
            em.e eVar = this.f152401p;
            if (eVar != null) {
                eVar.g().setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileCardFragment", "initRedDot, title: " + I0.f455422f);
        java.lang.String str = I0.f455422f;
        if (str != null) {
            em.e eVar2 = this.f152401p;
            if (eVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            android.widget.RelativeLayout g17 = eVar2.g();
            g17.setVisibility(0);
            g17.setOnClickListener(new v01.h(vs2Var, g17, this));
            em.e eVar3 = this.f152401p;
            if (eVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (eVar3.f335798u == null) {
                eVar3.f335798u = (android.widget.TextView) eVar3.f335778a.findViewById(com.p314xaae8f345.mm.R.id.vc7);
            }
            eVar3.f335798u.setText(str);
        }
    }

    public final void z0(boolean z17) {
        if (mo7438x76847179() == null) {
            return;
        }
        em.e eVar = this.f152401p;
        if (eVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (eVar.f335779b == null) {
            eVar.f335779b = (android.widget.TextView) eVar.f335778a.findViewById(com.p314xaae8f345.mm.R.id.v6n);
        }
        com.p314xaae8f345.mm.ui.bk.r0(eVar.f335779b.getPaint(), 0.8f);
        em.e eVar2 = this.f152401p;
        if (eVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        eVar2.d().setVisibility(8);
        em.e eVar3 = this.f152401p;
        if (eVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        eVar3.h().setVisibility(8);
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
            em.e eVar4 = this.f152401p;
            if (eVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (eVar4.f335779b == null) {
                eVar4.f335779b = (android.widget.TextView) eVar4.f335778a.findViewById(com.p314xaae8f345.mm.R.id.v6n);
            }
            android.widget.TextView textView = eVar4.f335779b;
            android.content.Context mo7438x76847179 = mo7438x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x76847179);
            textView.setText(mo7438x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572759nh1));
        }
        em.e eVar5 = this.f152401p;
        if (eVar5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        android.widget.RelativeLayout f17 = eVar5.f();
        f17.setVisibility(0);
        f17.setOnClickListener(new v01.i(this));
        em.e eVar6 = this.f152401p;
        if (eVar6 != null) {
            eVar6.e().setVisibility(z17 ? 0 : 4);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
    }
}
