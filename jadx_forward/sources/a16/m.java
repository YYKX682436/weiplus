package a16;

/* loaded from: classes16.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a16.n f82187d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a16.n nVar) {
        super(1);
        this.f82187d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e16.v typeParameter = (e16.v) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParameter, "typeParameter");
        a16.n nVar = this.f82187d;
        java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) nVar.f82191d).get(typeParameter);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        a16.l lVar = nVar.f82188a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<this>");
        a16.l lVar2 = new a16.l(lVar.f82182a, nVar, lVar.f82184c);
        o06.m mVar = nVar.f82189b;
        return new b16.o1(a16.c.b(lVar2, mVar.mo9601xa083c1ee()), typeParameter, nVar.f82190c + intValue, mVar);
    }
}
