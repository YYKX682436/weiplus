package e56;

/* loaded from: classes11.dex */
public class e extends java.lang.AssertionError {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f331222d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f331223e;

    public e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.f331222d = str2;
        this.f331223e = str3;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.String str = this.f331222d;
        java.lang.String str2 = this.f331223e;
        e56.d dVar = new e56.d(20, str, str2);
        java.lang.String message = super.getMessage();
        if (str == null || str2 == null || str.equals(str2)) {
            return e56.a.b(message, str, str2);
        }
        e56.c cVar = new e56.c(dVar, null);
        java.lang.String str3 = cVar.f331218a;
        if (str3.length() > 20) {
            str3 = "..." + str3.substring(str3.length() - 20);
        }
        java.lang.String str4 = cVar.f331219b;
        if (str4.length() > 20) {
            str4 = str4.substring(0, 20) + "...";
        }
        return e56.a.b(message, str3 + cVar.a(str) + str4, str3 + cVar.a(str2) + str4);
    }
}
