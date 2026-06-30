package cq2;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final cq2.s f302978a = new cq2.s();

    public final void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem, java.lang.String username, int i17) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        r45.xk e17 = hc2.f0.e(finderItem);
        if (e17 != null) {
            java.lang.String m75945x2fec8307 = e17.m75945x2fec8307(0);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NewSquareUtil", "jumpProfile: error username is null, feedId=".concat(pm0.v.u(finderItem.m59251x5db1b11())));
                return;
            }
            zl2.q4 q4Var = zl2.q4.f555466a;
            java.lang.String m75945x2fec83072 = e17.m75945x2fec8307(0);
            java.lang.String str = m75945x2fec83072 == null ? "" : m75945x2fec83072;
            r45.nw1 m59258xd0557130 = finderItem.m59258xd0557130();
            q4Var.G(str, "", context, 0L, m59258xd0557130 != null ? pm0.v.u(m59258xd0557130.m75942xfb822ef2(0)) : "", 0);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.content.Intent intent = new android.content.Intent();
            ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
            rq2.x xVar = rq2.x.f480447a;
            intent.putExtra("key_click_tab_context_id", rq2.x.f480452f);
            intent.putExtra("finder_username", username);
            intent.putExtra("key_from_comment_scene", i17);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
            ((c61.l7) b6Var).Cj(rq2.x.f480448b, intent);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareTabLifeCycleReport", "enterProfile");
        ip2.a.f375148d = "page_profile";
    }
}
