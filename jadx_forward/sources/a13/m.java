package a13;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a13.t f82090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a13.t tVar) {
        super(1);
        this.f82090d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.l callback = (yz5.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f82090d.b(false, false, true, new a13.l(callback));
        return jz5.f0.f384359a;
    }
}
