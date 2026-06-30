package b00;

/* loaded from: classes9.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.b0 f98190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f98191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b00.r f98192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f98193g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f98194h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e00.b0 b0Var, java.util.List list, b00.r rVar, int i17, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(1);
        this.f98190d = b0Var;
        this.f98191e = list;
        this.f98192f = rVar;
        this.f98193g = i17;
        this.f98194h = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List<bw5.qe0> list = (java.util.List) obj;
        e00.b0 b0Var = this.f98190d;
        b0Var.f327276d = null;
        java.util.List list2 = this.f98191e;
        boolean z17 = list != null && list.size() == list2.size();
        b00.r rVar = this.f98192f;
        if (z17) {
            int size = list2.size();
            int i17 = 0;
            while (i17 < size) {
                bw5.ne0 reqInfo = (bw5.ne0) list2.get(i17);
                bw5.qe0 productInfo = (bw5.qe0) list.get(i17);
                e00.e eVar = (e00.e) rVar.f98291e;
                eVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productInfo, "productInfo");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(reqInfo.f112185d);
                sb6.append('_');
                sb6.append(reqInfo.f112192n[5] ? reqInfo.f112189h : "");
                java.lang.String sb7 = sb6.toString();
                e00.c cVar = new e00.c(productInfo, java.lang.System.currentTimeMillis() / 1000);
                eVar.f327286a.put(sb7, cVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "update product cache for key" + sb7 + " when:" + cVar.f327279b);
                i17++;
                list2 = list2;
            }
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("batchRequestProductCardInfo done for key:");
        sb8.append(b0Var.mo126544xb5884f29());
        sb8.append(", pending size: ");
        java.util.List list3 = (java.util.List) rVar.f98293g.get(b0Var.mo126544xb5884f29());
        sb8.append(list3 != null ? java.lang.Integer.valueOf(list3.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", sb8.toString());
        int i18 = this.f98193g;
        if ((i18 == 4 || i18 == 6 || i18 == 9 || i18 == 12 || i18 == 15) && list != null) {
            for (bw5.qe0 qe0Var : list) {
                y02.p0 a17 = y02.r0.f540159d.a();
                if (a17 != null) {
                    bw5.m7 b17 = qe0Var.c().b().b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getCgiPreloadInfo(...)");
                    ((y02.r0) a17).d(b17);
                }
            }
        }
        b00.r.wi(rVar, b0Var);
        ((p3325xe03a0797.p3326xc267989b.r) this.f98194h).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(list));
        return jz5.f0.f384359a;
    }
}
