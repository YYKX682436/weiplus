package sz3;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f495614a;

    /* renamed from: b, reason: collision with root package name */
    public int f495615b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f495616c = new java.util.HashSet();

    public final int a() {
        int i17;
        synchronized (java.lang.Integer.valueOf(this.f495614a)) {
            i17 = this.f495614a - 1;
            this.f495614a = i17;
        }
        return i17;
    }

    public final int b() {
        int i17;
        synchronized (java.lang.Integer.valueOf(this.f495615b)) {
            i17 = this.f495615b + 1;
            this.f495615b = i17;
        }
        return i17;
    }
}
