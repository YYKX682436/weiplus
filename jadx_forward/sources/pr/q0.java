package pr;

/* loaded from: classes15.dex */
public final class q0 implements pr.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f439300a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f439301b;

    /* renamed from: c, reason: collision with root package name */
    public int f439302c;

    /* renamed from: d, reason: collision with root package name */
    public int f439303d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f439304e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f439305f = new java.util.LinkedList();

    public q0(int i17) {
        this.f439300a = i17;
        this.f439301b = "MicroMsg.EmojiSyncLoaderIPC";
        if (i17 == 1) {
            this.f439301b = "MicroMsg.EmojiSyncLoaderIPC_capture";
        } else {
            this.f439301b = "MicroMsg.EmojiSyncLoaderIPC_custom";
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("custom_type", i17);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, bundle, pr.c1.class, new pr.l0(this));
    }

    @Override // pr.b1
    public int a() {
        return this.f439302c;
    }

    @Override // pr.b1
    public void b(boolean z17) {
    }

    @Override // pr.b1
    public boolean c() {
        return !this.f439304e;
    }

    @Override // pr.b1
    public void d(pr.e0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        pm0.v.X(new pr.o0(this, callback));
    }

    @Override // pr.b1
    /* renamed from: destroy */
    public void mo158865x5cd39ffa() {
    }

    @Override // pr.b1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439301b, "loadMore: ");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("custom_type", this.f439300a);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, bundle, pr.d1.class);
    }

    @Override // pr.b1
    public void f(pr.e0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        pm0.v.X(new pr.n0(this, callback));
    }

    @Override // pr.b1
    public int g() {
        return this.f439303d;
    }

    public final void h(com.p314xaae8f345.mm.p679x5c28046.p683x361a9b.C10444x1291fbaf c10444x1291fbaf) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateData: ");
        sb6.append(c10444x1291fbaf != null ? java.lang.Integer.valueOf(c10444x1291fbaf.f146460f) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439301b, sb6.toString());
        if (c10444x1291fbaf == null) {
            return;
        }
        this.f439302c = c10444x1291fbaf.f146460f;
        this.f439303d = c10444x1291fbaf.f146461g;
        this.f439304e = c10444x1291fbaf.f146462h;
        pm0.v.X(new pr.p0(this));
    }

    @Override // pr.b1
    /* renamed from: init */
    public void mo158866x316510() {
    }
}
