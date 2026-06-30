package sc3;

/* loaded from: classes7.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.q1 f488051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488053f;

    public p1(sc3.q1 q1Var, java.lang.String str, java.lang.String str2) {
        this.f488051d = q1Var;
        this.f488052e = str;
        this.f488053f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f488051d.f488010f.g(this.f488052e, this.f488053f);
    }
}
