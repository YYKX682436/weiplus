package k85;

/* loaded from: classes15.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f386941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f386942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f386943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f386944g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f386945h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z17, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar, android.app.Activity activity) {
        super(0);
        this.f386941d = z17;
        this.f386942e = g0Var;
        this.f386943f = f0Var;
        this.f386944g = lVar;
        this.f386945h = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        d85.f0 f0Var2 = this.f386943f;
        d85.g0 g0Var = this.f386942e;
        boolean z17 = this.f386941d;
        if (z17) {
            j85.h.f379791a.a(202L, java.lang.Long.valueOf(g0Var.f308726e), java.lang.Long.valueOf(f0Var2.f308710e), java.lang.Boolean.TRUE);
        }
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).sj(g0Var.f308725d, f0Var2.f308709d, z17);
        jz5.f0 f0Var3 = jz5.f0.f384359a;
        yz5.l lVar = this.f386944g;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17));
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            k85.t tVar = k85.t.f386972a;
            java.lang.String str = g0Var.f308725d;
            android.app.Activity activity = this.f386945h;
            if (z17) {
                if (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).mo53825x600c4ed(str);
                } else if (activity instanceof d85.j0) {
                    ((d85.j0) activity).mo65980x600c4ed(str);
                } else if (!kz5.z.G(k85.t.f386974c, activity.getClass().getSimpleName())) {
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                    pm0.v.V(50L, new k85.i(activity));
                }
            } else if (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).mo53824x34301f29(str);
            } else if (activity instanceof d85.j0) {
                ((d85.j0) activity).mo65979x34301f29(str);
            } else {
                java.lang.String[] strArr = k85.t.f386974c;
                if (!kz5.z.G(strArr, activity.getClass().getSimpleName())) {
                    activity.finish();
                } else if (!kz5.z.G(strArr, activity.getClass().getSimpleName()) && (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).mo53824x34301f29(str);
                }
            }
        }
        return f0Var3;
    }
}
