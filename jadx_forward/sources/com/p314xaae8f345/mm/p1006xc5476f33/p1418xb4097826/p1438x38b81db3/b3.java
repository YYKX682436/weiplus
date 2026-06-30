package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class b3 {
    public b3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final jz5.l a(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c3 c3Var;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561197c2);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr);
        if (f17 <= 0.0f || f18 <= 0.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c3.f184549g;
            return new jz5.l(valueOf2, valueOf);
        }
        float f19 = f17 / f18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c3[] m55648xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c3.m55648xcee59d22();
        if (m55648xcee59d22.length == 0) {
            c3Var = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c3 c3Var2 = m55648xcee59d22[0];
            int length = m55648xcee59d22.length - 1;
            if (length != 0) {
                float abs = java.lang.Math.abs(f19 - c3Var2.f184552d);
                kz5.x0 it = new e06.k(1, length).iterator();
                while (((e06.j) it).f327747f) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c3 c3Var3 = m55648xcee59d22[it.b()];
                    float abs2 = java.lang.Math.abs(f19 - c3Var3.f184552d);
                    if (java.lang.Float.compare(abs, abs2) > 0) {
                        c3Var2 = c3Var3;
                        abs = abs2;
                    }
                }
            }
            c3Var = c3Var2;
        }
        if (c3Var != null) {
            return new jz5.l(java.lang.Integer.valueOf(c3Var.f184553e), java.lang.Integer.valueOf(c3Var.f184554f));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b3 b3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c3.f184549g;
        return new jz5.l(valueOf2, valueOf);
    }
}
