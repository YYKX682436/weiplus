package bl;

/* loaded from: classes7.dex */
public class f implements bl.g {
    public f(bl.e eVar) {
    }

    @Override // bl.g
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    java.lang.String.format(str2, objArr);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // bl.g
    public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    java.lang.String.format(str2, objArr);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // bl.g
    public void printStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        if (th6 == null || objArr == null) {
            return;
        }
        try {
            if (objArr.length > 0) {
                java.lang.String.format(str2, objArr);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
