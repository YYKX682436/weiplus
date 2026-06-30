package p75;

/* loaded from: classes4.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final p75.f1 f434182a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.ContentValues f434183b;

    /* renamed from: c, reason: collision with root package name */
    public p75.m f434184c;

    public h1(p75.f1 table, android.content.ContentValues values) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        this.f434182a = table;
        this.f434183b = values;
    }

    public final p75.i1 a() {
        p75.f1 f1Var = this.f434182a;
        if (f1Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String b17 = f1Var.b();
        p75.m mVar = this.f434184c;
        java.lang.String b18 = mVar != null ? mVar.b() : null;
        p75.m mVar2 = this.f434184c;
        return new p75.i1(b17, this.f434183b, b18, mVar2 != null ? mVar2.e() : null);
    }

    public final p75.h1 b(p75.m condition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(condition, "condition");
        this.f434184c = condition;
        return this;
    }
}
