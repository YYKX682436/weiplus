package jk4;

/* loaded from: classes10.dex */
public final class f extends dk4.a {
    public final java.util.ArrayList A;
    public int B;

    /* renamed from: y, reason: collision with root package name */
    public float f381688y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f381689z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String mediaId, java.lang.String path, java.lang.String url, int i17, int i18) {
        super(mediaId, path, url, i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f381688y = 1.0f;
        this.A = new java.util.ArrayList();
    }

    public final boolean a() {
        return this.A.contains(1);
    }
}
