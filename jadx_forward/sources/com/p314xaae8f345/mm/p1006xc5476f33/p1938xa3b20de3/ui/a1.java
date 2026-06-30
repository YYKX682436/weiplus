package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public android.app.Activity f234110a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.e f234111b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 f234112c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Vibrator f234113d;

    public a1(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.e eVar) {
        this.f234110a = activity;
        this.f234111b = eVar;
    }

    public final java.lang.String a(int i17) {
        return this.f234110a.getString(i17);
    }

    public void b(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, java.lang.String str, wo3.x xVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "handleErrorEvent errCode :" + i17 + " msg:" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = this.f234112c;
        if (n8Var != null) {
            n8Var.dismiss();
            this.f234112c = null;
        }
        if (i17 == 409) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "goLimitChangeUI msg:" + str);
            db5.e1.A(this.f234110a, str, "", a(com.p314xaae8f345.mm.R.C30867xcad56011.l1w), a(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.z0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.i0(this));
            return;
        }
        if (i17 == 410) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "showBindNewBankcardDialog msg:" + str);
            db5.e1.A(this.f234110a, str, "", a(com.p314xaae8f345.mm.R.C30867xcad56011.f575122kv1), a(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.x0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.y0(this));
            return;
        }
        if (i17 == 413) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "goChangeBankcard msg:" + str);
            db5.e1.A(this.f234110a, str, "", a(com.p314xaae8f345.mm.R.C30867xcad56011.l1e), a(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.j0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.k0(this));
            return;
        }
        if (i17 != 411) {
            android.app.Activity activity = this.f234110a;
            if (!(activity instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.h0.a(activity, str, xVar);
                return;
            } else {
                if (np5.t.a((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activity, m1Var, 1000, i17, str)) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.h0.a(this.f234110a, str, xVar);
                return;
            }
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y() || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "is unreg or simplereg");
            return;
        }
        if (to3.c0.f502484i) {
            android.app.Activity activity2 = this.f234110a;
            if (activity2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = (com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38) activity2;
                activityC16764xd1ab6b38.E.setVisibility(4);
                activityC16764xd1ab6b38.R1.f(activityC16764xd1ab6b38.f234073w, new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.p2(activityC16764xd1ab6b38), 6);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(135L, 1L, 1L, true);
            }
        }
        android.app.Activity activity3 = this.f234110a;
        db5.e1.K(activity3, false, str, "", activity3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l1z), activity3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new yo3.g(activity3), new yo3.h(activity3));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(135L, 1L, 1L, true);
    }

    public boolean c(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "errType:" + i17 + "  errCode" + i18 + " errMsg:" + str + " cgi type:" + m1Var.mo808xfb85f7b0());
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof wo3.f;
            if (!z17) {
                return false;
            }
            wo3.f fVar = (wo3.f) m1Var;
            java.lang.String str2 = fVar.f529686f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = this.f234112c;
            if (n8Var != null) {
                n8Var.dismiss();
                this.f234112c = null;
            }
            if (fVar.f529688h == 0 && !android.text.TextUtils.isEmpty(str2)) {
                android.app.Activity activity = this.f234110a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "hy: only transid coming. do old way");
                if (android.text.TextUtils.isEmpty(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOfflineUtil", "transid == null");
                } else if (yo3.m.m()) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    if (z17 && (c19088xa4b300c1 = fVar.f529691n) != null) {
                        bundle.putParcelable("key_realname_guide_helper", c19088xa4b300c1);
                    }
                    bundle.putString("key_trans_id", str2);
                    bundle.putInt("key_pay_type", 2);
                    if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38) {
                        android.content.Intent intent = activity.getIntent();
                        bundle.putString("key_appid", intent.getStringExtra("key_appid"));
                        bundle.putInt("key_from_scene", intent.getIntExtra("key_from_scene", 0));
                    }
                    com.p314xaae8f345.mm.p2802xd031a825.a.j(activity, to3.b0.class, bundle, null);
                }
                this.f234110a.setResult(-1);
                this.f234110a.finish();
            } else if (fVar.f529688h != 0 && fVar.f529687g != 0 && fVar.f529690m == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "input pwd, but respon exist error!");
                b(fVar, fVar.f529688h, fVar.f529689i, null);
            }
        } else {
            if (!(m1Var instanceof wo3.f)) {
                return false;
            }
            wo3.f fVar2 = (wo3.f) m1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var2 = this.f234112c;
            if (n8Var2 != null) {
                n8Var2.dismiss();
                this.f234112c = null;
            }
            if (fVar2.f529690m == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "input pwd, but respon exist error!");
                b(m1Var, i18, str, null);
            }
        }
        return true;
    }

    public void d(wo3.t tVar) {
        if (tVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "showFreeMsg");
        if ("1".equals(tVar.f529746d)) {
            db5.e1.K(this.f234110a, false, tVar.f529747e, "", a(com.p314xaae8f345.mm.R.C30867xcad56011.l1q), a(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.l0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.m0(this));
        }
    }
}
