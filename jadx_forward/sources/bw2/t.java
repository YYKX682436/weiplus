package bw2;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f106422a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106423b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f106424c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f106425d;

    public t(int i17, int i18, android.view.View itemView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f106422a = i17;
        this.f106423b = i18;
        this.f106425d = new java.lang.ref.WeakReference(itemView);
    }

    public final android.view.View a() {
        android.view.ViewStub viewStub;
        android.view.View b17 = b();
        if (b17 != null) {
            return b17;
        }
        android.view.View view = (android.view.View) this.f106425d.get();
        android.view.View view2 = null;
        if (view != null && (viewStub = (android.view.ViewStub) view.findViewById(this.f106422a)) != null) {
            try {
                android.view.View inflate = viewStub.inflate();
                if (!(inflate instanceof android.view.View)) {
                    inflate = null;
                }
                if (inflate != null) {
                    this.f106424c = new java.lang.ref.WeakReference(inflate);
                    view2 = inflate;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewStubHelper", "inflated failed:", e17);
            }
        }
        return view2;
    }

    public final android.view.View b() {
        android.view.View findViewById;
        android.view.View view;
        java.lang.ref.WeakReference weakReference = this.f106424c;
        if (weakReference != null && (view = (android.view.View) weakReference.get()) != null) {
            return view;
        }
        android.view.View view2 = (android.view.View) this.f106425d.get();
        if (view2 == null || (findViewById = view2.findViewById(this.f106423b)) == null) {
            return null;
        }
        this.f106424c = new java.lang.ref.WeakReference(findViewById);
        return findViewById;
    }
}
