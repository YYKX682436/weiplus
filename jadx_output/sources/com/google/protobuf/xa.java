package com.google.protobuf;

/* loaded from: classes16.dex */
public final class xa {

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.protobuf.xa f45706f = new com.google.protobuf.xa(0, new int[0], new java.lang.Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f45707a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f45708b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f45709c;

    /* renamed from: d, reason: collision with root package name */
    public int f45710d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45711e;

    public xa() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    public static com.google.protobuf.xa c(com.google.protobuf.xa xaVar, com.google.protobuf.xa xaVar2) {
        int i17 = xaVar.f45707a + xaVar2.f45707a;
        int[] copyOf = java.util.Arrays.copyOf(xaVar.f45708b, i17);
        java.lang.System.arraycopy(xaVar2.f45708b, 0, copyOf, xaVar.f45707a, xaVar2.f45707a);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(xaVar.f45709c, i17);
        java.lang.System.arraycopy(xaVar2.f45709c, 0, copyOf2, xaVar.f45707a, xaVar2.f45707a);
        return new com.google.protobuf.xa(i17, copyOf, copyOf2, true);
    }

    public int a() {
        int s17;
        int i17 = this.f45710d;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f45707a; i19++) {
            int i27 = this.f45708b[i19];
            int i28 = i27 >>> 3;
            int i29 = i27 & 7;
            if (i29 == 0) {
                s17 = com.google.protobuf.k0.s(i28, ((java.lang.Long) this.f45709c[i19]).longValue());
            } else if (i29 == 1) {
                s17 = com.google.protobuf.k0.h(i28, ((java.lang.Long) this.f45709c[i19]).longValue());
            } else if (i29 == 2) {
                s17 = com.google.protobuf.k0.c(i28, (com.google.protobuf.y) this.f45709c[i19]);
            } else if (i29 == 3) {
                s17 = (com.google.protobuf.k0.p(i28) * 2) + ((com.google.protobuf.xa) this.f45709c[i19]).a();
            } else {
                if (i29 != 5) {
                    throw new java.lang.IllegalStateException(com.google.protobuf.y6.d());
                }
                s17 = com.google.protobuf.k0.g(i28, ((java.lang.Integer) this.f45709c[i19]).intValue());
            }
            i18 += s17;
        }
        this.f45710d = i18;
        return i18;
    }

    public boolean b(int i17, com.google.protobuf.d0 d0Var) {
        int F;
        if (!this.f45711e) {
            throw new java.lang.UnsupportedOperationException();
        }
        int i18 = i17 >>> 3;
        int i19 = i17 & 7;
        if (i19 == 0) {
            d(i17, java.lang.Long.valueOf(d0Var.u()));
            return true;
        }
        if (i19 == 1) {
            d(i17, java.lang.Long.valueOf(d0Var.q()));
            return true;
        }
        if (i19 == 2) {
            d(i17, d0Var.m());
            return true;
        }
        if (i19 != 3) {
            if (i19 == 4) {
                return false;
            }
            if (i19 != 5) {
                throw com.google.protobuf.y6.d();
            }
            d(i17, java.lang.Integer.valueOf(d0Var.p()));
            return true;
        }
        com.google.protobuf.xa xaVar = new com.google.protobuf.xa();
        do {
            F = d0Var.F();
            if (F == 0) {
                break;
            }
        } while (xaVar.b(F, d0Var));
        d0Var.a((i18 << 3) | 4);
        d(i17, xaVar);
        return true;
    }

    public void d(int i17, java.lang.Object obj) {
        if (!this.f45711e) {
            throw new java.lang.UnsupportedOperationException();
        }
        int i18 = this.f45707a;
        int[] iArr = this.f45708b;
        if (i18 == iArr.length) {
            int i19 = i18 + (i18 < 4 ? 8 : i18 >> 1);
            this.f45708b = java.util.Arrays.copyOf(iArr, i19);
            this.f45709c = java.util.Arrays.copyOf(this.f45709c, i19);
        }
        int[] iArr2 = this.f45708b;
        int i27 = this.f45707a;
        iArr2[i27] = i17;
        this.f45709c[i27] = obj;
        this.f45707a = i27 + 1;
    }

    public void e(com.google.protobuf.bc bcVar) {
        if (this.f45707a == 0) {
            return;
        }
        bcVar.getClass();
        for (int i17 = 0; i17 < this.f45707a; i17++) {
            int i18 = this.f45708b[i17];
            java.lang.Object obj = this.f45709c[i17];
            int i19 = i18 >>> 3;
            int i27 = i18 & 7;
            if (i27 == 0) {
                ((com.google.protobuf.l0) bcVar).j(i19, ((java.lang.Long) obj).longValue());
            } else if (i27 == 1) {
                ((com.google.protobuf.l0) bcVar).f(i19, ((java.lang.Long) obj).longValue());
            } else if (i27 == 2) {
                ((com.google.protobuf.l0) bcVar).b(i19, (com.google.protobuf.y) obj);
            } else if (i27 == 3) {
                com.google.protobuf.l0 l0Var = (com.google.protobuf.l0) bcVar;
                l0Var.q(i19);
                ((com.google.protobuf.xa) obj).e(bcVar);
                l0Var.d(i19);
            } else {
                if (i27 != 5) {
                    throw new java.lang.RuntimeException(com.google.protobuf.y6.d());
                }
                ((com.google.protobuf.l0) bcVar).e(i19, ((java.lang.Integer) obj).intValue());
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.protobuf.xa)) {
            return false;
        }
        com.google.protobuf.xa xaVar = (com.google.protobuf.xa) obj;
        int i17 = this.f45707a;
        if (i17 == xaVar.f45707a) {
            int[] iArr = this.f45708b;
            int[] iArr2 = xaVar.f45708b;
            int i18 = 0;
            while (true) {
                if (i18 >= i17) {
                    z17 = true;
                    break;
                }
                if (iArr[i18] != iArr2[i18]) {
                    z17 = false;
                    break;
                }
                i18++;
            }
            if (z17) {
                java.lang.Object[] objArr = this.f45709c;
                java.lang.Object[] objArr2 = xaVar.f45709c;
                int i19 = this.f45707a;
                int i27 = 0;
                while (true) {
                    if (i27 >= i19) {
                        z18 = true;
                        break;
                    }
                    if (!objArr[i27].equals(objArr2[i27])) {
                        z18 = false;
                        break;
                    }
                    i27++;
                }
                if (z18) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i17 = this.f45707a;
        int i18 = (com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + i17) * 31;
        int[] iArr = this.f45708b;
        int i19 = 17;
        int i27 = 17;
        for (int i28 = 0; i28 < i17; i28++) {
            i27 = (i27 * 31) + iArr[i28];
        }
        int i29 = (i18 + i27) * 31;
        java.lang.Object[] objArr = this.f45709c;
        int i37 = this.f45707a;
        for (int i38 = 0; i38 < i37; i38++) {
            i19 = (i19 * 31) + objArr[i38].hashCode();
        }
        return i29 + i19;
    }

    public xa(int i17, int[] iArr, java.lang.Object[] objArr, boolean z17) {
        this.f45710d = -1;
        this.f45707a = i17;
        this.f45708b = iArr;
        this.f45709c = objArr;
        this.f45711e = z17;
    }
}
