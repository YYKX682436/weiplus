package fs5;

/* loaded from: classes13.dex */
public abstract class a implements tr5.q {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f347880d = tr5.c.f502988a;

    /* renamed from: e, reason: collision with root package name */
    public boolean f347881e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f347882f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f347883g = 0;

    @Override // tr5.q
    public boolean b() {
        return this.f347881e;
    }

    @Override // tr5.q
    public boolean d() {
        return tr5.c.f502988a != this.f347880d;
    }

    public void h() {
        this.f347882f = (int) (java.lang.System.currentTimeMillis() - this.f347883g);
    }
}
