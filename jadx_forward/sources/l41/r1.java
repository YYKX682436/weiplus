package l41;

/* loaded from: classes4.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l41.r1 f397446a = new l41.r1();

    /* renamed from: b, reason: collision with root package name */
    public static i11.c f397447b;

    public static /* synthetic */ void b(l41.r1 r1Var, java.lang.String str, java.lang.String str2, int i17, yz5.l lVar, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str2 = "wgs84";
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            lVar = l41.o1.f397421d;
        }
        r1Var.a(str, str2, i17, lVar);
    }

    public final void a(java.lang.String talkUsername, java.lang.String locationType, int i17, yz5.l successCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkUsername, "talkUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(locationType, "locationType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(successCallback, "successCallback");
        java.lang.String lowerCase = locationType.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, "wgs84");
        if (f397447b == null) {
            f397447b = new l41.q1(talkUsername, b17, i17, successCallback);
        }
        if (b17) {
            i11.h.e().k(f397447b, false);
        } else {
            i11.h.e().j(f397447b, false);
        }
    }
}
