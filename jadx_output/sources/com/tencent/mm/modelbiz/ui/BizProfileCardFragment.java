package com.tencent.mm.modelbiz.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/modelbiz/ui/BizProfileCardFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "v01/a", "plugin-biz_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizProfileCardFragment extends com.tencent.mm.ui.component.UIComponentFragment {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f70865q = 0;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.b f70866n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f70867o;

    /* renamed from: p, reason: collision with root package name */
    public em.e f70868p;

    public BizProfileCardFragment(com.tencent.wechat.mm.biz.b bVar, boolean z17) {
        this.f70866n = bVar;
        this.f70867o = z17;
    }

    public static final void r0(com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment, tk.u uVar) {
        android.content.Context context = bizProfileCardFragment.getContext();
        if (context == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("draftScene", "personalCenter");
        jSONObject.put("publishScene", "mineTab");
        tk.u uVar2 = tk.u.f419872f;
        int i17 = uVar == uVar2 ? 2 : uVar == tk.u.f419873g ? 1 : 0;
        java.lang.String str = (uVar == uVar2 || uVar == tk.u.f419874h) ? "3" : "2";
        jSONObject.put("mpPublishAction", uVar.f419877d);
        jSONObject.put("draftType", i17);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1396);
        jSONObject2.put("sceneNote", str);
        jSONObject.put("weAppParam", jSONObject2);
        ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Ai(context, jSONObject, new v01.k(bizProfileCardFragment));
    }

    public static final void s0(com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment, boolean z17) {
        if (bizProfileCardFragment.u0() || bizProfileCardFragment.t0()) {
            return;
        }
        com.tencent.wechat.mm.biz.b bVar = bizProfileCardFragment.f70866n;
        kotlin.jvm.internal.o.d(bVar);
        if (bVar.f217895n == 0) {
            em.e eVar = bizProfileCardFragment.f70868p;
            if (eVar == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            if (eVar.f254260p == null) {
                eVar.f254260p = (android.widget.TextView) eVar.f254245a.findViewById(com.tencent.mm.R.id.sim);
            }
            eVar.f254260p.setVisibility(z17 ? 0 : 8);
            em.e eVar2 = bizProfileCardFragment.f70868p;
            if (eVar2 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            if (eVar2.f254251g == null) {
                eVar2.f254251g = (android.widget.ImageView) eVar2.f254245a.findViewById(com.tencent.mm.R.id.sin);
            }
            eVar2.f254251g.setVisibility(z17 ? 0 : 8);
            return;
        }
        em.e eVar3 = bizProfileCardFragment.f70868p;
        if (eVar3 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (eVar3.f254260p == null) {
            eVar3.f254260p = (android.widget.TextView) eVar3.f254245a.findViewById(com.tencent.mm.R.id.sim);
        }
        eVar3.f254260p.setVisibility(8);
        em.e eVar4 = bizProfileCardFragment.f70868p;
        if (eVar4 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (eVar4.f254251g == null) {
            eVar4.f254251g = (android.widget.ImageView) eVar4.f254245a.findViewById(com.tencent.mm.R.id.sin);
        }
        eVar4.f254251g.setVisibility(8);
    }

    public final void A0() {
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        ((ox.r) d0Var).Bi(1).a(true, new v01.m(this));
    }

    public final void B0() {
        em.e eVar = this.f70868p;
        if (eVar == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (eVar.f254256l == null) {
            eVar.f254256l = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) eVar.f254245a.findViewById(com.tencent.mm.R.id.sjc);
        }
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = eVar.f254256l;
        kotlin.jvm.internal.o.f(roundedCornerFrameLayout, "getBizProfileCard(...)");
        w0(roundedCornerFrameLayout, "my_biz_account");
        em.e eVar2 = this.f70868p;
        if (eVar2 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.widget.RelativeLayout f17 = eVar2.f();
        kotlin.jvm.internal.o.f(f17, "getSinglePublishImageBtn(...)");
        w0(f17, "post_image_text");
        em.e eVar3 = this.f70868p;
        if (eVar3 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.widget.RelativeLayout d17 = eVar3.d();
        kotlin.jvm.internal.o.f(d17, "getPublishImageBtn(...)");
        w0(d17, "post_image_text");
        em.e eVar4 = this.f70868p;
        if (eVar4 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.widget.RelativeLayout h17 = eVar4.h();
        kotlin.jvm.internal.o.f(h17, "getWriteArticleBtn(...)");
        w0(h17, "write_article");
        if (!t0()) {
            com.tencent.wechat.mm.biz.b bVar = this.f70866n;
            kotlin.jvm.internal.o.d(bVar);
            if (bVar.f217895n == 0) {
                x0(bVar);
                em.e eVar5 = this.f70868p;
                if (eVar5 == null) {
                    kotlin.jvm.internal.o.o("binding");
                    throw null;
                }
                eVar5.a().setOnClickListener(new v01.c(this, bVar));
                y0();
                com.tencent.wechat.iam.biz.l0.f217758c.g(new v01.q(this));
            } else {
                x0(bVar);
                y0();
                em.e eVar6 = this.f70868p;
                if (eVar6 == null) {
                    kotlin.jvm.internal.o.o("binding");
                    throw null;
                }
                eVar6.a().setOnClickListener(new v01.b(this));
                em.e eVar7 = this.f70868p;
                if (eVar7 == null) {
                    kotlin.jvm.internal.o.o("binding");
                    throw null;
                }
                if (eVar7.f254255k == null) {
                    eVar7.f254255k = (android.widget.LinearLayout) eVar7.f254245a.findViewById(com.tencent.mm.R.id.f486362ur4);
                }
                eVar7.f254255k.setVisibility(8);
            }
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            ((ox.r) d0Var).Bi(1).e(new v01.s(this));
            return;
        }
        em.e eVar8 = this.f70868p;
        if (eVar8 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        eVar8.a().setVisibility(8);
        em.e eVar9 = this.f70868p;
        if (eVar9 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        eVar9.g().setVisibility(8);
        em.e eVar10 = this.f70868p;
        if (eVar10 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (eVar10.f254253i == null) {
            eVar10.f254253i = eVar10.f254245a.findViewById(com.tencent.mm.R.id.u_e);
        }
        android.view.View view = eVar10.f254253i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "initNoAccountView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "initNoAccountView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((t01.m) ((rm.c0) i95.n0.c(rm.c0.class))).getClass();
        boolean i17 = t01.i.a(t01.m.f414399d).i(t01.m.f414401f, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "getCurrentNoticeInfoRedDot: " + i17);
        z0(i17 && t0());
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dzw;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return null;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        yj0.a.a("com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        yj0.a.h(this, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        ((ox.r) d0Var).Bi(1).j("BizFailedRedDotEventKey");
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileCardFragment", "onResume");
        super.onResume();
        A0();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f70868p = new em.e(view);
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        ((ox.r) d0Var).Bi(1).h("BizFailedRedDotEventKey", new v01.o(this));
        B0();
        A0();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        yj0.a.a("com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public final boolean t0() {
        com.tencent.wechat.mm.biz.b bVar = this.f70866n;
        if (bVar == null) {
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(bVar != null ? bVar.f217889e : null)) {
            return true;
        }
        com.tencent.wechat.mm.biz.b bVar2 = this.f70866n;
        return bVar2 != null && !bVar2.f217894m;
    }

    public final boolean u0() {
        if (!isAdded() || isDetached()) {
            return true;
        }
        androidx.fragment.app.FragmentActivity activity = getActivity();
        return activity != null && activity.isFinishing();
    }

    public final void w0(android.view.View view, java.lang.String str) {
        java.util.Map c17;
        int i17 = t0() ? 3 : this.f70867o ? 2 : 1;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, str);
        aVar.Tj(view, 40, 1, false);
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        android.content.Context context = getContext();
        ((c61.l7) b6Var).getClass();
        if (context == null) {
            c17 = new java.util.LinkedHashMap();
        } else {
            c17 = com.tencent.mm.plugin.finder.report.d2.f124994a.c(context);
            c17.put("finder_username", xy2.c.e(context));
        }
        c17.put("page_account_type", java.lang.Integer.valueOf(i17));
        c17.put("bizuin", ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Ai());
        aVar.gk(view, c17);
    }

    public final void x0(com.tencent.wechat.mm.biz.b bVar) {
        em.e eVar = this.f70868p;
        if (eVar == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (eVar.f254253i == null) {
            eVar.f254253i = eVar.f254245a.findViewById(com.tencent.mm.R.id.u_e);
        }
        android.view.View view = eVar.f254253i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "initBizRole", "(Lcom/tencent/wechat/mm/biz/AcctResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/modelbiz/ui/BizProfileCardFragment", "initBizRole", "(Lcom/tencent/wechat/mm/biz/AcctResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        em.e eVar2 = this.f70868p;
        if (eVar2 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        eVar2.a().setVisibility(0);
        if (this.f70867o) {
            em.e eVar3 = this.f70868p;
            if (eVar3 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            if (eVar3.f254248d == null) {
                eVar3.f254248d = (android.widget.TextView) eVar3.f254245a.findViewById(com.tencent.mm.R.id.f483424as2);
            }
            eVar3.f254248d.setVisibility(8);
            em.e eVar4 = this.f70868p;
            if (eVar4 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            if (eVar4.f254256l == null) {
                eVar4.f254256l = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) eVar4.f254245a.findViewById(com.tencent.mm.R.id.sjc);
            }
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = eVar4.f254256l;
            kotlin.jvm.internal.o.f(roundedCornerFrameLayout, "getBizProfileCard(...)");
            com.tencent.mm.ui.kk.f(roundedCornerFrameLayout, 0);
        }
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        fVar.f464087k = true;
        yo0.i a17 = fVar.a();
        vo0.a aVar = vo0.e.f438468b;
        java.lang.String headimgurl = bVar.f217892h;
        kotlin.jvm.internal.o.f(headimgurl, "headimgurl");
        em.e eVar5 = this.f70868p;
        if (eVar5 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (eVar5.f254258n == null) {
            eVar5.f254258n = (android.widget.ImageView) eVar5.f254245a.findViewById(com.tencent.mm.R.id.sie);
        }
        android.widget.ImageView imageView = eVar5.f254258n;
        kotlin.jvm.internal.o.f(imageView, "getBizAvatarIv(...)");
        aVar.c(headimgurl, imageView, a17);
        em.e eVar6 = this.f70868p;
        if (eVar6 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (eVar6.f254261q == null) {
            eVar6.f254261q = (android.widget.TextView) eVar6.f254245a.findViewById(com.tencent.mm.R.id.f483396sj1);
        }
        com.tencent.mm.ui.bk.r0(eVar6.f254261q.getPaint(), 0.8f);
        em.e eVar7 = this.f70868p;
        if (eVar7 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (eVar7.f254261q == null) {
            eVar7.f254261q = (android.widget.TextView) eVar7.f254245a.findViewById(com.tencent.mm.R.id.f483396sj1);
        }
        eVar7.f254261q.setText(bVar.f217891g);
        if ((bVar.f217898q & 512) != 0) {
            em.e eVar8 = this.f70868p;
            if (eVar8 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            eVar8.c().setVisibility(0);
            em.e eVar9 = this.f70868p;
            if (eVar9 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            eVar9.c().setImageResource(com.tencent.mm.R.drawable.c6t);
        } else {
            em.e eVar10 = this.f70868p;
            if (eVar10 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            eVar10.c().setVisibility(8);
        }
        int i17 = bVar.f217895n;
        if (i17 == 0) {
            em.e eVar11 = this.f70868p;
            if (eVar11 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            android.widget.TextView b17 = eVar11.b();
            android.content.Context context = getContext();
            b17.setText(context != null ? context.getString(com.tencent.mm.R.string.nf7, java.lang.Integer.valueOf(bVar.f217893i.f217851d)) : null);
            return;
        }
        em.e eVar12 = this.f70868p;
        if (eVar12 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.widget.TextView b18 = eVar12.b();
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.d(context2);
        b18.setTextColor(context2.getResources().getColor(com.tencent.mm.R.color.FG_2));
        if (i17 == 1) {
            em.e eVar13 = this.f70868p;
            if (eVar13 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            android.widget.TextView b19 = eVar13.b();
            android.content.Context context3 = getContext();
            b19.setText(context3 != null ? context3.getString(com.tencent.mm.R.string.ngc) : null);
            return;
        }
        if (i17 == 2) {
            em.e eVar14 = this.f70868p;
            if (eVar14 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            android.widget.TextView b27 = eVar14.b();
            android.content.Context context4 = getContext();
            b27.setText(context4 != null ? context4.getString(com.tencent.mm.R.string.nga) : null);
            return;
        }
        if (i17 != 3) {
            return;
        }
        em.e eVar15 = this.f70868p;
        if (eVar15 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.widget.TextView b28 = eVar15.b();
        android.content.Context context5 = getContext();
        b28.setText(context5 != null ? context5.getString(com.tencent.mm.R.string.ngb) : null);
    }

    public final void y0() {
        if (getContext() == null) {
            return;
        }
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("MpMyTabAuthorProfile");
        r45.vs2 vs2Var = L0 != null ? L0.field_ctrInfo : null;
        r45.f03 I0 = nk6.I0("MpMyTabAuthorProfile");
        if (vs2Var == null || I0 == null || com.tencent.mm.sdk.platformtools.t8.K0(I0.f373889f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileCardFragment", "initRedDot, hide red dot");
            em.e eVar = this.f70868p;
            if (eVar != null) {
                eVar.g().setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileCardFragment", "initRedDot, title: " + I0.f373889f);
        java.lang.String str = I0.f373889f;
        if (str != null) {
            em.e eVar2 = this.f70868p;
            if (eVar2 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            android.widget.RelativeLayout g17 = eVar2.g();
            g17.setVisibility(0);
            g17.setOnClickListener(new v01.h(vs2Var, g17, this));
            em.e eVar3 = this.f70868p;
            if (eVar3 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            if (eVar3.f254265u == null) {
                eVar3.f254265u = (android.widget.TextView) eVar3.f254245a.findViewById(com.tencent.mm.R.id.vc7);
            }
            eVar3.f254265u.setText(str);
        }
    }

    public final void z0(boolean z17) {
        if (getContext() == null) {
            return;
        }
        em.e eVar = this.f70868p;
        if (eVar == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (eVar.f254246b == null) {
            eVar.f254246b = (android.widget.TextView) eVar.f254245a.findViewById(com.tencent.mm.R.id.v6n);
        }
        com.tencent.mm.ui.bk.r0(eVar.f254246b.getPaint(), 0.8f);
        em.e eVar2 = this.f70868p;
        if (eVar2 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        eVar2.d().setVisibility(8);
        em.e eVar3 = this.f70868p;
        if (eVar3 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        eVar3.h().setVisibility(8);
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
            em.e eVar4 = this.f70868p;
            if (eVar4 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            if (eVar4.f254246b == null) {
                eVar4.f254246b = (android.widget.TextView) eVar4.f254245a.findViewById(com.tencent.mm.R.id.v6n);
            }
            android.widget.TextView textView = eVar4.f254246b;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.d(context);
            textView.setText(context.getString(com.tencent.mm.R.string.f491226nh1));
        }
        em.e eVar5 = this.f70868p;
        if (eVar5 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.widget.RelativeLayout f17 = eVar5.f();
        f17.setVisibility(0);
        f17.setOnClickListener(new v01.i(this));
        em.e eVar6 = this.f70868p;
        if (eVar6 != null) {
            eVar6.e().setVisibility(z17 ? 0 : 4);
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }
}
