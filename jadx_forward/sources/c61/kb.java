package c61;

/* loaded from: classes8.dex */
public final class kb implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.ob f120641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result f120642e;

    public kb(c61.ob obVar, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f120641d = obVar;
        this.f120642e = result;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        this.f120641d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMediaPickerPlugin", "handleFilePickResult requestCode=" + i17 + ", resultCode=" + i18);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result = this.f120642e;
        if (i18 != -1 || intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMediaPickerPlugin", "handleFilePickResult cancelled or data null");
            result.mo65718x5c4d208("selectFiles", "File selection cancelled", null);
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
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
                        if (r6Var.m()) {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str2);
                            hashMap.put("size", java.lang.Long.valueOf(r6Var.C()));
                            java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(str2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "getFileExt(...)");
                            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54479xc2246ea6, n17);
                            arrayList.add(hashMap);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterMediaPickerPlugin", "handleFilePickResult: file not exist: ".concat(str));
                        }
                    }
                    i19++;
                }
                if (arrayList.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterMediaPickerPlugin", "handleFilePickResult: no valid file");
                    result.mo65718x5c4d208("selectFiles", "No valid file selected", null);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMediaPickerPlugin", "handleFilePickResult: selectFiles size=" + arrayList.size());
                    result.mo65720x90b54003(arrayList);
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterMediaPickerPlugin", "handleFilePickResult: paths or titles empty");
        result.mo65718x5c4d208("selectFiles", "No file selected", null);
    }
}
