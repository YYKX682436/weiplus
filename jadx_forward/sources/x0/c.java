package x0;

/* loaded from: classes14.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f532400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.l lVar) {
        super(1);
        this.f532400d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        x0.s invalid = (x0.s) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalid, "invalid");
        synchronized (x0.z.f532496b) {
            i17 = x0.z.f532498d;
            x0.z.f532498d = i17 + 1;
        }
        return new x0.j(i17, invalid, this.f532400d);
    }
}
