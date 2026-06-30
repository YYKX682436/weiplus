package c32;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.fontdecode.PathExtractor f38172a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f38173b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f38174c;

    public c(java.lang.String fontPath, int i17) {
        kotlin.jvm.internal.o.g(fontPath, "fontPath");
        com.tencent.mm.fontdecode.PathExtractor pathExtractor = new com.tencent.mm.fontdecode.PathExtractor(fontPath);
        this.f38172a = pathExtractor;
        com.tencent.mm.fontdecode.PathExtractor.Metrics metrics = new com.tencent.mm.fontdecode.PathExtractor.Metrics();
        pathExtractor.c(i17);
        this.f38173b = new java.util.ArrayList();
        this.f38174c = new java.util.ArrayList();
        pathExtractor.b(metrics);
    }
}
