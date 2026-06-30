package i06;

/* loaded from: classes15.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f368339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(i06.f1 f1Var) {
        super(0);
        this.f368339d = f1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Collection<o06.g> T = this.f368339d.a().T();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T, "getSealedSubclasses(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (o06.g gVar : T) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            java.lang.Class k17 = i06.o4.k(gVar);
            i06.k1 k1Var = k17 != null ? new i06.k1(k17) : null;
            if (k1Var != null) {
                arrayList.add(k1Var);
            }
        }
        return arrayList;
    }
}
