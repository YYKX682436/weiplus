package ot0;

/* loaded from: classes5.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f429937a;

    /* renamed from: b, reason: collision with root package name */
    public final int f429938b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f429939c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f429940d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f429941e;

    public b3(boolean z17, int i17, java.util.List columnNames, java.util.List columnTypes, java.util.List columnValues) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(columnNames, "columnNames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(columnTypes, "columnTypes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(columnValues, "columnValues");
        this.f429937a = z17;
        this.f429938b = i17;
        this.f429939c = columnNames;
        this.f429940d = columnTypes;
        this.f429941e = columnValues;
    }

    /* renamed from: equals */
    public boolean m157043xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot0.b3)) {
            return false;
        }
        ot0.b3 b3Var = (ot0.b3) obj;
        return this.f429937a == b3Var.f429937a && this.f429938b == b3Var.f429938b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f429939c, b3Var.f429939c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f429940d, b3Var.f429940d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f429941e, b3Var.f429941e);
    }

    /* renamed from: hashCode */
    public int m157044x8cdac1b() {
        return (((((((java.lang.Boolean.hashCode(this.f429937a) * 31) + java.lang.Integer.hashCode(this.f429938b)) * 31) + this.f429939c.hashCode()) * 31) + this.f429940d.hashCode()) * 31) + this.f429941e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157045x9616526c() {
        return "CursorFirstRowData(hasData=" + this.f429937a + ", columnCount=" + this.f429938b + ", columnNames=" + this.f429939c + ", columnTypes=" + this.f429940d + ", columnValues=" + this.f429941e + ')';
    }
}
