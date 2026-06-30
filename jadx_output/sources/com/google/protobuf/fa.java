package com.google.protobuf;

/* loaded from: classes16.dex */
public class fa implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f45088d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.protobuf.t7 f45089e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.protobuf.z3 f45090f;

    public fa(java.lang.Object obj, com.google.protobuf.b4 b4Var) {
        if (obj instanceof com.google.protobuf.t7) {
            this.f45089e = (com.google.protobuf.t7) obj;
        } else {
            this.f45088d = obj;
        }
        this.f45090f = ((com.google.protobuf.b4) b4Var.n().n().get(0)).f44914m.f44859d;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.google.protobuf.fa faVar = (com.google.protobuf.fa) obj;
        if (h() == null || faVar.h() == null) {
            com.google.protobuf.ia.f45201a.info("Invalid key for map field.");
            return -1;
        }
        int ordinal = this.f45090f.ordinal();
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
        com.google.protobuf.t7 t7Var = this.f45089e;
        if (t7Var != null) {
            return t7Var.f45549d;
        }
        return null;
    }
}
