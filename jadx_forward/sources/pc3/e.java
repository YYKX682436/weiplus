package pc3;

/* loaded from: classes7.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pc3.m f434908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, pc3.m mVar) {
        super(0);
        this.f434907d = str;
        this.f434908e = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", "removeBiz " + this.f434907d + ", bizCount = " + this.f434908e.f434916b.size());
        this.f434908e.f434916b.remove(this.f434907d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5 a5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229369a;
        java.lang.String instanceName = this.f434907d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229375g;
        synchronized (set) {
            set.remove(instanceName);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229374f = a5Var.a(set);
        }
        if (this.f434908e.f434916b.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", "No biz -> unbind service");
            pc3.m.a(this.f434908e, false);
        }
        return jz5.f0.f384359a;
    }
}
