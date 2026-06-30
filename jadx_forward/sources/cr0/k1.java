package cr0;

/* loaded from: classes12.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.u0 f303198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(cr0.u0 u0Var) {
        super(0);
        this.f303198d = u0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f>> m46625x1828bc7f = this.f303198d.c().m46625x1828bc7f();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dump ProxyCalls: size=");
        sb6.append(m46625x1828bc7f.size());
        sb6.append(", totalMs=");
        java.util.Iterator<T> it = m46625x1828bc7f.values().iterator();
        long j17 = 0;
        while (it.hasNext()) {
            java.util.Iterator it6 = ((java.util.Map) it.next()).values().iterator();
            long j18 = 0;
            while (it6.hasNext()) {
                j18 += ((com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f) it6.next()).f150223e;
            }
            j17 += j18;
        }
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BinderTracker", sb6.toString());
        for (java.util.Map.Entry entry : kz5.c1.q(kz5.n0.x0(kz5.n0.F0(kz5.e1.v(m46625x1828bc7f), new cr0.j1()))).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Map map = (java.util.Map) entry.getValue();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" - ProxyCall: ");
            sb7.append(str);
            sb7.append('=');
            java.util.Iterator it7 = map.values().iterator();
            long j19 = 0;
            while (it7.hasNext()) {
                j19 += ((com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f) it7.next()).f150223e;
            }
            sb7.append(j19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BinderTracker", sb7.toString());
        }
        return jz5.f0.f384359a;
    }
}
