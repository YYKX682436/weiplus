package of1;

/* loaded from: classes7.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.m f426484f;

    public k(of1.m mVar, java.lang.String str, java.lang.String str2) {
        this.f426484f = mVar;
        this.f426482d = str;
        this.f426483e = str2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLViewScanHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        of1.m mVar = this.f426484f;
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = mVar.f426497h;
        if (s6Var != null && s6Var.f292254e.i()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = mVar.f426497h.f292254e;
            if (k0Var.i()) {
                k0Var.u();
            }
        }
        long j17 = mVar.f426498i;
        java.lang.String url = mVar.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23040, java.lang.Long.valueOf(j17), 1, 1, 5, url);
        java.lang.String b17 = mVar.b();
        int i17 = mVar.f426501o;
        int i18 = mVar.f426502p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = mVar.f426413d;
        java.lang.String str = this.f426482d;
        if (str != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(mVar.a(), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19304x577b8b34.class);
            intent.putExtra("key_string_for_scan", str);
            intent.putExtra("key_string_for_url", b17);
            intent.putExtra("key_string_for_image_url", this.f426483e);
            intent.putExtra("key_codetype_for_scan", i17);
            intent.putExtra("key_codeversion_for_scan", i18);
            if (mVar.f426503q != null) {
                java.lang.String Ri = ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Ri(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                com.p314xaae8f345.mm.vfs.w6.R(Ri, mVar.f426503q);
                intent.putExtra("key_file_path_for_scan", Ri);
                intent.putExtra("key_delete_file_after_deal", true);
                mVar.f426503q = null;
            }
            if (oVar != null) {
                of1.w1 w1Var = (of1.w1) oVar;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w1Var.m151219x74292566())) {
                    intent.putExtra("key_string_for_wxapp_id", w1Var.m151219x74292566());
                }
            }
            if (oVar != null) {
                intent.putExtra("key_int_for_wxapp_open_scene", ((of1.w1) oVar).m151225xbcc8608a());
            }
            intent.putExtra("geta8key_scene", 44);
            if (oVar != null) {
                of1.w1 w1Var2 = (of1.w1) oVar;
                if (w1Var2.m151232xaf156f4a() != null) {
                    intent.putExtra("wxappPathWithQuery", w1Var2.m151232xaf156f4a().Y1());
                }
            }
            android.content.Context a17 = mVar.a();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLViewScanHelper", "reqDealQBarResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            a17.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(a17, "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLViewScanHelper", "reqDealQBarResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        ((et.s) ((ft.f4) i95.n0.c(ft.f4.class))).wi(((of1.w1) oVar).m151232xaf156f4a(), true, mVar.f426501o, mVar.f426499m, true, true, mVar.b());
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLViewScanHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
