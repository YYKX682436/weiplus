package r02;

/* loaded from: classes8.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13240x9c8ab066 f449823d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13240x9c8ab066 c13240x9c8ab066) {
        this.f449823d = c13240x9c8ab066;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/BottomEntranceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13240x9c8ab066 c13240x9c8ab066 = this.f449823d;
        c02.g gVar = c13240x9c8ab066.f178890d;
        if (gVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f119131e)) {
            android.os.Bundle bundle = new android.os.Bundle();
            try {
                c02.g gVar2 = c13240x9c8ab066.f178890d;
                gVar2.f119131e = java.net.URLDecoder.decode(gVar2.f119131e, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                android.net.Uri parse = android.net.Uri.parse(c13240x9c8ab066.f178890d.f119131e);
                java.lang.String query = parse.getQuery();
                java.lang.String queryParameter = parse.getQueryParameter("liteapp");
                java.lang.String queryParameter2 = parse.getQueryParameter("wechat_pkgid");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomEntranceView", "uri:%s query:%s liteapp:%s wechat_pkgid:%s", parse, query, queryParameter, queryParameter2);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomEntranceView", "liteapp is null, fallback to web");
                    bundle.putString("rawUrl", c13240x9c8ab066.f178890d.f119131e);
                    ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(c13240x9c8ab066.getContext(), bundle);
                } else {
                    android.net.Uri parse2 = android.net.Uri.parse(queryParameter);
                    java.lang.String host = parse2.getHost();
                    java.lang.String queryParameter3 = parse2.getQueryParameter(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter2)) {
                        host = host + "@game?" + queryParameter2;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomEntranceView", "jump to liteapp. url: " + parse2 + ", appId: " + host + ", path: " + queryParameter3 + ", query: " + query + ", pkgId: " + queryParameter2);
                    q80.d0 d0Var = new q80.d0();
                    d0Var.f442182a = host;
                    d0Var.f442183b = queryParameter3;
                    d0Var.f442184c = query;
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(c13240x9c8ab066.getContext(), d0Var, new r02.b(this, bundle));
                }
                o02.a.b(10, 1005, 1, 40, "", "", "");
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BottomEntranceView", e17, "gamelog.util, jumpToPage, UnsupportedEncodingException", new java.lang.Object[0]);
                yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/BottomEntranceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/BottomEntranceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
