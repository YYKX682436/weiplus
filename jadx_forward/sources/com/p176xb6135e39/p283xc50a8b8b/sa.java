package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class sa implements com.p176xb6135e39.p283xc50a8b8b.n8 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f127035d;

    /* renamed from: e, reason: collision with root package name */
    public int f127036e;

    /* renamed from: f, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.ta f127037f;

    public com.p176xb6135e39.p283xc50a8b8b.sa a(int i17, com.p176xb6135e39.p283xc50a8b8b.ua uaVar) {
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        if (this.f127037f != null && this.f127036e == i17) {
            this.f127037f = null;
            this.f127036e = 0;
        }
        if (this.f127035d.isEmpty()) {
            this.f127035d = new java.util.TreeMap();
        }
        this.f127035d.put(java.lang.Integer.valueOf(i17), uaVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.wa mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.wa waVar;
        c(0);
        if (this.f127035d.isEmpty()) {
            waVar = com.p176xb6135e39.p283xc50a8b8b.wa.f127184e;
        } else {
            waVar = new com.p176xb6135e39.p283xc50a8b8b.wa(java.util.Collections.unmodifiableMap(this.f127035d), java.util.Collections.unmodifiableMap(((java.util.TreeMap) this.f127035d).descendingMap()));
        }
        this.f127035d = null;
        return waVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20557x85702333() {
        return mo20556x59bc66e();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.ta c(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.ta taVar = this.f127037f;
        if (taVar != null) {
            int i18 = this.f127036e;
            if (i17 == i18) {
                return taVar;
            }
            a(i18, taVar.a());
        }
        if (i17 == 0) {
            return null;
        }
        com.p176xb6135e39.p283xc50a8b8b.ua uaVar = (com.p176xb6135e39.p283xc50a8b8b.ua) this.f127035d.get(java.lang.Integer.valueOf(i17));
        this.f127036e = i17;
        com.p176xb6135e39.p283xc50a8b8b.ta taVar2 = new com.p176xb6135e39.p283xc50a8b8b.ta();
        taVar2.f127091a = new com.p176xb6135e39.p283xc50a8b8b.ua(null);
        this.f127037f = taVar2;
        if (uaVar != null) {
            taVar2.b(uaVar);
        }
        return this.f127037f;
    }

    /* renamed from: clone */
    public java.lang.Object m20906x5a5dd5d() {
        c(0);
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(((java.util.TreeMap) this.f127035d).descendingMap());
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        b17.f(new com.p176xb6135e39.p283xc50a8b8b.wa(this.f127035d, unmodifiableMap));
        return b17;
    }

    public com.p176xb6135e39.p283xc50a8b8b.sa d(int i17, com.p176xb6135e39.p283xc50a8b8b.ua uaVar) {
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        if (i17 == this.f127036e || this.f127035d.containsKey(java.lang.Integer.valueOf(i17))) {
            c(i17).b(uaVar);
        } else {
            a(i17, uaVar);
        }
        return this;
    }

    public boolean e(int i17, com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        int i18 = i17 >>> 3;
        int i19 = i17 & 7;
        if (i19 == 0) {
            com.p176xb6135e39.p283xc50a8b8b.ta c17 = c(i18);
            long u17 = d0Var.u();
            com.p176xb6135e39.p283xc50a8b8b.ua uaVar = c17.f127091a;
            if (uaVar.f127119a == null) {
                uaVar.f127119a = new java.util.ArrayList();
            }
            c17.f127091a.f127119a.add(java.lang.Long.valueOf(u17));
            return true;
        }
        if (i19 == 1) {
            com.p176xb6135e39.p283xc50a8b8b.ta c18 = c(i18);
            long q17 = d0Var.q();
            com.p176xb6135e39.p283xc50a8b8b.ua uaVar2 = c18.f127091a;
            if (uaVar2.f127121c == null) {
                uaVar2.f127121c = new java.util.ArrayList();
            }
            c18.f127091a.f127121c.add(java.lang.Long.valueOf(q17));
            return true;
        }
        if (i19 == 2) {
            com.p176xb6135e39.p283xc50a8b8b.ta c19 = c(i18);
            com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
            com.p176xb6135e39.p283xc50a8b8b.ua uaVar3 = c19.f127091a;
            if (uaVar3.f127122d == null) {
                uaVar3.f127122d = new java.util.ArrayList();
            }
            c19.f127091a.f127122d.add(m17);
            return true;
        }
        if (i19 == 3) {
            com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
            d0Var.s(i18, b17, com.p176xb6135e39.p283xc50a8b8b.q4.f126979e);
            com.p176xb6135e39.p283xc50a8b8b.ta c27 = c(i18);
            com.p176xb6135e39.p283xc50a8b8b.wa mo20556x59bc66e = b17.mo20556x59bc66e();
            com.p176xb6135e39.p283xc50a8b8b.ua uaVar4 = c27.f127091a;
            if (uaVar4.f127123e == null) {
                uaVar4.f127123e = new java.util.ArrayList();
            }
            c27.f127091a.f127123e.add(mo20556x59bc66e);
            return true;
        }
        if (i19 == 4) {
            return false;
        }
        if (i19 != 5) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        com.p176xb6135e39.p283xc50a8b8b.ta c28 = c(i18);
        int p17 = d0Var.p();
        com.p176xb6135e39.p283xc50a8b8b.ua uaVar5 = c28.f127091a;
        if (uaVar5.f127120b == null) {
            uaVar5.f127120b = new java.util.ArrayList();
        }
        c28.f127091a.f127120b.add(java.lang.Integer.valueOf(p17));
        return true;
    }

    public com.p176xb6135e39.p283xc50a8b8b.sa f(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        if (waVar != com.p176xb6135e39.p283xc50a8b8b.wa.f127184e) {
            for (java.util.Map.Entry entry : waVar.f127185d.entrySet()) {
                d(((java.lang.Integer) entry.getKey()).intValue(), (com.p176xb6135e39.p283xc50a8b8b.ua) entry.getValue());
            }
        }
        return this;
    }

    public com.p176xb6135e39.p283xc50a8b8b.sa g(int i17, int i18) {
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        com.p176xb6135e39.p283xc50a8b8b.ta c17 = c(i17);
        long j17 = i18;
        com.p176xb6135e39.p283xc50a8b8b.ua uaVar = c17.f127091a;
        if (uaVar.f127119a == null) {
            uaVar.f127119a = new java.util.ArrayList();
        }
        c17.f127091a.f127119a.add(java.lang.Long.valueOf(j17));
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int F;
        do {
            F = d0Var.F();
            if (F == 0) {
                break;
            }
        } while (e(F, d0Var));
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20624x60f45402(com.p176xb6135e39.p283xc50a8b8b.o8 o8Var) {
        if (o8Var instanceof com.p176xb6135e39.p283xc50a8b8b.wa) {
            f((com.p176xb6135e39.p283xc50a8b8b.wa) o8Var);
            return this;
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
