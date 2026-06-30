package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class g2 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f2 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f245733c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p872xbfc2bd01.r f245734d = null;

    /* renamed from: e, reason: collision with root package name */
    public final int f245735e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f245736f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f245737g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f245738h;

    public g2(java.lang.String str, java.lang.String str2, java.util.List list) {
        this.f245733c = "";
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().f245807w).add(str);
        this.f245737g = str2;
        this.f245736f = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di();
        this.f245735e = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.nj();
        this.f245738h = list;
        this.f245733c = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f2
    public java.lang.Object a(java.lang.Object[] objArr) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = "doInBackground";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        java.lang.String str4 = this.f245737g;
        java.lang.String V = ca4.z0.V(str4);
        java.lang.String str5 = this.f245736f;
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(str5, str4);
        if (com.p314xaae8f345.mm.vfs.w6.j(d17 + V)) {
            str = "doInBackground";
            str2 = d17;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeMutilMedia", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("makeMutilMedia ");
            sb6.append(str4);
            sb6.append(" ");
            sb6.append(V);
            sb6.append(" ");
            java.util.List list = this.f245738h;
            sb6.append(list.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MutiImageLoader", sb6.toString());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            try {
                while (it.hasNext()) {
                    r45.jj4 jj4Var = (r45.jj4) it.next();
                    java.lang.String e07 = ca4.z0.e0(jj4Var);
                    java.lang.String U = ca4.z0.U(jj4Var);
                    java.util.Iterator it6 = it;
                    java.lang.String d18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(str5, jj4Var.f459388d);
                    str = str3;
                    if (com.p314xaae8f345.mm.vfs.w6.j(d18 + e07)) {
                        str2 = d17;
                    } else {
                        if (com.p314xaae8f345.mm.vfs.w6.j(d18 + U)) {
                            str2 = d17;
                        } else {
                            java.lang.String J2 = ca4.z0.J(jj4Var);
                            str2 = d17;
                            if (!com.p314xaae8f345.mm.vfs.w6.j(d18 + J2)) {
                                J2 = ca4.z0.W(jj4Var);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.W0(d18, J2, U, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.tj());
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.i1(d18, U, e07, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.mj());
                    }
                    com.p314xaae8f345.mm.p872xbfc2bd01.r n17 = ca4.z0.n(d18 + e07);
                    if (n17 != null) {
                        linkedList.add(n17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MutiImageLoader", "getbitmap from bm " + n17 + " " + d18 + e07);
                        i17++;
                        if (i17 < 9) {
                            it = it6;
                            str3 = str;
                            d17 = str2;
                        }
                        break;
                    }
                    com.p314xaae8f345.mm.vfs.w6.h(d18 + e07);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("userThumb decode fail !! ");
                    sb7.append(e07);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MutiImageLoader", sb7.toString());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeMutilMedia", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
                    break;
                }
                break;
                java.lang.String d19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(str5, str4);
                com.p314xaae8f345.mm.vfs.w6.u(d19);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(ca4.z0.u0(linkedList, this.f245735e), 100, android.graphics.Bitmap.CompressFormat.JPEG, d19 + V, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeMutilMedia", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MutiImageLoader", e17, "makeMutilMedia failed: " + V, new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeMutilMedia", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
            }
            str = str3;
            str2 = d17;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.lang.String str6 = str2;
        sb8.append(str6);
        sb8.append(V);
        this.f245734d = ca4.z0.n(sb8.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
        com.p314xaae8f345.mm.p872xbfc2bd01.r rVar = this.f245734d;
        hj6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k1(hj6, 0, str4, rVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MutiImageLoader", "deocde done bm " + this.f245734d + " requestid " + str4 + " " + str6 + V);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String str7 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str7, "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str7, "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        return bool;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f2
    public java.util.concurrent.ExecutorService b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExecutor", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        java.util.concurrent.ExecutorService bj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.bj();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExecutor", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        return bj6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f2
    public void c(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        super.c((java.lang.Boolean) obj);
        java.util.HashSet hashSet = (java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().f245807w;
        java.lang.String str = this.f245733c;
        hashSet.remove(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
        com.p314xaae8f345.mm.p872xbfc2bd01.r rVar = this.f245734d;
        hj6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.m0.f34090x24728b, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        hj6.r0("", str, rVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.m0.f34090x24728b, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
    }
}
