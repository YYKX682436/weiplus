package p75;

/* loaded from: classes4.dex */
public final class i1 extends p75.e1 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f434196c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.ContentValues f434197d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f434198e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(java.lang.String table, android.content.ContentValues values, java.lang.String str, java.lang.String[] strArr) {
        super("", strArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        this.f434196c = table;
        this.f434197d = values;
        this.f434198e = str;
    }

    public final int f(l75.k0 k0Var) {
        if (k0Var != null) {
            return k0Var.p(this.f434196c, this.f434197d, this.f434198e, this.f434170b);
        }
        return -1;
    }
}
