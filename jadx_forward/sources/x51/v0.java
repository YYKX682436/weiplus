package x51;

/* loaded from: classes12.dex */
public enum v0 {
    INSTANCE;


    /* renamed from: i, reason: collision with root package name */
    public static android.util.DisplayMetrics f533630i = null;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f533632d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f533633e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f533634f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f533635g = null;

    v0() {
    }

    public static void a(x51.v0 v0Var, java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap) {
        java.util.Vector vector;
        v0Var.getClass();
        java.util.LinkedList linkedList = x51.w0.f533637b;
        int i17 = 0;
        for (y60.e eVar : (y60.e[]) linkedList.toArray(new y60.e[linkedList.size()])) {
            if (eVar != null) {
                eVar.K4(str2, bitmap);
            }
        }
        java.util.Vector vector2 = new java.util.Vector();
        while (true) {
            vector = x51.w0.f533636a;
            if (i17 >= vector.size()) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) vector.get(i17);
            if (weakReference != null) {
                y60.e eVar2 = (y60.e) weakReference.get();
                if (eVar2 != null) {
                    eVar2.K4(str2, bitmap);
                } else {
                    vector2.add(weakReference);
                }
            }
            i17++;
        }
        vector.removeAll(vector2);
        java.util.Map map = v0Var.f533632d;
        if (bitmap != null) {
            ((java.util.HashMap) map).remove(str);
            return;
        }
        x51.u0 u0Var = (x51.u0) ((java.util.HashMap) map).get(str);
        if (u0Var != null) {
            u0Var.f533623a = true;
        }
    }

    public static android.graphics.Bitmap b(java.lang.String str) {
        if (f533630i == null) {
            f533630i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics();
        }
        android.util.DisplayMetrics displayMetrics = f533630i;
        return d(str, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static android.graphics.Bitmap d(java.lang.String str, int i17, int i18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMPictureLogic", "error input, path is null");
            return null;
        }
        if (i17 > 0 && i18 > 0) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(str, i17, i18, 0.0f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMPictureLogic", "error input, targetWidth %d, targetHeight %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        if ((r0 == null || r0.size() == 0) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        if ((r0 == null || r0.size() == 0) != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap e(x51.o0 r13) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x51.v0.e(x51.o0):android.graphics.Bitmap");
    }

    public final void f(x51.o0 o0Var, android.graphics.Bitmap bitmap) {
        iz5.a.g("picture strategy here must be validity", x51.w0.b(o0Var));
        java.lang.String d17 = o0Var.d();
        java.util.Map map = this.f533633e;
        android.graphics.Bitmap bitmap2 = ((java.util.HashMap) map).containsKey(d17) ? (android.graphics.Bitmap) ((java.lang.ref.WeakReference) ((java.util.HashMap) map).get(d17)).get() : null;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            ((java.util.HashMap) map).remove(d17);
            ((java.util.HashMap) map).put(d17, new java.lang.ref.WeakReference(bitmap));
        }
    }

    public android.graphics.Bitmap g(x51.o0 o0Var, android.graphics.Bitmap bitmap) {
        iz5.a.g("picture strategy here must be validity", x51.w0.b(o0Var));
        x51.m0 m0Var = x51.m0.DISK;
        if (bitmap == null) {
            o0Var.h(m0Var, null);
            return bitmap;
        }
        android.graphics.Bitmap l17 = o0Var.l(bitmap, m0Var, o0Var.k());
        if (l17 != bitmap && !bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPictureLogic", "recycle bitmap:%s", bitmap.toString());
            bitmap.recycle();
        }
        f(o0Var, l17);
        return l17;
    }
}
