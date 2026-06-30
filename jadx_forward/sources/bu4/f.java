package bu4;

/* loaded from: classes7.dex */
public class f extends ik1.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bu4.i f106147d;

    public f(bu4.i iVar) {
        this.f106147d = iVar;
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.a) {
            bu4.i iVar = this.f106147d;
            java.util.Iterator it = iVar.f106151d.iterator();
            while (it.hasNext()) {
                ((android.app.Activity) it.next()).finish();
            }
            iVar.f106151d.clear();
            iVar.f106151d.add(activity);
        }
    }

    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.a) {
            this.f106147d.f106151d.remove(activity);
        }
    }
}
