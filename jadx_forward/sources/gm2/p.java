package gm2;

/* loaded from: classes3.dex */
public final class p {
    public p(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final android.graphics.drawable.Drawable a(int i17, float f17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = gm2.q.f354994f;
        java.lang.Object element = r2Var.get(java.lang.Integer.valueOf(i17));
        if (element == null) {
            synchronized (r2Var) {
                element = r2Var.get(java.lang.Integer.valueOf(i17));
                if (element == null) {
                    element = m95.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, i17, f17 > 1.0f ? f17 : 1.0f);
                    r2Var.put(java.lang.Integer.valueOf(i17), element);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLevelImageSpan", "getLevelIcon resId:" + i17 + ",scale:" + f17);
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
        return (android.graphics.drawable.Drawable) element;
    }
}
