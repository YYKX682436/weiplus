package x0;

/* loaded from: classes8.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f532428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.util.Collection collection) {
        super(1);
        this.f532428d = collection;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.retainAll(this.f532428d));
    }
}
