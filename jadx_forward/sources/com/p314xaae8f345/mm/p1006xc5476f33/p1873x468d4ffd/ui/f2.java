package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230863d;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d) {
        this.f230863d = activityC16554x70dcab5d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        ei3.m mVar;
        java.lang.String str;
        int d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d18;
        org.json.JSONObject jSONObject;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230863d;
        int i17 = activityC16554x70dcab5d.f230764g;
        if (i17 == 4) {
            int i18 = activityC16554x70dcab5d.V.f230358o;
            if (i18 == 1 || i18 == 2 || i18 == 7) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13820, java.lang.Integer.valueOf(activityC16554x70dcab5d.Y ? activityC16554x70dcab5d.Z ? 2 : 1 : 0), java.lang.Integer.valueOf(activityC16554x70dcab5d.V.f230358o), activityC16554x70dcab5d.V.f230360q, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = activityC16554x70dcab5d.V;
            if (c16528xd9aafd63 != null && activityC16554x70dcab5d.A1) {
                gi3.c.a(new gi3.a(c16528xd9aafd63.f230358o));
            }
            android.content.Intent intent = new android.content.Intent();
            java.lang.String mo127744x5000ed37 = activityC16554x70dcab5d.f230768m.mo127744x5000ed37();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String concat = (mo127744x5000ed37 == null ? "" : mo127744x5000ed37).concat(".thumb");
            if (activityC16554x70dcab5d.V.f230359p) {
                activityC16554x70dcab5d.W6(mo127744x5000ed37, false);
            }
            if (di3.b.b() != null) {
                r45.vh4 vh4Var = activityC16554x70dcab5d.M;
                di3.b b17 = di3.b.b();
                if (b17.I == null) {
                    try {
                        b17.I = new org.json.JSONObject();
                        jSONObject = new org.json.JSONObject();
                        b17.I.put("wxcamera", jSONObject);
                        jSONObject.put("model", b17.f314185a);
                        jSONObject.put("apiLevel", b17.f314186b);
                        jSONObject.put("screen", java.lang.String.format("%dx%d", java.lang.Integer.valueOf(b17.f314190f), java.lang.Integer.valueOf(b17.f314191g)));
                        jSONObject.put("crop", java.lang.String.format("%dx%d", java.lang.Integer.valueOf(b17.f314196l), java.lang.Integer.valueOf(b17.f314197m)));
                        jSONObject.put("preview", java.lang.String.format("%dx%d", java.lang.Integer.valueOf(b17.f314198n), java.lang.Integer.valueOf(b17.f314199o)));
                        jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37649xb228a5ec, java.lang.String.format("%dx%d", java.lang.Integer.valueOf(b17.f314200p), java.lang.Integer.valueOf(b17.f314201q)));
                        jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, b17.f314202r);
                        jSONObject.put("deviceoutfps", b17.f314203s);
                        jSONObject.put("recordfps", b17.f314204t);
                        jSONObject.put("recordertype", b17.f314205u);
                        jSONObject.put("needRotateEachFrame", b17.f314207w);
                        jSONObject.put("isNeedRealtimeScale", b17.f314208x);
                        jSONObject.put("resolutionLimit", b17.f314209y);
                        jSONObject.put("videoBitrate", b17.f314206v);
                        str = "album_business_bubble_media_by_coordinate_longitude";
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        str = "album_business_bubble_media_by_coordinate_longitude";
                    }
                    try {
                        jSONObject.put("wait2playtime", b17.G);
                        jSONObject.put("useback", b17.H);
                        di3.f0 f0Var = di3.w.f314303d;
                        jSONObject.put("presetIndex", f0Var != null ? f0Var.f314235c : -1);
                        jSONObject.put("recorderOption", wo.v1.f529362i.f529227h);
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CaptureStatistics", e, "buildJson error", new java.lang.Object[0]);
                        vh4Var.f469771h = b17.I.toString();
                        d17 = activityC16554x70dcab5d.f230768m.d();
                        if (activityC16554x70dcab5d.A1) {
                            d17 = java.lang.Math.round(d18.f243915a / 1000.0f);
                        }
                        intent.putExtra("key_req_result", new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886(activityC16554x70dcab5d.f230766i.Q, mo127744x5000ed37, concat, activityC16554x70dcab5d.f230768m.a(), activityC16554x70dcab5d.C1, d17, activityC16554x70dcab5d.M));
                        intent.putExtra("KSessionID", activityC16554x70dcab5d.V.f230360q);
                        intent.putExtra("latitude", activityC16554x70dcab5d.getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 91.0d));
                        intent.putExtra("longitude", activityC16554x70dcab5d.getIntent().getDoubleExtra(str, 181.0d));
                        activityC16554x70dcab5d.setResult(-1, intent);
                        activityC16554x70dcab5d.finish();
                        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                } else {
                    str = "album_business_bubble_media_by_coordinate_longitude";
                }
                vh4Var.f469771h = b17.I.toString();
            } else {
                str = "album_business_bubble_media_by_coordinate_longitude";
            }
            d17 = activityC16554x70dcab5d.f230768m.d();
            if (activityC16554x70dcab5d.A1 && (d18 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(activityC16554x70dcab5d.f230768m.mo127744x5000ed37(), true)) != null) {
                d17 = java.lang.Math.round(d18.f243915a / 1000.0f);
            }
            intent.putExtra("key_req_result", new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886(activityC16554x70dcab5d.f230766i.Q, mo127744x5000ed37, concat, activityC16554x70dcab5d.f230768m.a(), activityC16554x70dcab5d.C1, d17, activityC16554x70dcab5d.M));
            intent.putExtra("KSessionID", activityC16554x70dcab5d.V.f230360q);
            intent.putExtra("latitude", activityC16554x70dcab5d.getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 91.0d));
            intent.putExtra("longitude", activityC16554x70dcab5d.getIntent().getDoubleExtra(str, 181.0d));
            activityC16554x70dcab5d.setResult(-1, intent);
            activityC16554x70dcab5d.finish();
        } else if (i17 == 3) {
            wu5.c cVar = activityC16554x70dcab5d.f230783x1;
            if (cVar != null && !cVar.isDone()) {
                try {
                    activityC16554x70dcab5d.f230783x1.get();
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightCaptureUI", e19, "wait saveCaptureImageThread error: %s", e19.getMessage());
                }
            }
            int i19 = activityC16554x70dcab5d.V.f230358o;
            if (i19 == 1 || i19 == 2 || i19 == 7) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13820, java.lang.Integer.valueOf(activityC16554x70dcab5d.Y ? 1 : 0), java.lang.Integer.valueOf(activityC16554x70dcab5d.V.f230358o), activityC16554x70dcab5d.V.f230360q, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            }
            int i27 = activityC16554x70dcab5d.V.f230358o;
            if (i27 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13858, 1, 1, 1, 0);
            } else if (i27 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13858, 2, 1, 1, 0);
            }
            android.content.Intent intent2 = new android.content.Intent();
            if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16554x70dcab5d.I1) || (mVar = activityC16554x70dcab5d.f230768m) == null || !activityC16554x70dcab5d.I1.equals(mVar.q())) ? false : true) && activityC16554x70dcab5d.V.f230359p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "is not Photo editted!");
                activityC16554x70dcab5d.W6(activityC16554x70dcab5d.f230768m.q(), true);
            }
            intent2.putExtra("key_req_result", new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886(activityC16554x70dcab5d.f230766i.Q, activityC16554x70dcab5d.f230768m.q()));
            intent2.putExtra("KSessionID", activityC16554x70dcab5d.V.f230360q);
            intent2.putExtra("latitude", activityC16554x70dcab5d.getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 91.0d));
            intent2.putExtra("longitude", activityC16554x70dcab5d.getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_longitude", 181.0d));
            activityC16554x70dcab5d.setResult(-1, intent2);
            android.os.Bundle bundle = activityC16554x70dcab5d.K1;
            if (bundle == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCaptureUI", "[reportPhotoEdit] date == null");
            } else if (activityC16554x70dcab5d.J1) {
                int i28 = bundle.getInt("report_info_emotion_count");
                int i29 = bundle.getInt("report_info_text_count");
                int i37 = bundle.getInt("report_info_mosaic_count");
                int i38 = bundle.getInt("report_info_doodle_count");
                boolean z18 = bundle.getBoolean("report_info_iscrop");
                int i39 = bundle.getInt("report_info_undo_count");
                boolean z19 = bundle.getBoolean("report_info_is_rotation");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "[reportPhotoEdit] emojiCount:%s,textCount:%s,mosaicCount:%s,penCount:%s,isCrop:%s,undoCount:%s,isRotation:%s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(z18 ? 1 : 0), java.lang.Integer.valueOf(i39), java.lang.Boolean.valueOf(z19));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13857, 1, 1, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(z18 ? 1 : 0), java.lang.Integer.valueOf(i39), 3, java.lang.Integer.valueOf(z19 ? 1 : 0), activityC16554x70dcab5d.V.f230360q, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "[reportPhotoEdit] reportPhotoEdit == false");
            }
            activityC16554x70dcab5d.finish();
            activityC16554x70dcab5d.Y6(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
