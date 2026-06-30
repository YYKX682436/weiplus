package kq5;

/* loaded from: classes7.dex */
public class e implements kq5.f {
    public e(kq5.d dVar) {
    }

    @Override // kq5.f
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

    @Override // kq5.f
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

    @Override // kq5.f
    /* renamed from: printStackTrace */
    public void mo32131x6e0e6e2a(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
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
