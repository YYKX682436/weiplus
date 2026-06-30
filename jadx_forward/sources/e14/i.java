package e14;

/* loaded from: classes.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f327963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.Exception exc) {
        super(0);
        this.f327963d = exc;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Exception exc = this.f327963d;
        return "[error] " + exc.getMessage() + ", stack: " + jz5.a.b(exc);
    }
}
