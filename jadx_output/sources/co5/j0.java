package co5;

/* loaded from: classes11.dex */
public final class j0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f43845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voipmp.platform.r f43846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f43847c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f43848d;

    public j0(com.tencent.mm.ui.widget.dialog.u1 u1Var, com.tencent.mm.plugin.voipmp.platform.r rVar, long j17, kotlin.jvm.internal.c0 c0Var) {
        this.f43845a = u1Var;
        this.f43846b = rVar;
        this.f43847c = j17;
        this.f43848d = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        this.f43845a.e(co5.i0.f43841d);
        com.tencent.mm.plugin.voipmp.platform.r rVar = this.f43846b;
        if (rVar != null) {
            rVar.f0(this.f43847c, this.f43848d.f310112d);
        }
    }
}
