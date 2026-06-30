package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes8.dex */
public class u0 implements android.view.View.OnClickListener, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f284259f = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/mp/readtemplate?t=wxm-appmsg-inform&bizusername=%s&tid=%s&mid=%s&mtime=%s&scene=%s#wechat_redirect";

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f284260d;

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f284261e;

    public u0(yb5.d dVar) {
        this.f284261e = dVar;
    }

    public static void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.u0 u0Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        u0Var.getClass();
        c01.d9.e().g(m1Var);
        yb5.d dVar = u0Var.f284261e;
        u0Var.f284260d = db5.e1.Q(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.t0(u0Var, m1Var));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 u3Var) {
        android.app.ProgressDialog progressDialog = this.f284260d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f284260d.dismiss();
            this.f284260d = null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ai().a(2, this);
        yb5.d dVar = this.f284261e;
        if (i17 == 0 && i18 == 0) {
            db5.e1.T(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.foy));
        } else {
            if (com.p314xaae8f345.mm.ui.pc.a(dVar.g(), i17, i18, str, 4)) {
                return;
            }
            dp.a.m125854x26a183b(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573750fn4, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppSpamClickListener", "onClick tag is null");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z17 = view.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er;
        yb5.d dVar = this.f284261e;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
            if (erVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppSpamClickListener", "ItemDataTag is null");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.String str = erVar.f285460w.f430179d;
            boolean z18 = false;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppSpamClickListener", "appId is null or nil");
            } else {
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppSpamClickListener", "get null appinfo : appid = " + str);
                } else {
                    z18 = true;
                }
            }
            if (!z18) {
                yj0.a.h(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f Ai = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ai();
            Ai.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g(Ai, 2, this));
            int i17 = dVar.D() ? 2 : 1;
            java.lang.String x17 = dVar.x();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(x17)) {
                x17 = c01.w9.s(erVar.c().j());
            }
            ot0.q qVar = erVar.f285460w;
            erVar.c();
            db5.e1.A(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572007w3), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572008w4), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571325bt), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hux), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.r0(this, qVar, x17, i17), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.s0(this, qVar, x17, i17));
        } else if (view.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.m6) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.m6 m6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.m6) view.getTag();
            if (m6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppSpamClickListener", "TemplateItemDataTag is null");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m6Var.f283480b) || m6Var.f283481c == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppSpamClickListener", "wrong args, tag is null ? ", java.lang.Boolean.FALSE);
            } else {
                db5.e1.h(dVar.g(), null, new java.lang.String[]{dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574881ju3), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574882ju4), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg)}, null, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.q0(this, m6Var));
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.app.ProgressDialog progressDialog = this.f284260d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f284260d.dismiss();
            this.f284260d = null;
        }
        c01.d9.e().q(mc1.c.f72820x366c91de, this);
        yb5.d dVar = this.f284261e;
        if (i17 == 0 && i18 == 0) {
            db5.e1.T(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.foy));
        } else {
            dp.a.m125854x26a183b(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574883ju5, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
    }
}
