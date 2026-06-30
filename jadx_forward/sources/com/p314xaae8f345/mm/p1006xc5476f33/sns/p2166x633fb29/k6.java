package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class k6 {

    /* renamed from: f, reason: collision with root package name */
    public static long f245889f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static long f245890g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static int f245891h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static long f245892i = 300000;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f245893j = false;

    /* renamed from: k, reason: collision with root package name */
    public static int f245894k = 60;

    /* renamed from: a, reason: collision with root package name */
    public long f245895a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f245896b = "";

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f245897c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f245898d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f245899e = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i6(this);

    public boolean a(long j17, int i17, int i18) {
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkRetryTipExpose", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        boolean z17 = false;
        if (!f245893j) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkRetryTipExpose", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            return false;
        }
        long j18 = f245890g;
        if (j18 == -1) {
            long j19 = f245889f;
            if (j19 != -1 && (i19 = f245891h) != 0 && j17 <= j19 && i17 < i19) {
                z17 = true;
            }
            if (z17) {
                f245890g = i18;
            }
        } else if (i18 == j18) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.C().f142833k++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRetryEditTipManager", "checkRetryTipExpose: result=%b, snsId=%s, localId=%s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkRetryTipExpose", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        return z17;
    }

    public void b(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goRetryEdit", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        if (!f245893j) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goRetryEdit", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            return;
        }
        this.f245897c = null;
        this.f245898d = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRetryEditTipManager", "goRetryEdit draftKey:%s", this.f245896b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b2 D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Dj().D0(this.f245896b);
        if (D0 != null) {
            byte[] bArr = D0.f67847x28ff5a1c;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                try {
                    android.content.Intent intent = (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(obtain);
                    intent.putExtra("Kis_retry_edit", true);
                    java.lang.String stringExtra = intent.getStringExtra("K_with_together_stat");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.l(new cl0.g(stringExtra));
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsRetryEditTipManager", e17.toString());
                        }
                    }
                    intent.putExtra("Kis_from_sns_drafg_stg", true);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/model/SnsRetryEditTipManager", "goRetryEdit", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/sns/model/SnsRetryEditTipManager", "goRetryEdit", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    d();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f245899e);
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Dj().J0(this.f245896b, null, 0);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goRetryEdit", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepareRetryEditInfo", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        if (!f245893j || c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareRetryEditInfo", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRetryEditTipManager", "prepareRetryEditInfo: start");
        f245890g = -1L;
        f245889f = c17933xe8d1b226.f68891x29d1292e;
        f245891h = c17933xe8d1b226.f68883xac3be4e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f245895a = java.lang.System.currentTimeMillis();
        this.f245896b = "draft_retry_edit";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c2 Dj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Dj();
        int i17 = c17933xe8d1b226.f38324x142bbdc6;
        Dj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("genRetryEditDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b2 D0 = Dj.D0("draft_sent_" + i17);
        if (D0 != null) {
            Dj.J0("draft_retry_edit", D0.f67847x28ff5a1c, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("genRetryEditDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f245899e, f245892i);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17933xe8d1b226);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        this.f245898d = s0Var.C().f142830h;
        if (e17 != null) {
            this.f245897c = c17933xe8d1b226;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6972x174ca609 C = s0Var.C();
            C.f142827e = C.b("PublishId", ca4.z0.s0(c17933xe8d1b226.f68891x29d1292e), true);
            s0Var.C().f142828f = e17.f38982x6c24f798;
            s0Var.C().f142829g = e17.f38962x37aaea10;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6972x174ca609 C2 = s0Var.C();
            C2.f142831i = C2.b("ActionTimeStamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6972x174ca609 t17 = s0Var.t();
            t17.f142827e = t17.b("PublishId", ca4.z0.s0(c17933xe8d1b226.f68891x29d1292e), true);
            s0Var.t().f142828f = e17.f38982x6c24f798;
            s0Var.t().f142829g = e17.f38962x37aaea10;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6972x174ca609 t18 = s0Var.t();
            t18.f142831i = t18.b("ActionTimeStamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRetryEditTipManager", "prepareRetryEditInfo draftKey:%s", this.f245896b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareRetryEditInfo", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        f245889f = -1L;
        f245891h = 0;
        f245890g = -1L;
        this.f245896b = "";
        this.f245895a = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
    }
}
