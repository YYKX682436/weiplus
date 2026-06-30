package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.ba f127320a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f127321b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f127322c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f127323d;

    public z4(com.p176xb6135e39.p283xc50a8b8b.y4 y4Var) {
        int i17 = com.p176xb6135e39.p283xc50a8b8b.ba.f126462m;
        this.f127320a = new com.p176xb6135e39.p283xc50a8b8b.u9(16);
        this.f127322c = true;
    }

    public static java.lang.Object f(com.p176xb6135e39.p283xc50a8b8b.a5 a5Var, java.lang.Object obj) {
        if (obj == null || a5Var.u0() != com.p176xb6135e39.p283xc50a8b8b.vb.MESSAGE) {
            return obj;
        }
        if (!a5Var.d1()) {
            return obj instanceof com.p176xb6135e39.p283xc50a8b8b.n8 ? ((com.p176xb6135e39.p283xc50a8b8b.n8) obj).mo20556x59bc66e() : obj;
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
            java.lang.Object mo20556x59bc66e = obj2 instanceof com.p176xb6135e39.p283xc50a8b8b.n8 ? ((com.p176xb6135e39.p283xc50a8b8b.n8) obj2).mo20556x59bc66e() : obj2;
            if (mo20556x59bc66e != obj2) {
                if (list == obj) {
                    list = new java.util.ArrayList(list);
                }
                list.set(i17, mo20556x59bc66e);
            }
        }
        return list;
    }

    public static void g(com.p176xb6135e39.p283xc50a8b8b.ba baVar) {
        for (int i17 = 0; i17 < baVar.d(); i17++) {
            java.util.Map.Entry c17 = baVar.c(i17);
            c17.setValue(f((com.p176xb6135e39.p283xc50a8b8b.a5) c17.getKey(), c17.getValue()));
        }
        for (java.util.Map.Entry entry : baVar.e()) {
            entry.setValue(f((com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey(), entry.getValue()));
        }
    }

    public static void i(com.p176xb6135e39.p283xc50a8b8b.ub ubVar, java.lang.Object obj) {
        if (com.p176xb6135e39.p283xc50a8b8b.b5.q(ubVar, obj)) {
            return;
        }
        if (ubVar.f127130d != com.p176xb6135e39.p283xc50a8b8b.vb.MESSAGE || !(obj instanceof com.p176xb6135e39.p283xc50a8b8b.n8)) {
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final void a() {
        if (this.f127322c) {
            return;
        }
        this.f127320a = com.p176xb6135e39.p283xc50a8b8b.b5.c(this.f127320a, true);
        this.f127322c = true;
    }

    public java.lang.Object b(com.p176xb6135e39.p283xc50a8b8b.a5 a5Var) {
        return f(a5Var, c(a5Var));
    }

    public java.lang.Object c(com.p176xb6135e39.p283xc50a8b8b.a5 a5Var) {
        java.lang.Object obj = this.f127320a.get(a5Var);
        return obj instanceof com.p176xb6135e39.p283xc50a8b8b.d7 ? ((com.p176xb6135e39.p283xc50a8b8b.d7) obj).a() : obj;
    }

    public java.lang.Object d(com.p176xb6135e39.p283xc50a8b8b.a5 a5Var, int i17) {
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
        com.p176xb6135e39.p283xc50a8b8b.a5 a5Var = (com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.p176xb6135e39.p283xc50a8b8b.d7) {
            value = ((com.p176xb6135e39.p283xc50a8b8b.d7) value).a();
        }
        if (a5Var.d1()) {
            java.lang.Object b17 = b(a5Var);
            if (b17 == null) {
                b17 = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) b17).add(com.p176xb6135e39.p283xc50a8b8b.b5.e(it.next()));
            }
            this.f127320a.h(a5Var, b17);
            return;
        }
        if (a5Var.u0() != com.p176xb6135e39.p283xc50a8b8b.vb.MESSAGE) {
            this.f127320a.h(a5Var, com.p176xb6135e39.p283xc50a8b8b.b5.e(value));
            return;
        }
        java.lang.Object b18 = b(a5Var);
        if (b18 == null) {
            this.f127320a.h(a5Var, com.p176xb6135e39.p283xc50a8b8b.b5.e(value));
        } else if (b18 instanceof com.p176xb6135e39.p283xc50a8b8b.n8) {
            a5Var.q((com.p176xb6135e39.p283xc50a8b8b.n8) b18, (com.p176xb6135e39.p283xc50a8b8b.o8) value);
        } else {
            this.f127320a.h(a5Var, a5Var.q(((com.p176xb6135e39.p283xc50a8b8b.o8) b18).mo20599xaaa148a0(), (com.p176xb6135e39.p283xc50a8b8b.o8) value).mo20556x59bc66e());
        }
    }

    public void h(com.p176xb6135e39.p283xc50a8b8b.a5 a5Var, java.lang.Object obj) {
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
                this.f127323d = this.f127323d || (next instanceof com.p176xb6135e39.p283xc50a8b8b.n8);
            }
            obj = arrayList;
        }
        if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.d7) {
            this.f127321b = true;
        }
        this.f127323d = this.f127323d || (obj instanceof com.p176xb6135e39.p283xc50a8b8b.n8);
        this.f127320a.h(a5Var, obj);
    }
}
