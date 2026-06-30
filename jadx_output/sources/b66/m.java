package b66;

/* loaded from: classes11.dex */
public abstract class m {
    public static void a(b66.n nVar, bw5.nq0 nq0Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        byte[] bArr = null;
        if ((i17 & 1) != 0) {
            nq0Var = null;
        }
        b66.q qVar = (b66.q) nVar;
        if (nq0Var != null) {
            qVar.getClass();
            bArr = nq0Var.toByteArray();
        }
        urgen.ur_2BA9.UR_C8FE.UR_39F9(qVar.getCppPointer(), bArr);
    }

    public static void b(b66.n nVar, bw5.oq0 oq0Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
        }
        byte[] bArr = null;
        if ((i17 & 1) != 0) {
            oq0Var = null;
        }
        b66.q qVar = (b66.q) nVar;
        if (oq0Var != null) {
            qVar.getClass();
            bArr = oq0Var.toByteArray();
        }
        urgen.ur_2BA9.UR_C8FE.UR_2D39(qVar.getCppPointer(), bArr);
    }
}
