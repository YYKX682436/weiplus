package jh;

/* loaded from: classes12.dex */
public class g0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f381237g;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f381238a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f381239b;

    /* renamed from: c, reason: collision with root package name */
    public volatile jh.c0 f381240c;

    /* renamed from: d, reason: collision with root package name */
    public final jh.m f381241d = new jh.m();

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f381242e = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public boolean f381243f = false;

    public static java.lang.String a(android.content.Context context) {
        java.lang.String str = !c() ? "arm" : "arm64";
        return new java.io.File(new java.io.File(context.getApplicationInfo().nativeLibraryDir).getParentFile().getParentFile(), "/oat/" + str + "/base.odex").getAbsolutePath();
    }

    public static java.lang.String b() {
        return android.os.Build.VERSION.SDK_INT >= 29 ? !c() ? "/apex/com.android.runtime/lib/" : "/apex/com.android.runtime/lib64/" : !c() ? "/system/lib/" : "/system/lib64/";
    }

    public static boolean c() {
        java.lang.String str = android.os.Build.CPU_ABI;
        return "arm64-v8a".equalsIgnoreCase(str) || "x86_64".equalsIgnoreCase(str) || "mips64".equalsIgnoreCase(str);
    }

    public static void d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("wechatbacktrace");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/backtrace/WeChatBacktrace", "loadLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/backtrace/WeChatBacktrace", "loadLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
