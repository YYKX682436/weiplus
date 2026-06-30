package wd4;

/* loaded from: classes9.dex */
public final class z0 {
    public z0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int[] a(java.util.List items) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("array2int", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        int[] iArr = new int[items.size()];
        int size = items.size();
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = ((java.lang.Number) items.get(i17)).intValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("array2int", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
        return iArr;
    }

    public final jz5.l b(r45.jj4 media, java.lang.String snsLoacalId) {
        java.lang.String o17;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoQuickSharedPath", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsLoacalId, "snsLoacalId");
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), media.f459388d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getMediaFilePath(...)");
        if (com.p314xaae8f345.mm.vfs.w6.j(d17 + ca4.z0.Y(media))) {
            o17 = d17 + ca4.z0.Y(media);
            str = d17 + ca4.z0.a0(media);
        } else {
            java.lang.String q17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.q(media);
            o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.o(snsLoacalId, media);
            str = q17;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(o17)) {
            o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.m(snsLoacalId);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareSheet", "shareSendVideo get relocated video path: " + o17);
        }
        jz5.l lVar = new jz5.l(str, o17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoQuickSharedPath", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
        return lVar;
    }

    public final void c(android.app.Activity activity, java.lang.String toUsers, java.lang.String str, r45.jj4 media, java.lang.String snsLoacalId) {
        java.lang.String str2;
        c01.h7 h7Var;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shareSendVideo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsers, "toUsers");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsLoacalId, "snsLoacalId");
        jz5.l b17 = b(media, snsLoacalId);
        java.lang.String str6 = (java.lang.String) b17.f384367e;
        java.lang.String str7 = (java.lang.String) b17.f384366d;
        java.lang.String str8 = "MicroMsg.ShareSheet";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSheet", "shareSendVideo >> " + snsLoacalId + " fullPath: " + str6 + ", imagePath: " + str7);
        boolean z17 = true;
        if (!(str6 == null || str6.length() == 0)) {
            if (str7 != null && str7.length() != 0) {
                z17 = false;
            }
            if (!z17 && com.p314xaae8f345.mm.vfs.w6.j(str6) && com.p314xaae8f345.mm.vfs.w6.j(str7)) {
                boolean fj6 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).fj(vf0.j3.f517738g);
                c01.h7 h7Var2 = new c01.h7();
                h7Var2.f118763e = snsLoacalId;
                java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) new r26.t(",").g(toUsers, 0).toArray(new java.lang.String[0]));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P1, "stringsToList(...)");
                int S = ca4.z0.S(str6);
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str9 = (java.lang.String) it.next();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "send sight to %s, videopath %s, thumbpath %s duration %d", str9, str6, str7, java.lang.Integer.valueOf(S));
                    if (fj6) {
                        c35.o oVar = (c35.o) i95.n0.c(c35.o.class);
                        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                        kk.l lVar = t21.w2.f496589c;
                        java.lang.String a17 = t21.c3.a(str9);
                        vf0.r2 r2Var = new vf0.r2(null, null, null, null, null, null, false, null, null, null, false, true, 2047, null);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                        str2 = str7;
                        h7Var = h7Var2;
                        str3 = str8;
                        ((vf0.k2) oVar).Ai(new vf0.u2(a17, str6, str7, false, S, r2Var, h7Var), str9);
                        str5 = str9;
                        str4 = str6;
                    } else {
                        str2 = str7;
                        h7Var = h7Var2;
                        str3 = str8;
                        java.lang.String str10 = str6;
                        str4 = str10;
                        str5 = str9;
                        ((dk5.s5) tg3.t1.a()).nj(activity, str9, str10, str2, 62, S, false, false, "", null);
                    }
                    ((dk5.s5) tg3.t1.a()).Ui(str, str5);
                    str7 = str2;
                    str8 = str3;
                    h7Var2 = h7Var;
                    str6 = str4;
                }
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).Ai(snsLoacalId);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, activity, null, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareSendVideo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareSheet", "shareSendVideo file is error >> " + str6 + ", " + str7);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.e()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ihu), null, activity, null, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareSendVideo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
    }
}
