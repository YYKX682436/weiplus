package ak0;

/* loaded from: classes11.dex */
public class p implements com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp {
    public p(ak0.x xVar) {
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp
    public void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String format = java.lang.String.format(str2, objArr);
        ak0.k kVar = ak0.l.f87073a;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("Log engine is not set");
        }
        kVar.a(3, str, format);
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        ak0.l.a(str, java.lang.String.format(str2, objArr));
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp
    public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String format = java.lang.String.format(str2, objArr);
        ak0.k kVar = ak0.l.f87073a;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("Log engine is not set");
        }
        kVar.a(4, str, format);
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp
    /* renamed from: printErrStackTrace */
    public void mo2152x58ef3d35(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th6.printStackTrace(printWriter);
        printWriter.flush();
        ak0.l.a(str, java.lang.String.format(str2, objArr) + "\n" + stringWriter);
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp
    public void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String format = java.lang.String.format(str2, objArr);
        ak0.k kVar = ak0.l.f87073a;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("Log engine is not set");
        }
        kVar.a(2, str, format);
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp
    public void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String format = java.lang.String.format(str2, objArr);
        ak0.k kVar = ak0.l.f87073a;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("Log engine is not set");
        }
        kVar.a(5, str, format);
    }
}
