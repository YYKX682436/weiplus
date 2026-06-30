package a8;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static a8.b f83479a;

    public static boolean a(java.lang.String str) {
        a8.b bVar;
        synchronized (a8.a.class) {
            bVar = f83479a;
            if (bVar == null) {
                throw new java.lang.IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.a(str, 0);
    }
}
