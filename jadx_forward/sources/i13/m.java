package i13;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i13.n f368829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i13.n nVar) {
        super(1);
        this.f368829d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        i13.p it = (i13.p) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        i13.n nVar = this.f368829d;
        nVar.f368832a.offer(it);
        nVar.f368833b.add(it.f368808d);
        return jz5.f0.f384359a;
    }
}
