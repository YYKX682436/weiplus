package l53;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final m33.k1 f398193a;

    /* renamed from: b, reason: collision with root package name */
    public final int f398194b;

    /* renamed from: c, reason: collision with root package name */
    public l53.a f398195c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f398196d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f398197e;

    public i(m33.k1 videoFile, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoFile, "videoFile");
        this.f398193a = videoFile;
        this.f398194b = i17;
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video , user cancel");
        java.lang.String str = this.f398196d;
        if (str != null) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(str);
        }
        this.f398197e = true;
        l53.a aVar = this.f398195c;
        if (aVar != null) {
            aVar.mo64831x3d6f0539();
        }
        this.f398195c = null;
    }

    public final void b(android.content.Context context, l53.a aVar) {
        l53.b bVar;
        l53.a aVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f398195c = aVar;
        m33.k1 k1Var = this.f398193a;
        java.lang.String absFilePath = k1Var.f404838c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(absFilePath, "absFilePath");
        java.util.HashMap hashMap = l53.c.f398173a;
        if (hashMap != null) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(absFilePath));
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            bVar = (l53.b) hashMap.get(kk.k.a(r6Var));
        } else {
            bVar = null;
        }
        if (bVar != null) {
            java.lang.String str = bVar.f398171b;
            if (!(str == null || str.length() == 0)) {
                java.lang.String str2 = bVar.f398172c;
                if (!(str2 == null || str2.length() == 0)) {
                    int i17 = this.f398194b;
                    if (i17 == 1) {
                        c(context, str, str2);
                        return;
                    }
                    if (i17 == 2) {
                        d(context, str, str2);
                        return;
                    } else {
                        if (i17 == 3 && (aVar2 = this.f398195c) != null) {
                            aVar2.b(str, str2);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        java.lang.String str3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.ONE_MONTH) + "haowan/") + "vsg_thumb_" + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        if (!java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(android.media.ThumbnailUtils.createVideoThumbnail(k1Var.f404838c, 1), 50, android.graphics.Bitmap.CompressFormat.JPEG, str3, true)).booleanValue()) {
            l53.a aVar3 = this.f398195c;
            if (aVar3 != null) {
                aVar3.a("thumbPic create error");
                return;
            }
            return;
        }
        java.lang.String str4 = k1Var.f404838c;
        l53.h hVar = new l53.h(this, context);
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(k1Var.f404838c) + java.lang.System.currentTimeMillis();
        this.f398196d = str5;
        dn.m mVar = new dn.m();
        mVar.f69592xf1ebe47b = 20302;
        java.lang.String str6 = k1Var.f404838c;
        mVar.f69595x6d25b0d9 = str6;
        mVar.f69580x454032b6 = 214;
        mVar.f69601xaca5bdda = str5;
        mVar.f69620xeb1a61d6 = com.p314xaae8f345.mm.vfs.w6.k(str6);
        mVar.f69609xd84b8349 = 3;
        mVar.f323320f = hVar;
        mVar.f323319e = true;
        mVar.f69606xccdbf540 = true;
        mVar.f69584x89a4c0cf = 2;
        mVar.f69619xe9ed65f6 = str3;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }

    public final void c(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (!(context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f)) {
            l53.a aVar = this.f398195c;
            if (aVar != null) {
                aVar.a("shareToFriend context need MMFragmentActivity");
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context;
        l53.a aVar2 = this.f398195c;
        if (aVar2 != null) {
            aVar2.c();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", str);
        hashMap.put("img_url", str2);
        m33.k1 k1Var = this.f398193a;
        java.lang.String str3 = k1Var.f404840e;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str3);
        java.lang.String str4 = k1Var.f404841f;
        hashMap.put("desc", str4 != null ? str4 : "");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("scene_from", 2);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("webview_params", hashMap);
        intent.putExtra("Retr_Msg_Type", 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.f9.a(str2);
        j45.l.x(activityC21401x6ce6f73f, ".ui.transmit.SelectConversationUI", intent, 1001, new l53.f(this, str2, activityC21401x6ce6f73f, str, hashMap));
    }

    public final void d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        l53.a aVar = this.f398195c;
        if (aVar != null) {
            aVar.c();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_link", str);
        java.lang.String str3 = this.f398193a.f404840e;
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("Ksnsupload_title", str3);
        intent.putExtra("Ksnsupload_imgurl", str2);
        intent.putExtra("ShareUrlOriginal", str);
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_type", 1);
        if (!(context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f)) {
            j45.l.k(context, "sns", ".ui.SnsUploadUI", intent, false);
        } else {
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).m78750xc5512edd(new l53.g(this, context));
            j45.l.o(context, "sns", ".ui.SnsUploadUI", intent, 1002, false);
        }
    }
}
