package rk4;

/* loaded from: classes11.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f478646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f478647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f478648f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f478649g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478650h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478651i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f478652m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f478653n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(android.content.Context context, long j17, long j18, java.lang.String str, java.lang.String str2, boolean z17, long j19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478647e = context;
        this.f478648f = j17;
        this.f478649g = j18;
        this.f478650h = str;
        this.f478651i = str2;
        this.f478652m = z17;
        this.f478653n = j19;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.z1(this.f478647e, this.f478648f, this.f478649g, this.f478650h, this.f478651i, this.f478652m, this.f478653n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.z1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478646d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rk4.u6 u6Var = rk4.k8.f478321r;
            al4.a aVar2 = rk4.k8.f478323t;
            if (aVar2 != null) {
                this.f478646d = 1;
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
        android.content.Intent intent = new android.content.Intent();
        long ordinal = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24958xe2afbc6c.f44726x8611d863.ordinal();
        long j17 = this.f478648f;
        if (j17 == ordinal) {
            intent.putExtra("key_enter_profile_tab", 7);
        } else if (j17 == com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24958xe2afbc6c.f44728x12d10cc0.ordinal()) {
            intent.putExtra("key_enter_profile_tab", 6);
        } else if (j17 == com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24958xe2afbc6c.f44725x1227ba71.ordinal()) {
            intent.putExtra("key_enter_profile_tab", 8);
        }
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        int i18 = (int) this.f478649g;
        ((c61.l7) b6Var).Bj(37, 42, i18, intent);
        java.lang.String str2 = this.f478650h;
        intent.putExtra("finder_username", str2);
        intent.putExtra("key_enter_profile_type", 42);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        java.lang.String str3 = this.f478651i;
        if (!(str3 == null || r26.n0.N(str3))) {
            intent.putExtra("key_extra_info", str3);
        }
        boolean z17 = this.f478652m;
        if (z17) {
            intent.putExtra("key_half_screen_source", z17);
        }
        intent.putExtra("key_from_comment_scene", i18);
        intent.putExtra("key_from_follow_scene", il4.c.a(this.f478653n));
        l40.e eVar = (l40.e) i95.n0.c(l40.e.class);
        android.content.Context context = this.f478647e;
        if (eVar == null || (str = ((k40.f) eVar).Ui(context)) == null) {
            str = "";
        }
        e1Var.w(context, intent.putExtra("KEY_FINDER_SELF_FLAG", i18 == 338 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)));
        return f0Var;
    }
}
