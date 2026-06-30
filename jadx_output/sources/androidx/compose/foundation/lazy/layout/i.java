package androidx.compose.foundation.lazy.layout;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.k f10403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.j f10404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.compose.foundation.lazy.layout.k kVar, androidx.compose.foundation.lazy.layout.j jVar) {
        super(2);
        this.f10403d = kVar;
        this.f10404e = jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue;
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        androidx.compose.foundation.lazy.layout.k kVar = this.f10403d;
        androidx.compose.foundation.lazy.layout.l lVar = (androidx.compose.foundation.lazy.layout.l) kVar.f10411b.invoke();
        java.util.Map b17 = lVar.b();
        androidx.compose.foundation.lazy.layout.j jVar = this.f10404e;
        java.lang.Integer num = (java.lang.Integer) b17.get(jVar.f10405a);
        n0.v2 v2Var = jVar.f10407c;
        if (num != null) {
            ((n0.q4) v2Var).setValue(java.lang.Integer.valueOf(num.intValue()));
            intValue = num.intValue();
        } else {
            intValue = ((java.lang.Number) ((n0.q4) v2Var).getValue()).intValue();
        }
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(-715769699);
        int e17 = lVar.e();
        java.lang.Object obj3 = jVar.f10405a;
        if (intValue < e17) {
            java.lang.Object c17 = lVar.c(intValue);
            if (kotlin.jvm.internal.o.b(c17, obj3)) {
                ((w0.p) kVar.f10410a).a(c17, u0.j.b(oVar, -1238863364, true, new androidx.compose.foundation.lazy.layout.f(lVar, intValue)), oVar, 568);
            }
        }
        y0Var2.o(false);
        n0.d2.c(obj3, new androidx.compose.foundation.lazy.layout.h(jVar), oVar, 8);
        return jz5.f0.f302826a;
    }
}
