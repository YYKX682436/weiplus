package io.p3284xd2ae381c.p3319x36f002;

/* renamed from: io.flutter.util.TraceSection */
/* loaded from: classes13.dex */
public final class C28972x8eeb7200 implements java.lang.AutoCloseable {
    private C28972x8eeb7200(java.lang.String str) {
        m139419x59478a9(str);
    }

    /* renamed from: begin */
    public static void m139419x59478a9(java.lang.String str) {
        t4.a.f(m139421xa2d02660(str));
    }

    /* renamed from: beginAsyncSection */
    public static void m139420x2ed1a812(java.lang.String str, int i17) {
        t4.a.a(m139421xa2d02660(str), i17);
    }

    /* renamed from: cropSectionName */
    private static java.lang.String m139421xa2d02660(java.lang.String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void end() {
    }

    /* renamed from: endAsyncSection */
    public static void m139422xb3bdfd44(java.lang.String str, int i17) {
        t4.a.b(m139421xa2d02660(str), i17);
    }

    /* renamed from: scoped */
    public static io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90(java.lang.String str) {
        return new io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        end();
    }
}
