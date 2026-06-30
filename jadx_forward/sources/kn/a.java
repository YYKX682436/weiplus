package kn;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Calendar f390903a;

    /* renamed from: b, reason: collision with root package name */
    public int f390904b;

    /* renamed from: c, reason: collision with root package name */
    public int f390905c;

    /* renamed from: d, reason: collision with root package name */
    public int f390906d;

    /* renamed from: e, reason: collision with root package name */
    public long f390907e;

    /* renamed from: f, reason: collision with root package name */
    public long f390908f;

    public a(int i17, int i18, int i19) {
        this.f390906d = i17;
        this.f390905c = i18;
        this.f390904b = i19;
    }

    /* renamed from: equals */
    public boolean m143721xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof kn.a) {
            kn.a aVar = (kn.a) obj;
            if (aVar.f390904b == this.f390904b && aVar.f390905c == this.f390905c && aVar.f390906d == this.f390906d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m143722x9616526c() {
        return "{ year: " + this.f390906d + ", month: " + this.f390905c + ", day: " + this.f390904b + " }";
    }

    public a(long j17) {
        this.f390907e = j17;
        if (this.f390903a == null) {
            this.f390903a = java.util.Calendar.getInstance();
        }
        this.f390903a.setTimeInMillis(j17);
        this.f390905c = this.f390903a.get(2);
        this.f390906d = this.f390903a.get(1);
        this.f390904b = this.f390903a.get(5);
    }
}
