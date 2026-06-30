package n74;

/* loaded from: classes4.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.ViewGroup f416912a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.j0 f416913b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 f416914c;

    public final void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        b(context, c17933xe8d1b226, view, i17, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
    }

    public final void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.view.View view, int i17, boolean z17) {
        boolean z18;
        android.view.ViewStub viewStub;
        android.view.ViewStub viewStub2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
            return;
        }
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
            return;
        }
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldShowLivingView", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
        if ((m70354x74235b3e != null ? m70354x74235b3e.f38190xd2e4d0fd : null) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldShowLivingView", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper$Companion");
            z18 = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldShowLivingView", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper$Companion");
            z18 = true;
        }
        if (z18) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
            if (this.f416912a == null && (viewStub2 = (android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.f564189ke)) != null) {
                android.view.View h17 = a84.y0.h(viewStub2);
                this.f416912a = h17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) h17 : null;
            }
            if (this.f416912a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdLivingStatusHelper", "livingStatusLayout is null, maybe inflateViewStub error");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleLivingStatusController", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
            if (this.f416913b == null) {
                this.f416913b = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.j0(this.f416912a, null, null);
            }
            if (this.f416913b != null) {
                s34.r0 r0Var = c17933xe8d1b226.m70354x74235b3e().f38190xd2e4d0fd;
                int c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.c(m70371x485d7.Id, r0Var.f484278a);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.j0 j0Var = this.f416913b;
                if (j0Var != null) {
                    j0Var.g(m70371x485d7.Id, r0Var);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.j0 j0Var2 = this.f416913b;
                if (j0Var2 != null) {
                    j0Var2.h(c17);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdLivingStatusHelper", "snsId is " + m70371x485d7.Id + ", current living status is " + c17 + ", liveInfo finderUsername is " + r0Var.f484280c + ", liveInfo id is " + r0Var.f484281d);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.a(m70371x485d7.Id, this.f416913b);
                if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.f245299e.a(c17933xe8d1b226)) {
                    e74.i.f().d(i17, c17933xe8d1b226);
                }
                if (z17) {
                    boolean f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.j0.f(c17);
                    java.lang.String str = m70371x485d7.Id;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
                    if (str == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
                    } else {
                        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733.e(r0Var, f17)) {
                            if (this.f416914c == null && (viewStub = (android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.f564181k6)) != null) {
                                android.view.View h18 = a84.y0.h(viewStub);
                                this.f416914c = h18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733) h18 : null;
                            }
                            int b17 = i65.a.b(context, 60);
                            int b18 = i65.a.b(context, 35);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 c17805xb6909733 = this.f416914c;
                            if (c17805xb6909733 != null) {
                                c17805xb6909733.d(r0Var, str, b17, b18);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 c17805xb69097332 = this.f416914c;
                            if (c17805xb69097332 != null) {
                                c17805xb69097332.setVisibility(0);
                            }
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 c17805xb69097333 = this.f416914c;
                            if (c17805xb69097333 != null) {
                                c17805xb69097333.setVisibility(8);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleLivingStatusController", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        } else {
            android.view.ViewGroup viewGroup = this.f416912a;
            if (viewGroup != null) {
                a84.y0.p(viewGroup, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 c17805xb69097334 = this.f416914c;
            if (c17805xb69097334 != null) {
                a84.y0.p(c17805xb69097334, false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
    }

    public final void c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.view.View view, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillLivingViewInfoForPhotoAd", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingViewInfoForPhotoAd", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
            return;
        }
        if (c17933xe8d1b226.m70377x3172ed() && i18 == 2) {
            b(context, c17933xe8d1b226, view, i17, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingViewInfoForPhotoAd", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
            return;
        }
        android.view.ViewGroup viewGroup = this.f416912a;
        if (viewGroup != null) {
            a84.y0.p(viewGroup, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17805xb6909733 c17805xb6909733 = this.f416914c;
        if (c17805xb6909733 != null) {
            a84.y0.p(c17805xb6909733, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingViewInfoForPhotoAd", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdLivingStatusHelper");
    }
}
