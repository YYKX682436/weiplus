package a7;

/* loaded from: classes13.dex */
public class j1 implements a7.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final a7.p0 f83366a;

    public j1(a7.p0 p0Var) {
        this.f83366a = p0Var;
    }

    @Override // a7.p0
    public /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return true;
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        android.net.Uri fromFile;
        java.lang.String str = (java.lang.String) obj;
        if (android.text.TextUtils.isEmpty(str)) {
            fromFile = null;
        } else if (str.charAt(0) == '/') {
            fromFile = android.net.Uri.fromFile(new java.io.File(str));
        } else {
            android.net.Uri parse = android.net.Uri.parse(str);
            fromFile = parse.getScheme() == null ? android.net.Uri.fromFile(new java.io.File(str)) : parse;
        }
        if (fromFile == null) {
            return null;
        }
        a7.p0 p0Var = this.f83366a;
        if (p0Var.a(fromFile)) {
            return p0Var.b(fromFile, i17, i18, lVar);
        }
        return null;
    }
}
