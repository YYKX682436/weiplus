package com.google.protobuf;

/* loaded from: classes16.dex */
public final class y8 implements com.google.protobuf.q9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.o8 f45742a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.protobuf.qa f45743b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f45744c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.u4 f45745d;

    public y8(com.google.protobuf.qa qaVar, com.google.protobuf.u4 u4Var, com.google.protobuf.o8 o8Var) {
        this.f45743b = qaVar;
        this.f45744c = u4Var.e(o8Var);
        this.f45745d = u4Var;
        this.f45742a = o8Var;
    }

    @Override // com.google.protobuf.q9
    public void a(java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.s9.y(this.f45743b, obj, obj2);
        if (this.f45744c) {
            com.google.protobuf.u4 u4Var = this.f45745d;
            com.google.protobuf.b5 c17 = u4Var.c(obj2);
            if (c17.f44921a.isEmpty()) {
                return;
            }
            u4Var.d(obj).t(c17);
        }
    }

    @Override // com.google.protobuf.q9
    public void b(java.lang.Object obj, com.google.protobuf.bc bcVar) {
        java.util.Iterator r17 = this.f45745d.c(obj).r();
        while (r17.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) r17.next();
            com.google.protobuf.a5 a5Var = (com.google.protobuf.a5) entry.getKey();
            if (a5Var.u0() != com.google.protobuf.vb.MESSAGE || a5Var.d1() || a5Var.C1()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof com.google.protobuf.b7) {
                a5Var.getNumber();
                android.support.v4.media.f.a(((com.google.protobuf.b7) entry).f44926d.getValue());
                throw null;
            }
            ((com.google.protobuf.l0) bcVar).l(a5Var.getNumber(), entry.getValue());
        }
        ((com.google.protobuf.ya) this.f45743b).getClass();
        com.google.protobuf.xa xaVar = ((com.google.protobuf.n5) obj).unknownFields;
        xaVar.getClass();
        bcVar.getClass();
        for (int i17 = 0; i17 < xaVar.f45707a; i17++) {
            ((com.google.protobuf.l0) bcVar).l(xaVar.f45708b[i17] >>> 3, xaVar.f45709c[i17]);
        }
    }

    @Override // com.google.protobuf.q9
    public final boolean c(java.lang.Object obj) {
        return this.f45745d.c(obj).o();
    }

    @Override // com.google.protobuf.q9
    public void d(java.lang.Object obj, byte[] bArr, int i17, int i18, com.google.protobuf.j jVar) {
        com.google.protobuf.n5 n5Var = (com.google.protobuf.n5) obj;
        if (n5Var.unknownFields == com.google.protobuf.xa.f45706f) {
            n5Var.unknownFields = new com.google.protobuf.xa();
        }
        android.support.v4.media.f.a(obj);
        throw null;
    }

    @Override // com.google.protobuf.q9
    public void e(java.lang.Object obj) {
        ((com.google.protobuf.ya) this.f45743b).getClass();
        ((com.google.protobuf.n5) obj).unknownFields.f45711e = false;
        this.f45745d.f(obj);
    }

    @Override // com.google.protobuf.q9
    public boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.qa qaVar = this.f45743b;
        ((com.google.protobuf.ya) qaVar).getClass();
        com.google.protobuf.xa xaVar = ((com.google.protobuf.n5) obj).unknownFields;
        ((com.google.protobuf.ya) qaVar).getClass();
        if (!xaVar.equals(((com.google.protobuf.n5) obj2).unknownFields)) {
            return false;
        }
        if (!this.f45744c) {
            return true;
        }
        com.google.protobuf.u4 u4Var = this.f45745d;
        return u4Var.c(obj).equals(u4Var.c(obj2));
    }

    @Override // com.google.protobuf.q9
    public int f(java.lang.Object obj) {
        ((com.google.protobuf.ya) this.f45743b).getClass();
        com.google.protobuf.xa xaVar = ((com.google.protobuf.n5) obj).unknownFields;
        int i17 = xaVar.f45710d;
        if (i17 == -1) {
            i17 = 0;
            for (int i18 = 0; i18 < xaVar.f45707a; i18++) {
                i17 += (com.google.protobuf.k0.p(1) * 2) + com.google.protobuf.k0.q(2, xaVar.f45708b[i18] >>> 3) + com.google.protobuf.k0.c(3, (com.google.protobuf.y) xaVar.f45709c[i18]);
            }
            xaVar.f45710d = i17;
        }
        int i19 = i17 + 0;
        return this.f45744c ? i19 + this.f45745d.c(obj).k() : i19;
    }

    @Override // com.google.protobuf.q9
    public java.lang.Object g() {
        return this.f45742a.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.q9
    public void h(java.lang.Object obj, com.google.protobuf.l9 l9Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.qa qaVar = this.f45743b;
        ((com.google.protobuf.ya) qaVar).getClass();
        com.google.protobuf.n5 n5Var = (com.google.protobuf.n5) obj;
        com.google.protobuf.xa xaVar = n5Var.unknownFields;
        if (xaVar == com.google.protobuf.xa.f45706f) {
            xaVar = new com.google.protobuf.xa();
            n5Var.unknownFields = xaVar;
        }
        com.google.protobuf.xa xaVar2 = xaVar;
        com.google.protobuf.u4 u4Var = this.f45745d;
        com.google.protobuf.b5 d17 = u4Var.d(obj);
        do {
            try {
                if (l9Var.o() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                qaVar.c(obj, xaVar2);
            }
        } while (i(l9Var, t4Var, u4Var, d17, qaVar, xaVar2));
    }

    @Override // com.google.protobuf.q9
    public int hashCode(java.lang.Object obj) {
        ((com.google.protobuf.ya) this.f45743b).getClass();
        int hashCode = ((com.google.protobuf.n5) obj).unknownFields.hashCode();
        return this.f45744c ? (hashCode * 53) + this.f45745d.c(obj).hashCode() : hashCode;
    }

    public final boolean i(com.google.protobuf.l9 l9Var, com.google.protobuf.t4 t4Var, com.google.protobuf.u4 u4Var, com.google.protobuf.b5 b5Var, com.google.protobuf.qa qaVar, java.lang.Object obj) {
        int tag = l9Var.getTag();
        com.google.protobuf.o8 o8Var = this.f45742a;
        if (tag != 11) {
            if ((tag & 7) != 2) {
                return l9Var.r();
            }
            java.lang.Object b17 = u4Var.b(t4Var, o8Var, tag >>> 3);
            if (b17 == null) {
                return qaVar.a(obj, l9Var);
            }
            u4Var.h(l9Var, b17, t4Var, b5Var);
            return true;
        }
        java.lang.Object obj2 = null;
        int i17 = 0;
        com.google.protobuf.y yVar = null;
        while (l9Var.o() != Integer.MAX_VALUE) {
            int tag2 = l9Var.getTag();
            if (tag2 == 16) {
                i17 = l9Var.c();
                obj2 = u4Var.b(t4Var, o8Var, i17);
            } else if (tag2 == 26) {
                if (obj2 != null) {
                    u4Var.h(l9Var, obj2, t4Var, b5Var);
                } else {
                    yVar = l9Var.h();
                }
            } else if (!l9Var.r()) {
                break;
            }
        }
        if (l9Var.getTag() != 12) {
            throw com.google.protobuf.y6.a();
        }
        if (yVar != null) {
            if (obj2 != null) {
                u4Var.i(yVar, obj2, t4Var, b5Var);
            } else {
                ((com.google.protobuf.ya) qaVar).getClass();
                ((com.google.protobuf.xa) obj).d((i17 << 3) | 2, yVar);
            }
        }
        return true;
    }
}
