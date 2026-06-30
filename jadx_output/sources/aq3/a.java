package aq3;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final aq3.a f13159a = new aq3.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.StringBuffer f13160b = new java.lang.StringBuffer(8192);

    /* renamed from: c, reason: collision with root package name */
    public static volatile long f13161c;

    public final void a(long j17) {
        java.lang.String stringBuffer;
        if (j17 - f13161c > 1000 || f13160b.length() > 8000) {
            synchronized (this) {
                if (j17 - f13161c > 1000 || f13160b.length() > 8000) {
                    f13161c = j17;
                    java.lang.StringBuffer stringBuffer2 = f13160b;
                    synchronized (stringBuffer2) {
                        stringBuffer = stringBuffer2.toString();
                        kotlin.jvm.internal.o.f(stringBuffer, "toString(...)");
                        stringBuffer2.setLength(0);
                    }
                    com.tencent.mars.xlog.Log.i("ThreadPool.Execute", stringBuffer);
                }
            }
        }
    }

    public final java.lang.String b(aq3.f fVar, long j17) {
        if (fVar != null) {
            java.lang.String str = "start=" + fVar.f13171a + " delay=" + fVar.f13172b + " run=" + fVar.f13173c + " end=" + j17;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public final java.lang.String c(java.lang.String str, int i17) {
        if (str != null) {
            if (r26.i0.y(str, "com.tencent.mm", false)) {
                str = r26.i0.t(str, "com.tencent.mm", "$", false);
            } else if (r26.i0.y(str, "com.tencent", false)) {
                str = r26.i0.t(str, "com.tencent", "*", false);
            }
            java.lang.String str2 = str + '@' + i17;
            if (str2 != null) {
                return str2;
            }
        }
        return "null@" + i17;
    }
}
