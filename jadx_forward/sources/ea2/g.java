package ea2;

/* loaded from: classes2.dex */
public final class g {
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static void b(ea2.g gVar, android.content.Context context, java.lang.String username, java.lang.String str, int i17, java.lang.Object obj) {
        java.lang.String kv6 = (i17 & 4) != 0 ? "" : str;
        gVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kv6, "kv");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", username);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_udf_kv", kv6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        intent.putExtra("key_enter_profile_tab", ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.I2).mo141623x754a37bb()).r()).intValue() == 1 ? 6 : 5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, 0L, null, 0, 1, false, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
    }

    public final void a(android.content.Context context, r45.iw2 singerInfo) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singerInfo, "singerInfo");
        r45.sd1 sd1Var = (r45.sd1) singerInfo.m75936x14adae67(4);
        java.lang.String m75945x2fec83072 = sd1Var != null ? sd1Var.m75945x2fec8307(0) : null;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.sd1 sd1Var2 = (r45.sd1) singerInfo.m75936x14adae67(4);
        java.lang.String str2 = "";
        if (sd1Var2 == null || (str = sd1Var2.m75945x2fec8307(1)) == null) {
            str = "";
        }
        r45.sd1 sd1Var3 = (r45.sd1) singerInfo.m75936x14adae67(4);
        if (sd1Var3 != null && (m75945x2fec8307 = sd1Var3.m75945x2fec8307(2)) != null) {
            str2 = m75945x2fec8307;
        }
        bundle.putString("appId", m75945x2fec83072);
        bundle.putString("query", str2);
        bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea);
        bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicHeaderUIC", "OpenLiteApp: " + m75945x2fec83072 + ", page:" + str + " query:" + str2);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        java.lang.String m75945x2fec83073 = singerInfo.m75945x2fec8307(2);
        if (e1Var.L(context, bundle, !(m75945x2fec83073 == null || m75945x2fec83073.length() == 0), new ea2.f(m75945x2fec83072, context, singerInfo))) {
            return;
        }
        java.lang.String m75945x2fec83074 = singerInfo.m75945x2fec8307(2);
        if (m75945x2fec83074 == null || m75945x2fec83074.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", m75945x2fec83074);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
