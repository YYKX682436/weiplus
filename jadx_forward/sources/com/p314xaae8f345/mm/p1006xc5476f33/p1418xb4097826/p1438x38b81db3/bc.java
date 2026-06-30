package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class bc implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.CloseDrawerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f184490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f184492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f184493d;

    public bc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f184490a = qeVar;
        this.f184491b = s0Var;
        this.f184492c = abstractC14490x69736cb5;
        this.f184493d = f0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.CloseDrawerCallback
    public void a(int i17, java.util.List data, boolean z17) {
        int m59216x8ed22866;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f184490a;
        dw2.c0 c0Var = qeVar.f185891f.getS().f305236n;
        if (c0Var != null) {
            dw2.c0.h(c0Var, "openCommentDrawer", false, false, 4, null);
        }
        in5.s0 s0Var = this.f184491b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.getFeedObject() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f184492c;
        if (!(feedObject != null && feedObject.m59251x5db1b11() == abstractC14490x69736cb52.mo2128x1ed62e84())) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Long.valueOf(feedObject != null ? feedObject.m59251x5db1b11() : 0L);
            objArr[1] = java.lang.Long.valueOf(abstractC14490x69736cb52.mo2128x1ed62e84());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "close comment feed not match %d %d", objArr);
            return;
        }
        qeVar.L0(abstractC14490x69736cb52, s0Var, "commentClose");
        if (qeVar.f185891f.d0()) {
            if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.w0().r()).intValue() == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(abstractC14490x69736cb52.mo2128x1ed62e84());
                if (h17 == null) {
                    h17 = abstractC14490x69736cb52.getFeedObject();
                }
                m59216x8ed22866 = h17.m59216x8ed22866();
            } else {
                m59216x8ed22866 = abstractC14490x69736cb52.getFeedObject().m59216x8ed22866();
            }
            ((android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.c6s)).setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(1, m59216x8ed22866));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209546x1).mo141623x754a37bb()).r()).intValue() == 1) {
            s0Var.o().mo7976xc291bbd2(0, -this.f184493d.f391649d);
        }
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2.class);
        if (c15447x4ebc90c2 != null) {
            c15447x4ebc90c2.c7(s0Var);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc xcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc.class);
        if (xcVar != null && xcVar.f217976n) {
            xcVar.h7();
            xcVar.f217976n = false;
        }
        if (z17) {
            qeVar.E(s0Var, true);
        }
    }
}
