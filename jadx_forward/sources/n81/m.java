package n81;

/* loaded from: classes7.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f417158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.util.Set set) {
        super(1);
        this.f417158d = set;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n81.e it = (n81.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return java.lang.Boolean.valueOf(!this.f417158d.contains(it.f417147a));
    }
}
