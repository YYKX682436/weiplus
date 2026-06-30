package androidx.fragment.app;

/* loaded from: classes14.dex */
public class h implements j3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f11323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.m f11324c;

    public h(androidx.fragment.app.p pVar, android.view.View view, android.view.ViewGroup viewGroup, androidx.fragment.app.m mVar) {
        this.f11322a = view;
        this.f11323b = viewGroup;
        this.f11324c = mVar;
    }

    @Override // j3.g
    public void onCancel() {
        android.view.View view = this.f11322a;
        view.clearAnimation();
        this.f11323b.endViewTransition(view);
        this.f11324c.a();
    }
}
