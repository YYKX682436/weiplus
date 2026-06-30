package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public abstract class hb {
    public static final java.lang.String a(java.lang.String content, java.lang.String encryptUsername, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptUsername, "encryptUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        java.lang.String str = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(content).f275392a;
        boolean z17 = false;
        if (!(str == null || str.length() == 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, encryptUsername)) {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(tag, "parseAndValidateTalker: invalid fromUsername, will not save talker. fromUsername=" + str + ", encryptUsername=" + encryptUsername);
        }
        return (!z17 || str == null) ? "" : str;
    }
}
