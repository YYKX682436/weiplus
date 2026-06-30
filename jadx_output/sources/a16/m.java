package a16;

/* loaded from: classes16.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a16.n f654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a16.n nVar) {
        super(1);
        this.f654d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e16.v typeParameter = (e16.v) obj;
        kotlin.jvm.internal.o.g(typeParameter, "typeParameter");
        a16.n nVar = this.f654d;
        java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) nVar.f658d).get(typeParameter);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        a16.l lVar = nVar.f655a;
        kotlin.jvm.internal.o.g(lVar, "<this>");
        a16.l lVar2 = new a16.l(lVar.f649a, nVar, lVar.f651c);
        o06.m mVar = nVar.f656b;
        return new b16.o1(a16.c.b(lVar2, mVar.getAnnotations()), typeParameter, nVar.f657c + intValue, mVar);
    }
}
