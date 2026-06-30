package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class i3 implements ku5.i {
    public i3(com.tencent.mm.booter.p3 p3Var) {
    }

    @Override // ku5.i
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        try {
            com.tencent.mars.xlog.Log.e(str, java.lang.String.format(str2, objArr));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ThreadBootDelegate", th6, "", new java.lang.Object[0]);
            try {
                com.tencent.mars.xlog.Log.e("MicroMsg.ThreadBootDelegate", str2.replace("%", "o/o"));
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ThreadBootDelegate", th7, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // ku5.i
    public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        try {
            com.tencent.mars.xlog.Log.i(str, java.lang.String.format(str2, objArr));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ThreadBootDelegate", th6, "", new java.lang.Object[0]);
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.ThreadBootDelegate", str2.replace("%", "o/o"));
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ThreadBootDelegate", th7, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // ku5.i
    public void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        try {
            com.tencent.mars.xlog.Log.w(str, java.lang.String.format(str2, objArr));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ThreadBootDelegate", th6, "", new java.lang.Object[0]);
            try {
                com.tencent.mars.xlog.Log.w("MicroMsg.ThreadBootDelegate", str2.replace("%", "o/o"));
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ThreadBootDelegate", th7, "", new java.lang.Object[0]);
            }
        }
    }
}
