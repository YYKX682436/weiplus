package an2;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ an2.i f8854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(an2.i iVar) {
        super(1);
        this.f8854d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        an2.b item = (an2.b) obj;
        kotlin.jvm.internal.o.g(item, "item");
        an2.i iVar = this.f8854d;
        iVar.a(item);
        yz5.l lVar = iVar.f8857c;
        if (lVar != null) {
            lVar.invoke(item);
        }
        return jz5.f0.f302826a;
    }
}
