package b16;

/* loaded from: classes16.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.r f17218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b16.r rVar) {
        super(0);
        this.f17218d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b16.r rVar = this.f17218d;
        java.util.List typeParameters = ((u06.x) rVar.f17232o).getTypeParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(typeParameters, 10));
        java.util.Iterator it = ((java.util.ArrayList) typeParameters).iterator();
        while (it.hasNext()) {
            e16.v vVar = (e16.v) it.next();
            o06.e2 a17 = rVar.f17234q.f650b.a(vVar);
            if (a17 == null) {
                throw new java.lang.AssertionError("Parameter " + vVar + " surely belongs to class " + rVar.f17232o + ", so it must be resolved");
            }
            arrayList.add(a17);
        }
        return arrayList;
    }
}
