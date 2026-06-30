package cj;

/* loaded from: classes12.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj.x f123377d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(cj.x xVar) {
        super(0);
        this.f123377d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.HandlerThread ht6 = (android.os.HandlerThread) ((jz5.n) this.f123377d.f123382e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ht6, "ht");
        return new android.os.Handler(ht6.getLooper());
    }
}
