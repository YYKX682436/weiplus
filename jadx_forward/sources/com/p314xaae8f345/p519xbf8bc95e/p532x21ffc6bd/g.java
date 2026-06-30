package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static java.lang.String f131078a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f131079b;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f131080c;

    static {
        try {
            java.io.InputStream resourceAsStream = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.g.class.getResourceAsStream("/com/qq/jce/wup/wup.properties");
            java.util.Properties properties = new java.util.Properties();
            properties.load(resourceAsStream);
            resourceAsStream.close();
            f131078a = properties.getProperty("client.info");
            f131079b = properties.getProperty("client.built");
            f131080c = properties.getProperty("client.number");
        } catch (java.lang.Throwable unused) {
        }
        if (f131078a == null) {
            f131078a = "Tencent Taf";
        }
        if (f131079b == null) {
            f131079b = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        if (f131080c == null) {
            f131080c = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
    }

    private static java.lang.String a() {
        return f131078a;
    }

    private static java.lang.String b() {
        return f131079b;
    }

    private static java.lang.String c() {
        return f131080c;
    }

    private static java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("Client version: " + f131078a + "\n");
        sb6.append("Client built:   " + f131079b + "\n");
        sb6.append("Client number:  " + f131080c + "\n");
        sb6.append("OS Name:        " + java.lang.System.getProperty("os.name") + "\n");
        sb6.append("OS Version:     " + java.lang.System.getProperty("os.version") + "\n");
        sb6.append("Architecture:   " + java.lang.System.getProperty("os.arch") + "\n");
        sb6.append("JVM Version:    " + java.lang.System.getProperty("java.runtime.version") + "\n");
        sb6.append("JVM Vendor:     " + java.lang.System.getProperty("java.vm.vendor") + "\n");
        return sb6.toString();
    }
}
