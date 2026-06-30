package org.p3343x72743996.net;

/* renamed from: org.chromium.net.ChromiumNetworkAdapter */
/* loaded from: classes13.dex */
public final class C29495xe21ce497 {
    private C29495xe21ce497() {
    }

    /* renamed from: openConnection */
    public static java.net.URLConnection m153120x946eacc8(java.net.URL url, org.p3343x72743996.net.C29539xddb55e1c c29539xddb55e1c) {
        return url.openConnection();
    }

    /* renamed from: openStream */
    public static java.io.InputStream m153121x14c7026a(java.net.URL url, org.p3343x72743996.net.C29539xddb55e1c c29539xddb55e1c) {
        return url.openStream();
    }

    /* renamed from: openConnection */
    public static java.net.URLConnection m153119x946eacc8(java.net.URL url, java.net.Proxy proxy, org.p3343x72743996.net.C29539xddb55e1c c29539xddb55e1c) {
        return url.openConnection(proxy);
    }
}
