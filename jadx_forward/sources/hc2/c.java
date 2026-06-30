package hc2;

/* loaded from: classes2.dex */
public abstract class c {
    public static final void a(java.lang.Exception exc, java.lang.String extraMsg) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exc, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraMsg, "extraMsg");
        boolean z18 = true;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        if (z18) {
            throw exc;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(extraMsg);
        sb6.append(' ');
        sb6.append(exc.getMessage());
        sb6.append(' ');
        java.lang.Throwable cause = exc.getCause();
        sb6.append(cause != null ? cause.getMessage() : null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderExt", sb6.toString(), new java.lang.Object[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderExt", exc, "", new java.lang.Object[0]);
    }
}
