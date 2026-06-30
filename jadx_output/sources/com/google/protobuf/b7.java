package com.google.protobuf;

/* loaded from: classes16.dex */
public class b7 implements java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map.Entry f44926d;

    public b7(java.util.Map.Entry entry, com.google.protobuf.a7 a7Var) {
        this.f44926d = entry;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f44926d.getKey();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        com.google.protobuf.d7 d7Var = (com.google.protobuf.d7) this.f44926d.getValue();
        if (d7Var == null) {
            return null;
        }
        return d7Var.a();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        if (!(obj instanceof com.google.protobuf.o8)) {
            throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        com.google.protobuf.d7 d7Var = (com.google.protobuf.d7) this.f44926d.getValue();
        com.google.protobuf.o8 o8Var = d7Var.f45061a;
        d7Var.getClass();
        d7Var.getClass();
        d7Var.f45061a = (com.google.protobuf.o8) obj;
        return o8Var;
    }
}
