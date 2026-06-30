package df;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f311033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f311035f;

    public k(int i17, java.lang.String str, java.util.HashMap hashMap) {
        this.f311033d = i17;
        this.f311034e = str;
        this.f311035f = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df.n.f311050a.a(this.f311033d, this.f311034e, this.f311035f);
    }
}
