package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class d8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.d8 f102092a = new com.tencent.mm.plugin.finder.assist.d8();

    public static void f(com.tencent.mm.plugin.finder.assist.d8 d8Var, android.content.Context context, android.widget.TextView descTv, java.lang.String logTag, java.lang.String allText, java.util.ArrayList h5urlList, java.util.ArrayList linkTextList, android.content.Intent intent, int i17, java.lang.Object obj) {
        android.content.Intent intent2 = (i17 & 64) != 0 ? null : intent;
        d8Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(descTv, "descTv");
        kotlin.jvm.internal.o.g(logTag, "logTag");
        kotlin.jvm.internal.o.g(allText, "allText");
        kotlin.jvm.internal.o.g(h5urlList, "h5urlList");
        kotlin.jvm.internal.o.g(linkTextList, "linkTextList");
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
                kotlin.jvm.internal.o.f(obj3, "get(...)");
                spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl((java.lang.String) obj3, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2), false, false, new com.tencent.mm.plugin.finder.assist.b8(logTag, intent2, context), 24, null), L, length, 17);
            }
            i18 = i19;
        }
        descTv.setText(spannableString);
        descTv.setOnTouchListener(new com.tencent.mm.plugin.finder.assist.c8(spannableString, descTv));
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
    public final void a(androidx.appcompat.app.AppCompatActivity r25, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r26) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.d8.a(androidx.appcompat.app.AppCompatActivity, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader):void");
    }

    public final java.util.Map b(androidx.appcompat.app.AppCompatActivity context, java.lang.String str, int i17, int i18) {
        jz5.l[] lVarArr = new jz5.l[4];
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        lVarArr[0] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
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
        com.tencent.mars.xlog.Log.i("Finder.FinderUIUtil", "[initReport] policy=" + i17);
    }

    public void d(java.lang.Object obj, android.widget.ImageView imageView) {
        if (obj == null || imageView == null || !(obj instanceof com.tencent.mm.protocal.protobuf.FinderObject)) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) obj, 1);
        r45.mb4 mb4Var = a17.isLiveFeed() ? (r45.mb4) kz5.n0.Z(a17.getLiveMediaList()) : (r45.mb4) kz5.n0.Z(a17.getMediaList());
        if (mb4Var == null) {
            return;
        }
        int integer = mb4Var.getInteger(2);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (integer == 4) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(16))) {
                g1Var.e().c(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null), imageView, g1Var.h(mn2.f1.B));
                return;
            } else {
                g1Var.e().c(new mn2.r3(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, 4, null), imageView, g1Var.h(mn2.f1.B));
                return;
            }
        }
        if (mb4Var.getInteger(2) != 9) {
            g1Var.e().c(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null), imageView, g1Var.h(mn2.f1.B));
            return;
        }
        java.lang.String string = mb4Var.getString(16);
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = mb4Var.getString(20);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String concat = string.concat(string2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.getString(1));
            java.lang.String string3 = mb4Var.getString(19);
            sb6.append(string3 != null ? string3 : "");
            concat = sb6.toString();
        }
        g1Var.e().c(new mn2.q3(concat, com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, g1Var.h(mn2.f1.B));
    }

    public final void e(android.content.Context context, android.widget.TextView descTv, java.lang.String logTag) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(descTv, "descTv");
        kotlin.jvm.internal.o.g(logTag, "logTag");
        java.lang.String string = context.getString(com.tencent.mm.R.string.crw);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String format = java.lang.String.format("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/cgi-bin/readtemplate?lang=%s&t=weixin_agreement&s=video", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.sdk.platformtools.m2.f(context)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        arrayList.add(format);
        java.lang.String format2 = java.lang.String.format("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/cgi-bin/readtemplate?t=finder_privacy", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        arrayList.add(format2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(context.getString(com.tencent.mm.R.string.crk));
        arrayList2.add(context.getString(com.tencent.mm.R.string.crs));
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
                kotlin.jvm.internal.o.f(obj, "get(...)");
                spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl((java.lang.String) obj, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2), false, false, new com.tencent.mm.plugin.finder.assist.a8(logTag, context), 24, null), L, length, 17);
            }
            i17 = i18;
        }
        descTv.setText(spannableString);
        descTv.setOnTouchListener(new com.tencent.mm.plugin.finder.assist.c8(spannableString, descTv));
    }
}
