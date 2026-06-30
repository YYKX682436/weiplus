package co5;

/* loaded from: classes11.dex */
public final class b0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f43811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voipmp.platform.r f43812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f43813c;

    public b0(com.tencent.mm.ui.widget.dialog.u1 u1Var, com.tencent.mm.plugin.voipmp.platform.r rVar, long j17) {
        this.f43811a = u1Var;
        this.f43812b = rVar;
        this.f43813c = j17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        this.f43811a.e(co5.a0.f43809d);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        com.tencent.mm.plugin.voipmp.platform.r rVar = this.f43812b;
        if (rVar != null) {
            rVar.f0(this.f43813c, false);
        }
    }
}
