package zl1;

/* loaded from: classes7.dex */
public class g0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.h0 f555127d;

    public g0(zl1.h0 h0Var) {
        this.f555127d = h0Var;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "TempFileIconLoader";
    }

    @Override // java.lang.Runnable
    public void run() {
        zl1.h0 h0Var = this.f555127d;
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = h0Var.f555160b.mo50354x59eafec1().mo49620x1d537609(h0Var.f555159a);
        if (mo49620x1d537609 == null) {
            h0Var.f555161c.a("Failed to load icon via temp file", h0Var);
            return;
        }
        java.lang.String u17 = mo49620x1d537609.u();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(u17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/tabbar/TempFileIconLoader$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
        yj0.a.e(obj, decodeFile, "com/tencent/mm/plugin/appbrand/widget/tabbar/TempFileIconLoader$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        if (decodeFile == null) {
            h0Var.f555161c.a("Failed to load icon via temp file", h0Var);
            return;
        }
        zl1.z zVar = h0Var.f555164f;
        if (zVar != null) {
            zVar.a(decodeFile, h0Var);
        }
    }
}
