package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI */
/* loaded from: classes8.dex */
public class ActivityC12984x6e32fb28 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: h, reason: collision with root package name */
    public static java.util.LinkedList f175571h;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f175572d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f175573e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f175574f = false;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f175575g;

    public final void V6(boolean z17) {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.llp);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.llq);
        if (findViewById != null) {
            if (z17) {
                ((android.widget.TextView) findViewById).setVisibility(0);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI", "setEmptyTipsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI", "setEmptyTipsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            ((android.widget.TextView) findViewById).setVisibility(8);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI", "setEmptyTipsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/brandservice/ui/ReceiveTemplateMsgMgrUI", "setEmptyTipsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getHeaderResourceId */
    public int mo48679xfc6e1bac() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cce;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ccf;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576447bg;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bge);
        this.f175572d = m79336x8b97809d();
        java.lang.String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
        this.f175573e = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "bizName is null");
            finish();
        } else {
            mo54448x9c8c0d33(new or1.z1(this));
            lr1.d0 d0Var = new lr1.d0(this.f175573e);
            gm0.j1.d().g(d0Var);
            this.f175575g = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsf), true, true, new or1.a2(this, d0Var));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(1031, this);
        gm0.j1.d().a(mc1.c.f72820x366c91de, this);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(1031, this);
        gm0.j1.d().q(mc1.c.f72820x366c91de, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        if (this.f175574f) {
            this.f175574f = false;
            gm0.j1.d().g(new lr1.i0(this.f175573e, f175571h));
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (f175571h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "mRecvOptions == null");
            return false;
        }
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "key is null");
            return false;
        }
        java.util.Iterator it = f175571h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.ye4 ye4Var = (r45.ye4) it.next();
            java.lang.String str2 = ye4Var.f472545d;
            if (str2 == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                this.f175574f = true;
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N()) {
                    ye4Var.f472547f = 0;
                } else {
                    ye4Var.f472547f = 1;
                }
            }
        }
        if (this.f175574f) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new or1.b2(this), 4000L);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onSceneEnd: [%d], [%d], [%s], scene is null", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onSceneEnd: [%d], [%d], [%s], sceneType[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        if (m1Var.mo808xfb85f7b0() != 1031) {
            if (m1Var.mo808xfb85f7b0() == 1030) {
                if (i17 == 0 && i18 == 0) {
                    return;
                }
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsd), 0).show();
                return;
            }
            return;
        }
        android.app.ProgressDialog progressDialog = this.f175575g;
        r45.af4 af4Var = null;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f175575g.dismiss();
            this.f175575g = null;
        }
        if (i17 != 0 || i18 != 0) {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            dp.a.m125854x26a183b(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsc), 1).show();
            V6(true);
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = ((lr1.d0) m1Var).f402183e;
        if (oVar != null && (fVar = oVar.f152244b.f152233a) != null) {
            af4Var = (r45.af4) fVar;
        }
        java.util.LinkedList linkedList = af4Var.f451513d;
        f175571h = linkedList;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f175572d).t();
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "recvOption is empty");
            V6(true);
            return;
        }
        V6(false);
        linkedList.size();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.ye4 ye4Var = (r45.ye4) it.next();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe(this);
            c21541x1c1b08fe.f279318v = false;
            c21541x1c1b08fe.C(ye4Var.f472545d);
            c21541x1c1b08fe.L(ye4Var.f472546e);
            c21541x1c1b08fe.L = ye4Var.f472547f == 0;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f175572d).d(c21541x1c1b08fe, -1);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f175572d).notifyDataSetChanged();
    }
}
