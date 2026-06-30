package c55;

/* loaded from: classes12.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryToolsUI f38736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI) {
        super(0);
        this.f38736d = recoveryToolsUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.io.File cacheDir = this.f38736d.getCacheDir();
        kotlin.jvm.internal.o.f(cacheDir, "getCacheDir(...)");
        return vz5.q.f(vz5.q.f(cacheDir, "recovery"), "packed_logs");
    }
}
