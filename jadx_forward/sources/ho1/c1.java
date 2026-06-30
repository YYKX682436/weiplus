package ho1;

/* loaded from: classes9.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f364172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f364175g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f364176h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f364177i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f364178m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j17, java.lang.String str, long j18, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, ho1.q1 q1Var) {
        super(0);
        this.f364172d = j17;
        this.f364173e = str;
        this.f364174f = j18;
        this.f364175g = arrayList;
        this.f364176h = arrayList2;
        this.f364177i = arrayList3;
        this.f364178m = q1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filterRestoreMediaAsync taskId = ");
        long j17 = this.f364172d;
        sb6.append(j17);
        sb6.append(", conversationId = ");
        java.lang.String str = this.f364173e;
        sb6.append(str);
        sb6.append(", wait thread pool duration = ");
        sb6.append(java.lang.System.currentTimeMillis() - this.f364174f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jz5.l f17 = co1.g.f125301a.f(str, this.f364175g, this.f364176h, this.f364177i);
        long longValue = ((java.lang.Number) f17.f384366d).longValue();
        java.util.ArrayList arrayList = (java.util.ArrayList) f17.f384367e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "filterRestoreMediaAsync taskId = " + j17 + ", conversationId = " + str + ", filterRestoreMediaIDs duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g0 g0Var = this.f364178m.f364320a;
        if (g0Var != null) {
            g0Var.m(this.f364172d, longValue, arrayList);
        }
        return jz5.f0.f384359a;
    }
}
