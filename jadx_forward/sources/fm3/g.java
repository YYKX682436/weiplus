package fm3;

/* loaded from: classes10.dex */
public final class g implements fm3.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f345601a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f345602b;

    public g(java.lang.String thumbPath, java.lang.String videoPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        this.f345601a = thumbPath;
        this.f345602b = videoPath;
    }

    @Override // fm3.n
    public void a(android.widget.ImageView thumbView, f60.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbView, "thumbView");
        e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
        ((o23.i) b1Var).wi(thumbView, 2, this.f345601a, this.f345602b, r5.hashCode(), -1, aVar, 0L);
    }
}
