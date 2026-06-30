package at0;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f95090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(at0.n nVar) {
        super(1);
        this.f95090d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (this.f95090d.f95134i) {
            int intValue = ((java.lang.Number) this.f95090d.f95135j.f384374d).intValue();
            int intValue2 = ((java.lang.Number) this.f95090d.f95135j.f384375e).intValue();
            int intValue3 = ((java.lang.Number) this.f95090d.f95135j.f384376f).intValue();
            ms0.c cVar = this.f95090d.f95146u;
            if (ts0.d.f503083a.a() && cVar != null && (cVar instanceof at0.p)) {
                at0.p pVar = (at0.p) cVar;
                android.graphics.Point point = new android.graphics.Point(pVar.f95156w, pVar.f95157x);
                intValue2 = point.x;
                intValue3 = point.y;
                intValue = 0;
            }
            ht0.b bVar = this.f95090d.f95128c;
            if (bVar != null) {
                bVar.l(intValue, intValue2, intValue3);
            }
            ht0.b bVar2 = this.f95090d.f95129d;
            if (bVar2 != null) {
                bVar2.l(intValue, intValue2, intValue3);
            }
            this.f95090d.f95134i = false;
        }
        ht0.b bVar3 = this.f95090d.f95128c;
        if (bVar3 != null) {
            bVar3.o();
        }
        ht0.b bVar4 = this.f95090d.f95129d;
        if (bVar4 != null) {
            bVar4.o();
        }
        this.f95090d.getClass();
        return jz5.f0.f384359a;
    }
}
