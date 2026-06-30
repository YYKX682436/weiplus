package qx5;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f449012a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f449013b;

    public a(boolean z17, boolean z18) {
        this.f449012a = z17;
        this.f449013b = z18;
    }

    public static qx5.a a() {
        return new qx5.a(false, false);
    }

    public static qx5.a b() {
        return new qx5.a(true, false);
    }

    /* renamed from: toString */
    public java.lang.String m161092x9616526c() {
        return "CommandResult{success=" + this.f449012a + ", shouldKillAllProcess=" + this.f449013b + '}';
    }
}
