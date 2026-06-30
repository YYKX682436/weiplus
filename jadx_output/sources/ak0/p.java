package ak0;

/* loaded from: classes11.dex */
public class p implements com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp {
    public p(ak0.x xVar) {
    }

    @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
    public void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String format = java.lang.String.format(str2, objArr);
        ak0.k kVar = ak0.l.f5540a;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("Log engine is not set");
        }
        kVar.a(3, str, format);
    }

    @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        ak0.l.a(str, java.lang.String.format(str2, objArr));
    }

    @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
    public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String format = java.lang.String.format(str2, objArr);
        ak0.k kVar = ak0.l.f5540a;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("Log engine is not set");
        }
        kVar.a(4, str, format);
    }

    @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
    public void printErrStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th6.printStackTrace(printWriter);
        printWriter.flush();
        ak0.l.a(str, java.lang.String.format(str2, objArr) + "\n" + stringWriter);
    }

    @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
    public void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String format = java.lang.String.format(str2, objArr);
        ak0.k kVar = ak0.l.f5540a;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("Log engine is not set");
        }
        kVar.a(2, str, format);
    }

    @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
    public void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String format = java.lang.String.format(str2, objArr);
        ak0.k kVar = ak0.l.f5540a;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("Log engine is not set");
        }
        kVar.a(5, str, format);
    }
}
