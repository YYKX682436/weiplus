package com.google.protobuf;

/* loaded from: classes16.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    public com.google.protobuf.ba f45787a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45788b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f45789c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f45790d;

    public z4(com.google.protobuf.y4 y4Var) {
        int i17 = com.google.protobuf.ba.f44929m;
        this.f45787a = new com.google.protobuf.u9(16);
        this.f45789c = true;
    }

    public static java.lang.Object f(com.google.protobuf.a5 a5Var, java.lang.Object obj) {
        if (obj == null || a5Var.u0() != com.google.protobuf.vb.MESSAGE) {
            return obj;
        }
        if (!a5Var.d1()) {
            return obj instanceof com.google.protobuf.n8 ? ((com.google.protobuf.n8) obj).build() : obj;
        }
        if (!(obj instanceof java.util.List)) {
            java.lang.String valueOf = java.lang.String.valueOf(obj.getClass());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 66);
            sb6.append("Repeated field should contains a List but actually contains type: ");
            sb6.append(valueOf);
            throw new java.lang.IllegalStateException(sb6.toString());
        }
        java.util.List list = (java.util.List) obj;
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.lang.Object obj2 = list.get(i17);
            java.lang.Object build = obj2 instanceof com.google.protobuf.n8 ? ((com.google.protobuf.n8) obj2).build() : obj2;
            if (build != obj2) {
                if (list == obj) {
                    list = new java.util.ArrayList(list);
                }
                list.set(i17, build);
            }
        }
        return list;
    }

    public static void g(com.google.protobuf.ba baVar) {
        for (int i17 = 0; i17 < baVar.d(); i17++) {
            java.util.Map.Entry c17 = baVar.c(i17);
            c17.setValue(f((com.google.protobuf.a5) c17.getKey(), c17.getValue()));
        }
        for (java.util.Map.Entry entry : baVar.e()) {
            entry.setValue(f((com.google.protobuf.a5) entry.getKey(), entry.getValue()));
        }
    }

    public static void i(com.google.protobuf.ub ubVar, java.lang.Object obj) {
        if (com.google.protobuf.b5.q(ubVar, obj)) {
            return;
        }
        if (ubVar.f45597d != com.google.protobuf.vb.MESSAGE || !(obj instanceof com.google.protobuf.n8)) {
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final void a() {
        if (this.f45789c) {
            return;
        }
        this.f45787a = com.google.protobuf.b5.c(this.f45787a, true);
        this.f45789c = true;
    }

    public java.lang.Object b(com.google.protobuf.a5 a5Var) {
        return f(a5Var, c(a5Var));
    }

    public java.lang.Object c(com.google.protobuf.a5 a5Var) {
        java.lang.Object obj = this.f45787a.get(a5Var);
        return obj instanceof com.google.protobuf.d7 ? ((com.google.protobuf.d7) obj).a() : obj;
    }

    public java.lang.Object d(com.google.protobuf.a5 a5Var, int i17) {
        if (!a5Var.d1()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object c17 = c(a5Var);
        if (c17 != null) {
            return ((java.util.List) c17).get(i17);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public final void e(java.util.Map.Entry entry) {
        com.google.protobuf.a5 a5Var = (com.google.protobuf.a5) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.google.protobuf.d7) {
            value = ((com.google.protobuf.d7) value).a();
        }
        if (a5Var.d1()) {
            java.lang.Object b17 = b(a5Var);
            if (b17 == null) {
                b17 = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) b17).add(com.google.protobuf.b5.e(it.next()));
            }
            this.f45787a.h(a5Var, b17);
            return;
        }
        if (a5Var.u0() != com.google.protobuf.vb.MESSAGE) {
            this.f45787a.h(a5Var, com.google.protobuf.b5.e(value));
            return;
        }
        java.lang.Object b18 = b(a5Var);
        if (b18 == null) {
            this.f45787a.h(a5Var, com.google.protobuf.b5.e(value));
        } else if (b18 instanceof com.google.protobuf.n8) {
            a5Var.q((com.google.protobuf.n8) b18, (com.google.protobuf.o8) value);
        } else {
            this.f45787a.h(a5Var, a5Var.q(((com.google.protobuf.o8) b18).toBuilder(), (com.google.protobuf.o8) value).build());
        }
    }

    public void h(com.google.protobuf.a5 a5Var, java.lang.Object obj) {
        a();
        if (!a5Var.d1()) {
            i(a5Var.P(), obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                i(a5Var.P(), next);
                this.f45790d = this.f45790d || (next instanceof com.google.protobuf.n8);
            }
            obj = arrayList;
        }
        if (obj instanceof com.google.protobuf.d7) {
            this.f45788b = true;
        }
        this.f45790d = this.f45790d || (obj instanceof com.google.protobuf.n8);
        this.f45787a.h(a5Var, obj);
    }
}
