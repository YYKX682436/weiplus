package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a1 f270333a = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a1();

    public static final java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        z05.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        l15.c cVar2 = new l15.c();
        java.lang.String U1 = msg.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar2.m126728xdc93280d(U1);
        v05.b k17 = cVar2.k();
        if (k17 == null || (cVar = (z05.c) k17.m75936x14adae67(k17.f513848e + 64)) == null) {
            return null;
        }
        return cVar.l();
    }

    public static final int[] b(java.lang.String imageConf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageConf, "imageConf");
        try {
            return f270333a.c(new cl0.g(imageConf).mo15082x48bce8a4("ratioType"));
        } catch (cl0.f e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppMsgUtilForW1w", e17.getMessage());
            return new int[]{480, 480};
        }
    }

    public final int[] c(java.lang.String ratioType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ratioType, "ratioType");
        int hashCode = ratioType.hashCode();
        if (hashCode != 48936) {
            if (hashCode != 50861) {
                if (hashCode == 51821 && ratioType.equals("4:3")) {
                    return new int[]{640, 480};
                }
            } else if (ratioType.equals("3:4")) {
                return new int[]{480, 640};
            }
        } else if (ratioType.equals("1:1")) {
            return new int[]{480, 480};
        }
        return new int[]{480, 480};
    }
}
