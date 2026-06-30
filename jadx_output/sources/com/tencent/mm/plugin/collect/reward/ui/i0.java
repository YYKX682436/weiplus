package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class i0 implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.h f96306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI f96307b;

    public i0(com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI qrRewardSelectMoneyUI, xw1.h hVar) {
        this.f96307b = qrRewardSelectMoneyUI;
        this.f96306a = hVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.lx lxVar = this.f96306a.f457675n;
        java.lang.String str2 = lxVar.f379905f;
        com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI qrRewardSelectMoneyUI = this.f96307b;
        qrRewardSelectMoneyUI.f96261t = str2;
        qrRewardSelectMoneyUI.f96262u = lxVar.f379909m;
        qrRewardSelectMoneyUI.f96263v = lxVar.f379913q;
        qrRewardSelectMoneyUI.f96264w = lxVar.f379914r;
        qrRewardSelectMoneyUI.f96265x = lxVar.f379907h;
        qrRewardSelectMoneyUI.f96266y = lxVar.f379911o;
        qrRewardSelectMoneyUI.f96267z = lxVar.f379912p;
        qrRewardSelectMoneyUI.A = lxVar.f379910n;
        qrRewardSelectMoneyUI.B = lxVar.f379908i;
        java.util.LinkedList linkedList = lxVar.f379906g;
        qrRewardSelectMoneyUI.f96248d = linkedList;
        qrRewardSelectMoneyUI.C = lxVar.f379915s;
        qrRewardSelectMoneyUI.D = lxVar.f379916t;
        qrRewardSelectMoneyUI.E = lxVar.f379917u;
        if (linkedList == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardSelectMoneyUI", "amt_list is null");
            qrRewardSelectMoneyUI.f96248d = new java.util.LinkedList();
        }
        qrRewardSelectMoneyUI.f96249e.setVisibility(0);
        qrRewardSelectMoneyUI.f96255n.setVisibility(0);
        qrRewardSelectMoneyUI.f96253i.setVisibility(0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(qrRewardSelectMoneyUI.D)) {
            java.lang.String str3 = qrRewardSelectMoneyUI.f96261t;
            gm0.j1.i();
            com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str3);
            if (f07 == null || ((int) f07.E2) <= 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                ((c01.k7) c01.n8.a()).b(str3, 4, new com.tencent.mm.plugin.collect.reward.ui.j0(qrRewardSelectMoneyUI, currentTimeMillis));
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(qrRewardSelectMoneyUI.f96249e, str3, 0.03f);
                qrRewardSelectMoneyUI.V6(str3);
            }
        } else {
            int d17 = com.tencent.mm.sdk.platformtools.j.d(qrRewardSelectMoneyUI, 50.0f);
            qrRewardSelectMoneyUI.f96249e.setRoundCorner(true);
            qrRewardSelectMoneyUI.f96249e.b(qrRewardSelectMoneyUI.D, d17, d17, com.tencent.mm.R.drawable.bhm);
            qrRewardSelectMoneyUI.V6(qrRewardSelectMoneyUI.f96261t);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qrRewardSelectMoneyUI.f96265x)) {
            android.widget.TextView textView = qrRewardSelectMoneyUI.f96252h;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = qrRewardSelectMoneyUI.getString(com.tencent.mm.R.string.hpj, qrRewardSelectMoneyUI.f96265x);
            float textSize = qrRewardSelectMoneyUI.f96252h.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(qrRewardSelectMoneyUI, string, textSize));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(qrRewardSelectMoneyUI.B)) {
            qrRewardSelectMoneyUI.f96250f.setVisibility(8);
        } else {
            qrRewardSelectMoneyUI.f96250f.setText(qrRewardSelectMoneyUI.B);
        }
        qrRewardSelectMoneyUI.f96257p.notifyDataSetChanged();
        qrRewardSelectMoneyUI.f96256o.setBannerData(qrRewardSelectMoneyUI.E);
    }
}
