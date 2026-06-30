package aq3;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final aq3.a f94692a = new aq3.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.StringBuffer f94693b = new java.lang.StringBuffer(8192);

    /* renamed from: c, reason: collision with root package name */
    public static volatile long f94694c;

    public final void a(long j17) {
        java.lang.String stringBuffer;
        if (j17 - f94694c > 1000 || f94693b.length() > 8000) {
            synchronized (this) {
                if (j17 - f94694c > 1000 || f94693b.length() > 8000) {
                    f94694c = j17;
                    java.lang.StringBuffer stringBuffer2 = f94693b;
                    synchronized (stringBuffer2) {
                        stringBuffer = stringBuffer2.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer, "toString(...)");
                        stringBuffer2.setLength(0);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ThreadPool.Execute", stringBuffer);
                }
            }
        }
    }

    public final java.lang.String b(aq3.f fVar, long j17) {
        if (fVar != null) {
            java.lang.String str = "start=" + fVar.f94704a + " delay=" + fVar.f94705b + " run=" + fVar.f94706c + " end=" + j17;
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
