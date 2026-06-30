package aj0;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final aj0.t f86820a = new aj0.t();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f86821b = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75309x5a4fb9b0, 1, 12344};

    public static boolean a(aj0.t tVar, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str2 = "PreRenderGLUtil";
        }
        tVar.getClass();
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError == 12288) {
            return false;
        }
        io.p3284xd2ae381c.Log.i(str2, str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
        return true;
    }
}
