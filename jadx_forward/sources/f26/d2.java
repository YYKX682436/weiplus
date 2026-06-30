package f26;

/* loaded from: classes16.dex */
public final class d2 extends f26.f2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f340674c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f340675d;

    public d2(java.util.Map map, boolean z17) {
        this.f340674c = map;
        this.f340675d = z17;
    }

    @Override // f26.q2
    public boolean a() {
        return this.f340675d;
    }

    @Override // f26.q2
    public boolean e() {
        return this.f340674c.isEmpty();
    }

    @Override // f26.f2
    public f26.l2 g(f26.c2 key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return (f26.l2) this.f340674c.get(key);
    }
}
