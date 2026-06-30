package rk4;

/* loaded from: classes.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f478064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f478065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478067g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f478068h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478069i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f478070m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478065e = context;
        this.f478066f = str;
        this.f478067g = str2;
        this.f478068h = z17;
        this.f478069i = str3;
        this.f478070m = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.a2(this.f478065e, this.f478066f, this.f478067g, this.f478068h, this.f478069i, this.f478070m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.a2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478064d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rk4.u6 u6Var = rk4.k8.f478321r;
            al4.a aVar2 = rk4.k8.f478323t;
            if (aVar2 != null) {
                this.f478064d = 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d) aVar2).c7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        android.content.Context context = this.f478065e;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("feed_object_id", pm0.v.Z(this.f478066f));
        intent.putExtra("feed_object_nonceId", pm0.v.Z(this.f478067g));
        boolean z17 = this.f478068h;
        intent.putExtra("key_need_related_list", z17);
        if (z17) {
            intent.putExtra("key_reuqest_scene", 35);
        }
        java.lang.String str = this.f478069i;
        intent.putExtra("key_session_id", str);
        if (str.length() > 0) {
            intent.putExtra("allow_pull_top", true);
        }
        zy2.ta.b(e1Var, context, intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", this.f478070m), false, 4, null);
        return f0Var;
    }
}
