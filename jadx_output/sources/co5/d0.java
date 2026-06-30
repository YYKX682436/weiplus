package co5;

/* loaded from: classes11.dex */
public final class d0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f43820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voipmp.platform.r f43821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f43822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f43823d;

    public d0(com.tencent.mm.ui.widget.dialog.u1 u1Var, com.tencent.mm.plugin.voipmp.platform.r rVar, long j17, kotlin.jvm.internal.c0 c0Var) {
        this.f43820a = u1Var;
        this.f43821b = rVar;
        this.f43822c = j17;
        this.f43823d = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        this.f43820a.e(co5.c0.f43819d);
        com.tencent.mm.plugin.voipmp.platform.r rVar = this.f43821b;
        if (rVar != null) {
            rVar.f0(this.f43822c, this.f43823d.f310112d);
        }
    }
}
