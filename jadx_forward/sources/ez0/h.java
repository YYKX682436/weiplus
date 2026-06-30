package ez0;

/* loaded from: classes11.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339332d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f339333e;

    /* renamed from: f, reason: collision with root package name */
    public int f339334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f339335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f339336h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ez0.i f339337i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339338m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, android.content.Intent intent, ez0.i iVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f339335g = context;
        this.f339336h = intent;
        this.f339337i = iVar;
        this.f339338m = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ez0.h(this.f339335g, this.f339336h, this.f339337i, this.f339338m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ez0.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f339334f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "mj_template", kz5.p0.f395529d, false, null, 24, null);
            java.util.List Ai = ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).Ai();
            pz0.r rVar = this.f339337i.f339339d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rVar);
            l1Var.a(kz5.c0.i(new pz0.m(), rVar));
            l1Var.a(Ai);
            com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c62 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
            c10716x931597c62.f149651e = -1;
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode backgroundMode = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backgroundMode, "<set-?>");
            c10716x931597c62.f149652f = backgroundMode;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("RecMusicId", this.f339338m);
            linkedHashMap.put("EventTopicId", "");
            linkedHashMap.put("PriorityTplId", "");
            this.f339332d = l1Var;
            this.f339333e = c10716x931597c62;
            this.f339334f = 1;
            if (l1Var.o("/", linkedHashMap, this) == aVar) {
                return aVar;
            }
            c10716x931597c6 = c10716x931597c62;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginMJTemplate", "launchTemplateSquareWithMusicId");
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c63 = (com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6) this.f339333e;
            pi0.l1 l1Var2 = (pi0.l1) this.f339332d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c10716x931597c6 = c10716x931597c63;
            l1Var = l1Var2;
        }
        android.content.Context context = this.f339335g;
        android.os.Bundle extras = this.f339336h.getExtras();
        this.f339332d = null;
        this.f339333e = null;
        this.f339334f = 2;
        if (pi0.l1.v(l1Var, context, c10716x931597c6, null, null, extras, this, 12, null) == aVar) {
            return aVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginMJTemplate", "launchTemplateSquareWithMusicId");
        return jz5.f0.f384359a;
    }
}
