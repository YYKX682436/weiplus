package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class b3 {
    public b3(kotlin.jvm.internal.i iVar) {
    }

    public final jz5.l a(float f17, float f18) {
        com.tencent.mm.plugin.finder.convert.c3 c3Var;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479664c2);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479734dr);
        if (f17 <= 0.0f || f18 <= 0.0f) {
            com.tencent.mm.plugin.finder.convert.b3 b3Var = com.tencent.mm.plugin.finder.convert.c3.f103016g;
            return new jz5.l(valueOf2, valueOf);
        }
        float f19 = f17 / f18;
        com.tencent.mm.plugin.finder.convert.c3[] values = com.tencent.mm.plugin.finder.convert.c3.values();
        if (values.length == 0) {
            c3Var = null;
        } else {
            com.tencent.mm.plugin.finder.convert.c3 c3Var2 = values[0];
            int length = values.length - 1;
            if (length != 0) {
                float abs = java.lang.Math.abs(f19 - c3Var2.f103019d);
                kz5.x0 it = new e06.k(1, length).iterator();
                while (((e06.j) it).f246214f) {
                    com.tencent.mm.plugin.finder.convert.c3 c3Var3 = values[it.b()];
                    float abs2 = java.lang.Math.abs(f19 - c3Var3.f103019d);
                    if (java.lang.Float.compare(abs, abs2) > 0) {
                        c3Var2 = c3Var3;
                        abs = abs2;
                    }
                }
            }
            c3Var = c3Var2;
        }
        if (c3Var != null) {
            return new jz5.l(java.lang.Integer.valueOf(c3Var.f103020e), java.lang.Integer.valueOf(c3Var.f103021f));
        }
        com.tencent.mm.plugin.finder.convert.b3 b3Var2 = com.tencent.mm.plugin.finder.convert.c3.f103016g;
        return new jz5.l(valueOf2, valueOf);
    }
}
