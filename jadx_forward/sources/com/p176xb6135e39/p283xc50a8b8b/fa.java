package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class fa implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f126621d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.t7 f126622e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.z3 f126623f;

    public fa(java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.t7) {
            this.f126622e = (com.p176xb6135e39.p283xc50a8b8b.t7) obj;
        } else {
            this.f126621d = obj;
        }
        this.f126623f = ((com.p176xb6135e39.p283xc50a8b8b.b4) b4Var.n().n().get(0)).f126447m.f126392d;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p176xb6135e39.p283xc50a8b8b.fa faVar = (com.p176xb6135e39.p283xc50a8b8b.fa) obj;
        if (h() == null || faVar.h() == null) {
            com.p176xb6135e39.p283xc50a8b8b.ia.f126734a.info("Invalid key for map field.");
            return -1;
        }
        int ordinal = this.f126623f.ordinal();
        if (ordinal == 0) {
            return java.lang.Integer.compare(((java.lang.Integer) h()).intValue(), ((java.lang.Integer) faVar.h()).intValue());
        }
        if (ordinal == 1) {
            return java.lang.Long.compare(((java.lang.Long) h()).longValue(), ((java.lang.Long) faVar.h()).longValue());
        }
        if (ordinal == 4) {
            return java.lang.Boolean.compare(((java.lang.Boolean) h()).booleanValue(), ((java.lang.Boolean) faVar.h()).booleanValue());
        }
        if (ordinal == 5) {
            java.lang.String str = (java.lang.String) h();
            java.lang.String str2 = (java.lang.String) faVar.h();
            if (str != null || str2 != null) {
                if (str == null && str2 != null) {
                    return -1;
                }
                if (str == null || str2 != null) {
                    return str.compareTo(str2);
                }
                return 1;
            }
        }
        return 0;
    }

    public java.lang.Object h() {
        com.p176xb6135e39.p283xc50a8b8b.t7 t7Var = this.f126622e;
        if (t7Var != null) {
            return t7Var.f127082d;
        }
        return null;
    }
}
