package w40;

/* loaded from: classes10.dex */
public interface e extends i95.m {
    static /* synthetic */ void Df(w40.e eVar, android.content.Context context, qs2.e eVar2, android.content.Intent intent, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doPostAction");
        }
        if ((i17 & 4) != 0) {
            intent = null;
        }
        ((qs2.q) eVar).Ri(context, eVar2, intent);
    }

    static java.lang.String Qe(w40.e eVar, java.lang.String originFilePath, r45.c07 c07Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: genImageThumbFileTmp");
        }
        if ((i17 & 2) != 0) {
            c07Var = null;
        }
        qs2.q qVar = (qs2.q) eVar;
        qVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originFilePath, "originFilePath");
        qVar.m134976x2690a4ac();
        return mv2.q.f413151a.e(originFilePath, c07Var);
    }

    static /* synthetic */ boolean ef(w40.e eVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canShowSnsPostEntrance");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        return ((qs2.q) eVar).wi(z17);
    }

    static void eh(w40.e eVar, java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markStartLoading");
        }
        java.lang.String str3 = (i18 & 2) != 0 ? "" : str;
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        int i19 = (i18 & 8) != 0 ? -1 : i17;
        ((qs2.q) eVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a, moduleName, str3, str4, i19, 0L, 16, null);
    }

    static void fh(w40.e eVar, java.lang.String customKey, r45.rb4 rb4Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportPostTrace");
        }
        if ((i17 & 2) != 0) {
            rb4Var = null;
        }
        ((qs2.q) eVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customKey, "customKey");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.G(customKey, rb4Var);
    }

    static /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 kg(w40.e eVar, android.content.Context context, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPostBottomSheet");
        }
        if ((i18 & 2) != 0) {
            str = xy2.c.e(context);
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        return ((qs2.q) eVar).fj(context, str, i17);
    }

    static /* synthetic */ void s5(w40.e eVar, android.content.Context context, r45.q23 q23Var, long j17, int i17, android.content.Intent intent, org.json.JSONObject jSONObject, int i18, boolean z17, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clickPostSame");
        }
        ((qs2.q) eVar).Di(context, q23Var, j17, (i19 & 8) != 0 ? 20 : i17, (i19 & 16) != 0 ? null : intent, (i19 & 32) != 0 ? null : jSONObject, (i19 & 64) != 0 ? 0 : i18, (i19 & 128) != 0 ? true : z17);
    }
}
