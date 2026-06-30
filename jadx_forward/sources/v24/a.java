package v24;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f514426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f514427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f514428f;

    public a(yz5.p pVar, int i17, java.util.List list) {
        this.f514426d = pVar;
        this.f514427e = i17;
        this.f514428f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f514426d.mo149xb9724478(java.lang.Integer.valueOf(this.f514427e + 1), java.lang.Integer.valueOf(this.f514428f.size()));
    }
}
