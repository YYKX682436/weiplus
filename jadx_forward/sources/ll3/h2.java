package ll3;

/* loaded from: classes10.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ll3.h2 f400713a = new ll3.h2();

    public final void a(android.content.Context context, b21.r wrapper, r45.hf2 hf2Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var) {
        java.lang.String str;
        android.os.Bundle bundle;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wrapper, "wrapper");
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = wrapper.f98891t;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str2);
        if (android.text.TextUtils.isEmpty(wrapper.f98891t) || h17 == null || android.text.TextUtils.isEmpty(h17.f67386xa1e9e82c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MusicUIUtil", "doJumpToAppSongPage do nothing");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicUIUtil", "doJumpToAppSongPage launch third party app, package name:%s", h17.f67386xa1e9e82c);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936();
        c11289x4ff06936.f33201x324c710a = wrapper.f98887p;
        c11289x4ff06936.f33198xc58aab80 = wrapper.f98885n;
        java.lang.String str3 = "";
        if (hf2Var == null || (str = hf2Var.m75945x2fec8307(13)) == null) {
            str = "";
        }
        c11289x4ff06936.f33196x187d426e = java.net.URLDecoder.decode(str);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11289x4ff06936);
        c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
        if (hf2Var != null && (m75945x2fec8307 = hf2Var.m75945x2fec8307(12)) != null) {
            str3 = m75945x2fec8307;
        }
        c11286x34a5504.f33125x9b39409a = java.net.URLDecoder.decode(str3);
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        if (bt4Var != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("current_page_biz_info", bt4Var.f452570e);
            bundle2.putString("current_page_source_info", "music_operation_webview");
            bundle = bundle2;
        } else {
            bundle = null;
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).fj(context, wrapper.f98891t, c11286x34a5504, 0, a5Var, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if ((r17.length() == 0) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, b21.r r21, r45.hf2 r22, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 r23) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ll3.h2.b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, b21.r, r45.hf2, com.tencent.mm.pluginsdk.model.app.a5):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r5, b21.r r6, r45.hf2 r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = "wrapper"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            r0 = 16
            r1 = 0
            if (r7 == 0) goto L15
            java.lang.String r2 = r7.m75945x2fec8307(r0)
            goto L16
        L15:
            r2 = r1
        L16:
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            if (r2 != 0) goto L33
            java.lang.String r2 = "MusicUIUtil"
            java.lang.String r3 = "use androdiDownloadUrl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)
            java.lang.String r6 = r6.f98891t
            if (r7 == 0) goto L2c
            java.lang.String r1 = r7.m75945x2fec8307(r0)
        L2c:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            r4.d(r5, r6, r1)
            return
        L33:
            java.lang.String r7 = r6.f98891t
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L73
            java.lang.String r7 = r6.f98891t
            java.lang.String r0 = "wx5aa333606550dfd5"
            boolean r7 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r7)
            if (r7 == 0) goto L49
            java.lang.String r7 = "https://y.qq.com/m/download/index.html?channelId=2005000732"
            goto L75
        L49:
            java.lang.String r7 = r6.f98891t
            java.lang.String r0 = "wx8dd6ecd81906fd84"
            boolean r7 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r7)
            if (r7 == 0) goto L57
            java.lang.String r7 = "https://a.app.qq.com/o/simple.jsp?pkgname=com.netease.cloudmusic"
            goto L75
        L57:
            java.lang.String r7 = r6.f98891t
            java.lang.String r0 = "wx79f2c4418704b4f8"
            boolean r7 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r7)
            if (r7 == 0) goto L65
            java.lang.String r7 = "https://a.app.qq.com/o/simple.jsp?pkgname=com.kugou.android"
            goto L75
        L65:
            java.lang.String r7 = r6.f98891t
            java.lang.String r0 = "wxc305711a2a7ad71c"
            boolean r7 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r7)
            if (r7 == 0) goto L73
            java.lang.String r7 = "https://a.app.qq.com/o/simple.jsp?pkgname=cn.kuwo.player"
            goto L75
        L73:
            java.lang.String r7 = ""
        L75:
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r0 != 0) goto L81
            java.lang.String r6 = r6.f98891t
            r4.d(r5, r6, r7)
            return
        L81:
            java.lang.String r7 = r6.f98887p
            if (r7 != 0) goto L87
            java.lang.String r7 = r6.f98885n
        L87:
            java.lang.String r6 = r6.f98891t
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)
            r4.d(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ll3.h2.c(android.content.Context, b21.r, r45.hf2):void");
    }

    public final void d(android.content.Context context, java.lang.String str, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicUIUtil", "launch H5 appId: %s, url:%s", str, url);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "wx5aa333606550dfd5")) {
            gw4.f fVar = new gw4.f(context);
            fVar.f357690b = "mmdownloadapp_G5AaIuNdPtZyH1oCL8";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", url);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
