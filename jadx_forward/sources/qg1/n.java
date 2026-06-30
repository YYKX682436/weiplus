package qg1;

/* loaded from: classes7.dex */
public abstract class n {
    public static r45.de7 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98) {
        r45.de7 de7Var = null;
        if (c11812xa040dc98 == null) {
            return null;
        }
        int i17 = c11812xa040dc98.f158855d;
        if (1 == i17 || 5 == i17 || 4 == i17 || 2 == i17) {
            de7Var = new r45.de7();
            de7Var.f453899d = c11812xa040dc98.f158856e;
            de7Var.f453900e = c11812xa040dc98.f158862n;
            de7Var.f453901f = c11812xa040dc98.f158861m;
        }
        if (c11812xa040dc98.f158862n != 0) {
            if (de7Var == null) {
                de7Var = new r45.de7();
            }
            de7Var.f453900e = c11812xa040dc98.f158862n;
        }
        return de7Var;
    }

    public static r45.ag7 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98) {
        if (c11812xa040dc98 == null || 2 != c11812xa040dc98.f158855d) {
            return null;
        }
        r45.ag7 ag7Var = new r45.ag7();
        ag7Var.f451536d = c11812xa040dc98.f158856e;
        ag7Var.f451537e = c11812xa040dc98.f158860i;
        return ag7Var;
    }
}
