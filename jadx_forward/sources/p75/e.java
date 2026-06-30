package p75;

/* loaded from: classes4.dex */
public abstract class e extends p75.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434162a;

    /* renamed from: b, reason: collision with root package name */
    public final int f434163b;

    /* renamed from: c, reason: collision with root package name */
    public final p75.n f434164c;

    /* renamed from: d, reason: collision with root package name */
    public final int f434165d;

    /* renamed from: e, reason: collision with root package name */
    public final p75.p f434166e;

    public e(java.lang.String column, int i17, p75.n bitOperation, int i18, p75.p operator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(column, "column");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitOperation, "bitOperation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operator, "operator");
        this.f434162a = column;
        this.f434163b = i17;
        this.f434164c = bitOperation;
        this.f434165d = i18;
        this.f434166e = operator;
    }

    @Override // p75.r
    public java.lang.String b() {
        return "(" + this.f434162a + ' ' + this.f434164c + ' ' + this.f434163b + ") " + this.f434166e + ' ' + this.f434165d;
    }
}
