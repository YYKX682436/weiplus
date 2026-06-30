package im2;

/* loaded from: classes3.dex */
public final class t2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f374075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jz5.o f374076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374077c;

    public t2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var, jz5.o oVar, im2.z3 z3Var) {
        this.f374075a = c0Var;
        this.f374076b = oVar;
        this.f374077c = z3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.z
    public final void a(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        im2.z3 z3Var = this.f374077c;
        jz5.o oVar = this.f374076b;
        this.f374075a.d();
        if (z17) {
            try {
                java.util.List list = (java.util.List) oVar.f384374d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                int c07 = kz5.n0.c0(list, (java.lang.CharSequence) obj);
                java.lang.Object obj4 = ((java.util.ArrayList) oVar.f384375e).get(c07);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                int indexOf = ((java.util.List) obj4).indexOf((java.lang.CharSequence) obj2);
                int i17 = 0;
                for (int i18 = 0; i18 < c07; i18++) {
                    i17 += ((java.util.List) ((java.util.ArrayList) oVar.f384375e).get(i18)).size();
                }
                java.lang.Object obj5 = ((java.util.ArrayList) oVar.f384376f).get(i17 + indexOf);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj5, "get(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                int indexOf2 = ((java.util.List) obj5).indexOf((java.lang.CharSequence) obj3);
                im2.z3 z3Var2 = this.f374077c;
                if (z3Var2.C1 == null) {
                    im2.z3.t7(z3Var2, c07, indexOf, indexOf2, null, null, 24, null);
                    return;
                }
                this.f374077c.s7(c07, indexOf, indexOf2, this.f374076b, new java.util.Date(z3Var2.P6(r2.m75939xb282bd08(0) * 1000)));
                z3Var.f374185m2 = true;
                z3Var.R6();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(z3Var.f374168d, th6.getMessage());
            }
        }
    }
}
