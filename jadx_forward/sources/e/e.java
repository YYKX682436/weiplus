package e;

/* loaded from: classes13.dex */
public class e extends e.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c f327018e;

    public e(p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c) {
        this.f327018e = c0050x5b3754c;
    }

    @Override // e.c
    public void V5(int i17, android.os.Bundle bundle) {
        p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c = this.f327018e;
        android.os.Handler handler = c0050x5b3754c.f90543e;
        if (handler != null) {
            handler.post(new e.f(c0050x5b3754c, i17, bundle));
        } else {
            c0050x5b3754c.a(i17, bundle);
        }
    }
}
