package wj;

/* loaded from: classes.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f528009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj.m f528010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.Set set, xj.m mVar) {
        super(0);
        this.f528009d = set;
        this.f528010e = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Iterator it = this.f528009d.iterator();
        while (it.hasNext()) {
            ((yz5.l) it.next()).mo146xb9724478(this.f528010e);
        }
        return jz5.f0.f384359a;
    }
}
