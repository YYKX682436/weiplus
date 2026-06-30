package r1;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f450102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.l lVar) {
        super(1);
        this.f450102d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        m1.a e17 = (m1.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        if (e17 instanceof r1.d) {
            return (java.lang.Boolean) this.f450102d.mo146xb9724478(e17);
        }
        throw new java.lang.IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}
