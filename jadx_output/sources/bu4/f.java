package bu4;

/* loaded from: classes7.dex */
public class f extends ik1.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bu4.i f24614d;

    public f(bu4.i iVar) {
        this.f24614d = iVar;
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.walletlock.ui.a) {
            bu4.i iVar = this.f24614d;
            java.util.Iterator it = iVar.f24618d.iterator();
            while (it.hasNext()) {
                ((android.app.Activity) it.next()).finish();
            }
            iVar.f24618d.clear();
            iVar.f24618d.add(activity);
        }
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (activity instanceof com.tencent.mm.plugin.walletlock.ui.a) {
            this.f24614d.f24618d.remove(activity);
        }
    }
}
