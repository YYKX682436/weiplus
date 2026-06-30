package com.tencent.matrix.resource;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f52962a;

    public m(java.util.List nodes) {
        kotlin.jvm.internal.o.g(nodes, "nodes");
        this.f52962a = nodes;
    }

    public final ti.y0 a() {
        ti.a1 a1Var;
        java.util.List<com.tencent.matrix.resource.l> list = this.f52962a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.matrix.resource.l lVar : list) {
            java.lang.String str = lVar.f52960c;
            java.io.File file = com.tencent.matrix.resource.MemoryUtil.f52933a;
            ti.b1 b1Var = ti.b1.INSTANCE_FIELD;
            int i17 = lVar.f52961d;
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
            int i18 = lVar.f52959b;
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
            arrayList.add(new ti.c1(str, b1Var2, a1Var, lVar.f52958a, null, null, kz5.p0.f313996d));
        }
        return new ti.y0(arrayList);
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.tencent.matrix.resource.m) && kotlin.jvm.internal.o.b(this.f52962a, ((com.tencent.matrix.resource.m) obj).f52962a);
        }
        return true;
    }

    public int hashCode() {
        java.util.List list = this.f52962a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return "LeakChain(nodes=" + this.f52962a + ")";
    }
}
