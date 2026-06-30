package v2;

/* loaded from: classes15.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f514249a = new boolean[3];

    public static boolean a(v2.i iVar, int i17) {
        v2.h[] hVarArr = iVar.C;
        if (hVarArr[i17] != v2.h.MATCH_CONSTRAINT) {
            return false;
        }
        if (iVar.G != 0.0f) {
            v2.h hVar = hVarArr[i17 != 0 ? (char) 0 : (char) 1];
            return false;
        }
        if (i17 == 0) {
            if (iVar.f514190e != 0 || iVar.f514196h != 0 || iVar.f514198i != 0) {
                return false;
            }
        } else if (iVar.f514192f != 0 || iVar.f514200k != 0 || iVar.f514201l != 0) {
            return false;
        }
        return true;
    }

    public static void b(v2.i iVar, int i17, int i18) {
        int i19 = i17 * 2;
        int i27 = i19 + 1;
        v2.g[] gVarArr = iVar.A;
        v2.o oVar = gVarArr[i19].f514167a;
        oVar.f514253f = iVar.D.f514208s.f514167a;
        oVar.f514254g = i18;
        oVar.f514262b = 1;
        v2.o oVar2 = gVarArr[i27].f514167a;
        oVar2.f514253f = oVar;
        oVar2.f514254g = iVar.i(i17);
        iVar.A[i27].f514167a.f514262b = 1;
    }
}
