package zl1;

/* loaded from: classes7.dex */
public class v extends zl1.y {
    public static android.graphics.Bitmap c(zl1.v vVar, java.lang.String str) {
        vVar.getClass();
        byte[] decode = android.util.Base64.decode(str, 0);
        int length = decode.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(decode);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/tabbar/Base64IconLoader", "base64ToBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
        yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/appbrand/widget/tabbar/Base64IconLoader", "base64ToBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        if (decodeByteArray == null) {
            vVar.f555161c.a("Failed to load icon via base64 icon", vVar);
        }
        return decodeByteArray;
    }

    @Override // zl1.y
    public void b() {
        if (this.f555159a == null) {
            this.f555161c.a("Failed to load icon via base64 icon", this);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new zl1.u(this));
    }
}
