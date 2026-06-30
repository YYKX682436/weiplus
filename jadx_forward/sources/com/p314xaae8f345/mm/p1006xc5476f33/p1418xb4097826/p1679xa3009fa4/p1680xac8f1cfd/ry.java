package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class ry implements qj5.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty f217373a;

    public ry(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty tyVar) {
        this.f217373a = tyVar;
    }

    public void a(java.util.List toUsers) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsers, "toUsers");
        java.util.Iterator it = toUsers.iterator();
        while (it.hasNext()) {
            qj5.r rVar = (qj5.r) it.next();
            c(rVar.f445531a, rVar.f445532b ? 3 : 2);
        }
    }

    public void b() {
        ya2.b2 contact;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty tyVar = this.f217373a;
        android.app.Activity m80379x76847179 = tyVar.m80379x76847179();
        jz5.l[] lVarArr = new jz5.l[4];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = tyVar.f217601e;
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u((abstractC14490x69736cb5 == null || (feedObject3 = abstractC14490x69736cb5.getFeedObject()) == null) ? 0L : feedObject3.m59251x5db1b11()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = tyVar.f217601e;
        java.lang.String str = null;
        lVarArr[1] = new jz5.l("session_buffer", (abstractC14490x69736cb52 == null || (feedObject = abstractC14490x69736cb52.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? null : feedObject2.m76829x97edf6c0());
        lVarArr[2] = new jz5.l("screenshot_type", java.lang.Integer.valueOf(tyVar.Q6()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = tyVar.f217601e;
        if (abstractC14490x69736cb53 != null && (contact = abstractC14490x69736cb53.getContact()) != null) {
            str = contact.D0();
        }
        lVarArr[3] = new jz5.l("finder_username", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.i(d2Var, m80379x76847179, "share_screenshot", "view_clk", false, kz5.c1.k(lVarArr), 8, null);
    }

    public final void c(java.lang.String str, int i17) {
        ya2.b2 contact;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty tyVar = this.f217373a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = tyVar.f217601e;
        java.lang.String u17 = pm0.v.u((abstractC14490x69736cb5 == null || (feedObject3 = abstractC14490x69736cb5.getFeedObject()) == null) ? 0L : feedObject3.m59251x5db1b11());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = tyVar.f217601e;
        java.lang.String str2 = null;
        java.lang.String m76829x97edf6c0 = (abstractC14490x69736cb52 == null || (feedObject = abstractC14490x69736cb52.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? null : feedObject2.m76829x97edf6c0();
        int Q6 = tyVar.Q6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = tyVar.f217601e;
        if (abstractC14490x69736cb53 != null && (contact = abstractC14490x69736cb53.getContact()) != null) {
            str2 = contact.D0();
        }
        gm0.j1.b().k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a, tyVar.m80379x76847179(), "svr_screenshot_share", false, kz5.c1.k(new jz5.l("feed_id", u17), new jz5.l("session_buffer", m76829x97edf6c0), new jz5.l("screenshot_type", java.lang.Integer.valueOf(Q6)), new jz5.l("finder_username", str2), new jz5.l("share_username", gm0.j1.b().k()), new jz5.l("receive_username", str), new jz5.l("share_dst_scene", java.lang.Integer.valueOf(i17))), 4, null);
    }
}
