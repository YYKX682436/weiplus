package r15;

/* loaded from: classes12.dex */
public abstract class h {
    public static final r15.g a(java.lang.String originalContent, java.lang.CharSequence selectedContent, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalContent, "originalContent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedContent, "selectedContent");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(originalContent) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(selectedContent) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(originalContent, selectedContent)) {
            return null;
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^[\\r\\n]+|[\\r\\n]+$");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(selectedContent).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        int i19 = 0;
        if (replaceAll.length() == 0) {
            return null;
        }
        r15.g gVar = new r15.g();
        int[] array = replaceAll.codePoints().toArray();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(array);
        int e07 = kz5.z.e0(array);
        int K = kz5.z.K(array);
        char[] chars = java.lang.Character.toChars(K);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chars, "toChars(...)");
        gVar.q(new java.lang.String(chars));
        char[] chars2 = java.lang.Character.toChars(e07);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chars2, "toChars(...)");
        gVar.n(new java.lang.String(chars2));
        if (originalContent.length() > 0) {
            if (replaceAll.length() > 0) {
                int i27 = 0;
                int i28 = 0;
                while (i19 < i18) {
                    int codePointAt = originalContent.codePointAt(i19);
                    if (codePointAt == K) {
                        if (i19 < i17) {
                            i28++;
                        } else if (i19 == i17) {
                            gVar.r(i28);
                        }
                    }
                    if (codePointAt == e07) {
                        i27++;
                    }
                    i19 += java.lang.Character.charCount(codePointAt);
                }
                gVar.o(i27 - 1);
            }
        }
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        gVar.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(replaceAll.getBytes()));
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final r15.f b(java.lang.String r13, r15.g r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r15.h.b(java.lang.String, r15.g):r15.f");
    }
}
