package q13;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f441211a;

    /* renamed from: b, reason: collision with root package name */
    public final int f441212b;

    /* renamed from: c, reason: collision with root package name */
    public final q13.a f441213c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f441214d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f441215e;

    public a(int i17, int i18, q13.a aVar) {
        this.f441211a = i17;
        this.f441212b = i18;
        this.f441213c = aVar;
    }

    /* renamed from: toString */
    public java.lang.String m159399x9616526c() {
        int i17 = this.f441212b;
        int i18 = this.f441211a;
        q13.a aVar = this.f441213c;
        return aVar == null ? java.lang.String.format("[%d,%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17)) : java.lang.String.format("%s [%d,%d]", aVar, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
    }
}
