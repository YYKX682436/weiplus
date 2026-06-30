package fo1;

/* loaded from: classes5.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo1.q f346387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fo1.q qVar) {
        super(1);
        this.f346387d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        fo1.q qVar = this.f346387d;
        qVar.f346425e = it;
        qVar.f346424d.countDown();
        return jz5.f0.f384359a;
    }
}
