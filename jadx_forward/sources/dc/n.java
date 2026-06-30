package dc;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f310193a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f310194b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310195c;

    /* renamed from: d, reason: collision with root package name */
    public final int f310196d;

    public n(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        this.f310193a = str;
        this.f310194b = str2;
        this.f310195c = str3;
        this.f310196d = i18;
    }

    /* renamed from: toString */
    public final java.lang.String m123903x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f310193a);
        sb6.append(this.f310194b.replace('/', '.'));
        sb6.append(" - ");
        sb6.append(this.f310195c);
        sb6.append(":");
        int i17 = this.f310196d;
        sb6.append(i17 != -3 ? i17 != -2 ? i17 != -1 ? i17 != 0 ? java.lang.String.valueOf(i17) : "No line number" : "Unknown line number" : "Compiled method" : "Native method");
        return sb6.toString();
    }
}
