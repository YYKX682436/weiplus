package gh;

/* loaded from: classes7.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gh.g f353350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gh.g gVar) {
        super(0);
        this.f353350d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gh.g gVar = this.f353350d;
        synchronized (gVar.f353336f) {
            gVar.f353354n = android.view.Choreographer.getInstance();
            if (gVar.f353337g) {
                android.view.Choreographer choreographer = gVar.f353354n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(choreographer);
                choreographer.postFrameCallback(gVar.f353355o);
            }
        }
        return jz5.f0.f384359a;
    }
}
