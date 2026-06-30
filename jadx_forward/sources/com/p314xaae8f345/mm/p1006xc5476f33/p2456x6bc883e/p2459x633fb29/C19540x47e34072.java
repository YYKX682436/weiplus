package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask */
/* loaded from: classes8.dex */
public class C19540x47e34072 extends com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072> f38793x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p();

    /* renamed from: h, reason: collision with root package name */
    public int f269876h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda f269877i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f269878m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19539x5f5d0071 f269879n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 f269880o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f269881p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f269882q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f269883r;

    public /* synthetic */ C19540x47e34072(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p pVar) {
        this(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287
    public void B(android.os.Parcel parcel) {
        this.f269876h = parcel.readInt();
        this.f269877i = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda.class.getClassLoader());
        if (this.f269878m == null) {
            this.f269878m = new java.util.ArrayList();
        }
        parcel.readList(this.f269878m, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda.class.getClassLoader());
        this.f269880o = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27.class.getClassLoader());
        if (this.f269881p == null) {
            this.f269881p = new java.util.ArrayList();
        }
        parcel.readList(this.f269881p, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27.class.getClassLoader());
        this.f269882q = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287
    public void C(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f269876h);
        parcel.writeParcelable(this.f269877i, i17);
        if (this.f269878m == null) {
            this.f269878m = new java.util.ArrayList();
        }
        parcel.writeList(this.f269878m);
        parcel.writeParcelable(this.f269880o, i17);
        if (this.f269881p == null) {
            this.f269881p = new java.util.ArrayList();
        }
        parcel.writeList(this.f269881p);
        parcel.writeString(this.f269882q);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.f269883r;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        wz4.e D0;
        android.database.Cursor m145256x1d3f4980;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i17 = this.f269876h;
        boolean z17 = true;
        if (i17 == 1001) {
            this.f269866f = true;
        } else if (i17 != 1002) {
            switch (i17) {
                case 2002:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda = this.f269877i;
                    if (c19543x781c5eda != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19543x781c5eda.f269907d)) {
                        wz4.f L0 = wz4.f.L0();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda2 = this.f269877i;
                        c19543x781c5eda2.getClass();
                        wz4.e eVar = new wz4.e();
                        eVar.f67980x29a55882 = c19543x781c5eda2.f269907d;
                        eVar.f67963x28d45f97 = c19543x781c5eda2.f269908e;
                        eVar.f67986x8987ca93 = c19543x781c5eda2.f269909f;
                        eVar.f67981x55b471cc = c19543x781c5eda2.f269910g;
                        eVar.f67971x721c7dc0 = c19543x781c5eda2.f269911h;
                        eVar.f67968xebe402d1 = c19543x781c5eda2.f269912i;
                        eVar.f67967xb432ae55 = c19543x781c5eda2.f269913m;
                        eVar.f67978x98b09cbf = c19543x781c5eda2.f269914n;
                        eVar.f67972xf6c703a9 = c19543x781c5eda2.f269915o;
                        eVar.f67976x4b6e68b9 = c19543x781c5eda2.f269916p;
                        eVar.f67975x238eb002 = c19543x781c5eda2.f269917q;
                        eVar.f67982x55b5eda8 = c19543x781c5eda2.f269918r;
                        eVar.f67973xd4f0ff8a = c19543x781c5eda2.f269919s;
                        eVar.f67977xa5c53bd = c19543x781c5eda2.f269920t;
                        eVar.f67969xac3be4e = c19543x781c5eda2.f269921u;
                        eVar.f67966xa0a00f07 = c19543x781c5eda2.f269922v;
                        eVar.f67965xe96d84d8 = c19543x781c5eda2.f269923w;
                        eVar.f67984xc5b53450 = c19543x781c5eda2.f269924x;
                        eVar.f67983xd4c8d11e = c19543x781c5eda2.f269925y;
                        eVar.f67985xcf3a6fe8 = c19543x781c5eda2.f269926z;
                        eVar.f67974x5fb864a5 = c19543x781c5eda2.A;
                        if (L0.f532336d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f67980x29a55882)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19539x5f5d0071 c19539x5f5d0071 = this.f269879n;
                            if (c19539x5f5d0071 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19539x5f5d0071.f269872h) && (D0 = wz4.f.L0().D0(eVar.f67980x29a55882)) != null && com.p314xaae8f345.mm.vfs.w6.j(D0.f67981x55b471cc)) {
                                c19539x5f5d0071.f269868d = D0.f67980x29a55882;
                                c19539x5f5d0071.f269869e = D0.f67986x8987ca93;
                                c19539x5f5d0071.f269870f = D0.f67981x55b471cc;
                                wz4.b.z0().d(c19539x5f5d0071.f269868d);
                                wz4.b z07 = wz4.b.z0();
                                wz4.a aVar = new wz4.a();
                                aVar.f67173x29a55882 = c19539x5f5d0071.f269868d;
                                aVar.f67172x3e015116 = c19539x5f5d0071.f269869e;
                                aVar.f67171x2258c8a7 = c19539x5f5d0071.f269870f;
                                aVar.f67175x8987ca93 = c19539x5f5d0071.f269871g;
                                aVar.f67169x238eb002 = c19539x5f5d0071.f269872h;
                                aVar.f67170x4b6e68b9 = c19539x5f5d0071.f269873i;
                                aVar.f67174x55b5eda8 = c19539x5f5d0071.f269874m;
                                aVar.f67168xd4f0ff8a = c19539x5f5d0071.f269875n;
                                z07.mo880xb970c2b9(aVar);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "insertDiffPkg");
                            }
                            wz4.f.L0().z0(eVar.f67980x29a55882);
                            wz4.d.J0().y0(eVar.f67980x29a55882);
                            java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
                            eVar.f67977xa5c53bd = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + eVar.f67967xb432ae55;
                            eVar.f67969xac3be4e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                            eVar.f67962x75155eb6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "insertPkgVersion pkgid:%s, version:%s, ret:%s", eVar.f67980x29a55882, eVar.f67986x8987ca93, java.lang.Boolean.valueOf(L0.mo880xb970c2b9(eVar)));
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f269881p)) {
                            for (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 c19542xf3901c27 : this.f269881p) {
                                if (c19542xf3901c27 != null) {
                                    wz4.d J0 = wz4.d.J0();
                                    wz4.c cVar = new wz4.c();
                                    cVar.f67861x4b6e619a = c19542xf3901c27.f269895d;
                                    java.lang.String str2 = c19542xf3901c27.f269896e;
                                    cVar.f67864x29a55882 = str2;
                                    cVar.f67867x8987ca93 = c19542xf3901c27.f269897f;
                                    cVar.f67860xf1e9b966 = c19542xf3901c27.f269898g;
                                    java.lang.String str3 = c19542xf3901c27.f269899h;
                                    cVar.f67865x4b6e7c48 = str3;
                                    cVar.f67863xcac8f733 = c19542xf3901c27.f269900i;
                                    cVar.f67862x4b6e68b9 = c19542xf3901c27.f269901m;
                                    cVar.f67858x238eb002 = c19542xf3901c27.f269902n;
                                    cVar.f67866x22618426 = c19542xf3901c27.f269903o;
                                    cVar.f67857xd4f0ff8a = c19542xf3901c27.f269904p;
                                    cVar.f67855xdf7ba986 = c19542xf3901c27.f269905q;
                                    cVar.f67856xac3be4e = c19542xf3901c27.f269906r;
                                    if (J0.f532332d) {
                                        if (J0.D0(str2, str3) == null) {
                                            java.lang.Object obj2 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
                                            cVar.f67856xac3be4e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "insertPreloadFile pkgid:%s, version:%s, rid:%s, ret:%s", cVar.f67864x29a55882, cVar.f67867x8987ca93, cVar.f67865x4b6e7c48, java.lang.Boolean.valueOf(J0.mo880xb970c2b9(cVar)));
                                        } else {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "relacePreloadFile pkgid:%s, version:%s, rid:%s, ret:%s", cVar.f67864x29a55882, cVar.f67867x8987ca93, cVar.f67865x4b6e7c48, java.lang.Boolean.valueOf(J0.mo11260x413cb2b4(cVar)));
                                        }
                                    }
                                }
                            }
                        }
                        this.f269866f = true;
                        break;
                    }
                    break;
                case 2003:
                    java.lang.String str4 = null;
                    if (this.f269877i != null) {
                        wz4.f L02 = wz4.f.L0();
                        if (L02.f532336d) {
                            android.database.Cursor m145256x1d3f49802 = L02.m145256x1d3f4980(java.lang.String.format("select * from %s where %s=0 and %s=1 and %s<1 and %s<?", "WepkgVersion", "bigPackageReady", "preloadFilesAtomic", "autoDownloadCount", "packageDownloadCount"), java.lang.String.valueOf(3));
                            if (m145256x1d3f49802 != null) {
                                if (m145256x1d3f49802.moveToFirst()) {
                                    int count = m145256x1d3f49802.getCount();
                                    m145256x1d3f49802.move(count > 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R(count - 1, 0) : 0);
                                    wz4.e eVar2 = new wz4.e();
                                    eVar2.mo9015xbf5d97fd(m145256x1d3f49802);
                                    m145256x1d3f49802.close();
                                    L02.y0(eVar2.f67980x29a55882);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, bigPackageReady:false, preloadFilesAtomic:true", eVar2.f67980x29a55882, eVar2.f67986x8987ca93);
                                    str4 = eVar2.f67980x29a55882;
                                } else {
                                    m145256x1d3f49802.close();
                                    android.database.Cursor m145256x1d3f49803 = L02.m145256x1d3f4980(java.lang.String.format("select * from %s where %s=0 and %s<1 and %s<?", "WepkgVersion", "bigPackageReady", "autoDownloadCount", "packageDownloadCount"), java.lang.String.valueOf(3));
                                    if (m145256x1d3f49803 != null) {
                                        if (m145256x1d3f49803.moveToFirst()) {
                                            int count2 = m145256x1d3f49803.getCount();
                                            m145256x1d3f49803.move(count2 > 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R(count2 - 1, 0) : 0);
                                            wz4.e eVar3 = new wz4.e();
                                            eVar3.mo9015xbf5d97fd(m145256x1d3f49803);
                                            m145256x1d3f49803.close();
                                            L02.y0(eVar3.f67980x29a55882);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, bigPackageReady:false, preloadFilesAtomic:false", eVar3.f67980x29a55882, eVar3.f67986x8987ca93);
                                            str4 = eVar3.f67980x29a55882;
                                        } else {
                                            m145256x1d3f49803.close();
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid no download record in DB");
                                        }
                                    }
                                }
                            }
                            str4 = null;
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                            wz4.d J02 = wz4.d.J0();
                            boolean z18 = J02.f532332d;
                            if (z18 && (m145256x1d3f4980 = J02.m145256x1d3f4980(java.lang.String.format("select * from %s where %s=0 and %s<1 and %s<?", "WepkgPreloadFiles", "completeDownload", "autoDownloadCount", "fileDownloadCount"), java.lang.String.valueOf(3))) != null) {
                                if (m145256x1d3f4980.moveToFirst()) {
                                    int count3 = m145256x1d3f4980.getCount();
                                    m145256x1d3f4980.move(count3 > 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R(count3 - 1, 0) : 0);
                                    wz4.c cVar2 = new wz4.c();
                                    cVar2.mo9015xbf5d97fd(m145256x1d3f4980);
                                    m145256x1d3f4980.close();
                                    java.lang.String str5 = cVar2.f67864x29a55882;
                                    java.lang.String str6 = cVar2.f67865x4b6e7c48;
                                    if (z18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord addAutoDownloadCount ret:%s", java.lang.Boolean.valueOf(J02.m145253xb158737d("WepkgPreloadFiles", java.lang.String.format("update %s set %s=%s+1 where %s='%s' and %s='%s'", "WepkgPreloadFiles", "autoDownloadCount", "autoDownloadCount", "pkgId", str5, "rid", str6))));
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, rid:%s", cVar2.f67864x29a55882, cVar2.f67867x8987ca93, cVar2.f67865x4b6e7c48);
                                    str = cVar2.f67864x29a55882;
                                    str4 = str;
                                } else {
                                    m145256x1d3f4980.close();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid no download record in DB");
                                }
                            }
                            str = null;
                            str4 = str;
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                            wz4.f L03 = wz4.f.L0();
                            if (L03.f532336d) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord resetAutoDownloadCount ret:%s", java.lang.Boolean.valueOf(L03.m145253xb158737d("WepkgVersion", java.lang.String.format("update %s set %s=0", "WepkgVersion", "autoDownloadCount"))));
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgPreloadFilesRecord resetAutoDownloadCount ret:%s", java.lang.Boolean.valueOf(L03.m145253xb158737d("WepkgPreloadFiles", java.lang.String.format("update %s set %s=0", "WepkgPreloadFiles", "autoDownloadCount"))));
                            }
                        }
                        this.f269877i.f269907d = str4;
                        break;
                    }
                    break;
                case 2004:
                    if (this.f269877i != null) {
                        this.f269866f = wz4.f.L0().P0(this.f269877i.f269907d);
                        break;
                    }
                    break;
                case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111 /* 2005 */:
                    wz4.f L04 = wz4.f.L0();
                    if (L04.f532336d) {
                        java.lang.String format = java.lang.String.format("select * from %s where %s < ? - %s", "WepkgVersion", "accessTime", "clearPkgTime");
                        java.lang.Object obj3 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
                        android.database.Cursor m145256x1d3f49804 = L04.m145256x1d3f4980(format, java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "getNeedCleanRecords queryStr:%s", format);
                        if (m145256x1d3f49804 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "cursor is null");
                        } else if (m145256x1d3f49804.moveToFirst()) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            do {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda();
                                wz4.e eVar4 = new wz4.e();
                                eVar4.mo9015xbf5d97fd(m145256x1d3f49804);
                                c19543x781c5eda3.b(eVar4);
                                arrayList3.add(c19543x781c5eda3);
                            } while (m145256x1d3f49804.moveToNext());
                            m145256x1d3f49804.close();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "record list size:%s", java.lang.Integer.valueOf(arrayList3.size()));
                            arrayList = arrayList3;
                            this.f269878m = arrayList;
                            this.f269866f = true;
                            break;
                        } else {
                            m145256x1d3f49804.close();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "no record");
                        }
                    }
                    arrayList = null;
                    this.f269878m = arrayList;
                    this.f269866f = true;
                case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46357xe9bcaf57 /* 2006 */:
                    if (this.f269877i != null) {
                        wz4.f L05 = wz4.f.L0();
                        java.lang.String str7 = this.f269877i.f269907d;
                        if (!L05.f532336d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                            z17 = false;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addTotalDownloadCount ret:%s", java.lang.Boolean.valueOf(L05.m145253xb158737d("WepkgVersion", java.lang.String.format("update %s set %s=%s+1 where %s='%s'", "WepkgVersion", "totalDownloadCount", "totalDownloadCount", "pkgId", str7))));
                        }
                        this.f269866f = z17;
                        break;
                    }
                    break;
                default:
                    switch (i17) {
                        case 3001:
                            if (this.f269877i != null) {
                                wz4.e D02 = wz4.f.L0().D0(this.f269877i.f269907d);
                                if (D02 != null) {
                                    this.f269877i.b(D02);
                                    this.f269866f = true;
                                    break;
                                } else {
                                    this.f269877i = null;
                                    break;
                                }
                            }
                            break;
                        case 3002:
                            if (this.f269877i != null) {
                                wz4.e J03 = wz4.f.L0().J0(this.f269877i.f269907d);
                                if (J03 != null) {
                                    this.f269877i.b(J03);
                                    this.f269866f = true;
                                    break;
                                } else {
                                    this.f269877i = null;
                                    break;
                                }
                            }
                            break;
                        case 3003:
                            if (this.f269877i != null) {
                                this.f269866f = wz4.f.L0().b1(this.f269877i.f269907d);
                                break;
                            }
                            break;
                        case 3004:
                            if (this.f269877i != null) {
                                wz4.f L06 = wz4.f.L0();
                                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda4 = this.f269877i;
                                this.f269866f = L06.d1(c19543x781c5eda4.f269907d, c19543x781c5eda4.f269911h, c19543x781c5eda4.f269912i, c19543x781c5eda4.f269913m);
                                break;
                            }
                            break;
                        case 3005:
                            if (this.f269877i != null) {
                                wz4.f L07 = wz4.f.L0();
                                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda5 = this.f269877i;
                                this.f269866f = L07.W0(c19543x781c5eda5.f269907d, c19543x781c5eda5.f269910g, c19543x781c5eda5.f269923w);
                                break;
                            }
                            break;
                        case 3006:
                            if (this.f269877i != null) {
                                wz4.f L08 = wz4.f.L0();
                                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda6 = this.f269877i;
                                this.f269866f = L08.i1(c19543x781c5eda6.f269907d, c19543x781c5eda6.f269924x);
                                break;
                            }
                            break;
                        case com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872.f46687xbf7f413d /* 3007 */:
                            if (this.f269877i != null) {
                                this.f269866f = wz4.f.L0().f1(this.f269877i.f269907d);
                                break;
                            }
                            break;
                        case com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872.f46686x2e37038e /* 3008 */:
                            if (this.f269877i != null) {
                                wz4.f L09 = wz4.f.L0();
                                java.lang.String str8 = this.f269877i.f269907d;
                                if (!L09.f532336d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
                                    z17 = false;
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addPackageDownloadCount ret:%s", java.lang.Boolean.valueOf(L09.m145253xb158737d("WepkgVersion", java.lang.String.format("update %s set %s=%s+1 where %s='%s'", "WepkgVersion", "packageDownloadCount", "packageDownloadCount", "pkgId", str8))));
                                }
                                this.f269866f = z17;
                                break;
                            }
                            break;
                        case 3009:
                            if (this.f269877i != null) {
                                wz4.f L010 = wz4.f.L0();
                                java.lang.String str9 = this.f269877i.f269907d;
                                if (!L010.f532336d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
                                    z17 = false;
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord resetPackageDownloadCount ret:%s", java.lang.Boolean.valueOf(L010.m145253xb158737d("WepkgVersion", java.lang.String.format("update %s set %s=0 where %s='%s'", "WepkgVersion", "packageDownloadCount", "pkgId", str9))));
                                }
                                this.f269866f = z17;
                                break;
                            }
                            break;
                        default:
                            switch (i17) {
                                case 4001:
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda7 = this.f269877i;
                                    if (c19543x781c5eda7 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19543x781c5eda7.f269907d)) {
                                        try {
                                            this.f269881p = wz4.d.J0().z0(this.f269877i.f269907d);
                                        } catch (java.lang.Exception unused) {
                                        }
                                        this.f269866f = true;
                                        break;
                                    }
                                    break;
                                case 4002:
                                    if (this.f269880o != null) {
                                        wz4.d J04 = wz4.d.J0();
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 c19542xf3901c272 = this.f269880o;
                                        this.f269866f = J04.L0(c19542xf3901c272.f269896e, c19542xf3901c272.f269899h, c19542xf3901c272.f269898g, c19542xf3901c272.f269905q);
                                        break;
                                    }
                                    break;
                                case com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7529x7d0fa359 /* 4003 */:
                                    if (this.f269877i != null) {
                                        wz4.d J05 = wz4.d.J0();
                                        java.lang.String str10 = this.f269877i.f269907d;
                                        if (J05.f532332d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str10)) {
                                            java.lang.String format2 = java.lang.String.format("select * from %s where %s=?", "WepkgPreloadFiles", "pkgId");
                                            android.database.Cursor m145256x1d3f49805 = J05.m145256x1d3f4980(format2, str10);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getPreLoadFileList queryStr:%s", format2);
                                            if (m145256x1d3f49805 == null) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "cursor is null");
                                            } else if (m145256x1d3f49805.moveToFirst()) {
                                                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                                do {
                                                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 c19542xf3901c273 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27();
                                                    wz4.c cVar3 = new wz4.c();
                                                    cVar3.mo9015xbf5d97fd(m145256x1d3f49805);
                                                    c19542xf3901c273.b(cVar3);
                                                    arrayList4.add(c19542xf3901c273);
                                                } while (m145256x1d3f49805.moveToNext());
                                                m145256x1d3f49805.close();
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "record list size:%s", java.lang.Integer.valueOf(arrayList4.size()));
                                                arrayList2 = arrayList4;
                                                this.f269881p = arrayList2;
                                                this.f269866f = true;
                                                break;
                                            } else {
                                                m145256x1d3f49805.close();
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "no record");
                                            }
                                        }
                                        arrayList2 = null;
                                        this.f269881p = arrayList2;
                                        this.f269866f = true;
                                    }
                                    break;
                                case com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7532x3a129d88 /* 4004 */:
                                    if (this.f269880o != null) {
                                        wz4.d J06 = wz4.d.J0();
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 c19542xf3901c274 = this.f269880o;
                                        wz4.c D03 = J06.D0(c19542xf3901c274.f269896e, c19542xf3901c274.f269899h);
                                        if (D03 != null) {
                                            this.f269880o.b(D03);
                                            this.f269866f = true;
                                            break;
                                        } else {
                                            this.f269880o = null;
                                            break;
                                        }
                                    }
                                    break;
                                case com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7528x16eb0541 /* 4005 */:
                                    if (this.f269880o != null) {
                                        wz4.d J07 = wz4.d.J0();
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 c19542xf3901c275 = this.f269880o;
                                        java.lang.String str11 = c19542xf3901c275.f269896e;
                                        java.lang.String str12 = c19542xf3901c275.f269899h;
                                        if (!J07.f532332d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12)) {
                                            z17 = false;
                                        } else {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord addFileDownloadCount ret:%s", java.lang.Boolean.valueOf(J07.m145253xb158737d("WepkgPreloadFiles", java.lang.String.format("update %s set %s=%s+1 where %s='%s' and %s='%s'", "WepkgPreloadFiles", "fileDownloadCount", "fileDownloadCount", "pkgId", str11, "rid", str12))));
                                        }
                                        this.f269866f = z17;
                                        break;
                                    }
                                    break;
                                case com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7530xe5db58ec /* 4006 */:
                                    if (this.f269880o != null) {
                                        wz4.d J08 = wz4.d.J0();
                                        java.lang.String str13 = this.f269880o.f269896e;
                                        if (!J08.f532332d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str13)) {
                                            z17 = false;
                                        } else {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord resetFileDownloadCount ret:%s", java.lang.Boolean.valueOf(J08.m145253xb158737d("WepkgPreloadFiles", java.lang.String.format("update %s set %s=0 where %s='%s'", "WepkgPreloadFiles", "fileDownloadCount", "pkgId", str13))));
                                        }
                                        this.f269866f = z17;
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        } else {
            this.f269866f = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.a();
        }
        c();
    }

    public C19540x47e34072() {
        this.f269876h = -1;
        this.f269877i = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda();
        this.f269878m = new java.util.ArrayList();
        this.f269879n = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19539x5f5d0071();
        this.f269880o = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27();
        this.f269881p = new java.util.ArrayList();
    }

    private C19540x47e34072(android.os.Parcel parcel) {
        v(parcel);
    }
}
