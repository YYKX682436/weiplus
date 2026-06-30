package e;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f327019d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f327020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c f327021f;

    public f(p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c, int i17, android.os.Bundle bundle) {
        this.f327021f = c0050x5b3754c;
        this.f327019d = i17;
        this.f327020e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f327021f.a(this.f327019d, this.f327020e);
    }
}
