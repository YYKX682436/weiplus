package x1;

/* loaded from: classes14.dex */
public abstract class f {
    public static final h1.c a(int i17, n0.o oVar, int i18) {
        h1.c aVar;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(473971343);
        android.content.Context context = (android.content.Context) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a1.f92036b);
        android.content.res.Resources resources = context.getResources();
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i19 = n0.o.f415162a;
        java.lang.Object obj = n0.n.f415153a;
        if (y17 == obj) {
            y17 = new android.util.TypedValue();
            y0Var.g0(y17);
        }
        y0Var.o(false);
        android.util.TypedValue typedValue = (android.util.TypedValue) y17;
        resources.getValue(i17, typedValue, true);
        java.lang.CharSequence charSequence = typedValue.string;
        if (charSequence != null && r26.n0.F(charSequence, ".xml", false, 2, null)) {
            y0Var.U(-738265321);
            android.content.res.Resources.Theme theme = context.getTheme();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(theme, "context.theme");
            y0Var.U(2112503116);
            x1.e eVar = (x1.e) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a1.f92037c);
            x1.d dVar = new x1.d(theme, i17);
            eVar.getClass();
            java.util.HashMap hashMap = eVar.f532880a;
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(dVar);
            x1.c cVar = weakReference != null ? (x1.c) weakReference.get() : null;
            if (cVar == null) {
                android.content.res.XmlResourceParser xml = resources.getXml(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(xml, "res.getXml(id)");
                j1.c.b(xml);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xml.getName(), "vector")) {
                    throw new java.lang.IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                }
                cVar = x1.h.a(theme, resources, xml);
                hashMap.put(dVar, new java.lang.ref.WeakReference(cVar));
            }
            y0Var.o(false);
            aVar = i1.c2.b(cVar.f532876a, y0Var, 0);
            y0Var.o(false);
        } else {
            y0Var.U(-738265196);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            y0Var.U(511388516);
            boolean e17 = y0Var.e(valueOf) | y0Var.e(charSequence);
            java.lang.Object y18 = y0Var.y();
            if (e17 || y18 == obj) {
                int i27 = e1.g0.f327791a;
                android.graphics.drawable.Drawable drawable = resources.getDrawable(i17, null);
                if (drawable == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                }
                android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
                y18 = e1.e.b(bitmap);
                y0Var.g0(y18);
            }
            y0Var.o(false);
            aVar = new h1.a((e1.g0) y18, 0L, 0L, 6, null);
            y0Var.o(false);
        }
        y0Var.o(false);
        return aVar;
    }
}
