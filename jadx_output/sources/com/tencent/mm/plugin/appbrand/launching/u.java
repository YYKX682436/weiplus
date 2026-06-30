package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.u f85203a = new com.tencent.mm.plugin.appbrand.launching.u();

    /* renamed from: b, reason: collision with root package name */
    public static final ik1.j f85204b = new ik1.j();

    /* renamed from: c, reason: collision with root package name */
    public static final ik1.j f85205c = new ik1.j();

    public final com.tencent.mm.plugin.appbrand.launching.v a(int i17, java.lang.String instanceId, boolean z17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        ik1.j jVar = f85205c;
        ik1.j jVar2 = f85204b;
        if (z17) {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            com.tencent.mm.plugin.appbrand.launching.q qVar = new com.tencent.mm.plugin.appbrand.launching.q(i17, instanceId, h0Var);
            if (jVar2.d(qVar)) {
                java.lang.Object obj3 = h0Var.f310123d;
                kotlin.jvm.internal.o.d(obj3);
                return (com.tencent.mm.plugin.appbrand.launching.v) obj3;
            }
            if (jVar.d(qVar)) {
                java.lang.Object obj4 = h0Var.f310123d;
                kotlin.jvm.internal.o.d(obj4);
                return (com.tencent.mm.plugin.appbrand.launching.v) obj4;
            }
        } else {
            java.util.Iterator<E> it = jVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                com.tencent.mm.plugin.appbrand.launching.v vVar = (com.tencent.mm.plugin.appbrand.launching.v) obj;
                if (vVar.f85240d == i17 && kotlin.jvm.internal.o.b(vVar.f85237a, instanceId)) {
                    break;
                }
            }
            com.tencent.mm.plugin.appbrand.launching.v vVar2 = (com.tencent.mm.plugin.appbrand.launching.v) obj;
            if (vVar2 != null) {
                return vVar2;
            }
            java.util.Iterator<E> it6 = jVar.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                com.tencent.mm.plugin.appbrand.launching.v vVar3 = (com.tencent.mm.plugin.appbrand.launching.v) obj2;
                if (vVar3.f85240d == i17 && kotlin.jvm.internal.o.b(vVar3.f85237a, instanceId)) {
                    break;
                }
            }
            com.tencent.mm.plugin.appbrand.launching.v vVar4 = (com.tencent.mm.plugin.appbrand.launching.v) obj2;
            if (vVar4 != null) {
                return vVar4;
            }
        }
        return null;
    }
}
