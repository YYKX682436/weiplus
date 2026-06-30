package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* loaded from: classes5.dex */
public abstract class o0 {
    public o0(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3) {
    }

    public static com.p314xaae8f345.p457x3304c6.p479x4179489f.o0 c(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, android.util.Size size, boolean z17) {
        c4181x2248e1a3.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
        int intValue = (D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.C0(c4181x2248e1a3, D) : -1).intValue();
        if (intValue == 0) {
            return new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4171x1d320be2(c4181x2248e1a3, size, z17, 0, 1, -1);
        }
        if (intValue == 2) {
            return new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4148xb187d302(c4181x2248e1a3, size);
        }
        throw new java.lang.IllegalArgumentException("Invalid clip segment, clip type is unknown!");
    }

    public abstract void a();

    public abstract void b(com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 m0Var);

    public abstract com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 d(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p479x4179489f.l0 l0Var);
}
