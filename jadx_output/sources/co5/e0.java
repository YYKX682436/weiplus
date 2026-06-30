package co5;

/* loaded from: classes11.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f43825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voipmp.platform.r f43826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f43827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f43828g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context, com.tencent.mm.plugin.voipmp.platform.r rVar, long j17, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f43825d = context;
        this.f43826e = rVar;
        this.f43827f = j17;
        this.f43828g = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new co5.e0(this.f43825d, this.f43826e, this.f43827f, this.f43828g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        co5.e0 e0Var = (co5.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f43825d);
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
        u1Var.g(resources.getString(com.tencent.mm.R.string.hh8));
        u1Var.u(resources.getString(com.tencent.mm.R.string.f490774aq2));
        u1Var.n(resources.getString(com.tencent.mm.R.string.kct));
        u1Var.j(resources.getString(com.tencent.mm.R.string.f490454vi));
        u1Var.a(false);
        u1Var.l(new co5.b0(u1Var, this.f43826e, this.f43827f));
        u1Var.i(new co5.d0(u1Var, this.f43826e, this.f43827f, this.f43828g));
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
