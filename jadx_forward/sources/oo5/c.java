package oo5;

/* loaded from: classes8.dex */
public final class c implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oo5.e f428736a;

    public c(oo5.e eVar) {
        this.f428736a = eVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num = (java.lang.Integer) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.NativePreviewFileView", "openFile result: " + num);
        if (num != null && num.intValue() == 0) {
            return;
        }
        oo5.e eVar = this.f428736a;
        if (num == null || num.intValue() != 0) {
            if (num != null && -17 == num.intValue()) {
                android.content.Context context = eVar.f428738d;
                if (context == null || (str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cf7)) == null) {
                    str = "打开失败";
                }
                db5.t7.g(context, str);
            } else {
                android.content.Context context2 = eVar.f428738d;
                db5.t7.g(context2, context2 != null ? context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibr) : null);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openFile failed, error code: ");
        sb6.append(num);
        sb6.append(", filePath: ");
        oo5.f fVar = eVar.f428742h;
        sb6.append(fVar != null ? fVar.f428746a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.Integer.valueOf(num != null ? num.intValue() : -1));
        oo5.f fVar2 = eVar.f428742h;
        if (fVar2 == null || (str2 = fVar2.f428746a) == null) {
            str2 = "";
        }
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, str2);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = eVar.f428744m;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("onOpenError", hashMap);
        }
    }
}
