package c61;

/* loaded from: classes8.dex */
public final class kb implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.ob f39108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodChannel.Result f39109e;

    public kb(c61.ob obVar, io.flutter.plugin.common.MethodChannel.Result result) {
        this.f39108d = obVar;
        this.f39109e = result;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        this.f39108d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMediaPickerPlugin", "handleFilePickResult requestCode=" + i17 + ", resultCode=" + i18);
        io.flutter.plugin.common.MethodChannel.Result result = this.f39109e;
        if (i18 != -1 || intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMediaPickerPlugin", "handleFilePickResult cancelled or data null");
            result.error("selectFiles", "File selection cancelled", null);
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("selected_file_lst");
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("selected_file_title_lst");
        boolean z17 = true;
        int i19 = 0;
        if (!(stringArrayListExtra == null || stringArrayListExtra.isEmpty())) {
            if (stringArrayListExtra2 != null && !stringArrayListExtra2.isEmpty()) {
                z17 = false;
            }
            if (!z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int size = stringArrayListExtra.size();
                while (i19 < size) {
                    java.lang.String str = stringArrayListExtra.get(i19);
                    java.lang.String str2 = i19 < stringArrayListExtra2.size() ? stringArrayListExtra2.get(i19) : "";
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
                        if (r6Var.m()) {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str);
                            kotlin.jvm.internal.o.d(str2);
                            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str2);
                            hashMap.put("size", java.lang.Long.valueOf(r6Var.C()));
                            java.lang.String n17 = com.tencent.mm.vfs.w6.n(str2);
                            kotlin.jvm.internal.o.f(n17, "getFileExt(...)");
                            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_FORMAT, n17);
                            arrayList.add(hashMap);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterMediaPickerPlugin", "handleFilePickResult: file not exist: ".concat(str));
                        }
                    }
                    i19++;
                }
                if (arrayList.isEmpty()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlutterMediaPickerPlugin", "handleFilePickResult: no valid file");
                    result.error("selectFiles", "No valid file selected", null);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMediaPickerPlugin", "handleFilePickResult: selectFiles size=" + arrayList.size());
                    result.success(arrayList);
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FlutterMediaPickerPlugin", "handleFilePickResult: paths or titles empty");
        result.error("selectFiles", "No file selected", null);
    }
}
