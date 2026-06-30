package cj;

/* loaded from: classes12.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj.r f123370d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(cj.r rVar) {
        super(0);
        this.f123370d = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.HandlerThread ht6 = (android.os.HandlerThread) ((jz5.n) this.f123370d.f123375e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ht6, "ht");
        return new android.os.Handler(ht6.getLooper());
    }
}
