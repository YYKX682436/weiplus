package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes8.dex */
public class z6 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f225377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c7 f225378e;

    public z6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c7 c7Var, android.app.Activity activity) {
        this.f225378e = c7Var;
        this.f225377d = activity;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e8 e8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e8) obj;
        if (e8Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppJsApiSendFileMessage", "invoke, shareResult is null");
            e8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e8.f225103f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSendFileMessage", "invoke, shareResult: " + e8Var);
        int ordinal = e8Var.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c7 c7Var = this.f225378e;
        if (ordinal == 0) {
            android.app.Activity activity = this.f225377d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, activity, null, null);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, c7Var.f225060g);
            hashMap.put(dm.i4.f66867x2a5c95c7, c7Var.f225061h);
            hashMap.put("err_msg", "sendFileMessage:ok");
            c7Var.f224976f.b(hashMap);
        } else if (ordinal == 1) {
            c7Var.f224976f.a("sendFileMessage fail, cancel");
        } else if (ordinal == 2) {
            c7Var.f224976f.a("sendFileMessage fail");
        }
        return jz5.f0.f384359a;
    }
}
