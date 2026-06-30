package hy4;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final hy4.z f367739a = new hy4.z();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f367740b = new java.util.HashMap();

    public final android.graphics.Bitmap a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.HashMap hashMap = f367740b;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(str);
        if ((weakReference != null ? (android.graphics.Bitmap) weakReference.get() : null) != null) {
            java.lang.Object obj = weakReference.get();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            if (!((android.graphics.Bitmap) obj).isRecycled()) {
                return (android.graphics.Bitmap) weakReference.get();
            }
        }
        android.graphics.Bitmap J2 = com.p314xaae8f345.mm.vfs.w6.j(str) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null) : null;
        if (J2 != null) {
            hashMap.put(str, new java.lang.ref.WeakReference(J2));
            return J2;
        }
        try {
            J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
            hashMap.put(str, new java.lang.ref.WeakReference(J2));
            return J2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewBitmapUtil", e17, "", new java.lang.Object[0]);
            return J2;
        }
    }
}
