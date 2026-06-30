package p75;

/* loaded from: classes4.dex */
public abstract class f1 implements p75.r {
    public final p75.v f(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return new p75.v(this, name);
    }

    public final p75.i0 g(java.util.List columns) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(columns, "columns");
        return new p75.i0(this, columns);
    }

    public final p75.i0 h(p75.d column) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(column, "column");
        return g(kz5.b0.c(column));
    }

    public final p75.i0 i() {
        return new p75.i0(this, kz5.p0.f395529d);
    }

    public final p75.h1 j(android.content.ContentValues values) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        return new p75.h1(this, values);
    }
}
