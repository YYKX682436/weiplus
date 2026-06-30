package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class z extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o {

    /* renamed from: c, reason: collision with root package name */
    public r45.za f253186c;

    /* renamed from: d, reason: collision with root package name */
    public int f253187d;

    /* renamed from: e, reason: collision with root package name */
    public r45.c7 f253188e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a0 f253189f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f253190g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f253191h;

    public z(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a0 a0Var) {
        new java.util.ArrayList();
        this.f253187d = 0;
        this.f253190g = "";
        this.f253191h = "";
        this.f253189f = a0Var;
        wa4.e eVar = new wa4.e();
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(abstractActivityC21394xb3d2c0cf);
        eVar.f525752d = f17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistAdapterHelper", "language:%s", f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createCgi", "com.tencent.mm.plugin.sns.snstimeline.GetSnsMasterBackGroundRequest");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 21661;
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsgetmasterbackground";
        lVar.f152197a = eVar;
        lVar.f152198b = new wa4.f();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createCgi", "com.tencent.mm.plugin.sns.snstimeline.GetSnsMasterBackGroundRequest");
        pq5.g l17 = iVar.l();
        l17.f(abstractActivityC21394xb3d2c0cf);
        l17.q(new gm5.a() { // from class: com.tencent.mm.plugin.sns.ui.z$$a
            @Override // gm5.a
            /* renamed from: call */
            public final java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
                com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z.this;
                zVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$new$0", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistAdapterHelper", "GetSnsMasterBackGroundRequest errType:%d errCode:%d", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
                if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                    wa4.f fVar2 = (wa4.f) fVar.f152151d;
                    if (!android.text.TextUtils.isEmpty(zVar.f253191h)) {
                        try {
                            com.p314xaae8f345.mm.vfs.w6.R(zVar.f253191h + zVar.f253190g + "_ARTISTP.mm", fVar2.mo14344x5f01b1f6());
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ArtistAdapterHelper", e17, "save error GetSnsMasterBackGroundResponse", new java.lang.Object[0]);
                        }
                    }
                } else {
                    ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).wi(4, false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$new$0", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                return null;
            }
        });
    }

    public static r45.jj4 d(wa4.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("media2MediaObj", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
        r45.jj4 jj4Var = new r45.jj4();
        jj4Var.f459388d = hVar.f525764d;
        jj4Var.f459389e = hVar.f525765e;
        jj4Var.f459397o = hVar.f525766f;
        jj4Var.f459390f = hVar.f525767g;
        jj4Var.f459396n = hVar.f525768h;
        jj4Var.f459391g = hVar.f525769i;
        jj4Var.f459393i = hVar.f525770m;
        r45.lj4 lj4Var = new r45.lj4();
        lj4Var.f461053d = hVar.f525771n;
        lj4Var.f461054e = hVar.f525772o;
        lj4Var.f461055f = hVar.f525773p;
        jj4Var.f459398p = lj4Var;
        jj4Var.S = hVar.f525774q;
        jj4Var.f459395m = hVar.f525775r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("media2MediaObj", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
        return jj4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o
    public java.util.List b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            arrayList.clear();
            this.f253188e = null;
            java.lang.String str = this.f253191h + this.f253190g + "_ARTISTP.mm";
            if (com.p314xaae8f345.mm.vfs.w6.k(str) > 0) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistAdapterHelper", "loadData from GetSnsMasterBackGroundResponse");
                    byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
                    wa4.f fVar = new wa4.f();
                    java.util.LinkedList linkedList = fVar.f525757e;
                    fVar.mo11468x92b714fd(N);
                    if (!fVar.f525756d && !linkedList.isEmpty()) {
                        wa4.a aVar = (wa4.a) linkedList.get(0);
                        this.f253186c = new r45.za();
                        r45.ab abVar = new r45.ab();
                        abVar.f451412d = d(aVar.f525734d.f525747h.f525763d);
                        r45.za zaVar = this.f253186c;
                        wa4.d dVar = aVar.f525734d;
                        zaVar.f473374d = dVar.f525743d;
                        zaVar.f473375e = dVar.f525744e;
                        zaVar.f473376f = dVar.f525746g;
                        zaVar.f473377g = dVar.f525745f;
                        zaVar.f473378h = abVar;
                        java.util.Iterator it = aVar.f525735e.iterator();
                        while (it.hasNext()) {
                            wa4.c cVar = (wa4.c) it.next();
                            java.lang.String str2 = cVar.f525738d;
                            java.util.Iterator it6 = cVar.f525739e.iterator();
                            while (it6.hasNext()) {
                                r45.jj4 d17 = d((wa4.h) it6.next());
                                d17.f459390f = str2;
                                arrayList.add(d17);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                        return arrayList;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ArtistAdapterHelper", e17, "parse error GetSnsMasterBackGroundResponse", new java.lang.Object[0]);
                }
            }
            java.lang.String str3 = this.f253191h + this.f253190g + "_ARTISTF.mm";
            if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistAdapterHelper", "loadData from finish file");
                this.f253188e = (r45.c7) new r45.c7().mo11468x92b714fd(com.p314xaae8f345.mm.vfs.w6.N(str3, 0, -1));
            }
            if (this.f253188e == null) {
                java.lang.String str4 = this.f253191h + this.f253190g + "_ARTIST.mm";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getXmlfromFile", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                java.lang.String str5 = new java.lang.String(com.p314xaae8f345.mm.vfs.w6.N(str4, 0, (int) com.p314xaae8f345.mm.vfs.w6.k(str4)));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getXmlfromFile", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                this.f253188e = wa4.b.c(str5);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistAdapterHelper", "loadData from finish xml");
                if (this.f253188e == null) {
                    com.p314xaae8f345.mm.vfs.w6.h(str4);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                    return null;
                }
                com.p314xaae8f345.mm.vfs.w6.h(str3);
                com.p314xaae8f345.mm.vfs.w6.R(str3, this.f253188e.mo14344x5f01b1f6());
            }
            r45.c7 c7Var = this.f253188e;
            if (c7Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                return null;
            }
            java.util.Iterator it7 = c7Var.f452874e.iterator();
            while (it7.hasNext()) {
                r45.zt3 zt3Var = (r45.zt3) it7.next();
                java.lang.String str6 = zt3Var.f473898d;
                java.util.Iterator it8 = zt3Var.f473899e.iterator();
                while (it8.hasNext()) {
                    r45.jj4 jj4Var = (r45.jj4) it8.next();
                    jj4Var.f459390f = str6;
                    arrayList.add(jj4Var);
                }
            }
            this.f253186c = this.f253188e.f452873d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
            return arrayList;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ArtistAdapterHelper", e18, "loadData failed.", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o
    public void c(java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i17;
        java.util.List list2 = list;
        java.lang.String str6 = "publicNotify";
        java.lang.String str7 = "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publicNotify", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a0 a0Var = this.f253189f;
        if (a0Var != null) {
            java.lang.String str8 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter";
            java.lang.String str9 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter$1";
            if (list2 != null) {
                java.lang.String str10 = "initFixType";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initFixType", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap.clear();
                hashMap2.clear();
                int size = list.size();
                int i18 = 0;
                int i19 = 0;
                int i27 = 0;
                while (i18 < size) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calNums", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                    java.lang.Object obj = list2.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                    java.lang.String str11 = str6;
                    java.lang.String str12 = ((r45.jj4) obj).f459390f;
                    java.lang.String str13 = str10;
                    int i28 = i18 + 1;
                    if (i28 < size) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                        java.lang.Object obj2 = list2.get(i28);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                        if (str12.equals(((r45.jj4) obj2).f459390f)) {
                            int i29 = i18 + 2;
                            if (i29 < size) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                                java.lang.Object obj3 = list2.get(i29);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                                if (str12.equals(((r45.jj4) obj3).f459390f)) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                                    i17 = 3;
                                    hashMap.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                                    hashMap2.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
                                    i27 += i17;
                                    i18 += i17;
                                    i19++;
                                    str10 = str13;
                                    str6 = str11;
                                } else {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                                }
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                            }
                            i17 = 2;
                            hashMap.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                            hashMap2.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
                            i27 += i17;
                            i18 += i17;
                            i19++;
                            str10 = str13;
                            str6 = str11;
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                    }
                    i17 = 1;
                    hashMap.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                    hashMap2.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
                    i27 += i17;
                    i18 += i17;
                    i19++;
                    str10 = str13;
                    str6 = str11;
                }
                str = str6;
                java.lang.String str14 = str10;
                this.f253187d = i19 + 1;
                int size2 = list.size();
                int i37 = this.f253187d;
                r45.za zaVar = this.f253186c;
                java.lang.String str15 = "onFinishFixPos";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinishFixPos", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y yVar = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q) a0Var).f251823a;
                yVar.getClass();
                java.lang.String str16 = "setMediaList";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMediaList", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
                if (list.size() <= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaList", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
                    str3 = "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper";
                    str4 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter$1";
                    str5 = "onFinishFixPos";
                } else {
                    try {
                        r45.za zaVar2 = (r45.za) new r45.za().mo11468x92b714fd(zaVar.mo14344x5f01b1f6());
                        yVar.f253136q = zaVar2;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p0) yVar.f253134o).a(zaVar2);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ArtistAdapter", e17, "", new java.lang.Object[0]);
                    }
                    int size3 = list.size();
                    java.util.ArrayList arrayList = (java.util.ArrayList) yVar.f253127e;
                    arrayList.clear();
                    java.util.HashMap hashMap3 = (java.util.HashMap) yVar.f253128f;
                    hashMap3.clear();
                    java.util.HashMap hashMap4 = (java.util.HashMap) yVar.f253129g;
                    hashMap4.clear();
                    int i38 = 0;
                    while (i38 < size3) {
                        int i39 = size3;
                        r45.jj4 jj4Var = (r45.jj4) list2.get(i38);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
                        r45.jj4 h17 = m21.y.h(jj4Var.f459388d, jj4Var.f459389e, jj4Var.f459391g, jj4Var.f459393i, jj4Var.f459392h, jj4Var.f459395m, jj4Var.f459390f);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
                        arrayList.add(h17);
                        i38++;
                        list2 = list;
                        str7 = str7;
                        size3 = i39;
                        str9 = str9;
                        str15 = str15;
                        str8 = str8;
                        str16 = str16;
                        i37 = i37;
                        size2 = size2;
                    }
                    int i47 = size2;
                    str3 = str7;
                    int i48 = i37;
                    java.lang.String str17 = str8;
                    java.lang.String str18 = str9;
                    java.lang.String str19 = str15;
                    java.lang.String str20 = str16;
                    java.util.Iterator it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Integer) it.next()).intValue();
                        hashMap3.put(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(intValue))).intValue()));
                    }
                    java.util.Iterator it6 = hashMap2.keySet().iterator();
                    while (it6.hasNext()) {
                        int intValue2 = ((java.lang.Integer) it6.next()).intValue();
                        hashMap4.put(java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(((java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(intValue2))).intValue()));
                    }
                    list.clear();
                    hashMap.clear();
                    hashMap2.clear();
                    yVar.f253131i = i47;
                    yVar.f253130h = i48;
                    yVar.notifyDataSetChanged();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str20, str17);
                    str4 = str18;
                    str5 = str19;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                str2 = str3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str14, str2);
            } else {
                str = "publicNotify";
                str2 = "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNothingGet", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y yVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q) a0Var).f251823a;
                yVar2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("nothingGet", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r rVar = yVar2.f253134o;
                if (rVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNothingBgGet", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
                    int i49 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b.f247734r;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b activityC17940xbaa2983b = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p0) rVar).f251669a;
                    activityC17940xbaa2983b.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC17940xbaa2983b.f247739h;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    if (u3Var != null) {
                        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).wi(4, true);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNothingBgGet", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("nothingGet", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNothingGet", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$1");
            }
        } else {
            str = "publicNotify";
            str2 = "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}
