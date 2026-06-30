package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class t4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final jv2.i f211949d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f211950e;

    public t4(jv2.i commentItem, int i17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItem, "commentItem");
        this.f211949d = commentItem;
        this.f211950e = lVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        jv2.c cVar;
        ec2.d e27;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            jv2.i iVar = this.f211949d;
            if (itemId == 0) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f383756d.j())) {
                    return;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(iVar.f383756d.j());
                dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f571894st, 0).show();
                return;
            }
            if (itemId == 1) {
                yz5.l lVar = this.f211950e;
                if (lVar != null) {
                    lVar.mo146xb9724478(iVar);
                    return;
                }
                return;
            }
            java.lang.String str = null;
            if (itemId != 2) {
                if (itemId != 3) {
                    if (itemId == 999) {
                        if (iVar != null && (cVar = iVar.f383756d) != null) {
                            str = cVar.m141449x9616526c();
                        }
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(str);
                        return;
                    }
                    return;
                }
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.y yVar = hb2.y.f361647e;
                long mo2128x1ed62e84 = iVar.mo2128x1ed62e84();
                jv2.c cVar2 = iVar.f383756d;
                long j17 = cVar2.f67478xf9a02e3e;
                java.lang.String str2 = cVar2.f67481x2812d6a6;
                if (str2 == null) {
                    str2 = "";
                }
                yVar.o(mo2128x1ed62e84, j17, str2, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.s4());
                return;
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            jv2.c cVar3 = iVar.f383756d;
            long j18 = cVar3.f67478xf9a02e3e;
            java.lang.String str3 = "https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=79&comment_ID=" + cVar3.t0() + "&Content_ID=" + j18;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str3);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).nj(j18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar == null || (e27 = zy2.ra.e2(nyVar, 0, 1, null)) == null) {
                return;
            }
            e27.a(new ec2.a(17, j18, null));
        }
    }
}
