package n81;

/* loaded from: classes7.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f417153e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, java.util.List list) {
        super(0);
        this.f417152d = str;
        this.f417153e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        n81.p pVar = n81.p.f417161a;
        java.util.List a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it.next()).f129217a);
        }
        java.util.Set X0 = kz5.n0.X0(arrayList);
        java.lang.String str = this.f417152d;
        if (X0.contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSweeperLogic", "cleanBlock for " + str + ", app is alive, skip clean");
            return 0L;
        }
        long b17 = n81.p.b(n81.p.f417161a, this.f417153e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSweeperLogic", "cleanBlock for " + str + ", cleaned " + b17 + " bytes");
        return java.lang.Long.valueOf(b17);
    }
}
