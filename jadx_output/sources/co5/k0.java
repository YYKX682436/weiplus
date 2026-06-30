package co5;

/* loaded from: classes11.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f43853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voipmp.platform.r f43854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f43855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f43856g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.content.Context context, com.tencent.mm.plugin.voipmp.platform.r rVar, long j17, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f43853d = context;
        this.f43854e = rVar;
        this.f43855f = j17;
        this.f43856g = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new co5.k0(this.f43853d, this.f43854e, this.f43855f, this.f43856g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        co5.k0 k0Var = (co5.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f43853d);
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
        u1Var.g(resources.getString(com.tencent.mm.R.string.hhn));
        u1Var.u(resources.getString(com.tencent.mm.R.string.gv_));
        u1Var.n(resources.getString(com.tencent.mm.R.string.kct));
        u1Var.j(resources.getString(com.tencent.mm.R.string.f490454vi));
        u1Var.a(false);
        u1Var.l(new co5.h0(u1Var, this.f43854e, this.f43855f));
        u1Var.i(new co5.j0(u1Var, this.f43854e, this.f43855f, this.f43856g));
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
