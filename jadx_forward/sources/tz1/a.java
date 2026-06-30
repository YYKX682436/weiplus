package tz1;

/* loaded from: classes13.dex */
public abstract class a {
    public static void a(java.lang.Object obj) {
        ey1.b bVar;
        if (obj == null || !sz1.a.m(obj)) {
            return;
        }
        try {
            java.lang.Class<?> cls = obj.getClass();
            if (!cls.isAnnotationPresent(ey1.b.class) || (bVar = (ey1.b) cls.getAnnotation(ey1.b.class)) == null) {
                return;
            }
            cy1.a Ui = cy1.a.Ui();
            iy1.c m128315xc4a6040a = bVar.m128315xc4a6040a();
            int m128316xc56da532 = bVar.m128316xc56da532();
            int m128317x9fd70e5 = bVar.m128317x9fd70e5();
            Ui.ak(obj, m128315xc4a6040a);
            Ui.gk(obj, null);
            Ui.ik(obj, m128316xc56da532, m128317x9fd70e5);
            cy1.a.Ui().Rj(obj, bVar.m128314x4a342b67());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.AnnotationUtils", "[checkPage] throw Exception : " + e17.getMessage());
        }
    }
}
