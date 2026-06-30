package te5;

/* loaded from: classes5.dex */
public final class t1 {
    public t1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.String str, java.lang.String tag, java.lang.String key, java.lang.String newValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newValue, "newValue");
        int L = str != null ? r26.n0.L(str, "<".concat(tag), 0, false, 6, null) : -1;
        if (L < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircoMsg.ServiceNotifyChattingUtils", "can not find the tag <%s>", tag);
            return null;
        }
        if (L > 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            str = str.substring(L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
        }
        try {
            return new te5.u1(str).a(key, newValue);
        } catch (java.lang.Exception e17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("change value fail, xml: ");
            sb6.append(str);
            sb6.append(", err: ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircoMsg.ServiceNotifyChattingUtils", sb6.toString());
            return null;
        }
    }
}
