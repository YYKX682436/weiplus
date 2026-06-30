package lc;

/* loaded from: classes14.dex */
public abstract class i extends android.app.Fragment {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f399377d;

    public final void a(java.lang.Runnable runnable) {
        android.app.Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        } else {
            mc.p.f407064a.e("BaseFragment", "fragment attach activity is null");
        }
    }

    public final android.content.res.Resources b() {
        if (!isAdded()) {
            int i17 = ic.d.f371814k;
            ic.d dVar = ic.c.f371813a;
            java.lang.ref.WeakReference weakReference = dVar.f371816b;
            android.content.Context context = weakReference == null ? null : (android.content.Context) weakReference.get();
            if (context != null) {
                return context.getResources();
            }
            android.content.Context a17 = dVar.a();
            if (a17 != null) {
                return a17.getResources();
            }
        }
        return getResources();
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View view = this.f399377d;
        if (view == null) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        int i17 = ic.d.f371814k;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2917x949fc30f interfaceC2917x949fc30f = ic.c.f371813a.f371820f;
        if (interfaceC2917x949fc30f != null) {
            interfaceC2917x949fc30f.m21772xc867ee59(view);
        }
        return this.f399377d;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        int i17 = ic.d.f371814k;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2917x949fc30f interfaceC2917x949fc30f = ic.c.f371813a.f371820f;
        if (interfaceC2917x949fc30f != null) {
            interfaceC2917x949fc30f.m21773x641afe3d();
        }
        if (this.f399377d != null) {
            this.f399377d = null;
        }
        super.onDestroy();
    }
}
