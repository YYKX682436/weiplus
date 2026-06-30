package at0;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f13557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(at0.n nVar) {
        super(1);
        this.f13557d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (this.f13557d.f13601i) {
            int intValue = ((java.lang.Number) this.f13557d.f13602j.f302841d).intValue();
            int intValue2 = ((java.lang.Number) this.f13557d.f13602j.f302842e).intValue();
            int intValue3 = ((java.lang.Number) this.f13557d.f13602j.f302843f).intValue();
            ms0.c cVar = this.f13557d.f13613u;
            if (ts0.d.f421550a.a() && cVar != null && (cVar instanceof at0.p)) {
                at0.p pVar = (at0.p) cVar;
                android.graphics.Point point = new android.graphics.Point(pVar.f13623w, pVar.f13624x);
                intValue2 = point.x;
                intValue3 = point.y;
                intValue = 0;
            }
            ht0.b bVar = this.f13557d.f13595c;
            if (bVar != null) {
                bVar.l(intValue, intValue2, intValue3);
            }
            ht0.b bVar2 = this.f13557d.f13596d;
            if (bVar2 != null) {
                bVar2.l(intValue, intValue2, intValue3);
            }
            this.f13557d.f13601i = false;
        }
        ht0.b bVar3 = this.f13557d.f13595c;
        if (bVar3 != null) {
            bVar3.o();
        }
        ht0.b bVar4 = this.f13557d.f13596d;
        if (bVar4 != null) {
            bVar4.o();
        }
        this.f13557d.getClass();
        return jz5.f0.f302826a;
    }
}
