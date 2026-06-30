package com.google.protobuf;

/* loaded from: classes16.dex */
public final class i7 extends com.google.protobuf.k7 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f45195c = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    public i7(com.google.protobuf.h7 h7Var) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List d(java.lang.Object obj, long j17, int i17) {
        com.google.protobuf.f7 f7Var;
        java.util.List list = (java.util.List) com.google.protobuf.ib.o(obj, j17);
        if (list.isEmpty()) {
            java.util.List f7Var2 = list instanceof com.google.protobuf.g7 ? new com.google.protobuf.f7(i17) : ((list instanceof com.google.protobuf.f9) && (list instanceof com.google.protobuf.v6)) ? ((com.google.protobuf.v6) list).F(i17) : new java.util.ArrayList(i17);
            com.google.protobuf.ib.w(obj, j17, f7Var2);
            return f7Var2;
        }
        if (f45195c.isAssignableFrom(list.getClass())) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + i17);
            arrayList.addAll(list);
            com.google.protobuf.ib.w(obj, j17, arrayList);
            f7Var = arrayList;
        } else {
            if (!(list instanceof com.google.protobuf.cb)) {
                if (!(list instanceof com.google.protobuf.f9) || !(list instanceof com.google.protobuf.v6)) {
                    return list;
                }
                com.google.protobuf.v6 v6Var = (com.google.protobuf.v6) list;
                if (((com.google.protobuf.h) v6Var).f45145d) {
                    return list;
                }
                com.google.protobuf.v6 F = v6Var.F(list.size() + i17);
                com.google.protobuf.ib.w(obj, j17, F);
                return F;
            }
            com.google.protobuf.f7 f7Var3 = new com.google.protobuf.f7(list.size() + i17);
            f7Var3.addAll((com.google.protobuf.cb) list);
            com.google.protobuf.ib.w(obj, j17, f7Var3);
            f7Var = f7Var3;
        }
        return f7Var;
    }

    @Override // com.google.protobuf.k7
    public void a(java.lang.Object obj, long j17) {
        java.lang.Object unmodifiableList;
        java.util.List list = (java.util.List) com.google.protobuf.ib.o(obj, j17);
        if (list instanceof com.google.protobuf.g7) {
            unmodifiableList = ((com.google.protobuf.g7) list).b();
        } else {
            if (f45195c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof com.google.protobuf.f9) && (list instanceof com.google.protobuf.v6)) {
                com.google.protobuf.h hVar = (com.google.protobuf.h) ((com.google.protobuf.v6) list);
                if (hVar.f45145d) {
                    hVar.f45145d = false;
                    return;
                }
                return;
            }
            unmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.google.protobuf.ib.w(obj, j17, unmodifiableList);
    }

    @Override // com.google.protobuf.k7
    public void b(java.lang.Object obj, java.lang.Object obj2, long j17) {
        java.util.List list = (java.util.List) com.google.protobuf.ib.o(obj2, j17);
        java.util.List d17 = d(obj, j17, list.size());
        int size = d17.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d17.addAll(list);
        }
        if (size > 0) {
            list = d17;
        }
        com.google.protobuf.ib.w(obj, j17, list);
    }

    @Override // com.google.protobuf.k7
    public java.util.List c(java.lang.Object obj, long j17) {
        return d(obj, j17, 10);
    }
}
