package b00;

/* loaded from: classes9.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.b0 f16657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f16658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b00.r f16659f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16660g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f16661h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e00.b0 b0Var, java.util.List list, b00.r rVar, int i17, kotlinx.coroutines.q qVar) {
        super(1);
        this.f16657d = b0Var;
        this.f16658e = list;
        this.f16659f = rVar;
        this.f16660g = i17;
        this.f16661h = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List<bw5.qe0> list = (java.util.List) obj;
        e00.b0 b0Var = this.f16657d;
        b0Var.f245743d = null;
        java.util.List list2 = this.f16658e;
        boolean z17 = list != null && list.size() == list2.size();
        b00.r rVar = this.f16659f;
        if (z17) {
            int size = list2.size();
            int i17 = 0;
            while (i17 < size) {
                bw5.ne0 reqInfo = (bw5.ne0) list2.get(i17);
                bw5.qe0 productInfo = (bw5.qe0) list.get(i17);
                e00.e eVar = (e00.e) rVar.f16758e;
                eVar.getClass();
                kotlin.jvm.internal.o.g(productInfo, "productInfo");
                kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(reqInfo.f30652d);
                sb6.append('_');
                sb6.append(reqInfo.f30659n[5] ? reqInfo.f30656h : "");
                java.lang.String sb7 = sb6.toString();
                e00.c cVar = new e00.c(productInfo, java.lang.System.currentTimeMillis() / 1000);
                eVar.f245753a.put(sb7, cVar);
                com.tencent.mars.xlog.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "update product cache for key" + sb7 + " when:" + cVar.f245746b);
                i17++;
                list2 = list2;
            }
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("batchRequestProductCardInfo done for key:");
        sb8.append(b0Var.getKey());
        sb8.append(", pending size: ");
        java.util.List list3 = (java.util.List) rVar.f16760g.get(b0Var.getKey());
        sb8.append(list3 != null ? java.lang.Integer.valueOf(list3.size()) : null);
        com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", sb8.toString());
        int i18 = this.f16660g;
        if ((i18 == 4 || i18 == 6 || i18 == 9 || i18 == 12 || i18 == 15) && list != null) {
            for (bw5.qe0 qe0Var : list) {
                y02.p0 a17 = y02.r0.f458626d.a();
                if (a17 != null) {
                    bw5.m7 b17 = qe0Var.c().b().b();
                    kotlin.jvm.internal.o.f(b17, "getCgiPreloadInfo(...)");
                    ((y02.r0) a17).d(b17);
                }
            }
        }
        b00.r.wi(rVar, b0Var);
        ((kotlinx.coroutines.r) this.f16661h).resumeWith(kotlin.Result.m521constructorimpl(list));
        return jz5.f0.f302826a;
    }
}
