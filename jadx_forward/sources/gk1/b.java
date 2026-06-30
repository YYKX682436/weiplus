package gk1;

/* loaded from: classes4.dex */
public final class b extends dm.x {

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f353992v = dm.x.m125673x3593deb(gk1.b.class);

    /* renamed from: w, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a f353993w = new gk1.a();

    @Override // dm.x, l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues mo9763xeb27878e = super.mo9763xeb27878e();
        if (mo9763xeb27878e.containsKey("isDarkMode")) {
            mo9763xeb27878e.put("isDarkMode", java.lang.Integer.valueOf(this.f69059xf1a1cde8 ? 1 : 0));
        }
        return mo9763xeb27878e;
    }

    @Override // dm.x, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f353992v;
    }
}
