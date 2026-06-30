package androidx.fragment.app;

/* loaded from: classes13.dex */
public class k0 extends androidx.fragment.app.v0 implements androidx.lifecycle.m1, androidx.activity.k, androidx.activity.result.i, androidx.fragment.app.x1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f11372h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.fragment.app.FragmentActivity fragmentActivity) {
        super(fragmentActivity, fragmentActivity, new android.os.Handler(), 0);
        this.f11372h = fragmentActivity;
    }

    @Override // androidx.fragment.app.x1
    public void a(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        this.f11372h.onAttachFragment(fragment);
    }

    @Override // androidx.fragment.app.s0
    public android.view.View b(int i17) {
        return this.f11372h.findViewById(i17);
    }

    @Override // androidx.fragment.app.s0
    public boolean c() {
        android.view.Window window = this.f11372h.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.v0
    public void d(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        this.f11372h.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.fragment.app.v0
    public java.lang.Object e() {
        return this.f11372h;
    }

    @Override // androidx.fragment.app.v0
    public android.view.LayoutInflater f() {
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f11372h;
        return fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
    }

    @Override // androidx.activity.result.i
    public androidx.activity.result.h getActivityResultRegistry() {
        return this.f11372h.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f11372h.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.k
    public androidx.activity.i getOnBackPressedDispatcher() {
        return this.f11372h.getOnBackPressedDispatcher();
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        return this.f11372h.getViewModel();
    }

    @Override // androidx.fragment.app.v0
    public boolean h(androidx.fragment.app.Fragment fragment) {
        return !this.f11372h.isFinishing();
    }

    @Override // androidx.fragment.app.v0
    public boolean i(java.lang.String str) {
        return z2.h.b(this.f11372h, str);
    }

    @Override // androidx.fragment.app.v0
    public void l() {
        this.f11372h.supportInvalidateOptionsMenu();
    }
}
