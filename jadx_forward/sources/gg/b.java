package gg;

/* loaded from: classes7.dex */
public class b implements gg.d {

    /* renamed from: sInstance */
    private static gg.b f69817xbfaed628;

    private b() {
    }

    /* renamed from: getInstance */
    public static gg.b m131511x9cf0d20b() {
        if (f69817xbfaed628 == null) {
            f69817xbfaed628 = new gg.b();
        }
        return f69817xbfaed628;
    }

    @Override // gg.d
    /* renamed from: createClientProxy */
    public gg.c mo131512x21f05ec7() {
        return new gg.a();
    }
}
