package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes8.dex */
public final class d8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8 f183625a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8();

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8 d8Var, android.content.Context context, android.widget.TextView descTv, java.lang.String logTag, java.lang.String allText, java.util.ArrayList h5urlList, java.util.ArrayList linkTextList, android.content.Intent intent, int i17, java.lang.Object obj) {
        android.content.Intent intent2 = (i17 & 64) != 0 ? null : intent;
        d8Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descTv, "descTv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logTag, "logTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allText, "allText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h5urlList, "h5urlList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkTextList, "linkTextList");
        android.text.SpannableString spannableString = new android.text.SpannableString(allText);
        int i18 = 0;
        for (java.lang.Object obj2 : linkTextList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj2;
            int L = r26.n0.L(allText, str, 0, false, 6, null);
            int length = str.length() + L;
            if (L >= 0 && length <= allText.length()) {
                java.lang.Object obj3 = h5urlList.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl((java.lang.String) obj3, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29), false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b8(logTag, intent2, context), 24, null), L, length, 17);
            }
            i18 = i19;
        }
        descTv.setText(spannableString);
        descTv.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c8(spannableString, descTv));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fa A[Catch: JSONException -> 0x0259, TryCatch #0 {JSONException -> 0x0259, blocks: (B:43:0x01e5, B:46:0x01f2, B:48:0x01fa, B:49:0x0205, B:51:0x020c, B:52:0x0217, B:54:0x022d, B:56:0x0233, B:57:0x023e, B:59:0x0245, B:61:0x024b, B:62:0x0253), top: B:42:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020c A[Catch: JSONException -> 0x0259, TryCatch #0 {JSONException -> 0x0259, blocks: (B:43:0x01e5, B:46:0x01f2, B:48:0x01fa, B:49:0x0205, B:51:0x020c, B:52:0x0217, B:54:0x022d, B:56:0x0233, B:57:0x023e, B:59:0x0245, B:61:0x024b, B:62:0x0253), top: B:42:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 r25, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 r26) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.a(androidx.appcompat.app.AppCompatActivity, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader):void");
    }

    public final java.util.Map b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, java.lang.String str, int i17, int i18) {
        jz5.l[] lVarArr = new jz5.l[4];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        lVarArr[0] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f216918q : null);
        lVarArr[1] = new jz5.l("feed_id", str);
        lVarArr[2] = new jz5.l("describe_trigger_type", java.lang.Integer.valueOf(i17));
        lVarArr[3] = new jz5.l("share_sns_button_type", java.lang.Integer.valueOf(i18));
        java.util.Map l17 = kz5.c1.l(lVarArr);
        if (i18 > 0) {
            l17.put("share_sns_button_type", java.lang.Integer.valueOf(i18));
        }
        return l17;
    }

    public final void c(android.view.View view, int i17, java.util.Map map) {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "share_to_sns_describe");
        aVar.ik(view, i17, 25496);
        aVar.gk(view, map);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUIUtil", "[initReport] policy=" + i17);
    }

    public void d(java.lang.Object obj, android.widget.ImageView imageView) {
        if (obj == null || imageView == null || !(obj instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj, 1);
        r45.mb4 mb4Var = a17.m59311x25315bf4() ? (r45.mb4) kz5.n0.Z(a17.m59259x7dea7760()) : (r45.mb4) kz5.n0.Z(a17.m59264x7efe73ec());
        if (mb4Var == null) {
            return;
        }
        int m75939xb282bd08 = mb4Var.m75939xb282bd08(2);
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (m75939xb282bd08 == 4) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(16))) {
                g1Var.e().c(new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null), imageView, g1Var.h(mn2.f1.B));
                return;
            } else {
                g1Var.e().c(new mn2.r3(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, 4, null), imageView, g1Var.h(mn2.f1.B));
                return;
            }
        }
        if (mb4Var.m75939xb282bd08(2) != 9) {
            g1Var.e().c(new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null), imageView, g1Var.h(mn2.f1.B));
            return;
        }
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        java.lang.String concat = m75945x2fec8307.concat(m75945x2fec83072);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.m75945x2fec8307(1));
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(19);
            sb6.append(m75945x2fec83073 != null ? m75945x2fec83073 : "");
            concat = sb6.toString();
        }
        g1Var.e().c(new mn2.q3(concat, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, g1Var.h(mn2.f1.B));
    }

    public final void e(android.content.Context context, android.widget.TextView descTv, java.lang.String logTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descTv, "descTv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logTag, "logTag");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.crw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String format = java.lang.String.format("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/cgi-bin/readtemplate?lang=%s&t=weixin_agreement&s=video", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(context)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        arrayList.add(format);
        java.lang.String format2 = java.lang.String.format("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/cgi-bin/readtemplate?t=finder_privacy", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        arrayList.add(format2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.crk));
        arrayList2.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.crs));
        android.text.SpannableString spannableString = new android.text.SpannableString(string);
        java.util.Iterator it = arrayList2.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) next;
            int L = r26.n0.L(string, str, 0, false, 6, null);
            int length = str.length() + L;
            if (L >= 0 && length <= string.length()) {
                java.lang.Object obj = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl((java.lang.String) obj, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29), false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a8(logTag, context), 24, null), L, length, 17);
            }
            i17 = i18;
        }
        descTv.setText(spannableString);
        descTv.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c8(spannableString, descTv));
    }
}
