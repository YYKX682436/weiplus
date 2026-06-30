package zy;

/* loaded from: classes10.dex */
public interface w extends i95.m {
    static /* synthetic */ boolean Ie(zy.w wVar, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isExist");
        }
        if ((i17 & 2) != 0) {
            str2 = "";
        }
        return ((bz.a) wVar).f(str, str2);
    }

    static java.lang.Object Lc(zy.w wVar, java.lang.String str, boolean z17, java.lang.String str2, int i17, int i18, java.lang.String str3, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromUrl");
        }
        boolean z18 = (i19 & 2) != 0 ? false : z17;
        java.lang.String str4 = (i19 & 4) != 0 ? "" : str2;
        int i27 = (i19 & 8) != 0 ? 0 : i17;
        int i28 = (i19 & 16) != 0 ? 0 : i18;
        java.lang.String str5 = (i19 & 32) != 0 ? "" : str3;
        yz5.p pVar2 = (i19 & 64) != 0 ? zy.v.f558835d : pVar;
        bz.w b17 = ((bz.a) wVar).b();
        int random = (int) (java.lang.Math.random() * 10000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Download.SuperDownloaderWrapCore", "#getResourceFromUrl " + random + " isNeedUnzip=" + z18 + " url=" + str + " md5=" + str4 + " appType=" + i27 + " fileType=" + i28 + " nameAppendix=" + str5);
        return str == null || str.length() == 0 ? new jz5.o(java.lang.Boolean.FALSE, "", "") : p3325xe03a0797.p3326xc267989b.l.g(lu5.a.f402990f, new bz.n(b17, str, random, str4, i27, i28, str5, pVar2, z18, null), interfaceC29045xdcb5ca57);
    }

    static /* synthetic */ java.lang.String h9(zy.w wVar, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUrlPath");
        }
        if ((i17 & 2) != 0) {
            str2 = "";
        }
        return ((bz.a) wVar).c(str, str2);
    }
}
