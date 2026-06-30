package gm2;

/* loaded from: classes3.dex */
public final class h {
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(gm2.h hVar, java.lang.String str) {
        hVar.getClass();
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = gm2.j.f354948f;
            int m77804x35e001 = r2Var.m77804x35e001();
            zl2.r4.f555483a.M2("FinderLiveFansSpan", str + " cache Size:" + m77804x35e001);
            if (m77804x35e001 > 0) {
                r2Var.d(-1);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveFansSpan-memoryTrim");
        }
    }

    public final android.graphics.Bitmap b(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = gm2.j.f354948f;
        java.lang.Object element = r2Var.get(java.lang.Integer.valueOf(i17));
        if (element == null) {
            synchronized (r2Var) {
                element = r2Var.get(java.lang.Integer.valueOf(i17));
                if (element == null) {
                    element = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.c0(i17);
                    r2Var.put(java.lang.Integer.valueOf(i17), element);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansSpan", "getFansIcon resId:" + i17);
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
        return (android.graphics.Bitmap) element;
    }
}
