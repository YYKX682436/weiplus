package at2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.i f13651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(at2.i iVar) {
        super(0);
        this.f13651d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        at2.c cVar = at2.c.f13641a;
        at2.d dVar = new at2.d();
        xp.a aVar = new xp.a();
        aVar.f455803a = 3;
        aVar.f455804b = 2;
        aVar.f455805c = 6500;
        aVar.f455806d = 12000;
        aVar.f455807e = 0;
        aVar.f455808f = ((ct2.d) this.f13651d.P0(ct2.d.class)).f222250q * 1000;
        aVar.f455809g = 3000;
        return new xs2.f0(cVar, dVar, aVar);
    }
}
