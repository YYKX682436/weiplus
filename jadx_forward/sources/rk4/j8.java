package rk4;

/* loaded from: classes11.dex */
public final class j8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f478295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f478296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f478297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f478298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f478299h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f478300i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f478301m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f478302n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f478303o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(android.os.Bundle bundle, rk4.k8 k8Var, boolean z17, boolean z18, boolean z19, pi0.l1 l1Var, android.content.Context context, java.lang.Long l17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478296e = bundle;
        this.f478297f = k8Var;
        this.f478298g = z17;
        this.f478299h = z18;
        this.f478300i = z19;
        this.f478301m = l1Var;
        this.f478302n = context;
        this.f478303o = l17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.j8(this.f478296e, this.f478297f, this.f478298g, this.f478299h, this.f478300i, this.f478301m, this.f478302n, this.f478303o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.j8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.app.ActivityManager.RunningTaskInfo m17;
        android.content.ComponentName componentName;
        java.lang.String className;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478295d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.os.Bundle bundle = this.f478296e;
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            android.os.Bundle bundle2 = bundle;
            bundle2.putString("session_id", this.f478297f.f478329e);
            bundle2.putBoolean("up_down_animation", this.f478298g);
            if (this.f478299h && !this.f478300i) {
                rk4.u6 u6Var = rk4.k8.f478321r;
                ((ef0.h3) rk4.u6.a(u6Var)).wi(false);
                ef0.h3 h3Var = (ef0.h3) rk4.u6.a(u6Var);
                h3Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d = h3Var.f333758e;
                if (activityC18699x6096e65d != null) {
                    activityC18699x6096e65d.getB();
                    bundle2.toString();
                    android.content.Intent intent = activityC18699x6096e65d.getIntent();
                    if (intent != null) {
                        intent.putExtras(bundle2);
                    }
                }
                return jz5.f0.f384359a;
            }
            rk4.u6 u6Var2 = rk4.k8.f478321r;
            if (((ef0.h3) rk4.u6.a(u6Var2)).Ai() && !this.f478300i) {
                ((ef0.h3) rk4.u6.a(u6Var2)).wi(true);
            }
            pi0.l1 l1Var = this.f478301m;
            android.content.Context context = this.f478302n;
            com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = this.f478298g ? (com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6) ((jz5.n) this.f478297f.f478337p).mo141623x754a37bb() : rk4.k8.f478322s;
            java.lang.Class cls = rk4.k8.f478327x;
            java.lang.Long l17 = this.f478303o;
            this.f478295d = 1;
            obj = l1Var.d(context, c10716x931597c6, cls, l17, bundle2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.content.Intent intent2 = (android.content.Intent) obj;
        if (intent2 != null) {
            if (ep1.m.g(intent2)) {
                il4.l lVar = il4.l.f373675a;
                android.content.Context context2 = this.f478302n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                boolean z17 = com.p314xaae8f345.mm.app.w.INSTANCE.f135422n;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMusicUtils", "topTaskIsAppBrandUI isAppForeground " + z17);
                if ((!z17 || (m17 = com.p314xaae8f345.mm.app.w.m(context2)) == null || (componentName = m17.topActivity) == null || (className = componentName.getClassName()) == null || !r26.n0.B(className, ".AppBrandUI", false)) ? false : true) {
                    ((ft.e) i95.n0.c(ft.e.class)).Rc(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1051x5c6729a.C11865xc185f759(intent2, false));
                }
            }
            android.content.Context context3 = this.f478302n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/plugin/ting/TingRouter$showTingStyle$3", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context3, "com/tencent/mm/plugin/ting/TingRouter$showTingStyle$3", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingRouter", "showTingStyle but intent is null");
        }
        return jz5.f0.f384359a;
    }
}
