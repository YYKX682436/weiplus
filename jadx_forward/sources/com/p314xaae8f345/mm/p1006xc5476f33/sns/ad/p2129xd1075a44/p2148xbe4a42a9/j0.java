package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9;

/* loaded from: classes4.dex */
public class j0 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17807xc2e01725 f245260a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 f245261b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f245262c;

    /* renamed from: d, reason: collision with root package name */
    public s34.r0 f245263d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w4 f245264e;

    /* renamed from: f, reason: collision with root package name */
    public int f245265f = 0;

    public j0(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w4 w4Var) {
        try {
            this.f245260a = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17807xc2e01725) viewGroup;
            this.f245261b = c17806x48d2cd43;
            this.f245264e = w4Var;
        } catch (java.lang.Throwable unused) {
        }
    }

    public static boolean f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLivingNow", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivingMainStatus", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        int i18 = i17 & 127;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivingMainStatus", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        boolean z17 = i18 == 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLivingNow", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.h0
    public void a(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLiveStatusChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        if (this.f245262c.equals(str) && this.f245265f != i18) {
            h(i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLiveStatusChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0
    public java.lang.String b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        java.util.List c17 = c();
        if (c17 == null || i17 < 0 || i17 >= c17.size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            return "";
        }
        java.lang.String str = (java.lang.String) c17.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return str;
    }

    public java.util.List c() {
        java.util.List list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentStatusDescriptionList", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        int i17 = this.f245265f & 127;
        s34.r0 r0Var = this.f245263d;
        if (r0Var != null) {
            if (i17 == 1) {
                list = r0Var.f484282e;
            } else if (i17 == 2) {
                list = r0Var.f484283f;
            } else if (i17 == 3) {
                list = r0Var.f484284g;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentStatusDescriptionList", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            return list;
        }
        list = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentStatusDescriptionList", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return list;
    }

    public java.lang.String d(int i17) {
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getString", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43 = this.f245261b;
        if (c17806x48d2cd43 != null) {
            context = c17806x48d2cd43.getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            context = null;
        }
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getString", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            return "";
        }
        java.lang.String string = context.getString(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getString", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return string;
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideAllLivingUI", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.LivingStatusController", "hideAllLivingUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43 = this.f245261b;
        if (c17806x48d2cd43 != null) {
            c17806x48d2cd43.setVisibility(8);
            c17806x48d2cd43.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17807xc2e01725 c17807xc2e01725 = this.f245260a;
        if (c17807xc2e01725 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c17807xc2e01725, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/living/SnsAdLivingStatusController", "hideAllLivingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17807xc2e01725.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c17807xc2e01725, "com/tencent/mm/plugin/sns/ad/widget/living/SnsAdLivingStatusController", "hideAllLivingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideAllLivingUI", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    /* renamed from: finalize */
    public void m69675xd764dc1e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finalize", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        super.finalize();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finalize", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    public void g(java.lang.String str, s34.r0 r0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        this.f245262c = str;
        this.f245263d = r0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.g0
    /* renamed from: getCount */
    public int mo69674x7444f759() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        java.util.List c17 = c();
        int size = c17 != null ? c17.size() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return size;
    }

    public void h(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLiveStatus", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        int i18 = this.f245265f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.LivingStatusController", "setLiveStatus, oldStatus=" + i18 + ", newStatus=" + i17);
        if (i17 != i18) {
            this.f245265f = i17;
            if (i17 == 0) {
                e();
            } else {
                k(i17);
                i(i17);
                j();
            }
        } else if (i17 == 0) {
            e();
        } else {
            k(i17);
            i(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupLiveDescLayoutAdapterWhenStatusNotChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43 = this.f245261b;
            if (c17806x48d2cd43 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupLiveDescLayoutAdapterWhenStatusNotChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            } else {
                if (c17806x48d2cd43.a()) {
                    j();
                } else {
                    c17806x48d2cd43.b();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupLiveDescLayoutAdapterWhenStatusNotChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLiveStatus", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = "setupActionButtonStateAndText"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            com.tencent.mm.plugin.sns.ui.w4 r2 = r6.f245264e
            if (r2 == 0) goto L59
            r3 = r7 & 127(0x7f, float:1.78E-43)
            r4 = 65280(0xff00, float:9.1477E-41)
            r7 = r7 & r4
            int r7 = r7 >> 8
            r4 = 2
            r5 = 1
            if (r3 != r5) goto L2b
            if (r7 != r4) goto L23
            r7 = 2131776630(0x7f105476, float:1.9184738E38)
            java.lang.String r7 = r6.d(r7)
            r3 = 0
            goto L4d
        L23:
            r7 = 2131776657(0x7f105491, float:1.9184793E38)
            java.lang.String r7 = r6.d(r7)
            goto L4c
        L2b:
            if (r3 != r4) goto L35
            r7 = 2131776652(0x7f10548c, float:1.9184782E38)
            java.lang.String r7 = r6.d(r7)
            goto L4c
        L35:
            r4 = 3
            if (r3 != r4) goto L4a
            if (r7 != r4) goto L42
            r7 = 2131776654(0x7f10548e, float:1.9184786E38)
            java.lang.String r7 = r6.d(r7)
            goto L4c
        L42:
            r7 = 2131776656(0x7f105490, float:1.918479E38)
            java.lang.String r7 = r6.d(r7)
            goto L4c
        L4a:
            java.lang.String r7 = ""
        L4c:
            r3 = r5
        L4d:
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto L59
            r2.b(r7)
            r2.a(r5, r3)
        L59:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.j0.i(int):void");
    }

    public void j() {
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupLiveDescLayoutAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.LivingStatusController", "setupLiveDescLayoutAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43 = this.f245261b;
        if (c17806x48d2cd43 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupLiveDescLayoutAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            return;
        }
        int mo69674x7444f759 = mo69674x7444f759();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.LivingStatusController", "descCount=" + mo69674x7444f759);
        if (mo69674x7444f759 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.LivingStatusController", "hide liveDescLayout");
            c17806x48d2cd43.setVisibility(4);
            c17806x48d2cd43.c();
        } else {
            c17806x48d2cd43.setVisibility(0);
            c17806x48d2cd43.m69672x13daf1e0(this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            if (c17806x48d2cd43 != null) {
                context = c17806x48d2cd43.getContext();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
                context = null;
            }
            if (ca4.m0.Z(context)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.LivingStatusController", "isAdapterElder, hide liveDescLayout");
                c17806x48d2cd43.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupLiveDescLayoutAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    public void k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupLiveStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17807xc2e01725 c17807xc2e01725 = this.f245260a;
        if (c17807xc2e01725 != null) {
            c17807xc2e01725.setVisibility(0);
            c17807xc2e01725.m69673x50451200(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.LivingStatusController", "setupLiveStatusContent, liveStatus=" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupLiveStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }
}
