package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f134495a;

    public m(java.util.List nodes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nodes, "nodes");
        this.f134495a = nodes;
    }

    public final ti.y0 a() {
        ti.a1 a1Var;
        java.util.List<com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.l> list = this.f134495a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.l lVar : list) {
            java.lang.String str = lVar.f134493c;
            java.io.File file = com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.f134466a;
            ti.b1 b1Var = ti.b1.INSTANCE_FIELD;
            int i17 = lVar.f134494d;
            if (i17 != 0) {
                if (i17 == 1) {
                    b1Var = ti.b1.STATIC_FIELD;
                } else if (i17 != 2) {
                    if (i17 != 3) {
                        throw new java.lang.IllegalArgumentException("Unsupported reference type " + i17);
                    }
                    b1Var = ti.b1.ARRAY_ENTRY;
                }
            }
            ti.b1 b1Var2 = b1Var;
            int i18 = lVar.f134492b;
            if (i18 == 1) {
                a1Var = ti.a1.CLASS;
            } else if (i18 == 2) {
                a1Var = ti.a1.ARRAY;
            } else {
                if (i18 != 3) {
                    throw new java.lang.IllegalArgumentException("Unsupported object type " + i18);
                }
                a1Var = ti.a1.OBJECT;
            }
            arrayList.add(new ti.c1(str, b1Var2, a1Var, lVar.f134491a, null, null, kz5.p0.f395529d));
        }
        return new ti.y0(arrayList);
    }

    /* renamed from: equals */
    public boolean m41239xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134495a, ((com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.m) obj).f134495a);
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m41240x8cdac1b() {
        java.util.List list = this.f134495a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m41241x9616526c() {
        return "LeakChain(nodes=" + this.f134495a + ")";
    }
}
