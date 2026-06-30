package c61;

@j95.b
/* loaded from: classes10.dex */
public final class i8 extends i95.w implements vd2.i5 {
    public mn2.h3 Ai(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 mediaType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaType, "mediaType");
        return new mn2.q3(str, mediaType);
    }

    public void Bi(java.lang.String str, android.widget.ImageView imageView, mn2.f1 loaderType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loaderType, "loaderType");
        vd2.i5.Fb(this, str, imageView, str, null, 8, null);
    }

    public void Di(java.lang.String str, android.widget.ImageView imageView, java.lang.String str2, mn2.f1 loaderType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loaderType, "loaderType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderUtilService", "#loadImage url=" + str + " md5Source=" + str2);
        if ((str == null || str.length() == 0) || imageView == null) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.e().b(new mn2.k0(str, str2, "", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(loaderType)).c(imageView);
    }

    public void Ni(java.lang.String str, android.widget.ImageView imageView, mn2.f1 loaderType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loaderType, "loaderType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderUtilService", "#loadImage url=" + str);
        if (str == null || str.length() == 0) {
            return;
        }
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String j17 = hc2.l.j(str, "token");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(j17.getBytes()));
        mb4Var.set(0, str);
        mb4Var.set(1, str);
        java.lang.String k17 = hc2.l.k(j17);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        mn2.c1 c1Var = new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null);
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (imageView == null) {
            g1Var.e().b(c1Var, g1Var.h(loaderType)).a();
        } else {
            g1Var.e().b(c1Var, g1Var.h(loaderType)).c(imageView);
        }
    }

    public zy2.ic Ri(java.lang.String anchorFinderUsername, android.content.Context context, boolean z17, r45.qt2 contextObj, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorFinderUsername, "anchorFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        kk.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r;
        kk.l lVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r;
        ml2.q1 q1Var = ml2.q1.f409345e;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4(anchorFinderUsername, context, z17, contextObj, 101, false, false, lVar2, "temp_5", null, 512, null);
    }

    public java.lang.String Ui(int i17) {
        try {
            java.lang.String format = new java.text.DecimalFormat("0.##").format(i17 / 100.0d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            return format;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderUtilService", e17.getMessage());
            return "";
        }
    }

    public void wi(java.util.List noticeList, yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeList, "noticeList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderUtilService", "decryptExportNoticeIds: noticeList size=" + noticeList.size());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = noticeList.iterator();
        while (it.hasNext()) {
            r45.h32 h32Var = (r45.h32) it.next();
            java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(25);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                r45.ep1 ep1Var = new r45.ep1();
                ep1Var.set(0, 1);
                ep1Var.set(1, h32Var.m75945x2fec8307(25));
                linkedList.add(ep1Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderUtilService", "decryptExportNoticeIds: add encrypted item, export_notice_id=" + h32Var.m75945x2fec8307(25));
            }
        }
        if (!linkedList.isEmpty()) {
            new ke2.m(linkedList).l().K(new c61.f8(linkedList, callback, noticeList));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderUtilService", "decryptExportNoticeIds: no encrypted items to decrypt");
            callback.mo149xb9724478(java.lang.Boolean.FALSE, null);
        }
    }
}
