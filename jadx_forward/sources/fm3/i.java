package fm3;

/* loaded from: classes10.dex */
public final class i implements fm3.n {

    /* renamed from: a, reason: collision with root package name */
    public final fm3.d f345608a;

    public i(fm3.d videoInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoInfo, "videoInfo");
        this.f345608a = videoInfo;
    }

    @Override // fm3.n
    public void a(android.widget.ImageView thumbView, f60.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbView, "thumbView");
        e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
        fm3.d dVar = this.f345608a;
        ((o23.i) b1Var).wi(thumbView, 2, dVar.f345574e, dVar.a(), dVar.hashCode(), -1, aVar, 0L);
    }
}
