package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class ac {
    public static java.lang.Object a(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.ub ubVar, com.p176xb6135e39.p283xc50a8b8b.zb zbVar) {
        switch (ubVar.ordinal()) {
            case 0:
                return java.lang.Double.valueOf(d0Var.n());
            case 1:
                return java.lang.Float.valueOf(d0Var.r());
            case 2:
                return java.lang.Long.valueOf(d0Var.u());
            case 3:
                return java.lang.Long.valueOf(d0Var.H());
            case 4:
                return java.lang.Integer.valueOf(d0Var.t());
            case 5:
                return java.lang.Long.valueOf(d0Var.q());
            case 6:
                return java.lang.Integer.valueOf(d0Var.p());
            case 7:
                return java.lang.Boolean.valueOf(d0Var.l());
            case 8:
                return zbVar.a(d0Var);
            case 9:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return d0Var.m();
            case 12:
                return java.lang.Integer.valueOf(d0Var.G());
            case 13:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return java.lang.Integer.valueOf(d0Var.z());
            case 15:
                return java.lang.Long.valueOf(d0Var.A());
            case 16:
                return java.lang.Integer.valueOf(d0Var.B());
            case 17:
                return java.lang.Long.valueOf(d0Var.C());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
