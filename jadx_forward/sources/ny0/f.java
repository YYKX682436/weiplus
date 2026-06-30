package ny0;

/* loaded from: classes5.dex */
public final class f extends ly0.v {

    /* renamed from: c, reason: collision with root package name */
    public final ly0.p f422927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List paths) {
        super(paths);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paths, "paths");
        this.f422927c = ly0.p.f403762e;
    }

    @Override // ly0.v
    public ly0.n a(java.util.List imageUrls, yz5.l rawCompletionCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageUrls, "imageUrls");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawCompletionCallback, "rawCompletionCallback");
        return new ny0.d(imageUrls, null, rawCompletionCallback, null);
    }

    @Override // ly0.v
    public ly0.p d() {
        return this.f422927c;
    }

    @Override // ly0.v
    public java.lang.Object e(java.lang.String taskId, java.util.List generatedImagePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(generatedImagePath, "generatedImagePath");
        return new ny0.e(taskId, generatedImagePath);
    }
}
