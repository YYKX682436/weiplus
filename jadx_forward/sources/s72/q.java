package s72;

/* loaded from: classes12.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f485668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f485669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f485670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.List list, java.lang.String str, s72.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f485668d = list;
        this.f485669e = str;
        this.f485670f = j0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new s72.q(this.f485668d, this.f485669e, this.f485670f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        s72.h hVar;
        java.util.List list;
        int i17;
        int i18;
        boolean b76;
        s72.j0 j0Var;
        boolean z17;
        java.lang.String str2;
        java.util.List list2;
        java.lang.String str3;
        r45.tp0 tp0Var;
        java.lang.String str4;
        r45.bq0 bq0Var;
        boolean z18;
        s72.q qVar = this;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str5 = "";
        s72.h hVar2 = new s72.h(0, "", 0, 0);
        java.util.List list3 = qVar.f485668d;
        int size = list3.size();
        int i19 = 0;
        while (i19 < size) {
            r45.tp0 tp0Var2 = (r45.tp0) list3.get(i19);
            o72.d3 d3Var = o72.d3.f424854a;
            boolean p17 = o72.d3.f424857d.p();
            boolean z19 = o72.d3.f424858e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handleBatchGetXml] source=");
            java.lang.String str6 = qVar.f485669e;
            sb6.append(str6);
            sb6.append(", favId=");
            sb6.append(tp0Var2.f468171d);
            sb6.append(", status=");
            sb6.append(tp0Var2.f468172e);
            sb6.append(", needNextPage=");
            sb6.append(tp0Var2.f468178n);
            sb6.append(", needCheckXmlValid=");
            sb6.append(p17);
            sb6.append(", isLogicOpOpen=");
            sb6.append(z19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", sb6.toString());
            boolean z27 = true;
            if (z19) {
                str = str5;
                if (tp0Var2.f468179o == 9001) {
                    o72.r2 re6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(tp0Var2.f468171d);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[handleBatchGetXml] source=");
                    sb7.append(str6);
                    sb7.append(", status detail not found, favId=");
                    sb7.append(tp0Var2.f468171d);
                    sb7.append(", localId=");
                    sb7.append(re6 != null ? new java.lang.Long(re6.f67645x88be67a1) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSyncService", sb7.toString());
                    s72.j0.f485602i.add(new java.lang.Integer(tp0Var2.f468171d));
                    if ((tp0Var2.f468174g & 1) != 0) {
                        o72.x1.k(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(tp0Var2.f468171d), null, 4);
                    }
                    hVar = hVar2;
                    list = list3;
                    i17 = size;
                    i18 = i19;
                    i19 = i18 + 1;
                    qVar = this;
                    hVar2 = hVar;
                    str5 = str;
                    size = i17;
                    list3 = list;
                }
            } else {
                str = str5;
            }
            if (tp0Var2.f468172e == 0 && tp0Var2.f468178n == 0) {
                s72.j0 j0Var2 = qVar.f485670f;
                if (z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[handleBatchGetXml] new, source=" + str6 + ", favId=" + tp0Var2.f468171d);
                    java.util.HashSet hashSet = s72.j0.f485602i;
                    j0Var2.getClass();
                    o72.r2 re7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re((long) tp0Var2.f468171d);
                    if (re7 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSyncService", "[handleBatchGetXmlNew] item = null, continue, source=" + str6);
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tp0Var2.f468173f)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSyncService", "[handleBatchGetXml] xml is null, continue, favId=" + tp0Var2.f468171d + ", source=" + str6);
                        pm0.z.a(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.d1.f239691b, "batchget_xml_empty", true, null, null, false, false, new s72.v(str6, tp0Var2), 60, null);
                    } else {
                        if (re7.f67657x2262335f == 18) {
                            r45.bq0 bq0Var2 = re7.f67640x5ab01132;
                            if ((bq0Var2 != null ? bq0Var2.E : 0) > 0 && !re7.I0()) {
                                o72.r2 r2Var = new o72.r2();
                                list2 = list3;
                                i17 = size;
                                r2Var.f67645x88be67a1 = re7.f67645x88be67a1;
                                r2Var.f67643xc8a07680 = tp0Var2.f468171d;
                                r2Var.f67658x266f95d1 = tp0Var2.f468176i;
                                java.lang.String str7 = tp0Var2.f468173f;
                                r2Var.f67660x4b6e9352 = str7;
                                if (o72.d2.a(str7)) {
                                    boolean U0 = r2Var.U0(tp0Var2.f468173f);
                                    if (!p17 || U0) {
                                        boolean z28 = re7.f67644x3059914a != 13 && (re7.Q0() || re7.P0());
                                        r45.bq0 bq0Var3 = re7.f67640x5ab01132;
                                        if (bq0Var3 != null) {
                                            str3 = bq0Var3.R;
                                            list = list2;
                                        } else {
                                            list = list2;
                                            str3 = null;
                                        }
                                        r45.bq0 bq0Var4 = r2Var.f67640x5ab01132;
                                        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, bq0Var4 != null ? bq0Var4.R : null);
                                        i18 = i19;
                                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[checkConflict] isClientUploadingOrFailed=");
                                        sb8.append(z28);
                                        sb8.append(", isSameDevice=");
                                        sb8.append(b17);
                                        sb8.append(", favId=");
                                        sb8.append(r2Var.f67643xc8a07680);
                                        sb8.append(", localId=");
                                        s72.h hVar3 = hVar2;
                                        j0Var = j0Var2;
                                        sb8.append(re7.f67645x88be67a1);
                                        sb8.append(", type=");
                                        sb8.append(re7.f67657x2262335f);
                                        sb8.append(", status=");
                                        sb8.append(re7.f67644x3059914a);
                                        sb8.append(", clientDeviceId=");
                                        r45.bq0 bq0Var5 = re7.f67640x5ab01132;
                                        sb8.append(bq0Var5 != null ? bq0Var5.R : null);
                                        sb8.append(", serverDeviceId=");
                                        r45.bq0 bq0Var6 = r2Var.f67640x5ab01132;
                                        sb8.append(bq0Var6 != null ? bq0Var6.R : null);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", sb8.toString());
                                        r45.bq0 bq0Var7 = re7.f67640x5ab01132;
                                        if (bq0Var7 == null || (bq0Var = r2Var.f67640x5ab01132) == null) {
                                            hVar = hVar3;
                                            tp0Var = tp0Var2;
                                            z17 = p17;
                                            str4 = str6;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSyncService", "[checkConflict] favProto is null");
                                            z27 = false;
                                        } else {
                                            if (!z28) {
                                                hVar = hVar3;
                                                z18 = false;
                                            } else if (b17) {
                                                hVar = hVar3;
                                                int i27 = bq0Var.E;
                                                int i28 = bq0Var7.E;
                                                if (i27 == i28) {
                                                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[checkConflict] conflict from same device same version, localId=");
                                                    tp0Var = tp0Var2;
                                                    z17 = p17;
                                                    sb9.append(re7.f67645x88be67a1);
                                                    sb9.append(", favId=");
                                                    sb9.append(re7.f67643xc8a07680);
                                                    sb9.append(", serverSeq=");
                                                    sb9.append(r2Var.f67658x266f95d1);
                                                    sb9.append(", updateSeq=");
                                                    sb9.append(re7.f67658x266f95d1);
                                                    sb9.append(", localSeq=");
                                                    sb9.append(re7.f67646x8f0eb299);
                                                    sb9.append(", version=");
                                                    sb9.append(i28);
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", sb9.toString());
                                                    re7.f67646x8f0eb299 = re7.f67658x266f95d1;
                                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(re7, dm.i4.f66867x2a5c95c7);
                                                    str4 = str6;
                                                } else {
                                                    tp0Var = tp0Var2;
                                                    z17 = p17;
                                                    if (i27 > i28) {
                                                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("[checkConflict] server version bigger than local, localId=");
                                                        str4 = str6;
                                                        sb10.append(re7.f67645x88be67a1);
                                                        sb10.append(", favId=");
                                                        sb10.append(re7.f67643xc8a07680);
                                                        sb10.append(", serverSeq=");
                                                        sb10.append(r2Var.f67658x266f95d1);
                                                        sb10.append(", updateSeq=");
                                                        sb10.append(re7.f67658x266f95d1);
                                                        sb10.append(", localSeq=");
                                                        sb10.append(re7.f67646x8f0eb299);
                                                        sb10.append(", clientVersion=");
                                                        sb10.append(i28);
                                                        sb10.append(", serverVersion=");
                                                        sb10.append(i27);
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", sb10.toString());
                                                        re7.f67640x5ab01132.s(i27);
                                                        re7.f67646x8f0eb299 = re7.f67658x266f95d1;
                                                        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(re7, dm.i4.f66867x2a5c95c7);
                                                        ((a40.i) ((o72.u3) i95.n0.c(o72.u3.class))).getClass();
                                                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.a(re7);
                                                    } else {
                                                        str4 = str6;
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSyncService", "[checkConflict] server version (" + i27 + ") < client version (" + i28 + ')');
                                                    }
                                                }
                                            } else {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[checkConflict] add failed item as new item");
                                                o72.u3 u3Var = (o72.u3) i95.n0.c(o72.u3.class);
                                                r45.bq0 bq0Var8 = re7.f67640x5ab01132;
                                                java.lang.String str8 = bq0Var8 != null ? bq0Var8.f452505q : null;
                                                if (str8 == null) {
                                                    str8 = str;
                                                }
                                                java.lang.String wi6 = ((a40.i) u3Var).wi(str8);
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[addClientItemAsNewItem] originFavId=" + re7.f67643xc8a07680 + ", originLocalId=" + re7.f67645x88be67a1 + ", conflictTitle=" + wi6);
                                                z18 = false;
                                                re7.f67643xc8a07680 = 0;
                                                hVar = hVar3;
                                                re7.f67645x88be67a1 = 0L;
                                                re7.f67646x8f0eb299 = 0;
                                                re7.f67658x266f95d1 = 0;
                                                re7.f67640x5ab01132.p(wi6);
                                                ((a40.i) ((o72.u3) i95.n0.c(o72.u3.class))).getClass();
                                                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.a(re7);
                                            }
                                            z27 = z18;
                                            tp0Var = tp0Var2;
                                            z17 = p17;
                                            str4 = str6;
                                        }
                                        if (z27) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSyncService", "[handleBatchGetXml] is conflict, source=" + str4 + ", favId=" + r2Var.f67643xc8a07680 + ", xml=" + tp0Var.f468173f);
                                            b76 = false;
                                        } else {
                                            tp0Var2 = tp0Var;
                                            str2 = str4;
                                            b76 = j0Var.b7(tp0Var2, hVar, z17, str2);
                                        }
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSyncService", "[handleBatchGetXml] xml illegal, source=" + str6 + ", favId=" + tp0Var2.f468171d + ", updateTime=" + tp0Var2.f468175h + ", updateSeq=" + tp0Var2.f468176i + "xml=" + tp0Var2.f468173f);
                                        pm0.z.a(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.d1.f239691b, "batchget_xml_invalid", true, null, null, false, false, new s72.x(str6, tp0Var2), 60, null);
                                    }
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSyncService", "[handleBatchGetXml] check illegal, source=" + str6 + ", xml = " + tp0Var2.f468173f);
                                    hVar2.f485579a = hVar2.f485579a + 1;
                                    java.lang.String field_xml = r2Var.f67660x4b6e9352;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_xml, "field_xml");
                                    hVar2.f485580b = field_xml;
                                    pm0.z.a(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.d1.f239691b, "batchget_xml_invalid_android_old", true, null, null, false, false, new s72.w(str6, tp0Var2), 60, null);
                                }
                                i18 = i19;
                                list = list2;
                                b76 = false;
                                hVar = hVar2;
                            }
                        }
                        hVar = hVar2;
                        j0Var = j0Var2;
                        list = list3;
                        i17 = size;
                        i18 = i19;
                        z17 = p17;
                        str2 = str6;
                        b76 = j0Var.b7(tp0Var2, hVar, z17, str2);
                    }
                    list2 = list3;
                    i17 = size;
                    i18 = i19;
                    list = list2;
                    b76 = false;
                    hVar = hVar2;
                } else {
                    list = list3;
                    i17 = size;
                    i18 = i19;
                    hVar = hVar2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[handleBatchGetXml] old, source=" + str6 + ", favId=" + tp0Var2.f468171d);
                    java.util.HashSet hashSet2 = s72.j0.f485602i;
                    b76 = j0Var2.b7(tp0Var2, hVar, p17, str6);
                }
                if (!b76) {
                    i19 = i18 + 1;
                    qVar = this;
                    hVar2 = hVar;
                    str5 = str;
                    size = i17;
                    list3 = list;
                }
            } else {
                hVar = hVar2;
                list = list3;
                i17 = size;
                i18 = i19;
            }
            ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
            i19 = i18 + 1;
            qVar = this;
            hVar2 = hVar;
            str5 = str;
            size = i17;
            list3 = list;
        }
        return hVar2;
    }
}
