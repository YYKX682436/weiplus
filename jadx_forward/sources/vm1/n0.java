package vm1;

/* loaded from: classes11.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f519566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f519567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f519568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f519569g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f519570h;

    public n0(long j17, vm1.x0 x0Var, android.app.Activity activity, bw5.lp0 lp0Var, byte[] bArr) {
        this.f519566d = j17;
        this.f519567e = x0Var;
        this.f519568f = activity;
        this.f519569g = lp0Var;
        this.f519570h = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        bw5.d60 d60Var;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        bw5.z90 j17;
        java.lang.String d17;
        bw5.z90 j18;
        bw5.z90 j19;
        bw5.z90 j27;
        bw5.z90 j28;
        bw5.z90 j29;
        bw5.z90 j37;
        bw5.z90 j38;
        long j39 = this.f519566d;
        str = "";
        bw5.lp0 tingItem = this.f519569g;
        android.app.Activity activity = this.f519568f;
        vm1.x0 x0Var = this.f519567e;
        if (j39 == 1) {
            wm1.h b17 = x0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            b17.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "context");
            java.lang.Object[] objArr = new java.lang.Object[2];
            bw5.v70 d18 = tingItem.d();
            objArr[0] = d18 != null ? d18.m13170xcc16feb8() : null;
            bw5.v70 d19 = tingItem.d();
            objArr[1] = (d19 == null || (j38 = d19.j()) == null) ? null : j38.o();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioShareHelper", "shareMusicToChat listenId: %s, songName: %s", objArr);
            bw5.v70 d27 = tingItem.d();
            if (!il4.l.i(d27 != null ? d27.f115722e : 0)) {
                java.lang.String d28 = b17.d(tingItem);
                if (d28 == null) {
                    return;
                }
                java.lang.String Ri = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ri(rk4.j5.d(tingItem));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Retr_Msg_Type", 2);
                intent.putExtra("Retr_Msg_content", d28);
                intent.putExtra("Multi_Retr", true);
                intent.putExtra("Retr_go_to_chattingUI", false);
                intent.putExtra("Retr_show_success_tips", true);
                intent.putExtra("Retr_Msg_thumb_path", Ri);
                intent.putExtra("Retr_Msg_thumb_url", rk4.j5.d(tingItem));
                j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, 1001);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioShareHelper", "shareLocalFileToChat fileName: " + tingItem.d().i().b() + ", filePath: " + tingItem.d().i().m12386x5000ed37());
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c(tingItem.d().i().m12386x5000ed37()));
            c11286x34a5504.f33130x6942258 = tingItem.d().i().b();
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
            req.f33050x683188c = 0;
            req.f32866x7fa0d2de = null;
            req.f33049x38eb0007 = c11286x34a5504;
            android.os.Bundle bundle = new android.os.Bundle();
            req.mo48427x792022dd(bundle);
            bundle.putInt(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a);
            bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8, "com.tencent.mm.openapi");
            bundle.putString("SendAppMessageWrapper_AppId", "");
            bundle.putBoolean("SendAppMessageWrapper_NoNeedStayInWeixin", true);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(activity, "com.tencent.mm.ui.transmit.SendAppMessageWrapperUI");
            intent2.putExtras(bundle);
            android.content.Intent intent3 = new android.content.Intent();
            intent3.setClassName(activity, "com.tencent.mm.ui.transmit.SelectConversationUI");
            intent3.putExtra("Select_Conv_NextStep", intent2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent3);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/audio/helper/BizAudioShareHelper", "shareLocalFileToChat", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/TingItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/audio/helper/BizAudioShareHelper", "shareLocalFileToChat", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/TingItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (j39 == 2) {
            wm1.h b18 = x0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            b18.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "context");
            bw5.v70 d29 = tingItem.d();
            int i17 = d29 != null ? d29.f115722e : 0;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936();
            c11289x4ff06936.f33201x324c710a = rk4.j5.l(tingItem);
            c11289x4ff06936.f33198xc58aab80 = rk4.j5.k(tingItem);
            c11289x4ff06936.f33203x2b375427 = rk4.j5.c(tingItem);
            bw5.v70 d37 = tingItem.d();
            c11289x4ff06936.f33204x1478a44a = (d37 == null || (j37 = d37.j()) == null) ? null : j37.g();
            bw5.v70 d38 = tingItem.d();
            if (d38 == null || (j29 = d38.j()) == null || (str3 = j29.b()) == null) {
                str3 = "";
            }
            c11289x4ff06936.f33192xedb9d9a = str3;
            bw5.v70 d39 = tingItem.d();
            if (d39 == null || (j28 = d39.j()) == null || (str4 = j28.e()) == null) {
                str4 = "";
            }
            c11289x4ff06936.f33199xd0293a5e = str4;
            bw5.v70 d47 = tingItem.d();
            c11289x4ff06936.f33197xafbf827 = (d47 == null || (j27 = d47.j()) == null) ? 0L : j27.f117428r;
            bw5.v70 d48 = tingItem.d();
            if (d48 == null || (j19 = d48.j()) == null || (str5 = j19.f()) == null) {
                str5 = "";
            }
            c11289x4ff06936.f33196x187d426e = str5;
            c11289x4ff06936.f33193x89444d94 = rk4.j5.e(tingItem);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11290x5453c607 c11290x5453c607 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11290x5453c607();
            bw5.v70 d49 = tingItem.d();
            if (d49 == null || (j18 = d49.j()) == null || (str6 = j18.j()) == null) {
                str6 = "";
            }
            c11290x5453c607.f33206x54340220 = str6;
            c11289x4ff06936.f33202x8b1eb086 = c11290x5453c607;
            java.lang.String str7 = c11289x4ff06936.f33201x324c710a;
            if (((str7 == null || str7.length() == 0) ? 1 : 0) != 0) {
                c11289x4ff06936.f33201x324c710a = rk4.m.f478368b;
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55042 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
            c11286x34a55042.f33122xe4128443 = c11289x4ff06936;
            c11286x34a55042.f33130x6942258 = rk4.j5.j(tingItem);
            c11286x34a55042.f33121x993583fc = c11289x4ff06936.f33203x2b375427;
            c11286x34a55042.f33128x4f3b3aa0 = null;
            bw5.v70 d57 = tingItem.d();
            if (d57 != null && (j17 = d57.j()) != null && (d17 = j17.d()) != null) {
                str = d17;
            }
            c11286x34a55042.f33125x9b39409a = str;
            android.content.Intent intent4 = new android.content.Intent();
            android.os.Bundle bundle2 = new android.os.Bundle();
            rk4.j5.d(tingItem);
            java.lang.String str8 = c11289x4ff06936.f33202x8b1eb086.f33206x54340220;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req2 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
            req2.f33049x38eb0007 = c11286x34a55042;
            req2.mo48427x792022dd(bundle2);
            intent4.putExtra("Ksnsupload_timeline", bundle2);
            if (il4.l.k(i17)) {
                intent4.putExtra("Ksnsupload_appid", rk4.j5.a(tingItem));
            }
            intent4.putExtra("music_mv_cover_url", rk4.j5.d(tingItem));
            intent4.putExtra("Ksnsupload_musicid", tingItem.d().m13170xcc16feb8());
            intent4.putExtra("Ksnsupload_appname", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n4u));
            java.lang.String a17 = c01.n2.a("music_player");
            c01.n2.d().c(a17, true).i("prePublishId", "music_player");
            intent4.putExtra("reportSessionId", a17);
            intent4.putExtra("Ksnsupload_music_share_object_xml", ((m21.r) ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).wi(b18.c(tingItem))).a());
            intent4.putExtra("Ksnsupload_type", 37);
            intent4.putExtra("need_result", true);
            intent4.putExtra("Ksnsupload_source", 1);
            j45.l.v(activity, ".plugin.sns.ui.SnsUploadUI", intent4, 1002);
            return;
        }
        if (j39 == 3) {
            wm1.h b19 = x0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            b19.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "context");
            bw5.v70 d58 = tingItem.d();
            if (!il4.l.i(d58 != null ? d58.f115722e : 0)) {
                ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Bi(rk4.j5.d(tingItem), new wm1.e(tingItem, activity, b19));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioShareHelper", "favLocalFile fileName: " + tingItem.d().i().b() + ", filePath: " + tingItem.d().i().m12386x5000ed37());
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            c5303xc75d2f73.f135623g.f87856i = activity;
            o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
            java.lang.String m12386x5000ed37 = tingItem.d().i().m12386x5000ed37();
            java.lang.String b27 = tingItem.d().i().b();
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) c5Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.k(c5303xc75d2f73, 36, m12386x5000ed37, b27, "", "");
            pm0.v.X(new wm1.d(c5303xc75d2f73));
            return;
        }
        if (j39 == 4) {
            try {
                d60Var = new bw5.d60().mo11468x92b714fd(this.f519570h);
            } catch (java.lang.Exception unused) {
                d60Var = null;
            }
            wm1.h b28 = x0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            b28.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            if (d60Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizAudioShareHelper", "setMusicToStatus commentInfo is null");
                return;
            }
            try {
                r45.wd6 wd6Var = new r45.wd6();
                bw5.v70 d59 = tingItem.d();
                wd6Var.f470611d = d59 != null ? d59.m13170xcc16feb8() : null;
                wd6Var.f470612e = d60Var.m11731x6e095e9(206) ? d60Var.W : "";
                str2 = android.util.Base64.encodeToString(wd6Var.mo14344x5f01b1f6(), 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizAudioShareHelper", "getStatusFooterJumpListen exp: " + e17.getMessage());
                str2 = "";
            }
            if (r26.n0.N(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizAudioShareHelper", "statusFooterJumpListen is null");
                return;
            }
            pj4.j0 j0Var = new pj4.j0();
            j0Var.f436672d = "15";
            j0Var.f436675g = str2;
            java.util.List k17 = kz5.c0.k(j0Var);
            if (tingItem.d().f115722e == 1) {
                bw5.v70 d66 = tingItem.d();
                if (d66 != null && d66.m13172x6e095e9(106)) {
                    bw5.v70 d67 = tingItem.d();
                    if ((d67 != null ? d67.j() : null) != null) {
                        pj4.j0 j0Var2 = new pj4.j0();
                        j0Var2.f436672d = "1";
                        j0Var2.f436674f = ((nm3.e) ((qk.z8) i95.n0.c(qk.z8.class))).wi(tingItem);
                        k17.add(j0Var2);
                    }
                }
            }
            pj4.j0 j0Var3 = new pj4.j0();
            j0Var3.f436672d = "3";
            j0Var3.f436674f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
            k17.add(j0Var3);
            xe0.g0 g0Var = (xe0.g0) i95.n0.c(xe0.g0.class);
            bi4.c1 c1Var = new bi4.c1();
            c1Var.b(d60Var.m11731x6e095e9(205) ? d60Var.V : "");
            java.lang.String Ni = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ni(rk4.j5.d(tingItem));
            bi4.d1 d1Var = c1Var.f102567a;
            d1Var.f436471e = Ni;
            c1Var.f("listen@inner");
            c1Var.g(d60Var.m11731x6e095e9(204) ? d60Var.U : "");
            c1Var.e(d60Var.m11731x6e095e9(203) ? d60Var.T : "");
            c1Var.h(d60Var.m11731x6e095e9(201) ? d60Var.S : "");
            c1Var.c(k17);
            d1Var.f436473g = false;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) g0Var).Ni(activity, 1003, d1Var);
        }
    }
}
