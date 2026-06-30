package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class jh implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kh f285793c;

    public jh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kh khVar, java.lang.String str, java.lang.String str2) {
        this.f285793c = khVar;
        this.f285791a = str;
        this.f285792b = str2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6
    public void a(k91.v5 v5Var) {
        android.view.View view;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kh khVar = this.f285793c;
        if (v5Var == null) {
            db5.t7.m123882x26a183b(khVar.f285867d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574185hd0, 0).show();
            return;
        }
        java.lang.String str = v5Var.f68904x28d45f97;
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.lang.String str2 = this.f285791a;
        if (isEmpty || android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "appId(%s) or msgId(%s) is null or nil.", str, str2);
            db5.t7.m123882x26a183b(khVar.f285867d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574185hd0, 0).show();
            return;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) khVar.f285869f.get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"), -1);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) khVar.f285869f.get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_version"), -1);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as asVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as) khVar.f285870g.get();
        if (asVar == null || (view = asVar.f284940a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemDyeingTemplate", "viewHolder is null.");
            view = null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = khVar.f285871h;
        java.lang.String str3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.B1;
        c21908xb66fd105.getClass();
        k91.z5 z5Var = new k91.z5();
        z5Var.f387396a = str;
        z5Var.f387405j = 1;
        z5Var.f387403h = P;
        z5Var.f387402g = P2;
        z5Var.f387411p = str2;
        z5Var.f387414s = c21908xb66fd105.H;
        z5Var.f387415t = this.f285792b;
        if (view != null) {
            z5Var.f387408m = c21908xb66fd105.d1(view);
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.a(z5Var.a());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemDyeingTemplate", "Error occurred when encode url.");
            db5.t7.m123882x26a183b(khVar.f285867d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574185hd0, 0).show();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", a17);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.h(intent, khVar.f285871h.f284708s.x());
            j45.l.j(khVar.f285871h.f284708s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
