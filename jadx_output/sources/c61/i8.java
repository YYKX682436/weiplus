package c61;

@j95.b
/* loaded from: classes10.dex */
public final class i8 extends i95.w implements vd2.i5 {
    public mn2.h3 Ai(java.lang.String str, com.tencent.mm.plugin.finder.storage.y90 mediaType) {
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        return new mn2.q3(str, mediaType);
    }

    public void Bi(java.lang.String str, android.widget.ImageView imageView, mn2.f1 loaderType) {
        kotlin.jvm.internal.o.g(loaderType, "loaderType");
        vd2.i5.Fb(this, str, imageView, str, null, 8, null);
    }

    public void Di(java.lang.String str, android.widget.ImageView imageView, java.lang.String str2, mn2.f1 loaderType) {
        kotlin.jvm.internal.o.g(loaderType, "loaderType");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderUtilService", "#loadImage url=" + str + " md5Source=" + str2);
        if ((str == null || str.length() == 0) || imageView == null) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.e().b(new mn2.k0(str, str2, "", com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(loaderType)).c(imageView);
    }

    public void Ni(java.lang.String str, android.widget.ImageView imageView, mn2.f1 loaderType) {
        kotlin.jvm.internal.o.g(loaderType, "loaderType");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderUtilService", "#loadImage url=" + str);
        if (str == null || str.length() == 0) {
            return;
        }
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String j17 = hc2.l.j(str, "token");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.b(j17.getBytes()));
        mb4Var.set(0, str);
        mb4Var.set(1, str);
        java.lang.String k17 = hc2.l.k(j17);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        mn2.c1 c1Var = new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (imageView == null) {
            g1Var.e().b(c1Var, g1Var.h(loaderType)).a();
        } else {
            g1Var.e().b(c1Var, g1Var.h(loaderType)).c(imageView);
        }
    }

    public zy2.ic Ri(java.lang.String anchorFinderUsername, android.content.Context context, boolean z17, r45.qt2 contextObj, int i17) {
        kotlin.jvm.internal.o.g(anchorFinderUsername, "anchorFinderUsername");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kk.l lVar = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
        kk.l lVar2 = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
        ml2.q1 q1Var = ml2.q1.f327812e;
        return new com.tencent.mm.plugin.finder.profile.widget.s4(anchorFinderUsername, context, z17, contextObj, 101, false, false, lVar2, "temp_5", null, 512, null);
    }

    public java.lang.String Ui(int i17) {
        try {
            java.lang.String format = new java.text.DecimalFormat("0.##").format(i17 / 100.0d);
            kotlin.jvm.internal.o.f(format, "format(...)");
            return format;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderUtilService", e17.getMessage());
            return "";
        }
    }

    public void wi(java.util.List noticeList, yz5.p callback) {
        kotlin.jvm.internal.o.g(noticeList, "noticeList");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderUtilService", "decryptExportNoticeIds: noticeList size=" + noticeList.size());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = noticeList.iterator();
        while (it.hasNext()) {
            r45.h32 h32Var = (r45.h32) it.next();
            java.lang.String string = h32Var.getString(25);
            if (!(string == null || string.length() == 0)) {
                r45.ep1 ep1Var = new r45.ep1();
                ep1Var.set(0, 1);
                ep1Var.set(1, h32Var.getString(25));
                linkedList.add(ep1Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderUtilService", "decryptExportNoticeIds: add encrypted item, export_notice_id=" + h32Var.getString(25));
            }
        }
        if (!linkedList.isEmpty()) {
            new ke2.m(linkedList).l().K(new c61.f8(linkedList, callback, noticeList));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.FinderUtilService", "decryptExportNoticeIds: no encrypted items to decrypt");
            callback.invoke(java.lang.Boolean.FALSE, null);
        }
    }
}
