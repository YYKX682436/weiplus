package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class kh implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f285867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f285869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f285870g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285871h;

    public kh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map, java.lang.ref.WeakReference weakReference) {
        this.f285871h = c21908xb66fd105;
        this.f285867d = view;
        this.f285868e = f9Var;
        this.f285869f = map;
        this.f285870g = weakReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        c01.d9.e().q(1198, this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f285871h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = c21908xb66fd105.f284709t;
        if (u3Var != null) {
            u3Var.dismiss();
            c21908xb66fd105.f284709t = null;
        }
        android.view.View view = this.f285867d;
        if (i17 != 0 || i18 != 0) {
            db5.t7.m123882x26a183b(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hcq, 0).show();
            return;
        }
        java.lang.Object tag = view.getTag();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f285868e;
        if (f9Var != tag && f9Var != view.getTag(com.p314xaae8f345.mm.R.id.k8v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemDyeingTemplate", "item msg(%s) has changed.", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = ((k01.b1) ((k01.p0) m1Var)).f384537d;
        r45.tf7 tf7Var = oVar != null ? (r45.tf7) oVar.f152244b.f152233a : null;
        if (tf7Var == null) {
            db5.t7.m123882x26a183b(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hcq, 0).show();
            return;
        }
        java.lang.String str2 = tf7Var.f467920d;
        java.util.Map map = this.f285869f;
        java.lang.String str3 = (java.lang.String) map.get(".msg.fromusername");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        boolean Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str3);
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_detail.template_ext.voip_call_info.im_room_id");
        if (str4 == null) {
            str4 = "";
        }
        if (Bi) {
            ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Di(str3, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jh(this, str2, str4));
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f285870g;
        try {
            java.lang.String format = java.lang.String.format(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.B1, str3, java.net.URLEncoder.encode(c21908xb66fd105.H, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), java.net.URLEncoder.encode(str2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), java.net.URLEncoder.encode(weakReference.get() != null ? c21908xb66fd105.d1(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as) weakReference.get()).f284940a) : "", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "go to complain page(%s, %s), url:%s", str2, c21908xb66fd105.H, format);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.h(intent, c21908xb66fd105.f284708s.x());
            j45.l.j(c21908xb66fd105.f284708s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.io.UnsupportedEncodingException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemDyeingTemplate", "Error occurred when encode url.");
            db5.t7.m123882x26a183b(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574185hd0, 0).show();
        }
    }
}
