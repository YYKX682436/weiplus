package i06;

/* loaded from: classes16.dex */
public final class t2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.u2 f368285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(i06.u2 u2Var) {
        super(0);
        this.f368285d = u2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        e06.k kVar;
        i06.u2 u2Var = this.f368285d;
        o06.l1 h17 = u2Var.h();
        boolean z17 = h17 instanceof o06.r1;
        i06.k0 k0Var = u2Var.f368291d;
        if (z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i06.o4.g(k0Var.l()), h17) && k0Var.l().j() == o06.c.FAKE_OVERRIDE) {
            o06.m e17 = k0Var.l().e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(e17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            java.lang.Class k17 = i06.o4.k((o06.g) e17);
            if (k17 != null) {
                return k17;
            }
            throw new i06.a4("Cannot determine receiver Java type of inherited declaration: " + h17);
        }
        j06.k i17 = k0Var.i();
        boolean z18 = i17 instanceof j06.r0;
        int i18 = u2Var.f368292e;
        if (!z18) {
            if (!(i17 instanceof j06.q0)) {
                return (java.lang.reflect.Type) i17.a().get(i18);
            }
            java.lang.Class[] clsArr = (java.lang.Class[]) ((java.util.Collection) ((java.util.ArrayList) ((j06.q0) i17).f378614d).get(i18)).toArray(new java.lang.Class[0]);
            return i06.u2.f(u2Var, (java.lang.reflect.Type[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        }
        e06.k[] kVarArr = ((j06.r0) i17).f378620e;
        if (i18 >= 0 && i18 < kVarArr.length) {
            kVar = kVarArr[i18];
        } else {
            if (kVarArr.length == 0) {
                kVar = new e06.k(i18, i18);
            } else {
                int length = (i18 - kVarArr.length) + ((e06.k) kz5.z.f0(kVarArr)).f327743e + 1;
                kVar = new e06.k(length, length);
            }
        }
        java.lang.reflect.Type[] typeArr = (java.lang.reflect.Type[]) kz5.n0.C0(i17.a(), kVar).toArray(new java.lang.reflect.Type[0]);
        return i06.u2.f(u2Var, (java.lang.reflect.Type[]) java.util.Arrays.copyOf(typeArr, typeArr.length));
    }
}
