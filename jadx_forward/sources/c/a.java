package c;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f118381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f118382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 f118383f;

    public a(p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6, android.view.View view, int i17) {
        this.f118383f = c0029xbc4672a6;
        this.f118381d = view;
        this.f118382e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f118383f.F(this.f118381d, this.f118382e);
    }
}
