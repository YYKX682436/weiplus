package t53;

/* loaded from: classes7.dex */
public final class m implements u53.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f497325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f497326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f497327c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f497328d;

    public m(java.util.concurrent.atomic.AtomicInteger atomicInteger, yz5.l lVar, java.util.LinkedList linkedList, java.lang.Runnable runnable) {
        this.f497325a = atomicInteger;
        this.f497326b = lVar;
        this.f497327c = linkedList;
        this.f497328d = runnable;
    }

    @Override // u53.d0
    public final void a(java.lang.String str) {
        if (!(str == null || str.length() == 0)) {
            this.f497327c.add(str);
            this.f497328d.run();
        } else if (this.f497325a.getAndSet(-1) >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLife.PluginGameLife", "checkSessionIdAndContact get session failed");
            this.f497326b.mo146xb9724478(null);
        }
    }
}
