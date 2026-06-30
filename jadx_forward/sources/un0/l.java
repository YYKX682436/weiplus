package un0;

/* loaded from: classes5.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f510921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f510922e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.lang.Exception exc) {
        super(0);
        this.f510921d = f0Var;
        this.f510922e = exc;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return "crashCount=" + un0.s.f510952c + " autoRetry=" + this.f510921d.f391649d + ' ' + this.f510922e;
    }
}
