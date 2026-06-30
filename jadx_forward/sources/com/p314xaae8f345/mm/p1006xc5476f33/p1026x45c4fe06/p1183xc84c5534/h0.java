package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

@j95.b
/* loaded from: classes16.dex */
public final class h0 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e5 {
    public void Ai(java.lang.String userName, int i17, java.lang.String chatName, int i18, java.lang.String sessionId, long j17, java.lang.String currentAppId, java.lang.String currentPath, java.lang.String imageSrc, java.lang.String shareAppId, java.lang.String sharePath, java.lang.String imageKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatName, "chatName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentAppId, "currentAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentPath, "currentPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageSrc, "imageSrc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareAppId, "shareAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sharePath, "sharePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6326x30e97219 c6326x30e97219 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6326x30e97219();
        c6326x30e97219.f136831d = c6326x30e97219.b("Username", userName, true);
        c6326x30e97219.f136832e = 1;
        c6326x30e97219.f136833f = i17;
        c6326x30e97219.f136834g = c6326x30e97219.b("ChatName", Bi(chatName), true);
        c6326x30e97219.f136835h = i18;
        c6326x30e97219.f136836i = c6326x30e97219.b("SessionId", sessionId, true);
        c6326x30e97219.f136837j = j17;
        c6326x30e97219.f136838k = c6326x30e97219.b("CurrentAppId", currentAppId, true);
        c6326x30e97219.f136839l = c6326x30e97219.b("CurrentPath", currentPath, true);
        c6326x30e97219.f136840m = c6326x30e97219.b("ImageSrc", imageSrc, true);
        c6326x30e97219.f136841n = c6326x30e97219.b("ShareAppId", shareAppId, true);
        c6326x30e97219.f136842o = c6326x30e97219.b("SharePath", sharePath, true);
        c6326x30e97219.f136843p = c6326x30e97219.b("ImageKey", imageKey, true);
        c6326x30e97219.k();
    }

    public final java.lang.String Bi(java.lang.String str) {
        if (str.length() > 1024) {
            str = str.substring(0, 1024);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
        }
        if (!r26.n0.B(str, ",", false)) {
            return str;
        }
        java.lang.String b17 = fp.s0.b(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        return b17 == null ? "" : b17;
    }

    public void wi(java.lang.String userName, int i17, int i18, java.lang.String chatName, int i19, java.lang.String sessionId, long j17, int i27, java.lang.String launchAppId, java.lang.String launchPath, java.lang.String imageKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatName, "chatName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchAppId, "launchAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchPath, "launchPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6324xb7bf2c83 c6324xb7bf2c83 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6324xb7bf2c83();
        c6324xb7bf2c83.f136812d = c6324xb7bf2c83.b("UserName", userName, true);
        c6324xb7bf2c83.f136813e = new kk.v(i17).longValue();
        c6324xb7bf2c83.f136814f = i18;
        c6324xb7bf2c83.f136815g = c6324xb7bf2c83.b("ChatName", Bi(chatName), true);
        c6324xb7bf2c83.f136816h = i19;
        c6324xb7bf2c83.f136817i = c6324xb7bf2c83.b("SessionId", sessionId, true);
        c6324xb7bf2c83.f136818j = j17;
        c6324xb7bf2c83.f136819k = i27;
        c6324xb7bf2c83.f136823o = c6324xb7bf2c83.b("ImageKey", imageKey, true);
        c6324xb7bf2c83.f136821m = c6324xb7bf2c83.b("LaunchAppId", launchAppId, true);
        c6324xb7bf2c83.f136822n = c6324xb7bf2c83.b("LaunchPath", launchPath, true);
        c6324xb7bf2c83.k();
    }
}
