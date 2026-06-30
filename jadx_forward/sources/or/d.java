package or;

/* loaded from: classes10.dex */
public abstract class d {
    public static final void a(java.lang.String str, int i17, int i18, java.lang.Integer num, int i19, java.lang.String extraInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        if (str == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6410x1a153385 c6410x1a153385 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6410x1a153385();
        c6410x1a153385.f137552d = c6410x1a153385.b("EditStickerSessionID", str, true);
        c6410x1a153385.f137553e = i17;
        c6410x1a153385.f137554f = i18;
        if (num != null) {
            c6410x1a153385.f137555g = num.intValue();
        }
        c6410x1a153385.f137556h = i19;
        c6410x1a153385.f137557i = c6410x1a153385.b("ExtraInfo", extraInfo, true);
        c6410x1a153385.k();
    }

    public static final void b(java.lang.String str, int i17, int i18, java.lang.Integer num, java.lang.String extraInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        c(str, i17, i18, num, 0, extraInfo, 16, null);
    }

    public static /* synthetic */ void c(java.lang.String str, int i17, int i18, java.lang.Integer num, int i19, java.lang.String str2, int i27, java.lang.Object obj) {
        if ((i27 & 8) != 0) {
            num = null;
        }
        java.lang.Integer num2 = num;
        if ((i27 & 16) != 0) {
            i19 = 20;
        }
        a(str, i17, i18, num2, i19, str2);
    }
}
