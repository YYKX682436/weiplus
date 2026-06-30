package com.google.protobuf;

/* loaded from: classes16.dex */
public final class sa implements com.google.protobuf.n8 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f45502d;

    /* renamed from: e, reason: collision with root package name */
    public int f45503e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.protobuf.ta f45504f;

    public com.google.protobuf.sa a(int i17, com.google.protobuf.ua uaVar) {
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        if (this.f45504f != null && this.f45503e == i17) {
            this.f45504f = null;
            this.f45503e = 0;
        }
        if (this.f45502d.isEmpty()) {
            this.f45502d = new java.util.TreeMap();
        }
        this.f45502d.put(java.lang.Integer.valueOf(i17), uaVar);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.wa build() {
        com.google.protobuf.wa waVar;
        c(0);
        if (this.f45502d.isEmpty()) {
            waVar = com.google.protobuf.wa.f45651e;
        } else {
            waVar = new com.google.protobuf.wa(java.util.Collections.unmodifiableMap(this.f45502d), java.util.Collections.unmodifiableMap(((java.util.TreeMap) this.f45502d).descendingMap()));
        }
        this.f45502d = null;
        return waVar;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 buildPartial() {
        return build();
    }

    public final com.google.protobuf.ta c(int i17) {
        com.google.protobuf.ta taVar = this.f45504f;
        if (taVar != null) {
            int i18 = this.f45503e;
            if (i17 == i18) {
                return taVar;
            }
            a(i18, taVar.a());
        }
        if (i17 == 0) {
            return null;
        }
        com.google.protobuf.ua uaVar = (com.google.protobuf.ua) this.f45502d.get(java.lang.Integer.valueOf(i17));
        this.f45503e = i17;
        com.google.protobuf.ta taVar2 = new com.google.protobuf.ta();
        taVar2.f45558a = new com.google.protobuf.ua(null);
        this.f45504f = taVar2;
        if (uaVar != null) {
            taVar2.b(uaVar);
        }
        return this.f45504f;
    }

    public java.lang.Object clone() {
        c(0);
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(((java.util.TreeMap) this.f45502d).descendingMap());
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        b17.f(new com.google.protobuf.wa(this.f45502d, unmodifiableMap));
        return b17;
    }

    public com.google.protobuf.sa d(int i17, com.google.protobuf.ua uaVar) {
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        if (i17 == this.f45503e || this.f45502d.containsKey(java.lang.Integer.valueOf(i17))) {
            c(i17).b(uaVar);
        } else {
            a(i17, uaVar);
        }
        return this;
    }

    public boolean e(int i17, com.google.protobuf.d0 d0Var) {
        int i18 = i17 >>> 3;
        int i19 = i17 & 7;
        if (i19 == 0) {
            com.google.protobuf.ta c17 = c(i18);
            long u17 = d0Var.u();
            com.google.protobuf.ua uaVar = c17.f45558a;
            if (uaVar.f45586a == null) {
                uaVar.f45586a = new java.util.ArrayList();
            }
            c17.f45558a.f45586a.add(java.lang.Long.valueOf(u17));
            return true;
        }
        if (i19 == 1) {
            com.google.protobuf.ta c18 = c(i18);
            long q17 = d0Var.q();
            com.google.protobuf.ua uaVar2 = c18.f45558a;
            if (uaVar2.f45588c == null) {
                uaVar2.f45588c = new java.util.ArrayList();
            }
            c18.f45558a.f45588c.add(java.lang.Long.valueOf(q17));
            return true;
        }
        if (i19 == 2) {
            com.google.protobuf.ta c19 = c(i18);
            com.google.protobuf.y m17 = d0Var.m();
            com.google.protobuf.ua uaVar3 = c19.f45558a;
            if (uaVar3.f45589d == null) {
                uaVar3.f45589d = new java.util.ArrayList();
            }
            c19.f45558a.f45589d.add(m17);
            return true;
        }
        if (i19 == 3) {
            com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
            d0Var.s(i18, b17, com.google.protobuf.q4.f45446e);
            com.google.protobuf.ta c27 = c(i18);
            com.google.protobuf.wa build = b17.build();
            com.google.protobuf.ua uaVar4 = c27.f45558a;
            if (uaVar4.f45590e == null) {
                uaVar4.f45590e = new java.util.ArrayList();
            }
            c27.f45558a.f45590e.add(build);
            return true;
        }
        if (i19 == 4) {
            return false;
        }
        if (i19 != 5) {
            throw com.google.protobuf.y6.d();
        }
        com.google.protobuf.ta c28 = c(i18);
        int p17 = d0Var.p();
        com.google.protobuf.ua uaVar5 = c28.f45558a;
        if (uaVar5.f45587b == null) {
            uaVar5.f45587b = new java.util.ArrayList();
        }
        c28.f45558a.f45587b.add(java.lang.Integer.valueOf(p17));
        return true;
    }

    public com.google.protobuf.sa f(com.google.protobuf.wa waVar) {
        if (waVar != com.google.protobuf.wa.f45651e) {
            for (java.util.Map.Entry entry : waVar.f45652d.entrySet()) {
                d(((java.lang.Integer) entry.getKey()).intValue(), (com.google.protobuf.ua) entry.getValue());
            }
        }
        return this;
    }

    public com.google.protobuf.sa g(int i17, int i18) {
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        com.google.protobuf.ta c17 = c(i17);
        long j17 = i18;
        com.google.protobuf.ua uaVar = c17.f45558a;
        if (uaVar.f45586a == null) {
            uaVar.f45586a = new java.util.ArrayList();
        }
        c17.f45558a.f45586a.add(java.lang.Long.valueOf(j17));
        return this;
    }

    @Override // com.google.protobuf.n8
    public com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        int F;
        do {
            F = d0Var.F();
            if (F == 0) {
                break;
            }
        } while (e(F, d0Var));
        return this;
    }

    @Override // com.google.protobuf.n8
    public com.google.protobuf.n8 mergeFrom(com.google.protobuf.o8 o8Var) {
        if (o8Var instanceof com.google.protobuf.wa) {
            f((com.google.protobuf.wa) o8Var);
            return this;
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
