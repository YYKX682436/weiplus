package qa4;

/* loaded from: classes4.dex */
public final class k implements n85.g {

    /* renamed from: a, reason: collision with root package name */
    public static final qa4.k f442628a = new qa4.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f442629b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f442630c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f442631d = "";

    @Override // n85.g
    public void a(android.content.Context context, java.lang.String snsId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showDetailUI", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(snsId);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WithTaComposeOp", "showDetailUI snsInfo is null :snsId:%s", snsId);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showDetailUI", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WithTaComposeOp", "showDetailUI snsId:%s localId:%d", snsId, java.lang.Integer.valueOf(b17.f38324x142bbdc6));
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.class);
        intent.putExtra("INTENT_TALKER", f442631d);
        intent.putExtra("INTENT_NEED_RPT_FEED", true);
        intent.putExtra("INTENT_SNS_LOCAL_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("sns_table_", b17.f38324x142bbdc6));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/model/withta/WithTaComposeOp", "showDetailUI", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/model/withta/WithTaComposeOp", "showDetailUI", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showDetailUI", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
    }

    @Override // n85.g
    public java.lang.String b(int i17, r45.jj4 media) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        java.lang.String i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.i("sns_table_" + i17, media);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return i18;
    }

    @Override // n85.g
    public boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSelf", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        boolean equals = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj().equals(f442631d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSelf", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return equals;
    }

    @Override // n85.g
    public void d(android.content.Context context, p3325xe03a0797.p3326xc267989b.y0 scope, java.lang.String seq, int i17, int i18, yz5.l cb6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showAlertListDialog", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seq, "seq");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showAlertListDialog", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        linkedList.add(new jz5.l(1, string));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.f293405n = new qa4.l(linkedList);
        k0Var.r(context.getString(i18), 17, i65.a.b(context, 12), null);
        k0Var.f293414s = new qa4.n(scope, seq, i17, cb6);
        k0Var.v();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAlertListDialog", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAlertListDialog", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
    }

    @Override // n85.g
    public void e(android.content.Context context, int i17, boolean z17, n85.e data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("imagePreview", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.class);
        intent.putExtra("sns_gallery_userName", f442631d);
        intent.putExtra("sns_gallery_is_self", z17);
        intent.putExtra("sns_gallery_localId", i17);
        intent.putExtra("key_from_scene", 4);
        intent.putExtra("sns_gallery_position", data.f417238b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj().s(f442631d, data.f417237a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/model/withta/WithTaComposeOp", "imagePreview", "(Landroid/content/Context;IZLcom/tencent/mm/sns_compose/api/GalleryData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/model/withta/WithTaComposeOp", "imagePreview", "(Landroid/content/Context;IZLcom/tencent/mm/sns_compose/api/GalleryData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("imagePreview", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
    }

    @Override // n85.g
    public java.lang.Object f(r45.jj4 jj4Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsMediaBitmap", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageFromMedia", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new qa4.a(jj4Var, z17, null), interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageFromMedia", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsMediaBitmap", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return g17;
    }

    @Override // n85.g
    public java.lang.String g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWithFriends", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        java.lang.String str = f442630c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithFriends", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return str;
    }

    @Override // n85.g
    /* renamed from: getDisplayName */
    public java.lang.String mo146958x40021d37(java.lang.String userName) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayName", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String a17 = c01.a2.a(userName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getDisplayRemark(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayName", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return a17;
    }

    @Override // n85.g
    /* renamed from: getUsername */
    public java.lang.String mo146959x6c03c64c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUsername", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        java.lang.String str = f442631d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUsername", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return str;
    }

    @Override // n85.g
    public java.lang.Object h(java.lang.String str, java.lang.String str2, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImagePath", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImagePath", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new qa4.b(str, str2, z17, null), interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImagePath", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImagePath", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return g17;
    }

    @Override // n85.g
    public java.lang.String i(android.content.Context context, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayTime", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        long j17 = i17 * 1000;
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.f251654a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fromatSnsWithTa", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTimeInMillis(j17);
        boolean z17 = calendar.get(1) == calendar2.get(1);
        boolean z18 = z17 && calendar.get(2) == calendar2.get(2);
        boolean z19 = z17 && z18 && calendar.get(5) == calendar2.get(5);
        boolean z27 = z17 && z18 && calendar.get(5) - 1 == calendar2.get(5);
        if (!z27) {
            if ((z17 && calendar.get(2) - 1 == calendar2.get(2)) || calendar.get(1) - calendar2.get(1) == 1) {
                calendar.add(5, -1);
                z27 = calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
            }
        }
        if (z19) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fd_);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromatSnsWithTa", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        } else if (z27) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromatSnsWithTa", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        } else {
            java.lang.String str2 = z17 ? (java.lang.String) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j17) : (java.lang.String) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), j17);
            if (str2.indexOf("-") > 0) {
                int i18 = calendar2.get(2) + 1;
                str2 = calendar2.get(5) + " " + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.e(context, i18);
                if (!z17) {
                    str2 = str2 + " " + calendar2.get(1);
                }
            }
            str = str2 + " " + ((java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.c(context, j17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromatSnsWithTa", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        }
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayTime", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return str;
    }

    @Override // n85.g
    public void j(android.content.Context context, java.lang.String username, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startProfile", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", username);
        intent.putExtra("Contact_Scene", i17);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", i18);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startProfile", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
    }

    @Override // n85.g
    public java.lang.Object k(long j17, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPage", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        java.lang.Object a17 = qa4.h.f442624a.a(j17, i17, f442631d, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPage", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return a17;
    }

    @Override // n85.g
    public java.lang.String l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelfName", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        java.lang.String sj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sj6, "getSelfName(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelfName", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return sj6;
    }

    @Override // n85.g
    public long m(java.lang.String snsId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unPackSnsId", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        long n17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(snsId);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackSnsId", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return n17;
    }

    @Override // n85.g
    public fk4.p n(int i17, r45.jj4 media, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsVideoTask", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        xd4.i0 i0Var = new xd4.i0(media, i18, "sns_table_" + i17, new ok4.c(java.lang.System.currentTimeMillis()), new qa4.i());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVideoTask", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return i0Var;
    }

    @Override // n85.g
    public java.lang.Object o(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatarBitmap", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarBitmap", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return a17;
    }

    @Override // n85.g
    public boolean p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTogetherVideoEnabled", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTogetherVideoEnabled", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_together_video_enabled, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTogetherVideoEnabled", "com.tencent.mm.plugin.sns.model.SnsConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTogetherVideoEnabled", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return fj6;
    }

    @Override // n85.g
    public java.lang.String q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRemark", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = f442631d;
        ((sg3.a) v0Var).getClass();
        java.lang.String a17 = c01.a2.a(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getDisplayRemark(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRemark", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return a17;
    }

    @Override // n85.g
    public int r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ownerSetting", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        int i17 = 0;
        if (p94.w0.c() != null) {
            r45.cb6 b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(f442631d);
            if (b17 != null) {
                int i18 = b17.f452964g;
                int i19 = b17.f452965h;
                if (i19 == 4320 && (i18 & 4096) > 0) {
                    i17 = 1;
                } else if (i19 == 72 && (i18 & 4096) > 0) {
                    i17 = 2;
                } else if (i19 == 720 && (i18 & 4096) > 0) {
                    i17 = 3;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ownerSetting", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
                return i17;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ownerSetting", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return 0;
    }

    public final java.util.ArrayList s() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWithFriendsNameList", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        java.util.ArrayList arrayList = f442629b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithFriendsNameList", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(java.lang.String r9, int r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r8 = this;
            java.lang.String r0 = "snsWithTaOpRequest"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r11 instanceof qa4.j
            if (r2 == 0) goto L1b
            r2 = r11
            qa4.j r2 = (qa4.j) r2
            int r3 = r2.f442627f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f442627f = r3
            goto L20
        L1b:
            qa4.j r2 = new qa4.j
            r2.<init>(r8, r11)
        L20:
            java.lang.Object r11 = r2.f442625d
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f442627f
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L2f
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L76
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r9
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            com.tencent.mm.modelbase.l r11 = new com.tencent.mm.modelbase.l
            r11.<init>()
            r4 = 5213(0x145d, float:7.305E-42)
            r11.f152200d = r4
            java.lang.String r4 = "/cgi-bin/micromsg-bin/mmsnswithtaop"
            r11.f152199c = r4
            r45.kb6 r4 = new r45.kb6
            r4.<init>()
            long r6 = ca4.z0.F0(r9)
            r4.f460111d = r6
            r4.f460112e = r10
            r11.f152197a = r4
            r45.lb6 r9 = new r45.lb6
            r9.<init>()
            r11.f152198b = r9
            com.tencent.mm.modelbase.o r9 = r11.a()
            o01.c r10 = o01.d.f423424a
            kotlinx.coroutines.flow.j r9 = r10.a(r9)
            r2.f442627f = r5
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.o(r9, r2)
            if (r11 != r3) goto L76
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L76:
            r9 = r11
            o01.a r9 = (o01.a) r9
            q01.f r9 = r9.f440817a
            q01.f r10 = q01.f.f440809e
            r2 = 0
            if (r9 != r10) goto L82
            r9 = r5
            goto L83
        L82:
            r9 = r2
        L83:
            if (r9 == 0) goto L86
            goto L87
        L86:
            r11 = 0
        L87:
            o01.a r11 = (o01.a) r11
            if (r11 == 0) goto L92
            r45.ny3 r9 = r11.f440822f
            r45.lb6 r9 = (r45.lb6) r9
            if (r9 == 0) goto L92
            goto L93
        L92:
            r5 = r2
        L93:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qa4.k.t(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
