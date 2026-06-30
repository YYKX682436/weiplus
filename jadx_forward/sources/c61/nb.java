package c61;

/* loaded from: classes8.dex */
public final class nb implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.ob f120724d;

    public nb(c61.ob obVar) {
        this.f120724d = obVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public final void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        java.lang.Object obj;
        java.lang.String obj2;
        java.lang.Integer h17;
        android.content.Intent intent;
        android.content.Intent intent2;
        java.lang.Object obj3;
        java.lang.String obj4;
        java.lang.Integer h18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        c61.ob obVar = this.f120724d;
        c61.ob.b(obVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMediaPickerPlugin", "onMethodCall: " + call.f71610xbfc5d0e1);
        java.lang.String str = call.f71610xbfc5d0e1;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 192041691) {
                if (hashCode != 750015550) {
                    if (hashCode == 1747580564 && str.equals("selectImages")) {
                        java.lang.Object obj5 = call.f71609x86ac7956;
                        java.util.Map map = obj5 instanceof java.util.Map ? (java.util.Map) obj5 : null;
                        int intValue = (map == null || (obj3 = map.get("maxCount")) == null || (obj4 = obj3.toString()) == null || (h18 = r26.h0.h(obj4)) == null) ? 1 : h18.intValue();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMediaPickerPlugin", "launchCapture");
                        android.app.Activity activity = obVar.f120746e;
                        if (activity instanceof p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) {
                            int c17 = com.p314xaae8f345.mm.ui.bl.c(activity);
                            android.app.Activity activity2 = obVar.f120746e;
                            if (activity2 != null && (intent2 = activity2.getIntent()) != null) {
                                intent2.putExtra("intent_bottom_navigationbar_height", c17);
                            }
                            boolean z17 = intValue <= 1;
                            ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
                            boolean z18 = qp.b.f447211e;
                            android.content.Intent intent3 = new android.content.Intent();
                            intent3.putExtra("max_select_count", intValue);
                            intent3.putExtra("query_media_type", 1);
                            intent3.putExtra("query_source_type", 6);
                            intent3.putExtra("show_header_view", false);
                            intent3.putExtra("key_can_select_video_and_pic", false);
                            intent3.putExtra("key_force_hide_smart_gallery_entry", true);
                            intent3.putExtra("key_send_raw_image", true);
                            ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
                            boolean z19 = qp.b.f447211e;
                            if (z18 && z19) {
                                intent3.putExtra("Gallery_LivePhoto_Need_Query", true);
                            }
                            intent3.addFlags(67108864);
                            intent3.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.gallery.ui.GalleryEntryUI");
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(new jz5.l(1, intent3));
                            if (!z17) {
                                android.content.Intent intent4 = new android.content.Intent();
                                intent4.putExtra("album_select_count_limit", intValue);
                                arrayList.add(new jz5.l(3, intent4));
                            }
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
                            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                            p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new c61.mb(obVar, 6, arrayList, arrayList2, result, null), 2, null);
                            return;
                        }
                        return;
                    }
                } else if (str.equals("captureMedia")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMediaPickerPlugin", "launchCapture");
                    android.app.Activity activity3 = obVar.f120746e;
                    if (activity3 instanceof p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) {
                        int c18 = com.p314xaae8f345.mm.ui.bl.c(activity3);
                        android.app.Activity activity4 = obVar.f120746e;
                        if (activity4 != null && (intent = activity4.getIntent()) != null) {
                            intent.putExtra("intent_bottom_navigationbar_height", c18);
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.e();
                        e17.a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout");
                        e17.M.putBoolean("key_forbit_edit_inset_layout", true);
                        android.content.Intent intent5 = new android.content.Intent();
                        intent5.putExtra("KEY_PARAMS_CONFIG", e17);
                        intent5.putExtra("KEY_PARAMS_TO_WHERE", 0);
                        intent5.putExtra("key_params_pageid", "MediaTabCaptureUI");
                        arrayList3.add(new jz5.l(2, intent5));
                        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                        p3325xe03a0797.p3326xc267989b.y0 b18 = p3325xe03a0797.p3326xc267989b.z0.b();
                        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                        p3325xe03a0797.p3326xc267989b.l.d(b18, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new c61.ib(obVar, 6, arrayList3, f0Var, result, null), 2, null);
                        return;
                    }
                    return;
                }
            } else if (str.equals("selectFiles")) {
                java.lang.Object obj6 = call.f71609x86ac7956;
                java.util.Map map2 = obj6 instanceof java.util.Map ? (java.util.Map) obj6 : null;
                int intValue2 = (map2 == null || (obj = map2.get("maxCount")) == null || (obj2 = obj.toString()) == null || (h17 = r26.h0.h(obj2)) == null) ? 1 : h17.intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMediaPickerPlugin", "launchFilePicker maxCount=" + intValue2);
                android.app.Activity activity5 = obVar.f120746e;
                if (activity5 == null || !(activity5 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterMediaPickerPlugin", "launchFilePicker failed, Activity is null or not MMActivity");
                    result.mo65718x5c4d208("selectFiles", "Activity is null or not MMActivity", null);
                    return;
                }
                if (!fp.i.b()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterMediaPickerPlugin", "launchFilePicker failed, SD card not available");
                    result.mo65718x5c4d208("selectFiles", "SD card not available", null);
                    return;
                }
                android.content.Intent intent6 = new android.content.Intent();
                intent6.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
                intent6.putExtra("INTENT_MAX_SELECT_COUNT", intValue2);
                c61.kb kbVar = new c61.kb(obVar, result);
                if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.STORAGE, new c61.jb(activity5, intent6, obVar, kbVar, result))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMediaPickerPlugin", "launchFilePicker needRequestPermission");
                    return;
                } else {
                    j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity5, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent6, 8193, kbVar);
                    return;
                }
            }
        }
        result.mo65719xbc9fa82f();
    }
}
