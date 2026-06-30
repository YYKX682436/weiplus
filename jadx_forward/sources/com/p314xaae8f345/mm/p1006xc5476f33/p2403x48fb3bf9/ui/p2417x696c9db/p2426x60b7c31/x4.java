package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class x4 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f267059h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267060i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267061m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267062n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267063o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267064p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f267065q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f267066r;

    public x4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17) {
        this.f267066r = c1Var;
        this.f267055d = y2Var;
        this.f267056e = str;
        this.f267057f = str2;
        this.f267058g = str3;
        this.f267059h = j17;
        this.f267060i = str4;
        this.f267061m = str5;
        this.f267062n = str6;
        this.f267063o = str7;
        this.f267064p = str8;
        this.f267065q = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f267066r;
        android.app.ProgressDialog progressDialog = c1Var.f266512h;
        if (progressDialog != null && progressDialog.isShowing()) {
            c1Var.f266512h.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doAddDownloadApp check result errType:%d errCode:%d msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        nw4.y2 y2Var = this.f267055d;
        if (i17 != 0 || i18 != 0) {
            c1Var.i5(y2Var, "addDownloadApp:fail_check fail", null);
            return 0;
        }
        r45.g30 g30Var = (r45.g30) oVar.f152244b.f152233a;
        if (g30Var == null || g30Var.f456384f != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf(g30Var != null ? g30Var.f456384f : Integer.MAX_VALUE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "doAddDownloadApp %d", objArr);
            c1Var.i5(y2Var, "addDownloadApp:fail_check fail", null);
            return 0;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c1Var.f266508d, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5.class);
        intent.putExtra("task_name", this.f267056e);
        intent.putExtra("task_url", this.f267057f);
        intent.putExtra("alternative_url", this.f267058g);
        intent.putExtra("task_size", this.f267059h);
        intent.putExtra("file_md5", this.f267060i);
        intent.putExtra("extInfo", this.f267061m);
        intent.putExtra("appid", this.f267062n);
        intent.putExtra("package_name", this.f267063o);
        intent.putExtra("page_url", this.f267064p);
        intent.putExtra("page_scene", 0);
        intent.putExtra("thumb_url", g30Var.f456383e);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, g30Var.f456382d);
        intent.putExtra("task_download_type", this.f267065q);
        intent.putExtra("app_developer", (java.lang.String) y2Var.f422323a.get("developer"));
        intent.putExtra("app_desc", (java.lang.String) y2Var.f422323a.get("app_desc"));
        intent.putExtra("app_privacy_url", (java.lang.String) y2Var.f422323a.get("privacy_agreement_url"));
        intent.putExtra("app_permission_url", (java.lang.String) y2Var.f422323a.get("permission_url"));
        intent.putExtra("from_scene", 4);
        intent.addFlags(268435456);
        android.content.Context context = c1Var.f266508d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler$42", "callback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/CommReqResp;Lcom/tencent/mm/modelbase/NetSceneBase;)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler$42", "callback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/CommReqResp;Lcom/tencent/mm/modelbase/NetSceneBase;)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        c1Var.P = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5154x4abd99ec>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$42$1
            {
                this.f39173x3fe91575 = 1058823164;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5154x4abd99ec c5154x4abd99ec) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5154x4abd99ec c5154x4abd99ec2 = c5154x4abd99ec;
                if (!(c5154x4abd99ec2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5154x4abd99ec)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "mismatched event");
                    return false;
                }
                am.j jVar = c5154x4abd99ec2.f135503g;
                if (jVar.f88519a != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "not jsapi api callback");
                    return false;
                }
                boolean z17 = jVar.f88520b;
                java.util.HashMap hashMap = null;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.x4 x4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.x4.this;
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "addDownloadApp callback, cancel");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f88522d)) {
                        hashMap = new java.util.HashMap();
                        hashMap.put("detail_err_msg", jVar.f88522d);
                    }
                    x4Var.f267066r.i5(x4Var.f267055d, "addDownloadApp:cancel", hashMap);
                    return false;
                }
                if (jVar.f88521c > 0) {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("download_id", java.lang.Long.valueOf(jVar.f88521c));
                    hashMap2.put("detail_err_msg", jVar.f88522d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "addDownloadApp callback, ok");
                    x4Var.f267066r.i5(x4Var.f267055d, "addDownloadApp:ok", hashMap2);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "addDownloadApp callback, failed");
                    x4Var.f267066r.i5(x4Var.f267055d, "addDownloadApp:fail", null);
                }
                x4Var.f267066r.P.mo48814x2efc64();
                return false;
            }
        };
        c1Var.P.mo48813x58998cd();
        return 0;
    }
}
