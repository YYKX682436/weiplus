package pk1;

/* loaded from: classes15.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk1.q f437015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(pk1.q qVar) {
        super(1);
        this.f437015d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        pk1.q qVar = this.f437015d;
        pk1.q.X(qVar, longValue);
        pk1.q.Y(qVar, longValue);
        return jz5.f0.f384359a;
    }
}
