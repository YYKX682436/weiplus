package e3;

/* loaded from: classes13.dex */
public abstract class p {
    public p() {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public static java.lang.Object e(java.lang.Object[] objArr, int i17, e3.o oVar) {
        int i18 = (i17 & 1) == 0 ? 400 : 700;
        boolean z17 = (i17 & 2) != 0;
        java.lang.Object obj = null;
        int i19 = Integer.MAX_VALUE;
        for (java.lang.Object obj2 : objArr) {
            int abs = (java.lang.Math.abs(oVar.a(obj2) - i18) * 2) + (oVar.b(obj2) == z17 ? 0 : 1);
            if (obj == null || i19 > abs) {
                obj = obj2;
                i19 = abs;
            }
        }
        return obj;
    }

    public abstract android.graphics.Typeface a(android.content.Context context, d3.g gVar, android.content.res.Resources resources, int i17);

    public abstract android.graphics.Typeface b(android.content.Context context, android.os.CancellationSignal cancellationSignal, k3.n[] nVarArr, int i17);

    public android.graphics.Typeface c(android.content.Context context, java.io.InputStream inputStream) {
        java.io.File d17 = e3.r.d(context);
        if (d17 == null) {
            return null;
        }
        try {
            if (e3.r.c(d17, inputStream)) {
                return android.graphics.Typeface.createFromFile(d17.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            d17.delete();
        }
    }

    public android.graphics.Typeface d(android.content.Context context, android.content.res.Resources resources, int i17, java.lang.String str, int i18) {
        java.io.File d17 = e3.r.d(context);
        if (d17 == null) {
            return null;
        }
        try {
            if (e3.r.b(d17, resources, i17)) {
                return android.graphics.Typeface.createFromFile(d17.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            d17.delete();
        }
    }

    public k3.n f(k3.n[] nVarArr, int i17) {
        return (k3.n) e(nVarArr, i17, new e3.n(this));
    }
}
