package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public class V8TracerAccessible {
    private static volatile com.eclipsesource.mmv8.IV8Tracer sTracer = com.eclipsesource.mmv8.IV8Tracer.DUMMY;

    public static void beginSection(java.lang.String str) {
        sTracer.beginSection("J2V8#" + str);
    }

    public static void endSection() {
        sTracer.endSection();
    }

    public static void setTracer(com.eclipsesource.mmv8.IV8Tracer iV8Tracer) {
        sTracer = iV8Tracer;
    }
}
