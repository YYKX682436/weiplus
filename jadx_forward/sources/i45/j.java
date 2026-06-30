package i45;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i45.j f369948a = new i45.j();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f369949b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f369950c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f369951d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f369952e;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("send_text");
        hashSet.add("send_message");
        hashSet.add("send_big_emoji");
        hashSet.add("send_appbrand");
        hashSet.add("send_message_finder_card");
        hashSet.add("send_message_biz_card");
        hashSet.add("send_message_emoji");
        hashSet.add("open_appbrand");
        hashSet.add("open_music_video");
        hashSet.add("open_finder_profile");
        hashSet.add("open_biz_profile");
        hashSet.add("send_img");
        hashSet.add("open_url_on_pc");
        hashSet.add("verify_identity");
        hashSet.add("verify_identity_token");
        hashSet.add("check_identity_token");
        hashSet.add("verify_file");
        f369952e = hashSet;
    }

    public final boolean a(i45.c cVar) {
        if (cVar == null) {
            return false;
        }
        return c01.id.a() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").getLong("mmkv_key_voice_to_text_after_config_insert_last_time", 0L) > ((long) cVar.f369931c) * 3600000 && com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").getLong("mmkv_key_voice_to_text_after_config_insert_time", 0L) < ((long) cVar.f369932d);
    }

    public final boolean b(i45.b bVar) {
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeHelper", "checkIfNeedShowFullTextGuide: textGuide == null ");
            return false;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").getBoolean("mmkv_key_full_text_config_has_click", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkIfNeedShowFullTextGuide: hasClick(");
        sb6.append(z17);
        sb6.append(',');
        int i17 = bVar.f369928e;
        sb6.append((i17 & 1) == 1);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", sb6.toString());
        if (z17) {
            if ((i17 & 1) == 1) {
                return false;
            }
        }
        long a17 = c01.id.a() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").getLong("mmkv_key_full_text_config_insert_last_time", 0L);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkIfNeedShowFullTextGuide: interval(");
        sb7.append(a17);
        sb7.append(',');
        int i18 = bVar.f369925b;
        sb7.append(i18);
        sb7.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", sb7.toString());
        if (a17 < i18 * 3600000) {
            return false;
        }
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").getLong("mmkv_key_full_text_config_insert_count", 0L);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("checkIfNeedShowFullTextGuide: maxCount(");
        sb8.append(j17);
        sb8.append(", ");
        int i19 = bVar.f369926c;
        sb8.append(i19);
        sb8.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", sb8.toString());
        if (j17 >= i19) {
            return false;
        }
        long j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").getLong("mmkv_key_scene_full_text_config_start_timestamp", 0L);
        long a18 = c01.id.a() - j18;
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("checkIfNeedShowFullTextGuide: curAliveTime(");
        sb9.append(j18);
        sb9.append(", ");
        sb9.append(a18);
        sb9.append(", ");
        int i27 = bVar.f369927d;
        sb9.append(i27);
        sb9.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", sb9.toString());
        return a18 < ((long) i27) * 3600000;
    }

    public final boolean c(android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        if (bundle.getBoolean("f_t_f_pfd", false)) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) bundle.getParcelable(str);
            if (parcelFileDescriptor == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeHelper", "fileReplacePfdToPath: pfd null");
                return false;
            }
            java.lang.String e17 = f369948a.e();
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(parcelFileDescriptor.getFileDescriptor());
            com.p314xaae8f345.mm.vfs.y6 y6Var = new com.p314xaae8f345.mm.vfs.y6(new com.p314xaae8f345.mm.vfs.r6(e17));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    y6Var.write(bArr, 0, read);
                }
                bundle.putString(str2, e17);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxImeHelper", "fileReplace exception:" + e18.getMessage());
                return false;
            } finally {
                fileInputStream.close();
                y6Var.close();
                parcelFileDescriptor.close();
                bundle.remove(str);
            }
        }
        return true;
    }

    public final java.lang.String d() {
        android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("default_input_method");
        arrayList.add(contentResolver);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        java.lang.String str = (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/pluginsdk/wxime/WxImeHelper", "getCurIme", "()Ljava/lang/String;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", "getCurIme: " + str);
        return str != null ? (java.lang.String) r26.n0.f0(str, new java.lang.String[]{"/"}, false, 0, 6, null).get(0) : "";
    }

    public final java.lang.String e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        sb6.append(lp0.b.h0("ime").u());
        sb6.append(java.io.File.separator);
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.vfs.w6.e(sb7);
        return sb7;
    }

    public final java.lang.String f(boolean z17) {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").getString("mmkv_key_verify_token_wx_id", "");
        java.lang.String str = string != null ? string : "";
        if (z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y(16);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").putString("mmkv_key_verify_token_wx_id", str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", "getTempWxId result:" + str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i45.c g() {
        /*
            r6 = this;
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r1 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "getPackageManager(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.MAIN"
            r3 = 0
            r1.<init>(r2, r3)
            java.lang.String r2 = "android.intent.category.LAUNCHER"
            r1.addCategory(r2)
            java.lang.String r2 = "com.tencent.wetype"
            r1.setPackage(r2)
            r2 = 0
            android.content.pm.ResolveInfo r0 = r0.resolveActivity(r1, r2)
            r1 = 1
            if (r0 == 0) goto L2b
            r2 = r1
        L2b:
            if (r2 == 0) goto L2e
            return r3
        L2e:
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r2 = e42.d0.clicfg_voice_to_text_after_send_wetype_tips_config
            h62.d r0 = (h62.d) r0
            java.lang.String r4 = "{}"
            java.lang.String r0 = r0.Zi(r2, r4, r1)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r1 != 0) goto Lcc
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r4, r0)
            if (r1 == 0) goto L4f
            goto Lcc
        L4f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb4
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r0 = "text"
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch: java.lang.Exception -> Lb4
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()     // Catch: java.lang.Exception -> Lb4
            if (r2 == 0) goto L62
            goto L75
        L62:
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n()     // Catch: java.lang.Exception -> Lb4
            if (r2 == 0) goto L6c
            java.lang.String r2 = "traditional_chinese"
            goto L78
        L6c:
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()     // Catch: java.lang.Exception -> Lb4
            if (r2 != 0) goto L75
            java.lang.String r2 = "english"
            goto L78
        L75:
            java.lang.String r2 = "simplified_chinese"
        L78:
            org.json.JSONObject r0 = r0.getJSONObject(r2)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r2 = "content"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r4 = "match"
            java.lang.String r0 = r0.getString(r4)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r4 = "interval"
            int r4 = r1.getInt(r4)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r5 = "max_time"
            int r1 = r1.getInt(r5)     // Catch: java.lang.Exception -> Lb4
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)     // Catch: java.lang.Exception -> Lb4
            if (r5 != 0) goto Lb3
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)     // Catch: java.lang.Exception -> Lb4
            if (r5 == 0) goto La1
            goto Lb3
        La1:
            i45.c r5 = new i45.c     // Catch: java.lang.Exception -> Lb4
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)     // Catch: java.lang.Exception -> Lb4
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)     // Catch: java.lang.Exception -> Lb4
            r5.<init>(r2, r0, r4, r1)     // Catch: java.lang.Exception -> Lb4
            boolean r0 = r6.a(r5)     // Catch: java.lang.Exception -> Lb4
            if (r0 == 0) goto Lb3
            return r5
        Lb3:
            return r3
        Lb4:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getVoiceToTextAfterSendText, fail, reason:"
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.WxImeHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
        Lcc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i45.j.g():i45.c");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0188, code lost:
    
        if (r0 == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x08a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(android.view.View r63, java.lang.String r64, java.lang.String r65, android.os.Bundle r66, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5 r67) {
        /*
            Method dump skipped, instructions count: 3391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i45.j.h(android.view.View, java.lang.String, java.lang.String, android.os.Bundle, com.tencent.mm.pluginsdk.ui.chat.k5):boolean");
    }

    public final void i(android.content.Context context, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(en1.a.a())) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
            intent.putExtra("report_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
            intent.putExtra("report_scene", 1);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(en1.a.a()) ? 3 : 2, 3, 32, intent);
        intent.putExtra("key_enter_profile_type", 4);
        intent.putExtra("key_entrance_type", 32);
        intent.putExtra("from_user", en1.a.a());
        intent.putExtra("finder_username", bundle.getString(dm.i4.f66875xa013b0d5, ""));
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", bundle.getString("nickname", ""));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f542005a.w(context, intent);
        i45.k.a(i45.k.f369953a, 2L, 100000, null, null, null, null, null, null, bundle.getString(dm.i4.f66875xa013b0d5, ""), null, 764, null);
    }

    public final void j(android.content.Context context, android.os.Bundle bundle, i45.d dVar) {
        java.lang.String string = bundle.getString("pc_open_url", "");
        java.lang.String string2 = bundle.getString("pc_open_title", string);
        java.lang.String string3 = bundle.getString("pc_open_title", "");
        java.lang.String string4 = bundle.getString("pc_open_title", "");
        if (string == null || string.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxImeHelper", "openUrlOnPc Fail(empty url) url:" + string + ", title:" + string2);
            i45.d.b(dVar, -1L, null, null, 6, null);
            return;
        }
        if (!((d73.i) i95.n0.c(d73.i.class)).Qg()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxImeHelper", "openUrlOnPc Fail(pc not ready) url:" + string + ", title:" + string2);
            i45.d.b(dVar, 4L, null, null, 6, null);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef c16092xbbe22aef = new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef(string2, string, string3, 0, null, null, null, null, 248, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string4);
        c16092xbbe22aef.m65138x7ac946f0(string4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", "openUrlOnPc Success(send success) url:" + string + ", title:" + string2);
        ((d73.i) i95.n0.c(d73.i.class)).f6(c16092xbbe22aef);
        i45.d.b(dVar, 0L, null, null, 6, null);
    }

    public final void k(android.content.Context context, android.os.Bundle bundle, java.lang.String str, i45.d dVar) {
        java.lang.String string = bundle.getString("imgUid", "");
        if (!c(bundle, "imgPfd", "imgPath")) {
            i45.d.b(dVar, 5L, null, null, 6, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeHelper", "shareImg: fileReplacePfdToPath false.");
            return;
        }
        java.lang.String string2 = bundle.getString("imgPath", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", "shareImg() called with: context = " + context + ", imgPath = " + string2 + ", toUser = " + str + " imgUid:" + string);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W0(android.net.Uri.parse(string2))) {
            i45.d.b(dVar, 3L, null, null, 6, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeHelper", "shareImg: isUriSafeToBeCopySrc false: no safe");
            return;
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.e(string2)) {
            ((dk5.s5) tg3.t1.a()).Vi(context, str, string2, 1, "", "", null);
            i45.k.a(i45.k.f369953a, 2L, 2, null, null, null, null, null, null, null, string, 508, null);
        } else {
            i45.d.b(dVar, 3L, null, null, 6, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeHelper", "shareImg: checkFileValid is false ");
        }
    }

    public final jz5.l l(java.lang.String str) {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").getString("mmkv_key_verify_token_success_str", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", "verifyIdentityTokenValid curToken:" + string + ", identityToken:" + str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(string, str)) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            return new jz5.l(bool, bool);
        }
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").getLong("mmkv_key_verify_token_valid_time", 0L);
        long b17 = c01.id.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", "verifyIdentityTokenValid validTimestamp:" + j17 + ", current:" + b17);
        return new jz5.l(java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(j17 > b17));
    }
}
