package cl;

/* loaded from: classes16.dex */
public class c2 extends cl.r1 {

    /* renamed from: b, reason: collision with root package name */
    public final com.eclipsesource.mmv8.JavaVoidCallback f42607b;

    public c2() {
        super("console");
        this.f42607b = new cl.w1(this);
    }

    public static void d(cl.c2 c2Var, int i17, com.eclipsesource.mmv8.V8Array v8Array) {
        c2Var.getClass();
        java.lang.String v8Array2 = v8Array.toString();
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.J2V8_Console", v8Array2);
        } else if (i17 == 5) {
            com.tencent.mars.xlog.Log.w("MicroMsg.J2V8_Console", v8Array2);
        }
        c2Var.e(3, "MicroMsg.J2V8_Console", v8Array2);
    }

    @Override // cl.r1
    public void a() {
    }

    @Override // cl.r1
    public void c(cl.q0 q0Var, com.eclipsesource.mmv8.V8Object v8Object) {
        v8Object.registerJavaMethod(new cl.x1(this), "log");
        v8Object.registerJavaMethod(new cl.y1(this), "info");
        v8Object.registerJavaMethod(new cl.z1(this), "warn");
        v8Object.registerJavaMethod(new cl.a2(this), "error");
        v8Object.registerJavaMethod(new cl.b2(this), "debug");
        com.eclipsesource.mmv8.JavaVoidCallback javaVoidCallback = this.f42607b;
        v8Object.registerJavaMethod(javaVoidCallback, "assert");
        v8Object.registerJavaMethod(javaVoidCallback, "count");
        v8Object.registerJavaMethod(javaVoidCallback, com.google.android.gms.common.Scopes.PROFILE);
        v8Object.registerJavaMethod(javaVoidCallback, "profileEnd");
        v8Object.registerJavaMethod(javaVoidCallback, "time");
        v8Object.registerJavaMethod(javaVoidCallback, "timeEnd");
        v8Object.registerJavaMethod(javaVoidCallback, "timeStamp");
        v8Object.registerJavaMethod(javaVoidCallback, "takeHeapSnapshot");
        v8Object.registerJavaMethod(javaVoidCallback, "group");
        v8Object.registerJavaMethod(javaVoidCallback, "groupCollapsed");
        v8Object.registerJavaMethod(javaVoidCallback, "groupEnd");
        v8Object.registerJavaMethod(javaVoidCallback, "clear");
        v8Object.registerJavaMethod(javaVoidCallback, com.tencent.tinker.loader.shareutil.SharePatchInfo.OAT_DIR);
        v8Object.registerJavaMethod(javaVoidCallback, "dirxml");
        v8Object.registerJavaMethod(javaVoidCallback, "table");
        v8Object.registerJavaMethod(javaVoidCallback, "trace");
    }

    public final void e(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.LogImp logImp = cl.q0.f42722l;
        if (logImp != null) {
            if (i17 == 2) {
                logImp.logV(0L, str, null, null, 0, 0, 0L, 0L, str2);
                return;
            }
            if (i17 == 3) {
                logImp.logD(0L, str, null, null, 0, 0, 0L, 0L, str2);
                return;
            }
            if (i17 == 4) {
                logImp.logI(0L, str, null, null, 0, 0, 0L, 0L, str2);
            } else if (i17 == 5) {
                logImp.logW(0L, str, null, null, 0, 0, 0L, 0L, str2);
            } else {
                if (i17 != 6) {
                    return;
                }
                logImp.logE(0L, str, null, null, 0, 0, 0L, 0L, str2);
            }
        }
    }
}
