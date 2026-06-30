package com.bumptech.glide.manager;

/* loaded from: classes13.dex */
public class SupportRequestManagerFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

    /* renamed from: d, reason: collision with root package name */
    public final j7.a f43969d;

    /* renamed from: e, reason: collision with root package name */
    public final j7.r f43970e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f43971f;

    /* renamed from: g, reason: collision with root package name */
    public com.bumptech.glide.manager.SupportRequestManagerFragment f43972g;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.r f43973h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.fragment.app.Fragment f43974i;

    public SupportRequestManagerFragment() {
        j7.a aVar = new j7.a();
        this.f43970e = new j7.t(this);
        this.f43971f = new java.util.HashSet();
        this.f43969d = aVar;
    }

    public final void j0(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment = this.f43972g;
        if (supportRequestManagerFragment != null) {
            ((java.util.HashSet) supportRequestManagerFragment.f43971f).remove(this);
            this.f43972g = null;
        }
        j7.q qVar = com.bumptech.glide.c.b(context).f43927i;
        qVar.getClass();
        com.bumptech.glide.manager.SupportRequestManagerFragment d17 = qVar.d(fragmentManager, null, j7.q.e(context));
        this.f43972g = d17;
        if (equals(d17)) {
            return;
        }
        ((java.util.HashSet) this.f43972g.f43971f).add(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        androidx.fragment.app.Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        androidx.fragment.app.FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            android.util.Log.isLoggable("SupportRMFragment", 5);
            return;
        }
        try {
            j0(getContext(), fragmentManager);
        } catch (java.lang.IllegalStateException unused) {
            android.util.Log.isLoggable("SupportRMFragment", 5);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f43969d.c();
        com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment = this.f43972g;
        if (supportRequestManagerFragment != null) {
            ((java.util.HashSet) supportRequestManagerFragment.f43971f).remove(this);
            this.f43972g = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f43974i = null;
        com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment = this.f43972g;
        if (supportRequestManagerFragment != null) {
            ((java.util.HashSet) supportRequestManagerFragment.f43971f).remove(this);
            this.f43972g = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f43969d.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f43969d.e();
    }

    @Override // androidx.fragment.app.Fragment
    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(super.toString());
        sb6.append("{parent=");
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f43974i;
        }
        sb6.append(parentFragment);
        sb6.append("}");
        return sb6.toString();
    }
}
