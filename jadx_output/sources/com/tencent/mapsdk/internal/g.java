package com.tencent.mapsdk.internal;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static java.lang.String f49545a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f49546b;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f49547c;

    static {
        try {
            java.io.InputStream resourceAsStream = com.tencent.mapsdk.internal.g.class.getResourceAsStream("/com/qq/jce/wup/wup.properties");
            java.util.Properties properties = new java.util.Properties();
            properties.load(resourceAsStream);
            resourceAsStream.close();
            f49545a = properties.getProperty("client.info");
            f49546b = properties.getProperty("client.built");
            f49547c = properties.getProperty("client.number");
        } catch (java.lang.Throwable unused) {
        }
        if (f49545a == null) {
            f49545a = "Tencent Taf";
        }
        if (f49546b == null) {
            f49546b = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        if (f49547c == null) {
            f49547c = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
    }

    private static java.lang.String a() {
        return f49545a;
    }

    private static java.lang.String b() {
        return f49546b;
    }

    private static java.lang.String c() {
        return f49547c;
    }

    private static java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("Client version: " + f49545a + "\n");
        sb6.append("Client built:   " + f49546b + "\n");
        sb6.append("Client number:  " + f49547c + "\n");
        sb6.append("OS Name:        " + java.lang.System.getProperty("os.name") + "\n");
        sb6.append("OS Version:     " + java.lang.System.getProperty("os.version") + "\n");
        sb6.append("Architecture:   " + java.lang.System.getProperty("os.arch") + "\n");
        sb6.append("JVM Version:    " + java.lang.System.getProperty("java.runtime.version") + "\n");
        sb6.append("JVM Vendor:     " + java.lang.System.getProperty("java.vm.vendor") + "\n");
        return sb6.toString();
    }
}
