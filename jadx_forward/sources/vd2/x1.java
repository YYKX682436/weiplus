package vd2;

/* loaded from: classes3.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.a2 f517529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(vd2.a2 a2Var) {
        super(0);
        this.f517529d = a2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        km2.n nVar;
        java.util.ArrayList arrayList;
        if (this.f517529d.f517176a == null || (nVar = dk2.ef.H) == null || (arrayList = nVar.f390686e) == null) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            km2.m mVar = ((km2.t) it.next()).f390755d;
            if (mVar != null) {
                arrayList2.add(mVar);
            }
        }
        return arrayList2;
    }
}
