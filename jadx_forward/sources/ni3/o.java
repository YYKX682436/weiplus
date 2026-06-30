package ni3;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 f419179e;

    public o(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9) {
        this.f419178d = view;
        this.f419179e = c16559xedc507d9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float m66989x7bac614b;
        m66989x7bac614b = this.f419179e.m66989x7bac614b();
        this.f419178d.setTranslationX(-m66989x7bac614b);
    }
}
