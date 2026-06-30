package zl1;

/* loaded from: classes7.dex */
public class e0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f555118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zl1.f0 f555119e;

    public e0(zl1.f0 f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f555119e = f0Var;
        this.f555118d = c11510xdd90c2f2;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "PackageIconLoader";
    }

    @Override // java.lang.Runnable
    public void run() {
        zl1.f0 f0Var = this.f555119e;
        java.io.InputStream q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.q(this.f555118d, f0Var.f555159a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(q17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/tabbar/PackageIconLoader$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
        yj0.a.e(obj, decodeStream, "com/tencent/mm/plugin/appbrand/widget/tabbar/PackageIconLoader$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        if (decodeStream == null) {
            f0Var.f555161c.a("Failed to load icon via package path", f0Var);
        } else {
            zl1.z zVar = f0Var.f555164f;
            if (zVar != null) {
                zVar.a(decodeStream, f0Var);
            }
        }
        if (q17 != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(q17);
        }
    }
}
