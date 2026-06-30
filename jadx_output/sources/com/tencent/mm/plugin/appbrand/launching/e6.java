package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class e6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.l6 f84594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f84595e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(com.tencent.mm.plugin.appbrand.launching.l6 l6Var, yz5.l lVar) {
        super(0);
        this.f84594d = l6Var;
        this.f84595e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.launching.j6.f84693b).entrySet()) {
            kotlin.jvm.internal.o.g(entry, "<this>");
            com.tencent.mm.plugin.appbrand.launching.q4 q4Var = (com.tencent.mm.plugin.appbrand.launching.q4) entry.getValue();
            com.tencent.mm.plugin.appbrand.launching.h4 h4Var = com.tencent.mm.plugin.appbrand.launching.q4.f85057t;
            q4Var.getClass();
            com.tencent.mm.plugin.appbrand.launching.l6 stat = this.f84594d;
            kotlin.jvm.internal.o.g(stat, "stat");
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = q4Var.f85069l;
            boolean z17 = false;
            if (!concurrentLinkedQueue.isEmpty()) {
                java.util.Iterator it = concurrentLinkedQueue.iterator();
                while (true) {
                    boolean z18 = true;
                    if (!it.hasNext()) {
                        z17 = true;
                        break;
                    }
                    com.tencent.mm.plugin.appbrand.launching.l6 l6Var = (com.tencent.mm.plugin.appbrand.launching.l6) it.next();
                    if (l6Var.f84753a != stat.f84753a) {
                        break;
                    }
                    java.lang.String str = stat.f84754b;
                    if (!(str == null || str.length() == 0) && !u46.l.c(l6Var.f84754b, str)) {
                        break;
                    }
                    java.lang.String str2 = stat.f84755c;
                    if (str2 != null && str2.length() != 0) {
                        z18 = false;
                    }
                    if (!z18 && !u46.l.c(l6Var.f84755c, str2)) {
                        break;
                    }
                }
            }
            if (z17) {
                this.f84595e.invoke(q4Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
