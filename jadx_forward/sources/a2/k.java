package a2;

/* loaded from: classes14.dex */
public abstract class k {
    public static final int a(java.util.List paragraphInfoList, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i18 = 0;
        while (i18 <= size) {
            int i19 = (i18 + size) >>> 1;
            a2.m mVar = (a2.m) paragraphInfoList.get(i19);
            char c17 = mVar.f82307b > i17 ? (char) 1 : mVar.f82308c <= i17 ? (char) 65535 : (char) 0;
            if (c17 < 0) {
                i18 = i19 + 1;
            } else {
                if (c17 <= 0) {
                    return i19;
                }
                size = i19 - 1;
            }
        }
        return -(i18 + 1);
    }

    public static final int b(java.util.List paragraphInfoList, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i18 = 0;
        while (i18 <= size) {
            int i19 = (i18 + size) >>> 1;
            a2.m mVar = (a2.m) paragraphInfoList.get(i19);
            char c17 = mVar.f82309d > i17 ? (char) 1 : mVar.f82310e <= i17 ? (char) 65535 : (char) 0;
            if (c17 < 0) {
                i18 = i19 + 1;
            } else {
                if (c17 <= 0) {
                    return i19;
                }
                size = i19 - 1;
            }
        }
        return -(i18 + 1);
    }

    public static final int c(java.util.List paragraphInfoList, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i17 = 0;
        while (i17 <= size) {
            int i18 = (i17 + size) >>> 1;
            a2.m mVar = (a2.m) paragraphInfoList.get(i18);
            char c17 = mVar.f82311f > f17 ? (char) 1 : mVar.f82312g <= f17 ? (char) 65535 : (char) 0;
            if (c17 < 0) {
                i17 = i18 + 1;
            } else {
                if (c17 <= 0) {
                    return i18;
                }
                size = i18 - 1;
            }
        }
        return -(i17 + 1);
    }
}
