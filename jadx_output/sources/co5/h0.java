package co5;

/* loaded from: classes11.dex */
public final class h0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f43836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voipmp.platform.r f43837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f43838c;

    public h0(com.tencent.mm.ui.widget.dialog.u1 u1Var, com.tencent.mm.plugin.voipmp.platform.r rVar, long j17) {
        this.f43836a = u1Var;
        this.f43837b = rVar;
        this.f43838c = j17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        this.f43836a.e(co5.g0.f43834d);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        com.tencent.mm.plugin.voipmp.platform.r rVar = this.f43837b;
        if (rVar != null) {
            rVar.f0(this.f43838c, false);
        }
    }
}
