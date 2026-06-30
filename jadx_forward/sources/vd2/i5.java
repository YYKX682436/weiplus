package vd2;

/* loaded from: classes10.dex */
public interface i5 extends i95.m {
    static /* synthetic */ void Ac(vd2.i5 i5Var, java.lang.String str, android.widget.ImageView imageView, java.lang.String str2, mn2.f1 f1Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImage");
        }
        if ((i17 & 8) != 0) {
            f1Var = mn2.f1.B;
        }
        ((c61.i8) i5Var).Di(str, imageView, str2, f1Var);
    }

    static void Fb(vd2.i5 i5Var, java.lang.String str, android.widget.ImageView imageView, java.lang.String str2, mn2.f1 loaderType, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadBgBlurImageRadius100");
        }
        if ((i17 & 8) != 0) {
            loaderType = mn2.f1.E;
        }
        ((c61.i8) i5Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loaderType, "loaderType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderUtilService", "#loadBgBlurImageRadius100 url=" + str + " md5Source=" + str2);
        if ((str == null || str.length() == 0) || imageView == null) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c b17 = g1Var.b().b(new mn2.k0(str, str2, "blur_100", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(loaderType));
        c61.g8 g8Var = c61.g8.f120535a;
        b17.getClass();
        b17.f529406d = g8Var;
        b17.c(imageView);
    }

    static /* synthetic */ zy2.ic T6(vd2.i5 i5Var, java.lang.String str, android.content.Context context, boolean z17, r45.qt2 qt2Var, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newMoreLiveListWidget");
        }
        if ((i18 & 16) != 0) {
            i17 = 101;
        }
        return ((c61.i8) i5Var).Ri(str, context, z17, qt2Var, i17);
    }

    static /* synthetic */ void l7(vd2.i5 i5Var, java.lang.String str, android.widget.ImageView imageView, mn2.f1 f1Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadBgBlurImageRadius100");
        }
        if ((i17 & 4) != 0) {
            f1Var = mn2.f1.E;
        }
        ((c61.i8) i5Var).Bi(str, imageView, f1Var);
    }

    static /* synthetic */ void l8(vd2.i5 i5Var, java.lang.String str, android.widget.ImageView imageView, mn2.f1 f1Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImage");
        }
        if ((i17 & 4) != 0) {
            f1Var = mn2.f1.B;
        }
        ((c61.i8) i5Var).Ni(str, imageView, f1Var);
    }
}
