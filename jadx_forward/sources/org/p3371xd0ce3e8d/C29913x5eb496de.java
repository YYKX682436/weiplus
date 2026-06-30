package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.WebRtcClassLoader */
/* loaded from: classes4.dex */
class C29913x5eb496de {
    /* renamed from: getClassLoader */
    public static java.lang.Object m156592xa0bf1275() {
        java.lang.ClassLoader classLoader = org.p3371xd0ce3e8d.C29913x5eb496de.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw new java.lang.RuntimeException("Failed to get WebRTC class loader.");
    }
}
