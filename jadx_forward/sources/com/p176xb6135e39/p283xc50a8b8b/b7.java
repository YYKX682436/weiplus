package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class b7 implements java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map.Entry f126459d;

    public b7(java.util.Map.Entry entry, com.p176xb6135e39.p283xc50a8b8b.a7 a7Var) {
        this.f126459d = entry;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f126459d.getKey();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        com.p176xb6135e39.p283xc50a8b8b.d7 d7Var = (com.p176xb6135e39.p283xc50a8b8b.d7) this.f126459d.getValue();
        if (d7Var == null) {
            return null;
        }
        return d7Var.a();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.o8)) {
            throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        com.p176xb6135e39.p283xc50a8b8b.d7 d7Var = (com.p176xb6135e39.p283xc50a8b8b.d7) this.f126459d.getValue();
        com.p176xb6135e39.p283xc50a8b8b.o8 o8Var = d7Var.f126594a;
        d7Var.getClass();
        d7Var.getClass();
        d7Var.f126594a = (com.p176xb6135e39.p283xc50a8b8b.o8) obj;
        return o8Var;
    }
}
