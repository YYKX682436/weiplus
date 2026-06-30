package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class f implements com.p176xb6135e39.p283xc50a8b8b.o8 {

    /* renamed from: memoizedHashCode */
    protected int f7868x8a222005 = 0;

    @java.lang.Deprecated
    /* renamed from: addAll */
    public static <T> void m20644xab35b940(java.lang.Iterable<T> iterable, java.util.Collection<? super T> collection) {
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) collection);
    }

    /* renamed from: checkByteStringIsUtf8 */
    public static void m20646xe87b897c(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        if (!yVar.l()) {
            throw new java.lang.IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String name = getClass().getName();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(name.length() + 62 + java.lang.String.valueOf(str).length());
        sb6.append("Serializing ");
        sb6.append(name);
        sb6.append(" to a ");
        sb6.append(str);
        sb6.append(" threw an IOException (should never happen).");
        return sb6.toString();
    }

    /* renamed from: getMemoizedSerializedSize */
    public abstract int mo20586x12373b05();

    /* renamed from: getSerializedSize */
    public int m20647x9d9c349b(com.p176xb6135e39.p283xc50a8b8b.q9 q9Var) {
        int mo20586x12373b05 = mo20586x12373b05();
        if (mo20586x12373b05 != -1) {
            return mo20586x12373b05;
        }
        int f17 = q9Var.f(this);
        mo20590x447ad711(f17);
        return f17;
    }

    /* renamed from: newUninitializedMessageException */
    public com.p176xb6135e39.p283xc50a8b8b.pa mo20589xb3590f03() {
        return new com.p176xb6135e39.p283xc50a8b8b.pa(this);
    }

    /* renamed from: setMemoizedSerializedSize */
    public abstract void mo20590x447ad711(int i17);

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: toByteArray */
    public byte[] mo20648x5f01b1f6() {
        try {
            int mo20593x9d9c349b = mo20593x9d9c349b();
            byte[] bArr = new byte[mo20593x9d9c349b];
            java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
            com.p176xb6135e39.p283xc50a8b8b.h0 h0Var = new com.p176xb6135e39.p283xc50a8b8b.h0(bArr, 0, mo20593x9d9c349b);
            mo20600x5f8be6ba(h0Var);
            if (h0Var.v() == 0) {
                return bArr;
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(a("byte array"), e17);
        }
    }

    /* renamed from: toByteString */
    public com.p176xb6135e39.p283xc50a8b8b.y m20649xa0081414() {
        try {
            int mo20593x9d9c349b = mo20593x9d9c349b();
            com.p176xb6135e39.p283xc50a8b8b.y yVar = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
            byte[] bArr = new byte[mo20593x9d9c349b];
            java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
            com.p176xb6135e39.p283xc50a8b8b.h0 h0Var = new com.p176xb6135e39.p283xc50a8b8b.h0(bArr, 0, mo20593x9d9c349b);
            mo20600x5f8be6ba(h0Var);
            if (h0Var.v() == 0) {
                return new com.p176xb6135e39.p283xc50a8b8b.w(bArr);
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(a("ByteString"), e17);
        }
    }

    /* renamed from: writeDelimitedTo */
    public void m20650xf4a9d4f5(java.io.OutputStream outputStream) {
        int mo20593x9d9c349b = mo20593x9d9c349b();
        int r17 = com.p176xb6135e39.p283xc50a8b8b.k0.r(mo20593x9d9c349b) + mo20593x9d9c349b;
        if (r17 > 4096) {
            r17 = 4096;
        }
        com.p176xb6135e39.p283xc50a8b8b.j0 j0Var = new com.p176xb6135e39.p283xc50a8b8b.j0(outputStream, r17);
        j0Var.S(mo20593x9d9c349b);
        mo20600x5f8be6ba(j0Var);
        if (j0Var.f126627f > 0) {
            j0Var.a0();
        }
    }

    /* renamed from: writeTo */
    public void m20651x5f8be6ba(java.io.OutputStream outputStream) {
        int mo20593x9d9c349b = mo20593x9d9c349b();
        java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.k0.f126779b;
        if (mo20593x9d9c349b > 4096) {
            mo20593x9d9c349b = 4096;
        }
        com.p176xb6135e39.p283xc50a8b8b.j0 j0Var = new com.p176xb6135e39.p283xc50a8b8b.j0(outputStream, mo20593x9d9c349b);
        mo20600x5f8be6ba(j0Var);
        if (j0Var.f126627f > 0) {
            j0Var.a0();
        }
    }

    /* renamed from: addAll */
    public static <T> void m20645xab35b940(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) list);
    }
}
