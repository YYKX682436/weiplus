package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class v {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.supervisor.v f52883f = new com.tencent.matrix.lifecycle.supervisor.v();

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f52878a = jz5.h.b(com.tencent.matrix.lifecycle.supervisor.s.f52871d);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f52879b = jz5.h.b(com.tencent.matrix.lifecycle.supervisor.t.f52873d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f52880c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f52881d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.supervisor.d f52882e = new com.tencent.matrix.lifecycle.supervisor.u();

    public static final java.lang.String a(com.tencent.matrix.lifecycle.supervisor.v vVar) {
        vVar.getClass();
        return (java.lang.String) ((jz5.n) f52878a).getValue();
    }

    public static final boolean b(com.tencent.matrix.lifecycle.supervisor.v vVar, java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        boolean booleanValue;
        vVar.getClass();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean z17 = false;
            while (it.hasNext()) {
                yz5.q qVar = (yz5.q) it.next();
                com.tencent.matrix.lifecycle.supervisor.d0 d0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
                java.lang.String b17 = d0Var.b();
                try {
                    booleanValue = ((java.lang.Boolean) qVar.invoke(str, str2, num)).booleanValue();
                    if (booleanValue) {
                        oj.j.b(d0Var.b(), qVar.getClass() + " try to rescue process", new java.lang.Object[0]);
                    }
                } catch (java.lang.Throwable th6) {
                    oj.j.d(b17, th6, "", new java.lang.Object[0]);
                }
                if (z17 || booleanValue) {
                    z17 = true;
                }
            }
            return z17;
        }
    }

    public final com.tencent.matrix.lifecycle.supervisor.p c() {
        return (com.tencent.matrix.lifecycle.supervisor.p) ((jz5.n) f52879b).getValue();
    }
}
