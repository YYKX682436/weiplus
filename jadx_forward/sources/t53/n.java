package t53;

/* loaded from: classes8.dex */
public final class n implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f497341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f497342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f497343e;

    public n(java.lang.String str, java.lang.String str2, java.lang.Runnable runnable, java.util.concurrent.atomic.AtomicInteger atomicInteger, yz5.l lVar) {
        this.f497339a = str;
        this.f497340b = str2;
        this.f497341c = runnable;
        this.f497342d = atomicInteger;
        this.f497343e = lVar;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        u53.u uVar = (u53.u) map.get(this.f497339a);
        if (uVar != null && ((y53.m) uVar).B) {
            u53.u uVar2 = (u53.u) map.get(this.f497340b);
            if (uVar2 != null && ((y53.m) uVar2).B) {
                this.f497341c.run();
                return;
            }
        }
        if (this.f497342d.getAndSet(-1) >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLife.PluginGameLife", "checkSessionIdAndContact get contact failed");
            this.f497343e.mo146xb9724478(null);
        }
    }
}
