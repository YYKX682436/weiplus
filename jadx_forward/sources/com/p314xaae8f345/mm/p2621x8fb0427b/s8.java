package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.s8 f276847a = new com.p314xaae8f345.mm.p2621x8fb0427b.s8();

    public final void a() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IMAGE_QUERY_DATA_DB_VERSION_INT;
        java.lang.Object m17 = c17.m(u3Var, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().h() + "mediaOpt/imageQuery/dbFolder/");
        sb6.append("image_query_table.db");
        java.lang.String sb7 = sb6.toString();
        f65.p.f341475i = (long) intValue;
        if (intValue != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "diff sql version， delete sql file, " + intValue + ", 2");
            com.p314xaae8f345.mm.vfs.w6.f(gm0.j1.u().h() + "mediaOpt/imageQuery/dbFolder/");
            f65.p.f341476j = (long) 1;
        } else {
            f65.p.f341476j = 2;
        }
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).O6(sb7)) {
            gm0.j1.u().c().x(u3Var, 2);
        }
    }

    public final void b(java.lang.String scanPath) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanPath, "scanPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "deleteImageByScanPath >> ".concat(scanPath));
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.h3 h3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsLabelInfoStorage", "deleteClsByScanImagePath >> ".concat(scanPath));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("hd_image_path", scanPath);
        com.p314xaae8f345.mm.p2621x8fb0427b.g3 g3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g3) h3Var.T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p2621x8fb0427b.g3.class));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "deleteImageByScanPath >> " + (g3Var != null ? com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.S6(h3Var, g3Var, false, false, 4, null) : 0));
    }

    public final boolean c(com.p314xaae8f345.mm.api.C4988x89c61bdd imageData, java.lang.String chatRoomId) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomId, "chatRoomId");
        com.p314xaae8f345.mm.p2621x8fb0427b.g3 g3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.g3();
        g3Var.f66220x206c903d = chatRoomId;
        g3Var.f66222x4ac6dd27 = imageData.f134738f;
        g3Var.f66228x9de75411 = imageData.f134737e;
        g3Var.f66227xeab3e73d = imageData.f134739g;
        java.lang.String str = imageData.f134740h;
        g3Var.f66221x22f9ac90 = str;
        g3Var.f66226xa779eec3 = imageData.f134742m;
        g3Var.f66223xf8a7d2de = "0";
        g3Var.f66224xa8fb27eb = str;
        g3Var.f66225x6583d7e = imageData.f134736d;
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        boolean U6 = com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.U6(((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class), g3Var, false, false, false, 14, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "insertCustomClsInfo >> " + imageData.f134739g + " result: " + U6);
        return U6;
    }

    public final java.util.ArrayList d(java.lang.String roomId, java.lang.String isRes) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isRes, "isRes");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.h3 h3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class);
        p75.m c17 = new p75.r0("chat_room_id", roomId).c(new p75.r0("is_recognize", isRes));
        p75.i0 i17 = dm.d2.f317842p.i();
        i17.f434189c = "MicroMsg.ClsLabelInfoStorage";
        i17.f434190d = c17;
        i17.f434192f = kz5.b0.c(dm.d2.f317843q.u());
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.g3> k17 = i17.a().k(h3Var.f274680g.Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.g3.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsLabelInfoStorage", "getClsImageListByIsRec select result: " + ((java.util.ArrayList) k17).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "selectAllOldNoRecData >> " + roomId + ' ' + ((java.util.ArrayList) k17).size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.g3 g3Var : k17) {
            arrayList.add(new com.p314xaae8f345.mm.api.C4988x89c61bdd(g3Var.f66228x9de75411, g3Var.f66225x6583d7e, g3Var.f66220x206c903d, g3Var.f66222x4ac6dd27, g3Var.f66227xeab3e73d, g3Var.f66224xa8fb27eb, g3Var.f66221x22f9ac90, g3Var.f66226xa779eec3));
        }
        return arrayList;
    }

    public final java.util.List e(java.lang.String labelId, java.lang.String chatRoomId) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelId, "labelId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomId, "chatRoomId");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.h3 h3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class);
        java.lang.String labelId2 = "'%#" + labelId + "#%'";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelId2, "labelId");
        p75.m c17 = new p75.r0("chat_room_id", chatRoomId).c(new p75.v0("label_id", labelId2));
        p75.i0 i17 = dm.d2.f317842p.i();
        i17.f434189c = "MicroMsg.ClsLabelInfoStorage";
        i17.f434190d = c17;
        java.util.List k17 = i17.a().k(h3Var.f274680g.Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.g3.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsLabelInfoStorage", "select result: " + ((java.util.ArrayList) k17).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "result >> size: " + ((java.util.ArrayList) k17).size());
        return k17;
    }

    public final java.util.ArrayList f(java.lang.String roomId, int i17, int i18) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.h3 h3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class);
        p75.m c17 = new p75.r0("chat_room_id", roomId).c(new p75.w0("ocr_result", ""));
        p75.i0 i19 = dm.d2.f317842p.i();
        i19.f434189c = "MicroMsg.ClsLabelInfoStorage";
        i19.f434190d = c17;
        i19.f434192f = kz5.b0.c(dm.d2.f317843q.u());
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.g3> k17 = i19.a().k(h3Var.f274680g.Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.g3.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsLabelInfoStorage", "getClsImageListHaveOcrResult select result: " + ((java.util.ArrayList) k17).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "selectClsImageListHaveOcrResult >> " + roomId + ' ' + ((java.util.ArrayList) k17).size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.g3 g3Var : k17) {
            arrayList.add(new com.p314xaae8f345.mm.api.C4988x89c61bdd(g3Var.f66228x9de75411, g3Var.f66225x6583d7e, g3Var.f66220x206c903d, g3Var.f66222x4ac6dd27, g3Var.f66227xeab3e73d, g3Var.f66224xa8fb27eb, g3Var.f66221x22f9ac90, g3Var.f66226xa779eec3));
        }
        return arrayList;
    }

    public final java.util.ArrayList g(java.lang.String roomId, int i17, int i18) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.g3> Y6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class)).Y6(roomId, "1", i18, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "selectClsImageListIsRe >> " + roomId + ' ' + ((java.util.ArrayList) Y6).size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.g3 g3Var : Y6) {
            arrayList.add(new com.p314xaae8f345.mm.api.C4988x89c61bdd(g3Var.f66228x9de75411, g3Var.f66225x6583d7e, g3Var.f66220x206c903d, g3Var.f66222x4ac6dd27, g3Var.f66227xeab3e73d, g3Var.f66224xa8fb27eb, g3Var.f66221x22f9ac90, g3Var.f66226xa779eec3));
        }
        return arrayList;
    }

    public final java.util.ArrayList h(java.lang.String roomId) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.u4 u4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.u4) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.u4.class);
        p75.r0 r0Var = new p75.r0("chat_room_id", roomId);
        p75.i0 i17 = dm.j2.f319276h.i();
        i17.f434190d = r0Var;
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.t4> k17 = i17.a().k(u4Var.f274680g.Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.t4.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropCenterStorage", "getCropImagePathByRoomId >> " + roomId + " : " + ((java.util.ArrayList) k17).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "selectCropCenterImage >> " + roomId + ' ' + ((java.util.ArrayList) k17).size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.t4 t4Var : k17) {
            java.lang.String field_label_id = t4Var.f67080xa8fb27eb;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_label_id, "field_label_id");
            java.lang.String field_crop_image_path = t4Var.f67079x57963853;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_crop_image_path, "field_crop_image_path");
            arrayList.add(new aq.a(field_label_id, field_crop_image_path));
        }
        return arrayList;
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.j9 i(java.lang.String roomId) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.k9 k9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.k9) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.k9.class);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chat_room_id", roomId);
        com.p314xaae8f345.mm.p2621x8fb0427b.j9 j9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.j9) k9Var.T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p2621x8fb0427b.j9.class));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("history result >> json: ");
        sb6.append(j9Var != null ? j9Var.f66268x9d7518bf : null);
        sb6.append(" , lastImage: ");
        sb6.append(j9Var != null ? j9Var.f66269x5965408d : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", sb6.toString());
        return j9Var;
    }

    public final void j(java.lang.String chatRoomId, java.lang.String labelId, java.lang.String cropImagePath, java.lang.String originPath) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomId, "chatRoomId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelId, "labelId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cropImagePath, "cropImagePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originPath, "originPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "updateCropCenterImageInfo: " + cropImagePath + " >> label id: " + labelId);
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.u4 u4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.u4) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.u4.class);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chat_room_id", chatRoomId);
        contentValues.put("label_id", labelId);
        com.p314xaae8f345.mm.p2621x8fb0427b.t4 t4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.t4) u4Var.T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p2621x8fb0427b.t4.class));
        if (t4Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropCenterStorage", "update crop center label >>  room:" + chatRoomId + ", label: " + labelId);
            t4Var.f67079x57963853 = cropImagePath;
            t4Var.f67081xeab3e73d = originPath;
            com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.W6(u4Var, t4Var, false, false, 6, null);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.t4 t4Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.t4();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropCenterStorage", "add crop center label >>  room:" + chatRoomId + ", label: " + labelId);
        t4Var2.f67078x206c903d = chatRoomId;
        t4Var2.f67079x57963853 = cropImagePath;
        t4Var2.f67080xa8fb27eb = labelId;
        t4Var2.f67081xeab3e73d = originPath;
        com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.U6(u4Var, t4Var2, false, false, false, 14, null);
    }

    public final void k(com.p314xaae8f345.mm.api.C4988x89c61bdd imageData, java.lang.String chatRoomId) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomId, "chatRoomId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "updateImageClusterLabel: " + imageData.f134739g + " >> label id: " + imageData.f134741i);
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.h3 h3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class);
        java.lang.String str = imageData.f134739g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getScanImagePath(...)");
        java.lang.String str2 = imageData.f134741i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getCropLabelId(...)");
        java.lang.String str3 = imageData.f134740h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getLabelId(...)");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chat_room_id", chatRoomId);
        contentValues.put("origin_image_path", str);
        com.p314xaae8f345.mm.p2621x8fb0427b.g3 g3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g3) h3Var.T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p2621x8fb0427b.g3.class));
        if (g3Var != null) {
            g3Var.f66221x22f9ac90 = str2;
            g3Var.f66223xf8a7d2de = "1";
            g3Var.f66224xa8fb27eb = str3;
            com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.W6(h3Var, g3Var, false, false, 6, null);
        }
    }

    public final void l(com.p314xaae8f345.mm.api.C4988x89c61bdd imageData, java.lang.String chatRoomId) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomId, "chatRoomId");
        java.lang.Thread.currentThread().getName();
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.h3 h3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class);
        java.lang.String str = imageData.f134739g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getScanImagePath(...)");
        java.lang.String str2 = imageData.f134740h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getLabelId(...)");
        java.lang.String str3 = imageData.f134742m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getOcrResult(...)");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chat_room_id", chatRoomId);
        contentValues.put("origin_image_path", str);
        com.p314xaae8f345.mm.p2621x8fb0427b.g3 g3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g3) h3Var.T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p2621x8fb0427b.g3.class));
        if (g3Var != null) {
            g3Var.f66224xa8fb27eb = str2;
            g3Var.f66226xa779eec3 = str3;
            g3Var.f66223xf8a7d2de = "1";
            com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.W6(h3Var, g3Var, false, false, 6, null);
        }
    }
}
