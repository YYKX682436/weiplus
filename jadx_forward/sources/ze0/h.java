package ze0;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ze0.h f553296a = new ze0.h();

    public final xe0.u0 a(int i17, bi4.c cVar) {
        xe0.r0 a17 = new xe0.r0().a().a();
        a17.f535306a = i17;
        a17.f535313h = xe0.p0.f535300d;
        a17.f535311f = false;
        a17.f535312g = false;
        xe0.t0 t0Var = xe0.t0.f535328e;
        a17.f535322q = t0Var;
        a17.f535323r = t0Var;
        jz5.l b17 = b(cVar);
        if (b17 != null) {
            int intValue = ((java.lang.Number) b17.f384366d).intValue();
            int intValue2 = ((java.lang.Number) b17.f384367e).intValue();
            a17.f535314i = intValue;
            a17.f535315j = intValue2;
        }
        return a17.a();
    }

    public final jz5.l b(bi4.c cVar) {
        android.content.res.Resources resources;
        jz5.l lVar;
        if (cVar == null || (resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e) == null) {
            return null;
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 8) {
            int color = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
            lVar = new jz5.l(java.lang.Integer.valueOf(color), java.lang.Integer.valueOf(color));
        } else if (ordinal == 9) {
            int color2 = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
            lVar = new jz5.l(java.lang.Integer.valueOf(color2), java.lang.Integer.valueOf(color2));
        } else if (ordinal == 11) {
            lVar = new jz5.l(-1, -1);
        } else {
            if (ordinal != 13) {
                return null;
            }
            int color3 = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29);
            lVar = new jz5.l(java.lang.Integer.valueOf(color3), java.lang.Integer.valueOf(color3));
        }
        return lVar;
    }
}
