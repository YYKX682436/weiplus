package l31;

/* loaded from: classes9.dex */
public abstract class b implements l31.u {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f396846a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f396847b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f396848c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f396849d;

    public b(java.lang.String bizUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        this.f396846a = bizUsername;
    }

    public void a() {
        this.f396849d = true;
    }

    public java.lang.String b() {
        return java.lang.String.valueOf(hashCode());
    }

    public final void c(f31.f netScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(netScene, "netScene");
        netScene.f340810f = new l31.a(this, netScene.f340810f, netScene);
        netScene.a(f31.b.f340802a);
    }
}
