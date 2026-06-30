package ik1;

/* loaded from: classes5.dex */
public abstract class d0 {
    public static boolean a(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2) {
        if (fVar == null && fVar2 == null) {
            throw new java.lang.IllegalArgumentException("both null!!!");
        }
        if (fVar == null || fVar2 == null) {
            return false;
        }
        try {
            byte[] mo14344x5f01b1f6 = fVar.mo14344x5f01b1f6();
            byte[] mo14344x5f01b1f62 = fVar2.mo14344x5f01b1f6();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            return java.util.Arrays.equals(mo14344x5f01b1f6, mo14344x5f01b1f62);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
