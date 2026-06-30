package c61;

/* loaded from: classes8.dex */
public final class nb implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.ob f39191d;

    public nb(c61.ob obVar) {
        this.f39191d = obVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        java.lang.Object obj;
        java.lang.String obj2;
        java.lang.Integer h17;
        android.content.Intent intent;
        android.content.Intent intent2;
        java.lang.Object obj3;
        java.lang.String obj4;
        java.lang.Integer h18;
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        c61.ob obVar = this.f39191d;
        c61.ob.b(obVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMediaPickerPlugin", "onMethodCall: " + call.method);
        java.lang.String str = call.method;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 192041691) {
                if (hashCode != 750015550) {
                    if (hashCode == 1747580564 && str.equals("selectImages")) {
                        java.lang.Object obj5 = call.arguments;
                        java.util.Map map = obj5 instanceof java.util.Map ? (java.util.Map) obj5 : null;
                        int intValue = (map == null || (obj3 = map.get("maxCount")) == null || (obj4 = obj3.toString()) == null || (h18 = r26.h0.h(obj4)) == null) ? 1 : h18.intValue();
                        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMediaPickerPlugin", "launchCapture");
                        android.app.Activity activity = obVar.f39213e;
                        if (activity instanceof androidx.activity.ComponentActivity) {
                            int c17 = com.tencent.mm.ui.bl.c(activity);
                            android.app.Activity activity2 = obVar.f39213e;
                            if (activity2 != null && (intent2 = activity2.getIntent()) != null) {
                                intent2.putExtra("intent_bottom_navigationbar_height", c17);
                            }
                            boolean z17 = intValue <= 1;
                            ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
                            boolean z18 = qp.b.f365678e;
                            android.content.Intent intent3 = new android.content.Intent();
                            intent3.putExtra("max_select_count", intValue);
                            intent3.putExtra("query_media_type", 1);
                            intent3.putExtra("query_source_type", 6);
                            intent3.putExtra("show_header_view", false);
                            intent3.putExtra("key_can_select_video_and_pic", false);
                            intent3.putExtra("key_force_hide_smart_gallery_entry", true);
                            intent3.putExtra("key_send_raw_image", true);
                            ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
                            boolean z19 = qp.b.f365678e;
                            if (z18 && z19) {
                                intent3.putExtra("Gallery_LivePhoto_Need_Query", true);
                            }
                            intent3.addFlags(67108864);
                            intent3.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.gallery.ui.GalleryEntryUI");
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(new jz5.l(1, intent3));
                            if (!z17) {
                                android.content.Intent intent4 = new android.content.Intent();
                                intent4.putExtra("album_select_count_limit", intValue);
                                arrayList.add(new jz5.l(3, intent4));
                            }
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
                            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                            kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new c61.mb(obVar, 6, arrayList, arrayList2, result, null), 2, null);
                            return;
                        }
                        return;
                    }
                } else if (str.equals("captureMedia")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMediaPickerPlugin", "launchCapture");
                    android.app.Activity activity3 = obVar.f39213e;
                    if (activity3 instanceof androidx.activity.ComponentActivity) {
                        int c18 = com.tencent.mm.ui.bl.c(activity3);
                        android.app.Activity activity4 = obVar.f39213e;
                        if (activity4 != null && (intent = activity4.getIntent()) != null) {
                            intent.putExtra("intent_bottom_navigationbar_height", c18);
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider e17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.e();
                        e17.a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout");
                        e17.M.putBoolean("key_forbit_edit_inset_layout", true);
                        android.content.Intent intent5 = new android.content.Intent();
                        intent5.putExtra("KEY_PARAMS_CONFIG", e17);
                        intent5.putExtra("KEY_PARAMS_TO_WHERE", 0);
                        intent5.putExtra("key_params_pageid", "MediaTabCaptureUI");
                        arrayList3.add(new jz5.l(2, intent5));
                        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                        kotlinx.coroutines.y0 b18 = kotlinx.coroutines.z0.b();
                        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
                        kotlinx.coroutines.l.d(b18, kotlinx.coroutines.internal.b0.f310484a, null, new c61.ib(obVar, 6, arrayList3, f0Var, result, null), 2, null);
                        return;
                    }
                    return;
                }
            } else if (str.equals("selectFiles")) {
                java.lang.Object obj6 = call.arguments;
                java.util.Map map2 = obj6 instanceof java.util.Map ? (java.util.Map) obj6 : null;
                int intValue2 = (map2 == null || (obj = map2.get("maxCount")) == null || (obj2 = obj.toString()) == null || (h17 = r26.h0.h(obj2)) == null) ? 1 : h17.intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMediaPickerPlugin", "launchFilePicker maxCount=" + intValue2);
                android.app.Activity activity5 = obVar.f39213e;
                if (activity5 == null || !(activity5 instanceof com.tencent.mm.ui.MMFragmentActivity)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FlutterMediaPickerPlugin", "launchFilePicker failed, Activity is null or not MMActivity");
                    result.error("selectFiles", "Activity is null or not MMActivity", null);
                    return;
                }
                if (!fp.i.b()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FlutterMediaPickerPlugin", "launchFilePicker failed, SD card not available");
                    result.error("selectFiles", "SD card not available", null);
                    return;
                }
                android.content.Intent intent6 = new android.content.Intent();
                intent6.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                intent6.putExtra("INTENT_MAX_SELECT_COUNT", intValue2);
                c61.kb kbVar = new c61.kb(obVar, result);
                if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.STORAGE, new c61.jb(activity5, intent6, obVar, kbVar, result))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMediaPickerPlugin", "launchFilePicker needRequestPermission");
                    return;
                } else {
                    j45.l.x((com.tencent.mm.ui.MMFragmentActivity) activity5, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent6, 8193, kbVar);
                    return;
                }
            }
        }
        result.notImplemented();
    }
}
