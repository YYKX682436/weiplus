package k85;

/* loaded from: classes15.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f386950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f386951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f386952f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f386953g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar) {
        super(0);
        this.f386950d = activity;
        this.f386951e = g0Var;
        this.f386952f = f0Var;
        this.f386953g = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        k85.t tVar = k85.t.f386972a;
        android.app.Activity activity = this.f386950d;
        d85.g0 g0Var = this.f386951e;
        d85.f0 f0Var = this.f386952f;
        yz5.l lVar = this.f386953g;
        jz5.l h17 = tVar.h(activity, g0Var, f0Var, new k85.k(g0Var, f0Var, lVar, activity), null, null);
        if (((java.lang.Boolean) h17.f384366d).booleanValue() || ((java.lang.Boolean) h17.f384367e).booleanValue()) {
            j85.h.b(j85.h.f379791a, 201L, java.lang.Long.valueOf(this.f386951e.f308726e), java.lang.Long.valueOf(this.f386952f.f308710e), null, 8, null);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } else if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
