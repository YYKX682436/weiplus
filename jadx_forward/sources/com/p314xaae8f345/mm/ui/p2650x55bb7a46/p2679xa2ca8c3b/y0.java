package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class y0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f287552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 f287554f;

    public y0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 i1Var, android.view.View view, java.lang.String str) {
        this.f287554f = i1Var;
        this.f287552d = view;
        this.f287553e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        c01.d9.e().q(1198, this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 i1Var = this.f287554f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = i1Var.f285684u;
        if (u3Var != null) {
            u3Var.dismiss();
            i1Var.f285684u = null;
        }
        android.view.View view = this.f287552d;
        if (i17 != 0 || i18 != 0) {
            db5.t7.m123882x26a183b(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hcq, 0).show();
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = ((k01.b1) ((k01.p0) m1Var)).f384537d;
        r45.tf7 tf7Var = oVar != null ? (r45.tf7) oVar.f152244b.f152233a : null;
        if (tf7Var == null) {
            db5.t7.m123882x26a183b(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hcq, 0).show();
            return;
        }
        java.lang.String str2 = tf7Var.f467920d;
        java.lang.String str3 = this.f287553e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppBrandNotifyMsg", "more view clicked, menu item COMPLAIN_APP_BRAND selected, sync attr username %s", str3);
        if (android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppBrandNotifyMsg", "appId(%s) or msgId(%s) is null or nil.", str3, str2);
            db5.t7.m123882x26a183b(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574185hd0, 0).show();
            return;
        }
        try {
            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1.D, java.net.URLEncoder.encode(str3, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), java.net.URLEncoder.encode(str2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), 13);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.h(intent, i1Var.f285683t.x());
            j45.l.j(i1Var.f285683t.g(), "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.io.UnsupportedEncodingException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppBrandNotifyMsg", "Error occurred when encode url.");
            db5.t7.m123882x26a183b(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574185hd0, 0).show();
        }
    }
}
