package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class i7 extends com.p176xb6135e39.p283xc50a8b8b.k7 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f126728c = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    public i7(com.p176xb6135e39.p283xc50a8b8b.h7 h7Var) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List d(java.lang.Object obj, long j17, int i17) {
        com.p176xb6135e39.p283xc50a8b8b.f7 f7Var;
        java.util.List list = (java.util.List) com.p176xb6135e39.p283xc50a8b8b.ib.o(obj, j17);
        if (list.isEmpty()) {
            java.util.List f7Var2 = list instanceof com.p176xb6135e39.p283xc50a8b8b.g7 ? new com.p176xb6135e39.p283xc50a8b8b.f7(i17) : ((list instanceof com.p176xb6135e39.p283xc50a8b8b.f9) && (list instanceof com.p176xb6135e39.p283xc50a8b8b.v6)) ? ((com.p176xb6135e39.p283xc50a8b8b.v6) list).F(i17) : new java.util.ArrayList(i17);
            com.p176xb6135e39.p283xc50a8b8b.ib.w(obj, j17, f7Var2);
            return f7Var2;
        }
        if (f126728c.isAssignableFrom(list.getClass())) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + i17);
            arrayList.addAll(list);
            com.p176xb6135e39.p283xc50a8b8b.ib.w(obj, j17, arrayList);
            f7Var = arrayList;
        } else {
            if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.cb)) {
                if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.f9) || !(list instanceof com.p176xb6135e39.p283xc50a8b8b.v6)) {
                    return list;
                }
                com.p176xb6135e39.p283xc50a8b8b.v6 v6Var = (com.p176xb6135e39.p283xc50a8b8b.v6) list;
                if (((com.p176xb6135e39.p283xc50a8b8b.h) v6Var).f126678d) {
                    return list;
                }
                com.p176xb6135e39.p283xc50a8b8b.v6 F = v6Var.F(list.size() + i17);
                com.p176xb6135e39.p283xc50a8b8b.ib.w(obj, j17, F);
                return F;
            }
            com.p176xb6135e39.p283xc50a8b8b.f7 f7Var3 = new com.p176xb6135e39.p283xc50a8b8b.f7(list.size() + i17);
            f7Var3.addAll((com.p176xb6135e39.p283xc50a8b8b.cb) list);
            com.p176xb6135e39.p283xc50a8b8b.ib.w(obj, j17, f7Var3);
            f7Var = f7Var3;
        }
        return f7Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k7
    public void a(java.lang.Object obj, long j17) {
        java.lang.Object unmodifiableList;
        java.util.List list = (java.util.List) com.p176xb6135e39.p283xc50a8b8b.ib.o(obj, j17);
        if (list instanceof com.p176xb6135e39.p283xc50a8b8b.g7) {
            unmodifiableList = ((com.p176xb6135e39.p283xc50a8b8b.g7) list).b();
        } else {
            if (f126728c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof com.p176xb6135e39.p283xc50a8b8b.f9) && (list instanceof com.p176xb6135e39.p283xc50a8b8b.v6)) {
                com.p176xb6135e39.p283xc50a8b8b.h hVar = (com.p176xb6135e39.p283xc50a8b8b.h) ((com.p176xb6135e39.p283xc50a8b8b.v6) list);
                if (hVar.f126678d) {
                    hVar.f126678d = false;
                    return;
                }
                return;
            }
            unmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.p176xb6135e39.p283xc50a8b8b.ib.w(obj, j17, unmodifiableList);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k7
    public void b(java.lang.Object obj, java.lang.Object obj2, long j17) {
        java.util.List list = (java.util.List) com.p176xb6135e39.p283xc50a8b8b.ib.o(obj2, j17);
        java.util.List d17 = d(obj, j17, list.size());
        int size = d17.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d17.addAll(list);
        }
        if (size > 0) {
            list = d17;
        }
        com.p176xb6135e39.p283xc50a8b8b.ib.w(obj, j17, list);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k7
    public java.util.List c(java.lang.Object obj, long j17) {
        return d(obj, j17, 10);
    }
}
