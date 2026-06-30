package c61;

/* loaded from: classes2.dex */
public interface zb extends i95.m {
    static /* synthetic */ int N8(c61.zb zbVar, android.content.Context context, dk2.x4 x4Var, java.lang.String str, java.lang.String str2, android.content.Intent intent, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj == null) {
            return ((b92.d1) zbVar).fj(context, x4Var, (i17 & 4) != 0 ? "" : str, str2, (i17 & 16) != 0 ? null : intent, (i17 & 32) != 0 ? false : z17, (i17 & 64) != 0 ? null : aVar);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goVisitorUIWithCheck");
    }

    static /* synthetic */ void U7(c61.zb zbVar, android.content.Context context, android.content.Intent intent, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoReplayUI");
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        ((b92.d1) zbVar).hj(context, intent, z17);
    }

    static az2.j Xh(c61.zb zbVar, java.util.List units, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.util.List list, r45.vg0 vg0Var, int i27, java.lang.String str3, r45.fr0 fr0Var, java.lang.Integer num, java.lang.String str4, r45.qt2 qt2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.pl2 pl2Var, r45.tj2 tj2Var, int i28, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doCgiFinderBatchGetObjectAsyncLoadInfo");
        }
        int i29 = (i28 & 2) != 0 ? 0 : i17;
        int i37 = (i28 & 4) != 0 ? 0 : i18;
        int i38 = (i28 & 8) != 0 ? 0 : i19;
        java.lang.String finderUserName = (i28 & 16) != 0 ? "" : str;
        java.lang.String uxInfo = (i28 & 32) != 0 ? "" : str2;
        java.util.List list2 = (i28 & 64) != 0 ? null : list;
        r45.vg0 vg0Var2 = (i28 & 128) != 0 ? null : vg0Var;
        int i39 = (i28 & 256) != 0 ? 0 : i27;
        java.lang.String str5 = (i28 & 512) != 0 ? null : str3;
        r45.fr0 fr0Var2 = (i28 & 1024) != 0 ? null : fr0Var;
        java.lang.Integer num2 = (i28 & 2048) != 0 ? null : num;
        java.lang.String source = (i28 & 4096) != 0 ? "" : str4;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i28 & 16384) != 0 ? null : gVar;
        r45.pl2 pl2Var2 = (32768 & i28) != 0 ? null : pl2Var;
        r45.tj2 tj2Var2 = (i28 & 65536) != 0 ? null : tj2Var;
        ((b92.d1) zbVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(units, "units");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uxInfo, "uxInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        return new db2.u(units, i29, i37, i38, finderUserName, uxInfo, list2, vg0Var2, i39, str5, fr0Var2, num2, source, qt2Var, gVar2, pl2Var2, tj2Var2);
    }

    static /* synthetic */ void g7(c61.zb zbVar, android.widget.ImageView imageView, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBlurBitmap");
        }
        if ((i18 & 4) != 0) {
            i17 = 25;
        }
        ((b92.d1) zbVar).tj(imageView, str, i17);
    }

    static com.p314xaae8f345.mm.p944x882e457a.m1 x3(c61.zb zbVar, java.lang.String userName, java.lang.String noticeId, int i17, r45.qt2 qt2Var, java.lang.String str, java.lang.Integer num, java.lang.Long l17, java.lang.Integer num2, java.lang.String str2, java.lang.String str3, java.util.LinkedList linkedList, java.lang.String str4, java.lang.String str5, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createNetSceneAudienceReserveLive");
        }
        java.lang.String str6 = (i18 & 16) != 0 ? "" : str;
        java.lang.Integer num3 = (i18 & 32) != 0 ? -1 : num;
        java.lang.Long l18 = (i18 & 64) != 0 ? -1L : l17;
        java.lang.Integer num4 = (i18 & 128) != 0 ? 0 : num2;
        java.lang.String str7 = (i18 & 256) != 0 ? "" : str2;
        java.lang.String fromQrcode = (i18 & 512) != 0 ? "" : str3;
        java.util.LinkedList noticeTypeList = (i18 & 1024) != 0 ? new java.util.LinkedList() : linkedList;
        java.lang.String gmsgId = (i18 & 2048) == 0 ? str4 : "";
        java.lang.String str8 = (i18 & 4096) != 0 ? null : str5;
        ((b92.d1) zbVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromQrcode, "fromQrcode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeTypeList, "noticeTypeList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gmsgId, "gmsgId");
        return new db2.e5(userName, noticeId, i17, qt2Var, str6, num3, l18, num4, str7, fromQrcode, null, noticeTypeList, gmsgId, str8, 1024, null);
    }
}
